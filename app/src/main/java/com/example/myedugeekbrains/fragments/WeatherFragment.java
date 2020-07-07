package com.example.myedugeekbrains.fragments;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.myedugeekbrains.R;

public class WeatherFragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;
    TextView temperature;
    TextView temp1;
    TextView temp2;
    TextView temp3;
    TextView temp4;
    TextView temp5;
    TextView dateTime;
    char tmp = 0x00B0;

    public WeatherFragment() {
    }

    public static WeatherFragment newInstance(String param1, String param2) {
        WeatherFragment fragment = new WeatherFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
//        @SuppressLint("SimpleDateFormat")
//        SimpleDateFormat format = new SimpleDateFormat(" hh:mm  dd.MM.yyyy");
//        dateTime.setText(format.format(new Date()));

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_weather, container, false);
//        temperature = findViewById(R.id.temperature);
//        dateTime = findViewById(R.id.dateTime);
//        temp1 = findViewById(R.id.temp1);
//        temp2 = findViewById(R.id.temp2);
//        temp3 = findViewById(R.id.temp3);
//        temp4 = findViewById(R.id.temp4);
//        temp5 = findViewById(R.id.temp5);
//

//        temperature.setText(getString(R.string.temp, tmp));
//        temp1.setText(getString(R.string.temp1, tmp));
//        temp2.setText(getString(R.string.temp2, tmp));
//        temp3.setText(getString(R.string.temp3, tmp));
//        temp4.setText(getString(R.string.temp4, tmp));
//        temp5.setText(getString(R.string.temp5, tmp));
    }


}