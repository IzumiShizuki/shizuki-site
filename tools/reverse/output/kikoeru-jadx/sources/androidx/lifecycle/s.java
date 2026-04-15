package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s implements v, hf.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yb.h f813b;

    public s(q qVar, yb.h hVar) {
        jc.l.e(hVar, "coroutineContext");
        this.f812a = qVar;
        this.f813b = hVar;
        if (qVar.a1() == p.f794a) {
            hf.a0.i(hVar, null);
        }
    }

    @Override // hf.y
    public final yb.h O() {
        return this.f813b;
    }

    @Override // androidx.lifecycle.v
    public final void i(x xVar, o oVar) {
        q qVar = this.f812a;
        if (qVar.a1().compareTo(p.f794a) <= 0) {
            qVar.q1(this);
            hf.a0.i(this.f813b, null);
        }
    }
}
