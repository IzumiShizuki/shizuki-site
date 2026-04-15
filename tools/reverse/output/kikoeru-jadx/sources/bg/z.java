package bg;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@sf.g
public final class z extends k0 {
    public static final y Companion = new y();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f2996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f2997e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f2998f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f2999g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f3000h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f3001i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f3002j;

    public z(int i10, String str, String str2, String str3, String str4, String str5, String str6, float f10) {
        if (31 != (i10 & 31)) {
            wf.z0.i(i10, 31, x.f2991b);
            throw null;
        }
        this.f2996d = str;
        this.f2997e = str2;
        this.f2998f = str3;
        this.f2999g = str4;
        this.f3000h = str5;
        if ((i10 & 32) == 0) {
            this.f3001i = null;
        } else {
            this.f3001i = str6;
        }
        if ((i10 & 64) == 0) {
            this.f3002j = 0.0f;
        } else {
            this.f3002j = f10;
        }
    }

    @Override // bg.o0
    public final String a() {
        return this.f2996d;
    }

    @Override // bg.k0
    public final String b() {
        return this.f2997e;
    }

    @Override // bg.k0
    public final String c() {
        return this.f3000h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return jc.l.a(this.f2996d, zVar.f2996d) && jc.l.a(this.f2997e, zVar.f2997e) && jc.l.a(this.f2998f, zVar.f2998f) && jc.l.a(this.f2999g, zVar.f2999g) && jc.l.a(this.f3000h, zVar.f3000h) && jc.l.a(this.f3001i, zVar.f3001i) && Float.valueOf(this.f3002j).equals(Float.valueOf(zVar.f3002j));
    }

    public final int hashCode() {
        int iE = j2.h0.e(j2.h0.e(j2.h0.e(j2.h0.e(this.f2996d.hashCode() * 31, 31, this.f2997e), 31, this.f2998f), 31, this.f2999g), 31, this.f3000h);
        String str = this.f3001i;
        return Float.floatToIntBits(this.f3002j) + ((iE + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Audio(title=");
        sb.append(this.f2996d);
        sb.append(", hash=");
        sb.append(this.f2997e);
        sb.append(", workTitle=");
        sb.append(this.f2998f);
        sb.append(", mediaStreamUrl=");
        sb.append(this.f2999g);
        sb.append(", mediaDownloadUrl=");
        sb.append(this.f3000h);
        sb.append(", streamLowQualityUrl=");
        sb.append(this.f3001i);
        sb.append(", duration=");
        return j2.h0.l(sb, this.f3002j, ')');
    }
}
