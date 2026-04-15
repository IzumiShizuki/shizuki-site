package xc;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final be.b f24902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final be.b f24903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final be.b f24904c;

    public c(be.b bVar, be.b bVar2, be.b bVar3) {
        this.f24902a = bVar;
        this.f24903b = bVar2;
        this.f24904c = bVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return jc.l.a(this.f24902a, cVar.f24902a) && jc.l.a(this.f24903b, cVar.f24903b) && jc.l.a(this.f24904c, cVar.f24904c);
    }

    public final int hashCode() {
        return this.f24904c.hashCode() + ((this.f24903b.hashCode() + (this.f24902a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PlatformMutabilityMapping(javaClass=" + this.f24902a + ", kotlinReadOnly=" + this.f24903b + ", kotlinMutable=" + this.f24904c + ')';
    }
}
