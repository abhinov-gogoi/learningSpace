package com.brocode.encryptionprogram;

import java.util.*;

public class EncryptionProgram {

    private final Scanner scanner;
    private ArrayList<Character> list;
    private ArrayList<Character> shuffledList;
    private char character;
    private char[] letters;


    public EncryptionProgram() {
        scanner = new Scanner(System.in);
        list = new ArrayList<Character>();
        shuffledList = new ArrayList<Character>();
        character = ' ';

        generateNewKey();
        showMenu();
    }

    public void showMenu() {
        while(true) {

            System.out.println("******************************************************");
            System.out.println("What do you want to do?");
            System.out.println("(N)ewKey | (S)howKey | (E)ncrypt | (D)ecrypt | (Q)uit");
            try{
                char response = Character.toUpperCase(scanner.nextLine().charAt(0));
                switch (response) {
                    case 'N' -> generateNewKey();
                    case 'S' -> showKey();
                    case 'E' -> encrypt();
                    case 'D' -> decrypt();
                    case 'Q' -> quit();
                    default -> System.out.println("Please enter a valid input\n");
                }
            }
            catch(Exception e){
                System.out.println("\n\n\nPlease do not enter blank");
            }
        }
    }

    public void generateNewKey() {
        character = ' ';
        list.clear();
        shuffledList.clear();

        for (int i=32; i<127; i++){
            list.add(character);
            character++;
        }

        shuffledList = new ArrayList<Character>(list);
        Collections.shuffle(shuffledList);
        System.out.println("** NEW KEY GENERATED **");
    }

    public void showKey() {
        System.out.println("KEY :");
        for(Character x: list){
            System.out.print(x+" ");
        }
        System.out.println();
        for (Character x:shuffledList) {
            System.out.print(x+" ");
        }
        System.out.println();
    }


    public void encrypt() {
        System.out.println("Enter a message to be encrypted");
        String message = scanner.nextLine();

        letters = message.toCharArray();

        for (int i=0; i<letters.length; i++){
            for (int j=0; j<list.size(); j++){
                if (letters[i] == list.get(j)){
                    letters[i] = shuffledList.get(j);
                    break;
                }
            }
        }
        System.out.println("Encrypted : ");
        for (char c:letters)
            System.out.print(c);
        System.out.println();
    }

    public void decrypt() {
        System.out.println("Enter a message to be decrypted");

        String message = scanner.nextLine();

        letters = message.toCharArray();

        for (int i=0; i<letters.length; i++){
            for (int j=0; j<shuffledList.size(); j++){
                if (letters[i] == shuffledList.get(j)){
                    letters[i] = list.get(j);
                    break;
                }
            }
        }
        System.out.println("Decrypted : ");
        for (char c:letters)
            System.out.print(c);
        System.out.println();
    }

    public void quit() {
        System.out.println("Are you sure? (Y)es | (N)o");
        try{
            char response = Character.toUpperCase(scanner.nextLine().charAt(0));
            switch (response){
                case 'Y' -> {
                    System.out.println("You Quit. Thank you");
                    System.exit(0);
                }
                case 'N' -> showMenu();
                default -> {
                    System.out.println("Enter Y or N");
                    quit();
                }
            }
        }
        catch (Exception e){
            System.out.println("Please enter SOME thing !!");
            quit();
        }

    }
}
