package com.example;

import java.util.Scanner;

public class StudentGradeEvaluation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        String name=scanner.nextLine();

        System.out.print("Enter your age: ");
        int age=scanner.nextInt();

        System.out.print("Enter your exam score: ");
        int score=scanner.nextInt();

        // Determine the grade
        String grade;
        
        if(score>=90&&age<25){
            grade="A";
            System.out.println("You are eligible for the scholarship");
        }
        else if(score>=80&age<25){
            grade="B";
            System.out.println("You are eligible for the scholarship");
        }        
        else if(score>=70){
            grade="C";
        }
        else if(score>=60){
            grade="D";
        }
        else{
            grade="F";
        }

        // Print the student's details
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Score: " + score);
        System.out.println("Grade: " + grade);
        

       
    }
}
