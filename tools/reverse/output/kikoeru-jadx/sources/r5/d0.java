package r5;

import java.util.List;
import m4.o0;
import ya.a1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18801d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18802e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public q f18803f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public h0 f18804g;

    public d0(int i10, int i11, String str) {
        this.f18798a = i10;
        this.f18799b = i11;
        this.f18800c = str;
    }

    @Override // r5.n
    public final boolean f(o oVar) {
        int i10 = this.f18799b;
        int i11 = this.f18798a;
        p4.c.i((i11 == -1 || i10 == -1) ? false : true);
        p4.s sVar = new p4.s(i10);
        ((k) oVar).i(sVar.f16611a, 0, i10, false);
        return sVar.A() == i11;
    }

    @Override // r5.n
    public final int g(o oVar, b0.a aVar) {
        int i10 = this.f18802e;
        if (i10 != 1) {
            if (i10 == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        h0 h0Var = this.f18804g;
        h0Var.getClass();
        int iD = h0Var.d(oVar, 1024, true);
        if (iD != -1) {
            this.f18801d += iD;
            return 0;
        }
        this.f18802e = 2;
        this.f18804g.a(0L, 1, this.f18801d, 0, null);
        this.f18801d = 0;
        return 0;
    }

    @Override // r5.n
    public final void h(q qVar) {
        this.f18803f = qVar;
        h0 h0VarU = qVar.u(1024, 4);
        this.f18804g = h0VarU;
        m4.p pVar = new m4.p();
        String str = this.f18800c;
        pVar.f14487l = o0.p(str);
        pVar.f14488m = o0.p(str);
        a0.c.O(pVar, h0VarU);
        this.f18803f.n();
        this.f18803f.a(new e0());
        this.f18802e = 1;
    }

    @Override // r5.n
    public final void i(long j10, long j11) {
        if (j10 == 0 || this.f18802e == 1) {
            this.f18802e = 1;
            this.f18801d = 0;
        }
    }

    @Override // r5.n
    public final List j() {
        ya.g0 g0Var = ya.i0.f25998b;
        return a1.f25946e;
    }

    @Override // r5.n
    public final void a() {
    }

    @Override // r5.n
    public final n c() {
        return this;
    }
}
