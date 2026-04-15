package l0;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t2.g f11472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t2.i0 f11474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y2.r f11475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p1 f11476e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f11477f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t2.g f11478g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y2.y f11479h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final h0.r1 f11480i;

    public f1(y2.y yVar, y2.r rVar, h0.r1 r1Var, p1 p1Var) {
        t2.g gVar = yVar.f25434a;
        long j10 = yVar.f25435b;
        t2.i0 i0Var = r1Var != null ? r1Var.f7827a : null;
        this.f11472a = gVar;
        this.f11473b = j10;
        this.f11474c = i0Var;
        this.f11475d = rVar;
        this.f11476e = p1Var;
        this.f11477f = j10;
        this.f11478g = gVar;
        this.f11479h = yVar;
        this.f11480i = r1Var;
    }

    public final List a(ic.k kVar) {
        if (!t2.k0.b(this.f11477f)) {
            return ud.b.x(new y2.a(0, ""), new y2.x(t2.k0.e(this.f11477f), t2.k0.e(this.f11477f)));
        }
        y2.g gVar = (y2.g) kVar.a(this);
        if (gVar != null) {
            return ud.b.w(gVar);
        }
        return null;
    }

    public final Integer b() {
        t2.i0 i0Var = this.f11474c;
        if (i0Var == null) {
            return null;
        }
        t2.n nVar = i0Var.f20345b;
        int iD = t2.k0.d(this.f11477f);
        y2.r rVar = this.f11475d;
        return Integer.valueOf(rVar.i(nVar.c(nVar.d(rVar.p(iD)), true)));
    }

    public final Integer c() {
        t2.i0 i0Var = this.f11474c;
        if (i0Var == null) {
            return null;
        }
        int iE = t2.k0.e(this.f11477f);
        y2.r rVar = this.f11475d;
        return Integer.valueOf(rVar.i(i0Var.g(i0Var.f20345b.d(rVar.p(iE)))));
    }

    public final Integer d() {
        int length;
        t2.i0 i0Var = this.f11474c;
        if (i0Var == null) {
            return null;
        }
        int iQ = q();
        while (true) {
            t2.g gVar = this.f11472a;
            if (iQ < gVar.f20320b.length()) {
                int length2 = this.f11478g.f20320b.length() - 1;
                if (iQ <= length2) {
                    length2 = iQ;
                }
                long j10 = i0Var.j(length2);
                int i10 = t2.k0.f20357c;
                int i11 = (int) (j10 & 4294967295L);
                if (i11 > iQ) {
                    length = this.f11475d.i(i11);
                    break;
                }
                iQ++;
            } else {
                length = gVar.f20320b.length();
                break;
            }
        }
        return Integer.valueOf(length);
    }

    public final Integer e() {
        int i10;
        t2.i0 i0Var = this.f11474c;
        if (i0Var == null) {
            return null;
        }
        int iQ = q();
        while (true) {
            if (iQ <= 0) {
                i10 = 0;
                break;
            }
            int length = this.f11478g.f20320b.length() - 1;
            if (iQ <= length) {
                length = iQ;
            }
            long j10 = i0Var.j(length);
            int i11 = t2.k0.f20357c;
            int i12 = (int) (j10 >> 32);
            if (i12 < iQ) {
                i10 = this.f11475d.i(i12);
                break;
            }
            iQ--;
        }
        return Integer.valueOf(i10);
    }

    public final boolean f() {
        t2.i0 i0Var = this.f11474c;
        return (i0Var != null ? i0Var.h(q()) : null) != e3.j.f6079b;
    }

    public final int g(t2.i0 i0Var, int i10) {
        int iQ = q();
        p1 p1Var = this.f11476e;
        if (p1Var.f11595a == null) {
            p1Var.f11595a = Float.valueOf(i0Var.c(iQ).f16483a);
        }
        t2.n nVar = i0Var.f20345b;
        int iD = nVar.d(iQ) + i10;
        if (iD < 0) {
            return 0;
        }
        if (iD >= nVar.f20371f) {
            return this.f11478g.f20320b.length();
        }
        float fB = nVar.b(iD) - 1;
        Float f10 = p1Var.f11595a;
        jc.l.b(f10);
        float fFloatValue = f10.floatValue();
        if ((f() && fFloatValue >= i0Var.f(iD)) || (!f() && fFloatValue <= i0Var.e(iD))) {
            return nVar.c(iD, true);
        }
        return this.f11475d.i(nVar.g((((long) Float.floatToRawIntBits(fB)) & 4294967295L) | (Float.floatToRawIntBits(f10.floatValue()) << 32)));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(h0.r1 r9, int r10) {
        /*
            r8 = this;
            g2.c0 r0 = r9.f7828b
            t2.i0 r1 = r9.f7827a
            if (r0 == 0) goto L13
            g2.c0 r9 = r9.f7829c
            if (r9 == 0) goto L10
            r2 = 1
            p1.c r9 = r9.s(r0, r2)
            goto L11
        L10:
            r9 = 0
        L11:
            if (r9 != 0) goto L15
        L13:
            p1.c r9 = p1.c.f16482e
        L15:
            y2.y r0 = r8.f11479h
            long r2 = r0.f25435b
            int r0 = t2.k0.f20357c
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            int r0 = (int) r2
            y2.r r2 = r8.f11475d
            int r0 = r2.p(r0)
            p1.c r0 = r1.c(r0)
            float r3 = r0.f16483a
            float r0 = r0.f16484b
            long r6 = r9.c()
            long r6 = r6 & r4
            int r9 = (int) r6
            float r9 = java.lang.Float.intBitsToFloat(r9)
            float r10 = (float) r10
            float r9 = r9 * r10
            float r9 = r9 + r0
            int r10 = java.lang.Float.floatToRawIntBits(r3)
            long r6 = (long) r10
            int r9 = java.lang.Float.floatToRawIntBits(r9)
            long r9 = (long) r9
            r0 = 32
            long r6 = r6 << r0
            long r9 = r9 & r4
            long r9 = r9 | r6
            t2.n r0 = r1.f20345b
            int r9 = r0.g(r9)
            int r9 = r2.i(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.f1.h(h0.r1, int):int");
    }

    public final void i() {
        p1 p1Var = this.f11476e;
        p1Var.f11595a = null;
        t2.g gVar = this.f11478g;
        if (gVar.f20320b.length() > 0) {
            if (f()) {
                p1Var.f11595a = null;
                if (gVar.f20320b.length() > 0) {
                    String str = gVar.f20320b;
                    long j10 = this.f11477f;
                    int i10 = t2.k0.f20357c;
                    int iR = h0.q0.r((int) (j10 & 4294967295L), str);
                    if (iR != -1) {
                        p(iR, iR);
                        return;
                    }
                    return;
                }
                return;
            }
            p1Var.f11595a = null;
            if (gVar.f20320b.length() > 0) {
                String str2 = gVar.f20320b;
                long j11 = this.f11477f;
                int i11 = t2.k0.f20357c;
                int iO = h0.q0.o((int) (j11 & 4294967295L), str2);
                if (iO != -1) {
                    p(iO, iO);
                }
            }
        }
    }

    public final void j() {
        this.f11476e.f11595a = null;
        t2.g gVar = this.f11478g;
        String str = gVar.f20320b;
        String str2 = gVar.f20320b;
        if (str.length() > 0) {
            int iP = h0.q0.p(str2, t2.k0.d(this.f11477f));
            if (iP == t2.k0.d(this.f11477f) && iP != str2.length()) {
                iP = h0.q0.p(str2, iP + 1);
            }
            p(iP, iP);
        }
    }

    public final void k() {
        this.f11476e.f11595a = null;
        t2.g gVar = this.f11478g;
        String str = gVar.f20320b;
        String str2 = gVar.f20320b;
        if (str.length() > 0) {
            int iQ = h0.q0.q(str2, t2.k0.e(this.f11477f));
            if (iQ == t2.k0.e(this.f11477f) && iQ != 0) {
                iQ = h0.q0.q(str2, iQ - 1);
            }
            p(iQ, iQ);
        }
    }

    public final void l() {
        p1 p1Var = this.f11476e;
        p1Var.f11595a = null;
        t2.g gVar = this.f11478g;
        if (gVar.f20320b.length() > 0) {
            if (f()) {
                p1Var.f11595a = null;
                if (gVar.f20320b.length() > 0) {
                    String str = gVar.f20320b;
                    long j10 = this.f11477f;
                    int i10 = t2.k0.f20357c;
                    int iO = h0.q0.o((int) (j10 & 4294967295L), str);
                    if (iO != -1) {
                        p(iO, iO);
                        return;
                    }
                    return;
                }
                return;
            }
            p1Var.f11595a = null;
            if (gVar.f20320b.length() > 0) {
                String str2 = gVar.f20320b;
                long j11 = this.f11477f;
                int i11 = t2.k0.f20357c;
                int iR = h0.q0.r((int) (j11 & 4294967295L), str2);
                if (iR != -1) {
                    p(iR, iR);
                }
            }
        }
    }

    public final void m() {
        Integer numB;
        this.f11476e.f11595a = null;
        if (this.f11478g.f20320b.length() <= 0 || (numB = b()) == null) {
            return;
        }
        int iIntValue = numB.intValue();
        p(iIntValue, iIntValue);
    }

    public final void n() {
        Integer numC;
        this.f11476e.f11595a = null;
        if (this.f11478g.f20320b.length() <= 0 || (numC = c()) == null) {
            return;
        }
        int iIntValue = numC.intValue();
        p(iIntValue, iIntValue);
    }

    public final void o() {
        if (this.f11478g.f20320b.length() > 0) {
            int i10 = t2.k0.f20357c;
            this.f11477f = t2.c0.b((int) (this.f11473b >> 32), (int) (this.f11477f & 4294967295L));
        }
    }

    public final void p(int i10, int i11) {
        this.f11477f = t2.c0.b(i10, i11);
    }

    public final int q() {
        long j10 = this.f11477f;
        int i10 = t2.k0.f20357c;
        return this.f11475d.p((int) (j10 & 4294967295L));
    }
}
