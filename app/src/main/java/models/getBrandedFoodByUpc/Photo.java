package models.getBrandedFoodByUpc;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Photo implements Parcelable {

    @SerializedName("thumb")
    @Expose
    private String thumb;
    @SerializedName("highres")
    @Expose
    private Object highres;
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
        this.thumb = ((String) in.readValue((String.class.getClassLoader())));
        this.highres = ((Object) in.readValue((Object.class.getClassLoader())));
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
    public Photo(String thumb, Object highres, Boolean isUserUploaded) {
        super();
        this.thumb = thumb;
        this.highres = highres;
        this.isUserUploaded = isUserUploaded;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public Object getHighres() {
        return highres;
    }

    public void setHighres(Object highres) {
        this.highres = highres;
    }

    public Boolean getIsUserUploaded() {
        return isUserUploaded;
    }

    public void setIsUserUploaded(Boolean isUserUploaded) {
        this.isUserUploaded = isUserUploaded;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(thumb);
        dest.writeValue(highres);
        dest.writeValue(isUserUploaded);
    }

    public int describeContents() {
        return 0;
    }

}