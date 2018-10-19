package models.searchFoods;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Common implements Parcelable
{

    @SerializedName("food_name")
    @Expose
    private String foodName;
    @SerializedName("serving_unit")
    @Expose
    private String servingUnit;
    @SerializedName("serving_qty")
    @Expose
    private Integer servingQty;
    @SerializedName("common_type")
    @Expose
    private Object commonType;
    @SerializedName("photo")
    @Expose
    private Photo_ photo;
    @SerializedName("tag_id")
    @Expose
    private String tagId;
    @SerializedName("locale")
    @Expose
    private String locale;
    public final static Parcelable.Creator<Common> CREATOR = new Creator<Common>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Common createFromParcel(Parcel in) {
            return new Common(in);
        }

        public Common[] newArray(int size) {
            return (new Common[size]);
        }

    }
            ;

    protected Common(Parcel in) {
        this.foodName = ((String) in.readValue((String.class.getClassLoader())));
        this.servingUnit = ((String) in.readValue((String.class.getClassLoader())));
        this.servingQty = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.commonType = ((Object) in.readValue((Object.class.getClassLoader())));
        this.photo = ((Photo_) in.readValue((Photo_.class.getClassLoader())));
        this.tagId = ((String) in.readValue((String.class.getClassLoader())));
        this.locale = ((String) in.readValue((String.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     *
     */
    public Common() {
    }

    /**
     *
     * @param servingQty
     * @param locale
     * @param servingUnit
     * @param commonType
     * @param tagId
     * @param photo
     * @param foodName
     */
    public Common(String foodName, String servingUnit, Integer servingQty, Object commonType, Photo_ photo, String tagId, String locale) {
        super();
        this.foodName = foodName;
        this.servingUnit = servingUnit;
        this.servingQty = servingQty;
        this.commonType = commonType;
        this.photo = photo;
        this.tagId = tagId;
        this.locale = locale;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getServingUnit() {
        return servingUnit;
    }

    public void setServingUnit(String servingUnit) {
        this.servingUnit = servingUnit;
    }

    public Integer getServingQty() {
        return servingQty;
    }

    public void setServingQty(Integer servingQty) {
        this.servingQty = servingQty;
    }

    public Object getCommonType() {
        return commonType;
    }

    public void setCommonType(Object commonType) {
        this.commonType = commonType;
    }

    public Photo_ getPhoto() {
        return photo;
    }

    public void setPhoto(Photo_ photo) {
        this.photo = photo;
    }

    public String getTagId() {
        return tagId;
    }

    public void setTagId(String tagId) {
        this.tagId = tagId;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(foodName);
        dest.writeValue(servingUnit);
        dest.writeValue(servingQty);
        dest.writeValue(commonType);
        dest.writeValue(photo);
        dest.writeValue(tagId);
        dest.writeValue(locale);
    }

    public int describeContents() {
        return 0;
    }

}