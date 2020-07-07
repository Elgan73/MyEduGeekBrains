package com.example.myedugeekbrains;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.myedugeekbrains.fragments.CityChangeFragment;
import com.example.myedugeekbrains.fragments.SettingsFragment;
import com.example.myedugeekbrains.fragments.WeatherFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

//    private static final String apiKey = "00138a6a0ccff95b3b1e1064f3f9b25c";
//    private static final String city = "Ulyanovsk";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bnm = findViewById(R.id.bottomNavMenu);

        bnm.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                switch (item.getItemId()) {
                    case R.id.city:
                        CityChangeFragment cityChangeFragment = new CityChangeFragment();
                        ft.replace(R.id.frgmCont, cityChangeFragment);
                        break;
                    case R.id.weather:
                        WeatherFragment weatherFragment = new WeatherFragment();
                        ft.replace(R.id.frgmCont, weatherFragment);
                        break;
                    case R.id.settings:
                        SettingsFragment settingsFragment = new SettingsFragment();
                        ft.replace(R.id.frgmCont, settingsFragment);
                        break;

                }
                ft.commit();
                return false;
            }
        });


//        NetworkService.getInstance()
//                .getApi()
//                .getWeather(apiKey, city)
//                .enqueue(new Callback<WeatherModel>() {
//            @Override
//            public void onResponse(Call<WeatherModel> call, Response<WeatherModel> response) {
//                WeatherModel model = response.body();
//                System.out.println(response.errorBody());
////                if(model != null) {
////                    String cit = model.getLocation().getName();
////                    System.out.println(cit);
////                } else {
////                    Toast.makeText(MainActivity.this, "Model is null", Toast.LENGTH_SHORT).show();
////                }
//
//
////                float temp = model.getCurrent().getTemperature();
////                Log.d("TAAAAG!!!", "This temperature " + temp);
////                textView.setText(model.getCurrent().getTemperature());
//                //                textView.setText(model.getCurrent().getTemperature() + tmp);
//
//            }
//
//            @Override
//            public void onFailure(Call<WeatherModel> call, Throwable t) {
//                System.out.println(t);
//                Toast.makeText(MainActivity.this, "Something wrong with API" + t, Toast.LENGTH_LONG).show();
//            }
//        });

    }


}