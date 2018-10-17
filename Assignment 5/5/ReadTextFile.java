import java.io.*;

class ReadTextFile {
    public static void main(String[] args) {
        String fileName = "TEST"; // checks for a file named TEST
        String line;

        try {
            BufferedReader in = new BufferedReader(new FileReader(fileName));
            line = in.readLine();
            while (line != null) // continue until end of file
            {
                System.out.println(line);//prints out whatever is in the file
                line = in.readLine();
            }
            in.close();
        } catch (IOException iox) { // if the file that was checked for didnt exist then it prints out this
            System.out.println("Problem reading " + fileName);
        }
    }
}