function displayMessage() {
    alert("Hello World!"); //#2 What happens if you don’t put the ; (semicolon) in at the end of the line?
}

//#1 Create another function and button that will display your full name
function Shrug() {
    alert("Jaden Rius Killer-Stanway");
}
//#2 What happens if you don’t put the semicolon at the end of a statement?
function Nsemi() {
    alert("Apparently Nothing!")
}
//#3 Create another function and button that will do the 3 times table from -100 to 100
function counter() {
    for (let i = -100; i <= 100; i++) {
        document.write("the number is " + i + "</br>");
        document.write(i + "x" + "3" + "=" + i * 3 + "</br>");//do some math too! i+i..modify it to i*3
    }
}
//#4 What does i++ do?
function Iplusplus() {
    alert("i++ adds one to the variable i everytime it activates")
}
function helloName() {
    let y = window.prompt("please enter your name");
    let end = window.prompt("how many times?");

    for (let i = 0; i < end; i++) {
        document.write(i + " Hello " + y + "</br>");
    }
}

//#5 What does the "</br>" tag do?
function BR() {
    alert("/br is a breaks the line it is used on when is comes up.")
}
//#6 Add a new function that will show the numbers added, subtracted, multiplied, and divided
function mather() {

    let num1 = 1;

    while (num1 != 0) {
        num1 = parseInt(window.prompt("Please enter you first number (0 to exit)", "0"));
        //don't ask them for another number if they want to quit

        if (num1 != 0) {
            num2 = parseInt(window.prompt("Please enter your second number:", "0"));
            Answer = num1 + num2;
            Answer2 = num1 - num2;
            Answer3 = num1 * num2;
            answer4 = num1 / num2;
            document.write("Those Numbers added are " + Answer + "</br>" + "Those Numbers subtracted are " + Answer2 + "</br>");
            document.write("Those Numbers multiplied" + Answer3 + "</br>" + "Those Numbers divided are" + answer4 + "</br>");
        }
    }
}
//#7 What does != mean?
function whateverthisis() {
    alert("!= basicly means not equal, it is another way of putting this symbol: ≠")
}
//#8 Why are there 3 closing curly braces in a row at the end of the MathAdder function?
function whytho() {
    alert("the reason why there are three curly braces in a row at the end of the mathadder function is because they encapsulate the entire function")
}

// #10 Does it matter what value we give to bet here and why or why not?
function Betting() {
    alert("It does matter what number we give to bet because")
}

//#11 What does parseInt do? 
function parse(){
    alert("takes a string and outputs an interger")
}
//#12 How would you say this in English?
function English() {
    alert("it says if the amount bet is less then the amount of money you have and if the bet is 0 then the bet is allowed")
}
//#13 What does Math.floor do?
function maaath() {
    alert("Math.floor rounds down to the nearest integer")
}

//#14 What does || mean? 
function wierdslashes() {
    alert("|| in coding means or so if i had 'while(money >= 20 || betting <= 20)' then it would check the first condition ond then the second then acitivate if either was fufiled")
}

//#15 What does && mean?
function andand() {
    alert("&& basicly means that say in a while statement, multiple conditions need to be fufilled for the while loop to take effect ");
}
//#16 Why are we subtracting their bet from their money here? 
function subtra() {
    alert("the reason we are subtracting their bet from their money is because they lose money equal to their bet")
}
//#9 Make a game with 4 dice and below 14 or over 14 for the betting
function rollTheDice() {

    let money = 100;

    let bet = 1000;
    alert("Play til you lose it all");

    while (money >= 1) {
        //no betting more money than you have!
        //the line below will go forever...the if...break will
        //get you out of this infinite betting loop if you bet legally

        while (true) {
            pick = window.prompt("Please pit over 14(o) or under 14(u)", "u");

            bet = parseInt(window.prompt("Please bet", money));


            if (bet <= money && bet > 0) {
                break;
            }


            alert("Illegal Betting detected!");
        }

        let die1 = Math.floor(Math.random() * 6 + 1);

        let die2 = Math.floor(Math.random() * 6 + 1);

        let die3 = Math.floor(Math.random() * 6 + 1);

        let die4 = Math.floor(Math.random() * 6 + 1);

        let total = die1 + die2 + die3 + die4;

        document.write("</br>You rolled " + die1 + " and " + die2 + " and " + die3 + " and " + die4 + " total = " + total);
        document.write("</br>You picked " + pick + " and rolled " + total);

        if ((pick == "u" && total < 14) || (pick == "o" && total > 14)) {
            money = money + bet;
            document.write(" You won! You now have $" + money);
        } else if (total == 7) {
            document.write(" 14  is a tie...no winner..keep your bet");
        } else {
            money = money - bet;


            document.write(" You Lost! You now have $" + money);
        }
    }
    alert("Thanks for giving me all of your money!");
}
//#17 How do we know they lost all there money to our game here?
function lolmoney() {
    alert("we know that they lost all of there money to the game because if money = 0 you cant bet anymore.")
}