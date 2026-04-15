package hd;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8371a;

    public d0(long j10) {
        this.f8371a = j10;
    }

    @Override // hd.c0
    public final Object a() {
        return Long.valueOf(this.f8371a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d0) && this.f8371a == ((d0) obj).f8371a;
    }

    public final int hashCode() {
        long j10 = this.f8371a;
        return (int) (j10 ^ (j10 >>> 32));
    }
}
