package models.getCaloriesBurnedForExercises;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ExerciseRequest implements Serializable {



    public ExerciseRequest(Editable query) {
        query = query;
//        gender = gender;
//        weight_kg = weight_kg;
//        height_cm = height_cm;
//        age = age;
    }

    //    query - body, string
    //    gender - body, string
    //    weight_lb - body, double
    //    height_in - body double
    //    age - body double


    public String getQuery() {
            return query;
        }
        public void setQuery(String query) {
            this.query = query;
        }
        public String getGender() {
            return gender;
        }
        public void setGender(String gender) {
            this.gender = gender;
        }
        public Double getWeight_lb() {
            return weight_lb;
        }
        public void setWeight_lb(Double weight_lb) {
            this.weight_lb = weight_lb;
        }
        public Double getHeight_in() {
            return height_in;
        }
        public void setHeight_in(Double height_in) {
            this.height_in = height_in;
        }
        public Double getAge() {
            return age;
        }
        public void setAge(Double age) {
            this.age = age;
        }
        @SerializedName("query")
        @Expose
        private String query;
        @SerializedName("gender")
        @Expose
        private String gender;
        @SerializedName("weight_lb")
        @Expose
        private Double weight_lb;
        @SerializedName("height_in")
        @Expose
        private Double height_in;
        @SerializedName("age")
        @Expose
        private Double age;
        @Override
        public String toString() {
            return "ExerciseRequest{" +
                    ", query='" + query + '\'' +
                    ", gender='" + gender + '\'' +
                    ", weight_lb=" + weight_lb +
                    ", height_in=" + height_in +
                    ", age=" + age +
                    '}';
        }
//        public final static Parcelable.Creator<ExerciseRequest> CREATOR = new Parcelable.Creator<ExerciseRequest>() {
//            @SuppressWarnings({
//                    "unchecked"
//            })
//            public ExerciseRequest createFromParcel(Parcel in) {
//                return new ExerciseRequest(in);
//            }
//            public ExerciseRequest[] newArray(int size) {
//                return (new ExerciseRequest[size]);
//            }
//        };
//        public ExerciseRequest(String in) {
//            this.query = ((String) in.readValue((String.class.getClassLoader())));
//            this.gender = ((String) in.readValue((Integer.class.getClassLoader())));
//            this.weight_lb = ((Double) in.readValue((String.class.getClassLoader())));
//            this.height_in = ((Double) in.readValue((Integer.class.getClassLoader())));
//            this.age = ((Double) in.readValue((Double.class.getClassLoader())));
//        }
//        public static Parcelable.Creator<ExerciseRequest> getCREATOR() {
//            return CREATOR;
//        }
    }
