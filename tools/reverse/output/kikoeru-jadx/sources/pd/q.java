package pd;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final be.e f17071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ed.o f17072b;

    public q(be.e eVar, ed.o oVar) {
        jc.l.e(eVar, "name");
        this.f17071a = eVar;
        this.f17072b = oVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            return jc.l.a(this.f17071a, ((q) obj).f17071a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17071a.hashCode();
    }
}
