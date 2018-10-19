package models.searchFoods;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Example implements Parcelable
{

    @SerializedName("branded")
    @Expose
    private List<Branded> branded = null;
    @SerializedName("common")
    @Expose
    private List<Common> common = null;
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
        in.readList(this.branded, (models.searchFoods.Branded.class.getClassLoader()));
        in.readList(this.common, (models.searchFoods.Common.class.getClassLoader()));
    }

    /**
     * No args constructor for use in serialization
     *
     */
    public Example() {
    }

    /**
     *
     * @param branded
     * @param common
     */
    public Example(List<Branded> branded, List<Common> common) {
        super();
        this.branded = branded;
        this.common = common;
    }

    public List<Branded> getBranded() {
        return branded;
    }

    public void setBranded(List<Branded> branded) {
        this.branded = branded;
    }

    public List<Common> getCommon() {
        return common;
    }

    public void setCommon(List<Common> common) {
        this.common = common;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(branded);
        dest.writeList(common);
    }

    public int describeContents() {
        return 0;
    }

}