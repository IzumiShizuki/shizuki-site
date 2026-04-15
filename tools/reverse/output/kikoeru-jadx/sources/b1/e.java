package b1;

import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import c7.p0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f1425a;

    public /* synthetic */ e(Object obj) {
        this.f1425a = obj;
    }

    public static e a(float f10, float f11, float f12) {
        return new e(AccessibilityNodeInfo.RangeInfo.obtain(1, f10, f11, f12));
    }

    public void b(String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            p0.i(android.support.v4.media.c.h(this.f1425a), str);
        }
    }
}
