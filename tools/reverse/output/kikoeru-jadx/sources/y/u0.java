package y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f25265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f25266d;

    public u0(int i10, int i11, int i12, int i13) {
        this.f25263a = i10;
        this.f25264b = i11;
        this.f25265c = i12;
        this.f25266d = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return this.f25263a == u0Var.f25263a && this.f25264b == u0Var.f25264b && this.f25265c == u0Var.f25265c && this.f25266d == u0Var.f25266d;
    }

    public final int hashCode() {
        return (((((this.f25263a * 31) + this.f25264b) * 31) + this.f25265c) * 31) + this.f25266d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InsetsValues(left=");
        sb.append(this.f25263a);
        sb.append(", top=");
        sb.append(this.f25264b);
        sb.append(", right=");
        sb.append(this.f25265c);
        sb.append(", bottom=");
        return j2.h0.m(sb, this.f25266d, ')');
    }
}
