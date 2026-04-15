package p5;

import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import java.util.List;
import m4.s1;
import m4.u1;
import p4.c0;
import ya.a1;
import ya.f0;
import ya.g0;
import ya.i0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a1 f16695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m4.q f16696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f16697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f16698d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f16699e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f16700f;

    public l(p pVar, Context context) {
        this.f16700f = pVar;
        c0.J(context);
        g0 g0Var = i0.f25998b;
        this.f16695a = a1.f25946e;
        this.f16699e = -9223372036854775807L;
    }

    public final void a(boolean z10) {
        this.f16699e = -9223372036854775807L;
        p pVar = this.f16700f;
        c cVar = pVar.f16708f;
        ce.g gVar = pVar.f16704b;
        if (pVar.f16713k == 1) {
            if (z10) {
                r rVar = cVar.f16635a;
                u uVar = rVar.f16718b;
                uVar.f16747m = 0L;
                uVar.f16750p = -1L;
                uVar.f16748n = -1L;
                rVar.f16723g = -9223372036854775807L;
                rVar.f16721e = -9223372036854775807L;
                rVar.d(1);
                rVar.f16724h = -9223372036854775807L;
            }
            v vVar = cVar.f16637c;
            ce.g gVar2 = vVar.f16755d;
            m4.j jVar = vVar.f16757f;
            jVar.f14296b = 0;
            jVar.f14297c = 0;
            vVar.f16758g = -9223372036854775807L;
            ce.g gVar3 = vVar.f16756e;
            if (gVar3.D() > 0) {
                p4.c.c(gVar3.D() > 0);
                while (gVar3.D() > 1) {
                    gVar3.x();
                }
                Object objX = gVar3.x();
                objX.getClass();
                gVar3.a(0L, (Long) objX);
            }
            if (gVar2.D() > 0) {
                p4.c.c(gVar2.D() > 0);
                while (gVar2.D() > 1) {
                    gVar2.x();
                }
                Object objX2 = gVar2.x();
                objX2.getClass();
                gVar2.a(0L, (u1) objX2);
            }
            cVar.f16638d.clear();
            while (gVar.D() > 1) {
                gVar.x();
            }
            if (gVar.D() == 1) {
                Long l10 = (Long) gVar.x();
                l10.getClass();
                cVar.a(l10.longValue(), pVar.f16715m, -9223372036854775807L);
            }
            pVar.f16714l = -9223372036854775807L;
            p4.x xVar = pVar.f16711i;
            p4.c.j(xVar);
            xVar.c(new j2.m(pVar));
        }
    }

    public final boolean b(m4.q qVar) {
        p pVar = this.f16700f;
        p4.c.i(pVar.f16713k == 0);
        m4.h hVar = qVar.B;
        if (hVar == null || !hVar.d()) {
            hVar = m4.h.f14224h;
        }
        if (hVar.f14233c != 7 || c0.f16548a < 34) {
        }
        p4.v vVar = pVar.f16709g;
        Looper looperMyLooper = Looper.myLooper();
        p4.c.j(looperMyLooper);
        pVar.f16711i = vVar.a(looperMyLooper, null);
        try {
            pVar.f16705c.a();
            throw null;
        } catch (s1 e10) {
            throw new a0(e10, qVar);
        }
    }

    public final void c(boolean z10) {
        this.f16700f.f16708f.f16635a.c(z10);
    }

    public final void d(int i10) {
        u uVar = this.f16700f.f16708f.f16635a.f16718b;
        if (uVar.f16744j == i10) {
            return;
        }
        uVar.f16744j = i10;
        uVar.d(true);
    }

    public final void e(Surface surface, p4.u uVar) {
        p pVar = this.f16700f;
        Pair pair = pVar.f16712j;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((p4.u) pVar.f16712j.second).equals(uVar)) {
            return;
        }
        pVar.f16712j = Pair.create(surface, uVar);
        int i10 = uVar.f16622a;
    }

    public final void f(float f10) {
        this.f16700f.f16708f.f16635a.g(f10);
    }

    public final void g(long j10, long j11, long j12) {
        p pVar = this.f16700f;
        ce.g gVar = pVar.f16704b;
        long j13 = this.f16699e;
        gVar.a(j13 == -9223372036854775807L ? 0L : j13 + 1, Long.valueOf(j10));
        this.f16697c = j11;
        pVar.f16715m = j11;
        pVar.f16708f.a(0L, j11, -9223372036854775807L);
        this.f16698d = j12;
    }

    public final void h(List list) {
        if (this.f16695a.equals(list)) {
            return;
        }
        p pVar = this.f16700f;
        pVar.f16705c.getClass();
        f0 f0Var = new f0(4);
        f0Var.c(list);
        f0Var.c(pVar.f16707e);
        this.f16695a = f0Var.f();
        m4.q qVar = this.f16696b;
        if (qVar == null) {
            return;
        }
        m4.p pVarA = qVar.a();
        m4.h hVar = qVar.B;
        if (hVar == null || !hVar.d()) {
            hVar = m4.h.f14224h;
        }
        pVarA.A = hVar;
        pVarA.a();
        p4.c.j(null);
        throw null;
    }

    public final void i(q qVar) {
        this.f16700f.f16708f.f16643i = qVar;
    }

    public final void j() {
        long j10 = this.f16699e;
        p pVar = this.f16700f;
        if (pVar.f16714l >= j10) {
            long j11 = pVar.f16708f.f16637c.f16758g;
        }
    }
}
