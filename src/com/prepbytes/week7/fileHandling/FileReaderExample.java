package com.prepbytes.week7.fileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample{

    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("./src/com/prepbytes/week7/fileHandling/testFileGenerated.txt");
        var output = ((char)fr.read());
        System.out.println(output);
    }


}
