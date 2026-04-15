package b2;

import b0.d0;
import b0.u1;
import hf.a0;
import hf.y;
import i2.d2;
import j1.p;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g extends p implements d2, a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public a f1468o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public d f1469p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public g f1470q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f1471r;

    public g(a aVar, d dVar) {
        this.f1468o = aVar;
        this.f1469p = dVar == null ? new d() : dVar;
        this.f1471r = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    public final y B0() {
        g gVar = this.f9703n ? (g) i2.f.j(this) : null;
        y yVarB0 = gVar != null ? gVar.B0() : null;
        if (yVarB0 != null && a0.v(yVarB0)) {
            return yVarB0;
        }
        y yVar = this.f1469p.f1458d;
        if (yVar != null) {
            return yVar;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    @Override // b2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object D(long r13, long r15, yb.c r17) {
        /*
            r12 = this;
            r0 = r17
            boolean r1 = r0 instanceof b2.e
            if (r1 == 0) goto L16
            r1 = r0
            b2.e r1 = (b2.e) r1
            int r2 = r1.f1463h
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.f1463h = r2
        L14:
            r7 = r1
            goto L1e
        L16:
            b2.e r1 = new b2.e
            ac.c r0 = (ac.c) r0
            r1.<init>(r12, r0)
            goto L14
        L1e:
            java.lang.Object r0 = r7.f1461f
            int r1 = r7.f1463h
            r8 = 2
            r2 = 1
            zb.a r9 = zb.a.f26667a
            if (r1 == 0) goto L42
            if (r1 == r2) goto L3a
            if (r1 != r8) goto L32
            long r1 = r7.f1459d
            ub.a.f(r0)
            goto L88
        L32:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3a:
            long r1 = r7.f1460e
            long r3 = r7.f1459d
            ub.a.f(r0)
            goto L59
        L42:
            ub.a.f(r0)
            b2.a r0 = r12.f1468o
            r7.f1459d = r13
            r5 = r15
            r7.f1460e = r5
            r7.f1463h = r2
            r3 = r13
            r2 = r0
            java.lang.Object r0 = r2.D(r3, r5, r7)
            if (r0 != r9) goto L57
            goto L86
        L57:
            r3 = r13
            r1 = r15
        L59:
            f3.q r0 = (f3.q) r0
            long r10 = r0.f6675a
            boolean r0 = r12.f9703n
            if (r0 == 0) goto L6e
            r5 = 0
            if (r0 == 0) goto L70
            if (r0 == 0) goto L70
            i2.d2 r0 = i2.f.j(r12)
            r5 = r0
            b2.g r5 = (b2.g) r5
            goto L70
        L6e:
            b2.g r5 = r12.f1470q
        L70:
            if (r5 == 0) goto L8e
            long r3 = f3.q.e(r3, r10)
            long r0 = f3.q.d(r1, r10)
            r7.f1459d = r10
            r7.f1463h = r8
            r2 = r5
            r5 = r0
            java.lang.Object r0 = r2.D(r3, r5, r7)
            if (r0 != r9) goto L87
        L86:
            return r9
        L87:
            r1 = r10
        L88:
            f3.q r0 = (f3.q) r0
            long r3 = r0.f6675a
            r10 = r1
            goto L90
        L8e:
            r3 = 0
        L90:
            long r0 = f3.q.e(r10, r3)
            f3.q r2 = new f3.q
            r2.<init>(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.g.D(long, long, yb.c):java.lang.Object");
    }

    @Override // b2.a
    public final long F(int i10, long j10) {
        boolean z10 = this.f9703n;
        g gVar = null;
        if (z10 && z10) {
            gVar = (g) i2.f.j(this);
        }
        long jF = gVar != null ? gVar.F(i10, j10) : 0L;
        return p1.b.i(jF, this.f1468o.F(i10, p1.b.h(j10, jF)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        if (r12 == r4) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0073, code lost:
    
        if (r12 != r4) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0075, code lost:
    
        return r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // b2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object V(long r10, yb.c r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof b2.f
            if (r0 == 0) goto L13
            r0 = r12
            b2.f r0 = (b2.f) r0
            int r1 = r0.f1467g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1467g = r1
            goto L1a
        L13:
            b2.f r0 = new b2.f
            ac.c r12 = (ac.c) r12
            r0.<init>(r9, r12)
        L1a:
            java.lang.Object r12 = r0.f1465e
            int r1 = r0.f1467g
            r2 = 2
            r3 = 1
            zb.a r4 = zb.a.f26667a
            if (r1 == 0) goto L3c
            if (r1 == r3) goto L36
            if (r1 != r2) goto L2e
            long r10 = r0.f1464d
            ub.a.f(r12)
            goto L76
        L2e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L36:
            long r10 = r0.f1464d
            ub.a.f(r12)
            goto L5a
        L3c:
            ub.a.f(r12)
            boolean r12 = r9.f9703n
            r1 = 0
            if (r12 == 0) goto L4d
            if (r12 == 0) goto L4d
            i2.d2 r12 = i2.f.j(r9)
            r1 = r12
            b2.g r1 = (b2.g) r1
        L4d:
            if (r1 == 0) goto L62
            r0.f1464d = r10
            r0.f1467g = r3
            java.lang.Object r12 = r1.V(r10, r0)
            if (r12 != r4) goto L5a
            goto L75
        L5a:
            f3.q r12 = (f3.q) r12
            long r5 = r12.f6675a
        L5e:
            r7 = r5
            r5 = r10
            r10 = r7
            goto L65
        L62:
            r5 = 0
            goto L5e
        L65:
            b2.a r12 = r9.f1468o
            long r5 = f3.q.d(r5, r10)
            r0.f1464d = r10
            r0.f1467g = r2
            java.lang.Object r12 = r12.V(r5, r0)
            if (r12 != r4) goto L76
        L75:
            return r4
        L76:
            f3.q r12 = (f3.q) r12
            long r0 = r12.f6675a
            long r10 = f3.q.e(r10, r0)
            f3.q r12 = new f3.q
            r12.<init>(r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.g.V(long, yb.c):java.lang.Object");
    }

    @Override // b2.a
    public final long X(int i10, long j10, long j11) {
        long jX = this.f1468o.X(i10, j10, j11);
        boolean z10 = this.f9703n;
        g gVar = null;
        if (z10 && z10) {
            gVar = (g) i2.f.j(this);
        }
        g gVar2 = gVar;
        return p1.b.i(jX, gVar2 != null ? gVar2.X(i10, p1.b.i(j10, jX), p1.b.h(j11, jX)) : 0L);
    }

    @Override // i2.d2
    public final Object k() {
        return this.f1471r;
    }

    @Override // j1.p
    public final void r0() {
        d dVar = this.f1469p;
        dVar.f1455a = this;
        dVar.f1456b = null;
        this.f1470q = null;
        dVar.f1457c = new d0(2, this);
        dVar.f1458d = n0();
    }

    @Override // j1.p
    public final void t0() {
        jc.y yVar = new jc.y();
        i2.f.B(this, new u1(yVar, 1));
        g gVar = (g) ((d2) yVar.f10838a);
        this.f1470q = gVar;
        d dVar = this.f1469p;
        dVar.f1456b = gVar;
        if (dVar.f1455a == this) {
            dVar.f1455a = null;
        }
    }
}
