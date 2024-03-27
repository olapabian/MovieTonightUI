package retrofit;

import retrofit2.Retrofit;
public class RetrofitService {
    private Retrofit retrofit;

    public RetrofitService() {
        intializeRetrofit();
    }

    private void intializeRetrofit() {
        retrofit = new Retrofit.Builder()
                .baseUrl("http://10.0.2.2:8080")
                .addConverterFactory(new ByteArrayConverterFactory())
                .build();
    }


    public Retrofit getRetrofit() {
        return retrofit;
    }
}

