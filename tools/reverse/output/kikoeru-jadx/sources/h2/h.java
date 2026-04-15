package h2;

import x0.e1;
import x0.v;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h extends a2.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f8113d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e1 f8114e = v.v(null);

    public h(g gVar) {
        this.f8113d = gVar;
    }

    @Override // a2.c
    public final boolean C(g gVar) {
        return gVar == this.f8113d;
    }

    @Override // a2.c
    public final Object I(g gVar) {
        if (gVar != this.f8113d) {
            f2.a.b("Check failed.");
        }
        Object value = this.f8114e.getValue();
        if (value == null) {
            return null;
        }
        return value;
    }

    public final void h0(g gVar, Object obj) {
        if (gVar != this.f8113d) {
            f2.a.b("Check failed.");
        }
        this.f8114e.setValue(obj);
    }
}
