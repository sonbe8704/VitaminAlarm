package com.example.vitamin;

import android.os.Build;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TimePicker;

public class TimePickerFragment extends Fragment {
    TimePicker timePicker;
    Button okBtn;
    Button cancleBtn;
    public TimePickerFragment() {
        // Required empty public constructor
    }

    public static TimePickerFragment newInstance(String param1, String param2) {
        TimePickerFragment fragment = new TimePickerFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_time_picker, container, false);
        timePicker = view.findViewById(R.id.time_picker);
        okBtn = view.findViewById(R.id.okBtn);
        cancleBtn=view.findViewById(R.id.cancleBtn);
        return  view;
    }

    public void Confirm(View view){
        int mHour,mMinute;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            mMinute=timePicker.getMinute();
            mHour=timePicker.getHour();
        }

    }
}