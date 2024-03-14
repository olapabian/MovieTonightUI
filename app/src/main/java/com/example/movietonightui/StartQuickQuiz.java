package com.example.movietonightui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class StartQuickQuiz extends Fragment {

    private StartQuickQuizViewModel mViewModel;

    public static StartQuickQuiz newInstance() {
        return new StartQuickQuiz();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_start_quick_quiz, container, false);

        view.findViewById(R.id.backToStartFromStartQuickQuiz).setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.changeFragmentToStartFromStartQuickQuiz);
        });

        return view;
    }

}