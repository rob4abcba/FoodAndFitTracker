package models.searchFoods;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Photo_ implements Parcelable
{

    @SerializedName("thumb")
    @Expose
    private Object thumb;
    public final static Parcelable.Creator<Photo_> CREATOR = new Creator<Photo_>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Photo_ createFromParcel(Parcel in) {
            return new Photo_(in);
        }

        public Photo_[] newArray(int size) {
            return (new Photo_[size]);
        }

    }
            ;

    protected Photo_(Parcel in) {
        this.thumb = ((Object) in.readValue((Object.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     *
     */
    public Photo_() {
    }

    /**
     *
     * @param thumb
     */
    public Photo_(Object thumb) {
        super();
        this.thumb = thumb;
    }

    public Object getThumb() {
        return thumb;
    }

    public void setThumb(Object thumb) {
        this.thumb = thumb;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(thumb);
    }

    public int describeContents() {
        return 0;
    }

}