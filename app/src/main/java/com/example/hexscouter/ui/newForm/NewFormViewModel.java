package com.example.hexscouter.ui.newForm;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NewFormViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public NewFormViewModel(){
        mText = new MutableLiveData<String>();
        mText.setValue("New Form");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
