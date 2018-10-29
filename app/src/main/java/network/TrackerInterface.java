package network;

import com.raemacias.foodandfittracker.BuildConfig;

import java.util.List;

import models.getCaloriesBurnedForExercises.Exercise;
import models.searchFoods.Common;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;
import retrofit2.http.Url;

public interface TrackerInterface {

    //The interface defines the possible HTTP operations
    //define base URL

    //all of the names and keys below need to be updated to the tracker app
    String BASE_URL = "https://trackapi.nutritionix.com/v2/";
    //this is copied from the movies app
    String API_KEY = BuildConfig.API_KEY;
    String APP_ID = "c9a9b2dd";
    String NATURAL_FOOD = "food";
    String EXERCISE = "exercise";
    String WEIGHT = "weigh_in";

    //searchFoods
    @Headers("APP_ID:NutritionixAppID, API_KEY:NutritionixAppKey")
    @GET("/search/instant")
    Call<Common> getFoodName(
            @Query("api_key") String api_key);

    //searchExercises
    @Headers("APP_ID:NutritionixAppID, API_KEY:NutritionixAppKey")
    @GET("/natural/exercise")
    Call<Exercise> getName();

    @Headers("Content-Type:application/json, APP_ID:NutritionixAppID, API_KEY:NutritionixAppKey")
    @GET()
    Call<String> getStringResponse(@Url String url);
}
