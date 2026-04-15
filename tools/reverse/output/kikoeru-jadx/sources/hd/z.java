package hd;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class z extends c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f8500a;

    public z(float f10) {
        this.f8500a = f10;
    }

    @Override // hd.c0
    public final Object a() {
        return Float.valueOf(this.f8500a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && Float.compare(this.f8500a, ((z) obj).f8500a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f8500a);
    }
}
