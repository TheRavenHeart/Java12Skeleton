import java.io.*;
import java.util.Scanner;

class PowerTable {
    public static void main(String[] args) {
        // Gets filename and creates the file
        PrintWriter out = null;
        Scanner scan = new Scanner(System.in);
        String fileName = "";

        System.out.print(       "Enter Filename-->");
        try {
            fileName = scan.next();
            
            // creates the PrintWriter and enable automatic flushing
            out = new PrintWriter(new BufferedWriter(new FileWriter(fileName)), true);
        } catch (IOException iox) {
            System.out.println("Error in creating file");
            return;
        }

        // Write out the table.
        int value = 1;
        out.println("Power\tValue");
        for (int pow = 0; pow <= 20; pow++) {
            out.print(pow);
            out.print('\t');// makes a tab
            out.println(value);
            value = value * 2; // makes 2 to the power of whatever number pow is
        }
        out.close();

    }
}