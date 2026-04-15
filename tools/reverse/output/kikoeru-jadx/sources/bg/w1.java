package bg;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@sf.g
public final class w1 {
    public static final v1 Companion = new v1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f2989d;

    public w1(int i10, String str, int i11, String str2, String str3) {
        if (15 != (i10 & 15)) {
            wf.z0.i(i10, 15, u1.f2977b);
            throw null;
        }
        this.f2986a = str;
        this.f2987b = i11;
        this.f2988c = str2;
        this.f2989d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1)) {
            return false;
        }
        w1 w1Var = (w1) obj;
        return jc.l.a(this.f2986a, w1Var.f2986a) && this.f2987b == w1Var.f2987b && jc.l.a(this.f2988c, w1Var.f2988c) && jc.l.a(this.f2989d, w1Var.f2989d);
    }

    public final int hashCode() {
        return this.f2989d.hashCode() + j2.h0.e(((this.f2986a.hashCode() * 31) + this.f2987b) * 31, 31, this.f2988c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Rank(category=");
        sb.append(this.f2986a);
        sb.append(", rank=");
        sb.append(this.f2987b);
        sb.append(", rank_date=");
        sb.append(this.f2988c);
        sb.append(", term=");
        return q.t0.E(sb, this.f2989d, ')');
    }
}
