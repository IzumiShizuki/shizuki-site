package e7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f6311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f6312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f6314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f6315e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f6316f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f6317g;

    public d0(boolean z10, boolean z11, int i10, boolean z12, boolean z13, int i11, int i12) {
        this.f6311a = z10;
        this.f6312b = z11;
        this.f6313c = i10;
        this.f6314d = z12;
        this.f6315e = z13;
        this.f6316f = i11;
        this.f6317g = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.f6311a == d0Var.f6311a && this.f6312b == d0Var.f6312b && this.f6313c == d0Var.f6313c && this.f6314d == d0Var.f6314d && this.f6315e == d0Var.f6315e && this.f6316f == d0Var.f6316f && this.f6317g == d0Var.f6317g;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f6311a ? 1 : 0) * 31) + (this.f6312b ? 1 : 0)) * 31) + this.f6313c) * 923521) + (this.f6314d ? 1 : 0)) * 31) + (this.f6315e ? 1 : 0)) * 31) + this.f6316f) * 31) + this.f6317g) * 31) - 1) * 31) - 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(d0.class.getSimpleName());
        sb.append("(");
        if (this.f6311a) {
            sb.append("launchSingleTop ");
        }
        if (this.f6312b) {
            sb.append("restoreState ");
        }
        int i10 = this.f6317g;
        int i11 = this.f6316f;
        if (i11 != -1 || i10 != -1) {
            sb.append("anim(enterAnim=0x");
            sb.append(Integer.toHexString(i11));
            sb.append(" exitAnim=0x");
            sb.append(Integer.toHexString(i10));
            sb.append(" popEnterAnim=0x");
            sb.append(Integer.toHexString(-1));
            sb.append(" popExitAnim=0x");
            sb.append(Integer.toHexString(-1));
            sb.append(")");
        }
        String string = sb.toString();
        jc.l.d(string, "toString(...)");
        return string;
    }
}
