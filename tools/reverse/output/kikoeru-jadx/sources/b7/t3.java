package b7;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t3 f2102c = new t3(false, false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f2103d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f2104e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f2105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f2106b;

    static {
        int i10 = p4.c0.f16548a;
        f2103d = Integer.toString(0, 36);
        f2104e = Integer.toString(1, 36);
    }

    public t3(boolean z10, boolean z11) {
        this.f2105a = z10;
        this.f2106b = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t3)) {
            return false;
        }
        t3 t3Var = (t3) obj;
        return this.f2105a == t3Var.f2105a && this.f2106b == t3Var.f2106b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f2105a), Boolean.valueOf(this.f2106b)});
    }
}
