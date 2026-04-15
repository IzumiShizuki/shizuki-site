package hd;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class v extends c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f8470a;

    public v(byte b10) {
        this.f8470a = b10;
    }

    @Override // hd.c0
    public final Object a() {
        return Byte.valueOf(this.f8470a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && this.f8470a == ((v) obj).f8470a;
    }

    public final int hashCode() {
        return this.f8470a;
    }
}
