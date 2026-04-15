package b7;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f1873e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f1874f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f1875g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f1876h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f1877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f1879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f1880d;

    static {
        int i10 = p4.c0.f16548a;
        f1873e = Integer.toString(0, 36);
        f1874f = Integer.toString(1, 36);
        f1875g = Integer.toString(2, 36);
        f1876h = Integer.toString(3, 36);
    }

    public j1(Bundle bundle, boolean z10, boolean z11, boolean z12) {
        this.f1877a = new Bundle(bundle);
        this.f1878b = z10;
        this.f1879c = z11;
        this.f1880d = z12;
    }

    public static j1 a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(f1873e);
        boolean z10 = bundle.getBoolean(f1874f, false);
        boolean z11 = bundle.getBoolean(f1875g, false);
        boolean z12 = bundle.getBoolean(f1876h, false);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new j1(bundle2, z10, z11, z12);
    }
}
