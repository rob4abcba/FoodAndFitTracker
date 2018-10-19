package models.getCaloriesBurnedForExercises;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Example implements Parcelable
{

    @SerializedName("exercises")
    @Expose
    private List<Exercise> exercises = null;
    public final static Parcelable.Creator<Example> CREATOR = new Creator<Example>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Example createFromParcel(Parcel in) {
            return new Example(in);
        }

        public Example[] newArray(int size) {
            return (new Example[size]);
        }

    }
            ;

    protected Example(Parcel in) {
        in.readList(this.exercises, (models.getCaloriesBurnedForExercises.Exercise.class.getClassLoader()));
    }

    /**
     * No args constructor for use in serialization
     *
     */
    public Example() {
    }

    /**
     *
     * @param exercises
     */
    public Example(List<Exercise> exercises) {
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
