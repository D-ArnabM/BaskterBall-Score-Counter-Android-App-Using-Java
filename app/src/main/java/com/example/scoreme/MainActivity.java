package com.example.scoreme;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreValue1;
    int scoreValue2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressLint("SetTextI18n")
    public void forScore1(int a) {
        TextView score1 = findViewById(R.id.score1);
        score1.setText("" + a);
    }

    @SuppressLint("SetTextI18n")
    public void forScore2(int b) {
        TextView score2 = findViewById(R.id.score2);
        score2.setText("" + b);
    }

    @SuppressLint("SetTextI18n")
    public void plusThree1(View view) {
        scoreValue1 = scoreValue1 + 3;
        forScore1(scoreValue1);
    }

    @SuppressLint("SetTextI18n")
    public void plusThree2(View view) {
        scoreValue2 = scoreValue2 + 3;
        forScore2(scoreValue2);
    }

    @SuppressLint("SetTextI18n")
    public void plusTwo1(View view) {
        scoreValue1 = scoreValue1 + 2;
        forScore1(scoreValue1);
    }

    @SuppressLint("SetTextI18n")
    public void plusTwo2(View view) {
        scoreValue2 = scoreValue2 + 2;
        forScore2(scoreValue2);
    }

    @SuppressLint("SetTextI18n")
    public void plusOne1(View view) {
        scoreValue1++;
        forScore1(scoreValue1);
    }

    @SuppressLint("SetTextI18n")
    public void plusOne2(View view) {
        scoreValue2++;
        forScore2(scoreValue2);
    }

    @SuppressLint("SetTextI18n")
    public void reset(View view) {
        scoreValue1 = 0;
        scoreValue2 = 0;
        forScore1(scoreValue1);
        forScore2(scoreValue2);
    }

}