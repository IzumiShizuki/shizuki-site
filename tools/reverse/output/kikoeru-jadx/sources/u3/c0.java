package u3;

import android.view.WindowInsetsAnimation;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends d0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WindowInsetsAnimation f21276e;

    public c0(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f21276e = windowInsetsAnimation;
    }

    @Override // u3.d0
    public final float a() {
        return this.f21276e.getAlpha();
    }

    @Override // u3.d0
    public final long b() {
        return this.f21276e.getDurationMillis();
    }

    @Override // u3.d0
    public final float c() {
        return this.f21276e.getInterpolatedFraction();
    }

    @Override // u3.d0
    public final int d() {
        return this.f21276e.getTypeMask();
    }

    @Override // u3.d0
    public final void e(float f10) {
        this.f21276e.setFraction(f10);
    }
}
