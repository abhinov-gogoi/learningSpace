package com.revise.others;

public class RemoveCommonCharsFrmString {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("");
        String str1 = "clairvoyant";
        String str2 = "Abhinov";

        for(int i=0; i<str2.length()-1; i++) {
            String s = Character.toString(str2.charAt(i));
            if(!str1.contains(s)) {
                str.append(str2.charAt(i));
            }
        }
        System.out.println(str);
    }
}
