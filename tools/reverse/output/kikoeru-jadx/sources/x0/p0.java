package x0;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p0 implements u1, hf.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yb.h f24414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ic.n f24415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nf.d f24416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public hf.r1 f24417d;

    public p0(yb.h hVar, ic.n nVar) {
        this.f24414a = hVar;
        this.f24415b = nVar;
        this.f24416c = hf.a0.b(hVar.G(hVar.R(i1.c.f8638b) != null ? this : yb.i.f26088a));
    }

    @Override // yb.h
    public final yb.h G(yb.h hVar) {
        return ud.b.C(this, hVar);
    }

    @Override // yb.h
    public final yb.h L(yb.g gVar) {
        return ud.b.z(this, gVar);
    }

    @Override // yb.h
    public final yb.f R(yb.g gVar) {
        return ud.b.o(this, gVar);
    }

    @Override // x0.u1
    public final void a() {
        hf.r1 r1Var = this.f24417d;
        if (r1Var != null) {
            r1Var.x(new h0(1));
        }
        this.f24417d = null;
    }

    @Override // x0.u1
    public final void c() {
        hf.r1 r1Var = this.f24417d;
        if (r1Var != null) {
            r1Var.x(new h0(1));
        }
        this.f24417d = null;
    }

    @Override // x0.u1
    public final void d() {
        hf.r1 r1Var = this.f24417d;
        if (r1Var != null) {
            CancellationException cancellationException = new CancellationException("Old job was still running!");
            cancellationException.initCause(null);
            r1Var.g(cancellationException);
        }
        this.f24417d = hf.a0.y(this.f24416c, null, null, this.f24415b, 3);
    }

    @Override // yb.f
    public final yb.g getKey() {
        return hf.v.f8598a;
    }

    @Override // hf.w
    public final void o(Throwable th2, yb.h hVar) throws Throwable {
        i1.c cVar = (i1.c) hVar.R(i1.c.f8638b);
        if (cVar != null) {
            pc.f0.V(th2, new a9.d(12, cVar, this));
        }
        hf.w wVar = (hf.w) this.f24414a.R(hf.v.f8598a);
        if (wVar == null) {
            throw th2;
        }
        wVar.o(th2, hVar);
    }

    @Override // yb.h
    public final Object y(ic.n nVar, Object obj) {
        return nVar.q(obj, this);
    }
}
