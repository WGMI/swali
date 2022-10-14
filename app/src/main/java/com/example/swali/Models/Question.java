package com.example.swali.Models;

public class Question {

    long id;
    String question;
    String category;
    String difficulty;
    String correct_answer;
    String incorrect_answers;

    public Question(){

    }

    public Question(long id, String question, String category, String difficulty, String correct_answer, String incorrect_answers) {
        this.id = id;
        this.question = question;
        this.category = category;
        this.difficulty = difficulty;
        this.correct_answer = correct_answer;
        this.incorrect_answers = incorrect_answers;
    }

    public Question(String question, String category, String difficulty, String correct_answer, String incorrect_answers) {
        this.question = question;
        this.category = category;
        this.difficulty = difficulty;
        this.correct_answer = correct_answer;
        this.incorrect_answers = incorrect_answers;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getCorrect_answer() {
        return correct_answer;
    }

    public void setCorrect_answer(String correct_answer) {
        this.correct_answer = correct_answer;
    }

    public String getIncorrect_answers() {
        return incorrect_answers;
    }

    public void setIncorrect_answers(String incorrect_answers) {
        this.incorrect_answers = incorrect_answers;
    }
}
