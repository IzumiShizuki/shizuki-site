package qe;

import bd.f0;
import bd.z;
import j2.h0;
import yc.m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c extends bd.l implements b {
    public final wd.n E;
    public final yd.f F;
    public final f0 G;
    public final yd.i H;
    public final j I;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public c(yc.e r12, yc.j r13, zc.h r14, boolean r15, int r16, wd.n r17, yd.f r18, bd.f0 r19, yd.i r20, qe.j r21, yc.m0 r22) {
        /*
            r11 = this;
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            java.lang.String r0 = "containingDeclaration"
            jc.l.e(r12, r0)
            java.lang.String r0 = "annotations"
            jc.l.e(r14, r0)
            java.lang.String r0 = "kind"
            r5 = r16
            j2.h0.q(r5, r0)
            java.lang.String r0 = "proto"
            jc.l.e(r7, r0)
            java.lang.String r0 = "nameResolver"
            jc.l.e(r8, r0)
            java.lang.String r0 = "typeTable"
            jc.l.e(r9, r0)
            java.lang.String r0 = "versionRequirementTable"
            jc.l.e(r10, r0)
            if (r22 != 0) goto L38
            yc.n0 r0 = yc.m0.p0
            r6 = r0
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r0 = r11
            goto L3f
        L38:
            r6 = r22
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
        L3f:
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r11.E = r7
            r11.F = r8
            r11.G = r9
            r11.H = r10
            r1 = r21
            r11.I = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qe.c.<init>(yc.e, yc.j, zc.h, boolean, int, wd.n, yd.f, bd.f0, yd.i, qe.j, yc.m0):void");
    }

    @Override // bd.l, bd.z
    public final /* bridge */ /* synthetic */ z F1(int i10, be.e eVar, yc.k kVar, yc.t tVar, m0 m0Var, zc.h hVar) {
        return U1(kVar, tVar, i10, hVar, m0Var);
    }

    @Override // bd.z, yc.t
    public final boolean I() {
        return false;
    }

    @Override // bd.l
    /* JADX INFO: renamed from: O1 */
    public final /* bridge */ /* synthetic */ bd.l F1(int i10, be.e eVar, yc.k kVar, yc.t tVar, m0 m0Var, zc.h hVar) {
        return U1(kVar, tVar, i10, hVar, m0Var);
    }

    @Override // bd.z, yc.w
    public final boolean P() {
        return false;
    }

    public final c U1(yc.k kVar, yc.t tVar, int i10, zc.h hVar, m0 m0Var) {
        jc.l.e(kVar, "newOwner");
        h0.q(i10, "kind");
        jc.l.e(hVar, "annotations");
        c cVar = new c((yc.e) kVar, (yc.j) tVar, hVar, this.D, i10, this.E, this.F, this.G, this.H, this.I, m0Var);
        cVar.f2732v = this.f2732v;
        return cVar;
    }

    @Override // qe.k
    public final ce.b X() {
        return this.E;
    }

    @Override // bd.z, yc.t
    public final boolean h0() {
        return false;
    }

    @Override // bd.z, yc.t
    public final boolean l() {
        return false;
    }

    @Override // qe.k
    public final f0 l0() {
        return this.G;
    }

    @Override // qe.k
    public final yd.f p0() {
        return this.F;
    }

    @Override // qe.k
    public final j q0() {
        return this.I;
    }
}
