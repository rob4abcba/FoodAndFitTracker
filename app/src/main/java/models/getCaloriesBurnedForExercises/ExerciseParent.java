package models.getCaloriesBurnedForExercises;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ExerciseParent implements Parcelable
{

    @SerializedName("exercises")
    @Expose
    private List<Exercise> exercises = null;
    public final static Parcelable.Creator<ExerciseParent> CREATOR = new Creator<ExerciseParent>() {


        @SuppressWarnings({
                "unchecked"
        })
        public ExerciseParent createFromParcel(Parcel in) {
            return new ExerciseParent(in);
        }

        public ExerciseParent[] newArray(int size) {
            return (new ExerciseParent[size]);
        }

    }
            ;

    protected ExerciseParent(Parcel in) {
        in.readList(this.exercises, (models.getCaloriesBurnedForExercises.Exercise.class.getClassLoader()));
    }

    /**
     * No args constructor for use in serialization
     *
     */
    public ExerciseParent() {
    }

    /**
     *
     * @param exercises
     */
    public ExerciseParent(List<Exercise> exercises) {
        super();
        this.exercises = exercises;
    }

    public List<Exercise> getExercises() {
        return exercises;
    }

    public void setExercises(List<Exercise> exercises) {
        this.exercises = exercises;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(exercises);
    }

    public int describeContents() {
        return 0;
    }

}

