package com.nieit.project.flex;

import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import io.saeid.fabloading.LoadingView;

public class MainActivity extends AppCompatActivity {

    private LoadingView mLoadingView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLoadingView = (LoadingView) findViewById(R.id.loading_view);
        mLoadingView.addAnimation(Color.parseColor("#FFD200"),R.drawable.ic_voice,
                LoadingView.FROM_LEFT);
        mLoadingView.addAnimation(Color.parseColor("#388E3C"),R.drawable.ic_voice,
                LoadingView.FROM_TOP);
        mLoadingView.addAnimation(Color.parseColor("#FF4218"), R.drawable.ic_voice,
                LoadingView.FROM_RIGHT);
        mLoadingView.addAnimation(Color.parseColor("#C7E7FB"), R.drawable.ic_voice,
                LoadingView.FROM_BOTTOM);

        mLoadingView.startAnimation();

    }

    public void start(View v) {
        mLoadingView.startAnimation();
    }
}
