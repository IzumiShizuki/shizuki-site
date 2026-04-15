package z4;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f26452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f26453b;

    public q(long j10, long j11) {
        this.f26452a = j10;
        this.f26453b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f26452a == qVar.f26452a && this.f26453b == qVar.f26453b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f26452a) * 31) + ((int) this.f26453b);
    }
}
