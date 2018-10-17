import java.io.*;
import java.util.Scanner;

class CreateFile {
    public static void main(String[] args) {

        // Gets filename 
        FileWriter writer = null;
        BufferedWriter bw = null; 
        Scanner scan = new Scanner(System.in);
        String fileName = "";
        System.out.print("Enter Filename-->"); //names the file

        try {
            fileName = scan.next(); // makes the file(somewhere in here)
            writer = new FileWriter(fileName);
            bw = new BufferedWriter(writer); // makes a buffereddWriter which makes creating faster
        } catch (IOException iox) {
            System.out.println("Error in creating file");
            return;
        }

        //this writes stuff in the file the file.
        try {
            bw.write("Light bowgun suxs,\n");
            bw.write("Charge Blade is the best weapon!\n");
            bw.write("It has the highest dps if used correctly;\n");
            bw.write("while light bowgun feels sluggish and has low damage!\n");
            bw.close();
        } catch (IOException iox) {
            System.out.println("Problem writing " + fileName);
        }
    }
}