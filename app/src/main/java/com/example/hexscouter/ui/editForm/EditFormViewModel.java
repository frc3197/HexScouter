package com.example.hexscouter.ui.editForm;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class EditFormViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public EditFormViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is edit form fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
