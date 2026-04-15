package h1;

import java.util.ArrayList;
import java.util.HashMap;
import o.l0;
import o.t0;
import x0.k1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class c extends g {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f7985n = new int[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ic.k f7986e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ic.k f7987f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f7988g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public l0 f7989h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList f7990i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public k f7991j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int[] f7992k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f7993l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f7994m;

    public c(long j10, k kVar, ic.k kVar2, ic.k kVar3) {
        super(j10, kVar);
        this.f7986e = kVar2;
        this.f7987f = kVar3;
        this.f7991j = k.f8034e;
        this.f7992k = f7985n;
        this.f7993l = 1;
    }

    public final void A(long j10) {
        synchronized (n.f8051c) {
            this.f7991j = this.f7991j.l(j10);
        }
    }

    public final void B(k kVar) {
        synchronized (n.f8051c) {
            this.f7991j = this.f7991j.k(kVar);
        }
    }

    public void C(l0 l0Var) {
        this.f7989h = l0Var;
    }

    public c D(ic.k kVar, ic.k kVar2) throws Throwable {
        if (this.f8010c) {
            k1.a("Cannot use a disposed snapshot");
        }
        if (this.f7994m && this.f8011d < 0) {
            k1.b("Unsupported operation on a disposed or applied snapshot");
        }
        A(g());
        Object obj = n.f8051c;
        synchronized (obj) {
            try {
                long j10 = n.f8053e;
                long j11 = 1;
                n.f8053e = j10 + j11;
                n.f8052d = n.f8052d.l(j10);
                k kVarD = d();
                r(kVarD.l(j10));
                try {
                    d dVar = new d(j10, n.e(kVarD, g() + j11, j10), n.l(kVar, e(), true), n.b(kVar2, i()), this);
                    if (this.f7994m || this.f8010c) {
                        return dVar;
                    }
                    long jG = g();
                    synchronized (obj) {
                        long j12 = n.f8053e;
                        n.f8053e = j12 + j11;
                        s(j12);
                        n.f8052d = n.f8052d.l(g());
                    }
                    r(n.e(d(), jG + j11, g()));
                    return dVar;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    @Override // h1.g
    public final void b() {
        n.f8052d = n.f8052d.i(g()).a(this.f7991j);
    }

    @Override // h1.g
    public void c() {
        if (this.f8010c) {
            return;
        }
        this.f8010c = true;
        synchronized (n.f8051c) {
            o();
        }
        l();
    }

    @Override // h1.g
    public boolean f() {
        return false;
    }

    @Override // h1.g
    public int h() {
        return this.f7988g;
    }

    @Override // h1.g
    public ic.k i() {
        return this.f7987f;
    }

    @Override // h1.g
    public void k() {
        this.f7993l++;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    @Override // h1.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l() {
        /*
            r18 = this;
            r0 = r18
            int r1 = r0.f7993l
            if (r1 <= 0) goto L7
            goto Lc
        L7:
            java.lang.String r1 = "no pending nested snapshots"
            x0.k1.a(r1)
        Lc:
            int r1 = r0.f7993l
            int r1 = r1 + (-1)
            r0.f7993l = r1
            if (r1 != 0) goto L94
            boolean r1 = r0.f7994m
            if (r1 != 0) goto L94
            o.l0 r1 = r0.x()
            if (r1 == 0) goto L91
            boolean r2 = r0.f7994m
            if (r2 == 0) goto L27
            java.lang.String r2 = "Unsupported operation on a snapshot that has been applied"
            x0.k1.b(r2)
        L27:
            r2 = 0
            r0.C(r2)
            long r2 = r0.g()
            java.lang.Object[] r4 = r1.f16003b
            long[] r1 = r1.f16002a
            int r5 = r1.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L91
            r7 = 0
        L39:
            r8 = r1[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 == 0) goto L8c
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L53:
            if (r12 >= r10) goto L8a
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r17 >= 0) goto L86
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r4[r13]
            h1.e0 r13 = (h1.e0) r13
            h1.g0 r13 = r13.a()
        L69:
            if (r13 == 0) goto L86
            long r14 = r13.f8012a
            int r16 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r16 == 0) goto L7d
            h1.k r6 = r0.f7991j
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            boolean r6 = vb.m.S(r6, r14)
            if (r6 == 0) goto L83
        L7d:
            g1.d r6 = h1.n.f8049a
            r14 = 0
            r13.f8012a = r14
        L83:
            h1.g0 r13 = r13.f8013b
            goto L69
        L86:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L53
        L8a:
            if (r10 != r11) goto L91
        L8c:
            if (r7 == r5) goto L91
            int r7 = r7 + 1
            goto L39
        L91:
            r0.a()
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.c.l():void");
    }

    @Override // h1.g
    public void m() {
        if (this.f7994m || this.f8010c) {
            return;
        }
        v();
    }

    @Override // h1.g
    public void n(e0 e0Var) {
        l0 l0VarX = x();
        if (l0VarX == null) {
            int i10 = t0.f16044a;
            l0VarX = new l0();
            C(l0VarX);
        }
        l0VarX.a(e0Var);
    }

    @Override // h1.g
    public final void p() {
        int length = this.f7992k.length;
        for (int i10 = 0; i10 < length; i10++) {
            n.v(this.f7992k[i10]);
        }
        o();
    }

    @Override // h1.g
    public void t(int i10) {
        this.f7988g = i10;
    }

    @Override // h1.g
    public g u(ic.k kVar) throws Throwable {
        if (this.f8010c) {
            k1.a("Cannot use a disposed snapshot");
        }
        if (this.f7994m && this.f8011d < 0) {
            k1.b("Unsupported operation on a disposed or applied snapshot");
        }
        long jG = g();
        A(g());
        Object obj = n.f8051c;
        synchronized (obj) {
            try {
                long j10 = n.f8053e;
                long j11 = 1;
                n.f8053e = j10 + j11;
                n.f8052d = n.f8052d.l(j10);
                try {
                    e eVar = new e(j10, n.e(d(), jG + j11, j10), n.l(kVar, e(), true), this);
                    if (this.f7994m || this.f8010c) {
                        return eVar;
                    }
                    long jG2 = g();
                    synchronized (obj) {
                        long j12 = n.f8053e;
                        n.f8053e = j12 + j11;
                        s(j12);
                        n.f8052d = n.f8052d.l(g());
                    }
                    r(n.e(d(), jG2 + j11, g()));
                    return eVar;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public final void v() {
        long j10;
        A(g());
        if (this.f7994m || this.f8010c) {
            return;
        }
        long jG = g();
        synchronized (n.f8051c) {
            long j11 = n.f8053e;
            j10 = 1;
            n.f8053e = j11 + j10;
            s(j11);
            n.f8052d = n.f8052d.l(g());
        }
        r(n.e(d(), jG + j10, g()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014b  */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h1.t w() {
        /*
            Method dump skipped, instruction units count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.c.w():h1.t");
    }

    public l0 x() {
        return this.f7989h;
    }

    @Override // h1.g
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public ic.k e() {
        return this.f7986e;
    }

    public final t z(long j10, l0 l0Var, HashMap map, k kVar) {
        ArrayList arrayList;
        ArrayList arrayListQ0;
        ArrayList arrayList2;
        k kVar2;
        Object[] objArr;
        long[] jArr;
        k kVar3;
        Object[] objArr2;
        long[] jArr2;
        int i10;
        long j11;
        ArrayList arrayList3;
        g0 g0VarJ;
        k kVarK = d().l(g()).k(this.f7991j);
        Object[] objArr3 = l0Var.f16003b;
        long[] jArr3 = l0Var.f16002a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i11 = 0;
            arrayList2 = null;
            arrayListQ0 = null;
            while (true) {
                long j12 = jArr3[i11];
                if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    int i13 = 0;
                    while (i13 < i12) {
                        if ((j12 & 255) < 128) {
                            objArr2 = objArr3;
                            e0 e0Var = (e0) objArr3[(i11 << 3) + i13];
                            jArr2 = jArr3;
                            g0 g0VarA = e0Var.a();
                            i10 = i13;
                            ArrayList arrayList4 = arrayList2;
                            g0 g0VarT = n.t(g0VarA, j10, kVar);
                            if (g0VarT == null) {
                                kVar3 = kVarK;
                                arrayList3 = arrayListQ0;
                                j11 = j12;
                            } else {
                                arrayList3 = arrayListQ0;
                                j11 = j12;
                                g0 g0VarT2 = n.t(g0VarA, g(), kVarK);
                                if (g0VarT2 == null) {
                                    kVar3 = kVarK;
                                } else {
                                    kVar3 = kVarK;
                                    if (g0VarT2.f8012a != 1 && !g0VarT.equals(g0VarT2)) {
                                        g0 g0VarT3 = n.t(g0VarA, g(), d());
                                        if (g0VarT3 == null) {
                                            n.s();
                                            throw null;
                                        }
                                        if (map == null || (g0VarJ = (g0) map.get(g0VarT)) == null) {
                                            g0VarJ = e0Var.j(g0VarT2, g0VarT, g0VarT3);
                                        }
                                        if (g0VarJ == null) {
                                            return new h();
                                        }
                                        if (!g0VarJ.equals(g0VarT3)) {
                                            if (g0VarJ.equals(g0VarT)) {
                                                ArrayList arrayList5 = arrayList4 == null ? new ArrayList() : arrayList4;
                                                arrayList5.add(new ub.k(e0Var, g0VarT.c(g())));
                                                arrayListQ0 = arrayList3 == null ? new ArrayList() : arrayList3;
                                                arrayListQ0.add(e0Var);
                                                arrayList2 = arrayList5;
                                            } else {
                                                arrayList2 = arrayList4 == null ? new ArrayList() : arrayList4;
                                                arrayList2.add(!g0VarJ.equals(g0VarT2) ? new ub.k(e0Var, g0VarJ) : new ub.k(e0Var, g0VarT2.c(g())));
                                            }
                                        }
                                        arrayListQ0 = arrayList3;
                                    }
                                }
                            }
                            arrayList2 = arrayList4;
                            arrayListQ0 = arrayList3;
                        } else {
                            kVar3 = kVarK;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i10 = i13;
                            j11 = j12;
                        }
                        j12 = j11 >> 8;
                        i13 = i10 + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        kVarK = kVar3;
                    }
                    kVar2 = kVarK;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i12 != 8) {
                        break;
                    }
                } else {
                    kVar2 = kVarK;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i11 == length) {
                    arrayList = arrayList2;
                    break;
                }
                i11++;
                jArr3 = jArr;
                objArr3 = objArr;
                kVarK = kVar2;
            }
        } else {
            arrayList = null;
            arrayListQ0 = null;
        }
        arrayList2 = arrayList;
        if (arrayList2 != null) {
            v();
            int size = arrayList2.size();
            for (int i14 = 0; i14 < size; i14++) {
                ub.k kVar4 = (ub.k) arrayList2.get(i14);
                e0 e0Var2 = (e0) kVar4.f21543a;
                g0 g0Var = (g0) kVar4.f21544b;
                g0Var.f8012a = j10;
                synchronized (n.f8051c) {
                    g0Var.f8013b = e0Var2.a();
                    e0Var2.i(g0Var);
                }
            }
        }
        if (arrayListQ0 != null) {
            int size2 = arrayListQ0.size();
            for (int i15 = 0; i15 < size2; i15++) {
                l0Var.l((e0) arrayListQ0.get(i15));
            }
            ArrayList arrayList6 = this.f7990i;
            if (arrayList6 != null) {
                arrayListQ0 = vb.m.q0(arrayList6, arrayListQ0);
            }
            this.f7990i = arrayListQ0;
        }
        return i.f8017c;
    }
}
