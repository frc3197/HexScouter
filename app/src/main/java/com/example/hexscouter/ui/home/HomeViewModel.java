package com.example.hexscouter.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.example.hexscouter.MainActivity;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mTitleText;
    private MutableLiveData<String> mChangelogTitleText;
    private MutableLiveData<String> mChangelogText;
    private MutableLiveData<String> mRegionalIndicator;

    public HomeViewModel() {
        mTitleText = new MutableLiveData<>();
        mChangelogTitleText = new MutableLiveData<>();
        mChangelogText = new MutableLiveData<>();
        mRegionalIndicator = new MutableLiveData<>();
        mTitleText.setValue("Welcome to HexScouter.");
        mChangelogTitleText.setValue("Version 1.0 Changelog");
        mChangelogText.setValue(" - The app now exists." + "\n" +
                                " - Basic Functionality Implemented" + "\n" +
                                " - Added a regional indicator (only in home fragment right now) in bottom left corner" + "\n" +
                                "\t - C = Midwest" + "\n" +
                                "\t - M = Milwaukee" + "\n" +
                                "\t - 7 = Seven Rivers" + "\n" +
                                "\t - W = Worlds");
        mRegionalIndicator.setValue(MainActivity.competition);
    }

    public LiveData<String> getTitleText() {
        return mTitleText;
    }
    public LiveData<String> getChangelogTitleText(){ return mChangelogTitleText; }
    public LiveData<String> getChangelogText(){ return mChangelogText; }
    public LiveData<String> getRegionalIndicator(){ return mRegionalIndicator; }
}