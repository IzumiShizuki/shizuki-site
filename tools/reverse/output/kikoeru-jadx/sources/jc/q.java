package jc;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f10832a;

    public q(Class cls) {
        l.e(cls, "jClass");
        this.f10832a = cls;
    }

    @Override // jc.e
    public final Class b() {
        return this.f10832a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            return l.a(this.f10832a, ((q) obj).f10832a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10832a.hashCode();
    }

    public final String toString() {
        return this.f10832a.toString() + " (Kotlin reflection is not available)";
    }
}
