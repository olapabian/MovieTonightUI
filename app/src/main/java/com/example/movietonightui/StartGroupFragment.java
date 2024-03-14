package com.example.movietonightui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class StartGroupFragment extends Fragment {

    private StartGroupViewModel mViewModel;

    public static StartGroupFragment newInstance() {
        return new StartGroupFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_start_group, container, false);

        view.findViewById(R.id.backToStartFromStartGroupButton).setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.changeFragmentToStartFromStartGroup);
        });

        return view;
    }
}