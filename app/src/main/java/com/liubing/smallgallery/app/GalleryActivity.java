package com.liubing.smallgallery.app;

import android.os.Bundle;

import com.liubing.smallgallery.R;

public class GalleryActivity extends AbstractGalleryActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        if (savedInstanceState != null) {

        } else {
            startDefaultPage();
        }
    }

    private void startDefaultPage() {
        Bundle data = new Bundle();
        getStateManager().startState(AlbumPage.class, data);
    }
}
