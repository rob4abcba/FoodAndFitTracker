package adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.raemacias.foodandfittracker.R;

import java.security.PublicKey;
import java.util.List;

import models.getCaloriesBurnedForExercises.Exercise;

public class ExerciseListAdapter extends ArrayAdapter<Exercise> {

    private Context mContext;
    private List<Exercise> mExercises;


    public ExerciseListAdapter(@NonNull Context mContext, List<Exercise> mExercises) {
        super(mContext, R.layout.activity_exercise, mExercises);
        this.mContext = mContext;
        this.mExercises = mExercises;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        convertView = layoutInflater.inflate(R.layout.activity_exercise, parent, false);

        Exercise exercise = mExercises.get(position);
        TextView tv_exercise = convertView.findViewById(R.id.tv_exercise);
        tv_exercise.setText(exercise.getName());
        TextView tv_calories_burned = convertView.findViewById(R.id.tv_calories_burned);
        tv_calories_burned.setText(String.valueOf(exercise.getNfCalories()));

        return convertView;
    }
}
