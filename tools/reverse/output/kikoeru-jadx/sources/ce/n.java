package ce;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r0 f3956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f3957c;

    public n(int i10, r0 r0Var, boolean z10) {
        this.f3955a = i10;
        this.f3956b = r0Var;
        this.f3957c = z10;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f3955a - ((n) obj).f3955a;
    }
}
