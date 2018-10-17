import java.util.Scanner; // imports Scanner
public class CatchAll {
    public static void main(String[] args) {
        int num = 0;
        int div = 0;
        Scanner scan = new Scanner(System.in);
        try {
            System.out.print("Enter the numerator: ");
            num = scan.nextInt(); // makes num the numerator
            System.out.print("Enter the divisor  : ");
            div = scan.nextInt(); // makes div the divider
            System.out.println(num + " / " + div + " is " + (num / div) + " rem " + (num % div)); // prints out the numerator and the dividor, the divided number, and how much remainder it has
        } catch (ArithmeticException ex) { // if either the numerator or divisor is not a number or cant be divided(e;g = 0) it prints out this instead of ending the code
            System.out.println("You can't divide " + num + " by " + div);
        } catch (Exception ex) {
            System.out.println("Something went wrong.");
        }

        System.out.println("Goodbye");
    }
}