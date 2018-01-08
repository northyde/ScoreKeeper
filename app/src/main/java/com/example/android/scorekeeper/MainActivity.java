package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //holds score for Team 1
    int goalsTeam1 = 0;
    //holds score for Team 2
    int goalsTeam2 = 0;
    //holds number of corners for team 1
    int cornersTeam1 = 0;
    //holds number of coners for team 2
    int cornersTeam2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    // Adds 1 goal for team 1 by clicking the goal button
    public void addGoal1(View v) {
        goalsTeam1 = goalsTeam1 + 1;
        displayGoalsTeam1(goalsTeam1);
    }

    // Adds 1 corner for team 1 by clicking the corner button
    public void addCorner1(View v) {
        cornersTeam1 = cornersTeam1 + 1;
        displayCornersTeam1(cornersTeam1);
    }

    /**
     * Displays the given goals for Team 1.
     */
    public void displayGoalsTeam1(int goalsTeam1) {
        TextView scoreView = findViewById(R.id.goals_team1);
        scoreView.setText(String.valueOf(goalsTeam1));
    }

    /**
     * Displays the given corners for Team 1.
     */
    public void displayCornersTeam1(int cornersTeam1) {
        TextView scoreView = findViewById(R.id.corners_team1);
        scoreView.setText(String.valueOf(cornersTeam1));
    }

    // Adds 1 goal for team 2 by clicking the goal button
    public void addGoal2(View v) {
        goalsTeam2 = goalsTeam2 + 1;
        displayGoalsTeam2(goalsTeam2);
    }

    // Adds 1 corner for team 2 by clicking the corner button
    public void addCorner2(View v) {
        cornersTeam2 = cornersTeam2 + 1;
        displayCornersTeam2(cornersTeam2);
    }

    /**
     * Displays the given goals for Team 2.
     */
    public void displayGoalsTeam2(int goalsTeam2) {
        TextView scoreView = findViewById(R.id.goals_team2);
        scoreView.setText(String.valueOf(goalsTeam2));
    }

    /**
     * Displays the given corners for Team 2.
     */
    public void displayCornersTeam2(int cornersTeam2) {
        TextView scoreView = findViewById(R.id.corners_team2);
        scoreView.setText(String.valueOf(cornersTeam2));
    }

    //Sets goals and corners for team 1 and team2 to 0
    public void reset(View v) {
        goalsTeam1 = 0;
        goalsTeam2 = 0;
        cornersTeam1 = 0;
        cornersTeam2 = 0;
        displayGoalsTeam1(0);
        displayGoalsTeam2(0);
        displayCornersTeam1(0);
        displayCornersTeam2(0);
    }
}
