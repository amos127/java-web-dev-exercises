package org.launchcode.java.studios.funwithquizzes;

public abstract class Question {

    private String question;
    private int pointValue;

    public Question(String question, int pointValue) {
        this.question = question;
        this.pointValue = pointValue;
    }

    public void displayQuestion() {
        System.out.println(this.question);
    }

    public int getPointValue() {
        return pointValue;
    }

    public void setPointValue(int pointValue) {
        this.pointValue = pointValue;
    }

    public abstract void displayAnswers();

    public abstract int getAnswers();

}
