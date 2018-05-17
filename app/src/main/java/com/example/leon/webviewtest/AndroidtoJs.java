package com.example.leon.webviewtest;

import android.util.Log;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

/**
 * Created by leon on 2018/5/17.
 */

public class AndroidtoJs {
    public static final String TAG = "AndroidtoJs";
    // 定义JS需要调用的方法
    // 被JS调用的方法必须加入@JavascriptInterface注解
    @JavascriptInterface
    public void hello(String msg) {
        Log.e(TAG,"JS调用了Android的hello方法");
    }
}
