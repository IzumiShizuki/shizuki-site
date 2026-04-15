package ud;

import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r implements qe.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dd.c f21601a;

    public r(dd.c cVar, qe.v vVar, qe.i iVar) {
        this.f21601a = cVar;
    }

    @Override // qe.j
    public final String C() {
        return t0.E(new StringBuilder("Class '"), ed.d.a(this.f21601a.f5866a).a().f2744a.f2747a, '\'');
    }

    public final String toString() {
        return r.class.getSimpleName() + ": " + this.f21601a;
    }
}
