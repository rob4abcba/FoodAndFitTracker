package models.getFoodsNutrients;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FullNutrient implements Parcelable
{

    @SerializedName("attr_id")
    @Expose
    private Integer attrId;
    @SerializedName("value")
    @Expose
    private Double value;
    public final static Parcelable.Creator<FullNutrient> CREATOR = new Creator<FullNutrient>() {


        @SuppressWarnings({
                "unchecked"
        })
        public FullNutrient createFromParcel(Parcel in) {
            return new FullNutrient(in);
        }

        public FullNutrient[] newArray(int size) {
            return (new FullNutrient[size]);
        }

    }
            ;

    protected FullNutrient(Parcel in) {
        this.attrId = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.value = ((Double) in.readValue((Double.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     *
     */
    public FullNutrient() {
    }

    /**
     *
     * @param attrId
     * @param value
     */
    public FullNutrient(Integer attrId, Double value) {
        super();
        this.attrId = attrId;
        this.value = value;
    }

    public Integer getAttrId() {
        return attrId;
    }

    public void setAttrId(Integer attrId) {
        this.attrId = attrId;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(attrId);
        dest.writeValue(value);
    }

    public int describeContents() {
        return 0;
    }

}
