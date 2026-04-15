package k5;

import m4.q;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class l extends f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f11104j;

    public l(s4.h hVar, s4.m mVar, q qVar, int i10, Object obj, long j10, long j11, long j12) {
        super(hVar, mVar, 1, qVar, i10, obj, j10, j11);
        qVar.getClass();
        this.f11104j = j12;
    }

    public long a() {
        long j10 = this.f11104j;
        if (j10 != -1) {
            return j10 + 1;
        }
        return -1L;
    }

    public abstract boolean b();
}
