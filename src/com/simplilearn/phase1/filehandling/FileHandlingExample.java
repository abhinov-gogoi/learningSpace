package com.simplilearn.phase1.filehandling;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileHandlingExample {
    public static void main(String[] args) throws IOException {
        try {
            File file = new File("src/main/java/phase1/filehandling/filehandling.txt");

            if(file.createNewFile()) {
                System.out.println("File is created");
            }
            else{
                if (file.exists()) {
                    System.out.println("File already exists");
                    System.out.println("File Path: "+file.getAbsolutePath());
                    System.out.println("File Name: "+file.getName());
                    System.out.println("File Class: "+file.getClass());
                    System.out.println("File Parent: "+file.getParent());
                    System.out.println("File Space Allocated: "+file.getUsableSpace());
                    System.out.println("File Length: "+file.length());
                    System.out.println("File List: "+ Arrays.toString(file.list())); // if its a directory
                }
                else
                    System.out.println("file does not exist");
            }
            // deletes the file
//            boolean b = file.delete(); // deletes the file & returns true if file was deleted
//            if(b) {
//                System.out.println("file deleted");
//            }
//            else
//                System.out.println("File not deleted");
        }
        catch(IOException e) {
            System.out.println("Some problem occurred : "+e);
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}
