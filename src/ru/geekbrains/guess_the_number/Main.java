package ru.geekbrains.guess_the_number;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Your task is guessing the number");
        for (int i = 10; i <= 30; i += 10) playLevel(i);
        System.out.println("You have won!!!");
        scanner.close();
    }

    private static void playLevel (int range){
        int number = (int)(Math.random() * range);
        while (true){
            System.out.println("Guess number from 0 to " + range);
            int input_number = scanner.nextInt();
            if (input_number == number){
                System.out.println("Congrats! You have guessed!");
                break;
            } else if (input_number > number){
                System.out.println("The hidden number is less than yours");
            } else {
                System.out.println("The hidden number is more than yours");
            }
        }
    }
}
