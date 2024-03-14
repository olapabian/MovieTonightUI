package retrofit;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface CollectApi {
    @GET("/collect")
    Call<Void> collect();
}
