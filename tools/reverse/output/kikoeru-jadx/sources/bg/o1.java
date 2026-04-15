package bg;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@sf.g
public final class o1 implements t {
    public static final n1 Companion = new n1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f2934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2936c;

    public o1(int i10, Integer num, String str, String str2) {
        if (6 != (i10 & 6)) {
            wf.z0.i(i10, 6, m1.f2928b);
            throw null;
        }
        if ((i10 & 1) == 0) {
            this.f2934a = null;
        } else {
            this.f2934a = num;
        }
        this.f2935b = str;
        this.f2936c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        return jc.l.a(this.f2934a, o1Var.f2934a) && jc.l.a(this.f2935b, o1Var.f2935b) && jc.l.a(this.f2936c, o1Var.f2936c);
    }

    @Override // bg.t
    public final String f() {
        return "vas/" + this.f2935b;
    }

    public final int hashCode() {
        Integer num = this.f2934a;
        return this.f2936c.hashCode() + j2.h0.e((num == null ? 0 : num.hashCode()) * 31, 31, this.f2935b);
    }

    @Override // bg.t
    public final String name() {
        return this.f2936c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Va(count=");
        sb.append(this.f2934a);
        sb.append(", id=");
        sb.append(this.f2935b);
        sb.append(", name=");
        return q.t0.E(sb, this.f2936c, ')');
    }
}
