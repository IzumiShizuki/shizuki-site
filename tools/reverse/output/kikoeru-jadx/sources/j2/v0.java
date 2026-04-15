package j2;

import android.view.Choreographer;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class v0 implements x0.s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f10062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f10063c;

    public v0(Choreographer choreographer, t0 t0Var) {
        this.f10061a = 0;
        this.f10062b = choreographer;
        this.f10063c = t0Var;
    }

    private final Object a(ic.k kVar, yb.c cVar) {
        t0 t0Var = (t0) this.f10063c;
        hf.k kVar2 = new hf.k(1, ud.s.p(cVar));
        kVar2.r();
        u0 u0Var = new u0(kVar2, this, kVar);
        if (jc.l.a(t0Var.f9994c, (Choreographer) this.f10062b)) {
            synchronized (t0Var.f9996e) {
                t0Var.f9998g.add(u0Var);
                if (!t0Var.f10001j) {
                    t0Var.f10001j = true;
                    t0Var.f9994c.postFrameCallback(t0Var.f10002k);
                }
            }
            kVar2.w(new b0.o1(17, t0Var, u0Var));
        } else {
            ((Choreographer) this.f10062b).postFrameCallback(u0Var);
            kVar2.w(new b0.o1(18, this, u0Var));
        }
        return kVar2.q();
    }

    @Override // yb.h
    public final yb.h G(yb.h hVar) {
        switch (this.f10061a) {
        }
        return ud.b.C(this, hVar);
    }

    @Override // yb.h
    public final yb.h L(yb.g gVar) {
        switch (this.f10061a) {
        }
        return ud.b.z(this, gVar);
    }

    @Override // yb.h
    public final yb.f R(yb.g gVar) {
        switch (this.f10061a) {
        }
        return ud.b.o(this, gVar);
    }

    @Override // yb.f
    public final yb.g getKey() {
        switch (this.f10061a) {
        }
        return x0.r0.f24435b;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    @Override // x0.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(ic.k r7, yb.c r8) {
        /*
            r6 = this;
            int r0 = r6.f10061a
            switch(r0) {
                case 0: goto L92;
                default: goto L5;
            }
        L5:
            boolean r0 = r8 instanceof x0.f1
            if (r0 == 0) goto L18
            r0 = r8
            x0.f1 r0 = (x0.f1) r0
            int r1 = r0.f24302g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.f24302g = r1
            goto L1d
        L18:
            x0.f1 r0 = new x0.f1
            r0.<init>(r6, r8)
        L1d:
            java.lang.Object r8 = r0.f24300e
            zb.a r1 = zb.a.f26667a
            int r2 = r0.f24302g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            ub.a.f(r8)
            goto L8e
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            ic.k r7 = r0.f24299d
            ub.a.f(r8)
            goto L7e
        L3d:
            ub.a.f(r8)
            java.lang.Object r8 = r6.f10063c
            b5.d0 r8 = (b5.d0) r8
            r0.f24299d = r7
            r0.f24302g = r4
            boolean r2 = r8.m()
            if (r2 == 0) goto L51
            ub.a0 r8 = ub.a0.f21526a
            goto L7b
        L51:
            hf.k r2 = new hf.k
            yb.c r5 = ud.s.p(r0)
            r2.<init>(r4, r5)
            r2.r()
            java.lang.Object r4 = r8.f1521b
            monitor-enter(r4)
            java.lang.Object r5 = r8.f1522c     // Catch: java.lang.Throwable -> L8f
            java.util.ArrayList r5 = (java.util.ArrayList) r5     // Catch: java.lang.Throwable -> L8f
            r5.add(r2)     // Catch: java.lang.Throwable -> L8f
            monitor-exit(r4)
            ee.j r4 = new ee.j
            r5 = 8
            r4.<init>(r5, r8, r2)
            r2.w(r4)
            java.lang.Object r8 = r2.q()
            if (r8 != r1) goto L79
            goto L7b
        L79:
            ub.a0 r8 = ub.a0.f21526a
        L7b:
            if (r8 != r1) goto L7e
            goto L8d
        L7e:
            java.lang.Object r8 = r6.f10062b
            x0.s0 r8 = (x0.s0) r8
            r2 = 0
            r0.f24299d = r2
            r0.f24302g = r3
            java.lang.Object r8 = r8.k(r7, r0)
            if (r8 != r1) goto L8e
        L8d:
            r8 = r1
        L8e:
            return r8
        L8f:
            r7 = move-exception
            monitor-exit(r4)
            throw r7
        L92:
            java.lang.Object r7 = r6.a(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.v0.k(ic.k, yb.c):java.lang.Object");
    }

    @Override // yb.h
    public final Object y(ic.n nVar, Object obj) {
        switch (this.f10061a) {
        }
        return nVar.q(obj, this);
    }

    public v0(x0.s0 s0Var) {
        this.f10061a = 1;
        this.f10062b = s0Var;
        this.f10063c = new b5.d0(7, false);
    }
}
