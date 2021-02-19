package com.codewithmosh.part3advanced.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Finally {
    public static void main(String[] args) throws FileNotFoundException {

        FileReader reader = null;

        try {
            reader = new FileReader("java.txt");
            System.out.println("File Found");

            new SimpleDateFormat().parse("");
        }
        catch(IOException | ParseException e){
            System.out.println("Could not read data");
        }
        finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
