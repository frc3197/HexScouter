package com.example.hexscouter.ui.newForm;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hexscouter.R;

public class NewFormFragment extends Fragment {

    private NewFormViewModel newFormViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        newFormViewModel =
                ViewModelProviders.of(this).get(NewFormViewModel.class);
        View root = inflater.inflate(R.layout.fragment_new_form, container, false);

        final TextView textView = root.findViewById(R.id.title_new_form);
        newFormViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
