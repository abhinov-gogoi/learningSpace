package Week2;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class OperationsOnMatrix {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int M = sc.nextInt(); // input no of rows
            int N = sc.nextInt(); // inout no of cols

            int[][] arr = new int[M][N]; // create 2D array with M*N cells
            for(int row=0; row<M; row++){
                for(int col=0; col<N; col++){
                    arr[row][col] = sc.nextInt(); // insert elements into 2D Array
                }
            }

            int[][] arr2 = new int[M][N]; // create another 2D array with M*N cells
            for(int row=0; row<M; row++){
                for(int col=0; col<N; col++){
                    arr2[row][col] = sc.nextInt(); // insert elements into 2D Array
                }
            }

            // Adding arr and arr 2
            int[][] arrAddition = new int[M][N]; // create another 2D array with M*N cells
            for(int row=0; row<M; row++){
                for(int col=0; col<N; col++){
                    arrAddition[row][col] = arr[row][col]+arr2[row][col]; // insert elements into 2D Array
                }
            }
            // Multiplying arr and arr 2
            System.out.println("Multiply");
            int[][] arrMultiplication = new int[M][N]; // create another 2D array with M*N cells
            for (int row=0; row<M; row++){
                for(int col= 0; col<M; col++){
                    arrMultiplication[row][col] = 0;
                    for (int k = 0; k<row; k++){
                        arrMultiplication[row][col]+=arr[row][k]+arr2[k][col];
                        System.out.print(arrMultiplication[row][col]+" ");
                    }
                }
                System.out.println();
            }


//            System.out.println(Arrays.deepToString(arr));
//            System.out.println(Arrays.deepToString(arr2));
//            System.out.println(Arrays.deepToString(arrAddition));

        }
    }
}






//    String formattedString = Arrays.deepToString(arr)
//            .replace(",", "")  //remove the commas
//            .replace("[", "")  //remove the right bracket
//            .replace("]", "")  //remove the left bracket
//            .trim();           //remove trailing spaces from partially initialized arrays
//            System.out.println(formattedString);
