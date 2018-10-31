//package network;
//
//import models.getCaloriesBurnedForExercises.Exercise;
//import models.getCaloriesBurnedForExercises.ExerciseRequest;
//import okhttp3.OkHttpClient;
//import okhttp3.logging.HttpLoggingInterceptor;
//import retrofit2.Call;
//import retrofit2.Callback;
//import retrofit2.converter.gson.GsonConverterFactory;
//import retrofit2.Retrofit;
//import retrofit2.converter.scalars.ScalarsConverterFactory;
//
//import static network.TrackerInterface.BASE_URL;
//
//public class RetrofitClient {
//
////    private static Retrofit retrofit = null;
////
////    public static Retrofit getClient(String baseUrl) {
////        if (retrofit==null) {
////        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
////        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
////        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();
////            retrofit = new Retrofit.Builder()
////                    .baseUrl(baseUrl)
////                    .addConverterFactory(GsonConverterFactory.create())
////                    .build();
////        }
////        return retrofit;
////    }
////}
//
////    Retrofit retrofit = new Retrofit.Builder()
////            .baseUrl(BASE_URL)
////            .addConverterFactory(ScalarsConverterFactory.create())
////            .addConverterFactory(GsonConverterFactory.create())
////            .build();
////
////    TrackerInterface service = retrofit.create(TrackerInterface .class);
////
////    Call<Exercise> call=service.getStringScalar(new ExerciseRequest(query,age));
////    call.enqueue(new Callback<Exercise>() {
////        @Override
////        public void onResponse(Call<Exercise> call, Response<Exercise> response) {
////            //response.body() have your LoginResult fields and methods  (example you have to access error then try like this response.body().getError() )
////
////        }
////
////        @Override
////        public void onFailure(Call<Exercise> call, Throwable t) {
////            //for getting error in network put here Toast, so get the error on network
////        }
////    });
//
//}