package com.example.daggerdi_3;


import dagger.Component;

@PerActivity
@Component(modules = MainModule.class)
public interface MainComponent {
    void inject(MainActivity activity);
}
