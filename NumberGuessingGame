package com.mycompany.numgues;
import java.util.*;
public class Numgues {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Are you ready to play?  [YES/NO]");
        String start = sc.next();
        if(start.equalsIgnoreCase("YES"))
        {
            System.out.println("Let the game begin!");
            System.out.println("Guess the number between 1-100.");
            System.out.println("How many attempts would you require?");
            int attempts = sc.nextInt();
            int score = attempts*10;
            System.out.println("Your intial score is "+score);
            System.out.println("10 points will get deducted for every wrong guess.");
            System.out.println("May the best player win!");
            int answer = (int)Math.floor(Math.random()*100);
            while(attempts>0){
                System.out.println("Enter the number : ");
                int number = sc.nextInt();
                if(number == answer){
                    System.out.println("Yayyy!You won.");
                    System.out.println("Your score is "+score);
                    return;
                }
                else{
                    score -= 10;
                   
                    if(attempts != 1){
                        if(number > answer)
                        System.out.println("The number is lower than your guess.");
                        else
                        System.out.println("The number is higher than your guess.");
                    System.out.println("Wrong guess! Try again.");
                    }
                }
                attempts--;
            }
            System.out.println("You Lost the game.");
            System.out.println("your score is "+score);
            System.out.println("The number is "+answer);
            
        }
        else{
            return;
        }
    }
}
