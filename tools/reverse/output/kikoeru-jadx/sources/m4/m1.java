package m4;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m1 f14398d = new m1(new l1());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f14399e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f14400f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f14401g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f14403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f14404c;

    static {
        int i10 = p4.c0.f16548a;
        f14399e = Integer.toString(1, 36);
        f14400f = Integer.toString(2, 36);
        f14401g = Integer.toString(3, 36);
    }

    public m1(l1 l1Var) {
        this.f14402a = l1Var.f14390a;
        this.f14403b = l1Var.f14391b;
        this.f14404c = l1Var.f14392c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m1.class == obj.getClass()) {
            m1 m1Var = (m1) obj;
            if (this.f14402a == m1Var.f14402a && this.f14403b == m1Var.f14403b && this.f14404c == m1Var.f14404c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f14402a + 31) * 31) + (this.f14403b ? 1 : 0)) * 31) + (this.f14404c ? 1 : 0);
    }
}
