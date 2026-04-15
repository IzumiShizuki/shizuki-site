package qe;

import bd.f0;
import bd.p0;
import j2.h0;
import wd.j0;
import yc.k0;
import yc.m0;
import yc.x;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q extends p0 implements b {
    public final j0 A;
    public final yd.f B;
    public final f0 C;
    public final yd.i D;
    public final j E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(yc.k kVar, k0 k0Var, zc.h hVar, x xVar, ld.o oVar, boolean z10, be.e eVar, int i10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, j0 j0Var, yd.f fVar, f0 f0Var, yd.i iVar, j jVar) {
        super(kVar, k0Var, hVar, xVar, oVar, z10, eVar, i10, m0.p0, z11, z12, z15, z13, z14);
        jc.l.e(kVar, "containingDeclaration");
        jc.l.e(hVar, "annotations");
        jc.l.e(xVar, "modality");
        jc.l.e(oVar, "visibility");
        jc.l.e(eVar, "name");
        h0.q(i10, "kind");
        jc.l.e(j0Var, "proto");
        jc.l.e(fVar, "nameResolver");
        jc.l.e(f0Var, "typeTable");
        jc.l.e(iVar, "versionRequirementTable");
        this.A = j0Var;
        this.B = fVar;
        this.C = f0Var;
        this.D = iVar;
        this.E = jVar;
    }

    @Override // bd.p0
    public final p0 F1(yc.k kVar, x xVar, ld.o oVar, k0 k0Var, int i10, be.e eVar) {
        jc.l.e(kVar, "newOwner");
        jc.l.e(xVar, "newModality");
        jc.l.e(oVar, "newVisibility");
        h0.q(i10, "kind");
        jc.l.e(eVar, "newName");
        return new q(kVar, k0Var, getAnnotations(), xVar, oVar, this.f2638f, eVar, i10, this.f2646n, this.f2647o, P(), this.f2650r, this.f2648p, this.A, this.B, this.C, this.D, this.E);
    }

    @Override // bd.p0, yc.w
    public final boolean P() {
        return yd.d.E.d(this.A.f23779d).booleanValue();
    }

    @Override // qe.k
    public final ce.b X() {
        return this.A;
    }

    @Override // qe.k
    public final f0 l0() {
        return this.C;
    }

    @Override // qe.k
    public final yd.f p0() {
        return this.B;
    }

    @Override // qe.k
    public final j q0() {
        return this.E;
    }
}
