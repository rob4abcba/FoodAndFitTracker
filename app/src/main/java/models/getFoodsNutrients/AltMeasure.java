package models.getFoodsNutrients;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AltMeasure implements Parcelable
{

    @SerializedName("serving_weight")
    @Expose
    private Integer servingWeight;
    @SerializedName("measure")
    @Expose
    private String measure;
    @SerializedName("seq")
    @Expose
    private Object seq;
    @SerializedName("qty")
    @Expose
    private Integer qty;
    public final static Parcelable.Creator<AltMeasure> CREATOR = new Creator<AltMeasure>() {


        @SuppressWarnings({
                "unchecked"
        })
        public AltMeasure createFromParcel(Parcel in) {
            return new AltMeasure(in);
        }

        public AltMeasure[] newArray(int size) {
            return (new AltMeasure[size]);
        }

    }
            ;

    protected AltMeasure(Parcel in) {
        this.servingWeight = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.measure = ((String) in.readValue((String.class.getClassLoader())));
        this.seq = ((Object) in.readValue((Object.class.getClassLoader())));
        this.qty = ((Integer) in.readValue((Integer.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     *
     */
    public AltMeasure() {
    }

    /**
     *
     * @param measure
     * @param seq
     * @param qty
     * @param servingWeight
     */
    public AltMeasure(Integer servingWeight, String measure, Object seq, Integer qty) {
        super();
        this.servingWeight = servingWeight;
        this.measure = measure;
        this.seq = seq;
        this.qty = qty;
    }

    public Integer getServingWeight() {
        return servingWeight;
    }

    public void setServingWeight(Integer servingWeight) {
        this.servingWeight = servingWeight;
    }

    public String getMeasure() {
        return measure;
    }

    public void setMeasure(String measure) {
        this.measure = measure;
    }

    public Object getSeq() {
        return seq;
    }

    public void setSeq(Object seq) {
        this.seq = seq;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(servingWeight);
        dest.writeValue(measure);
        dest.writeValue(seq);
        dest.writeValue(qty);
    }

    public int describeContents() {
        return 0;
    }

}