package cn.niko.com;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import cn.shmm.com.LoadingLayout;

public class MainActivity extends AppCompatActivity {
    private LoadingLayout loading;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loading = (LoadingLayout) findViewById(R.id.loading);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                loading.setStatus(LoadingLayout.Loading);
            }
        },2000);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                loading.setStatus(LoadingLayout.Error);
            }
        },4000);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                loading.setStatus(LoadingLayout.No_Network);
            }
        },6000);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                loading.setStatus(LoadingLayout.Success);
            }
        },8000);


        loading.setOnReloadListener(new LoadingLayout.OnReloadListener() {
            @Override
            public void onReload(View v) {

            }
        });




        //





    }
}
