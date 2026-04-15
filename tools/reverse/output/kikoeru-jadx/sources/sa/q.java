package sa;

import n7.b0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q implements qa.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qa.b f19736a;

    public q(qa.b bVar) {
        jc.l.e(bVar, "whitePoint");
        this.f19736a = bVar;
        b0.u("XYZ");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && jc.l.a(this.f19736a, ((q) obj).f19736a);
    }

    public final int hashCode() {
        return this.f19736a.hashCode();
    }

    public final String toString() {
        return "XYZColorSpace(" + this.f19736a + ')';
    }

    @Override // qa.c
    public final qa.b z() {
        throw null;
    }
}
