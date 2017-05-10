package com.douziweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/5/9.
 */

public class Now {
    @SerializedName("tem")
    public String temperture;
    @SerializedName("cond")
    public More more;
    public  class  More{
        @SerializedName("txt")
        public String info;
    }
}
