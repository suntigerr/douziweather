package com.douziweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Administrator on 2017/4/29.
 * 发送http请求
 */

public class HttpUtil {
    //调用sendHttpRequest（）传入地址，并注册一个回调来处理服务器响应
    public static void sendHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
