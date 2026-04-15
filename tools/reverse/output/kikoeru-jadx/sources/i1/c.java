package i1;

import g5.w;
import ic.n;
import java.util.List;
import x0.o;
import y0.j0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c implements j0, yb.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final w f8638b = new w(17);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f8639a;

    public c(o oVar) {
        this.f8639a = oVar;
    }

    @Override // yb.h
    public final yb.h G(yb.h hVar) {
        return ud.b.C(this, hVar);
    }

    @Override // yb.h
    public final yb.h L(yb.g gVar) {
        return ud.b.z(this, gVar);
    }

    @Override // yb.h
    public final yb.f R(yb.g gVar) {
        return ud.b.o(this, gVar);
    }

    @Override // yb.f
    public final yb.g getKey() {
        return f8638b;
    }

    @Override // y0.j0
    public final List h(Integer num) {
        return this.f8639a.D();
    }

    @Override // yb.h
    public final Object y(n nVar, Object obj) {
        return nVar.q(obj, this);
    }
}
