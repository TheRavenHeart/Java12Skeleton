import java.util.*;

public class SquareUser {

    public static void main(String[] a) {
        Scanner scan = new Scanner(System.in);
        int num = 0;
        boolean goodData = false;

        while (!goodData) { // runs as long as good data is false
            System.out.print("Enter an integer: ");
            try {
                num = scan.nextInt(); // makes num = whatever you enter
                goodData = true;
            }

            catch (InputMismatchException ex) { // if you enter something other than an integer this catches and resets
                System.out.println("You entered bad data.");
                System.out.println("Please try again.\n");
                String flush = scan.next();
            }
        }

        System.out.println("The square of " + num + " is " + num * num);

    }
}