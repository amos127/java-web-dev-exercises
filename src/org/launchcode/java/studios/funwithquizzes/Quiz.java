package org.launchcode.java.studios.funwithquizzes;

import java.util.ArrayList;

public class Quiz {

    private ArrayList<Question> quiz;
    private int score;
    private int total;

    public Quiz(ArrayList<Question> quiz) {
        this.quiz = quiz;
        this.score = 0;
        this.total = 0;
        for (int i = 0; i < quiz.size(); i++) {
            this.total = this.total + quiz.get(i).getPointValue();
        }
    }

    public void addQuestion(Question question) {
        this.quiz.add(question);
        this.total = this.total + question.getPointValue();
    }

    public void runQuiz() {
        for (int i = 0; i < quiz.size(); i++) {
            quiz.get(i).displayQuestion();
            quiz.get(i).displayAnswers();
            int points = quiz.get(i).getAnswers();
            updateScore(points);
        }
    }

    public void updateScore (int x) {
        this.score += x;
    }

    public void gradeQuiz() {
        System.out.println("You finished the quiz! Your score is: " + score + "/" + total);
    }
}
