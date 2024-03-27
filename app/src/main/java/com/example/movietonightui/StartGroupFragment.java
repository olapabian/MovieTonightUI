package com.example.movietonightui;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit.GenreApi;
import retrofit.RetrofitService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class StartGroupFragment extends Fragment {
    private ImageView imageView;



    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_start_group, container, false);

        view.findViewById(R.id.backToStartFromStartGroupButton).setOnClickListener(v -> Navigation.findNavController(v).navigate(R.id.changeFragmentToStartFromStartGroup));
        imageView=view.findViewById(R.id.imageView);
        setGenreImage();
        return view;
    }

    public void setGenreImage() {
        RetrofitService retrofitService = new RetrofitService();
        GenreApi genreApi = retrofitService.getRetrofit().create(GenreApi.class);

        Call<ResponseBody> call = genreApi.getGenreImage(10749L);

        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(@NonNull Call<ResponseBody> call, @NonNull Response<ResponseBody> response) {
                if (response.isSuccessful() && (response.body() != null)) {
                    try {
                        byte[] imageData = response.body().bytes();
                        Bitmap bitmap = BitmapFactory.decodeByteArray(imageData, 0, imageData.length);
                        imageView.setImageBitmap(bitmap);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {
                    Log.d(null, "Response not successful");
                }
            }

            @Override
            public void onFailure(@NonNull Call<ResponseBody> call, @NonNull Throwable t) {
                Log.d(null, "Failure: " + t.getMessage());
            }
        });
    }

}