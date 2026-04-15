package e7;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f6343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f6344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f6345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f6346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f6347e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f6348f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f6349g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f6350h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final d f6351i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c f6352j;

    static {
        int i10 = 2;
        boolean z10 = false;
        f6343a = new d(i10, z10);
        boolean z11 = true;
        f6344b = new c(i10, z11);
        int i11 = 3;
        f6345c = new d(i11, z10);
        f6346d = new c(i11, z11);
        int i12 = 1;
        f6347e = new d(i12, z10);
        f6348f = new c(i12, z11);
        int i13 = 0;
        f6349g = new d(i13, z10);
        f6350h = new c(i13, z11);
        int i14 = 4;
        f6351i = new d(i14, z11);
        f6352j = new c(i14, z11);
    }

    public k0(boolean z10) {
    }

    public abstract Object a(String str, Bundle bundle);

    public abstract String b();

    public Object c(Object obj, String str) {
        return d(str);
    }

    public abstract Object d(String str);

    public abstract void e(Bundle bundle, String str, Object obj);

    public final String toString() {
        return b();
    }
}
