package bg;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@sf.g
public final class d0 extends k0 {
    public static final c0 Companion = new c0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f2855d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f2856e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f2857f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f2858g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f2859h;

    public d0(int i10, String str, String str2, String str3, String str4, String str5) {
        if (31 != (i10 & 31)) {
            wf.z0.i(i10, 31, b0.f2845b);
            throw null;
        }
        this.f2855d = str;
        this.f2856e = str2;
        this.f2857f = str3;
        this.f2858g = str4;
        this.f2859h = str5;
    }

    @Override // bg.o0
    public final String a() {
        return this.f2855d;
    }

    @Override // bg.k0
    public final String b() {
        return this.f2856e;
    }

    @Override // bg.k0
    public final String c() {
        return this.f2859h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return jc.l.a(this.f2855d, d0Var.f2855d) && jc.l.a(this.f2856e, d0Var.f2856e) && jc.l.a(this.f2857f, d0Var.f2857f) && jc.l.a(this.f2858g, d0Var.f2858g) && jc.l.a(this.f2859h, d0Var.f2859h);
    }

    public final int hashCode() {
        return this.f2859h.hashCode() + j2.h0.e(j2.h0.e(j2.h0.e(this.f2855d.hashCode() * 31, 31, this.f2856e), 31, this.f2857f), 31, this.f2858g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Image(title=");
        sb.append(this.f2855d);
        sb.append(", hash=");
        sb.append(this.f2856e);
        sb.append(", workTitle=");
        sb.append(this.f2857f);
        sb.append(", mediaStreamUrl=");
        sb.append(this.f2858g);
        sb.append(", mediaDownloadUrl=");
        return q.t0.E(sb, this.f2859h, ')');
    }
}
