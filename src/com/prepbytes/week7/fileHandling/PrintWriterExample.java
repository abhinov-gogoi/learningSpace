package com.prepbytes.week7.fileHandling;

import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterExample {
    public static void main(String[] args) throws IOException {
        /*
            1. Most Advanced/the best yet file writer
            2. It can directly communicate with the file (no need of FileWriter Object)
            3. It can write integer, double, string, boolean etc to files with print() and println() method
               (not present in BufferedWriter and FileWriter - only chars)
         */

        PrintWriter pw = new PrintWriter("./src/com/prepbytes/week7/fileHandling/pwTestFile.txt");
        pw.print(123);
        pw.println();
        pw.print(234.234);
        pw.print('a');
        pw.print("+++A String");
        // prints in a new line
        pw.println(123);
        pw.println("Another String");
        pw.flush();
        pw.close();
    }
}
