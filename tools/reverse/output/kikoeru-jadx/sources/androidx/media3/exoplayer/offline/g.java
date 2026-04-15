package androidx.media3.exoplayer.offline;

import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Looper;
import android.os.RemoteException;
import android.view.Surface;
import b7.c2;
import b7.d0;
import b7.d1;
import b7.e4;
import b7.h1;
import b7.h4;
import b7.i4;
import b7.k4;
import b7.n3;
import b7.p3;
import b7.q3;
import b7.s3;
import b7.t0;
import b7.t1;
import b7.v3;
import b7.z3;
import com.tencent.bugly.beta.tinker.TinkerReport;
import java.io.IOException;
import m4.j1;
import m4.n0;
import m4.o1;
import m4.s0;
import m4.u0;
import m4.w0;
import p4.c0;
import ya.a1;
import ya.f0;
import ya.i0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements t4.l, p4.k, h1, p3, p4.g, n3, g5.x, m5.m, r5.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f903b;

    public /* synthetic */ g(int i10, Object obj) {
        this.f902a = i10;
        this.f903b = obj;
    }

    @Override // p4.k
    public void a(Object obj) {
        switch (this.f902a) {
            case 2:
                ((w0) obj).h(((v3) ((d1) this.f903b).f1725o.f1650b).f2159z);
                break;
            case 19:
                ((w0) obj).R((m4.d) this.f903b);
                break;
            case 20:
                ((w0) obj).S((o1) this.f903b);
                break;
            case 21:
                ((w0) obj).s((o4.c) this.f903b);
                break;
            case 22:
                ((w0) obj).h(((v4.s) this.f903b).f22626a.K);
                break;
            case 23:
                ((w0) obj).Q((n0) this.f903b);
                break;
            case 25:
                v4.f fVar = (v4.f) this.f903b;
                w4.i iVar = (w4.i) obj;
                iVar.f23396x += fVar.f22476g;
                iVar.f23397y += fVar.f22474e;
                break;
            case 26:
                j5.z zVar = (j5.z) this.f903b;
                w4.i iVar2 = (w4.i) obj;
                iVar2.getClass();
                iVar2.f23394v = zVar.f10493a;
                break;
            default:
                ((w4.i) obj).getClass();
                break;
        }
    }

    @Override // p4.g
    public void accept(Object obj) {
        switch (this.f902a) {
            case 7:
                s0 s0Var = (s0) this.f903b;
                z3 z3Var = (z3) obj;
                z3Var.r0();
                ((v4.v) z3Var.f2227a).d2(s0Var);
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                Surface surface = (Surface) this.f903b;
                z3 z3Var2 = (z3) obj;
                z3Var2.r0();
                v4.v vVar = (v4.v) z3Var2.f2227a;
                vVar.m2();
                vVar.Y1();
                vVar.f2(surface);
                int i10 = surface == null ? 0 : -1;
                vVar.S1(i10, i10);
                break;
            case 16:
                o6.h hVar = (o6.h) this.f903b;
                o6.a aVar = (o6.a) obj;
                o6.g gVar = new o6.g(m3.l.r(aVar.f16242a, aVar.f16244c), aVar.f16243b);
                hVar.f16257c.add(gVar);
                long j10 = hVar.f16264j;
                if (j10 == -9223372036854775807L || aVar.f16243b >= j10) {
                    hVar.b(gVar);
                }
                break;
            default:
                ((f0) this.f903b).a((o6.a) obj);
                break;
        }
    }

    @Override // b7.n3
    public void b(z3 z3Var, t1 t1Var) {
        ((p4.g) this.f903b).accept(z3Var);
    }

    @Override // b7.h1
    public void c(t0 t0Var) {
        switch (this.f902a) {
            case 3:
                h4 h4Var = (h4) this.f903b;
                if (t0Var.T() && t0Var.f2078j.isEmpty()) {
                    h4 h4Var2 = t0Var.f2082n.f2136c;
                    if (h4Var2.f1833c < h4Var.f1833c && s3.d(h4Var, h4Var2)) {
                        t0Var.f2082n = t0Var.f2082n.e(h4Var);
                        break;
                    }
                }
                break;
            case 4:
                d0 d0Var = t0Var.f2069a;
                Bundle bundle = (Bundle) this.f903b;
                if (t0Var.T()) {
                    a1 a1Var = t0Var.f2085q;
                    a1 a1Var2 = t0Var.f2086r;
                    t0Var.C = bundle;
                    a1 a1VarN = t0.n(t0Var.f2084p, t0Var.f2083o, t0Var.f2087s, t0Var.f2090v, bundle);
                    t0Var.f2085q = a1VarN;
                    t0Var.f2086r = t0.m(a1VarN, t0Var.f2083o, t0Var.C, t0Var.f2087s, t0Var.f2090v);
                    boolean zEquals = t0Var.f2085q.equals(a1Var);
                    t0Var.f2086r.equals(a1Var2);
                    d0Var.getClass();
                    p4.c.i(Looper.myLooper() == d0Var.f1707d.getLooper());
                    b7.b0 b0Var = d0Var.f1706c;
                    b0Var.q();
                    if (!zEquals) {
                        b0Var.w();
                    }
                    break;
                }
                break;
            default:
                b7.k kVar = (b7.k) this.f903b;
                k4 k4Var = t0Var.f2073e;
                d0 d0Var2 = t0Var.f2069a;
                if (t0Var.f2091w != null) {
                    p4.c.n("MCImplBase", "Cannot be notified about the connection result many times. Probably a bug or malicious app.");
                    d0Var2.d();
                } else {
                    b7.t tVar = kVar.f1901c;
                    i0 i0Var = kVar.f1912n;
                    Bundle bundle2 = kVar.f1907i;
                    t0Var.f2091w = tVar;
                    t0Var.f2087s = kVar.f1903e;
                    u0 u0Var = kVar.f1904f;
                    t0Var.f2088t = u0Var;
                    u0 u0Var2 = kVar.f1905g;
                    t0Var.f2089u = u0Var2;
                    u0 u0VarB = t0.b(u0Var, u0Var2);
                    t0Var.f2090v = u0VarB;
                    i0 i0Var2 = kVar.f1909k;
                    t0Var.f2083o = i0Var2;
                    i0 i0Var3 = kVar.f1910l;
                    t0Var.f2084p = i0Var3;
                    a1 a1VarN2 = t0.n(i0Var3, i0Var2, t0Var.f2087s, u0VarB, bundle2);
                    t0Var.f2085q = a1VarN2;
                    t0Var.f2086r = t0.m(a1VarN2, t0Var.f2083o, bundle2, t0Var.f2087s, t0Var.f2090v);
                    ah.j jVar = new ah.j(4);
                    for (int i10 = 0; i10 < i0Var.size(); i10++) {
                        b7.b bVar = (b7.b) i0Var.get(i10);
                        e4 e4Var = bVar.f1640a;
                        if (e4Var != null && e4Var.f1761a == 0) {
                            jVar.G(e4Var.f1762b, bVar);
                        }
                    }
                    jVar.c();
                    t0Var.f2082n = kVar.f1908j;
                    MediaSession.Token tokenL = kVar.f1911m;
                    if (tokenL == null) {
                        tokenL = k4Var.f1919a.l();
                    }
                    if (tokenL != null) {
                        t0Var.f2092x = new MediaController(t0Var.f2072d, tokenL);
                    }
                    try {
                        kVar.f1901c.asBinder().linkToDeath(t0Var.f2075g, 0);
                        t0Var.f2079k = new k4(k4Var.f1919a.a(), kVar.f1899a, kVar.f1900b, k4Var.f1919a.e(), kVar.f1901c, kVar.f1906h, tokenL);
                        t0Var.C = bundle2;
                        d0Var2.a();
                    } catch (RemoteException unused) {
                        d0Var2.d();
                    }
                }
                break;
        }
    }

    @Override // g5.x
    public int d(Object obj) {
        m4.q qVar = (m4.q) this.f903b;
        g5.n nVar = (g5.n) obj;
        String str = nVar.f7386b;
        return ((str.equals(qVar.f14544n) || str.equals(g5.y.b(qVar))) && nVar.c(qVar, false)) ? 1 : 0;
    }

    @Override // m5.m
    public a1 e(int i10, j1 j1Var, int[] iArr) {
        m5.j jVar = (m5.j) this.f903b;
        f0 f0VarP = i0.p();
        for (int i11 = 0; i11 < j1Var.f14304a; i11++) {
            f0VarP.a(new m5.g(i10, j1Var, i11, jVar, iArr[i11]));
        }
        return f0VarP.f();
    }

    @Override // r5.g
    public long f(long j10) {
        r5.t tVar = (r5.t) this.f903b;
        return c0.j((j10 * ((long) tVar.f18868e)) / 1000000, 0L, tVar.f18873j - 1);
    }

    @Override // t4.l
    public void g(long j10, long j11, long j12) {
        l lVar = ((w) this.f903b).f975e;
        if (lVar == null) {
            return;
        }
        lVar.b(j10, j11, (j10 == -1 || j10 == 0) ? -1.0f : (j11 * 100.0f) / j10);
    }

    @Override // b7.p3
    public Object h(c2 c2Var, t1 t1Var, int i10) {
        int i11 = this.f902a;
        Object obj = this.f903b;
        switch (i11) {
            case 6:
                return c2Var.j(t1Var, (i0) obj);
            default:
                n3 n3Var = (n3) obj;
                cb.v vVar = cb.v.f3880b;
                if (!c2Var.h()) {
                    n3Var.b(c2Var.f1693t, t1Var);
                    q3.H0(t1Var, i10, new i4(0));
                }
                return cb.v.f3880b;
        }
    }

    public void i() {
        ic.n nVar = (ic.n) this.f903b;
        synchronized (h1.n.f8051c) {
            h1.n.f8056h = vb.m.n0((Iterable) h1.n.f8056h, nVar);
        }
    }

    public /* synthetic */ g(w4.a aVar, j5.u uVar, j5.z zVar, IOException iOException, boolean z10) {
        this.f902a = 26;
        this.f903b = zVar;
    }

    public /* synthetic */ g(w4.a aVar, Object obj, long j10) {
        this.f902a = 27;
        this.f903b = obj;
    }

    public /* synthetic */ g(w4.a aVar, v4.f fVar) {
        this.f902a = 25;
        this.f903b = fVar;
    }
}
