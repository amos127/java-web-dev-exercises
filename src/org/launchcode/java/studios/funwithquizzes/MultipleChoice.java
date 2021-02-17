package org.launchcode.java.studios.funwithquizzes;

import java.util.ArrayList;
import java.util.Scanner;

public class MultipleChoice extends Question {

    private ArrayList<String> possibleAnswers;

    private int correctAnswer;

    public MultipleChoice(String question, int pointValue, ArrayList<String> possibleAnswers, int correctAnswer) {
        super(question, pointValue);
        this.possibleAnswers = possibleAnswers;
        this.correctAnswer = correctAnswer;
    }

    @Override
    public void displayAnswers() {
        for(String answer: possibleAnswers) {
            System.out.println(answer);
        }
    }

    public boolean isCorrectAnswer(int answerChoice) {
        if (answerChoice == this.correctAnswer) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int getAnswers() {
        Scanner answer = new Scanner(System.in);
        System.out.println("Enter the number of your answer: ");
        int userAnswer = answer.nextInt();
        if (isCorrectAnswer(userAnswer)) {
            return 1;
        } else {
            return 0;
        }
    }

}
