package m4;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class x0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f14624j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f14625k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f14626l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f14627m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f14628n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f14629o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f14630p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f14631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0 f14633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f14634d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f14635e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f14636f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f14637g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f14638h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f14639i;

    static {
        int i10 = p4.c0.f16548a;
        f14624j = Integer.toString(0, 36);
        f14625k = Integer.toString(1, 36);
        f14626l = Integer.toString(2, 36);
        f14627m = Integer.toString(3, 36);
        f14628n = Integer.toString(4, 36);
        f14629o = Integer.toString(5, 36);
        f14630p = Integer.toString(6, 36);
    }

    public x0(Object obj, int i10, i0 i0Var, Object obj2, int i11, long j10, long j11, int i12, int i13) {
        this.f14631a = obj;
        this.f14632b = i10;
        this.f14633c = i0Var;
        this.f14634d = obj2;
        this.f14635e = i11;
        this.f14636f = j10;
        this.f14637g = j11;
        this.f14638h = i12;
        this.f14639i = i13;
    }

    public static x0 c(Bundle bundle) {
        int i10 = bundle.getInt(f14624j, 0);
        Bundle bundle2 = bundle.getBundle(f14625k);
        return new x0(null, i10, bundle2 == null ? null : i0.a(bundle2), null, bundle.getInt(f14626l, 0), bundle.getLong(f14627m, 0L), bundle.getLong(f14628n, 0L), bundle.getInt(f14629o, -1), bundle.getInt(f14630p, -1));
    }

    public final boolean a(x0 x0Var) {
        return this.f14632b == x0Var.f14632b && this.f14635e == x0Var.f14635e && this.f14636f == x0Var.f14636f && this.f14637g == x0Var.f14637g && this.f14638h == x0Var.f14638h && this.f14639i == x0Var.f14639i && ud.n.f(this.f14633c, x0Var.f14633c);
    }

    public final x0 b(boolean z10, boolean z11) {
        if (z10 && z11) {
            return this;
        }
        return new x0(this.f14631a, z11 ? this.f14632b : 0, z10 ? this.f14633c : null, this.f14634d, z11 ? this.f14635e : 0, z10 ? this.f14636f : 0L, z10 ? this.f14637g : 0L, z10 ? this.f14638h : -1, z10 ? this.f14639i : -1);
    }

    public final Bundle d(int i10) {
        Bundle bundle = new Bundle();
        int i11 = this.f14632b;
        if (i10 < 3 || i11 != 0) {
            bundle.putInt(f14624j, i11);
        }
        i0 i0Var = this.f14633c;
        if (i0Var != null) {
            bundle.putBundle(f14625k, i0Var.c(false));
        }
        int i12 = this.f14635e;
        if (i10 < 3 || i12 != 0) {
            bundle.putInt(f14626l, i12);
        }
        long j10 = this.f14636f;
        if (i10 < 3 || j10 != 0) {
            bundle.putLong(f14627m, j10);
        }
        long j11 = this.f14637g;
        if (i10 < 3 || j11 != 0) {
            bundle.putLong(f14628n, j11);
        }
        int i13 = this.f14638h;
        if (i13 != -1) {
            bundle.putInt(f14629o, i13);
        }
        int i14 = this.f14639i;
        if (i14 != -1) {
            bundle.putInt(f14630p, i14);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x0.class == obj.getClass()) {
            x0 x0Var = (x0) obj;
            if (a(x0Var) && ud.n.f(this.f14631a, x0Var.f14631a) && ud.n.f(this.f14634d, x0Var.f14634d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14631a, Integer.valueOf(this.f14632b), this.f14633c, this.f14634d, Integer.valueOf(this.f14635e), Long.valueOf(this.f14636f), Long.valueOf(this.f14637g), Integer.valueOf(this.f14638h), Integer.valueOf(this.f14639i)});
    }
}
