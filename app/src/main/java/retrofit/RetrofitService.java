package retrofit;

import retrofit2.Retrofit;
public class RetrofitService {
    private Retrofit retrofit;

    public RetrofitService() {
        intializeRetrofit();
    }

    private void intializeRetrofit() {
        retrofit = new Retrofit.Builder()
//                .baseUrl("http://192.168.0.19:8080")
                .baseUrl("http://10.0.2.2:8080")
                .build();
    }

    public Retrofit getRetrofit() {
        return retrofit;
    }
}
