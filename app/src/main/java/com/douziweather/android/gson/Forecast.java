package com.douziweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/5/9.
 */

public class Forecast {
    public  String date;
    @SerializedName("tem")
    public Temperature temperature;
    @SerializedName("cond")
    public  More more;
    public class Temperature{
        public String max;
        public String min;
    }
    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
