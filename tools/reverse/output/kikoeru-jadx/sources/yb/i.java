package yb;

import ic.n;
import java.io.Serializable;
import jc.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i implements h, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f26088a = new i();

    @Override // yb.h
    public final h G(h hVar) {
        l.e(hVar, "context");
        return hVar;
    }

    @Override // yb.h
    public final h L(g gVar) {
        l.e(gVar, "key");
        return this;
    }

    @Override // yb.h
    public final f R(g gVar) {
        l.e(gVar, "key");
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // yb.h
    public final Object y(n nVar, Object obj) {
        return obj;
    }
}
