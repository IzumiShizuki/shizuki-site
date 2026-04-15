package l0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f11602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f11603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f11604c;

    public r(q qVar, q qVar2, boolean z10) {
        this.f11602a = qVar;
        this.f11603b = qVar2;
        this.f11604c = z10;
    }

    public static r a(r rVar, q qVar, q qVar2, boolean z10, int i10) {
        if ((i10 & 1) != 0) {
            qVar = rVar.f11602a;
        }
        if ((i10 & 2) != 0) {
            qVar2 = rVar.f11603b;
        }
        if ((i10 & 4) != 0) {
            z10 = rVar.f11604c;
        }
        rVar.getClass();
        return new r(qVar, qVar2, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return jc.l.a(this.f11602a, rVar.f11602a) && jc.l.a(this.f11603b, rVar.f11603b) && this.f11604c == rVar.f11604c;
    }

    public final int hashCode() {
        return ((this.f11603b.hashCode() + (this.f11602a.hashCode() * 31)) * 31) + (this.f11604c ? 1231 : 1237);
    }

    public final String toString() {
        return "Selection(start=" + this.f11602a + ", end=" + this.f11603b + ", handlesCrossed=" + this.f11604c + ')';
    }
}
