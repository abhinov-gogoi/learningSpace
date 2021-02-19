package com.prepbytes.week7.fileHandling;

import java.io.File;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) throws IOException {
        File f = new File("./src/com/prepbytes/week7/fileHandling/testFileGenerated.txt");
        f.createNewFile();

        File f2 = new File("./src/com/prepbytes/week7/fileHandling/testFileGenerated.txt");
        f2.mkdir();

        System.out.println(f.exists());
        System.out.println(f2.exists());

    }
}
