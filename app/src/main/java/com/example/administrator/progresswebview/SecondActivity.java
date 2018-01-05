package com.example.administrator.progresswebview;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.administrator.progresswebview.widget.ProgressWebView;

public class SecondActivity extends AppCompatActivity {

    protected ProgressWebView mWebView;

    public static Intent newInstance(Context context) {
        return new Intent(context, SecondActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mWebView = (ProgressWebView) findViewById(R.id.web_view);
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.loadUrl("https://www.baidu.com");
    }
}
