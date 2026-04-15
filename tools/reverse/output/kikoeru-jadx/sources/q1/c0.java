package q1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends h0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p1.c f17495e;

    public c0(p1.c cVar) {
        this.f17495e = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c0) {
            return jc.l.a(this.f17495e, ((c0) obj).f17495e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17495e.hashCode();
    }

    @Override // q1.h0
    public final p1.c o() {
        return this.f17495e;
    }
}
