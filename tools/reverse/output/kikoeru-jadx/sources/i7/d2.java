package i7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d2 extends g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f9085a;

    public d2(Throwable th2) {
        this.f9085a = th2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d2) && jc.l.a(this.f9085a, ((d2) obj).f9085a);
    }

    public final int hashCode() {
        return this.f9085a.hashCode();
    }

    public final String toString() {
        return ef.o.a0("LoadResult.Error(\n                    |   throwable: " + this.f9085a + "\n                    |) ");
    }
}
