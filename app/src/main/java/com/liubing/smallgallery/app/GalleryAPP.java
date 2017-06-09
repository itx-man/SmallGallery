package com.liubing.smallgallery.app;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Looper;

/**
 * Created by Brian on 2017/6/9.
 */
public interface GalleryAPP {
    public Context getAndroidContext();
    public Looper getMainLooper();
    public ContentResolver getContentResolver();
}
