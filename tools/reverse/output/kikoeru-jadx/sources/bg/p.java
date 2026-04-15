package bg;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@sf.g
public final class p {
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f2940d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2941e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f2942f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f2943g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f2944h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f2945i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f2946j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f2947k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f2948l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f2949m;

    public p(int i10, String str, String str2, int i11, String str3, int i12, String str4, String str5, String str6, String str7, int i13, boolean z10, long j10, String str8) {
        if (1023 != (i10 & 1023)) {
            wf.z0.i(i10, 1023, n.f2930b);
            throw null;
        }
        this.f2937a = str;
        this.f2938b = str2;
        this.f2939c = i11;
        this.f2940d = str3;
        this.f2941e = i12;
        this.f2942f = str4;
        this.f2943g = str5;
        this.f2944h = str6;
        this.f2945i = str7;
        this.f2946j = i13;
        if ((i10 & 1024) == 0) {
            this.f2947k = false;
        } else {
            this.f2947k = z10;
        }
        this.f2948l = (i10 & 2048) == 0 ? 0L : j10;
        if ((i10 & 4096) == 0) {
            this.f2949m = null;
        } else {
            this.f2949m = str8;
        }
    }

    public final boolean a() {
        String str = this.f2942f;
        return jc.l.a(str, "__SYS_PLAYLIST_LIKED") || jc.l.a(str, "__SYS_PLAYLIST_MARKED");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return jc.l.a(this.f2937a, pVar.f2937a) && jc.l.a(this.f2938b, pVar.f2938b) && this.f2939c == pVar.f2939c && jc.l.a(this.f2940d, pVar.f2940d) && this.f2941e == pVar.f2941e && jc.l.a(this.f2942f, pVar.f2942f) && jc.l.a(this.f2943g, pVar.f2943g) && jc.l.a(this.f2944h, pVar.f2944h) && jc.l.a(this.f2945i, pVar.f2945i) && this.f2946j == pVar.f2946j && this.f2947k == pVar.f2947k && this.f2948l == pVar.f2948l && jc.l.a(this.f2949m, pVar.f2949m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [int] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    public final int hashCode() {
        int iE = (j2.h0.e(j2.h0.e(j2.h0.e(j2.h0.e((j2.h0.e((j2.h0.e(this.f2937a.hashCode() * 31, 31, this.f2938b) + this.f2939c) * 31, 31, this.f2940d) + this.f2941e) * 31, 31, this.f2942f), 31, this.f2943g), 31, this.f2944h), 31, this.f2945i) + this.f2946j) * 31;
        boolean z10 = this.f2947k;
        ?? r22 = z10;
        if (z10) {
            r22 = 1;
        }
        long j10 = this.f2948l;
        int i10 = (((iE + r22) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        String str = this.f2949m;
        return i10 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayList(id=");
        sb.append(this.f2937a);
        sb.append(", user_name=");
        sb.append(this.f2938b);
        sb.append(", privacy=");
        sb.append(this.f2939c);
        sb.append(", locale=");
        sb.append(this.f2940d);
        sb.append(", playback_count=");
        sb.append(this.f2941e);
        sb.append(", name=");
        sb.append(this.f2942f);
        sb.append(", description=");
        sb.append(this.f2943g);
        sb.append(", created_at=");
        sb.append(this.f2944h);
        sb.append(", updated_at=");
        sb.append(this.f2945i);
        sb.append(", works_count=");
        sb.append(this.f2946j);
        sb.append(", exist=");
        sb.append(this.f2947k);
        sb.append(", latestWorkID=");
        sb.append(this.f2948l);
        sb.append(", mainCoverUrl=");
        return q.t0.E(sb, this.f2949m, ')');
    }

    public p(String str, String str2, int i10, String str3, int i11, String str4, String str5, String str6, String str7, int i12, boolean z10, long j10, String str8) {
        jc.l.e(str, "id");
        jc.l.e(str2, "user_name");
        jc.l.e(str3, "locale");
        jc.l.e(str6, "created_at");
        jc.l.e(str7, "updated_at");
        this.f2937a = str;
        this.f2938b = str2;
        this.f2939c = i10;
        this.f2940d = str3;
        this.f2941e = i11;
        this.f2942f = str4;
        this.f2943g = str5;
        this.f2944h = str6;
        this.f2945i = str7;
        this.f2946j = i12;
        this.f2947k = z10;
        this.f2948l = j10;
        this.f2949m = str8;
    }
}
