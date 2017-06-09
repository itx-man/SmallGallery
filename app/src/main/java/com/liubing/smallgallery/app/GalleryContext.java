package com.liubing.smallgallery.app;

import android.content.Context;
import android.os.Looper;

/**
 * Created by Brian on 2017/6/9.
 */
public interface GalleryContext {
    public Context getAndroidContext();
    public Looper getMainLooper();
}
