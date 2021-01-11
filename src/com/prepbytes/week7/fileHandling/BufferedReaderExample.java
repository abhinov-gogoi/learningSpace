package com.prepbytes.week7.fileHandling;

import java.io.*;

public class BufferedReaderExample {
    public static void main(String[] args) throws IOException {
        /*
        Buffered reader is THE BEST READER that we have till date.

        In FileReader the issue was we had to read char by char.
        So BufferedReader solves this issue by reading whole line at a time with the readLine() method.

        NOTE - we cannot directly communicate with the file using
        a bufferedReader like this- var bw = new BufferedReader(pathname: "");
        we must pass a FileReader object in the constructor
         */
        FileReader fr = new FileReader("./src/com/prepbytes/week7/fileHandling/testFileGenerated.txt");
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        while(line != null){
            System.out.println(line);
            line = br.readLine();
        }
    }
}
