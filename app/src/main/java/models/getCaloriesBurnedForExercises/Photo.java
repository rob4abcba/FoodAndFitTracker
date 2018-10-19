package models.getCaloriesBurnedForExercises;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Photo implements Parcelable
{

    @SerializedName("highres")
    @Expose
    private String highres;
    @SerializedName("thumb")
    @Expose
    private String thumb;
    @SerializedName("is_user_uploaded")
    @Expose
    private Boolean isUserUploaded;
    public final static Parcelable.Creator<Photo> CREATOR = new Creator<Photo>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Photo createFromParcel(Parcel in) {
            return new Photo(in);
        }

        public Photo[] newArray(int size) {
            return (new Photo[size]);
        }

    }
            ;

    protected Photo(Parcel in) {
        this.highres = ((String) in.readValue((String.class.getClassLoader())));
        this.thumb = ((String) in.readValue((String.class.getClassLoader())));
        this.isUserUploaded = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     *
     */
    public Photo() {
    }

    /**
     *
     * @param highres
     * @param isUserUploaded
     * @param thumb
     */
    public Photo(String highres, String thumb, Boolean isUserUploaded) {
        super();
        this.highres = highres;
        this.thumb = thumb;
        this.isUserUploaded = isUserUploaded;
    }

    public String getHighres() {
        return highres;
    }

    public void setHighres(String highres) {
        this.highres = highres;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public Boolean getIsUserUploaded() {
        return isUserUploaded;
    }

    public void setIsUserUploaded(Boolean isUserUploaded) {
        this.isUserUploaded = isUserUploaded;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(highres);
        dest.writeValue(thumb);
        dest.writeValue(isUserUploaded);
    }

    public int describeContents() {
        return 0;
    }

}