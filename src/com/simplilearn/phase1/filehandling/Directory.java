package com.simplilearn.phase1.filehandling;

import java.io.File;
import java.io.FileFilter;

public class Directory {
    public static void main(String[] args) {
        // Folder / Directory Pathname
        File f = new File("C:\\Windows");

        // Filtering out folders in the pathname
        FileFilter directory = File::isDirectory;
        File[] all_folders = f.listFiles(directory);

        // Filtering out files in the pathname
        FileFilter file = File::isFile;
        File[] all_files = f.listFiles(file);

        // Listing total folders and printing them
        System.out.println("******************************Total folders = "+all_folders.length);
        for (File folder_name : all_folders) {
            System.out.println(folder_name.toString());
        }

        // Listing total files and printing them
        System.out.println("*****************************Total files = "+all_files.length);
        for(File s1: all_files ){
            System.out.println(s1.toString());
        }

    }
}
