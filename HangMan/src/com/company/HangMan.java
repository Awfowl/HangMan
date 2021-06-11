package com.company;

import java.util.Scanner;
import java.util.Random;

public class HangMan {

       static  Random random = new Random();
       static String[] words = {"hello","goodbye","burger","shhhhh","window","qeshm"};
       static String word  = words[random.nextInt(words.length)];
       static String hiddenWord = new String(new char[word.length()]).replace("\0", "*");//
       static int count = 0;
       static  boolean flag = true;



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (count < 7 && flag){
            System.out.println("guess any letter in your keyboard ");
            System.out.println(hiddenWord);
            String guess = scanner.next();
            hang(guess); }

    }

    public static void hang(String guess) {
        String newHiddenWord = "";

        for (int i = 0; i < word.length(); i++){
              if(word.charAt(i) == guess.charAt(0)){
                  newHiddenWord += guess.charAt(0);
              }else if (hiddenWord.charAt(i) != '*'){
                  newHiddenWord += word.charAt(i);
              }else {
                  newHiddenWord += "*"; }
              }

        if (hiddenWord.equals(newHiddenWord)){
            count++;
            hangmanImage();
        }else {
            hiddenWord = newHiddenWord; }
        if (hiddenWord.equals(word)){
            System.out.println("HOOOOO , you win dude ! , the word was ::" + word);
          flag = false;
        }

    }

    public static void hangmanImage() {
        if (count == 1) {
            System.out.println("Wrong guess, try again");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("___|___");
            System.out.println();
        }
        if (count == 2) {
            System.out.println("Wrong guess, try again");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
        }
        if (count == 3) {
            System.out.println("Wrong guess, try again");
            System.out.println("   ____________");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   | ");
            System.out.println("___|___");
        }
        if (count == 4) {
            System.out.println("Wrong guess, try again");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
        }
        if (count == 5) {
            System.out.println("Wrong guess, try again");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |           |");
            System.out.println("   |           |");
            System.out.println("   |");
            System.out.println("___|___");
        }
        if (count == 6) {
            System.out.println("Wrong guess, try again");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |           |");
            System.out.println("   |           |");
            System.out.println("   |          / \\ ");
            System.out.println("___|___      /   \\");
        }
        if (count == 7) {
            System.out.println("GAME OVER!");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |          _|_");
            System.out.println("   |         / | \\");
            System.out.println("   |          / \\ ");
            System.out.println("___|___      /   \\");
            System.out.println("GAME OVER! The word was " + word);
        }
    }

}
