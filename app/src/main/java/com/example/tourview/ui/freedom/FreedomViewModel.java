package com.example.tourview.ui.freedom;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FreedomViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public FreedomViewModel() {
        mText = new MutableLiveData<>();

    }

    public LiveData<String> getText() {
        return mText;
    }
}
