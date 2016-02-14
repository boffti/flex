package com.nieit.project.flex;

import android.app.ProgressDialog;
import android.graphics.Color;
import android.os.Build;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import io.saeid.fabloading.LoadingView;
import com.github.jorgecastilloprz.FABProgressCircle;
import com.truizlop.fabreveallayout.FABRevealLayout;
import com.truizlop.fabreveallayout.OnRevealChangeListener;

public class MainActivity extends AppCompatActivity {

    private LoadingView mLoadingView;
    private FABProgressCircle fabLoad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FABRevealLayout fabRevealLayout = (FABRevealLayout) findViewById(R.id.fab_reveal_layout);
        configureFABReveal(fabRevealLayout);
        /*mLoadingView = (LoadingView) findViewById(R.id.loading_view);
        mLoadingView.addAnimation(Color.parseColor("#FFD200"),R.drawable.ic_voice,
                LoadingView.FROM_LEFT);
        mLoadingView.addAnimation(Color.parseColor("#388E3C"),R.drawable.ic_voice,
                LoadingView.FROM_TOP);
        mLoadingView.addAnimation(Color.parseColor("#FF4218"), R.drawable.ic_voice,
                LoadingView.FROM_RIGHT);
        mLoadingView.addAnimation(Color.parseColor("#C7E7FB"), R.drawable.ic_voice,
                LoadingView.FROM_BOTTOM);

        //fabLoad = (FABProgressCircle) findViewById(R.id.fabProgressCircle);

        mLoadingView.startAnimation();
        mLoadingView.addListener(new LoadingView.LoadingListener() {
            @Override
            public void onAnimationStart(int currentItemPosition) {

                //fabLoad.show();
            }

            @Override
            public void onAnimationRepeat(int nextItemPosition) {
            }

            @Override
            public void onAnimationEnd(int nextItemPosition) {
            }
        });*/

    }

    private void configureFABReveal(FABRevealLayout fabRevealLayout) {
        fabRevealLayout.setOnRevealChangeListener(new OnRevealChangeListener() {
            @Override
            public void onMainViewAppeared(FABRevealLayout fabRevealLayout, View mainView) {}

            @Override
            public void onSecondaryViewAppeared(final FABRevealLayout fabRevealLayout, View secondaryView) {
                prepareBackTransition(fabRevealLayout);
            }
        });
    }

    private void prepareBackTransition(final FABRevealLayout fabRevealLayout) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                fabRevealLayout.revealMainView();
            }
        }, 2000);
    }

    public void start(View v) {
        //mLoadingView.startAnimation();
    }
}
