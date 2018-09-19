package com.example.android.basicproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebActivity extends AppCompatActivity {

    WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        myWebView = findViewById(R.id.webView);
//        myWebView.loadUrl("https://www.google.com/");
        myWebView.loadUrl("file:///android_asset/web.html");
    }
}
