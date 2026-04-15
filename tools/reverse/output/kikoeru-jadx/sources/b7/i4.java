package b7;

import android.os.Bundle;
import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i4 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f1862e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f1863f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f1864g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f1865h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f1867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f1868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g4 f1869d;

    static {
        int i10 = p4.c0.f16548a;
        f1862e = Integer.toString(0, 36);
        f1863f = Integer.toString(1, 36);
        f1864g = Integer.toString(2, 36);
        f1865h = Integer.toString(3, 36);
    }

    public i4(int i10) {
        this(i10, Bundle.EMPTY);
    }

    public static i4 a(Bundle bundle) {
        int i10 = bundle.getInt(f1862e, -1);
        Bundle bundle2 = bundle.getBundle(f1863f);
        long j10 = bundle.getLong(f1864g, SystemClock.elapsedRealtime());
        Bundle bundle3 = bundle.getBundle(f1865h);
        g4 g4VarA = bundle3 != null ? g4.a(bundle3) : i10 != 0 ? new g4(i10) : null;
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new i4(i10, bundle2, j10, g4VarA);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt(f1862e, this.f1866a);
        bundle.putBundle(f1863f, this.f1867b);
        bundle.putLong(f1864g, this.f1868c);
        g4 g4Var = this.f1869d;
        if (g4Var != null) {
            bundle.putBundle(f1865h, g4Var.b());
        }
        return bundle;
    }

    public i4(int i10, Bundle bundle) {
        this(i10, bundle, SystemClock.elapsedRealtime(), null);
    }

    public i4(int i10, Bundle bundle, long j10, g4 g4Var) {
        p4.c.c(g4Var == null || i10 < 0);
        this.f1866a = i10;
        this.f1867b = new Bundle(bundle);
        this.f1868c = j10;
        if (g4Var == null && i10 < 0) {
            g4Var = new g4(i10);
        }
        this.f1869d = g4Var;
    }
}
