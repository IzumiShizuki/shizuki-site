package y6;

import m7.k0;
import r5.h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class u implements h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f25825e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h0 f25826f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f25829i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f25831k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f25832l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f25834n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f25835o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f25839s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f25841u;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25824d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p4.s f25821a = new p4.s(new byte[15], 2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p4.r f25822b = new p4.r();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p4.s f25823c = new p4.s();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final v f25836p = new v();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f25837q = -2147483647;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f25838r = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f25840t = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f25830j = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f25833m = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f25827g = -9.223372036854776E18d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public double f25828h = -9.223372036854776E18d;

    @Override // y6.h
    public final void a() {
        this.f25824d = 0;
        this.f25832l = 0;
        this.f25821a.D(2);
        this.f25834n = 0;
        this.f25835o = 0;
        this.f25837q = -2147483647;
        this.f25838r = -1;
        this.f25839s = 0;
        this.f25840t = -1L;
        this.f25841u = false;
        this.f25829i = false;
        this.f25833m = true;
        this.f25830j = true;
        this.f25827g = -9.223372036854776E18d;
        this.f25828h = -9.223372036854776E18d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0425  */
    @Override // y6.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(p4.s r25) throws m4.p0 {
        /*
            Method dump skipped, instruction units count: 1382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y6.u.b(p4.s):void");
    }

    @Override // y6.h
    public final void c(r5.q qVar, k0 k0Var) {
        k0Var.b();
        k0Var.d();
        this.f25825e = (String) k0Var.f14910e;
        k0Var.d();
        this.f25826f = qVar.u(k0Var.f14908c, 1);
    }

    @Override // y6.h
    public final void e(int i10, long j10) {
        this.f25831k = i10;
        if (!this.f25830j && (this.f25835o != 0 || !this.f25833m)) {
            this.f25829i = true;
        }
        if (j10 != -9223372036854775807L) {
            if (this.f25829i) {
                this.f25828h = j10;
            } else {
                this.f25827g = j10;
            }
        }
    }

    @Override // y6.h
    public final void d(boolean z10) {
    }
}
