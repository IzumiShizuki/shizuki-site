package u3;

import android.view.animation.Interpolator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f21283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Interpolator f21284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f21285d;

    public d0(int i10, Interpolator interpolator, long j10) {
        this.f21282a = i10;
        this.f21284c = interpolator;
        this.f21285d = j10;
    }

    public float a() {
        return 1.0f;
    }

    public long b() {
        return this.f21285d;
    }

    public float c() {
        Interpolator interpolator = this.f21284c;
        return interpolator != null ? interpolator.getInterpolation(this.f21283b) : this.f21283b;
    }

    public int d() {
        return this.f21282a;
    }

    public void e(float f10) {
        this.f21283b = f10;
    }
}
