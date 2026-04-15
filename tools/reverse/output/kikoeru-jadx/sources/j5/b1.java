package j5;

import android.util.SparseArray;
import b7.c3;
import java.io.EOFException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class b1 implements r5.h0 {
    public m4.q A;
    public m4.q B;
    public long C;
    public boolean E;
    public long F;
    public boolean G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0 f10209a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b5.t f10212d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b5.q f10213e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f10214f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public m4.q f10215g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b5.l f10216h;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f10224p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f10225q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f10226r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f10227s;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f10231w;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f10234z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f5.g f10210b = new f5.g();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f10217i = 1000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long[] f10218j = new long[1000];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long[] f10219k = new long[1000];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long[] f10222n = new long[1000];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int[] f10221m = new int[1000];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int[] f10220l = new int[1000];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public r5.g0[] f10223o = new r5.g0[1000];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ah.j f10211c = new ah.j(new c3(18));

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f10228t = Long.MIN_VALUE;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f10229u = Long.MIN_VALUE;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f10230v = Long.MIN_VALUE;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f10233y = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f10232x = true;
    public boolean D = true;

    public b1(n5.f fVar, b5.t tVar, b5.q qVar) {
        this.f10212d = tVar;
        this.f10213e = qVar;
        this.f10209a = new y0(fVar);
    }

    public final void A(m4.q qVar, v2.e eVar) {
        m4.q qVar2;
        m4.q qVar3 = this.f10215g;
        boolean z10 = qVar3 == null;
        m4.n nVar = qVar3 == null ? null : qVar3.f14548r;
        this.f10215g = qVar;
        m4.n nVar2 = qVar.f14548r;
        b5.t tVar = this.f10212d;
        if (tVar != null) {
            int iK = tVar.k(qVar);
            m4.p pVarA = qVar.a();
            pVarA.L = iK;
            qVar2 = new m4.q(pVarA);
        } else {
            qVar2 = qVar;
        }
        eVar.f22365c = qVar2;
        eVar.f22364b = this.f10216h;
        if (tVar == null) {
            return;
        }
        if (z10 || !Objects.equals(nVar, nVar2)) {
            b5.l lVar = this.f10216h;
            b5.q qVar4 = this.f10213e;
            b5.l lVarW = tVar.w(qVar4, qVar);
            this.f10216h = lVarW;
            eVar.f22364b = lVarW;
            if (lVar != null) {
                lVar.c(qVar4);
            }
        }
    }

    public final synchronized long B() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f10227s != this.f10224p ? this.f10218j[u(this.f10227s)] : this.C;
    }

    public final int C(v2.e eVar, u4.f fVar, int i10, boolean z10) {
        int i11;
        boolean z11 = (i10 & 2) != 0;
        f5.g gVar = this.f10210b;
        synchronized (this) {
            try {
                fVar.f21383f = false;
                i11 = -3;
                if (this.f10227s != this.f10224p) {
                    m4.q qVar = ((z0) this.f10211c.q(t())).f10500a;
                    if (!z11 && qVar == this.f10215g) {
                        int iU = u(this.f10227s);
                        if (y(iU)) {
                            fVar.f17713b = this.f10221m[iU];
                            if (this.f10227s == this.f10224p - 1 && (z10 || this.f10231w)) {
                                fVar.b(536870912);
                            }
                            fVar.f21384g = this.f10222n[iU];
                            gVar.f6700a = this.f10220l[iU];
                            gVar.f6701b = this.f10219k[iU];
                            gVar.f6702c = this.f10223o[iU];
                            i11 = -4;
                        } else {
                            fVar.f21383f = true;
                        }
                    }
                    A(qVar, eVar);
                    i11 = -5;
                } else {
                    if (!z10 && !this.f10231w) {
                        m4.q qVar2 = this.B;
                        if (qVar2 == null || (!z11 && qVar2 == this.f10215g)) {
                        }
                        A(qVar2, eVar);
                        i11 = -5;
                    }
                    fVar.f17713b = 4;
                    fVar.f21384g = Long.MIN_VALUE;
                    i11 = -4;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (i11 == -4 && !fVar.d(4)) {
            boolean z12 = (i10 & 1) != 0;
            if ((i10 & 4) == 0) {
                if (z12) {
                    y0 y0Var = this.f10209a;
                    y0.f(y0Var.f10490e, fVar, this.f10210b, y0Var.f10488c);
                } else {
                    y0 y0Var2 = this.f10209a;
                    y0Var2.f10490e = y0.f(y0Var2.f10490e, fVar, this.f10210b, y0Var2.f10488c);
                }
            }
            if (!z12) {
                this.f10227s++;
            }
        }
        return i11;
    }

    public final void D(boolean z10) {
        y0 y0Var = this.f10209a;
        y0Var.a(y0Var.f10489d);
        x0 x0Var = y0Var.f10489d;
        int i10 = y0Var.f10487b;
        p4.c.i(((n5.a) x0Var.f10476c) == null);
        x0Var.f10474a = 0L;
        x0Var.f10475b = i10;
        x0 x0Var2 = y0Var.f10489d;
        y0Var.f10490e = x0Var2;
        y0Var.f10491f = x0Var2;
        y0Var.f10492g = 0L;
        y0Var.f10486a.b();
        this.f10224p = 0;
        this.f10225q = 0;
        this.f10226r = 0;
        this.f10227s = 0;
        this.f10232x = true;
        this.f10228t = Long.MIN_VALUE;
        this.f10229u = Long.MIN_VALUE;
        this.f10230v = Long.MIN_VALUE;
        this.f10231w = false;
        ah.j jVar = this.f10211c;
        SparseArray sparseArray = (SparseArray) jVar.f391c;
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            ((c3) jVar.f392d).accept(sparseArray.valueAt(i11));
        }
        jVar.f390b = -1;
        sparseArray.clear();
        if (z10) {
            this.A = null;
            this.B = null;
            this.f10233y = true;
            this.D = true;
        }
    }

    public final synchronized void E() {
        this.f10227s = 0;
        y0 y0Var = this.f10209a;
        y0Var.f10490e = y0Var.f10489d;
    }

    public final synchronized boolean F(int i10) {
        E();
        int i11 = this.f10225q;
        if (i10 >= i11 && i10 <= this.f10224p + i11) {
            this.f10228t = Long.MIN_VALUE;
            this.f10227s = i10 - i11;
            return true;
        }
        return false;
    }

    public final synchronized boolean G(long j10, boolean z10) throws Throwable {
        Throwable th2;
        b1 b1Var;
        long j11;
        int iO;
        try {
            try {
                E();
                int iU = u(this.f10227s);
                int i10 = this.f10227s;
                int i11 = this.f10224p;
                if (!(i10 != i11) || j10 < this.f10222n[iU] || (j10 > this.f10230v && !z10)) {
                    return false;
                }
                if (this.D) {
                    int i12 = i11 - i10;
                    int i13 = 0;
                    while (true) {
                        if (i13 < i12) {
                            try {
                                if (this.f10222n[iU] >= j10) {
                                    i12 = i13;
                                    break;
                                }
                                iU++;
                                if (iU == this.f10217i) {
                                    iU = 0;
                                }
                                i13++;
                            } catch (Throwable th3) {
                                th2 = th3;
                            }
                        } else if (!z10) {
                            i12 = -1;
                        }
                    }
                    j11 = j10;
                    iO = i12;
                    b1Var = this;
                } else {
                    int i14 = i11 - i10;
                    b1Var = this;
                    j11 = j10;
                    iO = b1Var.o(iU, i14, j11, true);
                }
                if (iO == -1) {
                    return false;
                }
                b1Var.f10228t = j11;
                b1Var.f10227s += iO;
                return true;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
        }
        th2 = th;
        throw th2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void H(int r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 < 0) goto Le
            int r0 = r2.f10227s     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            int r1 = r2.f10224p     // Catch: java.lang.Throwable -> Lc
            if (r0 > r1) goto Le
            r0 = 1
            goto Lf
        Lc:
            r3 = move-exception
            goto L19
        Le:
            r0 = 0
        Lf:
            p4.c.c(r0)     // Catch: java.lang.Throwable -> Lc
            int r0 = r2.f10227s     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            r2.f10227s = r0     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)
            return
        L19:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.b1.H(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004d  */
    @Override // r5.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(long r13, int r15, int r16, int r17, r5.g0 r18) {
        /*
            r12 = this;
            boolean r0 = r12.f10234z
            if (r0 == 0) goto Lc
            m4.q r0 = r12.A
            p4.c.j(r0)
            r12.b(r0)
        Lc:
            r0 = r15 & 1
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L14
            r4 = 1
            goto L15
        L14:
            r4 = 0
        L15:
            boolean r5 = r12.f10232x
            if (r5 == 0) goto L1f
            if (r4 != 0) goto L1d
            goto L83
        L1d:
            r12.f10232x = r2
        L1f:
            long r5 = r12.F
            long r5 = r5 + r13
            boolean r7 = r12.D
            if (r7 == 0) goto L4d
            long r7 = r12.f10228t
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 >= 0) goto L2d
            goto L83
        L2d:
            if (r0 != 0) goto L4d
            boolean r0 = r12.E
            if (r0 != 0) goto L4a
            java.lang.String r0 = "SampleQueue"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Overriding unexpected non-sync sample for format: "
            r7.<init>(r8)
            m4.q r8 = r12.B
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            p4.c.B(r0, r7)
            r12.E = r3
        L4a:
            r0 = r15 | 1
            goto L4e
        L4d:
            r0 = r15
        L4e:
            boolean r7 = r12.G
            if (r7 == 0) goto L84
            if (r4 == 0) goto L83
            monitor-enter(r12)
            int r4 = r12.f10224p     // Catch: java.lang.Throwable -> L63
            if (r4 != 0) goto L65
            long r7 = r12.f10229u     // Catch: java.lang.Throwable -> L63
            int r4 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r4 <= 0) goto L60
            goto L61
        L60:
            r3 = 0
        L61:
            monitor-exit(r12)
            goto L7b
        L63:
            r0 = move-exception
            goto L81
        L65:
            long r7 = r12.r()     // Catch: java.lang.Throwable -> L63
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 < 0) goto L70
            monitor-exit(r12)
            r3 = 0
            goto L7b
        L70:
            int r4 = r12.h(r5)     // Catch: java.lang.Throwable -> L63
            int r7 = r12.f10225q     // Catch: java.lang.Throwable -> L63
            int r7 = r7 + r4
            r12.m(r7)     // Catch: java.lang.Throwable -> L63
            monitor-exit(r12)
        L7b:
            if (r3 != 0) goto L7e
            goto L83
        L7e:
            r12.G = r2
            goto L84
        L81:
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L63
            throw r0
        L83:
            return
        L84:
            j5.y0 r2 = r12.f10209a
            long r2 = r2.f10492g
            r7 = r16
            long r8 = (long) r7
            long r2 = r2 - r8
            r4 = r17
            long r8 = (long) r4
            long r2 = r2 - r8
            r10 = r5
            r5 = r2
            r2 = r10
            r1 = r12
            r8 = r18
            r4 = r0
            r1.g(r2, r4, r5, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.b1.a(long, int, int, int, r5.g0):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005b A[Catch: all -> 0x0059, TryCatch #0 {all -> 0x0059, blocks: (B:4:0x000a, B:8:0x0018, B:13:0x002a, B:15:0x0043, B:19:0x005d, B:18:0x005b), top: B:29:0x000a }] */
    /* JADX WARN: Type inference failed for: r5v26, types: [j5.a1, java.lang.Object] */
    @Override // r5.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(m4.q r5) {
        /*
            r4 = this;
            m4.q r0 = r4.p(r5)
            r1 = 0
            r4.f10234z = r1
            r4.A = r5
            monitor-enter(r4)
            r4.f10233y = r1     // Catch: java.lang.Throwable -> L59
            m4.q r5 = r4.B     // Catch: java.lang.Throwable -> L59
            int r2 = p4.c0.f16548a     // Catch: java.lang.Throwable -> L59
            boolean r5 = java.util.Objects.equals(r0, r5)     // Catch: java.lang.Throwable -> L59
            if (r5 == 0) goto L18
            monitor-exit(r4)
            goto L70
        L18:
            ah.j r5 = r4.f10211c     // Catch: java.lang.Throwable -> L59
            java.lang.Object r5 = r5.f391c     // Catch: java.lang.Throwable -> L59
            android.util.SparseArray r5 = (android.util.SparseArray) r5     // Catch: java.lang.Throwable -> L59
            int r5 = r5.size()     // Catch: java.lang.Throwable -> L59
            r2 = 1
            if (r5 != 0) goto L27
            r5 = 1
            goto L28
        L27:
            r5 = 0
        L28:
            if (r5 != 0) goto L5b
            ah.j r5 = r4.f10211c     // Catch: java.lang.Throwable -> L59
            java.lang.Object r5 = r5.f391c     // Catch: java.lang.Throwable -> L59
            android.util.SparseArray r5 = (android.util.SparseArray) r5     // Catch: java.lang.Throwable -> L59
            int r3 = r5.size()     // Catch: java.lang.Throwable -> L59
            int r3 = r3 - r2
            java.lang.Object r5 = r5.valueAt(r3)     // Catch: java.lang.Throwable -> L59
            j5.z0 r5 = (j5.z0) r5     // Catch: java.lang.Throwable -> L59
            m4.q r5 = r5.f10500a     // Catch: java.lang.Throwable -> L59
            boolean r5 = r5.equals(r0)     // Catch: java.lang.Throwable -> L59
            if (r5 == 0) goto L5b
            ah.j r5 = r4.f10211c     // Catch: java.lang.Throwable -> L59
            java.lang.Object r5 = r5.f391c     // Catch: java.lang.Throwable -> L59
            android.util.SparseArray r5 = (android.util.SparseArray) r5     // Catch: java.lang.Throwable -> L59
            int r0 = r5.size()     // Catch: java.lang.Throwable -> L59
            int r0 = r0 - r2
            java.lang.Object r5 = r5.valueAt(r0)     // Catch: java.lang.Throwable -> L59
            j5.z0 r5 = (j5.z0) r5     // Catch: java.lang.Throwable -> L59
            m4.q r5 = r5.f10500a     // Catch: java.lang.Throwable -> L59
            r4.B = r5     // Catch: java.lang.Throwable -> L59
            goto L5d
        L59:
            r5 = move-exception
            goto L7a
        L5b:
            r4.B = r0     // Catch: java.lang.Throwable -> L59
        L5d:
            boolean r5 = r4.D     // Catch: java.lang.Throwable -> L59
            m4.q r0 = r4.B     // Catch: java.lang.Throwable -> L59
            java.lang.String r3 = r0.f14544n     // Catch: java.lang.Throwable -> L59
            java.lang.String r0 = r0.f14541k     // Catch: java.lang.Throwable -> L59
            boolean r0 = m4.o0.a(r3, r0)     // Catch: java.lang.Throwable -> L59
            r5 = r5 & r0
            r4.D = r5     // Catch: java.lang.Throwable -> L59
            r4.E = r1     // Catch: java.lang.Throwable -> L59
            monitor-exit(r4)
            r1 = 1
        L70:
            java.lang.Object r5 = r4.f10214f
            if (r5 == 0) goto L79
            if (r1 == 0) goto L79
            r5.b()
        L79:
            return
        L7a:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L59
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.b1.b(m4.q):void");
    }

    @Override // r5.h0
    public final int c(m4.i iVar, int i10, boolean z10) throws EOFException {
        y0 y0Var = this.f10209a;
        int iC = y0Var.c(i10);
        x0 x0Var = y0Var.f10491f;
        n5.a aVar = (n5.a) x0Var.f10476c;
        int i11 = iVar.read(aVar.f15317a, ((int) (y0Var.f10492g - x0Var.f10474a)) + aVar.f15318b, iC);
        if (i11 == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        long j10 = y0Var.f10492g + ((long) i11);
        y0Var.f10492g = j10;
        x0 x0Var2 = y0Var.f10491f;
        if (j10 == x0Var2.f10475b) {
            y0Var.f10491f = (x0) x0Var2.f10477d;
        }
        return i11;
    }

    @Override // r5.h0
    public final int d(m4.i iVar, int i10, boolean z10) {
        return c(iVar, i10, z10);
    }

    @Override // r5.h0
    public final /* synthetic */ void e(int i10, p4.s sVar) {
        q.t0.c(this, sVar, i10);
    }

    @Override // r5.h0
    public final void f(p4.s sVar, int i10, int i11) {
        while (true) {
            y0 y0Var = this.f10209a;
            if (i10 <= 0) {
                y0Var.getClass();
                return;
            }
            int iC = y0Var.c(i10);
            x0 x0Var = y0Var.f10491f;
            n5.a aVar = (n5.a) x0Var.f10476c;
            sVar.e(aVar.f15317a, ((int) (y0Var.f10492g - x0Var.f10474a)) + aVar.f15318b, iC);
            i10 -= iC;
            long j10 = y0Var.f10492g + ((long) iC);
            y0Var.f10492g = j10;
            x0 x0Var2 = y0Var.f10491f;
            if (j10 == x0Var2.f10475b) {
                y0Var.f10491f = (x0) x0Var2.f10477d;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0082 A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:3:0x0001, B:5:0x0007, B:9:0x001d, B:12:0x0024, B:16:0x002c, B:21:0x0067, B:44:0x00e3, B:46:0x00ec, B:23:0x0082, B:25:0x008b, B:27:0x0094, B:29:0x00a9, B:33:0x00b2, B:34:0x00b7, B:36:0x00bd, B:40:0x00cb, B:42:0x00d0, B:43:0x00e0, B:26:0x0092), top: B:51:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void g(long r9, int r11, long r12, int r14, r5.g0 r15) {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.b1.g(long, int, long, int, r5.g0):void");
    }

    public final int h(long j10) {
        int i10 = this.f10224p;
        int iU = u(i10 - 1);
        while (i10 > this.f10227s && this.f10222n[iU] >= j10) {
            i10--;
            iU--;
            if (iU == -1) {
                iU = this.f10217i - 1;
            }
        }
        return i10;
    }

    public final long i(int i10) {
        this.f10229u = Math.max(this.f10229u, s(i10));
        this.f10224p -= i10;
        int i11 = this.f10225q + i10;
        this.f10225q = i11;
        int i12 = this.f10226r + i10;
        this.f10226r = i12;
        int i13 = this.f10217i;
        if (i12 >= i13) {
            this.f10226r = i12 - i13;
        }
        int i14 = this.f10227s - i10;
        this.f10227s = i14;
        int i15 = 0;
        if (i14 < 0) {
            this.f10227s = 0;
        }
        ah.j jVar = this.f10211c;
        SparseArray sparseArray = (SparseArray) jVar.f391c;
        while (i15 < sparseArray.size() - 1) {
            int i16 = i15 + 1;
            if (i11 < sparseArray.keyAt(i16)) {
                break;
            }
            ((c3) jVar.f392d).accept(sparseArray.valueAt(i15));
            sparseArray.removeAt(i15);
            int i17 = jVar.f390b;
            if (i17 > 0) {
                jVar.f390b = i17 - 1;
            }
            i15 = i16;
        }
        if (this.f10224p != 0) {
            return this.f10219k[this.f10226r];
        }
        int i18 = this.f10226r;
        if (i18 == 0) {
            i18 = this.f10217i;
        }
        int i19 = i18 - 1;
        return this.f10219k[i19] + ((long) this.f10220l[i19]);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(long r12, boolean r14) throws java.lang.Throwable {
        /*
            r11 = this;
            j5.y0 r0 = r11.f10209a
            monitor-enter(r11)
            int r1 = r11.f10224p     // Catch: java.lang.Throwable -> L38
            r2 = -1
            if (r1 == 0) goto L13
            long[] r4 = r11.f10222n     // Catch: java.lang.Throwable -> L38
            int r6 = r11.f10226r     // Catch: java.lang.Throwable -> L38
            r7 = r4[r6]     // Catch: java.lang.Throwable -> L38
            int r4 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r4 >= 0) goto L15
        L13:
            r5 = r11
            goto L3b
        L15:
            if (r14 == 0) goto L1d
            int r14 = r11.f10227s     // Catch: java.lang.Throwable -> L1f
            if (r14 == r1) goto L1d
            int r1 = r14 + 1
        L1d:
            r7 = r1
            goto L23
        L1f:
            r0 = move-exception
            r12 = r0
            r5 = r11
            goto L40
        L23:
            r10 = 0
            r5 = r11
            r8 = r12
            int r12 = r5.o(r6, r7, r8, r10)     // Catch: java.lang.Throwable -> L35
            r13 = -1
            if (r12 != r13) goto L2f
            monitor-exit(r11)
            goto L3c
        L2f:
            long r2 = r11.i(r12)     // Catch: java.lang.Throwable -> L35
            monitor-exit(r11)
            goto L3c
        L35:
            r0 = move-exception
        L36:
            r12 = r0
            goto L40
        L38:
            r0 = move-exception
            r5 = r11
            goto L36
        L3b:
            monitor-exit(r11)
        L3c:
            r0.b(r2)
            return
        L40:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L35
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.b1.j(long, boolean):void");
    }

    public final void k() {
        long jI;
        y0 y0Var = this.f10209a;
        synchronized (this) {
            int i10 = this.f10224p;
            jI = i10 == 0 ? -1L : i(i10);
        }
        y0Var.b(jI);
    }

    public final void l(long j10) {
        if (this.f10224p == 0) {
            return;
        }
        p4.c.c(j10 > r());
        n(this.f10225q + h(j10));
    }

    public final long m(int i10) {
        int i11 = this.f10225q;
        int i12 = this.f10224p;
        int i13 = (i11 + i12) - i10;
        boolean z10 = false;
        p4.c.c(i13 >= 0 && i13 <= i12 - this.f10227s);
        int i14 = this.f10224p - i13;
        this.f10224p = i14;
        this.f10230v = Math.max(this.f10229u, s(i14));
        if (i13 == 0 && this.f10231w) {
            z10 = true;
        }
        this.f10231w = z10;
        ah.j jVar = this.f10211c;
        SparseArray sparseArray = (SparseArray) jVar.f391c;
        for (int size = sparseArray.size() - 1; size >= 0 && i10 < sparseArray.keyAt(size); size--) {
            ((c3) jVar.f392d).accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        jVar.f390b = sparseArray.size() > 0 ? Math.min(jVar.f390b, sparseArray.size() - 1) : -1;
        int i15 = this.f10224p;
        if (i15 == 0) {
            return 0L;
        }
        int iU = u(i15 - 1);
        return this.f10219k[iU] + ((long) this.f10220l[iU]);
    }

    public final void n(int i10) {
        long jM = m(i10);
        y0 y0Var = this.f10209a;
        int i11 = y0Var.f10487b;
        p4.c.c(jM <= y0Var.f10492g);
        y0Var.f10492g = jM;
        if (jM != 0) {
            x0 x0Var = y0Var.f10489d;
            if (jM != x0Var.f10474a) {
                while (y0Var.f10492g > x0Var.f10475b) {
                    x0Var = (x0) x0Var.f10477d;
                }
                x0 x0Var2 = (x0) x0Var.f10477d;
                x0Var2.getClass();
                y0Var.a(x0Var2);
                x0 x0Var3 = new x0(x0Var.f10475b, i11);
                x0Var.f10477d = x0Var3;
                if (y0Var.f10492g == x0Var.f10475b) {
                    x0Var = x0Var3;
                }
                y0Var.f10491f = x0Var;
                if (y0Var.f10490e == x0Var2) {
                    y0Var.f10490e = x0Var3;
                    return;
                }
                return;
            }
        }
        y0Var.a(y0Var.f10489d);
        x0 x0Var4 = new x0(y0Var.f10492g, i11);
        y0Var.f10489d = x0Var4;
        y0Var.f10490e = x0Var4;
        y0Var.f10491f = x0Var4;
    }

    public final int o(int i10, int i11, long j10, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            long j11 = this.f10222n[i10];
            if (j11 > j10) {
                break;
            }
            if (!z10 || (this.f10221m[i10] & 1) != 0) {
                if (j11 == j10) {
                    return i13;
                }
                i12 = i13;
            }
            i10++;
            if (i10 == this.f10217i) {
                i10 = 0;
            }
        }
        return i12;
    }

    public m4.q p(m4.q qVar) {
        if (this.F == 0 || qVar.f14549s == Long.MAX_VALUE) {
            return qVar;
        }
        m4.p pVarA = qVar.a();
        pVarA.f14493r = qVar.f14549s + this.F;
        return new m4.q(pVarA);
    }

    public final synchronized long q() {
        return this.f10230v;
    }

    public final synchronized long r() {
        return Math.max(this.f10229u, s(this.f10227s));
    }

    public final long s(int i10) {
        long jMax = Long.MIN_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int iU = u(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            jMax = Math.max(jMax, this.f10222n[iU]);
            if ((this.f10221m[iU] & 1) != 0) {
                return jMax;
            }
            iU--;
            if (iU == -1) {
                iU = this.f10217i - 1;
            }
        }
        return jMax;
    }

    public final int t() {
        return this.f10225q + this.f10227s;
    }

    public final int u(int i10) {
        int i11 = this.f10226r + i10;
        int i12 = this.f10217i;
        return i11 < i12 ? i11 : i11 - i12;
    }

    public final synchronized int v(long j10, boolean z10) throws Throwable {
        try {
            try {
                int iU = u(this.f10227s);
                int i10 = this.f10227s;
                int i11 = this.f10224p;
                if (!(i10 != i11) || j10 < this.f10222n[iU]) {
                    return 0;
                }
                if (j10 > this.f10230v && z10) {
                    return i11 - i10;
                }
                int iO = o(iU, i11 - i10, j10, true);
                if (iO == -1) {
                    return 0;
                }
                return iO;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
        throw th;
    }

    public final synchronized m4.q w() {
        return this.f10233y ? null : this.B;
    }

    public final synchronized boolean x(boolean z10) {
        m4.q qVar;
        boolean z11 = false;
        if (this.f10227s != this.f10224p) {
            if (((z0) this.f10211c.q(t())).f10500a != this.f10215g) {
                return true;
            }
            return y(u(this.f10227s));
        }
        if (z10 || this.f10231w || ((qVar = this.B) != null && qVar != this.f10215g)) {
            z11 = true;
        }
        return z11;
    }

    public final boolean y(int i10) {
        b5.l lVar = this.f10216h;
        if (lVar == null || lVar.e() == 4) {
            return true;
        }
        return (this.f10221m[i10] & 1073741824) == 0 && this.f10216h.d();
    }

    public final void z() throws b5.k {
        b5.l lVar = this.f10216h;
        if (lVar == null || lVar.e() != 1) {
            return;
        }
        b5.k kVarG = this.f10216h.g();
        kVarG.getClass();
        throw kVarG;
    }
}
