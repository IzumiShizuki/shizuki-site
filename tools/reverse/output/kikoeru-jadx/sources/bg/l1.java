package bg;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@sf.g
public final class l1 {
    public static final k1 Companion = new k1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i1 f2923b;

    public l1(int i10, String str, i1 i1Var) {
        if (1 != (i10 & 1)) {
            wf.z0.i(i10, 1, j1.f2915b);
            throw null;
        }
        this.f2922a = str;
        if ((i10 & 2) == 0) {
            this.f2923b = null;
        } else {
            this.f2923b = i1Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        return jc.l.a(this.f2922a, l1Var.f2922a) && jc.l.a(this.f2923b, l1Var.f2923b);
    }

    public final int hashCode() {
        int iHashCode = this.f2922a.hashCode() * 31;
        i1 i1Var = this.f2923b;
        return iHashCode + (i1Var == null ? 0 : i1Var.hashCode());
    }

    public final String toString() {
        return "UserBean(token=" + this.f2922a + ", user=" + this.f2923b + ')';
    }
}
