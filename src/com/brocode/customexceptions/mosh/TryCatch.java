package com.brocode.customexceptions.mosh;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TryCatch {
    public static void main(String[] args) throws FileNotFoundException {

        try {
            FileReader reader = new FileReader("java.txt");
            System.out.println("File Found");
            new SimpleDateFormat().parse("");
        }
        catch(IOException | ParseException e){
            System.out.println("Could not read data");
        }
        catch (Exception e){
            System.out.println("Somethings want wong");
        }

    }

}
