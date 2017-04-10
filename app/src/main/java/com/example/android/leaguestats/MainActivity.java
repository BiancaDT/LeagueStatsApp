package com.example.android.leaguestats;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int killScoreBlue = 0;
    int killScorePurple = 0;
    int deathScoreBlue = 0;
    int deathScorePurple = 0;
    int assistScoreBlue = 0;
    int assistScorePurple = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayKillsBlueTeam(0);
        displayKillsPurpleTeam(0);
        displayDeathsBlueTeam(0);
        displayDeathsPurpleTeam(0);
        displayAssistsBlueTeam(0);
        displayAssistsPurpleTeam(0);
        //for setting icon
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.lol2);
    }

    //linking to XML
    public void displayKillsBlueTeam(int killscore1) {
        TextView scoreView = (TextView) findViewById(R.id.team_blue_kills);
        scoreView.setText(String.valueOf(killscore1));
    }

    public void displayKillsPurpleTeam(int killscore2) {
        TextView scoreView = (TextView) findViewById(R.id.team_purple_kills);
        scoreView.setText(String.valueOf(killscore2));
    }

    public void displayDeathsBlueTeam (int deathscore1) {
        TextView scoreView = (TextView) findViewById(R.id.team_blue_deaths);
        scoreView.setText(String.valueOf(deathscore1));
    }

    public void displayDeathsPurpleTeam(int deathscore2) {
        TextView scoreView = (TextView) findViewById(R.id.team_purple_deaths);
        scoreView.setText(String.valueOf(deathscore2));
    }

    public void displayAssistsBlueTeam(int assistscore1) {
        TextView scoreView = (TextView) findViewById(R.id.team_blue_assists);
        scoreView.setText(String.valueOf(assistscore1));
    }


    public void displayAssistsPurpleTeam(int assistscore2) {
        TextView scoreView = (TextView) findViewById(R.id.team_purple_assists);
        scoreView.setText(String.valueOf(assistscore2));
    }
//methods for incrementing values of each score

    public void blueKill (View view) {
       killScoreBlue = killScoreBlue + 1;
       displayBlueKills(killScoreBlue);
    }


    public void purpleKill(View view) {
        killScorePurple = killScorePurple + 1;
        displayPurpleKills(killScorePurple);
    }


    public void blueDeath(View view) {
        deathScoreBlue = deathScoreBlue + 1;
        displayBlueDeaths(deathScoreBlue);
    }


    public void purpleDeath(View view) {
        deathScorePurple = deathScorePurple + 1;
        displayPurpleDeaths(deathScorePurple);
    }


    public void blueAssist(View view) {
        assistScoreBlue = assistScoreBlue + 1;
        displayBlueAssists(assistScoreBlue);
    }


    public void purpleAssist(View view) {
        assistScorePurple = assistScorePurple + 1;
        displayPurpleAssists(assistScorePurple);
    }


    private void displayBlueKills(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.team_blue_kills);
        quantityTextView.setText("" + number);
    }

    private void displayPurpleKills (int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.team_purple_kills);
        quantityTextView.setText("" + number);
    }

    private void displayBlueDeaths(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.team_blue_deaths);
        quantityTextView.setText("" + number);
    }

    private void displayPurpleDeaths(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.team_purple_deaths);
        quantityTextView.setText("" + number);
    }

    private void displayBlueAssists(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.team_blue_assists);
        quantityTextView.setText("" + number);
    }

    private void displayPurpleAssists(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.team_purple_assists);
        quantityTextView.setText("" + number);
    }

    public void reset(View view) {
        killScoreBlue = 0;
        killScorePurple = 0;
        deathScoreBlue = 0;
        deathScorePurple = 0;
        assistScoreBlue = 0;
        assistScorePurple = 0;
        displayBlueKills(killScoreBlue);
        displayPurpleKills(killScorePurple);
        displayBlueDeaths( deathScoreBlue);
        displayPurpleDeaths(deathScorePurple);
        displayBlueAssists(assistScoreBlue);
        displayPurpleAssists(assistScorePurple);
    }
}