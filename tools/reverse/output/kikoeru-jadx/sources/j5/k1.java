package j5;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k1 extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final s4.m f10330h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final s4.g f10331i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final m4.q f10332j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final m3.l f10334l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final g1 f10336n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final m4.i0 f10337o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public s4.f0 f10338p;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f10333k = -9223372036854775807L;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f10335m = true;

    public k1(m4.h0 h0Var, s4.g gVar, m3.l lVar) {
        m4.d0 d0Var;
        this.f10331i = gVar;
        this.f10334l = lVar;
        boolean z10 = true;
        m4.w wVar = new m4.w();
        m4.z zVar = new m4.z();
        List list = Collections.EMPTY_LIST;
        ya.a1 a1Var = ya.a1.f25946e;
        m4.b0 b0Var = new m4.b0();
        m4.e0 e0Var = m4.e0.f14187d;
        Uri uri = Uri.EMPTY;
        String string = h0Var.f14245a.toString();
        string.getClass();
        ya.i0 i0VarQ = ya.i0.q(ya.i0.u(h0Var));
        if (((Uri) zVar.f14645e) != null && ((UUID) zVar.f14644d) == null) {
            z10 = false;
        }
        p4.c.i(z10);
        if (uri != null) {
            d0Var = new m4.d0(uri, null, ((UUID) zVar.f14644d) != null ? new m4.a0(zVar) : null, null, list, null, i0VarQ, -9223372036854775807L);
        } else {
            d0Var = null;
        }
        m4.i0 i0Var = new m4.i0(string, new m4.y(wVar), d0Var, new m4.c0(b0Var), m4.l0.K, e0Var);
        this.f10337o = i0Var;
        m4.p pVar = new m4.p();
        String str = h0Var.f14246b;
        pVar.f14488m = m4.o0.p(str == null ? "text/x-unknown" : str);
        pVar.f14479d = h0Var.f14247c;
        pVar.f14480e = h0Var.f14248d;
        pVar.f14481f = h0Var.f14249e;
        pVar.f14477b = h0Var.f14250f;
        String str2 = h0Var.f14251g;
        pVar.f14476a = str2 != null ? str2 : null;
        this.f10332j = new m4.q(pVar);
        Map map = Collections.EMPTY_MAP;
        Uri uri2 = h0Var.f14245a;
        p4.c.k(uri2, "The uri must be set.");
        this.f10330h = new s4.m(uri2, 0L, 1, null, map, 0L, -1L, null, 1);
        this.f10336n = new g1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, 0L, 0L, true, false, false, null, i0Var, null);
    }

    @Override // j5.a
    public final b0 c(d0 d0Var, n5.f fVar, long j10) {
        return new j1(this.f10330h, this.f10331i, this.f10338p, this.f10332j, this.f10333k, this.f10334l, b(d0Var), this.f10335m, null);
    }

    @Override // j5.a
    public final m4.i0 i() {
        return this.f10337o;
    }

    @Override // j5.a
    public final void m(s4.f0 f0Var) {
        this.f10338p = f0Var;
        n(this.f10336n);
    }

    @Override // j5.a
    public final void o(b0 b0Var) {
        ((j1) b0Var).f10319i.e(null);
    }

    @Override // j5.a
    public final void k() {
    }

    @Override // j5.a
    public final void q() {
    }
}
