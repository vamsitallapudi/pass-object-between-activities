package com.coderefer.firebasedatabaseexample;

import android.app.Application;

import com.coderefer.firebasedatabaseexample.util.FontsOverride;

/**
 * Created by vamsi on 06-05-2017.
 */

public class CustomFontApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        FontsOverride.setDefaultFont(this, "DEFAULT", "fonts/raleway.ttf");
        FontsOverride.setDefaultFont(this, "MONOSPACE", "fonts/raleway.ttf");
        FontsOverride.setDefaultFont(this, "SERIF", "fonts/raleway.ttf");
        FontsOverride.setDefaultFont(this, "SANS_SERIF", "fonts/raleway.ttf");
    }
}
