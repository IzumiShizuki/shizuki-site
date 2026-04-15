package ue;

import bd.s0;
import bd.z;
import j2.h0;
import java.util.Collection;
import ld.o;
import r.y1;
import yc.m0;
import yc.s;
import yc.t;
import yc.x;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c extends s0 {
    @Override // bd.z
    /* JADX INFO: renamed from: D1 */
    public final s0 F0(yc.k kVar, x xVar, o oVar) {
        jc.l.e(kVar, "newOwner");
        jc.l.e(oVar, "visibility");
        h0.q(2, "kind");
        return this;
    }

    @Override // bd.z, yc.b
    public final Object E0(yc.a aVar) {
        return null;
    }

    @Override // bd.z, yc.c
    public final /* bridge */ /* synthetic */ yc.c F0(yc.e eVar, x xVar, o oVar) {
        F0(eVar, xVar, oVar);
        return this;
    }

    @Override // bd.s0, bd.z
    public final z F1(int i10, be.e eVar, yc.k kVar, t tVar, m0 m0Var, zc.h hVar) {
        jc.l.e(kVar, "newOwner");
        h0.q(i10, "kind");
        jc.l.e(hVar, "annotations");
        return this;
    }

    @Override // bd.z, yc.c
    public final void H0(Collection collection) {
        jc.l.e(collection, "overriddenDescriptors");
    }

    @Override // bd.z, yc.t
    public final boolean I() {
        return false;
    }

    @Override // bd.s0, bd.z, yc.t
    public final s M0() {
        return new y1(16, this);
    }
}
