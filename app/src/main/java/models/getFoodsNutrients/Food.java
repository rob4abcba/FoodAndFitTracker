package models.getFoodsNutrients;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Food implements Parcelable
{

    @SerializedName("food_name")
    @Expose
    private String foodName;
    @SerializedName("brand_name")
    @Expose
    private Object brandName;
    @SerializedName("serving_qty")
    @Expose
    private Integer servingQty;
    @SerializedName("serving_unit")
    @Expose
    private String servingUnit;
    @SerializedName("serving_weight_grams")
    @Expose
    private Double servingWeightGrams;
    @SerializedName("nf_calories")
    @Expose
    private Double nfCalories;
    @SerializedName("nf_total_fat")
    @Expose
    private Double nfTotalFat;
    @SerializedName("nf_saturated_fat")
    @Expose
    private Double nfSaturatedFat;
    @SerializedName("nf_cholesterol")
    @Expose
    private Double nfCholesterol;
    @SerializedName("nf_sodium")
    @Expose
    private Double nfSodium;
    @SerializedName("nf_total_carbohydrate")
    @Expose
    private Double nfTotalCarbohydrate;
    @SerializedName("nf_dietary_fiber")
    @Expose
    private Double nfDietaryFiber;
    @SerializedName("nf_sugars")
    @Expose
    private Double nfSugars;
    @SerializedName("nf_protein")
    @Expose
    private Double nfProtein;
    @SerializedName("nf_potassium")
    @Expose
    private Double nfPotassium;
    @SerializedName("nf_p")
    @Expose
    private Double nfP;
    @SerializedName("full_nutrients")
    @Expose
    private List<FullNutrient> fullNutrients = null;
    @SerializedName("nix_brand_name")
    @Expose
    private Object nixBrandName;
    @SerializedName("nix_brand_id")
    @Expose
    private Object nixBrandId;
    @SerializedName("nix_item_name")
    @Expose
    private Object nixItemName;
    @SerializedName("nix_item_id")
    @Expose
    private Object nixItemId;
    @SerializedName("upc")
    @Expose
    private Object upc;
    @SerializedName("consumed_at")
    @Expose
    private String consumedAt;
    @SerializedName("metadata")
    @Expose
    private Metadata metadata;
    @SerializedName("source")
    @Expose
    private Integer source;
    @SerializedName("ndb_no")
    @Expose
    private Integer ndbNo;
    @SerializedName("tags")
    @Expose
    private Tags tags;
    @SerializedName("alt_measures")
    @Expose
    private List<AltMeasure> altMeasures = null;
    @SerializedName("lat")
    @Expose
    private Object lat;
    @SerializedName("lng")
    @Expose
    private Object lng;
    @SerializedName("meal_type")
    @Expose
    private Integer mealType;
    @SerializedName("photo")
    @Expose
    private Photo photo;
    @SerializedName("sub_recipe")
    @Expose
    private Object subRecipe;
    public final static Parcelable.Creator<Food> CREATOR = new Creator<Food>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Food createFromParcel(Parcel in) {
            return new Food(in);
        }

        public Food[] newArray(int size) {
            return (new Food[size]);
        }

    }
            ;

    protected Food(Parcel in) {
        this.foodName = ((String) in.readValue((String.class.getClassLoader())));
        this.brandName = ((Object) in.readValue((Object.class.getClassLoader())));
        this.servingQty = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.servingUnit = ((String) in.readValue((String.class.getClassLoader())));
        this.servingWeightGrams = ((Double) in.readValue((Double.class.getClassLoader())));
        this.nfCalories = ((Double) in.readValue((Double.class.getClassLoader())));
        this.nfTotalFat = ((Double) in.readValue((Double.class.getClassLoader())));
        this.nfSaturatedFat = ((Double) in.readValue((Double.class.getClassLoader())));
        this.nfCholesterol = ((Double) in.readValue((Double.class.getClassLoader())));
        this.nfSodium = ((Double) in.readValue((Double.class.getClassLoader())));
        this.nfTotalCarbohydrate = ((Double) in.readValue((Double.class.getClassLoader())));
        this.nfDietaryFiber = ((Double) in.readValue((Double.class.getClassLoader())));
        this.nfSugars = ((Double) in.readValue((Double.class.getClassLoader())));
        this.nfProtein = ((Double) in.readValue((Double.class.getClassLoader())));
        this.nfPotassium = ((Double) in.readValue((Double.class.getClassLoader())));
        this.nfP = ((Double) in.readValue((Double.class.getClassLoader())));
        in.readList(this.fullNutrients, (models.getFoodsNutrients.FullNutrient.class.getClassLoader()));
        this.nixBrandName = ((Object) in.readValue((Object.class.getClassLoader())));
        this.nixBrandId = ((Object) in.readValue((Object.class.getClassLoader())));
        this.nixItemName = ((Object) in.readValue((Object.class.getClassLoader())));
        this.nixItemId = ((Object) in.readValue((Object.class.getClassLoader())));
        this.upc = ((Object) in.readValue((Object.class.getClassLoader())));
        this.consumedAt = ((String) in.readValue((String.class.getClassLoader())));
        this.metadata = ((Metadata) in.readValue((Metadata.class.getClassLoader())));
        this.source = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.ndbNo = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.tags = ((Tags) in.readValue((Tags.class.getClassLoader())));
        in.readList(this.altMeasures, (models.getFoodsNutrients.AltMeasure.class.getClassLoader()));
        this.lat = ((Object) in.readValue((Object.class.getClassLoader())));
        this.lng = ((Object) in.readValue((Object.class.getClassLoader())));
        this.mealType = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.photo = ((Photo) in.readValue((Photo.class.getClassLoader())));
        this.subRecipe = ((Object) in.readValue((Object.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     *
     */
    public Food() {
    }

    /**
     *
     * @param nfP
     * @param lng
     * @param brandName
     * @param nfTotalCarbohydrate
     * @param nfTotalFat
     * @param nixItemId
     * @param servingWeightGrams
     * @param servingQty
     * @param nfPotassium
     * @param consumedAt
     * @param altMeasures
     * @param ndbNo
     * @param lat
     * @param mealType
     * @param metadata
     * @param tags
     * @param nfDietaryFiber
     * @param nfSodium
     * @param photo
     * @param upc
     * @param nfSugars
     * @param nfCholesterol
     * @param nfCalories
     * @param nixBrandId
     * @param fullNutrients
     * @param source
     * @param nixItemName
     * @param nixBrandName
     * @param servingUnit
     * @param nfSaturatedFat
     * @param subRecipe
     * @param foodName
     * @param nfProtein
     */
    public Food(String foodName, Object brandName, Integer servingQty, String servingUnit, Double servingWeightGrams, Double nfCalories, Double nfTotalFat, Double nfSaturatedFat, Double nfCholesterol, Double nfSodium, Double nfTotalCarbohydrate, Double nfDietaryFiber, Double nfSugars, Double nfProtein, Double nfPotassium, Double nfP, List<FullNutrient> fullNutrients, Object nixBrandName, Object nixBrandId, Object nixItemName, Object nixItemId, Object upc, String consumedAt, Metadata metadata, Integer source, Integer ndbNo, Tags tags, List<AltMeasure> altMeasures, Object lat, Object lng, Integer mealType, Photo photo, Object subRecipe) {
        super();
        this.foodName = foodName;
        this.brandName = brandName;
        this.servingQty = servingQty;
        this.servingUnit = servingUnit;
        this.servingWeightGrams = servingWeightGrams;
        this.nfCalories = nfCalories;
        this.nfTotalFat = nfTotalFat;
        this.nfSaturatedFat = nfSaturatedFat;
        this.nfCholesterol = nfCholesterol;
        this.nfSodium = nfSodium;
        this.nfTotalCarbohydrate = nfTotalCarbohydrate;
        this.nfDietaryFiber = nfDietaryFiber;
        this.nfSugars = nfSugars;
        this.nfProtein = nfProtein;
        this.nfPotassium = nfPotassium;
        this.nfP = nfP;
        this.fullNutrients = fullNutrients;
        this.nixBrandName = nixBrandName;
        this.nixBrandId = nixBrandId;
        this.nixItemName = nixItemName;
        this.nixItemId = nixItemId;
        this.upc = upc;
        this.consumedAt = consumedAt;
        this.metadata = metadata;
        this.source = source;
        this.ndbNo = ndbNo;
        this.tags = tags;
        this.altMeasures = altMeasures;
        this.lat = lat;
        this.lng = lng;
        this.mealType = mealType;
        this.photo = photo;
        this.subRecipe = subRecipe;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public Object getBrandName() {
        return brandName;
    }

    public void setBrandName(Object brandName) {
        this.brandName = brandName;
    }

    public Integer getServingQty() {
        return servingQty;
    }

    public void setServingQty(Integer servingQty) {
        this.servingQty = servingQty;
    }

    public String getServingUnit() {
        return servingUnit;
    }

    public void setServingUnit(String servingUnit) {
        this.servingUnit = servingUnit;
    }

    public Double getServingWeightGrams() {
        return servingWeightGrams;
    }

    public void setServingWeightGrams(Double servingWeightGrams) {
        this.servingWeightGrams = servingWeightGrams;
    }

    public Double getNfCalories() {
        return nfCalories;
    }

    public void setNfCalories(Double nfCalories) {
        this.nfCalories = nfCalories;
    }

    public Double getNfTotalFat() {
        return nfTotalFat;
    }

    public void setNfTotalFat(Double nfTotalFat) {
        this.nfTotalFat = nfTotalFat;
    }

    public Double getNfSaturatedFat() {
        return nfSaturatedFat;
    }

    public void setNfSaturatedFat(Double nfSaturatedFat) {
        this.nfSaturatedFat = nfSaturatedFat;
    }

    public Double getNfCholesterol() {
        return nfCholesterol;
    }

    public void setNfCholesterol(Double nfCholesterol) {
        this.nfCholesterol = nfCholesterol;
    }

    public Double getNfSodium() {
        return nfSodium;
    }

    public void setNfSodium(Double nfSodium) {
        this.nfSodium = nfSodium;
    }

    public Double getNfTotalCarbohydrate() {
        return nfTotalCarbohydrate;
    }

    public void setNfTotalCarbohydrate(Double nfTotalCarbohydrate) {
        this.nfTotalCarbohydrate = nfTotalCarbohydrate;
    }

    public Double getNfDietaryFiber() {
        return nfDietaryFiber;
    }

    public void setNfDietaryFiber(Double nfDietaryFiber) {
        this.nfDietaryFiber = nfDietaryFiber;
    }

    public Double getNfSugars() {
        return nfSugars;
    }

    public void setNfSugars(Double nfSugars) {
        this.nfSugars = nfSugars;
    }

    public Double getNfProtein() {
        return nfProtein;
    }

    public void setNfProtein(Double nfProtein) {
        this.nfProtein = nfProtein;
    }

    public Double getNfPotassium() {
        return nfPotassium;
    }

    public void setNfPotassium(Double nfPotassium) {
        this.nfPotassium = nfPotassium;
    }

    public Double getNfP() {
        return nfP;
    }

    public void setNfP(Double nfP) {
        this.nfP = nfP;
    }

    public List<FullNutrient> getFullNutrients() {
        return fullNutrients;
    }

    public void setFullNutrients(List<FullNutrient> fullNutrients) {
        this.fullNutrients = fullNutrients;
    }

    public Object getNixBrandName() {
        return nixBrandName;
    }

    public void setNixBrandName(Object nixBrandName) {
        this.nixBrandName = nixBrandName;
    }

    public Object getNixBrandId() {
        return nixBrandId;
    }

    public void setNixBrandId(Object nixBrandId) {
        this.nixBrandId = nixBrandId;
    }

    public Object getNixItemName() {
        return nixItemName;
    }

    public void setNixItemName(Object nixItemName) {
        this.nixItemName = nixItemName;
    }

    public Object getNixItemId() {
        return nixItemId;
    }

    public void setNixItemId(Object nixItemId) {
        this.nixItemId = nixItemId;
    }

    public Object getUpc() {
        return upc;
    }

    public void setUpc(Object upc) {
        this.upc = upc;
    }

    public String getConsumedAt() {
        return consumedAt;
    }

    public void setConsumedAt(String consumedAt) {
        this.consumedAt = consumedAt;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public Integer getNdbNo() {
        return ndbNo;
    }

    public void setNdbNo(Integer ndbNo) {
        this.ndbNo = ndbNo;
    }

    public Tags getTags() {
        return tags;
    }

    public void setTags(Tags tags) {
        this.tags = tags;
    }

    public List<AltMeasure> getAltMeasures() {
        return altMeasures;
    }

    public void setAltMeasures(List<AltMeasure> altMeasures) {
        this.altMeasures = altMeasures;
    }

    public Object getLat() {
        return lat;
    }

    public void setLat(Object lat) {
        this.lat = lat;
    }

    public Object getLng() {
        return lng;
    }

    public void setLng(Object lng) {
        this.lng = lng;
    }

    public Integer getMealType() {
        return mealType;
    }

    public void setMealType(Integer mealType) {
        this.mealType = mealType;
    }

    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    public Object getSubRecipe() {
        return subRecipe;
    }

    public void setSubRecipe(Object subRecipe) {
        this.subRecipe = subRecipe;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(foodName);
        dest.writeValue(brandName);
        dest.writeValue(servingQty);
        dest.writeValue(servingUnit);
        dest.writeValue(servingWeightGrams);
        dest.writeValue(nfCalories);
        dest.writeValue(nfTotalFat);
        dest.writeValue(nfSaturatedFat);
        dest.writeValue(nfCholesterol);
        dest.writeValue(nfSodium);
        dest.writeValue(nfTotalCarbohydrate);
        dest.writeValue(nfDietaryFiber);
        dest.writeValue(nfSugars);
        dest.writeValue(nfProtein);
        dest.writeValue(nfPotassium);
        dest.writeValue(nfP);
        dest.writeList(fullNutrients);
        dest.writeValue(nixBrandName);
        dest.writeValue(nixBrandId);
        dest.writeValue(nixItemName);
        dest.writeValue(nixItemId);
        dest.writeValue(upc);
        dest.writeValue(consumedAt);
        dest.writeValue(metadata);
        dest.writeValue(source);
        dest.writeValue(ndbNo);
        dest.writeValue(tags);
        dest.writeList(altMeasures);
        dest.writeValue(lat);
        dest.writeValue(lng);
        dest.writeValue(mealType);
        dest.writeValue(photo);
        dest.writeValue(subRecipe);
    }

    public int describeContents() {
        return 0;
    }

}
