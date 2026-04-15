package w1;

import x0.e1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f23171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f23172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f23173d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f23174e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public jc.m f23175f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e1 f23176g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public q1.k f23177h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e1 f23178i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f23179j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f23180k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f23181l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d0 f23182m;

    public e0(c cVar) {
        this.f23171b = cVar;
        cVar.f23136i = new d0(this, 0);
        this.f23172c = "";
        this.f23173d = true;
        this.f23174e = new a();
        this.f23175f = g.f23206d;
        this.f23176g = x0.v.v(null);
        this.f23178i = x0.v.v(new p1.e(0L));
        this.f23179j = 9205357640488583168L;
        this.f23180k = 1.0f;
        this.f23181l = 1.0f;
        this.f23182m = new d0(this, 1);
    }

    @Override // w1.c0
    public final void a(s1.d dVar) {
        e(dVar, 1.0f, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(s1.d r31, float r32, q1.k r33) {
        /*
            Method dump skipped, instruction units count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.e0.e(s1.d, float, q1.k):void");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.f23172c);
        sb.append("\n\tviewportWidth: ");
        e1 e1Var = this.f23178i;
        sb.append(Float.intBitsToFloat((int) (((p1.e) e1Var.getValue()).f16495a >> 32)));
        sb.append("\n\tviewportHeight: ");
        sb.append(Float.intBitsToFloat((int) (((p1.e) e1Var.getValue()).f16495a & 4294967295L)));
        sb.append("\n");
        String string = sb.toString();
        jc.l.d(string, "toString(...)");
        return string;
    }
}
