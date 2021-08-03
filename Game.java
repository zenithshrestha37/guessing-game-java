/*

A number-guessing game.

*/

import java.util.Scanner;
import java.util.Random;

public class Game {
  public static void main(String[] args){
    System.out.println("Howdy, what's your name?");
    System.out.println("(type in your name)");

    Scanner input = new Scanner(System.in);
    String name = input.nextLine();


    Random rand = new Random();
    int answer = rand.nextInt(100) + 1;
    int tries = 0;

    System.out.println("The number is "+ answer);

    System.out.println(name + " I'm thinking of a number between 1 and 100");
    System.out.println("Try to guess my number");

    while(true){
      int guess;
      try {
        guess = input.nextInt();
      } catch (Exception e) {
        String invalid_input = input.next();
        System.out.println("Entry is not an integer, try again");
        continue;
      }


      System.out.println("Your guess? " + guess);
      tries += 1;

      if (guess < 1 || guess > 100){
        System.out.println("Invalid Entry");
      } else if (guess == answer){
        System.out.println("Well done " + name + " You found the number in " + tries + " tries");
        break;
      } else if (guess < answer) {
        System.out.println("Your guess is too low, try again");
      } else {
        System.out.println("Your guess is too high, try again");
      }

    }
  }
}
