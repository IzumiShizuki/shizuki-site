package kf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f11378a;

    public k(Throwable th2) {
        this.f11378a = th2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return jc.l.a(this.f11378a, ((k) obj).f11378a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th2 = this.f11378a;
        if (th2 != null) {
            return th2.hashCode();
        }
        return 0;
    }

    @Override // kf.l
    public final String toString() {
        return "Closed(" + this.f11378a + ')';
    }
}
