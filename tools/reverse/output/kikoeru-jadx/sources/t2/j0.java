package t2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f20350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f20351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d0 f20352c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d0 f20353d;

    public j0(d0 d0Var, d0 d0Var2, d0 d0Var3, d0 d0Var4) {
        this.f20350a = d0Var;
        this.f20351b = d0Var2;
        this.f20352c = d0Var3;
        this.f20353d = d0Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return jc.l.a(this.f20350a, j0Var.f20350a) && jc.l.a(this.f20351b, j0Var.f20351b) && jc.l.a(this.f20352c, j0Var.f20352c) && jc.l.a(this.f20353d, j0Var.f20353d);
    }

    public final int hashCode() {
        d0 d0Var = this.f20350a;
        int iHashCode = (d0Var != null ? d0Var.hashCode() : 0) * 31;
        d0 d0Var2 = this.f20351b;
        int iHashCode2 = (iHashCode + (d0Var2 != null ? d0Var2.hashCode() : 0)) * 31;
        d0 d0Var3 = this.f20352c;
        int iHashCode3 = (iHashCode2 + (d0Var3 != null ? d0Var3.hashCode() : 0)) * 31;
        d0 d0Var4 = this.f20353d;
        return iHashCode3 + (d0Var4 != null ? d0Var4.hashCode() : 0);
    }
}
