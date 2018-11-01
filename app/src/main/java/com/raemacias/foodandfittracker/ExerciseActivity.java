package com.raemacias.foodandfittracker;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import models.getCaloriesBurnedForExercises.Exercise;
import models.getCaloriesBurnedForExercises.ExerciseBase;
import models.getCaloriesBurnedForExercises.ExerciseRequest;
//import network.ApiUtils;
import models.getCaloriesBurnedForExercises.Photo;
import network.TrackerInterface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

//This was created from the tutorial at:
//https://code.tutsplus.com/tutorials/sending-data-with-retrofit-2-http-client-for-android--cms-27845

public class ExerciseActivity extends AppCompatActivity implements Callback<Exercise>, View.OnClickListener {

    private TextView mResponseTv;
    private TrackerInterface mAPIService;
    private String TAG = "ExerciseActivity";

    private int tagId;
    private String userInput;
    private int durationMin;
    private Double met;
    private Double nfCalories;
    private Photo photo;
    private int compendiumCode;
    private String name;
    private Object description;
    private Object benefits;
    private String workout;

    private String query;
    private String gender;
    private Double weight_lb;
    private Double height_in;
    private Double age;

    List<Exercise> results;

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
        Button submitBtn = findViewById(R.id.btn_submit);
        mResponseTv = findViewById(R.id.tv_response);
        submitBtn.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                loadJSON();
                String query = mResponseTv.getText().toString();
                Toast.makeText(ExerciseActivity.this, "Button clicked", Toast.LENGTH_SHORT).show();


            }
        });
    }

        private void loadJSON() {
        results = new ArrayList<>();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(TrackerInterface.BASE_URL)
                .addConverterFactory(ScalarsConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        TrackerInterface trackerInterface = retrofit.create(TrackerInterface.class);

        Call<ExerciseBase> call = trackerInterface.getStringScalar(new ExerciseRequest(query));

        call.enqueue(new Callback<ExerciseBase>() {
            @Override
            public void onResponse(Call<ExerciseBase> call, Response<ExerciseBase> response) {

                if (response.body() != null) {

                    List<List<Exercise>> results = Arrays.asList(response.body().getExercises());
                    showResponse(response.body().toString());
                    Log.i (TAG, "post submitted to API" + response.body().toString());


                    String[] exercises = new String[results.size()];

                    for (int i = 0; i < results.size(); i++) {
                        exercises[i] = String.valueOf(results.get(i));
                    }

                    for (List<Exercise> h : results) {
                        Log.i("TANNER", new Gson().toJson(response.body()));

//                    just to debug the return object as a string so I can see if data gets set
//                    also some useful things

                        Log.i("TANNER", call.request().url().toString());
                        Log.i("TANNER", call.request().headers().toString());
                        try {
                            Log.i("TANNER", response.errorBody().string());
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                    }


//                    int tagId = response.body().getTagId();
//                    String user_input = response.body().getUserInput();
//
//                    int duration_min = response.body().getDurationMin();
//                    Double met = response.body().getMet();
//                    Double nf_calories = response.body().getNfCalories();
//                    Photo photo = response.body().getPhoto();
//                    int compendium_code = response.body().getCompendiumCode();
//                    String name = response.body().getName();
//                    Object description = response.body().getDescription();
//                    Object benefits = response.body().getBenefits();
////                    String workout = response.body().getWorkout();
                }
            }

            @Override
            public void onFailure(Call<ExerciseBase> call, Throwable t) {

            }


        });
    }
        public void showResponse(String response) {
        if(mResponseTv.getVisibility() == View.GONE) {
            mResponseTv.setVisibility(View.VISIBLE);
        }
        mResponseTv.setText(response);
    }

    @Override
    public void onResponse(Call<Exercise> call, Response<Exercise> response) {

    }

    @Override
    public void onFailure(Call<Exercise> call, Throwable t) {

    }

    @Override
    public void onClick(View v) {
        String query = mResponseTv.getText().toString();
        Toast.makeText(ExerciseActivity.this, "Button clicked", Toast.LENGTH_SHORT).show();

    }
}


