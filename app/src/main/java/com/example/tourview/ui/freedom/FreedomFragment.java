package com.example.tourview.ui.freedom;

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

import com.example.tourview.R;

public class FreedomFragment extends Fragment{
    private FreedomViewModel freedomViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        freedomViewModel =
                ViewModelProviders.of(this).get(FreedomViewModel.class);
        View root = inflater.inflate(R.layout.fragment_freedom, container, false);
        final TextView textView = root.findViewById(R.id.text_slideshow);
        freedomViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }




        }