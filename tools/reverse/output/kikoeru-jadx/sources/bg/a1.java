package bg;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@sf.g
public final class a1 {
    public static final z0 Companion = new z0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d1 f2815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d1 f2816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d1 f2817c;

    public a1(int i10, d1 d1Var, d1 d1Var2, d1 d1Var3) {
        if ((i10 & 1) == 0) {
            this.f2815a = null;
        } else {
            this.f2815a = d1Var;
        }
        if ((i10 & 2) == 0) {
            this.f2816b = null;
        } else {
            this.f2816b = d1Var2;
        }
        if ((i10 & 4) == 0) {
            this.f2817c = null;
        } else {
            this.f2817c = d1Var3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return jc.l.a(this.f2815a, a1Var.f2815a) && jc.l.a(this.f2816b, a1Var.f2816b) && jc.l.a(this.f2817c, a1Var.f2817c);
    }

    public final int hashCode() {
        d1 d1Var = this.f2815a;
        int iHashCode = (d1Var == null ? 0 : d1Var.hashCode()) * 31;
        d1 d1Var2 = this.f2816b;
        int iHashCode2 = (iHashCode + (d1Var2 == null ? 0 : d1Var2.hashCode())) * 31;
        d1 d1Var3 = this.f2817c;
        return iHashCode2 + (d1Var3 != null ? d1Var3.hashCode() : 0);
    }

    public final String toString() {
        return "I18n(en-us=" + this.f2815a + ", ja-jp=" + this.f2816b + ", zh-cn=" + this.f2817c + ')';
    }
}
