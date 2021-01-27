package com.example.daggerdi_3;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import javax.inject.Inject;
import javax.inject.Provider;

import butterknife.BindView;
import dagger.Lazy;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "EliEli";

    @BindView(R.id.tv)
    private TextView tv;

    @BindView(R.id.btnn)
    private Button btnn;

    @Inject
    Lazy<Cloth> cloth;

    @Inject
    Provider<Bean> bean;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // use baseModule
        MainComponent build = DaggerMainComponent.builder().mainModule(new MainModule()).build();

        build.inject(this);

        // tv.setText("OOOoop "+cloth);
        Log.d(TAG, "inject done ...");
        Log.d(TAG, "1 use cloth instance ..");
        Log.d(TAG, "cloth:" + cloth.get());
        Log.d(TAG, "2 use cloth instance ..");
        Log.d(TAG, "cloth:" + cloth.get());
        Log.d(TAG, "1 use bean instance ..");
        Log.d(TAG, "bean:" + bean.get());
        Log.d(TAG, "2 use bean instance ..");
        Log.d(TAG, "bean:" + bean.get());

    }

}