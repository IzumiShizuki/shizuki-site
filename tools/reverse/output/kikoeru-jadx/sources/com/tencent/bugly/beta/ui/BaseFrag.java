package com.tencent.bugly.beta.ui;

import android.view.KeyEvent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class BaseFrag extends Fragment {
    protected boolean mIsShowing = false;

    public synchronized void close() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public synchronized boolean isShowing() {
        return this.mIsShowing;
    }

    public abstract boolean onKeyDown(int i10, KeyEvent keyEvent);

    public void onPause() {
        super.onPause();
        synchronized (this) {
            this.mIsShowing = false;
        }
    }

    public void onResume() {
        super.onResume();
        synchronized (this) {
            this.mIsShowing = true;
        }
    }
}
