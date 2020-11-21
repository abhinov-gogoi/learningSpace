package Week3;

import java.io.IOException;
import java.util.Scanner;

public class MultiplyStrings {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            String str = sc.next();
            String str2 = sc.next();
            System.out.println(Integer.parseInt(str)*Integer.parseInt(str2));
        }
    }
}

