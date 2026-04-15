package l0;

import j2.v2;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a1 f11611a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public y1.a f11615e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ic.k f11616f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public v2 f11617g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p1.b f11620j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public g2.c0 f11621k;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public l0 f11628r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f11629s;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x0.e1 f11612b = x0.v.v(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x0.e1 f11613c = x0.v.v(Boolean.TRUE);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public jc.m f11614d = new z(this, 8);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o1.r f11618h = new o1.r();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final x0.e1 f11619i = x0.v.v(Boolean.FALSE);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final x0.e1 f11622l = x0.v.v(new p1.b(0));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final x0.e1 f11623m = x0.v.v(new p1.b(0));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final x0.e1 f11624n = x0.v.v(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final x0.e1 f11625o = x0.v.v(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x0.e1 f11626p = x0.v.v(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x0.e1 f11627q = x0.v.v(null);

    public s0(a1 a1Var) {
        this.f11611a = a1Var;
        int i10 = 1;
        a1Var.f11414e = new z(this, i10);
        a1Var.f11415f = new k1.o(i10, this);
        a1Var.f11416g = new q0(this);
        a1Var.f11417h = new x(this, 2);
        a1Var.f11418i = new z(this, 2);
        a1Var.f11419j = new z(this, 3);
    }

    public static final long a(s0 s0Var, g2.c0 c0Var, long j10) {
        g2.c0 c0Var2 = s0Var.f11621k;
        if (c0Var2 == null || !c0Var2.h()) {
            return 9205357640488583168L;
        }
        return s0Var.j().o(c0Var, j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r10 = this;
            l0.r r0 = r10.e()
            r1 = 0
            if (r0 == 0) goto L62
            l0.a1 r0 = r10.f11611a
            o.c0 r2 = r0.a()
            int r2 = r2.f15933e
            if (r2 != 0) goto L12
            goto L62
        L12:
            t2.d r2 = new t2.d
            r2.<init>()
            g2.c0 r3 = r10.j()
            java.util.ArrayList r3 = r0.c(r3)
            int r4 = r3.size()
            r5 = 0
        L24:
            if (r5 >= r4) goto L5d
            java.lang.Object r6 = r3.get(r5)
            l0.n r6 = (l0.n) r6
            o.c0 r7 = r0.a()
            long r8 = r6.f11568a
            java.lang.Object r7 = r7.e(r8)
            l0.r r7 = (l0.r) r7
            if (r7 == 0) goto L5a
            l0.q r8 = r7.f11602a
            l0.q r9 = r7.f11603b
            t2.g r6 = r6.d()
            boolean r7 = r7.f11604c
            if (r7 == 0) goto L4f
            int r7 = r9.f11597b
            int r8 = r8.f11597b
            t2.g r6 = r6.subSequence(r7, r8)
            goto L57
        L4f:
            int r7 = r8.f11597b
            int r8 = r9.f11597b
            t2.g r6 = r6.subSequence(r7, r8)
        L57:
            r2.a(r6)
        L5a:
            int r5 = r5 + 1
            goto L24
        L5d:
            t2.g r0 = r2.c()
            goto L63
        L62:
            r0 = r1
        L63:
            if (r0 == 0) goto L77
            java.lang.String r2 = r0.f20320b
            int r2 = r2.length()
            if (r2 <= 0) goto L6e
            r1 = r0
        L6e:
            if (r1 == 0) goto L77
            ic.k r0 = r10.f11616f
            if (r0 == 0) goto L77
            r0.a(r1)
        L77:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.s0.b():void");
    }

    public final n c(q qVar) {
        return (n) this.f11611a.f11412c.e(qVar.f11598c);
    }

    public final h0.h0 d() {
        return (h0.h0) this.f11626p.getValue();
    }

    public final r e() {
        return (r) this.f11612b.getValue();
    }

    public final boolean f() {
        r rVar;
        g2.c0 c0VarJ = j();
        a1 a1Var = this.f11611a;
        ArrayList arrayListC = a1Var.c(c0VarJ);
        if (arrayListC.isEmpty()) {
            return true;
        }
        int size = arrayListC.size();
        for (int i10 = 0; i10 < size; i10++) {
            n nVar = (n) arrayListC.get(i10);
            t2.g gVarD = nVar.d();
            if (gVarD.f20320b.length() != 0 && ((rVar = (r) a1Var.a().e(nVar.f11568a)) == null || Math.abs(rVar.f11602a.f11597b - rVar.f11603b.f11597b) != gVarD.f20320b.length())) {
                return false;
            }
        }
        return true;
    }

    public final boolean g() {
        return ((Boolean) this.f11613c.getValue()).booleanValue();
    }

    public final boolean h() {
        r rVarE = e();
        if (rVarE != null) {
            q qVar = rVarE.f11603b;
            q qVar2 = rVarE.f11602a;
            if (!jc.l.a(qVar2, qVar)) {
                if (qVar2.f11598c == qVar.f11598c) {
                    return true;
                }
                g2.c0 c0VarJ = j();
                a1 a1Var = this.f11611a;
                ArrayList arrayListC = a1Var.c(c0VarJ);
                int size = arrayListC.size();
                for (int i10 = 0; i10 < size; i10++) {
                    r rVar = (r) a1Var.a().e(((n) arrayListC.get(i10)).f11568a);
                    if (rVar != null && rVar.f11602a.f11597b != rVar.f11603b.f11597b) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [ic.k, jc.m] */
    public final void i() {
        y1.a aVar;
        o.c0 c0Var = o.q.f16031a;
        jc.l.c(c0Var, "null cannot be cast to non-null type androidx.collection.LongObjectMap<V of androidx.collection.LongObjectMapKt.emptyLongObjectMap>");
        this.f11611a.f11420k.setValue(c0Var);
        this.f11629s = false;
        p();
        if (e() != null) {
            this.f11614d.a(null);
            if (!g() || (aVar = this.f11615e) == null) {
                return;
            }
            aVar.a(9);
        }
    }

    public final g2.c0 j() {
        g2.c0 c0Var = this.f11621k;
        if (c0Var == null) {
            x.a.b("null coordinates");
            throw new ce.j0();
        }
        if (!c0Var.h()) {
            x.a.a("unattached coordinates");
        }
        return c0Var;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [ic.k, jc.m] */
    public final void k() {
        r rVar;
        ArrayList arrayList;
        int i10;
        g2.c0 c0VarJ = j();
        a1 a1Var = this.f11611a;
        ArrayList arrayListC = a1Var.c(c0VarJ);
        if (arrayListC.isEmpty()) {
            return;
        }
        o.c0 c0Var = o.q.f16031a;
        o.c0 c0Var2 = new o.c0();
        int size = arrayListC.size();
        int i11 = 0;
        r rVar2 = null;
        r rVar3 = null;
        while (i11 < size) {
            n nVar = (n) arrayListC.get(i11);
            long j10 = nVar.f11568a;
            t2.i0 i0Var = (t2.i0) nVar.f11570c.b();
            if (i0Var == null) {
                arrayList = arrayListC;
                i10 = size;
                rVar = null;
            } else {
                int length = i0Var.f20344a.f20326a.f20320b.length();
                arrayList = arrayListC;
                i10 = size;
                rVar = new r(new q(i0Var.a(0), 0, j10), new q(i0Var.a(Math.max(length - 1, 0)), length, j10), false);
            }
            if (rVar != null) {
                if (rVar2 == null) {
                    rVar2 = rVar;
                }
                long j11 = nVar.f11568a;
                int iC = c0Var2.c(j11);
                Object[] objArr = c0Var2.f15931c;
                Object obj = objArr[iC];
                c0Var2.f15930b[iC] = j11;
                objArr[iC] = rVar;
                rVar3 = rVar;
            }
            i11++;
            arrayListC = arrayList;
            size = i10;
        }
        if (c0Var2.f15933e == 0) {
            return;
        }
        if (rVar2 != rVar3) {
            jc.l.b(rVar2);
            q qVar = rVar2.f11602a;
            jc.l.b(rVar3);
            rVar2 = new r(qVar, rVar3.f11603b, false);
        }
        a1Var.f11420k.setValue(c0Var2);
        this.f11614d.a(rVar2);
        this.f11628r = null;
    }

    public final void l(boolean z10) {
        x0.e1 e1Var = this.f11613c;
        if (((Boolean) e1Var.getValue()).booleanValue() != z10) {
            e1Var.setValue(Boolean.valueOf(z10));
            p();
        }
    }

    public final void m(r rVar) {
        this.f11612b.setValue(rVar);
        if (rVar != null) {
            n();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n() {
        /*
            r20 = this;
            r0 = r20
            l0.r r1 = r0.e()
            g2.c0 r2 = r0.f11621k
            r3 = 0
            if (r1 == 0) goto L14
            l0.q r4 = r1.f11602a
            if (r4 == 0) goto L14
            l0.n r4 = r0.c(r4)
            goto L15
        L14:
            r4 = r3
        L15:
            if (r1 == 0) goto L20
            l0.q r5 = r1.f11603b
            if (r5 == 0) goto L20
            l0.n r5 = r0.c(r5)
            goto L21
        L20:
            r5 = r3
        L21:
            if (r4 == 0) goto L28
            g2.c0 r6 = r4.c()
            goto L29
        L28:
            r6 = r3
        L29:
            if (r5 == 0) goto L30
            g2.c0 r7 = r5.c()
            goto L31
        L30:
            r7 = r3
        L31:
            x0.e1 r8 = r0.f11625o
            x0.e1 r9 = r0.f11624n
            if (r1 == 0) goto Lab
            if (r2 == 0) goto Lab
            boolean r10 = r2.h()
            if (r10 == 0) goto Lab
            if (r6 != 0) goto L44
            if (r7 != 0) goto L44
            goto Lab
        L44:
            p1.c r10 = l0.u0.y(r2)
            r13 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            if (r6 == 0) goto L78
            r15 = 1
            r16 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            long r11 = r4.a(r1, r15)
            long r18 = r11 & r13
            int r4 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r4 != 0) goto L60
            goto L7d
        L60:
            long r11 = r2.o(r6, r11)
            p1.b r4 = new p1.b
            r4.<init>(r11)
            h0.h0 r6 = r0.d()
            h0.h0 r15 = h0.h0.f7647b
            if (r6 == r15) goto L7e
            boolean r6 = l0.u0.p(r10, r11)
            if (r6 == 0) goto L7d
            goto L7e
        L78:
            r16 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
        L7d:
            r4 = r3
        L7e:
            r9.setValue(r4)
            if (r7 == 0) goto La7
            r4 = 0
            long r4 = r5.a(r1, r4)
            long r11 = r4 & r13
            int r1 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r1 != 0) goto L8f
            goto La7
        L8f:
            long r1 = r2.o(r7, r4)
            p1.b r4 = new p1.b
            r4.<init>(r1)
            h0.h0 r5 = r0.d()
            h0.h0 r6 = h0.h0.f7648c
            if (r5 == r6) goto La6
            boolean r1 = l0.u0.p(r10, r1)
            if (r1 == 0) goto La7
        La6:
            r3 = r4
        La7:
            r8.setValue(r3)
            return
        Lab:
            r9.setValue(r3)
            r8.setValue(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.s0.n():void");
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [ic.k, jc.m] */
    public final boolean o(long j10, long j11, boolean z10, s sVar) {
        ArrayList arrayList;
        l0 e1Var;
        t2.i0 i0Var;
        long j12;
        ArrayList arrayList2;
        int i10;
        float f10;
        j jVar;
        m0 m0Var;
        long j13;
        j jVarN;
        j jVar2;
        j jVar3;
        j jVar4;
        boolean z11;
        int i11;
        ArrayList arrayList3;
        j jVar5;
        j jVar6;
        j jVar7;
        m0 m0Var2;
        int i12;
        int iS;
        q qVar;
        q qVar2;
        this.f11626p.setValue(z10 ? h0.h0.f7647b : h0.h0.f7648c);
        this.f11627q.setValue(new p1.b(j10));
        g2.c0 c0VarJ = j();
        a1 a1Var = this.f11611a;
        ArrayList arrayListC = a1Var.c(c0VarJ);
        int i13 = o.p.f16029a;
        o.a0 a0Var = new o.a0(6);
        int size = arrayListC.size();
        for (int i14 = 0; i14 < size; i14++) {
            a0Var.e(i14, ((n) arrayListC.get(i14)).f11568a);
        }
        long j14 = 9223372034707292159L;
        m0 m0Var3 = new m0(j10, j11, c0VarJ, z10, (j11 & 9223372034707292159L) == 9205357640488583168L ? null : e(), new j9.l(1, a0Var));
        int size2 = arrayListC.size();
        int i15 = 0;
        while (true) {
            arrayList = m0Var3.f11562h;
            if (i15 >= size2) {
                break;
            }
            n nVar = (n) arrayListC.get(i15);
            g2.c0 c0VarC = nVar.c();
            if (c0VarC == null || (i0Var = (t2.i0) nVar.f11570c.b()) == null) {
                i10 = size2;
                i11 = i15;
                arrayList2 = arrayListC;
                j12 = j14;
                m0Var2 = m0Var3;
            } else {
                j12 = j14;
                long jO = m0Var3.f11557c.o(c0VarC, 0L);
                long jH = p1.b.h(m0Var3.f11555a, jO);
                arrayList2 = arrayListC;
                long j15 = m0Var3.f11556b;
                long jH2 = (j15 & j12) == 9205357640488583168L ? 9205357640488583168L : p1.b.h(j15, jO);
                long j16 = nVar.f11568a;
                long j17 = i0Var.f20346c;
                float f11 = (int) (j17 >> 32);
                float f12 = (int) (j17 & 4294967295L);
                i10 = size2;
                int i16 = i15;
                int i17 = (int) (jH >> 32);
                float fIntBitsToFloat = Float.intBitsToFloat(i17);
                j jVar8 = j.f11509c;
                j jVar9 = j.f11507a;
                j jVar10 = j.f11508b;
                if (fIntBitsToFloat < 0.0f) {
                    f10 = f12;
                    jVar = jVar9;
                } else if (Float.intBitsToFloat(i17) > f11) {
                    f10 = f12;
                    jVar = jVar9;
                    jVar9 = jVar8;
                } else {
                    f10 = f12;
                    jVar = jVar9;
                    jVar9 = jVar10;
                }
                int i18 = (int) (jH & 4294967295L);
                j jVar11 = Float.intBitsToFloat(i18) < 0.0f ? jVar : Float.intBitsToFloat(i18) > f10 ? jVar8 : jVar10;
                boolean z12 = m0Var3.f11558d;
                r rVar = m0Var3.f11559e;
                if (z12) {
                    m0Var = m0Var3;
                    j13 = j16;
                    jVarN = u0.n(jVar9, jVar11, m0Var, j13, rVar != null ? rVar.f11603b : null);
                    i11 = i16;
                    arrayList3 = arrayList;
                    jVar2 = jVar9;
                    jVar4 = jVar2;
                    jVar7 = jVar11;
                    jVar3 = jVar7;
                    jVar5 = jVarN;
                    z11 = z12;
                    jVar6 = jVar5;
                } else {
                    m0Var = m0Var3;
                    j13 = j16;
                    jVarN = u0.n(jVar9, jVar11, m0Var, j13, rVar != null ? rVar.f11602a : null);
                    jVar2 = jVar9;
                    jVar3 = jVar11;
                    jVar4 = jVarN;
                    z11 = z12;
                    i11 = i16;
                    arrayList3 = arrayList;
                    jVar5 = jVar3;
                    jVar6 = jVar2;
                    jVar7 = jVar4;
                }
                m0Var2 = m0Var;
                j jVarX = u0.x(jVar2, jVar3);
                if (jVarX == jVar10 || jVarX != jVarN) {
                    int length = i0Var.f20344a.f20326a.f20320b.length();
                    j9.l lVar = m0Var2.f11560f;
                    if (z11) {
                        iS = u0.s(jH, i0Var);
                        if (rVar == null || (qVar2 = rVar.f11603b) == null) {
                            length = iS;
                        } else {
                            int iCompare = lVar.compare(Long.valueOf(qVar2.f11598c), Long.valueOf(j13));
                            if (iCompare < 0) {
                                length = 0;
                            } else if (iCompare <= 0) {
                                length = qVar2.f11597b;
                            }
                        }
                        i12 = length;
                    } else {
                        int iS2 = u0.s(jH, i0Var);
                        if (rVar == null || (qVar = rVar.f11602a) == null) {
                            length = iS2;
                        } else {
                            int iCompare2 = lVar.compare(Long.valueOf(qVar.f11598c), Long.valueOf(j13));
                            if (iCompare2 < 0) {
                                length = 0;
                            } else if (iCompare2 <= 0) {
                                length = qVar.f11597b;
                            }
                        }
                        i12 = iS2;
                        iS = length;
                    }
                    int iS3 = (jH2 & j12) == 9205357640488583168L ? -1 : u0.s(jH2, i0Var);
                    int i19 = m0Var2.f11565k + 2;
                    m0Var2.f11565k = i19;
                    long j18 = j13;
                    p pVar = new p(j18, i19, iS, i12, iS3, i0Var);
                    m0Var2.f11563i = m0Var2.a(m0Var2.f11563i, jVar4, jVar7);
                    m0Var2.f11564j = m0Var2.a(m0Var2.f11564j, jVar6, jVar5);
                    m0Var2.f11561g.e(arrayList3.size(), j18);
                    arrayList3.add(pVar);
                }
            }
            i15 = i11 + 1;
            size2 = i10;
            m0Var3 = m0Var2;
            j14 = j12;
            arrayListC = arrayList2;
        }
        m0 m0Var4 = m0Var3;
        int i20 = m0Var4.f11565k + 1;
        int size3 = arrayList.size();
        if (size3 == 0) {
            e1Var = null;
        } else if (size3 != 1) {
            int i21 = m0Var4.f11563i;
            int i22 = i21 == -1 ? i20 : i21;
            int i23 = m0Var4.f11564j;
            e1Var = new m(m0Var4.f11561g, arrayList, i22, i23 == -1 ? i20 : i23, m0Var4.f11558d, m0Var4.f11559e);
        } else {
            p pVar2 = (p) vb.m.x0(arrayList);
            int i24 = m0Var4.f11563i;
            int i25 = i24 == -1 ? i20 : i24;
            int i26 = m0Var4.f11564j;
            e1Var = new e1(m0Var4.f11558d, i25, i26 == -1 ? i20 : i26, m0Var4.f11559e, pVar2);
        }
        if (e1Var == null || !e1Var.i(this.f11628r)) {
            return false;
        }
        r rVarA = sVar.a(e1Var);
        if (!jc.l.a(rVarA, e())) {
            if (g()) {
                ArrayList arrayList4 = a1Var.f11411b;
                int size4 = arrayList4.size();
                int i27 = 0;
                while (true) {
                    if (i27 >= size4) {
                        break;
                    }
                    if (((n) arrayList4.get(i27)).d().f20320b.length() > 0) {
                        y1.a aVar = this.f11615e;
                        if (aVar != null) {
                            aVar.a(9);
                        }
                    } else {
                        i27++;
                    }
                }
            }
            a1Var.f11420k.setValue(e1Var.h(rVarA));
            this.f11614d.a(rVarA);
        }
        this.f11628r = e1Var;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p() {
        /*
            Method dump skipped, instruction units count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.s0.p():void");
    }
}
