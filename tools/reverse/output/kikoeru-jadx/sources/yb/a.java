package yb;

import ic.n;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f26084a;

    public a(g gVar) {
        this.f26084a = gVar;
    }

    @Override // yb.h
    public final /* bridge */ h G(h hVar) {
        return ud.b.C(this, hVar);
    }

    @Override // yb.h
    public /* bridge */ h L(g gVar) {
        return ud.b.z(this, gVar);
    }

    @Override // yb.h
    public /* bridge */ f R(g gVar) {
        return ud.b.o(this, gVar);
    }

    @Override // yb.f
    public final g getKey() {
        return this.f26084a;
    }

    @Override // yb.h
    public final Object y(n nVar, Object obj) {
        return nVar.q(obj, this);
    }
}
