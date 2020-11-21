package Week3;

import java.io.IOException;
import java.util.Scanner;

public class PlayingCards {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            String table = sc.next(); // one card on table
            sc.nextLine();
            String hand = sc.nextLine(); // five cards in hand

            // returns -1 if that char(rank/suit) is not present in hand string
            int rank = hand.indexOf(table.charAt(0));
            int suit = hand.indexOf(table.charAt(1));

            if(rank==-1 && suit==-1){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }

        }
    }
}


//
//            System.out.println(hand);
//                    System.out.println(table.charAt(0));
//                    System.out.println(table.charAt(1));
//                    System.out.println("__________");
//                    System.out.println(rank);
//                    System.out.println(suit);
//                    System.out.println();