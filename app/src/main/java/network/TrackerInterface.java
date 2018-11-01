package network;

import com.raemacias.foodandfittracker.BuildConfig;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import models.getCaloriesBurnedForExercises.Exercise;
import models.getCaloriesBurnedForExercises.ExerciseRequest;
import models.searchFoods.Common;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;


public interface TrackerInterface {

    //The interface defines the possible HTTP operations
    //define base URL

    //all of the names and keys below need to be updated to the tracker app
    String BASE_URL = "https://trackapi.nutritionix.com/";
//    String BASE_URL = "https://wger.de/api/v2";
    String API_KEY = BuildConfig.API_KEY;
    String APP_ID = "c9a9b2dd";
    String NATURAL_FOOD = "food";
    String EXERCISE = "exercise";
    String WEIGHT = "weigh_in";

//    searchFoods
    @Headers({"Content-Type: application/json", "x-app-id:c9a9b2dd, x-app-key:API_KEY"})
    @GET("search/instant")
    Call<List<Common>> getFoodName(
            @Query("api_key") String api_key);

    //searchExercises

////    @FormUrlEncoded
//    @Headers({"Content-Type: application/json", "x-app-id:c9a9b2dd, x-app-key:xxxxx"})
//    @POST("v2/natural/exercise")
//    Call<ExerciseRequest> getQuery(@Body String query);
//    @Field("query") String query);


    //using request body
//    @FormUrlEncoded
    @Headers({"Content-Type: application/json", "x-app-id:c9a9b2dd", "x-app-key:xxx"})
    @POST("v2/natural/exercise")
    Call<Exercise> getStringScalar(@Body ExerciseRequest body);


//            @Field("gender") String gender);
//    Call<Exercise> saveExercise(

//
//    @POST("/posts")
//    @FormUrlEncoded
//    Call<Post> savePost(@Body Post post);


//    @Field("name") String name);
//            @Path("query") String query);
//    Call<List<Exercise>> search(@Query("api_key") String api_key);




}
