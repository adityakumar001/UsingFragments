package com.emptyfruits.com.usingfragments;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;

import com.emptyfruits.com.usingfragments.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding mainBinding;
    DynamicFragment dynamicFragment;
    Bundle args = new Bundle();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        dynamicFragment = new DynamicFragment();
        args.putString("radio", "1");
        dynamicFragment.setArguments(args);
        getSupportFragmentManager().beginTransaction().add(R.id.content_frame, dynamicFragment).commit();
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.rbtn_1:
                if (checked) {
                    dynamicFragment = new DynamicFragment();
                    args.putString("radio", "1");
                    dynamicFragment.setArguments(args);
                    getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, dynamicFragment).commit();
                }
                break;
            case R.id.rbtn_2:
                if (checked) {
                    dynamicFragment = new DynamicFragment();
                    args.putString("radio", "2");
                    dynamicFragment.setArguments(args);
                    getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, dynamicFragment).commit();
                }
                break;
            case R.id.rbtn_3:
                if (checked) {
                    dynamicFragment = new DynamicFragment();
                    args.putString("radio", "3");
                    dynamicFragment.setArguments(args);
                    getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, dynamicFragment).commit();
                }
                break;
        }
    }
}
