package network;

import com.raemacias.foodandfittracker.BuildConfig;

public class ApiUtils {

    private ApiUtils() {}

    public static final String BASE_URL = "https://trackapi.nutritionix.com/";
    public static TrackerInterface getTrackerInterface() {
        return RetrofitClient.getClient(BASE_URL).create(TrackerInterface.class);
    }
}
