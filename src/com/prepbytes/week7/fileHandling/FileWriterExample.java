package com.prepbytes.week7.fileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("./src/com/prepbytes/week7/fileHandling/testFileGenerated.txt");
        fw.write('a');
        fw.write("\n");
        char[] ch = {'b', 'c', 'd'};
        fw.write(ch);
        fw.write("\n");
        fw.write("Hello there.");
        fw.write("\n");
        fw.write(103);
        fw.flush();
        fw.close();
    }
}
