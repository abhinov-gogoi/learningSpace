package com.Algoexpert.easy;

import javax.swing.text.html.parser.Entity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TournamentWinner {
    public static void main(String[] args) {
        String[][] competitions = new String[][]{
                {"HTML", "C#"},
                {"C#", "Python"},
                {"Python", "HTML"}
        };

        ArrayList<ArrayList<String>> competitions2 = new ArrayList<>();
        competitions2.size();

        int[] results = {0,0,1};

        HashMap<String, Integer> map = new HashMap<>();

        /**
         * iterate over the 2d array and store into a map
         */
        for(int i = 0; i< competitions.length; i++) {
            for(int  j=0; j<competitions[i].length; j++) {
                map.put(competitions[i][j], 0);
            }
        }
        System.out.println(Collections.unmodifiableMap(map));

        /**
         * print who beats whom
         */
        for(int i = 0; i< competitions.length; i++) {
            if(results[i]==0) {
                System.out.println(competitions[i][1] + " beats " + competitions[i][0]);
            } else {
                System.out.println(competitions[i][0] + " beats " + competitions[i][1]);
            }
        }

        /**
         * optimised solution
         */
        for(int i = 0; i< competitions.length; i++) {
            if(results[i]==0) {
                map.put(competitions[i][1], map.get(competitions[i][1])+3);
            } else {
                map.put(competitions[i][0], map.get(competitions[i][0])+3);
            }
        }
        System.out.println(Collections.unmodifiableMap(map));

        int maxValue = Collections.max(map.values());
        map.forEach((key, value) -> {
            if (value.equals(maxValue)) {
                System.out.println(key);
            }
        });

    }
}
