package j1;

import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f9684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f9685b;

    public j(q qVar, q qVar2) {
        this.f9684a = qVar;
        this.f9685b = qVar2;
    }

    @Override // j1.q
    public final Object a(ic.n nVar, Object obj) {
        return this.f9685b.a(nVar, this.f9684a.a(nVar, obj));
    }

    @Override // j1.q
    public final /* synthetic */ q e(q qVar) {
        return a0.c.r(this, qVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return jc.l.a(this.f9684a, jVar.f9684a) && jc.l.a(this.f9685b, jVar.f9685b);
    }

    public final int hashCode() {
        return (this.f9685b.hashCode() * 31) + this.f9684a.hashCode();
    }

    @Override // j1.q
    public final boolean k(ic.k kVar) {
        return this.f9684a.k(kVar) && this.f9685b.k(kVar);
    }

    public final String toString() {
        return t0.E(new StringBuilder("["), (String) a(i.f9683b, ""), ']');
    }
}
