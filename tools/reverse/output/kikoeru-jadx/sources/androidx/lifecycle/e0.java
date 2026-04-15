package androidx.lifecycle;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e0 implements x {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final e0 f761i = new e0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f763b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Handler f766e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f764c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f765d = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z f767f = new z(this, true);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a9.m f768g = new a9.m(1, this);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v0 f769h = new v0(this);

    public final void b() {
        int i10 = this.f763b + 1;
        this.f763b = i10;
        if (i10 == 1) {
            if (this.f764c) {
                this.f767f.D1(o.ON_RESUME);
                this.f764c = false;
            } else {
                Handler handler = this.f766e;
                jc.l.b(handler);
                handler.removeCallbacks(this.f768g);
            }
        }
    }

    @Override // androidx.lifecycle.x
    public final q f() {
        return this.f767f;
    }
}
