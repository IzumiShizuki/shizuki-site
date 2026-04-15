package dd;

import ef.u;
import jc.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f5866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i5.f f5867b;

    public c(Class cls, i5.f fVar) {
        this.f5866a = cls;
        this.f5867b = fVar;
    }

    public final String a() {
        return u.i0(this.f5866a.getName(), '.', '/').concat(".class");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return l.a(this.f5866a, ((c) obj).f5866a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5866a.hashCode();
    }

    public final String toString() {
        return c.class.getName() + ": " + this.f5866a;
    }
}
