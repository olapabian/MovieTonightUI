package com.example.movietonightui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class StartFragment extends Fragment {

    private StartViewModel mViewModel;

    public static StartFragment newInstance() {
        return new StartFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_start, container, false);
        

        // Obsługa przycisku nawigacji do LoginFragment
        view.findViewById(R.id.loginButton).setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.changeFragmentToLoginFromRegister);
        });


        view.findViewById(R.id.quickQuizButton).setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.changeFragmentToStartQuickQuizFromStart);
        });

        view.findViewById(R.id.groupStartButton).setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.changeFragmentToStartGroupFromStart);
        });

        return view;
    }



}