package models.getBrandedFoodByUpc;

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
    private String brandName;
    @SerializedName("serving_qty")
    @Expose
    private Double servingQty;
    @SerializedName("serving_unit")
    @Expose
    private String servingUnit;
    @SerializedName("serving_weight_grams")
    @Expose
    private Integer servingWeightGrams;
    @SerializedName("nf_calories")
    @Expose
    private Integer nfCalories;
    @SerializedName("nf_total_fat")
    @Expose
    private Object nfTotalFat;
    @SerializedName("nf_saturated_fat")
    @Expose
    private Object nfSaturatedFat;
    @SerializedName("nf_cholesterol")
    @Expose
    private Object nfCholesterol;
    @SerializedName("nf_sodium")
    @Expose
    private Integer nfSodium;
    @SerializedName("nf_total_carbohydrate")
    @Expose
    private Integer nfTotalCarbohydrate;
    @SerializedName("nf_dietary_fiber")
    @Expose
    private Integer nfDietaryFiber;
    @SerializedName("nf_sugars")
    @Expose
    private Double nfSugars;
    @SerializedName("nf_protein")
    @Expose
    private Integer nfProtein;
    @SerializedName("nf_potassium")
    @Expose
    private Integer nfPotassium;
    @SerializedName("nf_p")
    @Expose
    private Object nfP;
    @SerializedName("full_nutrients")
    @Expose
    private List<FullNutrient> fullNutrients = null;
    @SerializedName("nix_brand_name")
    @Expose
    private String nixBrandName;
    @SerializedName("nix_brand_id")
    @Expose
    private String nixBrandId;
    @SerializedName("nix_item_name")
    @Expose
    private String nixItemName;
    @SerializedName("nix_item_id")
    @Expose
    private String nixItemId;
    @SerializedName("metadata")
    @Expose
    private Metadata metadata;
    @SerializedName("source")
    @Expose
    private Integer source;
    @SerializedName("ndb_no")
    @Expose
    private Object ndbNo;
    @SerializedName("tags")
    @Expose
    private Object tags;
    @SerializedName("alt_measures")
    @Expose
    private Object altMeasures;
    @SerializedName("photo")
    @Expose
    private Photo photo;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("nf_ingredient_statement")
    @Expose
    private String nfIngredientStatement;
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
        this.brandName = ((String) in.readValue((String.class.getClassLoader())));
        this.servingQty = ((Double) in.readValue((Double.class.getClassLoader())));
        this.servingUnit = ((String) in.readValue((String.class.getClassLoader())));
        this.servingWeightGrams = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.nfCalories = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.nfTotalFat = ((Object) in.readValue((Object.class.getClassLoader())));
        this.nfSaturatedFat = ((Object) in.readValue((Object.class.getClassLoader())));
        this.nfCholesterol = ((Object) in.readValue((Object.class.getClassLoader())));
        this.nfSodium = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.nfTotalCarbohydrate = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.nfDietaryFiber = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.nfSugars = ((Double) in.readValue((Double.class.getClassLoader())));
        this.nfProtein = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.nfPotassium = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.nfP = ((Object) in.readValue((Object.class.getClassLoader())));
        in.readList(this.fullNutrients, (models.getBrandedFoodByUpc.FullNutrient.class.getClassLoader()));
        this.nixBrandName = ((String) in.readValue((String.class.getClassLoader())));
        this.nixBrandId = ((String) in.readValue((String.class.getClassLoader())));
        this.nixItemName = ((String) in.readValue((String.class.getClassLoader())));
        this.nixItemId = ((String) in.readValue((String.class.getClassLoader())));
        this.metadata = ((Metadata) in.readValue((Metadata.class.getClassLoader())));
        this.source = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.ndbNo = ((Object) in.readValue((Object.class.getClassLoader())));
        this.tags = ((Object) in.readValue((Object.class.getClassLoader())));
        this.altMeasures = ((Object) in.readValue((Object.class.getClassLoader())));
        this.photo = ((Photo) in.readValue((Photo.class.getClassLoader())));
        this.updatedAt = ((String) in.readValue((String.class.getClassLoader())));
        this.nfIngredientStatement = ((String) in.readValue((String.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     *
     */
    public Food() {
    }

    /**
     *
     * @param nfIngredientStatement
     * @param nfP
     * @param brandName
     * @param nfTotalCarbohydrate
     * @param nfTotalFat
     * @param nixItemId
     * @param servingWeightGrams
     * @param servingQty
     * @param nfPotassium
     * @param altMeasures
     * @param ndbNo
     * @param metadata
     * @param tags
     * @param nfDietaryFiber
     * @param nfSodium
     * @param photo
     * @param nfSugars
     * @param nfCholesterol
     * @param nfCalories
     * @param nixBrandId
     * @param updatedAt
     * @param fullNutrients
     * @param source
     * @param nixItemName
     * @param nixBrandName
     * @param servingUnit
     * @param nfSaturatedFat
     * @param foodName
     * @param nfProtein
     */
    public Food(String foodName, String brandName, Double servingQty, String servingUnit, Integer servingWeightGrams, Integer nfCalories, Object nfTotalFat, Object nfSaturatedFat, Object nfCholesterol, Integer nfSodium, Integer nfTotalCarbohydrate, Integer nfDietaryFiber, Double nfSugars, Integer nfProtein, Integer nfPotassium, Object nfP, List<FullNutrient> fullNutrients, String nixBrandName, String nixBrandId, String nixItemName, String nixItemId, Metadata metadata, Integer source, Object ndbNo, Object tags, Object altMeasures, Photo photo, String updatedAt, String nfIngredientStatement) {
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
        this.metadata = metadata;
        this.source = source;
        this.ndbNo = ndbNo;
        this.tags = tags;
        this.altMeasures = altMeasures;
        this.photo = photo;
        this.updatedAt = updatedAt;
        this.nfIngredientStatement = nfIngredientStatement;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Double getServingQty() {
        return servingQty;
    }

    public void setServingQty(Double servingQty) {
        this.servingQty = servingQty;
    }

    public String getServingUnit() {
        return servingUnit;
    }

    public void setServingUnit(String servingUnit) {
        this.servingUnit = servingUnit;
    }

    public Integer getServingWeightGrams() {
        return servingWeightGrams;
    }

    public void setServingWeightGrams(Integer servingWeightGrams) {
        this.servingWeightGrams = servingWeightGrams;
    }

    public Integer getNfCalories() {
        return nfCalories;
    }

    public void setNfCalories(Integer nfCalories) {
        this.nfCalories = nfCalories;
    }

    public Object getNfTotalFat() {
        return nfTotalFat;
    }

    public void setNfTotalFat(Object nfTotalFat) {
        this.nfTotalFat = nfTotalFat;
    }

    public Object getNfSaturatedFat() {
        return nfSaturatedFat;
    }

    public void setNfSaturatedFat(Object nfSaturatedFat) {
        this.nfSaturatedFat = nfSaturatedFat;
    }

    public Object getNfCholesterol() {
        return nfCholesterol;
    }

    public void setNfCholesterol(Object nfCholesterol) {
        this.nfCholesterol = nfCholesterol;
    }

    public Integer getNfSodium() {
        return nfSodium;
    }

    public void setNfSodium(Integer nfSodium) {
        this.nfSodium = nfSodium;
    }

    public Integer getNfTotalCarbohydrate() {
        return nfTotalCarbohydrate;
    }

    public void setNfTotalCarbohydrate(Integer nfTotalCarbohydrate) {
        this.nfTotalCarbohydrate = nfTotalCarbohydrate;
    }

    public Integer getNfDietaryFiber() {
        return nfDietaryFiber;
    }

    public void setNfDietaryFiber(Integer nfDietaryFiber) {
        this.nfDietaryFiber = nfDietaryFiber;
    }

    public Double getNfSugars() {
        return nfSugars;
    }

    public void setNfSugars(Double nfSugars) {
        this.nfSugars = nfSugars;
    }

    public Integer getNfProtein() {
        return nfProtein;
    }

    public void setNfProtein(Integer nfProtein) {
        this.nfProtein = nfProtein;
    }

    public Integer getNfPotassium() {
        return nfPotassium;
    }

    public void setNfPotassium(Integer nfPotassium) {
        this.nfPotassium = nfPotassium;
    }

    public Object getNfP() {
        return nfP;
    }

    public void setNfP(Object nfP) {
        this.nfP = nfP;
    }

    public List<FullNutrient> getFullNutrients() {
        return fullNutrients;
    }

    public void setFullNutrients(List<FullNutrient> fullNutrients) {
        this.fullNutrients = fullNutrients;
    }

    public String getNixBrandName() {
        return nixBrandName;
    }

    public void setNixBrandName(String nixBrandName) {
        this.nixBrandName = nixBrandName;
    }

    public String getNixBrandId() {
        return nixBrandId;
    }

    public void setNixBrandId(String nixBrandId) {
        this.nixBrandId = nixBrandId;
    }

    public String getNixItemName() {
        return nixItemName;
    }

    public void setNixItemName(String nixItemName) {
        this.nixItemName = nixItemName;
    }

    public String getNixItemId() {
        return nixItemId;
    }

    public void setNixItemId(String nixItemId) {
        this.nixItemId = nixItemId;
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

    public Object getNdbNo() {
        return ndbNo;
    }

    public void setNdbNo(Object ndbNo) {
        this.ndbNo = ndbNo;
    }

    public Object getTags() {
        return tags;
    }

    public void setTags(Object tags) {
        this.tags = tags;
    }

    public Object getAltMeasures() {
        return altMeasures;
    }

    public void setAltMeasures(Object altMeasures) {
        this.altMeasures = altMeasures;
    }

    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getNfIngredientStatement() {
        return nfIngredientStatement;
    }

    public void setNfIngredientStatement(String nfIngredientStatement) {
        this.nfIngredientStatement = nfIngredientStatement;
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
        dest.writeValue(metadata);
        dest.writeValue(source);
        dest.writeValue(ndbNo);
        dest.writeValue(tags);
        dest.writeValue(altMeasures);
        dest.writeValue(photo);
        dest.writeValue(updatedAt);
        dest.writeValue(nfIngredientStatement);
    }

    public int describeContents() {
        return 0;
    }

}
