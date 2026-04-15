package b7;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f1841g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f1842h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f1843i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f1844j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f1845k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f1846l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1850d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f1851e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f1852f;

    static {
        int i10 = p4.c0.f16548a;
        f1841g = Integer.toString(0, 36);
        f1842h = Integer.toString(1, 36);
        f1843i = Integer.toString(2, 36);
        f1844j = Integer.toString(3, 36);
        f1845k = Integer.toString(4, 36);
        f1846l = Integer.toString(5, 36);
    }

    public i(String str, int i10, Bundle bundle) {
        this(1006000001, 7, str, i10, new Bundle(bundle), 0);
    }

    public static i a(Bundle bundle) {
        int i10 = bundle.getInt(f1841g, 0);
        int i11 = bundle.getInt(f1845k, 0);
        String string = bundle.getString(f1842h);
        string.getClass();
        String str = f1843i;
        p4.c.c(bundle.containsKey(str));
        int i12 = bundle.getInt(str);
        Bundle bundle2 = bundle.getBundle(f1844j);
        int i13 = bundle.getInt(f1846l, 0);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new i(i10, i11, string, i12, bundle2, i13);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt(f1841g, this.f1847a);
        bundle.putString(f1842h, this.f1849c);
        bundle.putInt(f1843i, this.f1850d);
        bundle.putBundle(f1844j, this.f1851e);
        bundle.putInt(f1845k, this.f1848b);
        bundle.putInt(f1846l, this.f1852f);
        return bundle;
    }

    public i(int i10, int i11, String str, int i12, Bundle bundle, int i13) {
        this.f1847a = i10;
        this.f1848b = i11;
        this.f1849c = str;
        this.f1850d = i12;
        this.f1851e = bundle;
        this.f1852f = i13;
    }
}
