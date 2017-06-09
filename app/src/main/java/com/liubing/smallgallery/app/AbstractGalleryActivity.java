package com.liubing.smallgallery.app;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

/**
 * Created by Brian on 2017/6/9.
 */
public class AbstractGalleryActivity extends Activity implements GalleryContext{
    public static final String TAG = "AbstractGalleryActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //getWindow().setBackgroundDrawable(null);
    }

    @Override
    public Context getAndroidContext() {
        return this;
    }
}
