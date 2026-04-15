package oe;

import bd.f0;
import u3.x0;
import yc.m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class u extends w {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wd.k f16425d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u f16426e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final be.b f16427f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final wd.j f16428g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f16429h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(wd.k kVar, yd.f fVar, f0 f0Var, m0 m0Var, u uVar) {
        super(fVar, f0Var, m0Var);
        jc.l.e(kVar, "classProto");
        jc.l.e(fVar, "nameResolver");
        this.f16425d = kVar;
        this.f16426e = uVar;
        this.f16427f = x0.m(fVar, kVar.f23805e);
        wd.j jVar = (wd.j) yd.d.f26176f.d(kVar.f23804d);
        this.f16428g = jVar == null ? wd.j.f23770b : jVar;
        this.f16429h = yd.d.f26177g.d(kVar.f23804d).booleanValue();
        yd.d.f26178h.getClass();
    }

    @Override // oe.w
    public final be.c a() {
        return this.f16427f.a();
    }
}
