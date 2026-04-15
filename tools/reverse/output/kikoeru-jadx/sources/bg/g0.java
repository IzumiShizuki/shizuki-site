package bg;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@sf.g
public final class g0 extends k0 {
    public static final f0 Companion = new f0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f2888d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f2889e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f2890f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f2891g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f2892h;

    public g0(int i10, String str, String str2, String str3, String str4, String str5) {
        if (31 != (i10 & 31)) {
            wf.z0.i(i10, 31, e0.f2866b);
            throw null;
        }
        this.f2888d = str;
        this.f2889e = str2;
        this.f2890f = str3;
        this.f2891g = str4;
        this.f2892h = str5;
    }

    @Override // bg.o0
    public final String a() {
        return this.f2888d;
    }

    @Override // bg.k0
    public final String b() {
        return this.f2889e;
    }

    @Override // bg.k0
    public final String c() {
        return this.f2892h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return jc.l.a(this.f2888d, g0Var.f2888d) && jc.l.a(this.f2889e, g0Var.f2889e) && jc.l.a(this.f2890f, g0Var.f2890f) && jc.l.a(this.f2891g, g0Var.f2891g) && jc.l.a(this.f2892h, g0Var.f2892h);
    }

    public final int hashCode() {
        return this.f2892h.hashCode() + j2.h0.e(j2.h0.e(j2.h0.e(this.f2888d.hashCode() * 31, 31, this.f2889e), 31, this.f2890f), 31, this.f2891g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Other(title=");
        sb.append(this.f2888d);
        sb.append(", hash=");
        sb.append(this.f2889e);
        sb.append(", workTitle=");
        sb.append(this.f2890f);
        sb.append(", mediaStreamUrl=");
        sb.append(this.f2891g);
        sb.append(", mediaDownloadUrl=");
        return q.t0.E(sb, this.f2892h, ')');
    }
}
