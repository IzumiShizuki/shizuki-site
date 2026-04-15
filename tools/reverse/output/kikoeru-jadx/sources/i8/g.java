package i8;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v1.b f9418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s8.o f9419b;

    public g(v1.b bVar, s8.o oVar) {
        this.f9418a = bVar;
        this.f9419b = oVar;
    }

    @Override // i8.h
    public final v1.b a() {
        return this.f9418a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return jc.l.a(this.f9418a, gVar.f9418a) && jc.l.a(this.f9419b, gVar.f9419b);
    }

    public final int hashCode() {
        return this.f9419b.hashCode() + (this.f9418a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(painter=" + this.f9418a + ", result=" + this.f9419b + ')';
    }
}
