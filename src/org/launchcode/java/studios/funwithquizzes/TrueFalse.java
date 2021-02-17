package org.launchcode.java.studios.funwithquizzes;

import java.util.Map;
import java.util.Scanner;

public class TrueFalse extends Question {

    private boolean correctAnswer;

    public TrueFalse(String question, int pointValue, boolean correctAnswer) {
        super(question, pointValue);
        this.correctAnswer = correctAnswer;
    }

    public boolean isCorrectAnswer(boolean answerChoice) {
        if (answerChoice == this.correctAnswer) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void displayAnswers() {
        System.out.println("True or false?");
    }

    @Override
    public int getAnswers() {
        Scanner answer = new Scanner(System.in);
        System.out.println("Enter 't' for true or 'f' for false:");
        String userAnswer = answer.nextLine();
        if (userAnswer.indexOf('t') >= 0) {
            if (isCorrectAnswer(true)) {
                return 1;
            }
            else {
                return 0;
            }
        } else {
            if (isCorrectAnswer(false)) {
                return 1;
            } else {
                return 0;
            }
        }


    }
}
