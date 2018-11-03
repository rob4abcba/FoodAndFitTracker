package models.getCaloriesBurnedForExercises;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Exercise implements Serializable {
    //This is the result of the query

    @SerializedName("exercises")
    @Expose
    private ExerciseRequest[] exercises;

    public ExerciseRequest[] getExercises() {
        return exercises;
    }

    @SerializedName("tag_id")
    private int tagId;
    @SerializedName("user_input")
    private String userInput;
    @SerializedName("duration_min")
    private float durationMin;
    @SerializedName("met")
    private float met;
    @SerializedName("nf_calories")
    private float nfCalories;
    @SerializedName("photo")
    private Photo photo;
    @SerializedName("compendium_code")
    private int compendiumCode;
    @SerializedName("name")
    private String name;
    @SerializedName("description")
    private String description;
    @SerializedName("benefits")
    private String benefits;
//    @SerializedName("")
//    private String workout;


    public Exercise() {

    }

    public int getTagId() {
        return tagId;
    }

    public void setTagId(int tagId) {
        this.tagId = tagId;
    }

    public String getUserInput() {
        return userInput;
    }

    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }

    public float getDurationMin() {
        return durationMin;
    }

    public void setDurationMin(float durationMin) {
        this.durationMin = durationMin;
    }

    public float getMet() {
        return met;
    }

    public void setMet(float met) {
        this.met = met;
    }

    public float getNfCalories() {
        return nfCalories;
    }

    public void setNfCalories(float nfCalories) {
        this.nfCalories = nfCalories;
    }

    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    public int getCompendiumCode() {
        return compendiumCode;
    }

    public void setCompendiumCode(int compendiumCode) {
        this.compendiumCode = compendiumCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }
}
