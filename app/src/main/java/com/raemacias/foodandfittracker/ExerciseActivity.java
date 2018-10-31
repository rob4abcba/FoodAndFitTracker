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
import android.widget.Toast;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Map;

import models.getCaloriesBurnedForExercises.Exercise;
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

public class ExerciseActivity extends AppCompatActivity implements Callback<Exercise> {

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Show the Up button in the action bar.
//        ActionBar actionBar = getSupportActionBar();
//        if (actionBar != null) {
//            actionBar.setDisplayHomeAsUpEnabled(true);
//        }
//
//        final EditText queryET = findViewById(R.id.et_workout);
////        final EditText genderET =  findViewById(R.id.et_duration);
//        Button submitBtn = findViewById(R.id.btn_submit);
//        mResponseTv = findViewById(R.id.tv_response);
//
//        mAPIService = ApiUtils.getTrackerInterface();
//
//        submitBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String query = queryET.getText().toString().trim();
////                String gender = genderET.getText().toString().trim();
//                if(!TextUtils.isEmpty(query)) {
//                    sendPost(query);
//                }
//            }
//        });
//    }

//    public void sendPost(String query) {
//        mAPIService.getUser(query).enqueue(new Callback<ExerciseRequest>() {
//            @Override
//            public void onResponse(Call<ExerciseRequest> call, Response<ExerciseRequest> response) {
//
//                if(response.isSuccessful()) {
//                    showResponse(response.body().toString());
//                    Log.i(TAG, "post submitted to API." + response.body().toString());
//                }
//            }
//
//            @Override
//            public void onFailure(Call<ExerciseRequest> call, Throwable t) {
//                Log.e(TAG, "Unable to submit post to API.");
//            }
//        });
//    }
//
//    public void showResponse(String response) {
//        if(mResponseTv.getVisibility() == View.GONE) {
//            mResponseTv.setVisibility(View.VISIBLE);
//        }
//        mResponseTv.setText(response);
//    }
//
//}

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(TrackerInterface.BASE_URL)
                .addConverterFactory(ScalarsConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        TrackerInterface service = retrofit.create(TrackerInterface.class);

        Call<Exercise> call = service.getStringScalar(new ExerciseRequest(query, gender, weight_lb, height_in, age));

        call.enqueue(new Callback<Exercise>() {
            @Override
            public void onResponse(Call<Exercise> call, Response<Exercise> response) {
                //response.body() have your result fields and methods  (example you have to access error then try like this response.body().getError() )
                if (response.isSuccessful()) {
                    showResponse(response.body().toString());
//                    Log.i(TAG, "post submitted to API." + response.body().toString());
//
//
//                } else {
////                response.body() have your result fields and methods  (example you have to access error then try like this response.body().getError() )
                    String workout = response.body().getWorkout();
                    int tagId = response.body().getTagId();
                    String user_input = response.body().getUserInput();

                    int duration_min = response.body().getDurationMin();
                    Double met = response.body().getMet();
                    Double nf_calories = response.body().getNfCalories();
                    Photo photo = response.body().getPhoto();
                    int compendium_code = response.body().getCompendiumCode();
                    String name = response.body().getName();
                    Object description = response.body().getDescription();
                    Object benefits = response.body().getBenefits();

                }

            }

            @Override
            public void onFailure(Call<Exercise> call, Throwable t) {

            }


            public void showResponse(String response) {
                if (mResponseTv.getVisibility() == View.GONE) {
                    mResponseTv.setVisibility(View.VISIBLE);
                }
                mResponseTv.setText(response);
            }
        });
    }

    @Override
    public void onResponse(Call<Exercise> call, Response<Exercise> response) {

    }

    @Override
    public void onFailure(Call<Exercise> call, Throwable t) {

    }
}