package citire;
import java.io.FileReader;

public class ReadFile {
    public static void main(String[] args) {

        // Creates an array of character
        char[] array = new char[41];

        try {
            // Creates a reader using the FileReader
            FileReader input = new FileReader("filename.txt");

            // Reads characters

            input.read(array);
            System.out.println("Data in the file: ");
            System.out.println(array);

            // Closes the reader
            input.close();
        }

        catch(Exception e) {
            e.getStackTrace();
        }
    }
}
