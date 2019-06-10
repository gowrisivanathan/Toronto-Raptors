package com.gowrisivanathan.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PlayerStats extends AppCompatActivity {

    TextView nameTextView;
    TextView jerseyTextView;
    TextView positionTextView;
    TextView draftTextView;
    TextView heightTextView;
    TextView weightTextView;
    TextView ageTextView;
    TextView birthdayTextView;
    TextView nationalityTextView;
    TextView experienceTextView;
    TextView collegeTextView;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_stats);

        nameTextView = (TextView) findViewById(R.id.nameTextView);
        jerseyTextView = (TextView) findViewById(R.id.jerseyTextView);
        positionTextView = (TextView) findViewById(R.id.positionTextView);
        draftTextView = (TextView) findViewById(R.id.draftTextView);
        heightTextView = (TextView) findViewById(R.id.heightTextView);
        weightTextView = (TextView) findViewById(R.id.weightTextView);
        ageTextView = (TextView) findViewById(R.id.ageTextView);
        birthdayTextView = (TextView) findViewById(R.id.birthdayTextView);
        nationalityTextView = (TextView) findViewById(R.id.nationalityTextView);
        experienceTextView = (TextView) findViewById(R.id.experienceTextView);
        collegeTextView = (TextView) findViewById(R.id.collegeTextView);
        imageView = (ImageView) findViewById(R.id.imageView);

        String playerName = (String) getIntent().getExtras().get("playerName");
        String playerJersey = (String) getIntent().getExtras().get("playerJersey");
        String playerRole = (String) getIntent().getExtras().get("playerRole");
        String playerDraft = (String) getIntent().getExtras().get("playerDraft");
        String playerHeight = (String) getIntent().getExtras().get("playerHeight");
        String playerWeight = (String) getIntent().getExtras().get("playerWeight");
        String playerAge = (String) getIntent().getExtras().get("playerAge");
        String playerBirthday = (String) getIntent().getExtras().get("playerBirthday");
        String playerNationality = (String) getIntent().getExtras().get("playerNationality");
        String playerExperience = (String) getIntent().getExtras().get("playerExperience");
        String playerCollege = (String) getIntent().getExtras().get("playerCollege");

        nameTextView.setText(playerName);
        jerseyTextView.setText(playerJersey);
        positionTextView.setText(playerRole);
        draftTextView.setText(playerDraft);
        heightTextView.setText(playerHeight);
        weightTextView.setText(playerWeight);
        ageTextView.setText(playerAge);
        birthdayTextView.setText(playerBirthday);
        nationalityTextView.setText(playerNationality);
        experienceTextView.setText(playerExperience);
        collegeTextView.setText(playerCollege);


        if (playerName.equals("Kyle Lowry")) {
            imageView.setImageResource(R.mipmap.lowry1_round);
        }

        if (playerName.equals("Fred VanVleet")) {
            imageView.setImageResource(R.mipmap.vanvleet1_round);
        }

        if (playerName.equals("Jeremy Lin")) {
            imageView.setImageResource(R.mipmap.lin1_round);
        }

        if (playerName.equals("Jordan Loyd")) {
            imageView.setImageResource(R.mipmap.loyd1_round);
        }

        if (playerName.equals("Danny Green")) {
            imageView.setImageResource(R.mipmap.green1_round);
        }

        if (playerName.equals("Patrick McCaw")) {
            imageView.setImageResource(R.mipmap.mccaw1_round);
        }

        if (playerName.equals("Jodie Meeks")) {
            imageView.setImageResource(R.mipmap.meeks1_round);
        }

        if (playerName.equals("Kawhi Leonard")) {
            imageView.setImageResource(R.mipmap.leonard1_round);
        }

        if (playerName.equals("OG Anunoby")) {
            imageView.setImageResource(R.mipmap.anunoby1_round);
        }

        if (playerName.equals("Norman Powell")) {
            imageView.setImageResource(R.mipmap.powell1_round);
        }

        if (playerName.equals("Malcolm Miller")) {
            imageView.setImageResource(R.mipmap.miller1_round);
        }

        if (playerName.equals("Pascal Siakam")) {
            imageView.setImageResource(R.mipmap.siakam1_round);
        }

        if (playerName.equals("Serge Ibaka")) {
            imageView.setImageResource(R.mipmap.ibaka1_round);
        }

        if (playerName.equals("Eric Moreland")) {
            imageView.setImageResource(R.mipmap.moreland1_round);
        }

        if (playerName.equals("Chris Boucher")) {
            imageView.setImageResource(R.mipmap.boucher1_round);
        }

        if (playerName.equals("Marc Gasol")) {
            imageView.setImageResource(R.mipmap.gasol1_round);
        }

    }
}
