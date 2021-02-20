package com.simplilearn.phase1.filehandling;

import java.io.File;

public class FileExample {
    public static void main(String[] args) {
        File f = new File("C:\\Windows");
        String[] s = f.list();

        for(String s1: s ){
            System.out.println(s1);
        }
    }
}
