import jsonpickle ##imports decode and encode functions
from item import Item

inventory = []

inventory.append(Item("Star Wars: A New Hope", "5" ,"1977", "Sci-Fi", "1", "none"))
inventory.append(Item("Johnny English Strikes Again", "6", "2018", "Comedy", "2", "Chad"))
inventory.append(Item("Maquia: when the promised flower blooms", "5", "2018", "Fantasy", "3", "Jaden R. Killer"))
#adds all of the items to the inventory

def load_inventory_json(inventory):
    inventory.clear()
    inventory_file = open('inventory.json', 'r')
    inventory = jsonpickle.decode(inventory_file.read())
    inventory_file.close()
    return inventory
#loads the inventory into a string

def save_inventory_json(inventory):
    inventory_file = open('inventory.json', 'w')
    json_string = jsonpickle.encode(inventory)
    inventory_file.write(json_string)
    inventory_file.close()


def print_inventory():
    for i in inventory:
        print(i.title, i.year, i.price, i.genre, i.price, i.current_renter, i.shelf_number, sep='\t')

def create_new_item():
    title = input("Enter title: ")
    year = input("Enter year: ")
    price = input("Enter price: ")
    genre = input("Enter genre: ")
    shelf_number = input("Enter the shelf number: ")
    current_renter = input("enter the current renter: ")
    item = Item(title, price, year, genre, shelf_number, current_renter)
    inventory.append(item)
    save_inventory_json(inventory)
#allows you to input a new item
inventory = load_inventory_json(inventory)
while True:
    print("Choose an option:")
    print("1. Create/add inventory item")
    print("2. View inventory")
    print("3. Exit")
    choice = input()
    if choice == '3': #lets you choose to input or look at an item, or leave
        break
    elif choice == '2':
        print_inventory()
    elif choice == '1':
        create_new_item()
    else:
        print("Invalid Input")