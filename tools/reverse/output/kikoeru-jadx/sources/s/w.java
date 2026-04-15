package s;

import android.view.KeyEvent;
import u.n2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class w extends d implements i2.l {
    public ic.a H;
    public ic.a I;
    public boolean J;
    public final o.c0 K;
    public final o.c0 L;

    public w(ic.a aVar, ic.a aVar2, ic.a aVar3, q2.h hVar, r0 r0Var, w.k kVar) {
        super(kVar, r0Var, true, null, hVar, aVar);
        this.H = aVar2;
        this.I = aVar3;
        this.J = true;
        o.c0 c0Var = o.q.f16031a;
        this.K = new o.c0();
        this.L = new o.c0();
    }

    @Override // s.d
    public final void E0(q2.k kVar) {
        if (this.H != null) {
            r2.a aVar = new r2.a(2, this);
            pc.u[] uVarArr = q2.v.f17698a;
            kVar.l(q2.j.f17606c, new q2.a(null, aVar));
        }
    }

    @Override // s.d
    public final Object F0(c2.x xVar, yb.c cVar) {
        boolean z10 = this.f19123u;
        Object objE = n2.e(xVar, (!z10 || this.I == null) ? null : new u(this, 0), (!z10 || this.H == null) ? null : new u(this, 1), new p(this, null, 1), new u(this, 2), cVar);
        return objE == zb.a.f26667a ? objE : ub.a0.f21526a;
    }

    @Override // s.d
    public final void I0() {
        M0();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    @Override // s.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean J0(android.view.KeyEvent r8) {
        /*
            r7 = this;
            long r0 = a2.c.L(r8)
            ic.a r8 = r7.H
            r2 = 0
            if (r8 == 0) goto L26
            o.c0 r8 = r7.K
            java.lang.Object r3 = r8.e(r0)
            if (r3 != 0) goto L26
            hf.y r3 = r7.n0()
            ba.v0 r4 = new ba.v0
            r5 = 14
            r4.<init>(r5, r7, r2)
            r5 = 3
            hf.r1 r3 = hf.a0.y(r3, r2, r2, r4, r5)
            r8.h(r0, r3)
            r8 = 1
            goto L27
        L26:
            r8 = 0
        L27:
            o.c0 r3 = r7.L
            java.lang.Object r4 = r3.e(r0)
            s.t r4 = (s.t) r4
            if (r4 == 0) goto L4c
            hf.r1 r5 = r4.f19271a
            boolean r6 = r5.b()
            if (r6 == 0) goto L49
            r5.g(r2)
            boolean r2 = r4.f19272b
            if (r2 != 0) goto L4c
            ic.a r2 = r7.f19124v
            r2.b()
            r3.g(r0)
            return r8
        L49:
            r3.g(r0)
        L4c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: s.w.J0(android.view.KeyEvent):boolean");
    }

    @Override // s.d
    public final void K0(KeyEvent keyEvent) {
        ic.a aVar;
        long jL = a2.c.L(keyEvent);
        o.c0 c0Var = this.K;
        boolean z10 = false;
        if (c0Var.e(jL) != null) {
            hf.d1 d1Var = (hf.d1) c0Var.e(jL);
            if (d1Var != null) {
                if (d1Var.b()) {
                    d1Var.g(null);
                } else {
                    z10 = true;
                }
            }
            c0Var.g(jL);
        }
        if (this.I == null) {
            if (z10) {
                return;
            }
            this.f19124v.b();
            return;
        }
        o.c0 c0Var2 = this.L;
        if (c0Var2.e(jL) == null) {
            if (z10) {
                return;
            }
            c0Var2.h(jL, new t(hf.a0.y(n0(), null, null, new v(this, jL, null), 3)));
        } else {
            if (!z10 && (aVar = this.I) != null) {
                aVar.b();
            }
            c0Var2.g(jL);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M0() {
        /*
            r24 = this;
            r0 = r24
            o.c0 r1 = r0.K
            java.lang.Object[] r2 = r1.f15931c
            long[] r3 = r1.f15929a
            int r4 = r3.length
            int r4 = r4 + (-2)
            r5 = 0
            r10 = 7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r13 = 8
            r14 = 0
            if (r4 < 0) goto L5a
            r15 = 0
            r16 = 128(0x80, double:6.3E-322)
        L1a:
            r6 = r3[r15]
            r18 = 255(0xff, double:1.26E-321)
            long r8 = ~r6
            long r8 = r8 << r10
            long r8 = r8 & r6
            long r8 = r8 & r11
            int r20 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r20 == 0) goto L52
            int r8 = r15 - r4
            int r8 = ~r8
            int r8 = r8 >>> 31
            int r8 = 8 - r8
            r9 = 0
        L2e:
            if (r9 >= r8) goto L4d
            long r20 = r6 & r18
            int r22 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r22 >= 0) goto L46
            int r20 = r15 << 3
            int r20 = r20 + r9
            r20 = r2[r20]
            r21 = 7
            r10 = r20
            hf.d1 r10 = (hf.d1) r10
            r10.g(r5)
            goto L48
        L46:
            r21 = 7
        L48:
            long r6 = r6 >> r13
            int r9 = r9 + 1
            r10 = 7
            goto L2e
        L4d:
            r21 = 7
            if (r8 != r13) goto L60
            goto L54
        L52:
            r21 = 7
        L54:
            if (r15 == r4) goto L60
            int r15 = r15 + 1
            r10 = 7
            goto L1a
        L5a:
            r16 = 128(0x80, double:6.3E-322)
            r18 = 255(0xff, double:1.26E-321)
            r21 = 7
        L60:
            r1.a()
            o.c0 r1 = r0.L
            java.lang.Object[] r2 = r1.f15931c
            long[] r3 = r1.f15929a
            int r4 = r3.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto La1
            r6 = 0
        L6f:
            r7 = r3[r6]
            long r9 = ~r7
            long r9 = r9 << r21
            long r9 = r9 & r7
            long r9 = r9 & r11
            int r15 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r15 == 0) goto L9c
            int r9 = r6 - r4
            int r9 = ~r9
            int r9 = r9 >>> 31
            int r9 = 8 - r9
            r10 = 0
        L82:
            if (r10 >= r9) goto L9a
            long r22 = r7 & r18
            int r15 = (r22 > r16 ? 1 : (r22 == r16 ? 0 : -1))
            if (r15 >= 0) goto L96
            int r15 = r6 << 3
            int r15 = r15 + r10
            r15 = r2[r15]
            s.t r15 = (s.t) r15
            hf.r1 r15 = r15.f19271a
            r15.g(r5)
        L96:
            long r7 = r7 >> r13
            int r10 = r10 + 1
            goto L82
        L9a:
            if (r9 != r13) goto La1
        L9c:
            if (r6 == r4) goto La1
            int r6 = r6 + 1
            goto L6f
        La1:
            r1.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s.w.M0():void");
    }

    @Override // j1.p
    public final void v0() {
        M0();
    }
}
