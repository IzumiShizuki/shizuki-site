package b7;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseBooleanArray;
import androidx.media3.exoplayer.ExoPlayer;
import com.cnl.kikoeru.MainService;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class c2 {
    public boolean A;
    public final ya.i0 B;
    public final ya.i0 C;
    public final Bundle D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1674a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f1675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z1 f1676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y1 f1677d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final pe.d f1678e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final MainService f1679f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q3 f1680g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o2 f1681h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f1682i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k4 f1683j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final v1 f1684k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Handler f1685l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c7.e1 f1686m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final w1 f1687n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Handler f1688o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f1689p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f1690q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ya.i0 f1691r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public v3 f1692s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public z3 f1693t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final PendingIntent f1694u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public a2 f1695v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public b0.c1 f1696w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public q2 f1697x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f1698y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final long f1699z;

    static {
        new i4(1);
    }

    public c2(v1 v1Var, MainService mainService, ExoPlayer exoPlayer, PendingIntent pendingIntent, ya.i0 i0Var, ya.i0 i0Var2, ya.i0 i0Var3, pe.d dVar, Bundle bundle, Bundle bundle2, c7.e1 e1Var) {
        p4.c.s("MediaSessionImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.6.0-alpha01] [" + p4.c0.f16552e + "]");
        this.f1684k = v1Var;
        this.f1679f = mainService;
        this.f1682i = "";
        this.f1694u = pendingIntent;
        this.B = i0Var;
        this.C = i0Var2;
        this.f1691r = i0Var3;
        this.f1678e = dVar;
        this.D = bundle2;
        this.f1686m = e1Var;
        this.f1689p = true;
        this.f1690q = true;
        q3 q3Var = new q3(this);
        this.f1680g = q3Var;
        this.f1688o = new Handler(Looper.getMainLooper());
        Looper looper = ((v4.v) exoPlayer).f22691t;
        Handler handler = new Handler(looper);
        this.f1685l = handler;
        this.f1692s = v3.F;
        this.f1676c = new z1(this, looper);
        this.f1677d = new y1(this, looper);
        Uri uriBuild = new Uri.Builder().scheme(c2.class.getName()).appendPath("").appendPath(String.valueOf(SystemClock.elapsedRealtime())).build();
        this.f1675b = uriBuild;
        o2 o2Var = new o2(this, uriBuild, handler, bundle);
        this.f1681h = o2Var;
        this.f1683j = new k4(Process.myUid(), 1006000001, 4, mainService.getPackageName(), q3Var, bundle, (MediaSession.Token) ((c7.w0) o2Var.f2012k.f3618b).f3741c.f3607b);
        m4.u0 u0Var = r1.f2052f;
        f4 f4Var = r1.f2051e;
        z3 z3Var = new z3(exoPlayer);
        z3Var.f2229c = i0Var;
        z3Var.f2230d = i0Var2;
        z3Var.f2231e = f4Var;
        z3Var.f2232f = u0Var;
        z3Var.f2228b = new Bundle(bundle2);
        if (!i0Var2.isEmpty()) {
            z3Var.q0();
        }
        this.f1693t = z3Var;
        p4.c0.R(handler, new b5.h(5, this, z3Var));
        this.f1699z = 3000L;
        this.f1687n = new w1(this, 2);
        p4.c0.R(handler, new w1(this, 3));
    }

    public static boolean i(t1 t1Var) {
        return t1Var != null && t1Var.f2096b == 0 && Objects.equals(t1Var.f2095a.f3655a.f3652a, "com.android.systemui");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(android.view.KeyEvent r3, boolean r4) {
        /*
            r2 = this;
            b7.v1 r0 = r2.f1684k
            b7.c2 r0 = r0.f2118a
            b7.t1 r0 = r0.d()
            r0.getClass()
            int r3 = r3.getKeyCode()
            r1 = 85
            if (r3 == r1) goto L17
            r1 = 79
            if (r3 != r1) goto L1b
        L17:
            if (r4 == 0) goto L1b
            r3 = 87
        L1b:
            r4 = 126(0x7e, float:1.77E-43)
            if (r3 == r4) goto L72
            r4 = 127(0x7f, float:1.78E-43)
            if (r3 == r4) goto L6b
            r4 = 272(0x110, float:3.81E-43)
            if (r3 == r4) goto L63
            r4 = 273(0x111, float:3.83E-43)
            if (r3 == r4) goto L5b
            switch(r3) {
                case 85: goto L45;
                case 86: goto L3e;
                case 87: goto L63;
                case 88: goto L5b;
                case 89: goto L37;
                case 90: goto L30;
                default: goto L2e;
            }
        L2e:
            r3 = 0
            return r3
        L30:
            b7.c r3 = new b7.c
            r4 = 1
            r3.<init>(r2, r0, r4)
            goto L78
        L37:
            b7.c r3 = new b7.c
            r4 = 2
            r3.<init>(r2, r0, r4)
            goto L78
        L3e:
            b7.c r3 = new b7.c
            r4 = 3
            r3.<init>(r2, r0, r4)
            goto L78
        L45:
            b7.z3 r3 = r2.f1693t
            boolean r3 = r3.r()
            if (r3 == 0) goto L54
            b7.c r3 = new b7.c
            r4 = 4
            r3.<init>(r2, r0, r4)
            goto L78
        L54:
            b7.c r3 = new b7.c
            r4 = 5
            r3.<init>(r2, r0, r4)
            goto L78
        L5b:
            b7.c r3 = new b7.c
            r4 = 9
            r3.<init>(r2, r0, r4)
            goto L78
        L63:
            b7.c r3 = new b7.c
            r4 = 8
            r3.<init>(r2, r0, r4)
            goto L78
        L6b:
            b7.c r3 = new b7.c
            r4 = 7
            r3.<init>(r2, r0, r4)
            goto L78
        L72:
            b7.c r3 = new b7.c
            r4 = 6
            r3.<init>(r2, r0, r4)
        L78:
            b5.m r4 = new b5.m
            r1 = 2
            r4.<init>(r2, r3, r0, r1)
            android.os.Handler r3 = r2.f1685l
            p4.c0.R(r3, r4)
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.c2.a(android.view.KeyEvent, boolean):boolean");
    }

    public final void b(t1 t1Var, b2 b2Var) {
        int iJ;
        q3 q3Var = this.f1680g;
        try {
            d4 d4VarO = q3Var.f2047g.O(t1Var);
            if (d4VarO != null) {
                iJ = d4VarO.j();
            } else {
                if (!(q3Var.f2047g.S(t1Var) || this.f1681h.f2007f.S(t1Var))) {
                    return;
                } else {
                    iJ = 0;
                }
            }
            s1 s1Var = t1Var.f2098d;
            if (s1Var != null) {
                b2Var.b(s1Var, iJ);
            }
        } catch (DeadObjectException unused) {
            q3Var.f2047g.a0(t1Var);
        } catch (RemoteException e10) {
            p4.c.C("MediaSessionImpl", "Exception in " + t1Var.toString(), e10);
        }
    }

    public final void c(b2 b2Var) {
        ya.i0 i0VarL = this.f1680g.f2047g.L();
        for (int i10 = 0; i10 < i0VarL.size(); i10++) {
            b((t1) i0VarL.get(i10), b2Var);
        }
        try {
            b2Var.b(this.f1681h.f2010i, 0);
        } catch (RemoteException e10) {
            p4.c.o("MediaSessionImpl", "Exception in using media1 API", e10);
        }
    }

    public final t1 d() {
        ya.i0 i0VarL = this.f1680g.f2047g.L();
        for (int i10 = 0; i10 < i0VarL.size(); i10++) {
            t1 t1Var = (t1) i0VarL.get(i10);
            if (g(t1Var)) {
                return t1Var;
            }
        }
        return null;
    }

    public final void e(m4.u0 u0Var) {
        this.f1676c.a(false, false);
        c(new f1(u0Var));
        try {
            l2 l2Var = this.f1681h.f2010i;
            m4.k kVar = this.f1692s.f2150q;
            l2Var.k();
        } catch (RemoteException e10) {
            p4.c.o("MediaSessionImpl", "Exception in using media1 API", e10);
        }
    }

    public final void f(t1 t1Var, boolean z10) {
        if (n()) {
            boolean z11 = this.f1693t.B0(16) && this.f1693t.s() != null;
            boolean z12 = this.f1693t.B0(31) || this.f1693t.B0(20);
            t1 t1VarR = r(t1Var);
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            p4.c.i(!false);
            sparseBooleanArray.append(1, true);
            p4.c.i(!false);
            m4.u0 u0Var = new m4.u0(new m4.o(sparseBooleanArray));
            if (z11 || !z12) {
                if (!z11) {
                    p4.c.B("MediaSessionImpl", "Play requested without current MediaItem, but playback resumption prevented by missing available commands");
                }
                p4.c0.F(this.f1693t);
                if (z10) {
                    o(t1VarR);
                    return;
                }
                return;
            }
            this.f1678e.getClass();
            UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
            cb.u uVar = new cb.u();
            uVar.l(unsupportedOperationException);
            uVar.a(new cb.t(0, uVar, new n(this, t1VarR, z10, u0Var)), new e0(1, this));
        }
    }

    public final boolean g(t1 t1Var) {
        return Objects.equals(t1Var.f2095a.f3655a.f3652a, this.f1679f.getPackageName()) && t1Var.f2096b != 0 && new Bundle(t1Var.f2099e).getBoolean("androidx.media3.session.MediaNotificationManager", false);
    }

    public final boolean h() {
        boolean z10;
        synchronized (this.f1674a) {
            z10 = this.f1698y;
        }
        return z10;
    }

    public final cb.y j(t1 t1Var, List list) {
        r(t1Var);
        this.f1678e.getClass();
        return pe.d.G(list);
    }

    public final r1 k(t1 t1Var) {
        if (this.A && i(t1Var)) {
            f4 f4Var = r1.f2051e;
            f4 f4Var2 = this.f1693t.f2231e;
            f4Var2.getClass();
            m4.u0 u0Var = this.f1693t.f2232f;
            u0Var.getClass();
            ya.i0 i0Var = this.f1693t.f2229c;
            ya.i0 i0VarQ = i0Var == null ? null : ya.i0.q(i0Var);
            ya.i0 i0Var2 = this.f1693t.f2230d;
            return new r1(f4Var2, u0Var, i0VarQ, i0Var2 != null ? ya.i0.q(i0Var2) : null);
        }
        this.f1678e.getClass();
        m4.u0 u0Var2 = r1.f2052f;
        f4 f4Var3 = r1.f2051e;
        r1 r1Var = new r1(f4Var3, u0Var2, null, null);
        if (g(t1Var)) {
            int i10 = 1;
            this.A = true;
            v1 v1Var = this.f1684k;
            ya.i0 i0Var3 = v1Var.f2118a.C;
            boolean zIsEmpty = i0Var3.isEmpty();
            o2 o2Var = this.f1681h;
            if (zIsEmpty) {
                this.f1693t.f2229c = v1Var.f2118a.B;
            } else {
                z3 z3Var = this.f1693t;
                z3Var.f2230d = i0Var3;
                Bundle bundle = z3Var.f2228b;
                boolean z10 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
                boolean z11 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
                z3Var.q0();
                if (bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false) != z10 || bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false) != z11) {
                    ((c7.w0) o2Var.f2012k.f3618b).f3739a.setExtras(this.f1693t.f2228b);
                }
            }
            boolean z12 = this.f1693t.f2232f.a(17) != u0Var2.a(17);
            z3 z3Var2 = this.f1693t;
            Bundle bundle2 = z3Var2.f2228b;
            z3Var2.f2231e = f4Var3;
            z3Var2.f2232f = u0Var2;
            if (!z3Var2.f2230d.isEmpty()) {
                boolean z13 = bundle2.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
                boolean z14 = bundle2.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
                z3Var2.q0();
                if (bundle2.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false) != z13 || bundle2.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false) != z14) {
                    ((c7.w0) o2Var.f2012k.f3618b).f3739a.setExtras(this.f1693t.f2228b);
                }
            }
            if (z12) {
                p4.c0.R(o2Var.f2008g.f1685l, new h2(o2Var, this.f1693t, i10));
                return r1Var;
            }
            o2Var.M(this.f1693t);
        }
        return r1Var;
    }

    public final cb.v l(t1 t1Var) {
        r(t1Var);
        this.f1678e.getClass();
        return g8.a.Q(new i4(-6));
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m(b7.t1 r10, android.content.Intent r11) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.c2.m(b7.t1, android.content.Intent):boolean");
    }

    public final boolean n() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            cb.e0 e0Var = new cb.e0();
            this.f1688o.post(new b5.h(4, this, e0Var));
            try {
                return ((Boolean) e0Var.get()).booleanValue();
            } catch (InterruptedException | ExecutionException e10) {
                throw new IllegalStateException(e10);
            }
        }
        b0.c1 c1Var = this.f1696w;
        if (c1Var != null) {
            MainService mainService = (MainService) c1Var.f1208b;
            int i10 = p4.c0.f16548a;
            if (i10 >= 31 && i10 < 33 && !mainService.c().f2031j) {
                return mainService.i(this.f1684k, true);
            }
        }
        return true;
    }

    public final void o(t1 t1Var) {
        r(t1Var);
        this.f1678e.getClass();
    }

    public final cb.e0 p(t1 t1Var, List list, final int i10, final long j10) {
        r(t1Var);
        this.f1678e.getClass();
        return p4.c0.b0(pe.d.G(list), new cb.q() { // from class: b7.q1
            @Override // cb.q
            public final cb.y apply(Object obj) {
                return g8.a.Q(new u1(i10, j10, (List) obj));
            }
        });
    }

    public final void q() {
        p4.c.s("MediaSessionImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.6.0-alpha01] [" + p4.c0.f16552e + "] [" + m4.j0.b() + "]");
        synchronized (this.f1674a) {
            try {
                if (this.f1698y) {
                    return;
                }
                this.f1698y = true;
                y1 y1Var = this.f1677d;
                b5.m mVar = (b5.m) y1Var.f2206b;
                if (mVar != null) {
                    y1Var.removeCallbacks(mVar);
                    y1Var.f2206b = null;
                }
                this.f1685l.removeCallbacksAndMessages(null);
                try {
                    p4.c0.R(this.f1685l, new w1(this, 0));
                } catch (Exception e10) {
                    p4.c.C("MediaSessionImpl", "Exception thrown while closing", e10);
                }
                o2 o2Var = this.f1681h;
                ComponentName componentName = o2Var.f2014m;
                c2 c2Var = o2Var.f2008g;
                c7.e1 e1Var = o2Var.f2012k;
                if (p4.c0.f16548a < 31) {
                    if (componentName == null) {
                        ((c7.w0) e1Var.f3618b).f3739a.setMediaButtonReceiver(null);
                    } else {
                        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON", c2Var.f1675b);
                        intent.setComponent(componentName);
                        ((c7.w0) e1Var.f3618b).f3739a.setMediaButtonReceiver(PendingIntent.getBroadcast(c2Var.f1679f, 0, intent, o2.f2006r));
                    }
                }
                m2 m2Var = o2Var.f2013l;
                if (m2Var != null) {
                    c2Var.f1679f.unregisterReceiver(m2Var);
                }
                c7.w0 w0Var = (c7.w0) e1Var.f3618b;
                MediaSession mediaSession = w0Var.f3739a;
                w0Var.f3744f.kill();
                if (Build.VERSION.SDK_INT == 27) {
                    try {
                        Field declaredField = mediaSession.getClass().getDeclaredField("mCallback");
                        declaredField.setAccessible(true);
                        Handler handler = (Handler) declaredField.get(mediaSession);
                        if (handler != null) {
                            handler.removeCallbacksAndMessages(null);
                        }
                    } catch (Exception e11) {
                        Log.w("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e11);
                    }
                }
                mediaSession.setCallback(null);
                w0Var.f3740b.f3737e.set(null);
                mediaSession.release();
                q3 q3Var = this.f1680g;
                Iterator it = q3Var.f2047g.L().iterator();
                while (it.hasNext()) {
                    s1 s1Var = ((t1) it.next()).f2098d;
                    if (s1Var != null) {
                        try {
                            s1Var.a();
                        } catch (RemoteException unused) {
                        }
                    }
                }
                Iterator it2 = q3Var.f2048h.iterator();
                while (it2.hasNext()) {
                    s1 s1Var2 = ((t1) it2.next()).f2098d;
                    if (s1Var2 != null) {
                        try {
                            s1Var2.a();
                        } catch (RemoteException unused2) {
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final t1 r(t1 t1Var) {
        if (!this.A || !i(t1Var)) {
            return t1Var;
        }
        t1 t1VarD = d();
        t1VarD.getClass();
        return t1VarD;
    }

    public final void s() {
        Handler handler = this.f1685l;
        w1 w1Var = this.f1687n;
        handler.removeCallbacks(w1Var);
        if (this.f1690q) {
            long j10 = this.f1699z;
            if (j10 > 0) {
                if (this.f1693t.W() || this.f1693t.V()) {
                    handler.postDelayed(w1Var, j10);
                }
            }
        }
    }

    public final void t() {
        if (Looper.myLooper() != this.f1685l.getLooper()) {
            throw new IllegalStateException("Player callback method is called from a wrong thread. See javadoc of MediaSession for details.");
        }
    }
}
