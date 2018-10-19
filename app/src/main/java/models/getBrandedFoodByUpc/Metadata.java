package models.getBrandedFoodByUpc;

import android.os.Parcel;
import android.os.Parcelable;

public class Metadata implements Parcelable
{

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
    }

    public void writeToParcel(Parcel dest, int flags) {
    }

    public int describeContents() {
        return 0;
    }

}
