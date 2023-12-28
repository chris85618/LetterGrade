package com.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import static com.example.letterGrade.letterGrade;

public class Main {
    private static int score = -1;

    public static void main(String[] args) {
        System.out.print("Enetr the score = ");
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            score = Integer.parseInt(br.readLine());
            char grade = letterGrade(score);
            System.out.println("The grade of " + score + " is " + grade);
        } catch (NumberFormatException ex) {
            System.out.println("Not an integer!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
