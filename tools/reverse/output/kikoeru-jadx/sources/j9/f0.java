package j9;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10695b;

    public f0(long j10, String str) {
        jc.l.e(str, "text");
        this.f10694a = j10;
        this.f10695b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return this.f10694a == f0Var.f10694a && jc.l.a(this.f10695b, f0Var.f10695b);
    }

    public final int hashCode() {
        long j10 = this.f10694a;
        return this.f10695b.hashCode() + (((int) (j10 ^ (j10 >>> 32))) * 31);
    }

    public final String toString() {
        return "SingleLrc(timestamp=" + this.f10694a + ", text=" + this.f10695b + ")";
    }
}
