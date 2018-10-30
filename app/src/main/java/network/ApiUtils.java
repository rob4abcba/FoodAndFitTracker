package network;

import com.raemacias.foodandfittracker.BuildConfig;

public class ApiUtils {

    private ApiUtils() {}

    public static final String BASE_URL = "https://trackapi.nutritionix.com/";
    public static TrackerInterface getTrackerInterface() {
        return RetrofitClient.getClient(BASE_URL).create(TrackerInterface.class);
    }
//    //this is copied from the movies app
//    String API_KEY = BuildConfig.API_KEY;
//    String APP_ID = "c9a9b2dd";
//    String NATURAL_FOOD = "food";
//    String EXERCISE = "exercise";
//    String WEIGHT = "weigh_in";
}
