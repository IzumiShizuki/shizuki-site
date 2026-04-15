package bd;

import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g implements se.k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f2568a;

    public g(h hVar) {
        this.f2568a = hVar;
    }

    @Override // se.k0
    public final vc.i g() {
        return ie.d.e(this.f2568a);
    }

    @Override // se.k0
    public final yc.h h() {
        return this.f2568a;
    }

    @Override // se.k0
    public final Collection i() {
        Collection collectionI = ((qe.s) this.f2568a).F1().t().i();
        jc.l.d(collectionI, "getSupertypes(...)");
        return collectionI;
    }

    @Override // se.k0
    public final boolean j() {
        return true;
    }

    @Override // se.k0
    public final List o() {
        List list = ((qe.s) this.f2568a).f18221p;
        if (list != null) {
            return list;
        }
        jc.l.k("typeConstructorParameters");
        throw null;
    }

    public final String toString() {
        return "[typealias " + this.f2568a.getName().b() + ']';
    }
}
