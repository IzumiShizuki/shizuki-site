package j2;

import android.os.Build;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class x0 implements z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewConfiguration f10092a;

    public x0(ViewConfiguration viewConfiguration) {
        this.f10092a = viewConfiguration;
    }

    @Override // j2.z2
    public final long a() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // j2.z2
    public final long b() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // j2.z2
    public final float c() {
        if (Build.VERSION.SDK_INT >= 34) {
            return this.f10092a.getScaledHandwritingSlop();
        }
        return 2.0f;
    }

    @Override // j2.z2
    public final long d() {
        float f10 = 48;
        return a2.c.e(f10, f10);
    }

    @Override // j2.z2
    public final float e() {
        return this.f10092a.getScaledMaximumFlingVelocity();
    }

    @Override // j2.z2
    public final float f() {
        return this.f10092a.getScaledTouchSlop();
    }

    @Override // j2.z2
    public final float g() {
        if (Build.VERSION.SDK_INT >= 34) {
            return this.f10092a.getScaledHandwritingGestureLineMargin();
        }
        return 16.0f;
    }
}
