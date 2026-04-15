package com.tencent.bugly.beta.utils;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Handler f4516a;

    private static Handler a() {
        if (f4516a == null && Looper.getMainLooper() != null) {
            f4516a = new Handler(Looper.getMainLooper());
        }
        return f4516a;
    }

    public static void b(Runnable runnable) {
        if (a() != null) {
            f4516a.removeCallbacks(runnable);
        }
    }

    public static void a(Runnable runnable) {
        if (a() != null) {
            f4516a.post(runnable);
        }
    }

    public static void a(Runnable runnable, long j10) {
        if (a() != null) {
            f4516a.postDelayed(runnable, j10);
        }
    }
}
