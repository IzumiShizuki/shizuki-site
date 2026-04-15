package w1;

import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f23183k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final r5.p f23184l = new r5.p(9);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f23186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f23187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f23188d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f23189e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f0 f23190f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f23191g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f23192h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f23193i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f23194j;

    public f(String str, float f10, float f11, float f12, float f13, f0 f0Var, long j10, int i10, boolean z10) {
        int i11;
        synchronized (f23184l) {
            i11 = f23183k;
            f23183k = i11 + 1;
        }
        this.f23185a = str;
        this.f23186b = f10;
        this.f23187c = f11;
        this.f23188d = f12;
        this.f23189e = f13;
        this.f23190f = f0Var;
        this.f23191g = j10;
        this.f23192h = i10;
        this.f23193i = z10;
        this.f23194j = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return jc.l.a(this.f23185a, fVar.f23185a) && f3.f.a(this.f23186b, fVar.f23186b) && f3.f.a(this.f23187c, fVar.f23187c) && this.f23188d == fVar.f23188d && this.f23189e == fVar.f23189e && this.f23190f.equals(fVar.f23190f) && q1.q.c(this.f23191g, fVar.f23191g) && this.f23192h == fVar.f23192h && this.f23193i == fVar.f23193i;
    }

    public final int hashCode() {
        int iHashCode = (this.f23190f.hashCode() + t0.x(this.f23189e, t0.x(this.f23188d, t0.x(this.f23187c, t0.x(this.f23186b, this.f23185a.hashCode() * 31, 31), 31), 31), 31)) * 31;
        int i10 = q1.q.f17576i;
        return ((t0.y(iHashCode, 31, this.f23191g) + this.f23192h) * 31) + (this.f23193i ? 1231 : 1237);
    }
}
