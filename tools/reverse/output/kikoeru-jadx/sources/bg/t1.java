package bg;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@sf.g
public final class t1 {
    public static final s1 Companion = new s1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f2973d;

    public t1(int i10, long j10, String str, String str2, boolean z10) {
        if (15 != (i10 & 15)) {
            wf.z0.i(i10, 15, r1.f2959b);
            throw null;
        }
        this.f2970a = j10;
        this.f2971b = str;
        this.f2972c = str2;
        this.f2973d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj;
        return this.f2970a == t1Var.f2970a && jc.l.a(this.f2971b, t1Var.f2971b) && jc.l.a(this.f2972c, t1Var.f2972c) && this.f2973d == t1Var.f2973d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    public final int hashCode() {
        long j10 = this.f2970a;
        int iE = j2.h0.e(j2.h0.e(((int) (j10 ^ (j10 >>> 32))) * 31, 31, this.f2971b), 31, this.f2972c);
        boolean z10 = this.f2973d;
        ?? r12 = z10;
        if (z10) {
            r12 = 1;
        }
        return iE + r12;
    }

    public final String toString() {
        return "OtherWork(id=" + this.f2970a + ", lang=" + this.f2971b + ", title=" + this.f2972c + ", is_original=" + this.f2973d + ')';
    }
}
