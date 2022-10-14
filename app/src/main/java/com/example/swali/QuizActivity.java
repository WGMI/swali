package com.example.swali;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;

import com.example.swali.Models.Question;

import java.util.ArrayList;
import java.util.List;

public class QuizActivity extends AppCompatActivity {

    Context context;
    TextView counter,question,choice1,choice2,choice3,choice4;

    private List<Question> questions;
    private int questionCounter;
    private int total;
    private Question currentQuestion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        context = this;
        counter = findViewById(R.id.counter);
        question = findViewById(R.id.question);
        choice1 = findViewById(R.id.choice1);
        choice2 = findViewById(R.id.choice2);
        choice3 = findViewById(R.id.choice3);
        choice4 = findViewById(R.id.choice4);

        questions = new ArrayList<>();
        questions = getQuestions();
        total = questions.size();
        showNextQuestion();
    }

    private List<Question> getQuestions() {
        //Fetch questions

        return new ArrayList<>();
    }

    private void showNextQuestion() {
        if(questionCounter < total){
            currentQuestion = questions.get(questionCounter);
            question.setText(currentQuestion.getQuestion());

        }
    }
}