package phase1.filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderExample {
    public static void main(String[] args) {
        char[] array = new char[100];

        try {
            // STEP 1: creates a new reader using the file reader
            FileReader input= new FileReader("src/main/java/phase1/filehandling/filehandling3.txt");

            // STEP 2: creates a new reader using the file reader
            // we are reading each character of the file and putting it into char array one by one,
            // so calc length of array first by using file.length() as shown in FileHandlingExample
            input.read(array);

            System.out.println("Data in the file:");
            System.out.println(array);

            // STEP 3: Close the file reader
            input.close();
        }
        catch(FileNotFoundException e) {
            System.out.println(e+"\nHey check if the file you are trying to read actually exists");
        }
        catch (Exception e) {
            System.out.println("Something went wrong: "+e.getMessage());
            e.printStackTrace();
        }
    }
}
