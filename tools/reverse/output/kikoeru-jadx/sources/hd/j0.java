package hd;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final short f8401a;

    public j0(short s10) {
        this.f8401a = s10;
    }

    @Override // hd.c0
    public final Object a() {
        return new ub.y(this.f8401a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j0) && this.f8401a == ((j0) obj).f8401a;
    }

    public final int hashCode() {
        return this.f8401a;
    }
}
