package com.example.andrewlewis.fitly;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static com.example.andrewlewis.fitly.R.id.about_menu_button;
import static com.example.andrewlewis.fitly.R.id.fitness_menu_button;
import static com.example.andrewlewis.fitly.R.id.settings_menu_button;
import static com.example.andrewlewis.fitly.R.id.share_menu_button;
import static com.example.andrewlewis.fitly.R.id.workout_menu_button;

public class MenuActivity extends AppCompatActivity {

    @Bind(R.id.settings_menu_button)
    TextView settingsMenuButton;

    @Bind(R.id.workout_menu_button)
    TextView workoutMenuButton;

    @Bind(R.id.fitness_menu_button)
    TextView fitnessMenuButton;

    @Bind(R.id.share_menu_button)
    TextView shareMenuButton;

    @Bind(R.id.about_menu_button)
    TextView aboutMenuButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        ButterKnife.bind(this);
    }


    @OnClick(settings_menu_button)
    public void setSettingsMenuButton(){
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }

    @OnClick(workout_menu_button)
    public void setWorkoutMenuButton(){
        Intent intent = new Intent(this, WorkoutPlannerActivity.class);
        startActivity(intent);
    }

    @OnClick(fitness_menu_button)
    public void setFitnessMenuButton(){
        Intent intent = new Intent(this, FitnessPlannerActivity.class);
        startActivity(intent);
    }

    @OnClick(share_menu_button)
    public void setShareMenuButton(){
        Intent intent = new Intent(this, ShareActivity.class);
        startActivity(intent);
    }
    @OnClick(about_menu_button)
    public void setAboutMenuButton(){
        Intent intent = new Intent(this, AboutActivity.class);
        startActivity(intent);
    }
}
