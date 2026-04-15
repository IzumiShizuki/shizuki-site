package j5;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i implements j0, b5.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f10299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ah.j f10300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b5.q f10301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f10302d;

    public i(k kVar, Object obj) {
        this.f10302d = kVar;
        this.f10300b = kVar.b(null);
        this.f10301c = new b5.q(kVar.f10205d.f1595c, 0, null);
        this.f10299a = obj;
    }

    @Override // b5.r
    public final void A(int i10, d0 d0Var) {
        if (b(i10, d0Var)) {
            this.f10301c.e();
        }
    }

    @Override // j5.j0
    public final void G(int i10, d0 d0Var, u uVar, z zVar) {
        if (b(i10, d0Var)) {
            ah.j jVar = this.f10300b;
            z zVarC = c(zVar, d0Var);
            jVar.getClass();
            jVar.h(new g0(jVar, uVar, zVarC, 0));
        }
    }

    @Override // j5.j0
    public final void H(int i10, d0 d0Var, u uVar, z zVar) {
        if (b(i10, d0Var)) {
            ah.j jVar = this.f10300b;
            z zVarC = c(zVar, d0Var);
            jVar.getClass();
            jVar.h(new g0(jVar, uVar, zVarC, 1));
        }
    }

    @Override // j5.j0
    public final void T(int i10, d0 d0Var, z zVar) {
        if (b(i10, d0Var)) {
            ah.j jVar = this.f10300b;
            z zVarC = c(zVar, d0Var);
            d0 d0Var2 = (d0) jVar.f391c;
            d0Var2.getClass();
            jVar.h(new b7.w0(jVar, d0Var2, zVarC, 4));
        }
    }

    @Override // b5.r
    public final void a(int i10, d0 d0Var) {
        if (b(i10, d0Var)) {
            this.f10301c.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(int r4, j5.d0 r5) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f10299a
            j5.k r1 = r3.f10302d
            if (r5 == 0) goto Le
            j5.d0 r5 = r1.u(r0, r5)
            if (r5 != 0) goto Lf
            r4 = 0
            return r4
        Le:
            r5 = 0
        Lf:
            int r4 = r1.w(r4, r0)
            ah.j r0 = r3.f10300b
            int r2 = r0.f390b
            if (r2 != r4) goto L25
            java.lang.Object r0 = r0.f391c
            j5.d0 r0 = (j5.d0) r0
            int r2 = p4.c0.f16548a
            boolean r0 = java.util.Objects.equals(r0, r5)
            if (r0 != 0) goto L32
        L25:
            ah.j r0 = r1.f10204c
            ah.j r2 = new ah.j
            java.lang.Object r0 = r0.f392d
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
            r2.<init>(r0, r4, r5)
            r3.f10300b = r2
        L32:
            b5.q r0 = r3.f10301c
            int r2 = r0.f1593a
            if (r2 != r4) goto L42
            j5.d0 r0 = r0.f1594b
            int r2 = p4.c0.f16548a
            boolean r0 = java.util.Objects.equals(r0, r5)
            if (r0 != 0) goto L4d
        L42:
            b5.q r0 = r1.f10205d
            b5.q r1 = new b5.q
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.f1595c
            r1.<init>(r0, r4, r5)
            r3.f10301c = r1
        L4d:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.i.b(int, j5.d0):boolean");
    }

    public final z c(z zVar, d0 d0Var) {
        long j10 = zVar.f10498f;
        k kVar = this.f10302d;
        Object obj = this.f10299a;
        long jV = kVar.v(j10, obj);
        long j11 = zVar.f10499g;
        long jV2 = kVar.v(j11, obj);
        return (jV == j10 && jV2 == j11) ? zVar : new z(zVar.f10493a, zVar.f10494b, zVar.f10495c, zVar.f10496d, zVar.f10497e, jV, jV2);
    }

    @Override // j5.j0
    public final void k(int i10, d0 d0Var, u uVar, z zVar, int i11) {
        if (b(i10, d0Var)) {
            ah.j jVar = this.f10300b;
            z zVarC = c(zVar, d0Var);
            jVar.getClass();
            jVar.h(new f0(jVar, uVar, zVarC, i11));
        }
    }

    @Override // j5.j0
    public final void q(int i10, d0 d0Var, u uVar, z zVar, IOException iOException, boolean z10) {
        if (b(i10, d0Var)) {
            ah.j jVar = this.f10300b;
            z zVarC = c(zVar, d0Var);
            jVar.getClass();
            jVar.h(new h0(jVar, uVar, zVarC, iOException, z10));
        }
    }

    @Override // b5.r
    public final void v(int i10, d0 d0Var) {
        if (b(i10, d0Var)) {
            this.f10301c.b();
        }
    }

    @Override // b5.r
    public final void w(int i10, d0 d0Var, int i11) {
        if (b(i10, d0Var)) {
            this.f10301c.c(i11);
        }
    }

    @Override // b5.r
    public final void x(int i10, d0 d0Var, Exception exc) {
        if (b(i10, d0Var)) {
            this.f10301c.d(exc);
        }
    }

    @Override // j5.j0
    public final void z(int i10, d0 d0Var, z zVar) {
        if (b(i10, d0Var)) {
            ah.j jVar = this.f10300b;
            z zVarC = c(zVar, d0Var);
            jVar.getClass();
            jVar.h(new b7.i0(14, jVar, zVarC));
        }
    }
}
