package m4;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class u1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u1 f14594d = new u1(1.0f, 0, 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f14595e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f14596f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f14597g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f14600c;

    static {
        int i10 = p4.c0.f16548a;
        f14595e = Integer.toString(0, 36);
        f14596f = Integer.toString(1, 36);
        f14597g = Integer.toString(3, 36);
    }

    public u1(float f10, int i10, int i11) {
        this.f14598a = i10;
        this.f14599b = i11;
        this.f14600c = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u1) {
            u1 u1Var = (u1) obj;
            if (this.f14598a == u1Var.f14598a && this.f14599b == u1Var.f14599b && this.f14600c == u1Var.f14600c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f14600c) + ((((217 + this.f14598a) * 31) + this.f14599b) * 31);
    }
}
