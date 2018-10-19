package network;

import com.raemacias.foodandfittracker.BuildConfig;

import models.getCaloriesBurnedForExercises.Exercise;
import models.getFoodsNutrients.Food;
import models.searchFoods.Common;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

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

    //http request - adds to end of base url
    //add a method - call <type> e.g. array would be list,
    // type of list, list of type movie
    //can name get anything I want
//    @Headers("user-key: API_KEY")
//    @Headers("Content-Type:application/json, APP_ID:NutritionixAppID, API_KEY:NutritionixAppKey")
//    @GET("/natural/nutrients")
//    Call<Food> getFoodName(
//            @Query("api_key") String api_key);

    //searchFoods
    @Headers("Content-Type:application/json, APP_ID:NutritionixAppID, API_KEY:NutritionixAppKey")
    @GET("/search/instant")
    Call<Common> getFoodName (
            @Query("api_key") String api_key);

    @Headers("Content-Type:application/json, APP_ID:NutritionixAppID, API_KEY:NutritionixAppKey")
    @GET("/natural/exercise")
    Call<Exercise> getName (
            @Query("api_key") String api_key);

//    @GET("{movie_id}/reviews")
//    Call<ReviewModel> getReviewList(@Path("movie_id") int id, @Query("api_key") String api_key);
//
//    @GET("{movie_id}/videos")
//    Call<TrailerModel> getMovieTrailer(@Path("movie_id") int id, @Query("api_key") String api_key);
}
