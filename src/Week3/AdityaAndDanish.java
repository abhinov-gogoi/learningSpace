package Week3;

import java.io.IOException;
import java.util.Scanner;

public class AdityaAndDanish {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String str = sc.next();
            int countOfAditya = 0;
            int countOfDanish = 0;

            for(int i=0; i<str.length(); i++ ){
                if(str.charAt(i)=='A'){
                    countOfAditya++;
                }
                else
                    countOfDanish++;
            }

            if(countOfAditya==countOfDanish){
                System.out.println("AdiDan");
            }
            else if(countOfAditya>countOfDanish){
                System.out.println("Aditya");
            }
            else
                System.out.println("Danish");
        }
    }
}
