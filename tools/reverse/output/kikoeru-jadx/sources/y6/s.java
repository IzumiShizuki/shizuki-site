package y6;

import java.util.Collections;
import m4.o0;
import m4.p0;
import m7.k0;
import r5.h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p4.s f25787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p4.r f25788d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h0 f25789e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f25790f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public m4.q f25791g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f25792h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f25793i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f25794j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f25795k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f25796l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f25797m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f25798n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f25799o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f25800p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f25801q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f25802r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f25803s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f25804t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f25805u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f25806v;

    public s(int i10, String str) {
        this.f25785a = str;
        this.f25786b = i10;
        p4.s sVar = new p4.s(1024);
        this.f25787c = sVar;
        byte[] bArr = sVar.f16611a;
        this.f25788d = new p4.r(bArr, bArr.length);
        this.f25796l = -9223372036854775807L;
    }

    @Override // y6.h
    public final void a() {
        this.f25792h = 0;
        this.f25796l = -9223372036854775807L;
        this.f25797m = false;
    }

    @Override // y6.h
    public final void b(p4.s sVar) throws p0 {
        int i10;
        boolean zH;
        p4.c.j(this.f25789e);
        while (sVar.a() > 0) {
            int i11 = this.f25792h;
            if (i11 != 0) {
                if (i11 != 1) {
                    p4.s sVar2 = this.f25787c;
                    p4.r rVar = this.f25788d;
                    if (i11 == 2) {
                        int iU = ((this.f25795k & (-225)) << 8) | sVar.u();
                        this.f25794j = iU;
                        if (iU > sVar2.f16611a.length) {
                            sVar2.D(iU);
                            byte[] bArr = sVar2.f16611a;
                            rVar.getClass();
                            rVar.p(bArr, bArr.length);
                        }
                        this.f25793i = 0;
                        this.f25792h = 3;
                    } else {
                        if (i11 != 3) {
                            throw new IllegalStateException();
                        }
                        int iMin = Math.min(sVar.a(), this.f25794j - this.f25793i);
                        sVar.e(rVar.f16606d, this.f25793i, iMin);
                        int i12 = this.f25793i + iMin;
                        this.f25793i = i12;
                        if (i12 == this.f25794j) {
                            rVar.q(0);
                            if (rVar.h()) {
                                if (this.f25797m) {
                                }
                                this.f25792h = 0;
                            } else {
                                this.f25797m = true;
                                int i13 = rVar.i(1);
                                int i14 = i13 == 1 ? rVar.i(1) : 0;
                                this.f25798n = i14;
                                if (i14 != 0) {
                                    throw p0.a(null, null);
                                }
                                if (i13 == 1) {
                                    rVar.i((rVar.i(2) + 1) * 8);
                                }
                                if (!rVar.h()) {
                                    throw p0.a(null, null);
                                }
                                this.f25799o = rVar.i(6);
                                int i15 = rVar.i(4);
                                int i16 = rVar.i(3);
                                if (i15 != 0 || i16 != 0) {
                                    throw p0.a(null, null);
                                }
                                if (i13 == 0) {
                                    int iG = rVar.g();
                                    int iB = rVar.b();
                                    r5.a aVarM = r5.b.m(rVar, true);
                                    this.f25806v = aVarM.f18747a;
                                    this.f25803s = aVarM.f18748b;
                                    this.f25805u = aVarM.f18749c;
                                    int iB2 = iB - rVar.b();
                                    rVar.q(iG);
                                    byte[] bArr2 = new byte[(iB2 + 7) / 8];
                                    rVar.j(bArr2, iB2);
                                    m4.p pVar = new m4.p();
                                    pVar.f14476a = this.f25790f;
                                    pVar.f14487l = o0.p("video/mp2t");
                                    pVar.f14488m = o0.p("audio/mp4a-latm");
                                    pVar.f14485j = this.f25806v;
                                    pVar.C = this.f25805u;
                                    pVar.D = this.f25803s;
                                    pVar.f14491p = Collections.singletonList(bArr2);
                                    pVar.f14479d = this.f25785a;
                                    pVar.f14481f = this.f25786b;
                                    m4.q qVar = new m4.q(pVar);
                                    if (!qVar.equals(this.f25791g)) {
                                        this.f25791g = qVar;
                                        this.f25804t = 1024000000 / ((long) qVar.E);
                                        this.f25789e.b(qVar);
                                    }
                                } else {
                                    int iB3 = rVar.b();
                                    r5.a aVarM2 = r5.b.m(rVar, true);
                                    this.f25806v = aVarM2.f18747a;
                                    this.f25803s = aVarM2.f18748b;
                                    this.f25805u = aVarM2.f18749c;
                                    rVar.t(rVar.i((rVar.i(2) + 1) * 8) - (iB3 - rVar.b()));
                                }
                                int i17 = rVar.i(3);
                                this.f25800p = i17;
                                if (i17 == 0) {
                                    rVar.t(8);
                                } else if (i17 == 1) {
                                    rVar.t(9);
                                } else if (i17 == 3 || i17 == 4 || i17 == 5) {
                                    rVar.t(6);
                                } else {
                                    if (i17 != 6 && i17 != 7) {
                                        throw new IllegalStateException();
                                    }
                                    rVar.t(1);
                                }
                                boolean zH2 = rVar.h();
                                this.f25801q = zH2;
                                this.f25802r = 0L;
                                if (zH2) {
                                    if (i13 == 1) {
                                        this.f25802r = rVar.i((rVar.i(2) + 1) * 8);
                                    } else {
                                        do {
                                            zH = rVar.h();
                                            this.f25802r = (this.f25802r << 8) + ((long) rVar.i(8));
                                        } while (zH);
                                    }
                                }
                                if (rVar.h()) {
                                    rVar.t(8);
                                }
                            }
                            if (this.f25798n != 0) {
                                throw p0.a(null, null);
                            }
                            if (this.f25799o != 0) {
                                throw p0.a(null, null);
                            }
                            if (this.f25800p != 0) {
                                throw p0.a(null, null);
                            }
                            int i18 = 0;
                            do {
                                i10 = rVar.i(8);
                                i18 += i10;
                            } while (i10 == 255);
                            int iG2 = rVar.g();
                            if ((iG2 & 7) == 0) {
                                sVar2.G(iG2 >> 3);
                            } else {
                                rVar.j(sVar2.f16611a, i18 * 8);
                                sVar2.G(0);
                            }
                            this.f25789e.e(i18, sVar2);
                            p4.c.i(this.f25796l != -9223372036854775807L);
                            this.f25789e.a(this.f25796l, 1, i18, 0, null);
                            this.f25796l += this.f25804t;
                            if (this.f25801q) {
                                rVar.t((int) this.f25802r);
                            }
                            this.f25792h = 0;
                        } else {
                            continue;
                        }
                    }
                } else {
                    int iU2 = sVar.u();
                    if ((iU2 & 224) == 224) {
                        this.f25795k = iU2;
                        this.f25792h = 2;
                    } else if (iU2 != 86) {
                        this.f25792h = 0;
                    }
                }
            } else if (sVar.u() == 86) {
                this.f25792h = 1;
            }
        }
    }

    @Override // y6.h
    public final void c(r5.q qVar, k0 k0Var) {
        k0Var.b();
        k0Var.d();
        this.f25789e = qVar.u(k0Var.f14908c, 1);
        k0Var.d();
        this.f25790f = (String) k0Var.f14910e;
    }

    @Override // y6.h
    public final void e(int i10, long j10) {
        this.f25796l = j10;
    }

    @Override // y6.h
    public final void d(boolean z10) {
    }
}
