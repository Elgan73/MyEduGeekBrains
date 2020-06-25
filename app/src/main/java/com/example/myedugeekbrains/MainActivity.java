package com.example.myedugeekbrains;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import com.example.myedugeekbrains.model.WeatherModel;
import com.example.myedugeekbrains.net.NetworkService;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    TextView temperature;
    TextView temp1;
    TextView temp2;
    TextView temp3;
    TextView temp4;
    TextView temp5;
    TextView dateTime;
    char tmp = 0x00B0;
//    private static final String apiKey = "00138a6a0ccff95b3b1e1064f3f9b25c";
//    private static final String city = "Ulyanovsk";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        temperature = findViewById(R.id.temperature);
        dateTime = findViewById(R.id.dateTime);
        temp1 = findViewById(R.id.temp1);
        temp2 = findViewById(R.id.temp2);
        temp3 = findViewById(R.id.temp3);
        temp4 = findViewById(R.id.temp4);
        temp5 = findViewById(R.id.temp5);

        @SuppressLint("SimpleDateFormat")
        SimpleDateFormat format = new SimpleDateFormat(" hh:mm  dd.MM.yyyy");
        dateTime.setText(format.format(new Date()));
        temperature.setText(getString(R.string.temp, tmp));
        temp1.setText(getString(R.string.temp1, tmp));
        temp2.setText(getString(R.string.temp2, tmp));
        temp3.setText(getString(R.string.temp3, tmp));
        temp4.setText(getString(R.string.temp4, tmp));
        temp5.setText(getString(R.string.temp5, tmp));


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