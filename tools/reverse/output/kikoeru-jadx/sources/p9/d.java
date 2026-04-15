package p9;

import f3.q;
import x0.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d implements b2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w0 f16950a;

    public d(w0 w0Var) {
        this.f16950a = w0Var;
    }

    @Override // b2.a
    public final Object D(long j10, long j11, yb.c cVar) {
        return new q(0L);
    }

    @Override // b2.a
    public final long F(int i10, long j10) {
        int i11 = (int) (j10 & 4294967295L);
        if (Math.abs(Float.intBitsToFloat(i11)) <= 30.0f) {
            return 0L;
        }
        float fIntBitsToFloat = Float.intBitsToFloat(i11);
        w0 w0Var = this.f16950a;
        if (fIntBitsToFloat < 0.0f) {
            w0Var.setValue(Boolean.FALSE);
        }
        if (Float.intBitsToFloat(i11) <= 0.0f) {
            return 0L;
        }
        w0Var.setValue(Boolean.TRUE);
        return 0L;
    }

    @Override // b2.a
    public final Object V(long j10, yb.c cVar) {
        return new q(0L);
    }

    @Override // b2.a
    public final /* synthetic */ long X(int i10, long j10, long j11) {
        return 0L;
    }
}
