package s;

import android.widget.Magnifier;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class f1 implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Magnifier f19152a;

    public f1(Magnifier magnifier) {
        this.f19152a = magnifier;
    }

    @Override // s.d1
    public void a(long j10, long j11) {
        this.f19152a.show(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)));
    }

    public final void b() {
        this.f19152a.dismiss();
    }

    public final long c() {
        return (((long) this.f19152a.getHeight()) & 4294967295L) | (((long) this.f19152a.getWidth()) << 32);
    }

    public final void d() {
        this.f19152a.update();
    }
}
