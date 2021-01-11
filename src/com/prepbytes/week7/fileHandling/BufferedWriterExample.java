package com.prepbytes.week7.fileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
    public static void main(String[] args) throws IOException {

        /*
        In FileWriter the issue was we had to put \n after every line
        this may not work in some platforms.
        So Buffered Writer solves this issue with the newLine() method

        NOTE - we cannot directly communicate with the file using
        a bufferedWriter like this- var bw = new BufferedWriter(pathname: "");
        we must pass a FileWriter object in the constructor
         */
        FileWriter fw = new FileWriter("./src/com/prepbytes/week7/fileHandling/testFileGenerated.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write('a');
        bw.newLine();
        char[] ch = {'b', 'c', 'd'};
        bw.write(ch);
        bw.newLine();
        bw.write("Hello there.");
        bw.newLine();
        bw.write(103);
        bw.flush();
        bw.close();

    }
}
