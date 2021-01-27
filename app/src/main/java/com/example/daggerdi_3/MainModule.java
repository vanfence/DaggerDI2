package com.example.daggerdi_3;

import android.util.Log;

import dagger.Module;
import dagger.Provides;

@Module
public class MainModule {

    private static final String TAG = "EliEli";

    @PerActivity
    @Provides
    public Cloth getCloth() {

        Log.d(TAG, "getCloth");
        Cloth c = new Cloth();
        c.setColor("Dark Grey");
        return c;
    }

    @PerActivity
    @Provides
    public Bean getBean() {
        Log.d(TAG, "getBean");
        return new Bean();
    }


}
