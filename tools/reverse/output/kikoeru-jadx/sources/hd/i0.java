package hd;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8399a;

    public i0(long j10) {
        this.f8399a = j10;
    }

    @Override // hd.c0
    public final Object a() {
        return new ub.v(this.f8399a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i0) && this.f8399a == ((i0) obj).f8399a;
    }

    public final int hashCode() {
        return ub.v.a(this.f8399a);
    }
}
