package com.example.hexscouter.ui.editForm;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hexscouter.R;

public class EditFormFragment extends Fragment {

    private EditFormViewModel editFormViewModel;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        editFormViewModel =
                ViewModelProviders.of(this).get(EditFormViewModel.class);
        View root = inflater.inflate(R.layout.fragment_edit_form, container, false);
        final TextView textView = root.findViewById(R.id.text_edit_form);
        editFormViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
