//package models;
//
//import android.os.Parcel;
//import android.os.Parcelable;
//
//import java.io.Serializable;
//
//public class Workout implements Serializable, Parcelable {
//
//
//    @Override
//    public int describeContents() {
//        return 0;
//    }
//
//    @Override
//    public void writeToParcel(Parcel dest, int flags) {
//
////    }import java.io.Serializable;
////import java.util.HashMap;
////import java.util.Map;
////import android.os.Parcel;
////import android.os.Parcelable;
////import android.os.Parcelable.Creator;
////import com.fasterxml.jackson.annotation.JsonAnyGetter;
////import com.fasterxml.jackson.annotation.JsonAnySetter;
////import com.fasterxml.jackson.annotation.JsonIgnore;
////import com.fasterxml.jackson.annotation.JsonInclude;
////import com.fasterxml.jackson.annotation.JsonProperty;
////import com.fasterxml.jackson.annotation.JsonPropertyOrder;
////
////    @JsonInclude(JsonInclude.Include.NON_NULL)
////    @JsonPropertyOrder({
////            "workout",
////            "workoutsession",
////            "schedulestep",
////            "schedule",
////            "day",
////            "set",
////            "setting",
////            "workoutlog",
////            "userprofile",
////            "language",
////            "daysofweek",
////            "license",
////            "setting-repetitionunit",
////            "setting-weightunit",
////            "exerciseinfo",
////            "exercise",
////            "equipment",
////            "exercisecategory",
////            "exerciseimage",
////            "exercisecomment",
////            "muscle",
////            "ingredient",
////            "weightunit",
////            "ingredientweightunit",
////            "nutritionplan",
////            "meal",
////            "mealitem",
////            "weightentry"
////    })
//
//        @JsonProperty("workout")
//        private String workout;
//        @JsonProperty("workoutsession")
//        private String workoutsession;
//        @JsonProperty("schedulestep")
//        private String schedulestep;
//        @JsonProperty("schedule")
//        private String schedule;
//        @JsonProperty("day")
//        private String day;
//        @JsonProperty("set")
//        private String set;
//        @JsonProperty("setting")
//        private String setting;
//        @JsonProperty("workoutlog")
//        private String workoutlog;
//        @JsonProperty("userprofile")
//        private String userprofile;
//        @JsonProperty("language")
//        private String language;
//        @JsonProperty("daysofweek")
//        private String daysofweek;
//        @JsonProperty("license")
//        private String license;
//        @JsonProperty("setting-repetitionunit")
//        private String settingRepetitionunit;
//        @JsonProperty("setting-weightunit")
//        private String settingWeightunit;
//        @JsonProperty("exerciseinfo")
//        private String exerciseinfo;
//        @JsonProperty("exercise")
//        private String exercise;
//        @JsonProperty("equipment")
//        private String equipment;
//        @JsonProperty("exercisecategory")
//        private String exercisecategory;
//        @JsonProperty("exerciseimage")
//        private String exerciseimage;
//        @JsonProperty("exercisecomment")
//        private String exercisecomment;
//        @JsonProperty("muscle")
//        private String muscle;
//        @JsonProperty("ingredient")
//        private String ingredient;
//        @JsonProperty("weightunit")
//        private String weightunit;
//        @JsonProperty("ingredientweightunit")
//        private String ingredientweightunit;
//        @JsonProperty("nutritionplan")
//        private String nutritionplan;
//        @JsonProperty("meal")
//        private String meal;
//        @JsonProperty("mealitem")
//        private String mealitem;
//        @JsonProperty("weightentry")
//        private String weightentry;
//        @JsonIgnore
//        private Map<String, Object> additionalProperties = new HashMap<String, Object>();
//        public final static Parcelable.Creator<Example> CREATOR = new Creator<Example>() {
//
//
//            @SuppressWarnings({
//                    "unchecked"
//            })
//            public Example createFromParcel(Parcel in) {
//                return new Example(in);
//            }
//
//            public Example[] newArray(int size) {
//                return (new Example[size]);
//            }
//
//        }
//                ;
//        private final static long serialVersionUID = 6013885234991534954L;
//
//        protected Example(Parcel in) {
//            this.workout = ((String) in.readValue((String.class.getClassLoader())));
//            this.workoutsession = ((String) in.readValue((String.class.getClassLoader())));
//            this.schedulestep = ((String) in.readValue((String.class.getClassLoader())));
//            this.schedule = ((String) in.readValue((String.class.getClassLoader())));
//            this.day = ((String) in.readValue((String.class.getClassLoader())));
//            this.set = ((String) in.readValue((String.class.getClassLoader())));
//            this.setting = ((String) in.readValue((String.class.getClassLoader())));
//            this.workoutlog = ((String) in.readValue((String.class.getClassLoader())));
//            this.userprofile = ((String) in.readValue((String.class.getClassLoader())));
//            this.language = ((String) in.readValue((String.class.getClassLoader())));
//            this.daysofweek = ((String) in.readValue((String.class.getClassLoader())));
//            this.license = ((String) in.readValue((String.class.getClassLoader())));
//            this.settingRepetitionunit = ((String) in.readValue((String.class.getClassLoader())));
//            this.settingWeightunit = ((String) in.readValue((String.class.getClassLoader())));
//            this.exerciseinfo = ((String) in.readValue((String.class.getClassLoader())));
//            this.exercise = ((String) in.readValue((String.class.getClassLoader())));
//            this.equipment = ((String) in.readValue((String.class.getClassLoader())));
//            this.exercisecategory = ((String) in.readValue((String.class.getClassLoader())));
//            this.exerciseimage = ((String) in.readValue((String.class.getClassLoader())));
//            this.exercisecomment = ((String) in.readValue((String.class.getClassLoader())));
//            this.muscle = ((String) in.readValue((String.class.getClassLoader())));
//            this.ingredient = ((String) in.readValue((String.class.getClassLoader())));
//            this.weightunit = ((String) in.readValue((String.class.getClassLoader())));
//            this.ingredientweightunit = ((String) in.readValue((String.class.getClassLoader())));
//            this.nutritionplan = ((String) in.readValue((String.class.getClassLoader())));
//            this.meal = ((String) in.readValue((String.class.getClassLoader())));
//            this.mealitem = ((String) in.readValue((String.class.getClassLoader())));
//            this.weightentry = ((String) in.readValue((String.class.getClassLoader())));
//            this.additionalProperties = ((Map<String, Object> ) in.readValue((Map.class.getClassLoader())));
//        }
//
//        public Example() {
//        }
//
//        @JsonProperty("workout")
//        public String getWorkout() {
//            return workout;
//        }
//
//        @JsonProperty("workout")
//        public void setWorkout(String workout) {
//            this.workout = workout;
//        }
//
//        @JsonProperty("workoutsession")
//        public String getWorkoutsession() {
//            return workoutsession;
//        }
//
//        @JsonProperty("workoutsession")
//        public void setWorkoutsession(String workoutsession) {
//            this.workoutsession = workoutsession;
//        }
//
//        @JsonProperty("schedulestep")
//        public String getSchedulestep() {
//            return schedulestep;
//        }
//
//        @JsonProperty("schedulestep")
//        public void setSchedulestep(String schedulestep) {
//            this.schedulestep = schedulestep;
//        }
//
//        @JsonProperty("schedule")
//        public String getSchedule() {
//            return schedule;
//        }
//
//        @JsonProperty("schedule")
//        public void setSchedule(String schedule) {
//            this.schedule = schedule;
//        }
//
//        @JsonProperty("day")
//        public String getDay() {
//            return day;
//        }
//
//        @JsonProperty("day")
//        public void setDay(String day) {
//            this.day = day;
//        }
//
//        @JsonProperty("set")
//        public String getSet() {
//            return set;
//        }
//
//        @JsonProperty("set")
//        public void setSet(String set) {
//            this.set = set;
//        }
//
//        @JsonProperty("setting")
//        public String getSetting() {
//            return setting;
//        }
//
//        @JsonProperty("setting")
//        public void setSetting(String setting) {
//            this.setting = setting;
//        }
//
//        @JsonProperty("workoutlog")
//        public String getWorkoutlog() {
//            return workoutlog;
//        }
//
//        @JsonProperty("workoutlog")
//        public void setWorkoutlog(String workoutlog) {
//            this.workoutlog = workoutlog;
//        }
//
//        @JsonProperty("userprofile")
//        public String getUserprofile() {
//            return userprofile;
//        }
//
//        @JsonProperty("userprofile")
//        public void setUserprofile(String userprofile) {
//            this.userprofile = userprofile;
//        }
//
//        @JsonProperty("language")
//        public String getLanguage() {
//            return language;
//        }
//
//        @JsonProperty("language")
//        public void setLanguage(String language) {
//            this.language = language;
//        }
//
//        @JsonProperty("daysofweek")
//        public String getDaysofweek() {
//            return daysofweek;
//        }
//
//        @JsonProperty("daysofweek")
//        public void setDaysofweek(String daysofweek) {
//            this.daysofweek = daysofweek;
//        }
//
//        @JsonProperty("license")
//        public String getLicense() {
//            return license;
//        }
//
//        @JsonProperty("license")
//        public void setLicense(String license) {
//            this.license = license;
//        }
//
//        @JsonProperty("setting-repetitionunit")
//        public String getSettingRepetitionunit() {
//            return settingRepetitionunit;
//        }
//
//        @JsonProperty("setting-repetitionunit")
//        public void setSettingRepetitionunit(String settingRepetitionunit) {
//            this.settingRepetitionunit = settingRepetitionunit;
//        }
//
//        @JsonProperty("setting-weightunit")
//        public String getSettingWeightunit() {
//            return settingWeightunit;
//        }
//
//        @JsonProperty("setting-weightunit")
//        public void setSettingWeightunit(String settingWeightunit) {
//            this.settingWeightunit = settingWeightunit;
//        }
//
//        @JsonProperty("exerciseinfo")
//        public String getExerciseinfo() {
//            return exerciseinfo;
//        }
//
//        @JsonProperty("exerciseinfo")
//        public void setExerciseinfo(String exerciseinfo) {
//            this.exerciseinfo = exerciseinfo;
//        }
//
//        @JsonProperty("exercise")
//        public String getExercise() {
//            return exercise;
//        }
//
//        @JsonProperty("exercise")
//        public void setExercise(String exercise) {
//            this.exercise = exercise;
//        }
//
//        @JsonProperty("equipment")
//        public String getEquipment() {
//            return equipment;
//        }
//
//        @JsonProperty("equipment")
//        public void setEquipment(String equipment) {
//            this.equipment = equipment;
//        }
//
//        @JsonProperty("exercisecategory")
//        public String getExercisecategory() {
//            return exercisecategory;
//        }
//
//        @JsonProperty("exercisecategory")
//        public void setExercisecategory(String exercisecategory) {
//            this.exercisecategory = exercisecategory;
//        }
//
//        @JsonProperty("exerciseimage")
//        public String getExerciseimage() {
//            return exerciseimage;
//        }
//
//        @JsonProperty("exerciseimage")
//        public void setExerciseimage(String exerciseimage) {
//            this.exerciseimage = exerciseimage;
//        }
//
//        @JsonProperty("exercisecomment")
//        public String getExercisecomment() {
//            return exercisecomment;
//        }
//
//        @JsonProperty("exercisecomment")
//        public void setExercisecomment(String exercisecomment) {
//            this.exercisecomment = exercisecomment;
//        }
//
//        @JsonProperty("muscle")
//        public String getMuscle() {
//            return muscle;
//        }
//
//        @JsonProperty("muscle")
//        public void setMuscle(String muscle) {
//            this.muscle = muscle;
//        }
//
//        @JsonProperty("ingredient")
//        public String getIngredient() {
//            return ingredient;
//        }
//
//        @JsonProperty("ingredient")
//        public void setIngredient(String ingredient) {
//            this.ingredient = ingredient;
//        }
//
//        @JsonProperty("weightunit")
//        public String getWeightunit() {
//            return weightunit;
//        }
//
//        @JsonProperty("weightunit")
//        public void setWeightunit(String weightunit) {
//            this.weightunit = weightunit;
//        }
//
//        @JsonProperty("ingredientweightunit")
//        public String getIngredientweightunit() {
//            return ingredientweightunit;
//        }
//
//        @JsonProperty("ingredientweightunit")
//        public void setIngredientweightunit(String ingredientweightunit) {
//            this.ingredientweightunit = ingredientweightunit;
//        }
//
//        @JsonProperty("nutritionplan")
//        public String getNutritionplan() {
//            return nutritionplan;
//        }
//
//        @JsonProperty("nutritionplan")
//        public void setNutritionplan(String nutritionplan) {
//            this.nutritionplan = nutritionplan;
//        }
//
//        @JsonProperty("meal")
//        public String getMeal() {
//            return meal;
//        }
//
//        @JsonProperty("meal")
//        public void setMeal(String meal) {
//            this.meal = meal;
//        }
//
//        @JsonProperty("mealitem")
//        public String getMealitem() {
//            return mealitem;
//        }
//
//        @JsonProperty("mealitem")
//        public void setMealitem(String mealitem) {
//            this.mealitem = mealitem;
//        }
//
//        @JsonProperty("weightentry")
//        public String getWeightentry() {
//            return weightentry;
//        }
//
//        @JsonProperty("weightentry")
//        public void setWeightentry(String weightentry) {
//            this.weightentry = weightentry;
//        }
//
//        @JsonAnyGetter
//        public Map<String, Object> getAdditionalProperties() {
//            return this.additionalProperties;
//        }
//
//        @JsonAnySetter
//        public void setAdditionalProperty(String name, Object value) {
//            this.additionalProperties.put(name, value);
//        }
//
//        public void writeToParcel(Parcel dest, int flags) {
//            dest.writeValue(workout);
//            dest.writeValue(workoutsession);
//            dest.writeValue(schedulestep);
//            dest.writeValue(schedule);
//            dest.writeValue(day);
//            dest.writeValue(set);
//            dest.writeValue(setting);
//            dest.writeValue(workoutlog);
//            dest.writeValue(userprofile);
//            dest.writeValue(language);
//            dest.writeValue(daysofweek);
//            dest.writeValue(license);
//            dest.writeValue(settingRepetitionunit);
//            dest.writeValue(settingWeightunit);
//            dest.writeValue(exerciseinfo);
//            dest.writeValue(exercise);
//            dest.writeValue(equipment);
//            dest.writeValue(exercisecategory);
//            dest.writeValue(exerciseimage);
//            dest.writeValue(exercisecomment);
//            dest.writeValue(muscle);
//            dest.writeValue(ingredient);
//            dest.writeValue(weightunit);
//            dest.writeValue(ingredientweightunit);
//            dest.writeValue(nutritionplan);
//            dest.writeValue(meal);
//            dest.writeValue(mealitem);
//            dest.writeValue(weightentry);
//            dest.writeValue(additionalProperties);
//        }
//
//        public int describeContents() {
//            return 0;
//        }
//
//    }
//}
