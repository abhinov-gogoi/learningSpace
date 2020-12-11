package week4;

import java.util.Scanner;

public class CombinationOfNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int N = sc.nextInt();
            int[] arr = new int[N];
            for(int i=0; i<N; i++){
                arr[i] = sc.nextInt();
            }
            int K = sc.nextInt();

            for(int i=0; i<N-K+1; i++){
//                System.out.print(arr[i]+" ");
                for(int j=i; j==K; j++){
                    System.out.print(i+""+j+" ");
                }
                System.out.println(i);
            }
        }




    }
}
