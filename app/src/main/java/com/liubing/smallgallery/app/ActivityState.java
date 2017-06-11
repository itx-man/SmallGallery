package com.liubing.smallgallery.app;

import android.os.Bundle;

/**
 * Created by Brian on 2017/6/10.
 */
abstract public class ActivityState {
    protected AbstractGalleryActivity mActivity;
    protected Bundle mData;

    protected ActivityState() {
    }

    void initialize(AbstractGalleryActivity activity, Bundle data) {
        mActivity = activity;
        mData = data;
    }

    protected void onCreate(Bundle data, Bundle storedData) {

    }

    void resume() {
        onResume();
    }

    protected void onResume() {

    }

    protected void onPause() {

    }

    protected void onDestory() {

    }

}
