package kf;

import hf.a0;
import hf.e1;
import hf.j1;
import hf.k1;
import java.util.concurrent.CancellationException;
import m0.w;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r extends hf.a implements s, j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f11384d;

    public r(yb.h hVar, f fVar) {
        super(hVar, true);
        this.f11384d = fVar;
    }

    @Override // kf.t
    public final w a() {
        return this.f11384d.a();
    }

    @Override // kf.t
    public final Object c() {
        return this.f11384d.c();
    }

    @Override // kf.t
    public final Object d(ac.i iVar) {
        return this.f11384d.d(iVar);
    }

    @Override // kf.u
    public final Object e(Object obj) {
        return this.f11384d.e(obj);
    }

    @Override // hf.k1, hf.d1
    public final void g(CancellationException cancellationException) {
        Object obj = k1.f8563a.get(this);
        if (obj instanceof hf.s) {
            return;
        }
        if ((obj instanceof j1) && ((j1) obj).e()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new e1(C(), null, this);
        }
        x(cancellationException);
    }

    @Override // kf.t
    public final c iterator() {
        f fVar = this.f11384d;
        fVar.getClass();
        return new c(fVar);
    }

    @Override // kf.u
    public final Object j(Object obj, yb.c cVar) {
        return this.f11384d.j(obj, cVar);
    }

    @Override // hf.a
    public final void l0(Throwable th2, boolean z10) {
        if (this.f11384d.l(th2, false) || z10) {
            return;
        }
        a0.t(th2, this.f8507c);
    }

    @Override // hf.a
    public final void m0(Object obj) {
        this.f11384d.k(null);
    }

    @Override // hf.k1
    public final void x(CancellationException cancellationException) {
        this.f11384d.l(cancellationException, true);
        w(cancellationException);
    }
}
