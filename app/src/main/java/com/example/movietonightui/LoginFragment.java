package com.example.movietonightui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class LoginFragment extends Fragment {

    private LoginViewModel mViewModel;

    public static LoginFragment newInstance() {
        return new LoginFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login, container, false);


        // Obsługa przycisku nawigacji do RegisterFragment
        view.findViewById(R.id.backToStartFromStartGroupButton).setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.changeFragmentToStartFromLogin);
        });

        // Obsługa przycisku nawigacji do RegisterFragment
        view.findViewById(R.id.registerButton).setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.changeFragmentToRegisterFromLogin);
        });

        return view;
    }



}