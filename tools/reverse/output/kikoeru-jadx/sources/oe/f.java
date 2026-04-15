package oe;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final be.b f16358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f16359b;

    public f(be.b bVar, d dVar) {
        jc.l.e(bVar, "classId");
        this.f16358a = bVar;
        this.f16359b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return jc.l.a(this.f16358a, ((f) obj).f16358a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16358a.hashCode();
    }
}
