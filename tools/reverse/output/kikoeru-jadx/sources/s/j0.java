package s;

import i2.b2;
import i2.u1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends j1.p implements u1 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public w.k f19189o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public w.h f19190p;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object B0(s.j0 r4, ac.c r5) {
        /*
            boolean r0 = r5 instanceof s.g0
            if (r0 == 0) goto L13
            r0 = r5
            s.g0 r0 = (s.g0) r0
            int r1 = r0.f19161h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19161h = r1
            goto L18
        L13:
            s.g0 r0 = new s.g0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f19159f
            int r1 = r0.f19161h
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            w.h r4 = r0.f19158e
            s.j0 r0 = r0.f19157d
            ub.a.f(r5)
            r5 = r4
            r4 = r0
            goto L50
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            ub.a.f(r5)
            w.h r5 = r4.f19190p
            if (r5 != 0) goto L52
            w.h r5 = new w.h
            r5.<init>()
            w.k r1 = r4.f19189o
            r0.f19157d = r4
            r0.f19158e = r5
            r0.f19161h = r2
            java.lang.Object r0 = r1.a(r5, r0)
            zb.a r1 = zb.a.f26667a
            if (r0 != r1) goto L50
            return r1
        L50:
            r4.f19190p = r5
        L52:
            ub.a0 r4 = ub.a0.f21526a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: s.j0.B0(s.j0, ac.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object C0(s.j0 r4, ac.c r5) {
        /*
            boolean r0 = r5 instanceof s.h0
            if (r0 == 0) goto L13
            r0 = r5
            s.h0 r0 = (s.h0) r0
            int r1 = r0.f19169g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19169g = r1
            goto L18
        L13:
            s.h0 r0 = new s.h0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f19167e
            int r1 = r0.f19169g
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            s.j0 r4 = r0.f19166d
            ub.a.f(r5)
            goto L4a
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            ub.a.f(r5)
            w.h r5 = r4.f19190p
            if (r5 == 0) goto L4d
            w.i r1 = new w.i
            r1.<init>(r5)
            w.k r5 = r4.f19189o
            r0.f19166d = r4
            r0.f19169g = r2
            java.lang.Object r5 = r5.a(r1, r0)
            zb.a r0 = zb.a.f26667a
            if (r5 != r0) goto L4a
            return r0
        L4a:
            r5 = 0
            r4.f19190p = r5
        L4d:
            ub.a0 r4 = ub.a0.f21526a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: s.j0.C0(s.j0, ac.c):java.lang.Object");
    }

    public final void D0() {
        w.h hVar = this.f19190p;
        if (hVar != null) {
            this.f19189o.b(new w.i(hVar));
            this.f19190p = null;
        }
    }

    @Override // i2.u1
    public final /* synthetic */ boolean d0() {
        return false;
    }

    @Override // i2.u1
    public final void h0() {
        z();
    }

    @Override // i2.u1
    public final void j(c2.l lVar, c2.m mVar, long j10) {
        if (mVar == c2.m.f3315b) {
            int i10 = lVar.f3313e;
            yb.c cVar = null;
            if (i10 == 4) {
                hf.a0.y(n0(), null, null, new i0(this, cVar, 0), 3);
            } else if (i10 == 5) {
                hf.a0.y(n0(), null, null, new i0(this, cVar, 1), 3);
            }
        }
    }

    @Override // i2.u1
    public final long l() {
        return b2.f8652a;
    }

    @Override // j1.p
    public final void s0() {
        z();
    }

    @Override // j1.p
    public final void t0() {
        D0();
    }

    @Override // i2.u1
    public final void z() {
        D0();
    }

    @Override // i2.u1
    public final /* synthetic */ void H() {
    }
}
