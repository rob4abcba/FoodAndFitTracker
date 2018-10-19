package models.getBrandedFoodByUpc;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Example implements Parcelable
{

    @SerializedName("foods")
    @Expose
    private List<Food> foods = null;
    public final static Parcelable.Creator<Example> CREATOR = new Creator<Example>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Example createFromParcel(Parcel in) {
            return new Example(in);
        }

        public Example[] newArray(int size) {
            return (new Example[size]);
        }

    }
            ;

    protected Example(Parcel in) {
        in.readList(this.foods, (models.getBrandedFoodByUpc.Food.class.getClassLoader()));
    }

    /**
     * No args constructor for use in serialization
     *
     */
    public Example() {
    }

    /**
     *
     * @param foods
     */
    public Example(List<Food> foods) {
        super();
        this.foods = foods;
    }

    public List<Food> getFoods() {
        return foods;
    }

    public void setFoods(List<Food> foods) {
        this.foods = foods;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(foods);
    }

    public int describeContents() {
        return 0;
    }

}
