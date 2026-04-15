package b7;

import android.content.Context;
import android.content.Intent;
import android.media.session.MediaController;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import com.tencent.bugly.beta.tinker.TinkerReport;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class t0 implements c0 {
    public v3 A;
    public t3 B;
    public Bundle C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f2069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d4 f2070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i1 f2071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f2072d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k4 f2073e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Bundle f2074f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k0 f2075g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p4.n f2076h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final androidx.media3.exoplayer.offline.u f2077i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o.f f2078j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public k4 f2079k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public s0 f2080l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f2081m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public v3 f2082n = v3.F;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ya.i0 f2083o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ya.i0 f2084p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ya.a1 f2085q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ya.a1 f2086r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public f4 f2087s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public m4.u0 f2088t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public m4.u0 f2089u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public m4.u0 f2090v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public t f2091w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public MediaController f2092x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f2093y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f2094z;

    /* JADX WARN: Type inference failed for: r4v4, types: [b7.k0] */
    public t0(Context context, d0 d0Var, k4 k4Var, Bundle bundle, Looper looper) {
        p4.u uVar = p4.u.f16621c;
        this.f2087s = f4.f1776b;
        ya.a1 a1Var = ya.a1.f25946e;
        this.f2083o = a1Var;
        this.f2084p = a1Var;
        this.f2085q = a1Var;
        this.f2086r = a1Var;
        m4.u0 u0Var = m4.u0.f14591b;
        this.f2088t = u0Var;
        this.f2089u = u0Var;
        this.f2090v = b(u0Var, u0Var);
        this.f2076h = new p4.n(looper, p4.v.f16624a, new b5.a(4, this));
        this.f2069a = d0Var;
        p4.c.g(k4Var, "token must not be null");
        this.f2072d = context;
        this.f2070b = new d4();
        this.f2071c = new i1(this);
        this.f2078j = new o.f(0);
        this.f2073e = k4Var;
        this.f2074f = bundle;
        this.f2075g = new IBinder.DeathRecipient() { // from class: b7.k0
            @Override // android.os.IBinder.DeathRecipient
            public final void binderDied() {
                d0 d0Var2 = this.f1913a.f2069a;
                Objects.requireNonNull(d0Var2);
                d0Var2.e(new a9.m(5, d0Var2));
            }
        };
        this.C = Bundle.EMPTY;
        this.f2080l = k4Var.f1919a.b() == 0 ? null : new s0(this, bundle);
        this.f2077i = new androidx.media3.exoplayer.offline.u(this, looper);
        this.f2093y = -9223372036854775807L;
        this.f2094z = -9223372036854775807L;
    }

    public static m4.u0 b(m4.u0 u0Var, m4.u0 u0Var2) {
        m4.u0 u0VarG = s3.g(u0Var, u0Var2);
        if (u0VarG.a(32)) {
            return u0VarG;
        }
        k5.d dVar = new k5.d();
        dVar.b(u0VarG.f14593a);
        dVar.a(32);
        return new m4.u0(dVar.d());
    }

    public static int f(v3 v3Var) {
        int i10 = v3Var.f2136c.f1831a.f14632b;
        if (i10 == -1) {
            return 0;
        }
        return i10;
    }

    public static v3 j(v3 v3Var, m4.i1 i1Var, m4.x0 x0Var, h4 h4Var, int i10) {
        h4 h4Var2;
        m4.o1 o1Var;
        m4.q1 q1Var;
        boolean z10;
        m4.r0 r0Var = v3Var.f2134a;
        int i11 = v3Var.f2135b;
        h4 h4Var3 = v3Var.f2136c;
        m4.s0 s0Var = v3Var.f2140g;
        int i12 = v3Var.f2141h;
        boolean z11 = v3Var.f2142i;
        int i13 = v3Var.f2144k;
        m4.u1 u1Var = v3Var.f2145l;
        m4.l0 l0Var = v3Var.f2146m;
        float f10 = v3Var.f2147n;
        m4.d dVar = v3Var.f2148o;
        o4.c cVar = v3Var.f2149p;
        m4.k kVar = v3Var.f2150q;
        int i14 = v3Var.f2151r;
        boolean z12 = v3Var.f2152s;
        boolean z13 = v3Var.f2153t;
        int i15 = v3Var.f2154u;
        boolean z14 = v3Var.f2155v;
        boolean z15 = v3Var.f2156w;
        int i16 = v3Var.f2157x;
        int i17 = v3Var.f2158y;
        m4.l0 l0Var2 = v3Var.f2159z;
        long j10 = v3Var.A;
        long j11 = v3Var.B;
        long j12 = v3Var.C;
        m4.q1 q1Var2 = v3Var.D;
        m4.o1 o1Var2 = v3Var.E;
        m4.x0 x0Var2 = h4Var3.f1831a;
        if (!i1Var.p()) {
            h4Var2 = h4Var;
            o1Var = o1Var2;
            q1Var = q1Var2;
            if (h4Var2.f1831a.f14632b >= i1Var.o()) {
                z10 = false;
            }
            p4.c.i(z10);
            return new v3(r0Var, i11, h4Var2, x0Var2, x0Var, i10, s0Var, i12, z11, u1Var, i1Var, i13, l0Var, f10, dVar, cVar, kVar, i14, z12, z13, i15, i16, i17, z14, z15, l0Var2, j10, j11, j12, q1Var, o1Var);
        }
        h4Var2 = h4Var;
        o1Var = o1Var2;
        q1Var = q1Var2;
        z10 = true;
        p4.c.i(z10);
        return new v3(r0Var, i11, h4Var2, x0Var2, x0Var, i10, s0Var, i12, z11, u1Var, i1Var, i13, l0Var, f10, dVar, cVar, kVar, i14, z12, z13, i15, i16, i17, z14, z15, l0Var2, j10, j11, j12, q1Var, o1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static ya.a1 m(ya.a1 r2, java.util.List r3, android.os.Bundle r4, b7.f4 r5, m4.u0 r6) {
        /*
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto Lb
            ya.a1 r2 = b7.b.c(r3, r5, r6)
            return r2
        Lb:
            java.lang.String r3 = "android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS"
            boolean r3 = r4.getBoolean(r3)
            r5 = 0
            r0 = 1
            if (r3 != 0) goto L25
            r3 = 6
            r1 = 7
            int[] r3 = new int[]{r3, r1}
            m4.o r1 = r6.f14593a
            boolean r3 = r1.a(r3)
            if (r3 != 0) goto L25
            r3 = 1
            goto L26
        L25:
            r3 = 0
        L26:
            java.lang.String r1 = "android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT"
            boolean r4 = r4.getBoolean(r1)
            if (r4 != 0) goto L3f
            r4 = 8
            r1 = 9
            int[] r4 = new int[]{r4, r1}
            m4.o r6 = r6.f14593a
            boolean r4 = r6.a(r4)
            if (r4 != 0) goto L3f
            r5 = 1
        L3f:
            ya.a1 r2 = b7.b.e(r2, r3, r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.t0.m(ya.a1, java.util.List, android.os.Bundle, b7.f4, m4.u0):ya.a1");
    }

    public static ya.a1 n(List list, List list2, f4 f4Var, m4.u0 u0Var, Bundle bundle) {
        if (list.isEmpty()) {
            list = b.f(list2, u0Var, bundle);
        }
        return b.c(list, f4Var, u0Var);
    }

    @Override // b7.c0
    public final m4.r0 B() {
        return this.f2082n.f2134a;
    }

    @Override // b7.c0
    public final long C() {
        h4 h4Var = this.f2082n.f2136c;
        return !h4Var.f1832b ? M() : h4Var.f1831a.f14637g;
    }

    @Override // b7.c0
    public final m4.q1 D() {
        return this.f2082n.D;
    }

    @Override // b7.c0
    public final int F() {
        return this.f2082n.f2136c.f1831a.f14638h;
    }

    @Override // b7.c0
    public final int G() {
        return f(this.f2082n);
    }

    @Override // b7.c0
    public final int H() {
        return this.f2082n.f2157x;
    }

    @Override // b7.c0
    public final m4.i1 J() {
        return this.f2082n.f2143j;
    }

    @Override // b7.c0
    public final void K(final int i10, final long j10, final List list) {
        if (h(20)) {
            e(new r0() { // from class: b7.n0
                @Override // b7.r0
                public final void d(t tVar, int i11) {
                    i1 i1Var = this.f1987a.f2071c;
                    ya.f0 f0VarP = ya.i0.p();
                    int i12 = 0;
                    while (true) {
                        List list2 = list;
                        if (i12 >= list2.size()) {
                            tVar.c0(i1Var, i11, new m4.f(f0VarP.f()), i10, j10);
                            return;
                        } else {
                            f0VarP.a(((m4.i0) list2.get(i12)).c(true));
                            i12++;
                        }
                    }
                }
            });
            p(list, i10, j10, false);
        }
    }

    @Override // b7.c0
    public final long M() {
        long jF = s3.f(this.f2082n, this.f2093y, this.f2094z, this.f2069a.f1708e);
        this.f2093y = jF;
        return jF;
    }

    @Override // b7.c0
    public final m4.u0 N() {
        return this.f2090v;
    }

    @Override // b7.c0
    public final f4 O() {
        return this.f2087s;
    }

    @Override // b7.c0
    public final ya.i0 P() {
        return this.f2085q;
    }

    @Override // b7.c0
    public final void Q() {
        t tVar;
        k4 k4Var = this.f2073e;
        j4 j4Var = k4Var.f1919a;
        j4 j4Var2 = k4Var.f1919a;
        int iB = j4Var.b();
        d0 d0Var = this.f2069a;
        Context context = this.f2072d;
        Bundle bundle = this.f2074f;
        if (iB == 0) {
            this.f2080l = null;
            Object objG = j4Var2.g();
            p4.c.j(objG);
            IBinder iBinder = (IBinder) objG;
            int i10 = q3.f2044k;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaSession");
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof t)) {
                s sVar = new s();
                sVar.f2062e = iBinder;
                tVar = sVar;
            } else {
                tVar = (t) iInterfaceQueryLocalInterface;
            }
            int iJ = this.f2070b.j();
            String packageName = context.getPackageName();
            int iMyPid = Process.myPid();
            d0Var.getClass();
            try {
                tVar.H(this.f2071c, iJ, new i(packageName, iMyPid, bundle).b());
                return;
            } catch (RemoteException e10) {
                p4.c.C("MCImplBase", "Failed to call connection request.", e10);
            }
        } else {
            this.f2080l = new s0(this, bundle);
            int i11 = p4.c0.f16548a >= 29 ? 4097 : 1;
            Intent intent = new Intent("androidx.media3.session.MediaSessionService");
            intent.setClassName(j4Var2.e(), j4Var2.h());
            if (context.bindService(intent, this.f2080l, i11)) {
                return;
            }
            p4.c.B("MCImplBase", "bind to " + k4Var + " failed");
        }
        Objects.requireNonNull(d0Var);
        d0Var.e(new a9.m(5, d0Var));
    }

    @Override // b7.c0
    public final cb.y R(e4 e4Var) {
        t tVar;
        Bundle bundle = Bundle.EMPTY;
        i0 i0Var = new i0(this, e4Var);
        p4.c.c(e4Var.f1761a == 0);
        if (this.f2087s.f1778a.contains(e4Var)) {
            tVar = this.f2091w;
        } else {
            p4.c.B("MCImplBase", "Controller isn't allowed to call custom session command:" + e4Var.f1762b);
            tVar = null;
        }
        return d(tVar, i0Var, false);
    }

    @Override // b7.c0
    public final void S(m4.w0 w0Var) {
        this.f2076h.a(w0Var);
    }

    @Override // b7.c0
    public final boolean T() {
        return this.f2091w != null;
    }

    @Override // b7.c0
    public final Bundle U() {
        return this.f2074f;
    }

    @Override // b7.c0
    public final void V(List list) {
        if (h(20)) {
            e(new i0(1, this, list));
            p(list, -1, -9223372036854775807L, true);
        }
    }

    @Override // b7.c0
    public final void a() {
        t tVar = this.f2091w;
        if (this.f2081m) {
            return;
        }
        this.f2081m = true;
        this.f2079k = null;
        androidx.media3.exoplayer.offline.u uVar = this.f2077i;
        Handler handler = (Handler) uVar.f968b;
        if (handler.hasMessages(1)) {
            try {
                t0 t0Var = (t0) uVar.f969c;
                t0Var.f2091w.w0(t0Var.f2071c);
            } catch (RemoteException unused) {
                p4.c.B("MCImplBase", "Error in sending flushCommandQueue");
            }
        }
        handler.removeCallbacksAndMessages(null);
        this.f2091w = null;
        if (tVar != null) {
            int iJ = this.f2070b.j();
            try {
                tVar.asBinder().unlinkToDeath(this.f2075g, 0);
                tVar.Q(this.f2071c, iJ);
            } catch (RemoteException unused2) {
            }
        }
        this.f2076h.d();
        d4 d4Var = this.f2070b;
        a9.m mVar = new a9.m(6, this);
        synchronized (d4Var.f1738d) {
            try {
                Handler handlerN = p4.c0.n(null);
                d4Var.f1741g = handlerN;
                d4Var.f1740f = mVar;
                if (((o.e) d4Var.f1739e).isEmpty()) {
                    d4Var.a();
                } else {
                    handlerN.postDelayed(new a9.m(8, d4Var), 30000L);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // b7.c0
    public final void c() {
        if (h(2)) {
            e(new l0(this, 4));
            v3 v3Var = this.f2082n;
            if (v3Var.f2158y == 1) {
                s(v3Var.c(v3Var.f2143j.p() ? 4 : 2, null), null, null, null, null);
            }
        }
    }

    public final cb.y d(t tVar, r0 r0Var, boolean z10) {
        int iJ;
        c4 c4Var;
        if (tVar == null) {
            return g8.a.Q(new i4(-4));
        }
        d4 d4Var = this.f2070b;
        i4 i4Var = new i4(1);
        synchronized (d4Var.f1738d) {
            try {
                iJ = d4Var.j();
                c4Var = new c4(iJ, i4Var);
                if (d4Var.f1736b) {
                    c4Var.m();
                } else {
                    ((o.e) d4Var.f1739e).put(Integer.valueOf(iJ), c4Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            this.f2078j.add(Integer.valueOf(iJ));
        }
        try {
            r0Var.d(tVar, iJ);
            return c4Var;
        } catch (RemoteException e10) {
            p4.c.C("MCImplBase", "Cannot connect to the service or the session is gone", e10);
            this.f2078j.remove(Integer.valueOf(iJ));
            this.f2070b.l(iJ, new i4(-100));
            return c4Var;
        }
    }

    public final void e(r0 r0Var) {
        androidx.media3.exoplayer.offline.u uVar = this.f2077i;
        Handler handler = (Handler) uVar.f968b;
        if (((t0) uVar.f969c).f2091w != null && !handler.hasMessages(1)) {
            handler.sendEmptyMessage(1);
        }
        d(this.f2091w, r0Var, true);
    }

    public final q0 g(m4.i1 i1Var, int i10, long j10) {
        if (i1Var.p()) {
            return null;
        }
        m4.h1 h1Var = new m4.h1();
        m4.f1 f1Var = new m4.f1();
        if (i10 == -1 || i10 >= i1Var.o()) {
            i10 = i1Var.a(this.f2082n.f2142i);
            j10 = p4.c0.c0(i1Var.m(i10, h1Var, 0L).f14273l);
        }
        long jN = p4.c0.N(j10);
        p4.c.f(i10, i1Var.o());
        i1Var.n(i10, h1Var);
        if (jN == -9223372036854775807L) {
            jN = h1Var.f14273l;
            if (jN == -9223372036854775807L) {
                return null;
            }
        }
        int i11 = h1Var.f14275n;
        i1Var.f(i11, f1Var, false);
        while (i11 < h1Var.f14276o && f1Var.f14205e != jN) {
            int i12 = i11 + 1;
            if (i1Var.f(i12, f1Var, false).f14205e > jN) {
                break;
            }
            i11 = i12;
        }
        i1Var.f(i11, f1Var, false);
        return new q0(i11, false, jN - f1Var.f14205e);
    }

    public final boolean h(int i10) {
        if (this.f2090v.a(i10)) {
            return true;
        }
        q.t0.J(i10, "Controller isn't allowed to call command= ", "MCImplBase");
        return false;
    }

    @Override // b7.c0
    public final int i() {
        return this.f2082n.f2158y;
    }

    @Override // b7.c0
    public final void k() {
        MediaController mediaController;
        if (!h(1)) {
            p4.c.B("MCImplBase", "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
            return;
        }
        if (p4.c0.f16548a >= 31 && (mediaController = this.f2092x) != null) {
            mediaController.getTransportControls().sendCustomAction("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST", (Bundle) null);
        }
        e(new l0(this, 0));
        v3 v3Var = this.f2082n;
        int i10 = v3Var.f2157x;
        int i11 = i10 == 1 ? 0 : i10;
        if (v3Var.f2153t && i10 == i11) {
            return;
        }
        this.f2093y = s3.f(v3Var, this.f2093y, this.f2094z, this.f2069a.f1708e);
        this.f2094z = SystemClock.elapsedRealtime();
        s(this.f2082n.b(1, i11, true), null, 1, null, null);
    }

    public final void l(v3 v3Var, final v3 v3Var2, final Integer num, final Integer num2, final Integer num3, Integer num4) {
        p4.n nVar = this.f2076h;
        if (num != null) {
            final int i10 = 2;
            nVar.c(0, new p4.k() { // from class: b7.h0
                @Override // p4.k
                public final void a(Object obj) {
                    m4.w0 w0Var = (m4.w0) obj;
                    switch (i10) {
                        case 0:
                            v3 v3Var3 = v3Var2;
                            w0Var.g(v3Var3.f2137d, v3Var3.f2138e, num.intValue());
                            break;
                        case 1:
                            w0Var.n(num.intValue(), v3Var2.f2153t);
                            break;
                        default:
                            w0Var.m(v3Var2.f2143j, num.intValue());
                            break;
                    }
                }
            });
        }
        if (num3 != null) {
            final int i11 = 0;
            nVar.c(11, new p4.k() { // from class: b7.h0
                @Override // p4.k
                public final void a(Object obj) {
                    m4.w0 w0Var = (m4.w0) obj;
                    switch (i11) {
                        case 0:
                            v3 v3Var3 = v3Var2;
                            w0Var.g(v3Var3.f2137d, v3Var3.f2138e, num3.intValue());
                            break;
                        case 1:
                            w0Var.n(num3.intValue(), v3Var2.f2153t);
                            break;
                        default:
                            w0Var.m(v3Var2.f2143j, num3.intValue());
                            break;
                    }
                }
            });
        }
        m4.i0 i0VarK = v3Var2.k();
        if (num4 != null) {
            nVar.c(1, new i0(0, i0VarK, num4));
        }
        m4.r0 r0Var = v3Var.f2134a;
        m4.r0 r0Var2 = v3Var2.f2134a;
        if (r0Var != r0Var2 && (r0Var == null || !r0Var.a(r0Var2))) {
            nVar.c(10, new j0(0, r0Var2));
            if (r0Var2 != null) {
                nVar.c(10, new j0(1, r0Var2));
            }
        }
        if (!v3Var.D.equals(v3Var2.D)) {
            final int i12 = 15;
            nVar.c(2, new p4.k() { // from class: b7.g0
                @Override // p4.k
                public final void a(Object obj) {
                    m4.w0 w0Var = (m4.w0) obj;
                    switch (i12) {
                        case 0:
                            w0Var.o(v3Var2.f2140g);
                            break;
                        case 1:
                            w0Var.d(v3Var2.f2141h);
                            break;
                        case 2:
                            w0Var.t(v3Var2.f2142i);
                            break;
                        case 3:
                            w0Var.f(v3Var2.f2146m);
                            break;
                        case 4:
                            w0Var.p(v3Var2.f2147n);
                            break;
                        case 5:
                            w0Var.R(v3Var2.f2148o);
                            break;
                        case 6:
                            w0Var.K(v3Var2.f2149p.f16217a);
                            break;
                        case 7:
                            w0Var.s(v3Var2.f2149p);
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                            w0Var.u(v3Var2.f2150q);
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                            v3 v3Var3 = v3Var2;
                            w0Var.B(v3Var3.f2151r, v3Var3.f2152s);
                            break;
                        case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                            w0Var.F(v3Var2.f2145l);
                            break;
                        case 11:
                            w0Var.C(v3Var2.A);
                            break;
                        case 12:
                            w0Var.E(v3Var2.B);
                            break;
                        case 13:
                            w0Var.N(v3Var2.C);
                            break;
                        case 14:
                            w0Var.S(v3Var2.E);
                            break;
                        case 15:
                            w0Var.j(v3Var2.D);
                            break;
                        case 16:
                            w0Var.h(v3Var2.f2159z);
                            break;
                        case 17:
                            w0Var.l(v3Var2.f2156w);
                            break;
                        case 18:
                            w0Var.r(v3Var2.f2158y);
                            break;
                        case 19:
                            w0Var.b(v3Var2.f2157x);
                            break;
                        default:
                            w0Var.U(v3Var2.f2155v);
                            break;
                    }
                }
            });
        }
        if (!v3Var.f2159z.equals(v3Var2.f2159z)) {
            final int i13 = 16;
            nVar.c(14, new p4.k() { // from class: b7.g0
                @Override // p4.k
                public final void a(Object obj) {
                    m4.w0 w0Var = (m4.w0) obj;
                    switch (i13) {
                        case 0:
                            w0Var.o(v3Var2.f2140g);
                            break;
                        case 1:
                            w0Var.d(v3Var2.f2141h);
                            break;
                        case 2:
                            w0Var.t(v3Var2.f2142i);
                            break;
                        case 3:
                            w0Var.f(v3Var2.f2146m);
                            break;
                        case 4:
                            w0Var.p(v3Var2.f2147n);
                            break;
                        case 5:
                            w0Var.R(v3Var2.f2148o);
                            break;
                        case 6:
                            w0Var.K(v3Var2.f2149p.f16217a);
                            break;
                        case 7:
                            w0Var.s(v3Var2.f2149p);
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                            w0Var.u(v3Var2.f2150q);
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                            v3 v3Var3 = v3Var2;
                            w0Var.B(v3Var3.f2151r, v3Var3.f2152s);
                            break;
                        case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                            w0Var.F(v3Var2.f2145l);
                            break;
                        case 11:
                            w0Var.C(v3Var2.A);
                            break;
                        case 12:
                            w0Var.E(v3Var2.B);
                            break;
                        case 13:
                            w0Var.N(v3Var2.C);
                            break;
                        case 14:
                            w0Var.S(v3Var2.E);
                            break;
                        case 15:
                            w0Var.j(v3Var2.D);
                            break;
                        case 16:
                            w0Var.h(v3Var2.f2159z);
                            break;
                        case 17:
                            w0Var.l(v3Var2.f2156w);
                            break;
                        case 18:
                            w0Var.r(v3Var2.f2158y);
                            break;
                        case 19:
                            w0Var.b(v3Var2.f2157x);
                            break;
                        default:
                            w0Var.U(v3Var2.f2155v);
                            break;
                    }
                }
            });
        }
        if (v3Var.f2156w != v3Var2.f2156w) {
            final int i14 = 17;
            nVar.c(3, new p4.k() { // from class: b7.g0
                @Override // p4.k
                public final void a(Object obj) {
                    m4.w0 w0Var = (m4.w0) obj;
                    switch (i14) {
                        case 0:
                            w0Var.o(v3Var2.f2140g);
                            break;
                        case 1:
                            w0Var.d(v3Var2.f2141h);
                            break;
                        case 2:
                            w0Var.t(v3Var2.f2142i);
                            break;
                        case 3:
                            w0Var.f(v3Var2.f2146m);
                            break;
                        case 4:
                            w0Var.p(v3Var2.f2147n);
                            break;
                        case 5:
                            w0Var.R(v3Var2.f2148o);
                            break;
                        case 6:
                            w0Var.K(v3Var2.f2149p.f16217a);
                            break;
                        case 7:
                            w0Var.s(v3Var2.f2149p);
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                            w0Var.u(v3Var2.f2150q);
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                            v3 v3Var3 = v3Var2;
                            w0Var.B(v3Var3.f2151r, v3Var3.f2152s);
                            break;
                        case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                            w0Var.F(v3Var2.f2145l);
                            break;
                        case 11:
                            w0Var.C(v3Var2.A);
                            break;
                        case 12:
                            w0Var.E(v3Var2.B);
                            break;
                        case 13:
                            w0Var.N(v3Var2.C);
                            break;
                        case 14:
                            w0Var.S(v3Var2.E);
                            break;
                        case 15:
                            w0Var.j(v3Var2.D);
                            break;
                        case 16:
                            w0Var.h(v3Var2.f2159z);
                            break;
                        case 17:
                            w0Var.l(v3Var2.f2156w);
                            break;
                        case 18:
                            w0Var.r(v3Var2.f2158y);
                            break;
                        case 19:
                            w0Var.b(v3Var2.f2157x);
                            break;
                        default:
                            w0Var.U(v3Var2.f2155v);
                            break;
                    }
                }
            });
        }
        if (v3Var.f2158y != v3Var2.f2158y) {
            final int i15 = 18;
            nVar.c(4, new p4.k() { // from class: b7.g0
                @Override // p4.k
                public final void a(Object obj) {
                    m4.w0 w0Var = (m4.w0) obj;
                    switch (i15) {
                        case 0:
                            w0Var.o(v3Var2.f2140g);
                            break;
                        case 1:
                            w0Var.d(v3Var2.f2141h);
                            break;
                        case 2:
                            w0Var.t(v3Var2.f2142i);
                            break;
                        case 3:
                            w0Var.f(v3Var2.f2146m);
                            break;
                        case 4:
                            w0Var.p(v3Var2.f2147n);
                            break;
                        case 5:
                            w0Var.R(v3Var2.f2148o);
                            break;
                        case 6:
                            w0Var.K(v3Var2.f2149p.f16217a);
                            break;
                        case 7:
                            w0Var.s(v3Var2.f2149p);
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                            w0Var.u(v3Var2.f2150q);
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                            v3 v3Var3 = v3Var2;
                            w0Var.B(v3Var3.f2151r, v3Var3.f2152s);
                            break;
                        case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                            w0Var.F(v3Var2.f2145l);
                            break;
                        case 11:
                            w0Var.C(v3Var2.A);
                            break;
                        case 12:
                            w0Var.E(v3Var2.B);
                            break;
                        case 13:
                            w0Var.N(v3Var2.C);
                            break;
                        case 14:
                            w0Var.S(v3Var2.E);
                            break;
                        case 15:
                            w0Var.j(v3Var2.D);
                            break;
                        case 16:
                            w0Var.h(v3Var2.f2159z);
                            break;
                        case 17:
                            w0Var.l(v3Var2.f2156w);
                            break;
                        case 18:
                            w0Var.r(v3Var2.f2158y);
                            break;
                        case 19:
                            w0Var.b(v3Var2.f2157x);
                            break;
                        default:
                            w0Var.U(v3Var2.f2155v);
                            break;
                    }
                }
            });
        }
        if (num2 != null) {
            final int i16 = 1;
            nVar.c(5, new p4.k() { // from class: b7.h0
                @Override // p4.k
                public final void a(Object obj) {
                    m4.w0 w0Var = (m4.w0) obj;
                    switch (i16) {
                        case 0:
                            v3 v3Var3 = v3Var2;
                            w0Var.g(v3Var3.f2137d, v3Var3.f2138e, num2.intValue());
                            break;
                        case 1:
                            w0Var.n(num2.intValue(), v3Var2.f2153t);
                            break;
                        default:
                            w0Var.m(v3Var2.f2143j, num2.intValue());
                            break;
                    }
                }
            });
        }
        if (v3Var.f2157x != v3Var2.f2157x) {
            final int i17 = 19;
            nVar.c(6, new p4.k() { // from class: b7.g0
                @Override // p4.k
                public final void a(Object obj) {
                    m4.w0 w0Var = (m4.w0) obj;
                    switch (i17) {
                        case 0:
                            w0Var.o(v3Var2.f2140g);
                            break;
                        case 1:
                            w0Var.d(v3Var2.f2141h);
                            break;
                        case 2:
                            w0Var.t(v3Var2.f2142i);
                            break;
                        case 3:
                            w0Var.f(v3Var2.f2146m);
                            break;
                        case 4:
                            w0Var.p(v3Var2.f2147n);
                            break;
                        case 5:
                            w0Var.R(v3Var2.f2148o);
                            break;
                        case 6:
                            w0Var.K(v3Var2.f2149p.f16217a);
                            break;
                        case 7:
                            w0Var.s(v3Var2.f2149p);
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                            w0Var.u(v3Var2.f2150q);
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                            v3 v3Var3 = v3Var2;
                            w0Var.B(v3Var3.f2151r, v3Var3.f2152s);
                            break;
                        case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                            w0Var.F(v3Var2.f2145l);
                            break;
                        case 11:
                            w0Var.C(v3Var2.A);
                            break;
                        case 12:
                            w0Var.E(v3Var2.B);
                            break;
                        case 13:
                            w0Var.N(v3Var2.C);
                            break;
                        case 14:
                            w0Var.S(v3Var2.E);
                            break;
                        case 15:
                            w0Var.j(v3Var2.D);
                            break;
                        case 16:
                            w0Var.h(v3Var2.f2159z);
                            break;
                        case 17:
                            w0Var.l(v3Var2.f2156w);
                            break;
                        case 18:
                            w0Var.r(v3Var2.f2158y);
                            break;
                        case 19:
                            w0Var.b(v3Var2.f2157x);
                            break;
                        default:
                            w0Var.U(v3Var2.f2155v);
                            break;
                    }
                }
            });
        }
        if (v3Var.f2155v != v3Var2.f2155v) {
            final int i18 = 20;
            nVar.c(7, new p4.k() { // from class: b7.g0
                @Override // p4.k
                public final void a(Object obj) {
                    m4.w0 w0Var = (m4.w0) obj;
                    switch (i18) {
                        case 0:
                            w0Var.o(v3Var2.f2140g);
                            break;
                        case 1:
                            w0Var.d(v3Var2.f2141h);
                            break;
                        case 2:
                            w0Var.t(v3Var2.f2142i);
                            break;
                        case 3:
                            w0Var.f(v3Var2.f2146m);
                            break;
                        case 4:
                            w0Var.p(v3Var2.f2147n);
                            break;
                        case 5:
                            w0Var.R(v3Var2.f2148o);
                            break;
                        case 6:
                            w0Var.K(v3Var2.f2149p.f16217a);
                            break;
                        case 7:
                            w0Var.s(v3Var2.f2149p);
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                            w0Var.u(v3Var2.f2150q);
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                            v3 v3Var3 = v3Var2;
                            w0Var.B(v3Var3.f2151r, v3Var3.f2152s);
                            break;
                        case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                            w0Var.F(v3Var2.f2145l);
                            break;
                        case 11:
                            w0Var.C(v3Var2.A);
                            break;
                        case 12:
                            w0Var.E(v3Var2.B);
                            break;
                        case 13:
                            w0Var.N(v3Var2.C);
                            break;
                        case 14:
                            w0Var.S(v3Var2.E);
                            break;
                        case 15:
                            w0Var.j(v3Var2.D);
                            break;
                        case 16:
                            w0Var.h(v3Var2.f2159z);
                            break;
                        case 17:
                            w0Var.l(v3Var2.f2156w);
                            break;
                        case 18:
                            w0Var.r(v3Var2.f2158y);
                            break;
                        case 19:
                            w0Var.b(v3Var2.f2157x);
                            break;
                        default:
                            w0Var.U(v3Var2.f2155v);
                            break;
                    }
                }
            });
        }
        if (!v3Var.f2140g.equals(v3Var2.f2140g)) {
            final int i19 = 0;
            nVar.c(12, new p4.k() { // from class: b7.g0
                @Override // p4.k
                public final void a(Object obj) {
                    m4.w0 w0Var = (m4.w0) obj;
                    switch (i19) {
                        case 0:
                            w0Var.o(v3Var2.f2140g);
                            break;
                        case 1:
                            w0Var.d(v3Var2.f2141h);
                            break;
                        case 2:
                            w0Var.t(v3Var2.f2142i);
                            break;
                        case 3:
                            w0Var.f(v3Var2.f2146m);
                            break;
                        case 4:
                            w0Var.p(v3Var2.f2147n);
                            break;
                        case 5:
                            w0Var.R(v3Var2.f2148o);
                            break;
                        case 6:
                            w0Var.K(v3Var2.f2149p.f16217a);
                            break;
                        case 7:
                            w0Var.s(v3Var2.f2149p);
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                            w0Var.u(v3Var2.f2150q);
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                            v3 v3Var3 = v3Var2;
                            w0Var.B(v3Var3.f2151r, v3Var3.f2152s);
                            break;
                        case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                            w0Var.F(v3Var2.f2145l);
                            break;
                        case 11:
                            w0Var.C(v3Var2.A);
                            break;
                        case 12:
                            w0Var.E(v3Var2.B);
                            break;
                        case 13:
                            w0Var.N(v3Var2.C);
                            break;
                        case 14:
                            w0Var.S(v3Var2.E);
                            break;
                        case 15:
                            w0Var.j(v3Var2.D);
                            break;
                        case 16:
                            w0Var.h(v3Var2.f2159z);
                            break;
                        case 17:
                            w0Var.l(v3Var2.f2156w);
                            break;
                        case 18:
                            w0Var.r(v3Var2.f2158y);
                            break;
                        case 19:
                            w0Var.b(v3Var2.f2157x);
                            break;
                        default:
                            w0Var.U(v3Var2.f2155v);
                            break;
                    }
                }
            });
        }
        if (v3Var.f2141h != v3Var2.f2141h) {
            final int i20 = 1;
            nVar.c(8, new p4.k() { // from class: b7.g0
                @Override // p4.k
                public final void a(Object obj) {
                    m4.w0 w0Var = (m4.w0) obj;
                    switch (i20) {
                        case 0:
                            w0Var.o(v3Var2.f2140g);
                            break;
                        case 1:
                            w0Var.d(v3Var2.f2141h);
                            break;
                        case 2:
                            w0Var.t(v3Var2.f2142i);
                            break;
                        case 3:
                            w0Var.f(v3Var2.f2146m);
                            break;
                        case 4:
                            w0Var.p(v3Var2.f2147n);
                            break;
                        case 5:
                            w0Var.R(v3Var2.f2148o);
                            break;
                        case 6:
                            w0Var.K(v3Var2.f2149p.f16217a);
                            break;
                        case 7:
                            w0Var.s(v3Var2.f2149p);
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                            w0Var.u(v3Var2.f2150q);
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                            v3 v3Var3 = v3Var2;
                            w0Var.B(v3Var3.f2151r, v3Var3.f2152s);
                            break;
                        case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                            w0Var.F(v3Var2.f2145l);
                            break;
                        case 11:
                            w0Var.C(v3Var2.A);
                            break;
                        case 12:
                            w0Var.E(v3Var2.B);
                            break;
                        case 13:
                            w0Var.N(v3Var2.C);
                            break;
                        case 14:
                            w0Var.S(v3Var2.E);
                            break;
                        case 15:
                            w0Var.j(v3Var2.D);
                            break;
                        case 16:
                            w0Var.h(v3Var2.f2159z);
                            break;
                        case 17:
                            w0Var.l(v3Var2.f2156w);
                            break;
                        case 18:
                            w0Var.r(v3Var2.f2158y);
                            break;
                        case 19:
                            w0Var.b(v3Var2.f2157x);
                            break;
                        default:
                            w0Var.U(v3Var2.f2155v);
                            break;
                    }
                }
            });
        }
        if (v3Var.f2142i != v3Var2.f2142i) {
            final int i21 = 2;
            nVar.c(9, new p4.k() { // from class: b7.g0
                @Override // p4.k
                public final void a(Object obj) {
                    m4.w0 w0Var = (m4.w0) obj;
                    switch (i21) {
                        case 0:
                            w0Var.o(v3Var2.f2140g);
                            break;
                        case 1:
                            w0Var.d(v3Var2.f2141h);
                            break;
                        case 2:
                            w0Var.t(v3Var2.f2142i);
                            break;
                        case 3:
                            w0Var.f(v3Var2.f2146m);
                            break;
                        case 4:
                            w0Var.p(v3Var2.f2147n);
                            break;
                        case 5:
                            w0Var.R(v3Var2.f2148o);
                            break;
                        case 6:
                            w0Var.K(v3Var2.f2149p.f16217a);
                            break;
                        case 7:
                            w0Var.s(v3Var2.f2149p);
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                            w0Var.u(v3Var2.f2150q);
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                            v3 v3Var3 = v3Var2;
                            w0Var.B(v3Var3.f2151r, v3Var3.f2152s);
                            break;
                        case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                            w0Var.F(v3Var2.f2145l);
                            break;
                        case 11:
                            w0Var.C(v3Var2.A);
                            break;
                        case 12:
                            w0Var.E(v3Var2.B);
                            break;
                        case 13:
                            w0Var.N(v3Var2.C);
                            break;
                        case 14:
                            w0Var.S(v3Var2.E);
                            break;
                        case 15:
                            w0Var.j(v3Var2.D);
                            break;
                        case 16:
                            w0Var.h(v3Var2.f2159z);
                            break;
                        case 17:
                            w0Var.l(v3Var2.f2156w);
                            break;
                        case 18:
                            w0Var.r(v3Var2.f2158y);
                            break;
                        case 19:
                            w0Var.b(v3Var2.f2157x);
                            break;
                        default:
                            w0Var.U(v3Var2.f2155v);
                            break;
                    }
                }
            });
        }
        if (!v3Var.f2146m.equals(v3Var2.f2146m)) {
            final int i22 = 3;
            nVar.c(15, new p4.k() { // from class: b7.g0
                @Override // p4.k
                public final void a(Object obj) {
                    m4.w0 w0Var = (m4.w0) obj;
                    switch (i22) {
                        case 0:
                            w0Var.o(v3Var2.f2140g);
                            break;
                        case 1:
                            w0Var.d(v3Var2.f2141h);
                            break;
                        case 2:
                            w0Var.t(v3Var2.f2142i);
                            break;
                        case 3:
                            w0Var.f(v3Var2.f2146m);
                            break;
                        case 4:
                            w0Var.p(v3Var2.f2147n);
                            break;
                        case 5:
                            w0Var.R(v3Var2.f2148o);
                            break;
                        case 6:
                            w0Var.K(v3Var2.f2149p.f16217a);
                            break;
                        case 7:
                            w0Var.s(v3Var2.f2149p);
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                            w0Var.u(v3Var2.f2150q);
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                            v3 v3Var3 = v3Var2;
                            w0Var.B(v3Var3.f2151r, v3Var3.f2152s);
                            break;
                        case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                            w0Var.F(v3Var2.f2145l);
                            break;
                        case 11:
                            w0Var.C(v3Var2.A);
                            break;
                        case 12:
                            w0Var.E(v3Var2.B);
                            break;
                        case 13:
                            w0Var.N(v3Var2.C);
                            break;
                        case 14:
                            w0Var.S(v3Var2.E);
                            break;
                        case 15:
                            w0Var.j(v3Var2.D);
                            break;
                        case 16:
                            w0Var.h(v3Var2.f2159z);
                            break;
                        case 17:
                            w0Var.l(v3Var2.f2156w);
                            break;
                        case 18:
                            w0Var.r(v3Var2.f2158y);
                            break;
                        case 19:
                            w0Var.b(v3Var2.f2157x);
                            break;
                        default:
                            w0Var.U(v3Var2.f2155v);
                            break;
                    }
                }
            });
        }
        if (v3Var.f2147n != v3Var2.f2147n) {
            final int i23 = 4;
            nVar.c(22, new p4.k() { // from class: b7.g0
                @Override // p4.k
                public final void a(Object obj) {
                    m4.w0 w0Var = (m4.w0) obj;
                    switch (i23) {
                        case 0:
                            w0Var.o(v3Var2.f2140g);
                            break;
                        case 1:
                            w0Var.d(v3Var2.f2141h);
                            break;
                        case 2:
                            w0Var.t(v3Var2.f2142i);
                            break;
                        case 3:
                            w0Var.f(v3Var2.f2146m);
                            break;
                        case 4:
                            w0Var.p(v3Var2.f2147n);
                            break;
                        case 5:
                            w0Var.R(v3Var2.f2148o);
                            break;
                        case 6:
                            w0Var.K(v3Var2.f2149p.f16217a);
                            break;
                        case 7:
                            w0Var.s(v3Var2.f2149p);
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                            w0Var.u(v3Var2.f2150q);
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                            v3 v3Var3 = v3Var2;
                            w0Var.B(v3Var3.f2151r, v3Var3.f2152s);
                            break;
                        case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                            w0Var.F(v3Var2.f2145l);
                            break;
                        case 11:
                            w0Var.C(v3Var2.A);
                            break;
                        case 12:
                            w0Var.E(v3Var2.B);
                            break;
                        case 13:
                            w0Var.N(v3Var2.C);
                            break;
                        case 14:
                            w0Var.S(v3Var2.E);
                            break;
                        case 15:
                            w0Var.j(v3Var2.D);
                            break;
                        case 16:
                            w0Var.h(v3Var2.f2159z);
                            break;
                        case 17:
                            w0Var.l(v3Var2.f2156w);
                            break;
                        case 18:
                            w0Var.r(v3Var2.f2158y);
                            break;
                        case 19:
                            w0Var.b(v3Var2.f2157x);
                            break;
                        default:
                            w0Var.U(v3Var2.f2155v);
                            break;
                    }
                }
            });
        }
        if (!v3Var.f2148o.equals(v3Var2.f2148o)) {
            final int i24 = 5;
            nVar.c(20, new p4.k() { // from class: b7.g0
                @Override // p4.k
                public final void a(Object obj) {
                    m4.w0 w0Var = (m4.w0) obj;
                    switch (i24) {
                        case 0:
                            w0Var.o(v3Var2.f2140g);
                            break;
                        case 1:
                            w0Var.d(v3Var2.f2141h);
                            break;
                        case 2:
                            w0Var.t(v3Var2.f2142i);
                            break;
                        case 3:
                            w0Var.f(v3Var2.f2146m);
                            break;
                        case 4:
                            w0Var.p(v3Var2.f2147n);
                            break;
                        case 5:
                            w0Var.R(v3Var2.f2148o);
                            break;
                        case 6:
                            w0Var.K(v3Var2.f2149p.f16217a);
                            break;
                        case 7:
                            w0Var.s(v3Var2.f2149p);
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                            w0Var.u(v3Var2.f2150q);
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                            v3 v3Var3 = v3Var2;
                            w0Var.B(v3Var3.f2151r, v3Var3.f2152s);
                            break;
                        case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                            w0Var.F(v3Var2.f2145l);
                            break;
                        case 11:
                            w0Var.C(v3Var2.A);
                            break;
                        case 12:
                            w0Var.E(v3Var2.B);
                            break;
                        case 13:
                            w0Var.N(v3Var2.C);
                            break;
                        case 14:
                            w0Var.S(v3Var2.E);
                            break;
                        case 15:
                            w0Var.j(v3Var2.D);
                            break;
                        case 16:
                            w0Var.h(v3Var2.f2159z);
                            break;
                        case 17:
                            w0Var.l(v3Var2.f2156w);
                            break;
                        case 18:
                            w0Var.r(v3Var2.f2158y);
                            break;
                        case 19:
                            w0Var.b(v3Var2.f2157x);
                            break;
                        default:
                            w0Var.U(v3Var2.f2155v);
                            break;
                    }
                }
            });
        }
        if (!v3Var.f2149p.f16217a.equals(v3Var2.f2149p.f16217a)) {
            final int i25 = 6;
            nVar.c(27, new p4.k() { // from class: b7.g0
                @Override // p4.k
                public final void a(Object obj) {
                    m4.w0 w0Var = (m4.w0) obj;
                    switch (i25) {
                        case 0:
                            w0Var.o(v3Var2.f2140g);
                            break;
                        case 1:
                            w0Var.d(v3Var2.f2141h);
                            break;
                        case 2:
                            w0Var.t(v3Var2.f2142i);
                            break;
                        case 3:
                            w0Var.f(v3Var2.f2146m);
                            break;
                        case 4:
                            w0Var.p(v3Var2.f2147n);
                            break;
                        case 5:
                            w0Var.R(v3Var2.f2148o);
                            break;
                        case 6:
                            w0Var.K(v3Var2.f2149p.f16217a);
                            break;
                        case 7:
                            w0Var.s(v3Var2.f2149p);
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                            w0Var.u(v3Var2.f2150q);
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                            v3 v3Var3 = v3Var2;
                            w0Var.B(v3Var3.f2151r, v3Var3.f2152s);
                            break;
                        case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                            w0Var.F(v3Var2.f2145l);
                            break;
                        case 11:
                            w0Var.C(v3Var2.A);
                            break;
                        case 12:
                            w0Var.E(v3Var2.B);
                            break;
                        case 13:
                            w0Var.N(v3Var2.C);
                            break;
                        case 14:
                            w0Var.S(v3Var2.E);
                            break;
                        case 15:
                            w0Var.j(v3Var2.D);
                            break;
                        case 16:
                            w0Var.h(v3Var2.f2159z);
                            break;
                        case 17:
                            w0Var.l(v3Var2.f2156w);
                            break;
                        case 18:
                            w0Var.r(v3Var2.f2158y);
                            break;
                        case 19:
                            w0Var.b(v3Var2.f2157x);
                            break;
                        default:
                            w0Var.U(v3Var2.f2155v);
                            break;
                    }
                }
            });
            final int i26 = 7;
            nVar.c(27, new p4.k() { // from class: b7.g0
                @Override // p4.k
                public final void a(Object obj) {
                    m4.w0 w0Var = (m4.w0) obj;
                    switch (i26) {
                        case 0:
                            w0Var.o(v3Var2.f2140g);
                            break;
                        case 1:
                            w0Var.d(v3Var2.f2141h);
                            break;
                        case 2:
                            w0Var.t(v3Var2.f2142i);
                            break;
                        case 3:
                            w0Var.f(v3Var2.f2146m);
                            break;
                        case 4:
                            w0Var.p(v3Var2.f2147n);
                            break;
                        case 5:
                            w0Var.R(v3Var2.f2148o);
                            break;
                        case 6:
                            w0Var.K(v3Var2.f2149p.f16217a);
                            break;
                        case 7:
                            w0Var.s(v3Var2.f2149p);
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                            w0Var.u(v3Var2.f2150q);
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                            v3 v3Var3 = v3Var2;
                            w0Var.B(v3Var3.f2151r, v3Var3.f2152s);
                            break;
                        case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                            w0Var.F(v3Var2.f2145l);
                            break;
                        case 11:
                            w0Var.C(v3Var2.A);
                            break;
                        case 12:
                            w0Var.E(v3Var2.B);
                            break;
                        case 13:
                            w0Var.N(v3Var2.C);
                            break;
                        case 14:
                            w0Var.S(v3Var2.E);
                            break;
                        case 15:
                            w0Var.j(v3Var2.D);
                            break;
                        case 16:
                            w0Var.h(v3Var2.f2159z);
                            break;
                        case 17:
                            w0Var.l(v3Var2.f2156w);
                            break;
                        case 18:
                            w0Var.r(v3Var2.f2158y);
                            break;
                        case 19:
                            w0Var.b(v3Var2.f2157x);
                            break;
                        default:
                            w0Var.U(v3Var2.f2155v);
                            break;
                    }
                }
            });
        }
        if (!v3Var.f2150q.equals(v3Var2.f2150q)) {
            final int i27 = 8;
            nVar.c(29, new p4.k() { // from class: b7.g0
                @Override // p4.k
                public final void a(Object obj) {
                    m4.w0 w0Var = (m4.w0) obj;
                    switch (i27) {
                        case 0:
                            w0Var.o(v3Var2.f2140g);
                            break;
                        case 1:
                            w0Var.d(v3Var2.f2141h);
                            break;
                        case 2:
                            w0Var.t(v3Var2.f2142i);
                            break;
                        case 3:
                            w0Var.f(v3Var2.f2146m);
                            break;
                        case 4:
                            w0Var.p(v3Var2.f2147n);
                            break;
                        case 5:
                            w0Var.R(v3Var2.f2148o);
                            break;
                        case 6:
                            w0Var.K(v3Var2.f2149p.f16217a);
                            break;
                        case 7:
                            w0Var.s(v3Var2.f2149p);
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                            w0Var.u(v3Var2.f2150q);
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                            v3 v3Var3 = v3Var2;
                            w0Var.B(v3Var3.f2151r, v3Var3.f2152s);
                            break;
                        case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                            w0Var.F(v3Var2.f2145l);
                            break;
                        case 11:
                            w0Var.C(v3Var2.A);
                            break;
                        case 12:
                            w0Var.E(v3Var2.B);
                            break;
                        case 13:
                            w0Var.N(v3Var2.C);
                            break;
                        case 14:
                            w0Var.S(v3Var2.E);
                            break;
                        case 15:
                            w0Var.j(v3Var2.D);
                            break;
                        case 16:
                            w0Var.h(v3Var2.f2159z);
                            break;
                        case 17:
                            w0Var.l(v3Var2.f2156w);
                            break;
                        case 18:
                            w0Var.r(v3Var2.f2158y);
                            break;
                        case 19:
                            w0Var.b(v3Var2.f2157x);
                            break;
                        default:
                            w0Var.U(v3Var2.f2155v);
                            break;
                    }
                }
            });
        }
        if (v3Var.f2151r != v3Var2.f2151r || v3Var.f2152s != v3Var2.f2152s) {
            final int i28 = 9;
            nVar.c(30, new p4.k() { // from class: b7.g0
                @Override // p4.k
                public final void a(Object obj) {
                    m4.w0 w0Var = (m4.w0) obj;
                    switch (i28) {
                        case 0:
                            w0Var.o(v3Var2.f2140g);
                            break;
                        case 1:
                            w0Var.d(v3Var2.f2141h);
                            break;
                        case 2:
                            w0Var.t(v3Var2.f2142i);
                            break;
                        case 3:
                            w0Var.f(v3Var2.f2146m);
                            break;
                        case 4:
                            w0Var.p(v3Var2.f2147n);
                            break;
                        case 5:
                            w0Var.R(v3Var2.f2148o);
                            break;
                        case 6:
                            w0Var.K(v3Var2.f2149p.f16217a);
                            break;
                        case 7:
                            w0Var.s(v3Var2.f2149p);
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                            w0Var.u(v3Var2.f2150q);
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                            v3 v3Var3 = v3Var2;
                            w0Var.B(v3Var3.f2151r, v3Var3.f2152s);
                            break;
                        case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                            w0Var.F(v3Var2.f2145l);
                            break;
                        case 11:
                            w0Var.C(v3Var2.A);
                            break;
                        case 12:
                            w0Var.E(v3Var2.B);
                            break;
                        case 13:
                            w0Var.N(v3Var2.C);
                            break;
                        case 14:
                            w0Var.S(v3Var2.E);
                            break;
                        case 15:
                            w0Var.j(v3Var2.D);
                            break;
                        case 16:
                            w0Var.h(v3Var2.f2159z);
                            break;
                        case 17:
                            w0Var.l(v3Var2.f2156w);
                            break;
                        case 18:
                            w0Var.r(v3Var2.f2158y);
                            break;
                        case 19:
                            w0Var.b(v3Var2.f2157x);
                            break;
                        default:
                            w0Var.U(v3Var2.f2155v);
                            break;
                    }
                }
            });
        }
        if (!v3Var.f2145l.equals(v3Var2.f2145l)) {
            final int i29 = 10;
            nVar.c(25, new p4.k() { // from class: b7.g0
                @Override // p4.k
                public final void a(Object obj) {
                    m4.w0 w0Var = (m4.w0) obj;
                    switch (i29) {
                        case 0:
                            w0Var.o(v3Var2.f2140g);
                            break;
                        case 1:
                            w0Var.d(v3Var2.f2141h);
                            break;
                        case 2:
                            w0Var.t(v3Var2.f2142i);
                            break;
                        case 3:
                            w0Var.f(v3Var2.f2146m);
                            break;
                        case 4:
                            w0Var.p(v3Var2.f2147n);
                            break;
                        case 5:
                            w0Var.R(v3Var2.f2148o);
                            break;
                        case 6:
                            w0Var.K(v3Var2.f2149p.f16217a);
                            break;
                        case 7:
                            w0Var.s(v3Var2.f2149p);
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                            w0Var.u(v3Var2.f2150q);
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                            v3 v3Var3 = v3Var2;
                            w0Var.B(v3Var3.f2151r, v3Var3.f2152s);
                            break;
                        case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                            w0Var.F(v3Var2.f2145l);
                            break;
                        case 11:
                            w0Var.C(v3Var2.A);
                            break;
                        case 12:
                            w0Var.E(v3Var2.B);
                            break;
                        case 13:
                            w0Var.N(v3Var2.C);
                            break;
                        case 14:
                            w0Var.S(v3Var2.E);
                            break;
                        case 15:
                            w0Var.j(v3Var2.D);
                            break;
                        case 16:
                            w0Var.h(v3Var2.f2159z);
                            break;
                        case 17:
                            w0Var.l(v3Var2.f2156w);
                            break;
                        case 18:
                            w0Var.r(v3Var2.f2158y);
                            break;
                        case 19:
                            w0Var.b(v3Var2.f2157x);
                            break;
                        default:
                            w0Var.U(v3Var2.f2155v);
                            break;
                    }
                }
            });
        }
        if (v3Var.A != v3Var2.A) {
            final int i30 = 11;
            nVar.c(16, new p4.k() { // from class: b7.g0
                @Override // p4.k
                public final void a(Object obj) {
                    m4.w0 w0Var = (m4.w0) obj;
                    switch (i30) {
                        case 0:
                            w0Var.o(v3Var2.f2140g);
                            break;
                        case 1:
                            w0Var.d(v3Var2.f2141h);
                            break;
                        case 2:
                            w0Var.t(v3Var2.f2142i);
                            break;
                        case 3:
                            w0Var.f(v3Var2.f2146m);
                            break;
                        case 4:
                            w0Var.p(v3Var2.f2147n);
                            break;
                        case 5:
                            w0Var.R(v3Var2.f2148o);
                            break;
                        case 6:
                            w0Var.K(v3Var2.f2149p.f16217a);
                            break;
                        case 7:
                            w0Var.s(v3Var2.f2149p);
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                            w0Var.u(v3Var2.f2150q);
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                            v3 v3Var3 = v3Var2;
                            w0Var.B(v3Var3.f2151r, v3Var3.f2152s);
                            break;
                        case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                            w0Var.F(v3Var2.f2145l);
                            break;
                        case 11:
                            w0Var.C(v3Var2.A);
                            break;
                        case 12:
                            w0Var.E(v3Var2.B);
                            break;
                        case 13:
                            w0Var.N(v3Var2.C);
                            break;
                        case 14:
                            w0Var.S(v3Var2.E);
                            break;
                        case 15:
                            w0Var.j(v3Var2.D);
                            break;
                        case 16:
                            w0Var.h(v3Var2.f2159z);
                            break;
                        case 17:
                            w0Var.l(v3Var2.f2156w);
                            break;
                        case 18:
                            w0Var.r(v3Var2.f2158y);
                            break;
                        case 19:
                            w0Var.b(v3Var2.f2157x);
                            break;
                        default:
                            w0Var.U(v3Var2.f2155v);
                            break;
                    }
                }
            });
        }
        if (v3Var.B != v3Var2.B) {
            final int i31 = 12;
            nVar.c(17, new p4.k() { // from class: b7.g0
                @Override // p4.k
                public final void a(Object obj) {
                    m4.w0 w0Var = (m4.w0) obj;
                    switch (i31) {
                        case 0:
                            w0Var.o(v3Var2.f2140g);
                            break;
                        case 1:
                            w0Var.d(v3Var2.f2141h);
                            break;
                        case 2:
                            w0Var.t(v3Var2.f2142i);
                            break;
                        case 3:
                            w0Var.f(v3Var2.f2146m);
                            break;
                        case 4:
                            w0Var.p(v3Var2.f2147n);
                            break;
                        case 5:
                            w0Var.R(v3Var2.f2148o);
                            break;
                        case 6:
                            w0Var.K(v3Var2.f2149p.f16217a);
                            break;
                        case 7:
                            w0Var.s(v3Var2.f2149p);
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                            w0Var.u(v3Var2.f2150q);
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                            v3 v3Var3 = v3Var2;
                            w0Var.B(v3Var3.f2151r, v3Var3.f2152s);
                            break;
                        case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                            w0Var.F(v3Var2.f2145l);
                            break;
                        case 11:
                            w0Var.C(v3Var2.A);
                            break;
                        case 12:
                            w0Var.E(v3Var2.B);
                            break;
                        case 13:
                            w0Var.N(v3Var2.C);
                            break;
                        case 14:
                            w0Var.S(v3Var2.E);
                            break;
                        case 15:
                            w0Var.j(v3Var2.D);
                            break;
                        case 16:
                            w0Var.h(v3Var2.f2159z);
                            break;
                        case 17:
                            w0Var.l(v3Var2.f2156w);
                            break;
                        case 18:
                            w0Var.r(v3Var2.f2158y);
                            break;
                        case 19:
                            w0Var.b(v3Var2.f2157x);
                            break;
                        default:
                            w0Var.U(v3Var2.f2155v);
                            break;
                    }
                }
            });
        }
        if (v3Var.C != v3Var2.C) {
            final int i32 = 13;
            nVar.c(18, new p4.k() { // from class: b7.g0
                @Override // p4.k
                public final void a(Object obj) {
                    m4.w0 w0Var = (m4.w0) obj;
                    switch (i32) {
                        case 0:
                            w0Var.o(v3Var2.f2140g);
                            break;
                        case 1:
                            w0Var.d(v3Var2.f2141h);
                            break;
                        case 2:
                            w0Var.t(v3Var2.f2142i);
                            break;
                        case 3:
                            w0Var.f(v3Var2.f2146m);
                            break;
                        case 4:
                            w0Var.p(v3Var2.f2147n);
                            break;
                        case 5:
                            w0Var.R(v3Var2.f2148o);
                            break;
                        case 6:
                            w0Var.K(v3Var2.f2149p.f16217a);
                            break;
                        case 7:
                            w0Var.s(v3Var2.f2149p);
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                            w0Var.u(v3Var2.f2150q);
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                            v3 v3Var3 = v3Var2;
                            w0Var.B(v3Var3.f2151r, v3Var3.f2152s);
                            break;
                        case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                            w0Var.F(v3Var2.f2145l);
                            break;
                        case 11:
                            w0Var.C(v3Var2.A);
                            break;
                        case 12:
                            w0Var.E(v3Var2.B);
                            break;
                        case 13:
                            w0Var.N(v3Var2.C);
                            break;
                        case 14:
                            w0Var.S(v3Var2.E);
                            break;
                        case 15:
                            w0Var.j(v3Var2.D);
                            break;
                        case 16:
                            w0Var.h(v3Var2.f2159z);
                            break;
                        case 17:
                            w0Var.l(v3Var2.f2156w);
                            break;
                        case 18:
                            w0Var.r(v3Var2.f2158y);
                            break;
                        case 19:
                            w0Var.b(v3Var2.f2157x);
                            break;
                        default:
                            w0Var.U(v3Var2.f2155v);
                            break;
                    }
                }
            });
        }
        if (!v3Var.E.equals(v3Var2.E)) {
            final int i33 = 14;
            nVar.c(19, new p4.k() { // from class: b7.g0
                @Override // p4.k
                public final void a(Object obj) {
                    m4.w0 w0Var = (m4.w0) obj;
                    switch (i33) {
                        case 0:
                            w0Var.o(v3Var2.f2140g);
                            break;
                        case 1:
                            w0Var.d(v3Var2.f2141h);
                            break;
                        case 2:
                            w0Var.t(v3Var2.f2142i);
                            break;
                        case 3:
                            w0Var.f(v3Var2.f2146m);
                            break;
                        case 4:
                            w0Var.p(v3Var2.f2147n);
                            break;
                        case 5:
                            w0Var.R(v3Var2.f2148o);
                            break;
                        case 6:
                            w0Var.K(v3Var2.f2149p.f16217a);
                            break;
                        case 7:
                            w0Var.s(v3Var2.f2149p);
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                            w0Var.u(v3Var2.f2150q);
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                            v3 v3Var3 = v3Var2;
                            w0Var.B(v3Var3.f2151r, v3Var3.f2152s);
                            break;
                        case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                            w0Var.F(v3Var2.f2145l);
                            break;
                        case 11:
                            w0Var.C(v3Var2.A);
                            break;
                        case 12:
                            w0Var.E(v3Var2.B);
                            break;
                        case 13:
                            w0Var.N(v3Var2.C);
                            break;
                        case 14:
                            w0Var.S(v3Var2.E);
                            break;
                        case 15:
                            w0Var.j(v3Var2.D);
                            break;
                        case 16:
                            w0Var.h(v3Var2.f2159z);
                            break;
                        case 17:
                            w0Var.l(v3Var2.f2156w);
                            break;
                        case 18:
                            w0Var.r(v3Var2.f2158y);
                            break;
                        case 19:
                            w0Var.b(v3Var2.f2157x);
                            break;
                        default:
                            w0Var.U(v3Var2.f2155v);
                            break;
                    }
                }
            });
        }
        nVar.b();
    }

    @Override // b7.c0
    public final boolean o() {
        return this.f2082n.f2136c.f1832b;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(java.util.List r34, int r35, long r36, boolean r38) {
        /*
            Method dump skipped, instruction units count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.t0.p(java.util.List, int, long, boolean):void");
    }

    @Override // b7.c0
    public final long q() {
        return this.f2082n.f2136c.f1837g;
    }

    @Override // b7.c0
    public final boolean r() {
        return this.f2082n.f2153t;
    }

    public final void s(v3 v3Var, Integer num, Integer num2, Integer num3, Integer num4) {
        v3 v3Var2 = this.f2082n;
        this.f2082n = v3Var;
        l(v3Var2, v3Var, num, num2, num3, num4);
    }

    @Override // b7.c0
    public final void t(final m4.i0 i0Var, final long j10) {
        if (h(31)) {
            e(new r0() { // from class: b7.m0
                @Override // b7.r0
                public final void d(t tVar, int i10) {
                    tVar.l0(this.f1960a.f2071c, i10, i0Var.c(true), j10);
                }
            });
            p(Collections.singletonList(i0Var), -1, j10, false);
        }
    }

    @Override // b7.c0
    public final int u() {
        return this.f2082n.f2136c.f1831a.f14635e;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0236  */
    @Override // b7.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v() {
        /*
            Method dump skipped, instruction units count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.t0.v():void");
    }

    @Override // b7.c0
    public final int x() {
        return this.f2082n.f2136c.f1831a.f14639i;
    }

    @Override // b7.c0
    public final void z(m4.i0 i0Var) {
        if (h(31)) {
            e(new i0(this, i0Var));
            p(Collections.singletonList(i0Var), -1, -9223372036854775807L, true);
        }
    }
}
