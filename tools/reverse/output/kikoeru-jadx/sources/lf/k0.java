package lf;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements z0, f, mf.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b1 f12434a;

    public k0(b1 b1Var) {
        this.f12434a = b1Var;
    }

    @Override // lf.l0
    public final List a() {
        return this.f12434a.a();
    }

    @Override // lf.f
    public final Object b(g gVar, yb.c cVar) {
        this.f12434a.b(gVar, cVar);
        return zb.a.f26667a;
    }

    @Override // mf.m
    public final f c(yb.h hVar, int i10, kf.a aVar) {
        return (((i10 < 0 || i10 >= 2) && i10 != -2) || aVar != kf.a.f11337b) ? p0.o(this, hVar, i10, aVar) : this;
    }

    @Override // lf.z0
    public final Object getValue() {
        return this.f12434a.getValue();
    }
}
