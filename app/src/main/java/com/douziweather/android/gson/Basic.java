package com.douziweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/5/9.
 */

public class Basic {
    //json中的一些字段可能不适合直接作为java字段命名，因此使用使用@SerializedName注解的方式
    //让json字段和java之间建立映射关系
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public  Update update;
     public class Update{
         @SerializedName("loc")
         public  String updateTime;
     }

}
