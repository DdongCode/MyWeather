package com.JAMScoco.MyWeather;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.JAMScoco.MyWeather.bean.WeatherBean;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView addCityIv,moreIv;
    LinearLayout pointLayout;
    ViewPager mainVp;
    String json = "[{\"id\":1,\"name\":\"北京\"},{\"id\":2,\"name\":\"上海\"},{\"id\":3,\"name\":\"天津\"},{\"id\":4,\"name\":\"重庆\"},{\"id\":5,\"name\":\"香港\"},{\"id\":6,\"name\":\"澳门\"},{\"id\":7,\"name\":\"台湾\"},{\"id\":8,\"name\":\"黑龙江\"},{\"id\":9,\"name\":\"吉林\"},{\"id\":10,\"name\":\"辽宁\"},{\"id\":11,\"name\":\"内蒙古\"},{\"id\":12,\"name\":\"河北\"},{\"id\":13,\"name\":\"河南\"},{\"id\":14,\"name\":\"山西\"},{\"id\":15,\"name\":\"山东\"},{\"id\":16,\"name\":\"江苏\"},{\"id\":17,\"name\":\"浙江\"},{\"id\":18,\"name\":\"福建\"},{\"id\":19,\"name\":\"江西\"},{\"id\":20,\"name\":\"安徽\"},{\"id\":21,\"name\":\"湖北\"},{\"id\":22,\"name\":\"湖南\"},{\"id\":23,\"name\":\"广东\"},{\"id\":24,\"name\":\"广西\"},{\"id\":25,\"name\":\"海南\"},{\"id\":26,\"name\":\"贵州\"},{\"id\":27,\"name\":\"云南\"},{\"id\":28,\"name\":\"四川\"},{\"id\":29,\"name\":\"西藏\"},{\"id\":30,\"name\":\"陕西\"},{\"id\":31,\"name\":\"宁夏\"},{\"id\":32,\"name\":\"甘肃\"},{\"id\":33,\"name\":\"青海\"},{\"id\":34,\"name\":\"新疆\"}]";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addCityIv = findViewById(R.id.main_iv_add);
        moreIv = findViewById(R.id.main_iv_more);
        pointLayout = findViewById(R.id.main_layout_point);
        mainVp = findViewById(R.id.main_vp);
//        添加点击事件
        addCityIv.setOnClickListener(this);
        moreIv.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.main_iv_add:
//                new Thread(){
//                    @Override
//                    public void run() {
//                        OkHttpClient client = new OkHttpClient();
//                        Request request = new Request.Builder().url("http://guolin.tech/api/china/").build();
//                        try {
//                            Response response = client.newCall(request).execute();
//                            String string = response.body().string();
//                            Gson gson = new Gson();
//                            List<WeatherBean> list = gson.fromJson(string,new TypeToken<List<WeatherBean>>(){}.getType());
//                            WeatherBean bean = list.get(8);
//                            Looper.prepare();
//                            Toast.makeText(MainActivity.this,bean.toString(),Toast.LENGTH_SHORT).show();
//                            Looper.loop();
//                        } catch (IOException e) {
//                            e.printStackTrace();
//                        }
//                    }
//                }.start();

//                WeatherBean bean = list.get(8);
//                Toast.makeText(this,bean.toString(),Toast.LENGTH_SHORT).show();

                break;
            case R.id.main_iv_more:
                break;
        }

    }
}