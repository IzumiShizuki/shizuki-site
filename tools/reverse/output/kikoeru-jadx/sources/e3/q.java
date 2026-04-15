package e3;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q f6091c = new q(lc.b.C(0), lc.b.C(0));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f6093b;

    public q(long j10, long j11) {
        this.f6092a = j10;
        this.f6093b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return f3.o.a(this.f6092a, qVar.f6092a) && f3.o.a(this.f6093b, qVar.f6093b);
    }

    public final int hashCode() {
        return f3.o.d(this.f6093b) + (f3.o.d(this.f6092a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) f3.o.e(this.f6092a)) + ", restLine=" + ((Object) f3.o.e(this.f6093b)) + ')';
    }
}
