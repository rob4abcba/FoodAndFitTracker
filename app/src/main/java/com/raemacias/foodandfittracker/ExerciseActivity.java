package com.raemacias.foodandfittracker;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import models.getCaloriesBurnedForExercises.Exercise;
import network.ApiUtils;
import network.TrackerInterface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

//This was created from the tutorial at:
//https://code.tutsplus.com/tutorials/sending-data-with-retrofit-2-http-client-for-android--cms-27845

public class ExerciseActivity extends AppCompatActivity {

    private TextView mResponseTv;
    private TrackerInterface mAPIService;
    private String TAG = "ExerciseActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Show the Up button in the action bar.
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        final EditText workoutEt = findViewById(R.id.et_workout);
        final EditText durationEt =  findViewById(R.id.et_duration);
        Button submitBtn = findViewById(R.id.btn_submit);
        mResponseTv = findViewById(R.id.tv_response);

        mAPIService = ApiUtils.getTrackerInterface();

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String workout = workoutEt.getText().toString().trim();
                String duration_min = durationEt.getText().toString().trim();
                if(!TextUtils.isEmpty(workout) && !TextUtils.isEmpty(duration_min)) {
                    sendPost(workout, duration_min);
                }
            }
        });
    }

    public void sendPost(String workout, String duration_min) {
        mAPIService.saveExercise(workout, duration_min).enqueue(new Callback<Exercise>() {
            @Override
            public void onResponse(Call<Exercise> call, Response<Exercise> response) {

                if(response.isSuccessful()) {
                    showResponse(response.body().toString());
                    Log.i(TAG, "post submitted to API." + response.body().toString());
                }
            }

            @Override
            public void onFailure(Call<Exercise> call, Throwable t) {
                Log.e(TAG, "Unable to submit post to API.");
            }
        });
    }

    public void showResponse(String response) {
        if(mResponseTv.getVisibility() == View.GONE) {
            mResponseTv.setVisibility(View.VISIBLE);
        }
        mResponseTv.setText(response);
    }

}