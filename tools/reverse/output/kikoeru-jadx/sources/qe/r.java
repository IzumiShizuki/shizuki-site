package qe;

import bd.f0;
import bd.s0;
import bd.z;
import j2.h0;
import wd.b0;
import yc.m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r extends s0 implements b {
    public final b0 D;
    public final yd.f E;
    public final f0 F;
    public final yd.i G;
    public final j H;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public r(yc.k r12, bd.s0 r13, zc.h r14, be.e r15, int r16, wd.b0 r17, yd.f r18, bd.f0 r19, yd.i r20, qe.j r21, yc.m0 r22) {
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
            r11.D = r7
            r11.E = r8
            r11.F = r9
            r11.G = r10
            r1 = r21
            r11.H = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qe.r.<init>(yc.k, bd.s0, zc.h, be.e, int, wd.b0, yd.f, bd.f0, yd.i, qe.j, yc.m0):void");
    }

    @Override // bd.s0, bd.z
    public final z F1(int i10, be.e eVar, yc.k kVar, yc.t tVar, m0 m0Var, zc.h hVar) {
        jc.l.e(kVar, "newOwner");
        h0.q(i10, "kind");
        jc.l.e(hVar, "annotations");
        s0 s0Var = (s0) tVar;
        if (eVar == null) {
            eVar = getName();
            jc.l.d(eVar, "getName(...)");
        }
        r rVar = new r(kVar, s0Var, hVar, eVar, i10, this.D, this.E, this.F, this.G, this.H, m0Var);
        rVar.f2732v = this.f2732v;
        return rVar;
    }

    @Override // qe.k
    public final ce.b X() {
        return this.D;
    }

    @Override // qe.k
    public final f0 l0() {
        return this.F;
    }

    @Override // qe.k
    public final yd.f p0() {
        return this.E;
    }

    @Override // qe.k
    public final j q0() {
        return this.H;
    }
}
