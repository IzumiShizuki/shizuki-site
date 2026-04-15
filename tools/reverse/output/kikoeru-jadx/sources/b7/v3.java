package b7;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class v3 {
    public static final v3 F;
    public static final String G;
    public static final String H;
    public static final String I;
    public static final String J;
    public static final String K;
    public static final String L;
    public static final String M;
    public static final String N;
    public static final String O;
    public static final String P;
    public static final String Q;
    public static final String R;
    public static final String S;
    public static final String T;
    public static final String U;
    public static final String V;
    public static final String W;
    public static final String X;
    public static final String Y;
    public static final String Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final String f2122a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final String f2123b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final String f2124c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final String f2125d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final String f2126e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final String f2127f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final String f2128g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final String f2129h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final String f2130i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final String f2131j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final String f2132k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final String f2133l0;
    public final long A;
    public final long B;
    public final long C;
    public final m4.q1 D;
    public final m4.o1 E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m4.r0 f2134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h4 f2136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m4.x0 f2137d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m4.x0 f2138e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f2139f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m4.s0 f2140g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f2141h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f2142i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final m4.i1 f2143j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f2144k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final m4.u1 f2145l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m4.l0 f2146m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f2147n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final m4.d f2148o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o4.c f2149p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final m4.k f2150q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f2151r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f2152s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f2153t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f2154u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f2155v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f2156w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f2157x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f2158y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final m4.l0 f2159z;

    static {
        h4 h4Var = h4.f1820l;
        m4.x0 x0Var = h4.f1819k;
        m4.s0 s0Var = m4.s0.f14578d;
        m4.u1 u1Var = m4.u1.f14594d;
        m4.e1 e1Var = m4.i1.f14291a;
        m4.l0 l0Var = m4.l0.K;
        F = new v3(null, 0, h4Var, x0Var, x0Var, 0, s0Var, 0, false, u1Var, e1Var, 0, l0Var, 1.0f, m4.d.f14158g, o4.c.f16214c, m4.k.f14309e, 0, false, false, 1, 0, 1, false, false, l0Var, 5000L, 15000L, 3000L, m4.q1.f14559b, m4.o1.D);
        int i10 = p4.c0.f16548a;
        G = Integer.toString(1, 36);
        H = Integer.toString(2, 36);
        I = Integer.toString(3, 36);
        J = Integer.toString(4, 36);
        K = Integer.toString(5, 36);
        L = Integer.toString(6, 36);
        M = Integer.toString(7, 36);
        N = Integer.toString(8, 36);
        O = Integer.toString(9, 36);
        P = Integer.toString(10, 36);
        Q = Integer.toString(11, 36);
        R = Integer.toString(12, 36);
        S = Integer.toString(13, 36);
        T = Integer.toString(14, 36);
        U = Integer.toString(15, 36);
        V = Integer.toString(16, 36);
        W = Integer.toString(17, 36);
        X = Integer.toString(18, 36);
        Y = Integer.toString(19, 36);
        Z = Integer.toString(20, 36);
        f2122a0 = Integer.toString(21, 36);
        f2123b0 = Integer.toString(22, 36);
        f2124c0 = Integer.toString(23, 36);
        f2125d0 = Integer.toString(24, 36);
        f2126e0 = Integer.toString(25, 36);
        f2127f0 = Integer.toString(26, 36);
        f2128g0 = Integer.toString(27, 36);
        f2129h0 = Integer.toString(28, 36);
        f2130i0 = Integer.toString(29, 36);
        f2131j0 = Integer.toString(30, 36);
        f2132k0 = Integer.toString(31, 36);
        f2133l0 = Integer.toString(32, 36);
    }

    public v3(m4.r0 r0Var, int i10, h4 h4Var, m4.x0 x0Var, m4.x0 x0Var2, int i11, m4.s0 s0Var, int i12, boolean z10, m4.u1 u1Var, m4.i1 i1Var, int i13, m4.l0 l0Var, float f10, m4.d dVar, o4.c cVar, m4.k kVar, int i14, boolean z11, boolean z12, int i15, int i16, int i17, boolean z13, boolean z14, m4.l0 l0Var2, long j10, long j11, long j12, m4.q1 q1Var, m4.o1 o1Var) {
        this.f2134a = r0Var;
        this.f2135b = i10;
        this.f2136c = h4Var;
        this.f2137d = x0Var;
        this.f2138e = x0Var2;
        this.f2139f = i11;
        this.f2140g = s0Var;
        this.f2141h = i12;
        this.f2142i = z10;
        this.f2145l = u1Var;
        this.f2143j = i1Var;
        this.f2144k = i13;
        this.f2146m = l0Var;
        this.f2147n = f10;
        this.f2148o = dVar;
        this.f2149p = cVar;
        this.f2150q = kVar;
        this.f2151r = i14;
        this.f2152s = z11;
        this.f2153t = z12;
        this.f2154u = i15;
        this.f2157x = i16;
        this.f2158y = i17;
        this.f2155v = z13;
        this.f2156w = z14;
        this.f2159z = l0Var2;
        this.A = j10;
        this.B = j11;
        this.C = j12;
        this.D = q1Var;
        this.E = o1Var;
    }

    public static v3 j(int i10, Bundle bundle) {
        m4.r0 r0Var;
        ya.a1 a1VarP;
        ya.a1 a1VarP2;
        m4.i1 g1Var;
        m4.i1 i1Var;
        m4.u1 u1Var;
        m4.l0 l0Var;
        int i11;
        ya.a1 a1VarF;
        o4.c cVar;
        o4.c cVar2;
        m4.k kVarC;
        m4.q1 q1Var;
        IBinder binder = bundle.getBinder(f2133l0);
        if (binder instanceof u3) {
            return ((u3) binder).f2113e;
        }
        Bundle bundle2 = bundle.getBundle(X);
        int i12 = 0;
        if (bundle2 == null) {
            r0Var = null;
        } else {
            String string = bundle2.getString(m4.r0.f14566f);
            String string2 = bundle2.getString(m4.r0.f14567g);
            String string3 = bundle2.getString(m4.r0.f14568h);
            if (!TextUtils.isEmpty(string2)) {
                try {
                    Class<?> cls = Class.forName(string2, true, m4.r0.class.getClassLoader());
                    remoteException = Throwable.class.isAssignableFrom(cls) ? (Throwable) cls.getConstructor(String.class).newInstance(string3) : null;
                    if (remoteException == null) {
                        remoteException = new RemoteException(string3);
                    }
                } catch (Throwable unused) {
                    remoteException = new RemoteException(string3);
                }
            }
            Throwable th2 = remoteException;
            int i13 = bundle2.getInt(m4.r0.f14564d, 1000);
            Bundle bundle3 = bundle2.getBundle(m4.r0.f14569i);
            if (bundle3 == null) {
                bundle3 = Bundle.EMPTY;
            }
            r0Var = new m4.r0(string, th2, i13, bundle3, bundle2.getLong(m4.r0.f14565e, SystemClock.elapsedRealtime()));
        }
        int i14 = bundle.getInt(Z, 0);
        Bundle bundle4 = bundle.getBundle(Y);
        h4 h4VarB = bundle4 == null ? h4.f1820l : h4.b(bundle4);
        Bundle bundle5 = bundle.getBundle(f2122a0);
        m4.x0 x0VarC = bundle5 == null ? h4.f1819k : m4.x0.c(bundle5);
        Bundle bundle6 = bundle.getBundle(f2123b0);
        m4.x0 x0VarC2 = bundle6 == null ? h4.f1819k : m4.x0.c(bundle6);
        int i15 = bundle.getInt(f2124c0, 0);
        Bundle bundle7 = bundle.getBundle(G);
        m4.s0 s0Var = bundle7 == null ? m4.s0.f14578d : new m4.s0(bundle7.getFloat(m4.s0.f14579e, 1.0f), bundle7.getFloat(m4.s0.f14580f, 1.0f));
        int i16 = bundle.getInt(H, 0);
        boolean z10 = bundle.getBoolean(I, false);
        Bundle bundle8 = bundle.getBundle(J);
        if (bundle8 == null) {
            g1Var = m4.i1.f14291a;
        } else {
            c3 c3Var = new c3(29);
            IBinder binder2 = bundle8.getBinder(m4.i1.f14292b);
            if (binder2 == null) {
                ya.g0 g0Var = ya.i0.f25998b;
                a1VarP = ya.a1.f25946e;
            } else {
                a1VarP = p4.c.p(m4.f.a(binder2), c3Var);
            }
            m4.d1 d1Var = new m4.d1(i12);
            IBinder binder3 = bundle8.getBinder(m4.i1.f14293c);
            if (binder3 == null) {
                ya.g0 g0Var2 = ya.i0.f25998b;
                a1VarP2 = ya.a1.f25946e;
            } else {
                a1VarP2 = p4.c.p(m4.f.a(binder3), d1Var);
            }
            int[] intArray = bundle8.getIntArray(m4.i1.f14294d);
            if (intArray == null) {
                int i17 = a1VarP.f25948d;
                int[] iArr = new int[i17];
                while (i12 < i17) {
                    iArr[i12] = i12;
                    i12++;
                }
                intArray = iArr;
            }
            g1Var = new m4.g1(a1VarP, a1VarP2, intArray);
        }
        int i18 = bundle.getInt(f2132k0, 0);
        Bundle bundle9 = bundle.getBundle(K);
        if (bundle9 == null) {
            u1Var = m4.u1.f14594d;
            i1Var = g1Var;
        } else {
            i1Var = g1Var;
            u1Var = new m4.u1(bundle9.getFloat(m4.u1.f14597g, 1.0f), bundle9.getInt(m4.u1.f14595e, 0), bundle9.getInt(m4.u1.f14596f, 0));
        }
        Bundle bundle10 = bundle.getBundle(L);
        m4.l0 l0VarB = bundle10 == null ? m4.l0.K : m4.l0.b(bundle10);
        float f10 = bundle.getFloat(M, 1.0f);
        Bundle bundle11 = bundle.getBundle(N);
        m4.d dVarA = bundle11 == null ? m4.d.f14158g : m4.d.a(bundle11);
        Bundle bundle12 = bundle.getBundle(f2125d0);
        if (bundle12 == null) {
            cVar = o4.c.f16214c;
            l0Var = l0VarB;
            i11 = i18;
        } else {
            ArrayList parcelableArrayList = bundle12.getParcelableArrayList(o4.c.f16215d);
            if (parcelableArrayList == null) {
                a1VarF = ya.a1.f25946e;
                l0Var = l0VarB;
                i11 = i18;
            } else {
                ya.f0 f0VarP = ya.i0.p();
                l0Var = l0VarB;
                i11 = i18;
                for (int i19 = 0; i19 < parcelableArrayList.size(); i19++) {
                    Bundle bundle13 = (Bundle) parcelableArrayList.get(i19);
                    bundle13.getClass();
                    f0VarP.a(o4.b.b(bundle13));
                }
                a1VarF = f0VarP.f();
            }
            cVar = new o4.c(bundle12.getLong(o4.c.f16216e), a1VarF);
        }
        Bundle bundle14 = bundle.getBundle(O);
        if (bundle14 == null) {
            kVarC = m4.k.f14309e;
            cVar2 = cVar;
        } else {
            int i20 = bundle14.getInt(m4.k.f14310f, 0);
            int i21 = bundle14.getInt(m4.k.f14311g, 0);
            cVar2 = cVar;
            int i22 = bundle14.getInt(m4.k.f14312h, 0);
            String string4 = bundle14.getString(m4.k.f14313i);
            m4.j jVar = new m4.j(i20);
            jVar.f14297c = i21;
            jVar.f14298d = i22;
            p4.c.c(i20 != 0 || string4 == null);
            jVar.f14299e = string4;
            kVarC = jVar.c();
        }
        int i23 = bundle.getInt(P, 0);
        boolean z11 = bundle.getBoolean(Q, false);
        boolean z12 = bundle.getBoolean(R, false);
        int i24 = bundle.getInt(S, 1);
        int i25 = bundle.getInt(T, 0);
        int i26 = bundle.getInt(U, 1);
        boolean z13 = bundle.getBoolean(V, false);
        boolean z14 = bundle.getBoolean(W, false);
        Bundle bundle15 = bundle.getBundle(f2126e0);
        m4.l0 l0VarB2 = bundle15 == null ? m4.l0.K : m4.l0.b(bundle15);
        long j10 = bundle.getLong(f2127f0, i10 < 4 ? 0L : 5000L);
        long j11 = bundle.getLong(f2128g0, i10 < 4 ? 0L : 15000L);
        long j12 = bundle.getLong(f2129h0, i10 < 4 ? 0L : 3000L);
        Bundle bundle16 = bundle.getBundle(f2131j0);
        if (bundle16 == null) {
            q1Var = m4.q1.f14559b;
        } else {
            ArrayList parcelableArrayList2 = bundle16.getParcelableArrayList(m4.q1.f14560c);
            q1Var = new m4.q1(parcelableArrayList2 == null ? ya.a1.f25946e : p4.c.p(parcelableArrayList2, new m4.d1(3)));
        }
        Bundle bundle17 = bundle.getBundle(f2130i0);
        return new v3(r0Var, i14, h4VarB, x0VarC, x0VarC2, i15, s0Var, i16, z10, u1Var, i1Var, i11, l0Var, f10, dVarA, cVar2, kVarC, i23, z11, z12, i24, i25, i26, z13, z14, l0VarB2, j10, j11, j12, q1Var, bundle17 == null ? m4.o1.D : m4.o1.b(bundle17));
    }

    public final v3 a(m4.q1 q1Var) {
        m4.i1 i1Var = this.f2143j;
        boolean zP = i1Var.p();
        h4 h4Var = this.f2136c;
        p4.c.i(zP || h4Var.f1831a.f14632b < i1Var.o());
        return new v3(this.f2134a, this.f2135b, h4Var, this.f2137d, this.f2138e, this.f2139f, this.f2140g, this.f2141h, this.f2142i, this.f2145l, i1Var, this.f2144k, this.f2146m, this.f2147n, this.f2148o, this.f2149p, this.f2150q, this.f2151r, this.f2152s, this.f2153t, this.f2154u, this.f2157x, this.f2158y, this.f2155v, this.f2156w, this.f2159z, this.A, this.B, this.C, q1Var, this.E);
    }

    public final v3 b(int i10, int i11, boolean z10) {
        int i12 = this.f2158y;
        boolean z11 = i12 == 3 && z10 && i11 == 0;
        m4.i1 i1Var = this.f2143j;
        boolean zP = i1Var.p();
        h4 h4Var = this.f2136c;
        p4.c.i(zP || h4Var.f1831a.f14632b < i1Var.o());
        return new v3(this.f2134a, this.f2135b, h4Var, this.f2137d, this.f2138e, this.f2139f, this.f2140g, this.f2141h, this.f2142i, this.f2145l, i1Var, this.f2144k, this.f2146m, this.f2147n, this.f2148o, this.f2149p, this.f2150q, this.f2151r, this.f2152s, z10, i10, i11, i12, z11, this.f2156w, this.f2159z, this.A, this.B, this.C, this.D, this.E);
    }

    public final v3 c(int i10, m4.r0 r0Var) {
        boolean z10 = this.f2153t;
        int i11 = this.f2157x;
        boolean z11 = i10 == 3 && z10 && i11 == 0;
        m4.i1 i1Var = this.f2143j;
        boolean zP = i1Var.p();
        h4 h4Var = this.f2136c;
        p4.c.i(zP || h4Var.f1831a.f14632b < i1Var.o());
        return new v3(r0Var, this.f2135b, h4Var, this.f2137d, this.f2138e, this.f2139f, this.f2140g, this.f2141h, this.f2142i, this.f2145l, i1Var, this.f2144k, this.f2146m, this.f2147n, this.f2148o, this.f2149p, this.f2150q, this.f2151r, this.f2152s, z10, this.f2154u, i11, i10, z11, this.f2156w, this.f2159z, this.A, this.B, this.C, this.D, this.E);
    }

    public final v3 d(m4.x0 x0Var, m4.x0 x0Var2, int i10) {
        m4.i1 i1Var = this.f2143j;
        boolean zP = i1Var.p();
        h4 h4Var = this.f2136c;
        p4.c.i(zP || h4Var.f1831a.f14632b < i1Var.o());
        return new v3(this.f2134a, this.f2135b, h4Var, x0Var, x0Var2, i10, this.f2140g, this.f2141h, this.f2142i, this.f2145l, i1Var, this.f2144k, this.f2146m, this.f2147n, this.f2148o, this.f2149p, this.f2150q, this.f2151r, this.f2152s, this.f2153t, this.f2154u, this.f2157x, this.f2158y, this.f2155v, this.f2156w, this.f2159z, this.A, this.B, this.C, this.D, this.E);
    }

    public final v3 e(h4 h4Var) {
        m4.i1 i1Var = this.f2143j;
        p4.c.i(i1Var.p() || h4Var.f1831a.f14632b < i1Var.o());
        return new v3(this.f2134a, this.f2135b, h4Var, this.f2137d, this.f2138e, this.f2139f, this.f2140g, this.f2141h, this.f2142i, this.f2145l, i1Var, this.f2144k, this.f2146m, this.f2147n, this.f2148o, this.f2149p, this.f2150q, this.f2151r, this.f2152s, this.f2153t, this.f2154u, this.f2157x, this.f2158y, this.f2155v, this.f2156w, this.f2159z, this.A, this.B, this.C, this.D, this.E);
    }

    public final v3 f(m4.i1 i1Var) {
        boolean zP = i1Var.p();
        h4 h4Var = this.f2136c;
        p4.c.i(zP || h4Var.f1831a.f14632b < i1Var.o());
        return new v3(this.f2134a, this.f2135b, h4Var, this.f2137d, this.f2138e, this.f2139f, this.f2140g, this.f2141h, this.f2142i, this.f2145l, i1Var, this.f2144k, this.f2146m, this.f2147n, this.f2148o, this.f2149p, this.f2150q, this.f2151r, this.f2152s, this.f2153t, this.f2154u, this.f2157x, this.f2158y, this.f2155v, this.f2156w, this.f2159z, this.A, this.B, this.C, this.D, this.E);
    }

    public final v3 g(m4.i1 i1Var, h4 h4Var, int i10) {
        p4.c.i(i1Var.p() || h4Var.f1831a.f14632b < i1Var.o());
        return new v3(this.f2134a, this.f2135b, h4Var, this.f2137d, this.f2138e, this.f2139f, this.f2140g, this.f2141h, this.f2142i, this.f2145l, i1Var, i10, this.f2146m, this.f2147n, this.f2148o, this.f2149p, this.f2150q, this.f2151r, this.f2152s, this.f2153t, this.f2154u, this.f2157x, this.f2158y, this.f2155v, this.f2156w, this.f2159z, this.A, this.B, this.C, this.D, this.E);
    }

    public final v3 h(m4.o1 o1Var) {
        m4.i1 i1Var = this.f2143j;
        boolean zP = i1Var.p();
        h4 h4Var = this.f2136c;
        p4.c.i(zP || h4Var.f1831a.f14632b < i1Var.o());
        return new v3(this.f2134a, this.f2135b, h4Var, this.f2137d, this.f2138e, this.f2139f, this.f2140g, this.f2141h, this.f2142i, this.f2145l, i1Var, this.f2144k, this.f2146m, this.f2147n, this.f2148o, this.f2149p, this.f2150q, this.f2151r, this.f2152s, this.f2153t, this.f2154u, this.f2157x, this.f2158y, this.f2155v, this.f2156w, this.f2159z, this.A, this.B, this.C, this.D, o1Var);
    }

    public final v3 i(m4.u0 u0Var, boolean z10, boolean z11) {
        int i10;
        boolean z12;
        int i11;
        boolean zA = u0Var.a(16);
        boolean zA2 = u0Var.a(17);
        h4 h4Var = this.f2136c;
        h4 h4VarA = h4Var.a(zA, zA2);
        m4.x0 x0VarB = this.f2137d.b(zA, zA2);
        m4.x0 x0VarB2 = this.f2138e.b(zA, zA2);
        boolean z13 = true;
        m4.i1 g1Var = this.f2143j;
        if (!zA2 && zA && !g1Var.p()) {
            int i12 = h4Var.f1831a.f14632b;
            if (g1Var.o() != 1) {
                m4.h1 h1VarM = g1Var.m(i12, new m4.h1(), 0L);
                ya.f0 f0VarP = ya.i0.p();
                int i13 = h1VarM.f14275n;
                while (true) {
                    i11 = h1VarM.f14276o;
                    if (i13 > i11) {
                        break;
                    }
                    m4.f1 f1VarF = g1Var.f(i13, new m4.f1(), true);
                    f1VarF.f14203c = 0;
                    f0VarP.a(f1VarF);
                    i13++;
                }
                h1VarM.f14276o = i11 - h1VarM.f14275n;
                h1VarM.f14275n = 0;
                g1Var = new m4.g1(ya.i0.u(h1VarM), f0VarP.f(), new int[]{0});
            }
        } else if (z10 || !zA2) {
            g1Var = m4.i1.f14291a;
        }
        m4.i1 i1Var = g1Var;
        m4.l0 l0Var = !u0Var.a(18) ? m4.l0.K : this.f2146m;
        float f10 = !u0Var.a(22) ? 1.0f : this.f2147n;
        m4.d dVar = !u0Var.a(21) ? m4.d.f14158g : this.f2148o;
        o4.c cVar = !u0Var.a(28) ? o4.c.f16214c : this.f2149p;
        if (u0Var.a(23)) {
            i10 = this.f2151r;
            z12 = this.f2152s;
        } else {
            i10 = 0;
            z12 = false;
        }
        m4.l0 l0Var2 = !u0Var.a(18) ? m4.l0.K : this.f2159z;
        m4.q1 q1Var = (z11 || !u0Var.a(30)) ? m4.q1.f14559b : this.D;
        if (!i1Var.p() && h4VarA.f1831a.f14632b >= i1Var.o()) {
            z13 = false;
        }
        p4.c.i(z13);
        return new v3(this.f2134a, this.f2135b, h4VarA, x0VarB, x0VarB2, this.f2139f, this.f2140g, this.f2141h, this.f2142i, this.f2145l, i1Var, this.f2144k, l0Var, f10, dVar, cVar, this.f2150q, i10, z12, this.f2153t, this.f2154u, this.f2157x, this.f2158y, this.f2155v, this.f2156w, l0Var2, this.A, this.B, this.C, q1Var, this.E);
    }

    public final m4.i0 k() {
        m4.i1 i1Var = this.f2143j;
        if (i1Var.p()) {
            return null;
        }
        return i1Var.m(this.f2136c.f1831a.f14632b, new m4.h1(), 0L).f14264c;
    }

    public final Bundle l(int i10) {
        long j10;
        int i11;
        m4.f1 f1Var;
        int i12;
        int i13;
        Bundle bundleC;
        long j11;
        Bundle bundle = new Bundle();
        m4.r0 r0Var = this.f2134a;
        if (r0Var != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt(m4.r0.f14564d, r0Var.f14570a);
            bundle2.putLong(m4.r0.f14565e, r0Var.f14571b);
            bundle2.putString(m4.r0.f14566f, r0Var.getMessage());
            bundle2.putBundle(m4.r0.f14569i, r0Var.f14572c);
            Throwable cause = r0Var.getCause();
            if (cause != null) {
                bundle2.putString(m4.r0.f14567g, cause.getClass().getName());
                bundle2.putString(m4.r0.f14568h, cause.getMessage());
            }
            bundle.putBundle(X, bundle2);
        }
        int i14 = this.f2135b;
        if (i14 != 0) {
            bundle.putInt(Z, i14);
        }
        h4 h4Var = this.f2136c;
        if (i10 < 3 || !h4Var.equals(h4.f1820l)) {
            bundle.putBundle(Y, h4Var.c(i10));
        }
        m4.x0 x0Var = this.f2137d;
        if (i10 < 3 || !h4.f1819k.a(x0Var)) {
            bundle.putBundle(f2122a0, x0Var.d(i10));
        }
        m4.x0 x0Var2 = this.f2138e;
        if (i10 < 3 || !h4.f1819k.a(x0Var2)) {
            bundle.putBundle(f2123b0, x0Var2.d(i10));
        }
        int i15 = this.f2139f;
        if (i15 != 0) {
            bundle.putInt(f2124c0, i15);
        }
        m4.s0 s0Var = m4.s0.f14578d;
        m4.s0 s0Var2 = this.f2140g;
        if (!s0Var2.equals(s0Var)) {
            Bundle bundle3 = new Bundle();
            bundle3.putFloat(m4.s0.f14579e, s0Var2.f14581a);
            bundle3.putFloat(m4.s0.f14580f, s0Var2.f14582b);
            bundle.putBundle(G, bundle3);
        }
        int i16 = this.f2141h;
        if (i16 != 0) {
            bundle.putInt(H, i16);
        }
        boolean z10 = this.f2142i;
        if (z10) {
            bundle.putBoolean(I, z10);
        }
        m4.e1 e1Var = m4.i1.f14291a;
        m4.i1 i1Var = this.f2143j;
        boolean z11 = false;
        long j12 = 0;
        if (i1Var.equals(e1Var)) {
            j10 = 0;
        } else {
            ArrayList arrayList = new ArrayList();
            int iO = i1Var.o();
            m4.h1 h1Var = new m4.h1();
            int i17 = 0;
            while (i17 < iO) {
                m4.h1 h1VarM = i1Var.m(i17, h1Var, j12);
                h1VarM.getClass();
                Bundle bundle4 = new Bundle();
                long j13 = j12;
                if (!m4.i0.f14278g.equals(h1VarM.f14264c)) {
                    bundle4.putBundle(m4.h1.f14255t, h1VarM.f14264c.c(false));
                }
                long j14 = h1VarM.f14266e;
                if (j14 != -9223372036854775807L) {
                    j11 = -9223372036854775807L;
                    bundle4.putLong(m4.h1.f14256u, j14);
                } else {
                    j11 = -9223372036854775807L;
                }
                long j15 = h1VarM.f14267f;
                if (j15 != j11) {
                    bundle4.putLong(m4.h1.f14257v, j15);
                }
                long j16 = h1VarM.f14268g;
                if (j16 != j11) {
                    bundle4.putLong(m4.h1.f14258w, j16);
                }
                boolean z12 = h1VarM.f14269h;
                if (z12) {
                    bundle4.putBoolean(m4.h1.f14259x, z12);
                }
                boolean z13 = h1VarM.f14270i;
                if (z13) {
                    bundle4.putBoolean(m4.h1.f14260y, z13);
                }
                m4.c0 c0Var = h1VarM.f14271j;
                if (c0Var != null) {
                    bundle4.putBundle(m4.h1.f14261z, c0Var.c());
                }
                boolean z14 = h1VarM.f14272k;
                if (z14) {
                    bundle4.putBoolean(m4.h1.A, z14);
                }
                long j17 = h1VarM.f14273l;
                if (j17 != j13) {
                    bundle4.putLong(m4.h1.B, j17);
                }
                long j18 = h1VarM.f14274m;
                if (j18 != j11) {
                    bundle4.putLong(m4.h1.C, j18);
                }
                int i18 = h1VarM.f14275n;
                if (i18 != 0) {
                    bundle4.putInt(m4.h1.D, i18);
                }
                int i19 = h1VarM.f14276o;
                if (i19 != 0) {
                    bundle4.putInt(m4.h1.E, i19);
                }
                long j19 = h1VarM.f14277p;
                if (j19 != j13) {
                    bundle4.putLong(m4.h1.F, j19);
                }
                arrayList.add(bundle4);
                i17++;
                j12 = j13;
            }
            j10 = j12;
            ArrayList arrayList2 = new ArrayList();
            int iH = i1Var.h();
            m4.f1 f1Var2 = new m4.f1();
            int i20 = 0;
            while (i20 < iH) {
                m4.f1 f1VarF = i1Var.f(i20, f1Var2, z11);
                f1VarF.getClass();
                Bundle bundle5 = new Bundle();
                int i21 = f1VarF.f14203c;
                if (i21 != 0) {
                    bundle5.putInt(m4.f1.f14196h, i21);
                }
                long j20 = f1VarF.f14204d;
                if (j20 != -9223372036854775807L) {
                    bundle5.putLong(m4.f1.f14197i, j20);
                }
                long j21 = f1VarF.f14205e;
                if (j21 != j10) {
                    bundle5.putLong(m4.f1.f14198j, j21);
                }
                boolean z15 = f1VarF.f14206f;
                if (z15) {
                    bundle5.putBoolean(m4.f1.f14199k, z15);
                }
                if (f1VarF.f14207g.equals(m4.b.f14121f)) {
                    i11 = iH;
                    f1Var = f1Var2;
                    i12 = i20;
                } else {
                    String str = m4.f1.f14200l;
                    m4.b bVar = f1VarF.f14207g;
                    bVar.getClass();
                    Bundle bundle6 = new Bundle();
                    ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
                    m4.a[] aVarArr = bVar.f14131e;
                    i11 = iH;
                    int length = aVarArr.length;
                    int i22 = 0;
                    while (i22 < length) {
                        int i23 = i22;
                        m4.a aVar = aVarArr[i23];
                        aVar.getClass();
                        int i24 = length;
                        Bundle bundle7 = new Bundle();
                        m4.f1 f1Var3 = f1Var2;
                        bundle7.putLong(m4.a.f14079l, aVar.f14090a);
                        bundle7.putInt(m4.a.f14080m, aVar.f14091b);
                        bundle7.putInt(m4.a.f14086s, aVar.f14092c);
                        bundle7.putParcelableArrayList(m4.a.f14081n, new ArrayList<>(Arrays.asList(aVar.f14093d)));
                        String str2 = m4.a.f14087t;
                        ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>();
                        m4.i0[] i0VarArr = aVar.f14094e;
                        int i25 = i20;
                        int length2 = i0VarArr.length;
                        int i26 = 0;
                        while (i26 < length2) {
                            int i27 = i26;
                            m4.i0 i0Var = i0VarArr[i27];
                            if (i0Var == null) {
                                bundleC = null;
                                i13 = length2;
                            } else {
                                i13 = length2;
                                bundleC = i0Var.c(true);
                            }
                            arrayList4.add(bundleC);
                            i26 = i27 + 1;
                            length2 = i13;
                        }
                        bundle7.putParcelableArrayList(str2, arrayList4);
                        bundle7.putIntArray(m4.a.f14082o, aVar.f14095f);
                        bundle7.putLongArray(m4.a.f14083p, aVar.f14096g);
                        bundle7.putLong(m4.a.f14084q, aVar.f14098i);
                        bundle7.putBoolean(m4.a.f14085r, aVar.f14099j);
                        bundle7.putStringArrayList(m4.a.f14088u, new ArrayList<>(Arrays.asList(aVar.f14097h)));
                        bundle7.putBoolean(m4.a.f14089v, aVar.f14100k);
                        arrayList3.add(bundle7);
                        i22 = i23 + 1;
                        length = i24;
                        f1Var2 = f1Var3;
                        i20 = i25;
                    }
                    f1Var = f1Var2;
                    i12 = i20;
                    if (!arrayList3.isEmpty()) {
                        bundle6.putParcelableArrayList(m4.b.f14123h, arrayList3);
                    }
                    long j22 = bVar.f14128b;
                    if (j22 != j10) {
                        bundle6.putLong(m4.b.f14124i, j22);
                    }
                    long j23 = bVar.f14129c;
                    if (j23 != -9223372036854775807L) {
                        bundle6.putLong(m4.b.f14125j, j23);
                    }
                    int i28 = bVar.f14130d;
                    if (i28 != 0) {
                        bundle6.putInt(m4.b.f14126k, i28);
                    }
                    bundle5.putBundle(str, bundle6);
                }
                arrayList2.add(bundle5);
                i20 = i12 + 1;
                z11 = false;
                iH = i11;
                f1Var2 = f1Var;
            }
            int[] iArr = new int[iO];
            boolean z16 = true;
            if (iO > 0) {
                iArr[0] = i1Var.a(true);
            }
            int i29 = 1;
            while (i29 < iO) {
                iArr[i29] = i1Var.e(iArr[i29 - 1], 0, z16);
                i29++;
                z16 = true;
            }
            Bundle bundle8 = new Bundle();
            bundle8.putBinder(m4.i1.f14292b, new m4.f(arrayList));
            bundle8.putBinder(m4.i1.f14293c, new m4.f(arrayList2));
            bundle8.putIntArray(m4.i1.f14294d, iArr);
            bundle.putBundle(J, bundle8);
        }
        int i30 = this.f2144k;
        if (i30 != 0) {
            bundle.putInt(f2132k0, i30);
        }
        m4.u1 u1Var = m4.u1.f14594d;
        m4.u1 u1Var2 = this.f2145l;
        if (!u1Var2.equals(u1Var)) {
            Bundle bundle9 = new Bundle();
            int i31 = u1Var2.f14598a;
            if (i31 != 0) {
                bundle9.putInt(m4.u1.f14595e, i31);
            }
            int i32 = u1Var2.f14599b;
            if (i32 != 0) {
                bundle9.putInt(m4.u1.f14596f, i32);
            }
            float f10 = u1Var2.f14600c;
            if (f10 != 1.0f) {
                bundle9.putFloat(m4.u1.f14597g, f10);
            }
            bundle.putBundle(K, bundle9);
        }
        m4.l0 l0Var = m4.l0.K;
        m4.l0 l0Var2 = this.f2146m;
        if (!l0Var2.equals(l0Var)) {
            bundle.putBundle(L, l0Var2.c());
        }
        float f11 = this.f2147n;
        if (f11 != 1.0f) {
            bundle.putFloat(M, f11);
        }
        m4.d dVar = m4.d.f14158g;
        m4.d dVar2 = this.f2148o;
        if (!dVar2.equals(dVar)) {
            dVar2.getClass();
            Bundle bundle10 = new Bundle();
            bundle10.putInt(m4.d.f14159h, dVar2.f14164a);
            bundle10.putInt(m4.d.f14160i, dVar2.f14165b);
            bundle10.putInt(m4.d.f14161j, dVar2.f14166c);
            bundle10.putInt(m4.d.f14162k, dVar2.f14167d);
            bundle10.putInt(m4.d.f14163l, dVar2.f14168e);
            bundle.putBundle(N, bundle10);
        }
        o4.c cVar = o4.c.f16214c;
        o4.c cVar2 = this.f2149p;
        if (!cVar2.equals(cVar)) {
            Bundle bundle11 = new Bundle();
            String str3 = o4.c.f16215d;
            ya.i0 i0Var2 = cVar2.f16217a;
            ya.f0 f0VarP = ya.i0.p();
            for (int i33 = 0; i33 < i0Var2.size(); i33++) {
                if (((o4.b) i0Var2.get(i33)).f16200d == null) {
                    f0VarP.a((o4.b) i0Var2.get(i33));
                }
            }
            ya.a1 a1VarF = f0VarP.f();
            ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>(a1VarF.f25948d);
            ya.g0 g0VarS = a1VarF.listIterator(0);
            while (g0VarS.hasNext()) {
                o4.b bVar2 = (o4.b) g0VarS.next();
                Bundle bundleC2 = bVar2.c();
                Bitmap bitmap = bVar2.f16200d;
                if (bitmap != null) {
                    bundleC2.putParcelable(o4.b.f16192v, bitmap);
                }
                arrayList5.add(bundleC2);
            }
            bundle11.putParcelableArrayList(str3, arrayList5);
            bundle11.putLong(o4.c.f16216e, cVar2.f16218b);
            bundle.putBundle(f2125d0, bundle11);
        }
        m4.k kVar = m4.k.f14309e;
        m4.k kVar2 = this.f2150q;
        if (!kVar2.equals(kVar)) {
            Bundle bundle12 = new Bundle();
            int i34 = kVar2.f14314a;
            if (i34 != 0) {
                bundle12.putInt(m4.k.f14310f, i34);
            }
            int i35 = kVar2.f14315b;
            if (i35 != 0) {
                bundle12.putInt(m4.k.f14311g, i35);
            }
            int i36 = kVar2.f14316c;
            if (i36 != 0) {
                bundle12.putInt(m4.k.f14312h, i36);
            }
            String str4 = kVar2.f14317d;
            if (str4 != null) {
                bundle12.putString(m4.k.f14313i, str4);
            }
            bundle.putBundle(O, bundle12);
        }
        int i37 = this.f2151r;
        if (i37 != 0) {
            bundle.putInt(P, i37);
        }
        boolean z17 = this.f2152s;
        if (z17) {
            bundle.putBoolean(Q, z17);
        }
        boolean z18 = this.f2153t;
        if (z18) {
            bundle.putBoolean(R, z18);
        }
        int i38 = this.f2154u;
        if (i38 != 1) {
            bundle.putInt(S, i38);
        }
        int i39 = this.f2157x;
        if (i39 != 0) {
            bundle.putInt(T, i39);
        }
        int i40 = this.f2158y;
        if (i40 != 1) {
            bundle.putInt(U, i40);
        }
        boolean z19 = this.f2155v;
        if (z19) {
            bundle.putBoolean(V, z19);
        }
        boolean z20 = this.f2156w;
        if (z20) {
            bundle.putBoolean(W, z20);
        }
        m4.l0 l0Var3 = m4.l0.K;
        m4.l0 l0Var4 = this.f2159z;
        if (!l0Var4.equals(l0Var3)) {
            bundle.putBundle(f2126e0, l0Var4.c());
        }
        long j24 = i10 < 6 ? j10 : 5000L;
        long j25 = this.A;
        if (j25 != j24) {
            bundle.putLong(f2127f0, j25);
        }
        long j26 = i10 < 6 ? j10 : 15000L;
        long j27 = this.B;
        if (j27 != j26) {
            bundle.putLong(f2128g0, j27);
        }
        long j28 = i10 < 6 ? j10 : 3000L;
        long j29 = this.C;
        if (j29 != j28) {
            bundle.putLong(f2129h0, j29);
        }
        m4.q1 q1Var = m4.q1.f14559b;
        m4.q1 q1Var2 = this.D;
        if (!q1Var2.equals(q1Var)) {
            Bundle bundle13 = new Bundle();
            bundle13.putParcelableArrayList(m4.q1.f14560c, p4.c.A(q1Var2.f14561a, new m4.d1(2)));
            bundle.putBundle(f2131j0, bundle13);
        }
        m4.o1 o1Var = m4.o1.D;
        m4.o1 o1Var2 = this.E;
        if (!o1Var2.equals(o1Var)) {
            bundle.putBundle(f2130i0, o1Var2.c());
        }
        return bundle;
    }
}
