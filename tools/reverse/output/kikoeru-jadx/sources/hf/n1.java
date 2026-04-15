package hf;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n1 extends yb.a implements d1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n1 f8571b = new n1(v.f8599b);

    @Override // hf.d1
    public final n0 B(ic.k kVar) {
        return o1.f8575a;
    }

    @Override // hf.d1
    public final Object Y(ac.c cVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // hf.d1
    public final boolean b() {
        return true;
    }

    @Override // hf.d1
    public final n c0(k1 k1Var) {
        return o1.f8575a;
    }

    @Override // hf.d1
    public final n0 q(boolean z10, boolean z11, de.h hVar) {
        return o1.f8575a;
    }

    @Override // hf.d1
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // hf.d1
    public final CancellationException u() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // hf.d1
    public final void g(CancellationException cancellationException) {
    }
}
