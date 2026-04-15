package d;

import android.os.Build;
import android.window.BackEvent;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f5183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f5184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f5185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5186d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f5187e;

    public c(BackEvent backEvent) {
        float fJ = a.j(backEvent);
        float fK = a.k(backEvent);
        float f10 = a.f(backEvent);
        int i10 = a.i(backEvent);
        long jB = Build.VERSION.SDK_INT >= 36 ? b.b(backEvent) : 0L;
        this.f5183a = fJ;
        this.f5184b = fK;
        this.f5185c = f10;
        this.f5186d = i10;
        this.f5187e = jB;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.f5183a + ", touchY=" + this.f5184b + ", progress=" + this.f5185c + ", swipeEdge=" + this.f5186d + ", frameTimeMillis=" + this.f5187e + '}';
    }
}
