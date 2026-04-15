package q1;

import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends h0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p1.d f17497e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f17498f;

    public d0(p1.d dVar) {
        h hVarA;
        this.f17497e = dVar;
        if (nd.h.q(dVar)) {
            hVarA = null;
        } else {
            hVarA = j.a();
            t0.f(hVarA, dVar);
        }
        this.f17498f = hVarA;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d0) {
            return jc.l.a(this.f17497e, ((d0) obj).f17497e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17497e.hashCode();
    }

    @Override // q1.h0
    public final p1.c o() {
        p1.d dVar = this.f17497e;
        return new p1.c(dVar.f16487a, dVar.f16488b, dVar.f16489c, dVar.f16490d);
    }
}
