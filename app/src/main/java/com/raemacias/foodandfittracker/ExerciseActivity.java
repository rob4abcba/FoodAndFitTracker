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

import models.getCaloriesBurnedForExercises.ExerciseRequest;
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

        final EditText queryET = findViewById(R.id.et_workout);
//        final EditText genderET =  findViewById(R.id.et_duration);
        Button submitBtn = findViewById(R.id.btn_submit);
        mResponseTv = findViewById(R.id.tv_response);

        mAPIService = ApiUtils.getTrackerInterface();

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String query = queryET.getText().toString().trim();
//                String gender = genderET.getText().toString().trim();
                if(!TextUtils.isEmpty(query)) {
                    sendPost(query);
                }
            }
        });
    }

    public void sendPost(String query) {
        mAPIService.getQuery(query).enqueue(new Callback<ExerciseRequest>() {
            @Override
            public void onResponse(Call<ExerciseRequest> call, Response<ExerciseRequest> response) {

                if(response.isSuccessful()) {
                    showResponse(response.body().toString());
                    Log.i(TAG, "post submitted to API." + response.body().toString());
                }
            }

            @Override
            public void onFailure(Call<ExerciseRequest> call, Throwable t) {
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