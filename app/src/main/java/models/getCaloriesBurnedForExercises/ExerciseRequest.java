package models.getCaloriesBurnedForExercises;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class ExerciseRequest implements Serializable {

    private List<Exercise> exercises;

    public ExerciseRequest() {

    }
    public ExerciseRequest(List<Exercise> exercises) {

        this.exercises = exercises;
    }
    public List<Exercise> getExercises() {

        return exercises;
    }
    public void setExercises(List<Exercise> exercises) {

        this.exercises = exercises;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Double getWeight_lb() {
        return weight_lb;
    }

    public void setWeight_lb(Double weight_lb) {
        this.weight_lb = weight_lb;
    }

    public Double getHeight_in() {
        return height_in;
    }

    public void setHeight_in(Double height_in) {
        this.height_in = height_in;
    }

    public Double getAge() {
        return age;
    }

    public void setAge(Double age) {
        this.age = age;
    }

    @SerializedName("query")
    @Expose
    private String query;
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("weight_lb")
    @Expose
    private Double weight_lb;
    @SerializedName("height_in")
    @Expose
    private Double height_in;
    @SerializedName("age")
    @Expose
    private Double age;

    @Override
    public String toString() {
        return "ExerciseRequest{" +
                ", query='" + query + '\'' +
                ", gender='" + gender + '\'' +
                ", weight_lb=" + weight_lb +
                ", height_in=" + height_in +
                ", age=" + age +
                '}';
    }

    public ExerciseRequest(String query) {
        this.query = query;
    }
}
