package com.example.adamoates.basketballpointcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.adamoates.basketballpointcounter.R.string.homeTeamScore;

public class MainActivity extends AppCompatActivity {

    int twoPoints = 2;
    int threePoints = 3;
    int freeThrows = 1;
    int homeTeamScore;
    int visitorsTeamScore;

    Button threePointerButton;
    Button twoPointerButton;
    Button freeThrowButton;
    Button resetButton;
    TextView scoreView;

    public void resetScoreButton() {
        homeTeamScore = 0;
        visitorsTeamScore = 0;
        displayHomeTeamScore(homeTeamScore);
        displayVisitorsTeamScore(visitorsTeamScore);
    }

    public void displayHomeTeamScore(int score) {
        scoreView = (TextView) findViewById(R.id.home_team_score_text_view);
        scoreView.setText(String.valueOf(score));

    }

    public void displayVisitorsTeamScore(int score) {
        scoreView = (TextView) findViewById(R.id.visitors_team_score_text_view);
        scoreView.setText(String.valueOf(score));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        threePointerButton = (Button) findViewById(R.id.three_point_button_view);
        threePointerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                homeTeamScore += threePoints;
                displayHomeTeamScore(homeTeamScore);
            }
        });

        twoPointerButton = (Button) findViewById(R.id.two_point_button_view);
        twoPointerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                homeTeamScore += twoPoints;
                displayHomeTeamScore(homeTeamScore);
            }
        });

        freeThrowButton = (Button) findViewById(R.id.free_throw_button_view);
        freeThrowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                homeTeamScore += freeThrows;
                displayHomeTeamScore(homeTeamScore);
            }
        });

        threePointerButton = (Button) findViewById(R.id.visitors_three_point_button_view);
        threePointerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                visitorsTeamScore += threePoints;
                displayVisitorsTeamScore(visitorsTeamScore);
            }
        });

        twoPointerButton = (Button) findViewById(R.id.visitors_two_point_button_view);
        twoPointerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                visitorsTeamScore += twoPoints;
                displayVisitorsTeamScore(visitorsTeamScore);
            }
        });

        freeThrowButton = (Button) findViewById(R.id.visitors_free_throw_button_view);
        freeThrowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                visitorsTeamScore += freeThrows;
                displayVisitorsTeamScore(visitorsTeamScore);
            }
        });

        resetButton = (Button) findViewById(R.id.reset_button_text_view);
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetScoreButton();
            }
        });

    }
}
