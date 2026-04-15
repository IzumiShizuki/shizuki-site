package i8;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v1.b f9415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s8.e f9416b;

    public e(v1.b bVar, s8.e eVar) {
        this.f9415a = bVar;
        this.f9416b = eVar;
    }

    @Override // i8.h
    public final v1.b a() {
        return this.f9415a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return jc.l.a(this.f9415a, eVar.f9415a) && jc.l.a(this.f9416b, eVar.f9416b);
    }

    public final int hashCode() {
        v1.b bVar = this.f9415a;
        return this.f9416b.hashCode() + ((bVar == null ? 0 : bVar.hashCode()) * 31);
    }

    public final String toString() {
        return "Error(painter=" + this.f9415a + ", result=" + this.f9416b + ')';
    }
}
