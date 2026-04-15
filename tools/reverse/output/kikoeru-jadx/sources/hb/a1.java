package hb;

import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.util.BitSet;
import java.util.Currency;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class a1 {
    public static final q0 A;
    public static final o0 B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q0 f8276a = new q0(Class.class, new eb.k(new e0(), 2), 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q0 f8277b = new q0(BitSet.class, new eb.k(new p0(), 2), 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t0 f8278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r0 f8279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final r0 f8280e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final r0 f8281f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final r0 f8282g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final q0 f8283h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final q0 f8284i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final q0 f8285j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final v f8286k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final r0 f8287l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a0 f8288m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final b0 f8289n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final c0 f8290o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final q0 f8291p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final q0 f8292q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final q0 f8293r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final q0 f8294s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final q0 f8295t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final q0 f8296u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final q0 f8297v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final q0 f8298w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final k f8299x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final q0 f8300y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final n0 f8301z;

    static {
        s0 s0Var = new s0();
        f8278c = new t0();
        f8279d = new r0(Boolean.TYPE, Boolean.class, s0Var);
        f8280e = new r0(Byte.TYPE, Byte.class, new u0());
        f8281f = new r0(Short.TYPE, Short.class, new v0());
        f8282g = new r0(Integer.TYPE, Integer.class, new w0());
        f8283h = new q0(AtomicInteger.class, new eb.k(new x0(), 2), 0);
        f8284i = new q0(AtomicBoolean.class, new eb.k(new y0(), 2), 0);
        f8285j = new q0(AtomicIntegerArray.class, new eb.k(new u(), 2), 0);
        f8286k = new v();
        new w();
        new x();
        f8287l = new r0(Character.TYPE, Character.class, new y());
        z zVar = new z();
        f8288m = new a0();
        f8289n = new b0();
        f8290o = new c0();
        int i10 = 0;
        f8291p = new q0(String.class, zVar, i10);
        f8292q = new q0(StringBuilder.class, new d0(), i10);
        f8293r = new q0(StringBuffer.class, new f0(), i10);
        f8294s = new q0(URL.class, new g0(), i10);
        f8295t = new q0(URI.class, new h0(), i10);
        f8296u = new q0(InetAddress.class, new i0(), 1);
        f8297v = new q0(UUID.class, new j0(), 0);
        f8298w = new q0(Currency.class, new eb.k(new k0(), 2), 0);
        f8299x = new k(2, new l0());
        f8300y = new q0(Locale.class, new m0(), 0);
        n0 n0Var = new n0();
        f8301z = n0Var;
        A = new q0(eb.o.class, n0Var, 1);
        B = new o0();
    }
}
