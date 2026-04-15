package r5;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c0 f18783c = new c0(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f18785b;

    public c0(long j10, long j11) {
        this.f18784a = j10;
        this.f18785b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c0.class == obj.getClass()) {
            c0 c0Var = (c0) obj;
            if (this.f18784a == c0Var.f18784a && this.f18785b == c0Var.f18785b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f18784a) * 31) + ((int) this.f18785b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[timeUs=");
        sb.append(this.f18784a);
        sb.append(", position=");
        return a0.c.H(this.f18785b, "]", sb);
    }
}
