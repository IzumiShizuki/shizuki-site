package b7;

import android.app.PendingIntent;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k {
    public static final String A;
    public static final String B;
    public static final String C;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f1887o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f1888p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f1889q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f1890r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f1891s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f1892t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f1893u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f1894v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f1895w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f1896x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f1897y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f1898z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f1901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PendingIntent f1902d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f4 f1903e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m4.u0 f1904f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m4.u0 f1905g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Bundle f1906h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Bundle f1907i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final v3 f1908j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ya.i0 f1909k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ya.i0 f1910l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final MediaSession.Token f1911m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ya.i0 f1912n;

    static {
        int i10 = p4.c0.f16548a;
        f1887o = Integer.toString(0, 36);
        f1888p = Integer.toString(1, 36);
        f1889q = Integer.toString(2, 36);
        f1890r = Integer.toString(9, 36);
        f1891s = Integer.toString(14, 36);
        f1892t = Integer.toString(13, 36);
        f1893u = Integer.toString(3, 36);
        f1894v = Integer.toString(4, 36);
        f1895w = Integer.toString(5, 36);
        f1896x = Integer.toString(6, 36);
        f1897y = Integer.toString(11, 36);
        f1898z = Integer.toString(7, 36);
        A = Integer.toString(8, 36);
        B = Integer.toString(10, 36);
        C = Integer.toString(12, 36);
    }

    public k(int i10, int i11, t tVar, PendingIntent pendingIntent, ya.i0 i0Var, ya.i0 i0Var2, ya.i0 i0Var3, f4 f4Var, m4.u0 u0Var, m4.u0 u0Var2, Bundle bundle, Bundle bundle2, v3 v3Var, MediaSession.Token token) {
        this.f1899a = i10;
        this.f1900b = i11;
        this.f1901c = tVar;
        this.f1902d = pendingIntent;
        this.f1909k = i0Var;
        this.f1910l = i0Var2;
        this.f1912n = i0Var3;
        this.f1903e = f4Var;
        this.f1904f = u0Var;
        this.f1905g = u0Var2;
        this.f1906h = bundle;
        this.f1907i = bundle2;
        this.f1908j = v3Var;
        this.f1911m = token;
    }

    public static k a(Bundle bundle) {
        ya.a1 a1VarF;
        ya.a1 a1VarF2;
        ya.a1 a1VarF3;
        t tVar;
        IBinder binder = bundle.getBinder(B);
        if (binder instanceof j) {
            return ((j) binder).f1870e;
        }
        int i10 = bundle.getInt(f1887o, 0);
        int i11 = bundle.getInt(A, 0);
        IBinder binder2 = bundle.getBinder(f1888p);
        binder2.getClass();
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(f1889q);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f1890r);
        if (parcelableArrayList != null) {
            ya.f0 f0VarP = ya.i0.p();
            for (int i12 = 0; i12 < parcelableArrayList.size(); i12++) {
                Bundle bundle2 = (Bundle) parcelableArrayList.get(i12);
                bundle2.getClass();
                f0VarP.a(b.d(i11, bundle2));
            }
            a1VarF = f0VarP.f();
        } else {
            ya.g0 g0Var = ya.i0.f25998b;
            a1VarF = ya.a1.f25946e;
        }
        ya.a1 a1Var = a1VarF;
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(f1891s);
        if (parcelableArrayList2 != null) {
            ya.f0 f0VarP2 = ya.i0.p();
            for (int i13 = 0; i13 < parcelableArrayList2.size(); i13++) {
                Bundle bundle3 = (Bundle) parcelableArrayList2.get(i13);
                bundle3.getClass();
                f0VarP2.a(b.d(i11, bundle3));
            }
            a1VarF2 = f0VarP2.f();
        } else {
            ya.g0 g0Var2 = ya.i0.f25998b;
            a1VarF2 = ya.a1.f25946e;
        }
        ya.a1 a1Var2 = a1VarF2;
        ArrayList parcelableArrayList3 = bundle.getParcelableArrayList(f1892t);
        if (parcelableArrayList3 != null) {
            ya.f0 f0VarP3 = ya.i0.p();
            for (int i14 = 0; i14 < parcelableArrayList3.size(); i14++) {
                Bundle bundle4 = (Bundle) parcelableArrayList3.get(i14);
                bundle4.getClass();
                f0VarP3.a(b.d(i11, bundle4));
            }
            a1VarF3 = f0VarP3.f();
        } else {
            ya.g0 g0Var3 = ya.i0.f25998b;
            a1VarF3 = ya.a1.f25946e;
        }
        ya.a1 a1Var3 = a1VarF3;
        Bundle bundle5 = bundle.getBundle(f1893u);
        f4 f4VarA = bundle5 == null ? f4.f1776b : f4.a(bundle5);
        Bundle bundle6 = bundle.getBundle(f1895w);
        m4.u0 u0VarB = bundle6 == null ? m4.u0.f14591b : m4.u0.b(bundle6);
        Bundle bundle7 = bundle.getBundle(f1894v);
        m4.u0 u0VarB2 = bundle7 == null ? m4.u0.f14591b : m4.u0.b(bundle7);
        Bundle bundle8 = bundle.getBundle(f1896x);
        Bundle bundle9 = bundle.getBundle(f1897y);
        Bundle bundle10 = bundle.getBundle(f1898z);
        v3 v3VarJ = bundle10 == null ? v3.F : v3.j(i11, bundle10);
        MediaSession.Token token = (MediaSession.Token) bundle.getParcelable(C);
        Bundle bundle11 = bundle9;
        int i15 = q3.f2044k;
        IInterface iInterfaceQueryLocalInterface = binder2.queryLocalInterface("androidx.media3.session.IMediaSession");
        if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof t)) {
            s sVar = new s();
            sVar.f2062e = binder2;
            tVar = sVar;
        } else {
            tVar = (t) iInterfaceQueryLocalInterface;
        }
        if (bundle8 == null) {
            bundle8 = Bundle.EMPTY;
        }
        Bundle bundle12 = bundle8;
        if (bundle11 == null) {
            bundle11 = Bundle.EMPTY;
        }
        return new k(i10, i11, tVar, pendingIntent, a1Var, a1Var2, a1Var3, f4VarA, u0VarB2, u0VarB, bundle12, bundle11, v3VarJ, token);
    }

    public final Bundle b(int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt(f1887o, this.f1899a);
        bundle.putBinder(f1888p, this.f1901c.asBinder());
        bundle.putParcelable(f1889q, this.f1902d);
        ya.i0 i0Var = this.f1909k;
        boolean zIsEmpty = i0Var.isEmpty();
        String str = f1890r;
        if (!zIsEmpty) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(i0Var.size());
            Iterator<E> it = i0Var.iterator();
            while (it.hasNext()) {
                arrayList.add(((b) it.next()).g());
            }
            bundle.putParcelableArrayList(str, arrayList);
        }
        ya.i0 i0Var2 = this.f1910l;
        if (!i0Var2.isEmpty()) {
            if (i10 >= 7) {
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(i0Var2.size());
                Iterator<E> it2 = i0Var2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((b) it2.next()).g());
                }
                bundle.putParcelableArrayList(f1891s, arrayList2);
            } else {
                ya.a1 a1VarE = b.e(i0Var2, true, true);
                ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>(a1VarE.f25948d);
                ya.g0 g0VarListIterator = a1VarE.listIterator(0);
                while (g0VarListIterator.hasNext()) {
                    arrayList3.add(((b) g0VarListIterator.next()).g());
                }
                bundle.putParcelableArrayList(str, arrayList3);
            }
        }
        ya.i0 i0Var3 = this.f1912n;
        if (!i0Var3.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>(i0Var3.size());
            Iterator<E> it3 = i0Var3.iterator();
            while (it3.hasNext()) {
                arrayList4.add(((b) it3.next()).g());
            }
            bundle.putParcelableArrayList(f1892t, arrayList4);
        }
        f4 f4Var = this.f1903e;
        f4Var.getClass();
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
        ya.o1 it4 = f4Var.f1778a.iterator();
        while (it4.hasNext()) {
            arrayList5.add(((e4) it4.next()).b());
        }
        bundle2.putParcelableArrayList(f4.f1777c, arrayList5);
        bundle.putBundle(f1893u, bundle2);
        String str2 = f1894v;
        m4.u0 u0Var = this.f1904f;
        bundle.putBundle(str2, u0Var.c());
        String str3 = f1895w;
        m4.u0 u0Var2 = this.f1905g;
        bundle.putBundle(str3, u0Var2.c());
        bundle.putBundle(f1896x, this.f1906h);
        bundle.putBundle(f1897y, this.f1907i);
        bundle.putBundle(f1898z, this.f1908j.i(s3.g(u0Var, u0Var2), false, false).l(i10));
        bundle.putInt(A, this.f1900b);
        MediaSession.Token token = this.f1911m;
        if (token != null) {
            bundle.putParcelable(C, token);
        }
        return bundle;
    }
}
