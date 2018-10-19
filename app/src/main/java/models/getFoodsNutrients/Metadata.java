package models.getFoodsNutrients;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Metadata implements Parcelable
{

    @SerializedName("is_raw_food")
    @Expose
    private Boolean isRawFood;
    public final static Parcelable.Creator<Metadata> CREATOR = new Creator<Metadata>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Metadata createFromParcel(Parcel in) {
            return new Metadata(in);
        }

        public Metadata[] newArray(int size) {
            return (new Metadata[size]);
        }

    }
            ;

    protected Metadata(Parcel in) {
        this.isRawFood = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     *
     */
    public Metadata() {
    }

    /**
     *
     * @param isRawFood
     */
    public Metadata(Boolean isRawFood) {
        super();
        this.isRawFood = isRawFood;
    }

    public Boolean getIsRawFood() {
        return isRawFood;
    }

    public void setIsRawFood(Boolean isRawFood) {
        this.isRawFood = isRawFood;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(isRawFood);
    }

    public int describeContents() {
        return 0;
    }

}

