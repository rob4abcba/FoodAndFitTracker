package network;

import android.support.annotation.NonNull;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class Retrofit {

    private static final String BASE_URL = "https://trackapi.nutritionix.com/v2/";

    //there are several endpoints to add here
    private static final String END_POINT = "xxx";
    private static retrofit2.Retrofit retrofit = null;

    public static retrofit2.Retrofit getRetrofitInstance() {
        if (retrofit == null) {
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(ScalarsConverterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
            httpClient.addInterceptor(new Interceptor() {
                @Override
                public Response intercept(@NonNull Chain chain) throws IOException {
                    Request original = chain.request();

                    Request request = original.newBuilder()
                            .header("APP_ID", "NutritionixAppID")
                            .header("API_KEY", "NutritionixAppKey")
                            .method(original.method(), original.body())
                            .build();

                    return chain.proceed(request);
                }
            });
        }
        return retrofit;
    }
}

