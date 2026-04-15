package be;

import ef.u;
import jc.l;
import pc.f0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f2738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f2739b;

    static {
        e eVar = g.f2760f;
        c cVar = c.f2743c;
        f0.U(eVar);
    }

    public a(c cVar, e eVar) {
        l.e(cVar, "packageName");
        this.f2738a = cVar;
        this.f2739b = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f2738a, aVar.f2738a) && this.f2739b.equals(aVar.f2739b);
    }

    public final int hashCode() {
        return this.f2739b.hashCode() + ((this.f2738a.hashCode() + 527) * 961);
    }

    public final String toString() {
        return u.i0(this.f2738a.f2744a.f2747a, '.', '/') + "/" + this.f2739b;
    }
}
