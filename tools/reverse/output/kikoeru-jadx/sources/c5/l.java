package c5;

import android.net.Uri;
import android.os.Looper;
import b0.c1;
import g5.w;
import j5.b0;
import j5.g1;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import m4.a0;
import m4.c0;
import m4.d0;
import m4.i0;
import m4.j0;
import s4.f0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l extends j5.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f3502h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c1 f3503i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w f3504j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b5.t f3505k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final m3.l f3506l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f3507m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f3508n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final e5.c f3509o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f3510p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public c0 f3511q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public f0 f3512r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public i0 f3513s;

    static {
        j0.a("media3.exoplayer.hls");
    }

    public l(i0 i0Var, c1 c1Var, c cVar, w wVar, b5.t tVar, m3.l lVar, e5.c cVar2, long j10, boolean z10, int i10) {
        this.f3513s = i0Var;
        this.f3511q = i0Var.f14287c;
        this.f3503i = c1Var;
        this.f3502h = cVar;
        this.f3504j = wVar;
        this.f3505k = tVar;
        this.f3506l = lVar;
        this.f3509o = cVar2;
        this.f3510p = j10;
        this.f3507m = z10;
        this.f3508n = i10;
    }

    public static e5.f u(long j10, List list) {
        e5.f fVar = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            e5.f fVar2 = (e5.f) list.get(i10);
            long j11 = fVar2.f6199e;
            if (j11 > j10 || !fVar2.f6188l) {
                if (j11 > j10) {
                    break;
                }
            } else {
                fVar = fVar2;
            }
        }
        return fVar;
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
        ah.j jVarB = b(d0Var);
        b5.q qVar = new b5.q(this.f10205d.f1595c, 0, d0Var);
        f0 f0Var = this.f3512r;
        w4.k kVar = this.f10208g;
        p4.c.j(kVar);
        return new k(this.f3502h, this.f3509o, this.f3503i, f0Var, this.f3505k, qVar, this.f3506l, jVarB, fVar, this.f3504j, this.f3507m, this.f3508n, kVar);
    }

    @Override // j5.a
    public final synchronized i0 i() {
        return this.f3513s;
    }

    @Override // j5.a
    public final void k() throws IOException {
        e5.c cVar = this.f3509o;
        n5.o oVar = cVar.f6162g;
        if (oVar != null) {
            oVar.b();
        }
        Uri uri = cVar.f6166k;
        if (uri != null) {
            e5.b bVar = (e5.b) cVar.f6159d.get(uri);
            bVar.f6144b.b();
            IOException iOException = bVar.f6152j;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override // j5.a
    public final void m(f0 f0Var) {
        this.f3512r = f0Var;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        w4.k kVar = this.f10208g;
        p4.c.j(kVar);
        b5.t tVar = this.f3505k;
        tVar.g(looperMyLooper, kVar);
        tVar.c();
        ah.j jVarB = b(null);
        d0 d0Var = i().f14286b;
        d0Var.getClass();
        Uri uri = d0Var.f14178a;
        e5.c cVar = this.f3509o;
        cVar.getClass();
        cVar.f6163h = p4.c0.n(null);
        cVar.f6161f = jVarB;
        cVar.f6164i = this;
        Map map = Collections.EMPTY_MAP;
        p4.c.k(uri, "The uri must be set.");
        n5.r rVar = new n5.r(((s4.g) cVar.f6156a.f1208b).q(), new s4.m(uri, 0L, 1, null, map, 0L, -1L, null, 1), 4, cVar.f6157b.H0());
        p4.c.i(cVar.f6162g == null);
        n5.o oVar = new n5.o("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        cVar.f6162g = oVar;
        oVar.f(rVar, cVar, cVar.f6158c.u(rVar.f15377c));
    }

    @Override // j5.a
    public final void o(b0 b0Var) {
        k kVar = (k) b0Var;
        kVar.f3480b.f6160e.remove(kVar);
        for (q qVar : kVar.f3498t) {
            if (qVar.D) {
                for (p pVar : qVar.f3547v) {
                    pVar.k();
                    b5.l lVar = pVar.f10216h;
                    if (lVar != null) {
                        lVar.c(pVar.f10213e);
                        pVar.f10216h = null;
                        pVar.f10215g = null;
                    }
                }
            }
            i iVar = qVar.f3529d;
            e5.b bVar = (e5.b) iVar.f3450g.f6159d.get(iVar.f3448e[iVar.f3460q.l()]);
            if (bVar != null) {
                bVar.f6153k = false;
            }
            iVar.f3457n = null;
            qVar.f3535j.e(qVar);
            qVar.f3543r.removeCallbacksAndMessages(null);
            qVar.H = true;
            qVar.f3544s.clear();
        }
        kVar.f3495q = null;
    }

    @Override // j5.a
    public final void q() {
        e5.c cVar = this.f3509o;
        cVar.f6166k = null;
        cVar.f6167l = null;
        cVar.f6165j = null;
        cVar.f6169n = -9223372036854775807L;
        cVar.f6162g.e(null);
        cVar.f6162g = null;
        HashMap map = cVar.f6159d;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((e5.b) it.next()).f6144b.e(null);
        }
        cVar.f6163h.removeCallbacksAndMessages(null);
        cVar.f6163h = null;
        map.clear();
        this.f3505k.a();
    }

    @Override // j5.a
    public final synchronized void t(i0 i0Var) {
        this.f3513s = i0Var;
    }

    public final void v(e5.k kVar) {
        long j10;
        g1 g1Var;
        long j11;
        long jN;
        long j12;
        boolean z10 = kVar.f6223p;
        boolean z11 = kVar.f6214g;
        ya.i0 i0Var = kVar.f6225r;
        long j13 = kVar.f6228u;
        long jN2 = kVar.f6212e;
        int i10 = kVar.f6211d;
        long j14 = kVar.f6215h;
        long jC0 = z10 ? p4.c0.c0(j14) : -9223372036854775807L;
        long j15 = (i10 == 2 || i10 == 1) ? jC0 : -9223372036854775807L;
        e5.c cVar = this.f3509o;
        cVar.f6165j.getClass();
        pe.d dVar = new pe.d(19);
        long j16 = 0;
        if (cVar.f6168m) {
            e5.j jVar = kVar.f6229v;
            long j17 = j14 - cVar.f6169n;
            boolean z12 = kVar.f6222o;
            long j18 = z12 ? j17 + j13 : -9223372036854775807L;
            long jN3 = kVar.f6223p ? p4.c0.N(p4.c0.z(this.f3510p)) - (j14 + j13) : 0L;
            long j19 = this.f3511q.f14149a;
            if (j19 != -9223372036854775807L) {
                jN = p4.c0.N(j19);
            } else {
                if (jN2 != -9223372036854775807L) {
                    j11 = j13 - jN2;
                } else {
                    j11 = jVar.f6209d;
                    if (j11 == -9223372036854775807L || kVar.f6221n == -9223372036854775807L) {
                        j11 = jVar.f6208c;
                        if (j11 == -9223372036854775807L) {
                            j11 = 3 * kVar.f6220m;
                        }
                    }
                }
                jN = j11 + jN3;
            }
            long j20 = j13 + jN3;
            long j21 = p4.c0.j(jN, jN3, j20);
            c0 c0Var = i().f14287c;
            boolean z13 = c0Var.f14152d == -3.4028235E38f && c0Var.f14153e == -3.4028235E38f && jVar.f6208c == -9223372036854775807L && jVar.f6209d == -9223372036854775807L;
            m4.b0 b0Var = new m4.b0();
            b0Var.f14132a = p4.c0.c0(j21);
            b0Var.f14135d = z13 ? 1.0f : this.f3511q.f14152d;
            b0Var.f14136e = z13 ? 1.0f : this.f3511q.f14153e;
            c0 c0Var2 = new c0(b0Var);
            this.f3511q = c0Var2;
            if (jN2 == -9223372036854775807L) {
                jN2 = j20 - p4.c0.N(c0Var2.f14149a);
            }
            if (z11) {
                j16 = jN2;
            } else {
                e5.f fVarU = u(jN2, kVar.f6226s);
                if (fVarU != null) {
                    j12 = fVarU.f6199e;
                } else if (!i0Var.isEmpty()) {
                    e5.h hVar = (e5.h) i0Var.get(p4.c0.c(i0Var, Long.valueOf(jN2), true));
                    e5.f fVarU2 = u(jN2, hVar.f6194m);
                    j12 = fVarU2 != null ? fVarU2.f6199e : hVar.f6199e;
                }
                j16 = j12;
            }
            g1Var = new g1(j15, jC0, j18, kVar.f6228u, j17, j16, true, !z12, i10 == 2 && kVar.f6213f, dVar, i(), this.f3511q);
        } else {
            if (jN2 == -9223372036854775807L || i0Var.isEmpty()) {
                j10 = 0;
            } else {
                if (!z11 && jN2 != j13) {
                    jN2 = ((e5.h) i0Var.get(p4.c0.c(i0Var, Long.valueOf(jN2), true))).f6199e;
                }
                j10 = jN2;
            }
            long j22 = kVar.f6228u;
            g1Var = new g1(j15, jC0, j22, j22, 0L, j10, true, false, true, dVar, i(), null);
        }
        n(g1Var);
    }
}
