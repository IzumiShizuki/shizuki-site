package i8;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v1.b f9417a;

    public f(v1.b bVar) {
        this.f9417a = bVar;
    }

    @Override // i8.h
    public final v1.b a() {
        return this.f9417a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && jc.l.a(this.f9417a, ((f) obj).f9417a);
    }

    public final int hashCode() {
        v1.b bVar = this.f9417a;
        if (bVar == null) {
            return 0;
        }
        return bVar.hashCode();
    }

    public final String toString() {
        return "Loading(painter=" + this.f9417a + ')';
    }
}
