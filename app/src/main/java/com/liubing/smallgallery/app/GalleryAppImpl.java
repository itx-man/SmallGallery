package com.liubing.smallgallery.app;

import android.app.Application;
import android.content.Context;

/**
 * Created by Brian on 2017/6/9.
 */
public class GalleryAppImpl extends Application implements GalleryAPP {
    @Override
    public Context getAndroidContext() {
        return this;
    }
}
