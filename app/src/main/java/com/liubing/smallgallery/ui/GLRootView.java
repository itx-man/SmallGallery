package com.liubing.smallgallery.ui;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.view.View;

import com.liubing.smallgallery.R;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/**
 * Created by Brian on 2017/6/9.
 */
public class GLRootView extends GLSurfaceView implements GLSurfaceView.Renderer, GLRoot{
    public static final String TAG = "GLRootView";

    private boolean mFirstDraw = true;

    public GLRootView(Context context) {
        this(context, null);
    }

    public GLRootView(Context context, AttributeSet attrs) {
        super(context, attrs);

        setEGLContextClientVersion(2);
        setRenderer(this);
    }

    @Override
    public void requestRender() {
        super.requestRender();
    }

    @Override
    public void onSurfaceCreated(GL10 gl, EGLConfig config) {
        GLES20.glClearColor(1.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override
    public void onSurfaceChanged(GL10 gl, int width, int height) {
        GLES20.glViewport(0, 0, width, height);
    }

    @Override
    public void onDrawFrame(GL10 gl) {
        GLES20.glClear(GLES20.GL_COLOR_BUFFER_BIT);

        if (mFirstDraw) {
            mFirstDraw = false;
            post(new Runnable() {
                @Override
                public void run() {
                    View root = getRootView();
                    View cover = root.findViewById(R.id.gl_root_cover);
                    cover.setVisibility(GONE);
                }
            });
        }
    }
}
