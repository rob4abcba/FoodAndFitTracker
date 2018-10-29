package com.raemacias.foodandfittracker;

import android.app.SearchManager;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

import adapters.ExerciseListAdapter;
import models.getCaloriesBurnedForExercises.Exercise;
import network.Retrofit;
import network.TrackerInterface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ExerciseActivity extends AppCompatActivity {

    private ListView listViewExercises;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        listViewExercises = findViewById(R.id.listViewExercises);

        // Show the Up button in the action bar.
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        final SearchView searchView = (SearchView) menu.findItem(R.id.searchView).getActionView();
        SearchManager searchManager = (SearchManager) getSystemService(SEARCH_SERVICE);
        searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
        searchView.setSubmitButtonEnabled(true);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                TrackerInterface trackerInterface = Retrofit.getClient().create(TrackerInterface.class);
                Call call = trackerInterface.getName(trackerInterface.API_KEY);
                call.enqueue(new Callback() {
                    @Override
                    public void onResponse(Call call, Response response) {
                        List<Exercise> exercises = (List<Exercise>) response.body();
                        ExerciseListAdapter exerciseListAdapter = new ExerciseListAdapter(getApplicationContext(), exercises);
                        listViewExercises.setAdapter(exerciseListAdapter);

                        
                    }

                    @Override
                    public void onFailure(Call call, Throwable t) {
                        Toast.makeText(ExerciseActivity.this, "Sorry, results not found.", Toast.LENGTH_SHORT).show();

                    }
                });

                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });

        return true;
    }
}
