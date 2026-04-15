package m4;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a1 extends z0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f14117d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f14118e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f14120c;

    static {
        int i10 = p4.c0.f16548a;
        f14117d = Integer.toString(1, 36);
        f14118e = Integer.toString(2, 36);
    }

    public a1(float f10, int i10) {
        boolean z10 = false;
        p4.c.b("maxStars must be a positive integer", i10 > 0);
        if (f10 >= 0.0f && f10 <= i10) {
            z10 = true;
        }
        p4.c.b("starRating is out of range [0, maxStars]", z10);
        this.f14119b = i10;
        this.f14120c = f10;
    }

    @Override // m4.z0
    public final boolean b() {
        return this.f14120c != -1.0f;
    }

    @Override // m4.z0
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(z0.f14649a, 2);
        bundle.putInt(f14117d, this.f14119b);
        bundle.putFloat(f14118e, this.f14120c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return this.f14119b == a1Var.f14119b && this.f14120c == a1Var.f14120c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f14119b), Float.valueOf(this.f14120c)});
    }

    public a1(int i10) {
        p4.c.b("maxStars must be a positive integer", i10 > 0);
        this.f14119b = i10;
        this.f14120c = -1.0f;
    }
}
