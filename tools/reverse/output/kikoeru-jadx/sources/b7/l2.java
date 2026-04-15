package b7;

import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l2 implements cb.s, s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m4.l0 f1928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f1929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Uri f1930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f1931d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1932e;

    public l2(o2 o2Var) {
        this.f1932e = o2Var;
        this.f1928a = m4.l0.K;
        this.f1929b = "";
        this.f1931d = -9223372036854775807L;
    }

    @Override // cb.s
    public void d(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        o2 o2Var = (o2) ((l2) this.f1932e).f1932e;
        if (this != o2Var.f2017p) {
            return;
        }
        o2.D(o2Var.f2012k, x.l(this.f1928a, this.f1929b, this.f1930c, this.f1931d, bitmap));
        c2 c2Var = o2Var.f2008g;
        p4.c0.R(c2Var.f1688o, new w1(c2Var, 1));
    }

    @Override // b7.s1
    public void f(int i10, m4.u0 u0Var) {
        o2 o2Var = (o2) this.f1932e;
        z3 z3Var = o2Var.f2008g.f1693t;
        o2.E(o2Var, z3Var);
        o2Var.M(z3Var);
    }

    @Override // cb.s
    public void g(Throwable th2) {
        if (this != ((o2) ((l2) this.f1932e).f1932e).f2017p) {
            return;
        }
        p4.c.B("MediaSessionLegacyStub", "Failed to load bitmap: " + th2.getMessage());
    }

    @Override // b7.s1
    public void i(int i10, h4 h4Var, boolean z10, boolean z11, int i11) {
        o2 o2Var = (o2) this.f1932e;
        o2Var.M(o2Var.f2008g.f1693t);
    }

    public void j(m4.d dVar) {
        o2 o2Var = (o2) this.f1932e;
        if (o2Var.f2008g.f1693t.A().f14314a == 0) {
            int iT = x.t(dVar);
            c7.w0 w0Var = (c7.w0) o2Var.f2012k.f3618b;
            w0Var.getClass();
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(iT);
            w0Var.f3739a.setPlaybackToLocal(builder.build());
        }
    }

    public void k() {
        int i10;
        x3 x3Var;
        o2 o2Var = (o2) this.f1932e;
        c7.e1 e1Var = o2Var.f2012k;
        z3 z3Var = o2Var.f2008g.f1693t;
        if (z3Var.A().f14314a == 0) {
            x3Var = null;
        } else {
            m4.u0 u0VarM = z3Var.m();
            if (u0VarM.f14593a.a(26, 34)) {
                i10 = u0VarM.f14593a.a(25, 33) ? 2 : 1;
            } else {
                i10 = 0;
            }
            Handler handler = new Handler(((v4.v) z3Var.f2227a).f22691t);
            if (z3Var.B0(23)) {
                z3Var.E();
            }
            m4.k kVarA = z3Var.A();
            x3Var = new x3(z3Var, i10, kVarA.f14316c, 0, kVarA.f14317d, handler);
        }
        o2Var.f2015n = x3Var;
        if (x3Var != null) {
            ((c7.w0) e1Var.f3618b).f3739a.setPlaybackToRemote(x3Var.a());
            return;
        }
        int iT = x.t(z3Var.B0(21) ? z3Var.l() : m4.d.f14158g);
        c7.w0 w0Var = (c7.w0) e1Var.f3618b;
        w0Var.getClass();
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        builder.setLegacyStreamType(iT);
        w0Var.f3739a.setPlaybackToLocal(builder.build());
    }

    public void l(m4.i0 i0Var) {
        o2 o2Var = (o2) this.f1932e;
        c7.e1 e1Var = o2Var.f2012k;
        r();
        if (i0Var == null) {
            ((c7.w0) e1Var.f3618b).g(0);
        } else {
            ((c7.w0) e1Var.f3618b).g(x.u(i0Var.f14288d.f14372i));
        }
        o2Var.M(o2Var.f2008g.f1693t);
    }

    public void m(int i10, z3 z3Var) {
        o2 o2Var = (o2) this.f1932e;
        m4.i1 i1VarY = z3Var.y();
        Bundle bundle = z3Var.f2228b;
        q(i1VarY);
        n(z3Var.B0(18) ? z3Var.O() : m4.l0.K);
        z3Var.L();
        r();
        p(z3Var.Q());
        o(z3Var.P());
        z3Var.A();
        k();
        ((c7.w0) o2Var.f2012k.f3618b).f3739a.setExtras(bundle);
        o2.E(o2Var, z3Var);
        l(z3Var.w());
    }

    public void n(m4.l0 l0Var) {
        o2 o2Var = (o2) this.f1932e;
        c7.e1 e1Var = o2Var.f2012k;
        CharSequence queueTitle = ((c7.j0) ((androidx.media3.exoplayer.offline.u) e1Var.f3619c).f968b).f3647a.getQueueTitle();
        CharSequence charSequence = l0Var.f14364a;
        if (TextUtils.equals(queueTitle, charSequence)) {
            return;
        }
        z3 z3Var = o2Var.f2008g.f1693t;
        if (!z3Var.f2232f.a(17) || !z3Var.m().a(17)) {
            charSequence = null;
        }
        ((c7.w0) e1Var.f3618b).f3739a.setQueueTitle(charSequence);
    }

    public void o(int i10) {
        c7.e1 e1Var = ((o2) this.f1932e).f2012k;
        int iN = x.n(i10);
        c7.w0 w0Var = (c7.w0) e1Var.f3618b;
        if (w0Var.f3749k != iN) {
            w0Var.f3749k = iN;
            synchronized (w0Var.f3742d) {
                for (int iBeginBroadcast = w0Var.f3744f.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                    try {
                        ((c7.f) w0Var.f3744f.getBroadcastItem(iBeginBroadcast)).d(iN);
                    } catch (RemoteException unused) {
                    }
                }
                w0Var.f3744f.finishBroadcast();
            }
        }
    }

    public void p(boolean z10) {
        c7.e1 e1Var = ((o2) this.f1932e).f2012k;
        ya.m0 m0Var = x.f2171a;
        c7.w0 w0Var = (c7.w0) e1Var.f3618b;
        if (w0Var.f3750l != z10) {
            w0Var.f3750l = z10 ? 1 : 0;
            synchronized (w0Var.f3742d) {
                for (int iBeginBroadcast = w0Var.f3744f.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                    try {
                        ((c7.f) w0Var.f3744f.getBroadcastItem(iBeginBroadcast)).h0(z10 ? 1 : 0);
                    } catch (RemoteException unused) {
                    }
                }
                w0Var.f3744f.finishBroadcast();
            }
        }
    }

    public void q(m4.i1 i1Var) {
        s(i1Var);
        r();
    }

    public void r() {
        long j10;
        Uri uri;
        m4.l0 l0Var;
        m4.d0 d0Var;
        o2 o2Var = (o2) this.f1932e;
        c2 c2Var = o2Var.f2008g;
        z3 z3Var = c2Var.f1693t;
        m4.i0 i0VarW = z3Var.w();
        m4.l0 l0VarL = z3Var.L();
        long jI = -9223372036854775807L;
        if ((!z3Var.B0(16) || !z3Var.T()) && z3Var.B0(16)) {
            jI = z3Var.I();
        }
        String str = i0VarW != null ? i0VarW.f14285a : "";
        Bitmap bitmap = null;
        Uri uri2 = (i0VarW == null || (d0Var = i0VarW.f14286b) == null) ? null : d0Var.f14178a;
        if (Objects.equals(this.f1928a, l0VarL) && Objects.equals(this.f1929b, str) && Objects.equals(this.f1930c, uri2) && this.f1931d == jI) {
            return;
        }
        this.f1929b = str;
        this.f1930c = uri2;
        this.f1928a = l0VarL;
        this.f1931d = jI;
        cb.y yVarL = c2Var.f1686m.L(l0VarL);
        if (yVarL != null) {
            o2Var.f2017p = null;
            if (yVarL.isDone()) {
                try {
                    bitmap = (Bitmap) g8.a.B(yVarL);
                } catch (CancellationException | ExecutionException e10) {
                    p4.c.B("MediaSessionLegacyStub", "Failed to load bitmap: " + e10.getMessage());
                }
                j10 = jI;
                uri = uri2;
                l0Var = l0VarL;
            } else {
                j10 = jI;
                uri = uri2;
                l0Var = l0VarL;
                l2 l2Var = new l2(this, l0Var, str, uri, j10);
                str = str;
                o2Var.f2017p = l2Var;
                Handler handler = c2Var.f1685l;
                Objects.requireNonNull(handler);
                yVarL.a(new cb.t(0, yVarL, l2Var), new k1(handler, 1));
            }
        } else {
            j10 = jI;
            uri = uri2;
            l0Var = l0VarL;
        }
        o2.D(o2Var.f2012k, x.l(l0Var, str, uri, j10, bitmap));
    }

    public void s(m4.i1 i1Var) {
        o2 o2Var = (o2) this.f1932e;
        c2 c2Var = o2Var.f2008g;
        z3 z3Var = c2Var.f1693t;
        if (!z3Var.f2232f.a(17) || !z3Var.m().a(17) || i1Var.p()) {
            o2.F(o2Var.f2012k, null);
            return;
        }
        ya.m0 m0Var = x.f2171a;
        ArrayList arrayList = new ArrayList();
        m4.h1 h1Var = new m4.h1();
        for (int i10 = 0; i10 < i1Var.o(); i10++) {
            arrayList.add(i1Var.m(i10, h1Var, 0L).f14264c);
        }
        ArrayList arrayList2 = new ArrayList();
        f fVar = new f(this, new AtomicInteger(0), arrayList, arrayList2, 2);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            byte[] bArr = ((m4.i0) arrayList.get(i11)).f14288d.f14374k;
            if (bArr == null) {
                arrayList2.add(null);
                fVar.run();
            } else {
                cb.y yVarB0 = c2Var.f1686m.B0(bArr);
                arrayList2.add(yVarB0);
                Handler handler = c2Var.f1685l;
                Objects.requireNonNull(handler);
                yVarB0.a(fVar, new k1(handler, 1));
            }
        }
    }

    public l2(l2 l2Var, m4.l0 l0Var, String str, Uri uri, long j10) {
        this.f1932e = l2Var;
        this.f1928a = l0Var;
        this.f1929b = str;
        this.f1930c = uri;
        this.f1931d = j10;
    }

    @Override // b7.s1
    public void a() {
    }

    @Override // b7.s1
    public /* synthetic */ void b(int i10) {
    }

    @Override // b7.s1
    public /* synthetic */ void e(int i10, y yVar) {
    }

    @Override // b7.s1
    public /* synthetic */ void h(int i10, i4 i4Var) {
    }

    @Override // b7.s1
    public /* synthetic */ void c(int i10, v3 v3Var, m4.u0 u0Var, boolean z10, boolean z11) {
    }
}
