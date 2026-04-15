package bg;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@sf.g
public final class j0 extends k0 {
    public static final i0 Companion = new i0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f2909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f2910e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f2911f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f2912g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f2913h;

    public j0(int i10, String str, String str2, String str3, String str4, String str5) {
        if (31 != (i10 & 31)) {
            wf.z0.i(i10, 31, h0.f2898b);
            throw null;
        }
        this.f2909d = str;
        this.f2910e = str2;
        this.f2911f = str3;
        this.f2912g = str4;
        this.f2913h = str5;
    }

    @Override // bg.o0
    public final String a() {
        return this.f2909d;
    }

    @Override // bg.k0
    public final String b() {
        return this.f2910e;
    }

    @Override // bg.k0
    public final String c() {
        return this.f2913h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return jc.l.a(this.f2909d, j0Var.f2909d) && jc.l.a(this.f2910e, j0Var.f2910e) && jc.l.a(this.f2911f, j0Var.f2911f) && jc.l.a(this.f2912g, j0Var.f2912g) && jc.l.a(this.f2913h, j0Var.f2913h);
    }

    public final int hashCode() {
        return this.f2913h.hashCode() + j2.h0.e(j2.h0.e(j2.h0.e(this.f2909d.hashCode() * 31, 31, this.f2910e), 31, this.f2911f), 31, this.f2912g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Text(title=");
        sb.append(this.f2909d);
        sb.append(", hash=");
        sb.append(this.f2910e);
        sb.append(", workTitle=");
        sb.append(this.f2911f);
        sb.append(", mediaStreamUrl=");
        sb.append(this.f2912g);
        sb.append(", mediaDownloadUrl=");
        return q.t0.E(sb, this.f2913h, ')');
    }
}
