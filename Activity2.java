package com.gowrisivanathan.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class Activity2 extends AppCompatActivity implements AdapterView.OnItemClickListener {

    String[] playerName = new String[] {"Kyle Lowry", "Fred VanVleet", "Jeremy Lin", "Jordan Loyd", "Danny Green", "Patrick McCaw", "Jodie Meeks", "Kawhi Leonard", "OG Anunoby", "Norman Powell", "Malcolm Miller", "Pascal Siakam", "Serge Ibaka", "Eric Moreland", "Chris Boucher", "Marc Gasol"};
    String[] playerJersey = new String[] {"Jersey: 7", "Jersey: 23", "Jersey: 17", "Jersey: 8", "Jersey: 14", "Jersey: 1","Jersey: 20", "Jersey: 2", "Jersey: 3", "Jersey: 24","Jersey: 13", "Jersey: 43", "Jersey: 9", "Jersey: 15", "Jersey: 25", "Jersey: 33" };
    String[] playerRole = new String[] {"Position: Point Guard (PG)", "Position: Point Guard (PG)", "Position: Point Guard (PG)", "Position: Point Guard (PG)", "Position: Shooting Guard (SG)", "Position: Shooting Guard (SG)", "Position: Shooting Guard (SG)", "Position: Small Forward (SF)", "Position: Small Forward (SF)", "Position: Shooting Guard (SG)", "Position: Small Forward (SF)", "Position: Power Forward (PF)", "Position: Center (C)", "Position: Power Forward (PF)", "Position: Power Forward (PF)", "Position: Center (C)"};
    String[] playerDraft = new String[] {"Draft: Round 1, 24th by Memphis Grizzlies", "Draft: Undrafted", "Draft: Undrafted", "Draft: Undrafted","Draft: Round 2, 46th by Cleveland Cavaliers", "Draft: Round 2, 38th by Milwaukee Bucks", "Draft: Round 2, 41st by Milwaukee Bucks", "Draft: Round 1, 15th by Indiana Pacers","Draft: Round 1, 23rd by Toronto Raptors","Draft: Round 2, 46th by Milwaukee Bucks","Draft: Undrafted","Draft: Round 1, 27th by Toronto Raptors","Draft: Round 1, 24th by Seattle SuperSonics","Draft: Undrafted","Draft: Undrafted","Draft: Round 2, 48th by Los Angeles Lakers"};
    String[] playerHeight = new String [] {"Height: 6-1","Height: 6-0","Height: 6-3","Height: 6-4","Height: 6-6","Height: 6-7","Height: 6-4","Height: 6-7","Height: 6-8","Height: 6-4","Height: 6-9","Height: 6-10","Height: 6-10","Height: 6-10","Height: 7-1"};
    String[] playerWeight = new String [] {"Weight: 196","Weight: 195","Weight: 200","Weight: 210","Weight: 215","Weight: 185","Weight: 210","Weight: 230","Weight: 232","Weight: 215","Weight: 230","Weight: 235","Weight: 238","Weight: 201","Weight: 255"};
    String[] playerAge = new String [] {"Age: 33","Age: 25","Age: 30","Age: 25","Age: 31","Age: 23","Age: 31","Age: 27","Age: 21","Age: 26","Age: 26","Age: 25","Age: 29","Age: 27","Age: 26","Age: 34"};
    String[] playerBirthday = new String [] {"Birth date: 3/25/86","Birth date: 2/25/94","Birth date: 8/23/88","Birth date: 7/27/93","Birth date: 6/22/87","Birth date: 10/25/95","Birth date: 8/21/87","Birth date: 6/29/91","Birth date: 7/17/97","Birth date: 5/25/93","Birth date: 3/6/93","Birth date: 4/2/94","Birth date: 9/18/89","Birth date: 12/24/91","Birth date: 1/11/93","Birth date: 1/29/85"};
    String[] playerNationality = new String [] {"Nationality: American","Nationality: American","Nationality: American","Nationality: American","Nationality: American","Nationality: American","Nationality: American","Nationality: American","Nationality: British","Nationality: American", "Nationality: Cameroonian", "Nationality: Congolese/Spanish", "Nationality: American","Nationality: Canadian/Saint Lucian","Nationality: Spanish"};
    String[] playerExperience = new String [] {"Experience: 13th Season","Experience: 3rd Season","Experience: 9th Season","Experience: Rookie","Experience: 10th Season","Experience: 3rd Season","Experience: 10th Season","Experience: 8th Season","Experience: 2nd Season","Experience: 4th Season","Experience: 2nd Season","Experience: 3rd Season","Experience: 10th Season","Experience: 4th Season","Experience: 2nd Season","Experience: 11th Season"};
    String[] playerCollege = new String [] {"College: Villanova","College: Wichita State","College: Harvard","College: Indianapolis","College: North Carolina","College: UNLV","College: Kentucky","College: San Diego State","College: Indiana","College: UCLA","College: Holy Cross","College: New Mexico State","College: Not Applicable","College: Oregon State","College: Oregon State","College: Not Applicable"};

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        listView = (ListView) findViewById(R.id.listView);
        ArrayAdapter<String> weTheNorthAdapter = new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_expandable_list_item_1, playerName);
        listView.setAdapter(weTheNorthAdapter);
        listView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent moveToDetailIntent = new Intent(getBaseContext(), PlayerStats.class);
        moveToDetailIntent.putExtra("playerName", playerName [position]);
        moveToDetailIntent.putExtra("playerJersey", playerJersey [position]);
        moveToDetailIntent.putExtra("playerRole", playerRole [position]);
        moveToDetailIntent.putExtra("playerDraft", playerDraft [position]);
        moveToDetailIntent.putExtra("playerHeight", playerHeight [position]);
        moveToDetailIntent.putExtra("playerWeight", playerWeight [position]);
        moveToDetailIntent.putExtra("playerAge", playerAge [position]);
        moveToDetailIntent.putExtra("playerBirthday", playerBirthday [position]);
        moveToDetailIntent.putExtra("playerNationality", playerNationality [position]);
        moveToDetailIntent.putExtra("playerExperience", playerExperience [position]);
        moveToDetailIntent.putExtra("playerCollege", playerCollege [position]);
        startActivity(moveToDetailIntent);

    }
}
