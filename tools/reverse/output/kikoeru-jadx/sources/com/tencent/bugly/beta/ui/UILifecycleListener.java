package com.tencent.bugly.beta.ui;

import android.content.Context;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public interface UILifecycleListener<T> {
    void onCreate(Context context, View view, T t10);

    void onDestroy(Context context, View view, T t10);

    void onPause(Context context, View view, T t10);

    void onResume(Context context, View view, T t10);

    void onStart(Context context, View view, T t10);

    void onStop(Context context, View view, T t10);
}
