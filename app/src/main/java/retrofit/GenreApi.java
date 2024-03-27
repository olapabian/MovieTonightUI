package retrofit;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GenreApi {
    @GET("/get/genre/img/{genreId}")
    Call<ResponseBody> getGenreImage(@Path("genreId") long genreId);
}


