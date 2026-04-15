package se;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class y extends w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final re.o f20009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ic.a f20010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final re.i f20011d;

    public y(re.o oVar, ic.a aVar) {
        jc.l.e(oVar, "storageManager");
        this.f20009b = oVar;
        this.f20010c = aVar;
        this.f20011d = new re.i((re.l) oVar, aVar);
    }

    @Override // se.w
    public final le.o n0() {
        return z().n0();
    }

    @Override // se.w
    public final List q() {
        return z().q();
    }

    @Override // se.w
    public final h0 r() {
        return z().r();
    }

    @Override // se.w
    public final k0 t() {
        return z().t();
    }

    public final String toString() {
        re.i iVar = this.f20011d;
        return (iVar.f19000c == re.k.f19005a || iVar.f19000c == re.k.f19006b) ? "<Not computed yet>" : z().toString();
    }

    @Override // se.w
    public final boolean u() {
        return z().u();
    }

    @Override // se.w
    public final w v(te.f fVar) {
        jc.l.e(fVar, "kotlinTypeRefiner");
        return new y(this.f20009b, new bd.i(16, fVar, this, false));
    }

    @Override // se.w
    public final w0 x() {
        w wVarZ = z();
        while (wVarZ instanceof y) {
            wVarZ = ((y) wVarZ).z();
        }
        jc.l.c(wVarZ, "null cannot be cast to non-null type org.jetbrains.kotlin.types.UnwrappedType");
        return (w0) wVarZ;
    }

    public final w z() {
        return (w) this.f20011d.b();
    }
}
