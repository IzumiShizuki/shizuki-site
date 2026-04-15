package sf;

import androidx.lifecycle.n0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d extends wf.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pc.c f20014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f20015b;

    public d(pc.c cVar) {
        jc.l.e(cVar, "baseClass");
        this.f20014a = cVar;
        this.f20015b = ub.a.c(ub.i.f21540a, new n0(28, this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ub.h] */
    @Override // sf.a
    public final uf.g a() {
        return (uf.g) this.f20015b.getValue();
    }

    @Override // wf.b
    public final pc.c g() {
        return this.f20014a;
    }

    public final String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + this.f20014a + ')';
    }
}
