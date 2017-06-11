package com.liubing.smallgallery.app;

import android.os.Bundle;

import java.util.Stack;

/**
 * Created by Brian on 2017/6/10.
 */
public class StateManager {
    private static final String TAG = "StateManager";

    private AbstractGalleryActivity mActivity;
    private Stack<StackEntry> mStack = new Stack<StackEntry>();
    private boolean mIsResumed = false;

    public StateManager(AbstractGalleryActivity activity) {
        mActivity = activity;
    }

    public void startState(Class<? extends ActivityState> kclass, Bundle data) {
        ActivityState state = null;
        try {
            state = kclass.newInstance();
        } catch (Exception e) {
            throw new AssertionError(e);
        }
        if (!mStack.isEmpty()) {
            ActivityState top = getTopState();
            if (mIsResumed)
                top.onPause();
        }
        state.initialize(mActivity, data);
        mStack.push(new StackEntry(data, state));
        state.onCreate(data, null);
        if (mIsResumed) state.resume();
    }

    public ActivityState getTopState() {
        if (mStack.isEmpty())
            throw  new AssertionError();
        return mStack.peek().activityState;
    }

    private static class StackEntry{
        public Bundle data;
        public ActivityState activityState;

        public StackEntry(Bundle data, ActivityState activityState) {
            this.data = data;
            this.activityState = activityState;
        }
    }
}
