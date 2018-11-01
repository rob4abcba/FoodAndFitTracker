package models.getCaloriesBurnedForExercises;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ExerciseRequest {

    private final String mQuery;
    private final String mGender;
    private final Double mWeight_lb;
    private final Double mHeight_in;
    private final Double mAge;
    private String query;
    private String gender;
    private Double weight_lb;
    private Double height_in;
    private Double age;

    public ExerciseRequest(String query) {
        mQuery = query;
        mGender = gender;
        mWeight_lb = weight_lb;
        mHeight_in = height_in;
        mAge = age;
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
}

