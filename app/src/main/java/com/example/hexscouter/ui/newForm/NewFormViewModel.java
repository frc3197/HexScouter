package com.example.hexscouter.ui.newForm;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NewFormViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public NewFormViewModel(){
        mText = new MutableLiveData<String>();
        mText.setValue("This mean I actually did something right.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
