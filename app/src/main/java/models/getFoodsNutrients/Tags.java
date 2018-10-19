package models.getFoodsNutrients;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Tags implements Parcelable
{

    @SerializedName("item")
    @Expose
    private String item;
    @SerializedName("measure")
    @Expose
    private Object measure;
    @SerializedName("quantity")
    @Expose
    private String quantity;
    @SerializedName("food_group")
    @Expose
    private Integer foodGroup;
    @SerializedName("tag_id")
    @Expose
    private Integer tagId;
    public final static Parcelable.Creator<Tags> CREATOR = new Creator<Tags>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Tags createFromParcel(Parcel in) {
            return new Tags(in);
        }

        public Tags[] newArray(int size) {
            return (new Tags[size]);
        }

    }
            ;

    protected Tags(Parcel in) {
        this.item = ((String) in.readValue((String.class.getClassLoader())));
        this.measure = ((Object) in.readValue((Object.class.getClassLoader())));
        this.quantity = ((String) in.readValue((String.class.getClassLoader())));
        this.foodGroup = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.tagId = ((Integer) in.readValue((Integer.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     *
     */
    public Tags() {
    }

    /**
     *
     * @param measure
     * @param item
     * @param foodGroup
     * @param quantity
     * @param tagId
     */
    public Tags(String item, Object measure, String quantity, Integer foodGroup, Integer tagId) {
        super();
        this.item = item;
        this.measure = measure;
        this.quantity = quantity;
        this.foodGroup = foodGroup;
        this.tagId = tagId;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Object getMeasure() {
        return measure;
    }

    public void setMeasure(Object measure) {
        this.measure = measure;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public Integer getFoodGroup() {
        return foodGroup;
    }

    public void setFoodGroup(Integer foodGroup) {
        this.foodGroup = foodGroup;
    }

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(item);
        dest.writeValue(measure);
        dest.writeValue(quantity);
        dest.writeValue(foodGroup);
        dest.writeValue(tagId);
    }

    public int describeContents() {
        return 0;
    }

}