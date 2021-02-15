package com.brocode.customexceptions.mosh;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TryWithResources {
    public static void main(String[] args) throws FileNotFoundException {

        try (FileReader reader = new FileReader("java.txt")
        ) {
            System.out.println("File Found");
        }
        catch(IOException e){
            System.out.println("Could not read data");
        }
        catch (Exception e){
            System.out.println("Somethings want wong");
        }
        finally {
            System.out.println("Finally block always gets executed");

            /*
             here we do not need to explicitly write reader.close()
             this is because File reader class implements the autocloseable interface
             */
        }

    }

}
