package y4;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import b0.w1;
import b5.t;
import g5.w;
import i7.p2;
import j5.b0;
import j5.u;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import m4.a0;
import m4.c0;
import m4.d0;
import m4.i0;
import m4.j0;
import n5.p;
import n5.q;
import n5.r;
import s4.f0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g extends j5.a {
    public n5.o A;
    public f0 B;
    public androidx.media3.exoplayer.offline.e C;
    public Handler D;
    public c0 E;
    public Uri F;
    public final Uri G;
    public z4.c H;
    public boolean I;
    public long J;
    public long K;
    public long L;
    public int M;
    public long N;
    public int O;
    public i0 P;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f25488h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final s4.g f25489i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ah.j f25490j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final w f25491k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final t f25492l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m3.l f25493m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final w1 f25494n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f25495o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f25496p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ah.j f25497q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final q f25498r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d f25499s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f25500t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final SparseArray f25501u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final c f25502v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final c f25503w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final d f25504x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final p f25505y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public s4.h f25506z;

    static {
        j0.a("media3.exoplayer.dash");
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [y4.c] */
    /* JADX WARN: Type inference failed for: r2v12, types: [y4.c] */
    public g(i0 i0Var, s4.g gVar, q qVar, ah.j jVar, w wVar, t tVar, m3.l lVar, long j10, long j11) {
        this.P = i0Var;
        this.E = i0Var.f14287c;
        d0 d0Var = i0Var.f14286b;
        d0Var.getClass();
        Uri uri = d0Var.f14178a;
        this.F = uri;
        this.G = uri;
        this.H = null;
        this.f25489i = gVar;
        this.f25498r = qVar;
        this.f25490j = jVar;
        this.f25492l = tVar;
        this.f25493m = lVar;
        this.f25495o = j10;
        this.f25496p = j11;
        this.f25491k = wVar;
        this.f25494n = new w1(25);
        this.f25488h = false;
        this.f25497q = b(null);
        this.f25500t = new Object();
        this.f25501u = new SparseArray();
        this.f25504x = new d(this, 1);
        this.N = -9223372036854775807L;
        this.L = -9223372036854775807L;
        this.f25499s = new d(this, 2);
        this.f25505y = new d(this, 3);
        final int i10 = 0;
        this.f25502v = new Runnable(this) { // from class: y4.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f25474b;

            {
                this.f25474b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        this.f25474b.A();
                        break;
                    default:
                        this.f25474b.y(false);
                        break;
                }
            }
        };
        final int i11 = 1;
        this.f25503w = new Runnable(this) { // from class: y4.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f25474b;

            {
                this.f25474b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        this.f25474b.A();
                        break;
                    default:
                        this.f25474b.y(false);
                        break;
                }
            }
        };
    }

    public static boolean u(z4.h hVar) {
        List list = hVar.f26423c;
        for (int i10 = 0; i10 < list.size(); i10++) {
            int i11 = ((z4.a) list.get(i10)).f26380b;
            if (i11 == 1 || i11 == 2) {
                return true;
            }
        }
        return false;
    }

    public final void A() {
        Uri uri;
        this.D.removeCallbacks(this.f25502v);
        if (this.A.c()) {
            return;
        }
        if (this.A.d()) {
            this.I = true;
            return;
        }
        synchronized (this.f25500t) {
            uri = this.F;
        }
        this.I = false;
        Map map = Collections.EMPTY_MAP;
        p4.c.k(uri, "The uri must be set.");
        r rVar = new r(this.f25506z, new s4.m(uri, 0L, 1, null, map, 0L, -1L, null, 1), 4, this.f25498r);
        d dVar = this.f25499s;
        this.f25493m.getClass();
        this.A.f(rVar, dVar, 3);
    }

    @Override // j5.a
    public final boolean a(i0 i0Var) {
        i0 i0VarI = i();
        d0 d0Var = i0VarI.f14286b;
        d0Var.getClass();
        d0 d0Var2 = i0Var.f14286b;
        if (d0Var2 == null || !d0Var2.f14178a.equals(d0Var.f14178a) || !d0Var2.f14182e.equals(d0Var.f14182e)) {
            return false;
        }
        a0 a0Var = d0Var2.f14180c;
        a0 a0Var2 = d0Var.f14180c;
        int i10 = p4.c0.f16548a;
        return Objects.equals(a0Var, a0Var2) && i0VarI.f14287c.equals(i0Var.f14287c);
    }

    @Override // j5.a
    public final b0 c(j5.d0 d0Var, n5.f fVar, long j10) {
        int iIntValue = ((Integer) d0Var.f10245a).intValue() - this.O;
        ah.j jVarB = b(d0Var);
        b5.q qVar = new b5.q(this.f10205d.f1595c, 0, d0Var);
        int i10 = this.O + iIntValue;
        z4.c cVar = this.H;
        f0 f0Var = this.B;
        long j11 = this.L;
        w4.k kVar = this.f10208g;
        p4.c.j(kVar);
        b bVar = new b(i10, cVar, this.f25494n, iIntValue, this.f25490j, f0Var, this.f25492l, qVar, this.f25493m, jVarB, j11, this.f25505y, fVar, this.f25491k, this.f25504x, kVar);
        this.f25501u.put(i10, bVar);
        return bVar;
    }

    @Override // j5.a
    public final synchronized i0 i() {
        return this.P;
    }

    @Override // j5.a
    public final void k() {
        this.f25505y.b();
    }

    @Override // j5.a
    public final void m(f0 f0Var) {
        this.B = f0Var;
        Looper looperMyLooper = Looper.myLooper();
        w4.k kVar = this.f10208g;
        p4.c.j(kVar);
        t tVar = this.f25492l;
        tVar.g(looperMyLooper, kVar);
        tVar.c();
        if (this.f25488h) {
            y(false);
            return;
        }
        this.f25506z = this.f25489i.q();
        this.A = new n5.o("DashMediaSource");
        this.D = p4.c0.n(null);
        A();
    }

    @Override // j5.a
    public final void o(b0 b0Var) {
        b bVar = (b) b0Var;
        o oVar = bVar.f25460m;
        oVar.f25551i = true;
        oVar.f25546d.removeCallbacksAndMessages(null);
        for (k5.i iVar : bVar.f25465r) {
            iVar.C(bVar);
        }
        bVar.f25464q = null;
        this.f25501u.remove(bVar.f25448a);
    }

    @Override // j5.a
    public final void q() {
        this.I = false;
        this.f25506z = null;
        n5.o oVar = this.A;
        if (oVar != null) {
            oVar.e(null);
            this.A = null;
        }
        this.J = 0L;
        this.K = 0L;
        this.F = this.G;
        this.C = null;
        Handler handler = this.D;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.D = null;
        }
        this.L = -9223372036854775807L;
        this.M = 0;
        this.N = -9223372036854775807L;
        this.f25501u.clear();
        w1 w1Var = this.f25494n;
        ((HashMap) w1Var.f1395c).clear();
        ((HashMap) w1Var.f1396d).clear();
        ((HashMap) w1Var.f1397e).clear();
        this.f25492l.a();
    }

    @Override // j5.a
    public final synchronized void t(i0 i0Var) {
        this.P = i0Var;
    }

    public final void v() {
        boolean z10;
        n5.o oVar = this.A;
        d dVar = new d(this, 0);
        synchronized (o5.b.f16239b) {
            z10 = o5.b.f16240c;
        }
        if (z10) {
            dVar.a();
            return;
        }
        if (oVar == null) {
            oVar = new n5.o("SntpClient");
        }
        oVar.f(new m3.l(14), new p2(dVar), 1);
    }

    public final void w(r rVar, long j10) {
        long j11 = rVar.f15375a;
        Uri uri = rVar.f15378d.f19399c;
        u uVar = new u(j10);
        this.f25493m.getClass();
        this.f25497q.A(uVar, rVar.f15377c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void x(IOException iOException) {
        p4.c.o("DashMediaSource", "Failed to resolve time offset.", iOException);
        this.L = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        y(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(boolean r44) {
        /*
            Method dump skipped, instruction units count: 1243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y4.g.y(boolean):void");
    }

    public final void z(ff.g gVar, q qVar) {
        s4.h hVar = this.f25506z;
        Uri uri = Uri.parse(gVar.f7078c);
        Map map = Collections.EMPTY_MAP;
        p4.c.k(uri, "The uri must be set.");
        this.A.f(new r(hVar, new s4.m(uri, 0L, 1, null, map, 0L, -1L, null, 1), 5, qVar), new d(this, 4), 1);
    }
}
