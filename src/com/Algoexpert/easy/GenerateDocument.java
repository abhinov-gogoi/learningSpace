package com.Algoexpert.easy;

import java.util.Arrays;

public class GenerateDocument {
    public static void main(String[] args) {
        String characters =  "Bste!hetsi ogEAxpelrt x! ";
        String document  = "AlgoExpert is the Best!!!";
        System.out.println(generateDocument(characters,document));

    }


    public static boolean generateDocument(String characters, String document) {
        if(document.equals("")){
            return true;
        }

        int[] freq_arry_ch = new int[256];
        for (int i=0; i<characters.length(); i++) {
            freq_arry_ch[characters.charAt(i)]++;
        }
        System.out.println(Arrays.toString(freq_arry_ch));

        int[] freq_arry_doc = new int[256];
        for (int i=0; i<document.length(); i++) {
            freq_arry_doc[document.charAt(i)]++;
        }
        System.out.println(Arrays.toString(freq_arry_doc));

        for(int i=0; i<freq_arry_ch.length; i++) {
            if(freq_arry_doc[i]>freq_arry_ch[i]){
                return false;
            }
        }
        return true;
    }
}
