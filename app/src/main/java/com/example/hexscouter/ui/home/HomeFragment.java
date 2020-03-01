package com.example.hexscouter.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.hexscouter.R;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        final TextView textViewTitle = root.findViewById(R.id.title_text_home);
        final TextView textViewChangelogTitle = root.findViewById(R.id.changelog_title_home);
        final TextView textViewChangelog = root.findViewById(R.id.changelog_text_home);
        final TextView textViewRegionalIndicator = root.findViewById(R.id.regional_indicator_home);
        homeViewModel.getTitleText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textViewTitle.setText(s);
            }
        });
        homeViewModel.getChangelogTitleText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textViewChangelogTitle.setText(s);
            }
        });
        homeViewModel.getChangelogText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textViewChangelog.setText(s);
            }
        });
        homeViewModel.getRegionalIndicator().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textViewRegionalIndicator.setText(s);
            }
        });
        return root;
    }
}