package m4;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f14504f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f14505g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f14506h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f14507i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j1 f14509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f14510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f14511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean[] f14512e;

    static {
        int i10 = p4.c0.f16548a;
        f14504f = Integer.toString(0, 36);
        f14505g = Integer.toString(1, 36);
        f14506h = Integer.toString(3, 36);
        f14507i = Integer.toString(4, 36);
    }

    public p1(j1 j1Var, boolean z10, int[] iArr, boolean[] zArr) {
        int i10 = j1Var.f14304a;
        this.f14508a = i10;
        boolean z11 = false;
        p4.c.c(i10 == iArr.length && i10 == zArr.length);
        this.f14509b = j1Var;
        if (z10 && i10 > 1) {
            z11 = true;
        }
        this.f14510c = z11;
        this.f14511d = (int[]) iArr.clone();
        this.f14512e = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p1.class == obj.getClass()) {
            p1 p1Var = (p1) obj;
            if (this.f14510c == p1Var.f14510c && this.f14509b.equals(p1Var.f14509b) && Arrays.equals(this.f14511d, p1Var.f14511d) && Arrays.equals(this.f14512e, p1Var.f14512e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f14512e) + ((Arrays.hashCode(this.f14511d) + (((this.f14509b.hashCode() * 31) + (this.f14510c ? 1 : 0)) * 31)) * 31);
    }
}
