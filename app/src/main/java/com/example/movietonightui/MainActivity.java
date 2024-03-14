package com.example.movietonightui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

import java.util.logging.Logger;

import retrofit.CollectApi;
import retrofit.RetrofitService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        RetrofitService retrifitService = new RetrofitService();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CollectApi collectApi = retrifitService.getRetrofit().create(CollectApi.class);
                Call<Void> call = collectApi.collect();
                String message = "Hello, world!";
                Log.d(null, message);
                call.enqueue(new Callback<Void>() {

                    @Override
                    public void onResponse(Call<Void> call, Response<Void> response) {
                        if (response.isSuccessful()) {
                            String message = "Jest odpowiedz";
                            Log.d(null, message);
                        } else {
                            String message = "Nie ma odpowiedzi";
                            Log.d(null, message);
                        }
                    }

                    @Override
                    public void onFailure(Call<Void> call, Throwable t) {
                        Log.d(null, String.valueOf(t));
                    }


                });
            }
        });


    }

}