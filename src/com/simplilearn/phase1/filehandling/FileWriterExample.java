package phase1.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) throws IOException {
        FileWriter output = null;
        String data = "This is the data";
        int[] array = {1, 2, 3, 4, 5};

        try{
            // STEP 1: Creates a writer using file writer
            output= new FileWriter("src/main/java/phase1/filehandling/filehandling2.txt"); // can create a new file if not present

            // STEP 2: Writes a string to the file
            output.write(data);

            System.out.println("Data Written");
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        finally {
            // STEP 3: Close the Writer
            output.close();
        }
    }
}
