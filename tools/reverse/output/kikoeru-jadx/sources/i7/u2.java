package i7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class u2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9334d;

    public u2(int i10, int i11, int i12, int i13) {
        this.f9331a = i10;
        this.f9332b = i11;
        this.f9333c = i12;
        this.f9334d = i13;
    }

    public final int a(d0 d0Var) {
        jc.l.e(d0Var, "loadType");
        int iOrdinal = d0Var.ordinal();
        if (iOrdinal == 0) {
            throw new IllegalArgumentException("Cannot get presentedItems for loadType: REFRESH");
        }
        if (iOrdinal == 1) {
            return this.f9331a;
        }
        if (iOrdinal == 2) {
            return this.f9332b;
        }
        throw new ce.j0();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u2)) {
            return false;
        }
        u2 u2Var = (u2) obj;
        return this.f9331a == u2Var.f9331a && this.f9332b == u2Var.f9332b && this.f9333c == u2Var.f9333c && this.f9334d == u2Var.f9334d;
    }

    public int hashCode() {
        return this.f9331a + this.f9332b + this.f9333c + this.f9334d;
    }
}
