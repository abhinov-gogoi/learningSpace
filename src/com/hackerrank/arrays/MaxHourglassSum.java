package com.hackerrank.arrays;

//www.hackerrank.com/challenges/2d-array/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
public class MaxHourglassSum {

        // Complete the hourglassSum function below.
        static void hourglassSum(int[][] arr) {
            int rows = arr.length;
            int columns = arr[0].length;

            int max_sum = -64;

            for(int i=0; i<rows-2; i++) {
                for(int j=0; j<columns-2; j++) {
                    int current_sum = arr[i][j]+arr[i][j+1]+arr[i][j+2]+
                            arr[i+1][j+1]+
                            arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                    max_sum = Math.max(max_sum, current_sum);
                }
            }
            System.out.println(max_sum);
        }

}
