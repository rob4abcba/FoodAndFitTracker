package models.getCaloriesBurnedForExercises;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Exercise implements Serializable
{

    @SerializedName("tag_id")
    @Expose
    private Integer tagId;
    @SerializedName("user_input")
    @Expose
    private String userInput;
    @SerializedName("duration_min")
    @Expose
    private Integer durationMin;
    @SerializedName("met")
    @Expose
    private Double met;
    @SerializedName("nf_calories")
    @Expose
    private Double nfCalories;
    @SerializedName("photo")
    @Expose
    private Photo photo;
    @SerializedName("compendium_code")
    @Expose
    private Integer compendiumCode;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("description")
    @Expose
    private Object description;
    @SerializedName("benefits")
    @Expose
    private Object benefits;
    public final static Parcelable.Creator<Exercise> CREATOR = new Parcelable.Creator<Exercise>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Exercise createFromParcel(Parcel in) {
            return new Exercise(in);
        }

        public Exercise[] newArray(int size) {
            return (new Exercise[size]);
        }

    }
            ;

    protected Exercise(Parcel in) {
        this.tagId = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.userInput = ((String) in.readValue((String.class.getClassLoader())));
        this.durationMin = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.met = ((Double) in.readValue((Double.class.getClassLoader())));
        this.nfCalories = ((Double) in.readValue((Double.class.getClassLoader())));
        this.photo = ((Photo) in.readValue((Photo.class.getClassLoader())));
        this.compendiumCode = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this.description = ((Object) in.readValue((Object.class.getClassLoader())));
        this.benefits = ((Object) in.readValue((Object.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     *
     */
    public Exercise() {
    }

    /**
     *
     * @param met
     * @param compendiumCode
     * @param description
     * @param userInput
     * @param name
     * @param durationMin
     * @param benefits
     * @param photo
     * @param tagId
     * @param nfCalories
     */
    public Exercise(Integer tagId, String userInput, Integer durationMin, Double met, Double nfCalories, Photo photo, Integer compendiumCode, String name, Object description, Object benefits) {
        super();
        this.tagId = tagId;
        this.userInput = userInput;
        this.durationMin = durationMin;
        this.met = met;
        this.nfCalories = nfCalories;
        this.photo = photo;
        this.compendiumCode = compendiumCode;
        this.name = name;
        this.description = description;
        this.benefits = benefits;
    }

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    public String getUserInput() {
        return userInput;
    }

    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }

    public Integer getDurationMin() {
        return durationMin;
    }

    public void setDurationMin(Integer durationMin) {
        this.durationMin = durationMin;
    }

    public Double getMet() {
        return met;
    }

    public void setMet(Double met) {
        this.met = met;
    }

    public Double getNfCalories() {
        return nfCalories;
    }

    public void setNfCalories(Double nfCalories) {
        this.nfCalories = nfCalories;
    }

    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    public Integer getCompendiumCode() {
        return compendiumCode;
    }

    public void setCompendiumCode(Integer compendiumCode) {
        this.compendiumCode = compendiumCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getDescription() {
        return description;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public Object getBenefits() {
        return benefits;
    }

    public void setBenefits(Object benefits) {
        this.benefits = benefits;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(tagId);
        dest.writeValue(userInput);
        dest.writeValue(durationMin);
        dest.writeValue(met);
        dest.writeValue(nfCalories);
        dest.writeValue(photo);
        dest.writeValue(compendiumCode);
        dest.writeValue(name);
        dest.writeValue(description);
        dest.writeValue(benefits);
    }

    public int describeContents() {
        return 0;
    }

}
