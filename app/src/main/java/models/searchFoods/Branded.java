package models.searchFoods;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Branded implements Parcelable
{

    @SerializedName("food_name")
    @Expose
    private String foodName;
    @SerializedName("serving_unit")
    @Expose
    private String servingUnit;
    @SerializedName("nix_brand_id")
    @Expose
    private String nixBrandId;
    @SerializedName("brand_name_item_name")
    @Expose
    private String brandNameItemName;
    @SerializedName("serving_qty")
    @Expose
    private Integer servingQty;
    @SerializedName("nf_calories")
    @Expose
    private Integer nfCalories;
    @SerializedName("photo")
    @Expose
    private Photo photo;
    @SerializedName("brand_name")
    @Expose
    private String brandName;
    @SerializedName("region")
    @Expose
    private Integer region;
    @SerializedName("brand_type")
    @Expose
    private Integer brandType;
    @SerializedName("nix_item_id")
    @Expose
    private String nixItemId;
    @SerializedName("locale")
    @Expose
    private String locale;
    public final static Parcelable.Creator<Branded> CREATOR = new Creator<Branded>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Branded createFromParcel(Parcel in) {
            return new Branded(in);
        }

        public Branded[] newArray(int size) {
            return (new Branded[size]);
        }

    }
            ;

    protected Branded(Parcel in) {
        this.foodName = ((String) in.readValue((String.class.getClassLoader())));
        this.servingUnit = ((String) in.readValue((String.class.getClassLoader())));
        this.nixBrandId = ((String) in.readValue((String.class.getClassLoader())));
        this.brandNameItemName = ((String) in.readValue((String.class.getClassLoader())));
        this.servingQty = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.nfCalories = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.photo = ((Photo) in.readValue((Photo.class.getClassLoader())));
        this.brandName = ((String) in.readValue((String.class.getClassLoader())));
        this.region = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.brandType = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.nixItemId = ((String) in.readValue((String.class.getClassLoader())));
        this.locale = ((String) in.readValue((String.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     *
     */
    public Branded() {
    }

    /**
     *
     * @param region
     * @param servingQty
     * @param brandNameItemName
     * @param locale
     * @param brandType
     * @param servingUnit
     * @param brandName
     * @param photo
     * @param foodName
     * @param nixItemId
     * @param nfCalories
     * @param nixBrandId
     */
    public Branded(String foodName, String servingUnit, String nixBrandId, String brandNameItemName, Integer servingQty, Integer nfCalories, Photo photo, String brandName, Integer region, Integer brandType, String nixItemId, String locale) {
        super();
        this.foodName = foodName;
        this.servingUnit = servingUnit;
        this.nixBrandId = nixBrandId;
        this.brandNameItemName = brandNameItemName;
        this.servingQty = servingQty;
        this.nfCalories = nfCalories;
        this.photo = photo;
        this.brandName = brandName;
        this.region = region;
        this.brandType = brandType;
        this.nixItemId = nixItemId;
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

    public String getNixBrandId() {
        return nixBrandId;
    }

    public void setNixBrandId(String nixBrandId) {
        this.nixBrandId = nixBrandId;
    }

    public String getBrandNameItemName() {
        return brandNameItemName;
    }

    public void setBrandNameItemName(String brandNameItemName) {
        this.brandNameItemName = brandNameItemName;
    }

    public Integer getServingQty() {
        return servingQty;
    }

    public void setServingQty(Integer servingQty) {
        this.servingQty = servingQty;
    }

    public Integer getNfCalories() {
        return nfCalories;
    }

    public void setNfCalories(Integer nfCalories) {
        this.nfCalories = nfCalories;
    }

    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Integer getRegion() {
        return region;
    }

    public void setRegion(Integer region) {
        this.region = region;
    }

    public Integer getBrandType() {
        return brandType;
    }

    public void setBrandType(Integer brandType) {
        this.brandType = brandType;
    }

    public String getNixItemId() {
        return nixItemId;
    }

    public void setNixItemId(String nixItemId) {
        this.nixItemId = nixItemId;
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
        dest.writeValue(nixBrandId);
        dest.writeValue(brandNameItemName);
        dest.writeValue(servingQty);
        dest.writeValue(nfCalories);
        dest.writeValue(photo);
        dest.writeValue(brandName);
        dest.writeValue(region);
        dest.writeValue(brandType);
        dest.writeValue(nixItemId);
        dest.writeValue(locale);
    }

    public int describeContents() {
        return 0;
    }

}