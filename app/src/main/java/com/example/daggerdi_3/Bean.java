package com.example.daggerdi_3;

import javax.inject.Inject;

public class Bean {

    @Inject
    public Bean() {

    }

    @Override
    public String toString() {
        return "bean";
    }
}
