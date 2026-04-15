package oe;

import bd.f0;
import yc.m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class v extends w {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final be.c f16430d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(be.c cVar, yd.f fVar, f0 f0Var, m0 m0Var) {
        super(fVar, f0Var, m0Var);
        jc.l.e(cVar, "fqName");
        jc.l.e(fVar, "nameResolver");
        this.f16430d = cVar;
    }

    @Override // oe.w
    public final be.c a() {
        return this.f16430d;
    }
}
