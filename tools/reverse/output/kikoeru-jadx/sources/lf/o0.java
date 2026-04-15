package lf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class o0 extends mf.b implements h0, f, mf.m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f12462e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f12463f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final kf.a f12464g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object[] f12465h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f12466i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f12467j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f12468k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f12469l;

    public o0(int i10, int i11, kf.a aVar) {
        this.f12462e = i10;
        this.f12463f = i11;
        this.f12464g = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00bb, code lost:
    
        throw r1.u();
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m(lf.o0 r8, lf.g r9, yb.c r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lf.o0.m(lf.o0, lf.g, yb.c):void");
    }

    @Override // lf.l0
    public final List a() {
        synchronized (this) {
            int iR = (int) ((r() + ((long) this.f12468k)) - this.f12466i);
            if (iR == 0) {
                return vb.r.f22819a;
            }
            ArrayList arrayList = new ArrayList(iR);
            Object[] objArr = this.f12465h;
            jc.l.b(objArr);
            for (int i10 = 0; i10 < iR; i10++) {
                arrayList.add(objArr[(objArr.length - 1) & ((int) (this.f12466i + ((long) i10)))]);
            }
            return arrayList;
        }
    }

    @Override // lf.f
    public final Object b(g gVar, yb.c cVar) throws Throwable {
        m(this, gVar, cVar);
        return zb.a.f26667a;
    }

    @Override // mf.m
    public final f c(yb.h hVar, int i10, kf.a aVar) {
        return p0.o(this, hVar, i10, aVar);
    }

    @Override // mf.b
    public final mf.d e() {
        q0 q0Var = new q0();
        q0Var.f12479a = -1L;
        return q0Var;
    }

    @Override // mf.b
    public final mf.d[] f() {
        return new q0[2];
    }

    @Override // lf.h0
    public final void i() throws Throwable {
        synchronized (this) {
            try {
                try {
                    w(r() + ((long) this.f12468k), this.f12467j, r() + ((long) this.f12468k), r() + ((long) this.f12468k) + ((long) this.f12469l));
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    @Override // lf.h0
    public final boolean j(Object obj) {
        int i10;
        boolean z10;
        yb.c[] cVarArrQ = mf.c.f15132a;
        synchronized (this) {
            if (t(obj)) {
                cVarArrQ = q(cVarArrQ);
                z10 = true;
            } else {
                z10 = false;
            }
        }
        for (yb.c cVar : cVarArrQ) {
            if (cVar != null) {
                cVar.h(ub.a0.f21526a);
            }
        }
        return z10;
    }

    public final Object k(q0 q0Var, n0 n0Var) {
        hf.k kVar = new hf.k(1, ud.s.p(n0Var));
        kVar.r();
        synchronized (this) {
            try {
                if (u(q0Var) < 0) {
                    q0Var.f12480b = kVar;
                } else {
                    kVar.h(ub.a0.f21526a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Object objQ = kVar.q();
        return objQ == zb.a.f26667a ? objQ : ub.a0.f21526a;
    }

    public final void l() {
        if (this.f12463f != 0 || this.f12469l > 1) {
            Object[] objArr = this.f12465h;
            jc.l.b(objArr);
            while (this.f12469l > 0) {
                long jR = r();
                int i10 = this.f12468k;
                int i11 = this.f12469l;
                if (objArr[(objArr.length - 1) & ((int) ((jR + ((long) (i10 + i11))) - 1))] != p0.f12473a) {
                    return;
                }
                this.f12469l = i11 - 1;
                p0.f(objArr, r() + ((long) (this.f12468k + this.f12469l)), null);
            }
        }
    }

    @Override // lf.g
    public final Object n(Object obj, yb.c cVar) throws Throwable {
        Throwable th2;
        yb.c[] cVarArrQ;
        m0 m0Var;
        if (j(obj)) {
            return ub.a0.f21526a;
        }
        hf.k kVar = new hf.k(1, ud.s.p(cVar));
        kVar.r();
        yb.c[] cVarArrQ2 = mf.c.f15132a;
        synchronized (this) {
            try {
                if (t(obj)) {
                    try {
                        kVar.h(ub.a0.f21526a);
                        cVarArrQ = q(cVarArrQ2);
                        m0Var = null;
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                } else {
                    try {
                        m0 m0Var2 = new m0(this, r() + ((long) (this.f12468k + this.f12469l)), obj, kVar);
                        p(m0Var2);
                        this.f12469l++;
                        if (this.f12463f == 0) {
                            cVarArrQ2 = q(cVarArrQ2);
                        }
                        cVarArrQ = cVarArrQ2;
                        m0Var = m0Var2;
                    } catch (Throwable th4) {
                        th = th4;
                        th2 = th;
                        throw th2;
                    }
                }
                if (m0Var != null) {
                    kVar.x(new hf.h(2, m0Var));
                }
                for (yb.c cVar2 : cVarArrQ) {
                    if (cVar2 != null) {
                        cVar2.h(ub.a0.f21526a);
                    }
                }
                Object objQ = kVar.q();
                zb.a aVar = zb.a.f26667a;
                if (objQ != aVar) {
                    objQ = ub.a0.f21526a;
                }
                return objQ == aVar ? objQ : ub.a0.f21526a;
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    public final void o() {
        mf.d[] dVarArr;
        Object[] objArr = this.f12465h;
        jc.l.b(objArr);
        p0.f(objArr, r(), null);
        this.f12468k--;
        long jR = r() + 1;
        if (this.f12466i < jR) {
            this.f12466i = jR;
        }
        if (this.f12467j < jR) {
            if (this.f15129b != 0 && (dVarArr = this.f15128a) != null) {
                for (mf.d dVar : dVarArr) {
                    if (dVar != null) {
                        q0 q0Var = (q0) dVar;
                        long j10 = q0Var.f12479a;
                        if (j10 >= 0 && j10 < jR) {
                            q0Var.f12479a = jR;
                        }
                    }
                }
            }
            this.f12467j = jR;
        }
    }

    public final void p(Object obj) {
        int i10 = this.f12468k + this.f12469l;
        Object[] objArrS = this.f12465h;
        if (objArrS == null) {
            objArrS = s(0, 2, null);
        } else if (i10 >= objArrS.length) {
            objArrS = s(i10, objArrS.length * 2, objArrS);
        }
        p0.f(objArrS, r() + ((long) i10), obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [yb.c[]] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r6v2 */
    public final yb.c[] q(yb.c[] cVarArr) {
        mf.d[] dVarArr;
        q0 q0Var;
        hf.k kVar;
        int length = cVarArr.length;
        if (this.f15129b != 0 && (dVarArr = this.f15128a) != null) {
            int length2 = dVarArr.length;
            int i10 = 0;
            cVarArr = cVarArr;
            while (i10 < length2) {
                mf.d dVar = dVarArr[i10];
                if (dVar != null && (kVar = (q0Var = (q0) dVar).f12480b) != null && u(q0Var) >= 0) {
                    int length3 = cVarArr.length;
                    cVarArr = cVarArr;
                    if (length >= length3) {
                        Object[] objArrCopyOf = Arrays.copyOf((Object[]) cVarArr, Math.max(2, cVarArr.length * 2));
                        jc.l.d(objArrCopyOf, "copyOf(...)");
                        cVarArr = objArrCopyOf;
                    }
                    ((yb.c[]) cVarArr)[length] = kVar;
                    q0Var.f12480b = null;
                    length++;
                }
                i10++;
                cVarArr = cVarArr;
            }
        }
        return (yb.c[]) cVarArr;
    }

    public final long r() {
        return Math.min(this.f12467j, this.f12466i);
    }

    public final Object[] s(int i10, int i11, Object[] objArr) {
        if (i11 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i11];
        this.f12465h = objArr2;
        if (objArr != null) {
            long jR = r();
            for (int i12 = 0; i12 < i10; i12++) {
                long j10 = ((long) i12) + jR;
                p0.f(objArr2, j10, objArr[((int) j10) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean t(java.lang.Object r13) {
        /*
            r12 = this;
            int r1 = r12.f15129b
            int r2 = r12.f12462e
            r9 = 1
            if (r1 != 0) goto L23
            if (r2 != 0) goto Lb
            goto L7f
        Lb:
            r12.p(r13)
            int r1 = r12.f12468k
            int r1 = r1 + r9
            r12.f12468k = r1
            if (r1 <= r2) goto L18
            r12.o()
        L18:
            long r1 = r12.r()
            int r3 = r12.f12468k
            long r3 = (long) r3
            long r1 = r1 + r3
            r12.f12467j = r1
            return r9
        L23:
            int r1 = r12.f12468k
            int r3 = r12.f12463f
            if (r1 < r3) goto L47
            long r4 = r12.f12467j
            long r6 = r12.f12466i
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 > 0) goto L47
            kf.a r1 = r12.f12464g
            int r1 = r1.ordinal()
            if (r1 == 0) goto L45
            if (r1 == r9) goto L47
            r2 = 2
            if (r1 != r2) goto L3f
            goto L7f
        L3f:
            ce.j0 r1 = new ce.j0
            r1.<init>()
            throw r1
        L45:
            r1 = 0
            return r1
        L47:
            r12.p(r13)
            int r1 = r12.f12468k
            int r1 = r1 + r9
            r12.f12468k = r1
            if (r1 <= r3) goto L54
            r12.o()
        L54:
            long r3 = r12.r()
            int r1 = r12.f12468k
            long r5 = (long) r1
            long r3 = r3 + r5
            long r5 = r12.f12466i
            long r3 = r3 - r5
            int r1 = (int) r3
            if (r1 <= r2) goto L7f
            r1 = 1
            long r1 = r1 + r5
            long r3 = r12.f12467j
            long r5 = r12.r()
            int r7 = r12.f12468k
            long r7 = (long) r7
            long r5 = r5 + r7
            long r7 = r12.r()
            int r10 = r12.f12468k
            long r10 = (long) r10
            long r7 = r7 + r10
            int r10 = r12.f12469l
            long r10 = (long) r10
            long r7 = r7 + r10
            r0 = r12
            r0.w(r1, r3, r5, r7)
        L7f:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: lf.o0.t(java.lang.Object):boolean");
    }

    public final long u(q0 q0Var) {
        long j10 = q0Var.f12479a;
        if (j10 < r() + ((long) this.f12468k)) {
            return j10;
        }
        if (this.f12463f <= 0 && j10 <= r() && this.f12469l != 0) {
            return j10;
        }
        return -1L;
    }

    public final Object v(q0 q0Var) {
        Object obj;
        yb.c[] cVarArrX = mf.c.f15132a;
        synchronized (this) {
            try {
                long jU = u(q0Var);
                if (jU < 0) {
                    obj = p0.f12473a;
                } else {
                    long j10 = q0Var.f12479a;
                    Object[] objArr = this.f12465h;
                    jc.l.b(objArr);
                    Object obj2 = objArr[((int) jU) & (objArr.length - 1)];
                    if (obj2 instanceof m0) {
                        obj2 = ((m0) obj2).f12445c;
                    }
                    q0Var.f12479a = jU + 1;
                    Object obj3 = obj2;
                    cVarArrX = x(j10);
                    obj = obj3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (yb.c cVar : cVarArrX) {
            if (cVar != null) {
                cVar.h(ub.a0.f21526a);
            }
        }
        return obj;
    }

    public final void w(long j10, long j11, long j12, long j13) {
        long jMin = Math.min(j11, j10);
        for (long jR = r(); jR < jMin; jR++) {
            Object[] objArr = this.f12465h;
            jc.l.b(objArr);
            p0.f(objArr, jR, null);
        }
        this.f12466i = j10;
        this.f12467j = j11;
        this.f12468k = (int) (j12 - jMin);
        this.f12469l = (int) (j13 - j12);
    }

    public final yb.c[] x(long j10) {
        long j11;
        long j12;
        long j13;
        yb.c[] cVarArr;
        yb.c[] cVarArr2;
        mf.d[] dVarArr;
        app.nekogram.translator.r rVar = p0.f12473a;
        yb.c[] cVarArr3 = mf.c.f15132a;
        if (j10 <= this.f12467j) {
            long jR = r();
            long j14 = ((long) this.f12468k) + jR;
            int i10 = this.f12463f;
            if (i10 == 0 && this.f12469l > 0) {
                j14++;
            }
            int i11 = 0;
            if (this.f15129b != 0 && (dVarArr = this.f15128a) != null) {
                for (mf.d dVar : dVarArr) {
                    if (dVar != null) {
                        long j15 = ((q0) dVar).f12479a;
                        if (j15 >= 0 && j15 < j14) {
                            j14 = j15;
                        }
                    }
                }
            }
            if (j14 > this.f12467j) {
                long jR2 = r() + ((long) this.f12468k);
                int iMin = this.f15129b > 0 ? Math.min(this.f12469l, i10 - ((int) (jR2 - j14))) : this.f12469l;
                long j16 = ((long) this.f12469l) + jR2;
                if (iMin > 0) {
                    j13 = 1;
                    Object[] objArr = this.f12465h;
                    jc.l.b(objArr);
                    j11 = jR;
                    yb.c[] cVarArr4 = new yb.c[iMin];
                    long j17 = jR2;
                    while (true) {
                        if (jR2 >= j16) {
                            cVarArr2 = cVarArr4;
                            j12 = j14;
                            break;
                        }
                        cVarArr2 = cVarArr4;
                        Object obj = objArr[(objArr.length - 1) & ((int) jR2)];
                        if (obj != rVar) {
                            jc.l.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                            m0 m0Var = (m0) obj;
                            int i12 = i11 + 1;
                            j12 = j14;
                            cVarArr2[i11] = m0Var.f12446d;
                            p0.f(objArr, jR2, rVar);
                            p0.f(objArr, j17, m0Var.f12445c);
                            j17++;
                            if (i12 >= iMin) {
                                break;
                            }
                            i11 = i12;
                        } else {
                            j12 = j14;
                        }
                        jR2++;
                        cVarArr4 = cVarArr2;
                        j14 = j12;
                    }
                    jR2 = j17;
                    cVarArr = cVarArr2;
                } else {
                    j11 = jR;
                    j12 = j14;
                    j13 = 1;
                    cVarArr = cVarArr3;
                }
                int i13 = (int) (jR2 - j11);
                long j18 = this.f15129b == 0 ? jR2 : j12;
                long jMax = Math.max(this.f12466i, jR2 - ((long) Math.min(this.f12462e, i13)));
                if (i10 == 0 && jMax < j16) {
                    Object[] objArr2 = this.f12465h;
                    jc.l.b(objArr2);
                    if (jc.l.a(objArr2[((int) jMax) & (objArr2.length - 1)], rVar)) {
                        jR2 += j13;
                        jMax += j13;
                    }
                }
                w(jMax, j18, jR2, j16);
                l();
                return cVarArr.length == 0 ? cVarArr : q(cVarArr);
            }
        }
        return cVarArr3;
    }
}
