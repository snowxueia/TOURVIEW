package com.example.tourview.ui.weather;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class weatherViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public weatherViewModel() {
        mText = new MutableLiveData<>();

    }

    public LiveData<String> getText() {
        return mText;
    }
}
