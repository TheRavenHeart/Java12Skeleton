import java.io.*;
import java.util.Scanner;

class CreditWriter {
    public static void main(String[] args) {
        // Gets filename and creates the file
        PrintWriter out = null;

        Scanner scan = new Scanner(System.in);
        String fileName = "";
        String name = "";
        String age = "";
        String aOwing = "";
        int Continue = 1;

        System.out.print("Enter Filename-->");
        try {
            fileName = scan.nextLine();

            // creates the PrintWriter and enable automatic flushing
            out = new PrintWriter(new BufferedWriter(new FileWriter(fileName)), true);

        } catch (IOException iox) {
            System.out.println("Error in creating file");
            return;

            
        }
        
        // Writes out the table.
        while (Continue == 1) {

            System.out.println("Enter name");
            name = scan.nextLine();
            System.out.println("Enter age");
            age = scan.nextLine();
            System.out.println("Enter Amount that you owe");
            aOwing = scan.nextLine();

            out.print(name);
            out.print("\t");
            out.print(age);
            out.print("\t");
            out.print(aOwing + "\n");

            System.out.println("press 1 to contiune or press 0 to stop.");
            Continue = scan.nextInt();
            scan.nextLine();
        }
        out.close();
    }
}
