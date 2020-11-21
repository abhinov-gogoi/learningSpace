package Week3;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class FakePassword {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            String O = sc.next();
            sc.nextLine();
            String F = sc.nextLine();

            char[] rotated = new char[O.length()];
            rotated[0]=O.charAt(O.length()-2);
            rotated[1]=O.charAt(O.length()-1);
            for(int i =0; i<O.length()-2; i++){
                rotated[i+2]=O.charAt(i);
            }

            boolean conditionSatisfied = true;
            for(int i=0; i<F.length(); i++){
                if(rotated[i]!=F.charAt(i))
                    conditionSatisfied = false;
            }

            char[] rotated2 = new char[O.length()];
            rotated2[O.length()-1]=O.charAt(1);
            rotated2[O.length()-2]=O.charAt(0);
            for(int i =0; i<O.length()-2; i++){
                rotated2[i]=O.charAt(i+2);
            }
            boolean condition2Satisfied = true;
            for(int i=0; i<F.length(); i++){
                if(rotated2[i]!=F.charAt(i))
                    condition2Satisfied = false;
            }
//            System.out.println(O);
//            System.out.println(Arrays.toString(rotated));
//            System.out.println(Arrays.toString(rotated2));
            if(conditionSatisfied || condition2Satisfied){
                System.out.println("YES");
            }
            else
                System.out.println("NO");
        }
    }
}

