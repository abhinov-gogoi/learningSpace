package com.Algoexpert.easy;

import java.util.*;

public class TournamentWinner2 {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> competitions = new ArrayList<>();

        ArrayList<String> competitions1 = new ArrayList<>();
        competitions1.add("HTML");
        competitions1.add("C#");
        ArrayList<String> competitions2 = new ArrayList<>();
        competitions2.add("C#");
        competitions2.add("Python");
        ArrayList<String> competitions3 = new ArrayList<>();
        competitions3.add("Python");
        competitions3.add("HTML");

        competitions.add(competitions1);
        competitions.add(competitions2);
        competitions.add(competitions3);


        ArrayList<Integer> results = new ArrayList<>();
        results.add(0);
        results.add(0);
        results.add(1);



        System.out.println(tournamentWinner(competitions, results));
    }


    public static String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < competitions.size(); i++) {
            String winner;
            if (results.get(i) == 0) {
                winner = competitions.get(i).get(1);
            } else {
                winner = competitions.get(i).get(0);

            }

            if(map.get(winner)==null) {
                map.put(winner, 3);
            } else {
                map.put(winner, map.get(winner) + 3);
            }
        }

        int maxValue = 0;
        String maxKey = "";
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        return maxKey;
    }
}
