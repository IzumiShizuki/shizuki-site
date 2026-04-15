package hd;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final short f8377a;

    public e0(short s10) {
        this.f8377a = s10;
    }

    @Override // hd.c0
    public final Object a() {
        return Short.valueOf(this.f8377a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e0) && this.f8377a == ((e0) obj).f8377a;
    }

    public final int hashCode() {
        return this.f8377a;
    }
}
