package bg;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@sf.g
public final class i1 {
    public static final h1 Companion = new h1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f2900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f2902d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f2903e;

    public i1(int i10, String str, boolean z10, String str2, String str3, String str4) {
        if (15 != (i10 & 15)) {
            wf.z0.i(i10, 15, g1.f2894b);
            throw null;
        }
        this.f2899a = str;
        this.f2900b = z10;
        this.f2901c = str2;
        this.f2902d = str3;
        if ((i10 & 16) == 0) {
            this.f2903e = null;
        } else {
            this.f2903e = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return jc.l.a(this.f2899a, i1Var.f2899a) && this.f2900b == i1Var.f2900b && jc.l.a(this.f2901c, i1Var.f2901c) && jc.l.a(this.f2902d, i1Var.f2902d) && jc.l.a(this.f2903e, i1Var.f2903e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    public final int hashCode() {
        int iHashCode = this.f2899a.hashCode() * 31;
        boolean z10 = this.f2900b;
        ?? r22 = z10;
        if (z10) {
            r22 = 1;
        }
        int iE = j2.h0.e(j2.h0.e((iHashCode + r22) * 31, 31, this.f2901c), 31, this.f2902d);
        String str = this.f2903e;
        return iE + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("User(group=");
        sb.append(this.f2899a);
        sb.append(", loggedIn=");
        sb.append(this.f2900b);
        sb.append(", name=");
        sb.append(this.f2901c);
        sb.append(", recommenderUuid=");
        sb.append(this.f2902d);
        sb.append(", email=");
        return q.t0.E(sb, this.f2903e, ')');
    }
}
