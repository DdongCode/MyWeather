package com.JAMScoco.MyWeather;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CityWeatherFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CityWeatherFragment extends Fragment implements View.OnClickListener {

    TextView tempTv, cityTv, conditionTv, windTv, tempRangeTv, dateTv, clothIndexTv, carIndexTv, coldIndexTv, sportIndexTv, raysIndexTv;
    LinearLayout futureLayout;
    ImageView dayIv;
    String url1 = "http://guolin.tech/api/weather?cityid=";
    String url2 = "&key=0590b6c224c14c3b99f5af2326e5e3ef";
//    http://guolin.tech/api/weather?cityid=CN101060307&key=0590b6c224c14c3b99f5af2326e5e3ef

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public CityWeatherFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CityWeatherFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CityWeatherFragment newInstance(String param1, String param2) {
        CityWeatherFragment fragment = new CityWeatherFragment();
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
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_city_weather, container, false);
        initView(view);
//        通过Activity传值得到当前加载的城市
        Bundle bundle = getArguments();
        String city = bundle.getString("city");
        String url = url1 + city + url2;

        return view;
    }

    private void initView(View view) {
//        用于初始化控件操作
        tempTv = view.findViewById(R.id.frag_tv_currenttemp);
        cityTv = view.findViewById(R.id.frag_tv_city);
        conditionTv = view.findViewById(R.id.frag_tv_condition);
        windTv = view.findViewById(R.id.frag_tv_wind);
        tempRangeTv = view.findViewById(R.id.frag_tv_temprange);
        dateTv = view.findViewById(R.id.frag_tv_date);
        clothIndexTv = view.findViewById(R.id.frag_index_tv_dress);
        carIndexTv = view.findViewById(R.id.frag_index_tv_washcar);
        coldIndexTv = view.findViewById(R.id.frag_index_tv_cold);
        sportIndexTv = view.findViewById(R.id.frag_index_tv_sport);
        raysIndexTv = view.findViewById(R.id.frag_index_tv_rays);
        futureLayout = view.findViewById(R.id.frag_center_layout);
        dayIv = view.findViewById(R.id.frag_iv_today);
//        设置单击事件的监听
        clothIndexTv.setOnClickListener(this);
        carIndexTv.setOnClickListener(this);
        coldIndexTv.setOnClickListener(this);
        sportIndexTv.setOnClickListener(this);
        raysIndexTv.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.frag_index_tv_dress:

                break;
            case R.id.frag_index_tv_washcar:

                break;
            case R.id.frag_index_tv_cold:

                break;
            case R.id.frag_index_tv_sport:

                break;
            case R.id.frag_index_tv_rays:

                break;
        }
    }
}