package com.example.andrewlewis.fitly;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static com.example.andrewlewis.fitly.R.id.create_new_workout_plan_button;
import static com.example.andrewlewis.fitly.R.id.view_existing_workout_button;
import static com.example.andrewlewis.fitly.R.id.view_sample_workout_plan_button;

public class WorkoutPlannerActivity extends AppCompatActivity {

    @Bind(R.id.view_existing_workout_button)
    TextView viewExistingWorkoutButton;

    @Bind(R.id.create_new_workout_plan_button)
    TextView createNewWorkoutPlanButton;

    @Bind(R.id.view_sample_workout_plan_button)
    TextView viewSampleWorkoutPlanButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_planner);
        ButterKnife.bind(this);
    }
    @OnClick(view_existing_workout_button)
    public void setViewExistingWorkoutButton(){
        Intent intent = new Intent(this, CurrentWorkoutPlansActivity.class);
        startActivity(intent);
    }

    @OnClick(create_new_workout_plan_button)
    public void setCreateNewWorkoutPlanButton(){
        Intent intent = new Intent(this, NewWorkoutPlanActivity.class);
        startActivity(intent);
    }

    @OnClick(view_sample_workout_plan_button)
    public void setViewSampleWorkoutPlanButton(){
        Intent intent = new Intent(this, SampleWorkoutTemplateActivity.class);
        startActivity(intent);
    }
}
