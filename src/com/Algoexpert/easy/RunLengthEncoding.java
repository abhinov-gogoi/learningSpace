package com.Algoexpert.easy;

public class RunLengthEncoding {
    public static void main(String[] args) {
        String  str = "AA";

        System.out.println(runLengthEncoding(str));
    }

    public static String runLengthEncoding(String string) {
        StringBuilder enc_str = new StringBuilder();
        if(string.equals("")) {
            return enc_str.toString();
        }

        String curr_char = String.valueOf(string.charAt(0));
        int count = 1;

        for(int i=0; i<string.length(); i++){
            if(String.valueOf(string.charAt(i)).equals(curr_char)) {
                if(count>=9) {
                    enc_str.append(count).append(curr_char);
                    count = 1;
                } else {
                    count++;
                }
            } else {
                enc_str.append(count).append(curr_char);
                curr_char = String.valueOf(string.charAt(i));
                count = 1;
            }


        }
        return enc_str.toString();
    }
}
