package b7;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f1631j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f1632k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f1633l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f1634m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f1635n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f1636o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f1637p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f1638q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f1639r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e4 f1640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1643d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Uri f1644e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CharSequence f1645f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bundle f1646g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final bb.a f1647h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f1648i;

    static {
        int i10 = p4.c0.f16548a;
        f1631j = Integer.toString(0, 36);
        f1632k = Integer.toString(1, 36);
        f1633l = Integer.toString(2, 36);
        f1634m = Integer.toString(3, 36);
        f1635n = Integer.toString(4, 36);
        f1636o = Integer.toString(5, 36);
        f1637p = Integer.toString(6, 36);
        f1638q = Integer.toString(7, 36);
        f1639r = Integer.toString(8, 36);
    }

    public b(e4 e4Var, int i10, int i11, int i12, Uri uri, CharSequence charSequence, Bundle bundle, boolean z10, bb.a aVar) {
        this.f1640a = e4Var;
        this.f1641b = i10;
        this.f1642c = i11;
        this.f1643d = i12;
        this.f1644e = uri;
        this.f1645f = charSequence;
        this.f1646g = new Bundle(bundle);
        this.f1648i = z10;
        this.f1647h = aVar;
    }

    public static boolean a(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (((b) list.get(i11)).f1647h.a(0) == i10) {
                return true;
            }
        }
        return false;
    }

    public static ya.a1 c(List list, f4 f4Var, m4.u0 u0Var) {
        int i10;
        ya.f0 f0Var = new ya.f0(4);
        for (int i11 = 0; i11 < list.size(); i11++) {
            b bVar = (b) list.get(i11);
            e4 e4Var = bVar.f1640a;
            if ((e4Var == null || !f4Var.f1778a.contains(e4Var)) && ((i10 = bVar.f1641b) == -1 || !u0Var.a(i10))) {
                if (bVar.f1648i) {
                    bVar = new b(bVar.f1640a, bVar.f1641b, bVar.f1642c, bVar.f1643d, bVar.f1644e, bVar.f1645f, new Bundle(bVar.f1646g), false, bVar.f1647h);
                }
                f0Var.a(bVar);
            } else {
                f0Var.a(bVar);
            }
        }
        return f0Var.f();
    }

    public static b d(int i10, Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(f1631j);
        e4 e4VarA = bundle2 == null ? null : e4.a(bundle2);
        int i11 = bundle.getInt(f1632k, -1);
        int i12 = bundle.getInt(f1633l, 0);
        CharSequence charSequence = bundle.getCharSequence(f1634m, "");
        Bundle bundle3 = bundle.getBundle(f1635n);
        boolean z10 = i10 < 3 || bundle.getBoolean(f1636o, true);
        Uri uri = (Uri) bundle.getParcelable(f1637p);
        int i13 = bundle.getInt(f1638q, 0);
        int[] intArray = bundle.getIntArray(f1639r);
        a aVar = new a(i13, i12);
        if (e4VarA != null) {
            aVar.d(e4VarA);
        }
        if (i11 != -1) {
            aVar.c(i11);
        }
        if (uri != null && (ud.n.f(uri.getScheme(), "content") || ud.n.f(uri.getScheme(), "android.resource"))) {
            p4.c.b("Only content or resource Uris are supported for CommandButton", ud.n.f(uri.getScheme(), "content") || ud.n.f(uri.getScheme(), "android.resource"));
            aVar.f1613e = uri;
        }
        aVar.f1614f = charSequence;
        if (bundle3 == null) {
            bundle3 = Bundle.EMPTY;
        }
        aVar.b(bundle3);
        aVar.f1616h = z10;
        if (intArray == null) {
            intArray = new int[]{6};
        }
        p4.c.c(intArray.length != 0);
        bb.a aVar2 = bb.a.f2532c;
        aVar.f1617i = intArray.length == 0 ? bb.a.f2532c : new bb.a(Arrays.copyOf(intArray, intArray.length));
        return aVar.a();
    }

    public static ya.a1 e(List list, boolean z10, boolean z11) {
        e4 e4Var;
        e4 e4Var2;
        int iA;
        if (list.isEmpty()) {
            ya.g0 g0Var = ya.i0.f25998b;
            return ya.a1.f25946e;
        }
        int i10 = -1;
        int i11 = -1;
        for (int i12 = 0; i12 < list.size(); i12++) {
            b bVar = (b) list.get(i12);
            boolean z12 = bVar.f1648i;
            bb.a aVar = bVar.f1647h;
            if (z12 && (e4Var2 = bVar.f1640a) != null && e4Var2.f1761a == 0) {
                int i13 = 0;
                while (true) {
                    if (i13 >= aVar.f2534b || (iA = aVar.a(i13)) == 6) {
                        break;
                    }
                    if (z10 && i10 == -1 && iA == 2) {
                        i10 = i12;
                        break;
                    }
                    if (z11 && i11 == -1 && iA == 3) {
                        i11 = i12;
                        break;
                    }
                    i13++;
                }
            }
        }
        ya.f0 f0VarP = ya.i0.p();
        if (i10 != -1) {
            f0VarP.a(((b) list.get(i10)).b(bb.a.b(2)));
        }
        if (i11 != -1) {
            f0VarP.a(((b) list.get(i11)).b(bb.a.b(3)));
        }
        for (int i14 = 0; i14 < list.size(); i14++) {
            b bVar2 = (b) list.get(i14);
            if (bVar2.f1648i && (e4Var = bVar2.f1640a) != null && e4Var.f1761a == 0 && i14 != i10 && i14 != i11) {
                bb.a aVar2 = bVar2.f1647h;
                aVar2.getClass();
                int i15 = 0;
                while (true) {
                    if (i15 >= aVar2.f2534b) {
                        i15 = -1;
                        break;
                    }
                    if (aVar2.f2533a[i15] == 6) {
                        break;
                    }
                    i15++;
                }
                if (i15 >= 0) {
                    f0VarP.a(bVar2.b(bb.a.b(6)));
                }
            }
        }
        return f0VarP.f();
    }

    public static ya.a1 f(List list, m4.u0 u0Var, Bundle bundle) {
        if (list.isEmpty()) {
            ya.g0 g0Var = ya.i0.f25998b;
            return ya.a1.f25946e;
        }
        boolean zA = u0Var.f14593a.a(7, 6);
        boolean zA2 = u0Var.f14593a.a(9, 8);
        boolean z10 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
        boolean z11 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
        int i10 = (zA || z10) ? -1 : 0;
        int i11 = (zA2 || z11) ? -1 : i10 == 0 ? 1 : 0;
        ya.f0 f0VarP = ya.i0.p();
        for (int i12 = 0; i12 < list.size(); i12++) {
            b bVar = (b) list.get(i12);
            if (i12 == i10) {
                if (i11 == -1) {
                    f0VarP.a(bVar.b(new bb.a(new int[]{2, 6})));
                } else {
                    f0VarP.a(bVar.b(new bb.a(new int[]{2, 3, 6})));
                }
            } else if (i12 == i11) {
                f0VarP.a(bVar.b(new bb.a(new int[]{3, 6})));
            } else {
                f0VarP.a(bVar.b(bb.a.b(6)));
            }
        }
        return f0VarP.f();
    }

    public final b b(bb.a aVar) {
        if (this.f1647h.equals(aVar)) {
            return this;
        }
        return new b(this.f1640a, this.f1641b, this.f1642c, this.f1643d, this.f1644e, this.f1645f, new Bundle(this.f1646g), this.f1648i, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return ud.n.f(this.f1640a, bVar.f1640a) && this.f1641b == bVar.f1641b && this.f1642c == bVar.f1642c && this.f1643d == bVar.f1643d && ud.n.f(this.f1644e, bVar.f1644e) && TextUtils.equals(this.f1645f, bVar.f1645f) && this.f1648i == bVar.f1648i && this.f1647h.equals(bVar.f1647h);
    }

    public final Bundle g() {
        Bundle bundle = new Bundle();
        e4 e4Var = this.f1640a;
        if (e4Var != null) {
            bundle.putBundle(f1631j, e4Var.b());
        }
        int i10 = this.f1641b;
        if (i10 != -1) {
            bundle.putInt(f1632k, i10);
        }
        int i11 = this.f1642c;
        if (i11 != 0) {
            bundle.putInt(f1638q, i11);
        }
        int i12 = this.f1643d;
        if (i12 != 0) {
            bundle.putInt(f1633l, i12);
        }
        CharSequence charSequence = this.f1645f;
        if (charSequence != "") {
            bundle.putCharSequence(f1634m, charSequence);
        }
        Bundle bundle2 = this.f1646g;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(f1635n, bundle2);
        }
        Uri uri = this.f1644e;
        if (uri != null) {
            bundle.putParcelable(f1637p, uri);
        }
        boolean z10 = this.f1648i;
        if (!z10) {
            bundle.putBoolean(f1636o, z10);
        }
        bb.a aVar = this.f1647h;
        if (aVar.f2534b == 1 && aVar.a(0) == 6) {
            return bundle;
        }
        bundle.putIntArray(f1639r, Arrays.copyOfRange(aVar.f2533a, 0, aVar.f2534b));
        return bundle;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1640a, Integer.valueOf(this.f1641b), Integer.valueOf(this.f1642c), Integer.valueOf(this.f1643d), this.f1645f, Boolean.valueOf(this.f1648i), this.f1644e, this.f1647h});
    }
}
