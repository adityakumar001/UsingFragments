package com.emptyfruits.com.usingfragments;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DynamicFragment extends Fragment {
    public static final String TAG = DynamicFragment.class.getName();

    public DynamicFragment() {
    }

    @SuppressLint("SetTextI18n")
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View myView = inflater.inflate(R.layout.fragment_dynamic, container, false);
        TextView textView = myView.findViewById(R.id.text);
        String selection = getArguments().getString("radio");
        Log.d(TAG, "onCreateView: " + selection);
        textView.setText(getString(R.string.fragment_selection) + selection);
        return myView;
    }
}
