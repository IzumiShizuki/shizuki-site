package y4;

import android.os.Handler;
import j5.b1;
import j5.y0;
import m4.n0;
import m4.p0;
import m4.q;
import p4.c0;
import p4.s;
import r5.g0;
import r5.h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b1 f25538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v2.e f25539b = new v2.e(1, false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a6.a f25540c = new a6.a(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f25541d = -9223372036854775807L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f25542e;

    public n(o oVar, n5.f fVar) {
        this.f25542e = oVar;
        this.f25538a = new b1(fVar, null, null);
    }

    @Override // r5.h0
    public final void a(long j10, int i10, int i11, int i12, g0 g0Var) {
        long jI;
        long jQ;
        this.f25538a.a(j10, i10, i11, i12, g0Var);
        while (this.f25538a.x(false)) {
            a6.a aVar = this.f25540c;
            aVar.h();
            if (this.f25538a.C(this.f25539b, aVar, 0, false) == -4) {
                aVar.k();
            } else {
                aVar = null;
            }
            if (aVar != null) {
                long j11 = aVar.f21384g;
                n0 n0VarS = this.f25542e.f25545c.s(aVar);
                if (n0VarS != null) {
                    c6.a aVar2 = (c6.a) n0VarS.f14409a[0];
                    String str = aVar2.f3573a;
                    String str2 = aVar2.f3574b;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            jQ = c0.Q(c0.p(aVar2.f3577e));
                        } catch (p0 unused) {
                            jQ = -9223372036854775807L;
                        }
                        if (jQ != -9223372036854775807L) {
                            m mVar = new m(j11, jQ);
                            Handler handler = this.f25542e.f25546d;
                            handler.sendMessage(handler.obtainMessage(1, mVar));
                        }
                    }
                }
            }
        }
        b1 b1Var = this.f25538a;
        y0 y0Var = b1Var.f10209a;
        synchronized (b1Var) {
            int i13 = b1Var.f10227s;
            jI = i13 == 0 ? -1L : b1Var.i(i13);
        }
        y0Var.b(jI);
    }

    @Override // r5.h0
    public final void b(q qVar) {
        this.f25538a.b(qVar);
    }

    @Override // r5.h0
    public final int c(m4.i iVar, int i10, boolean z10) {
        b1 b1Var = this.f25538a;
        b1Var.getClass();
        return b1Var.c(iVar, i10, z10);
    }

    @Override // r5.h0
    public final int d(m4.i iVar, int i10, boolean z10) {
        return c(iVar, i10, z10);
    }

    @Override // r5.h0
    public final void e(int i10, s sVar) {
        f(sVar, i10, 0);
    }

    @Override // r5.h0
    public final void f(s sVar, int i10, int i11) {
        b1 b1Var = this.f25538a;
        b1Var.getClass();
        b1Var.f(sVar, i10, 0);
    }
}
