package j5;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p implements r5.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10382a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f10383b;

    public p(int i10) {
        if ((i10 & 1) != 0) {
            this.f10383b = new r5.d0(65496, 2, "image/jpeg");
        } else {
            this.f10383b = new z5.a();
        }
    }

    @Override // r5.n
    public final void a() {
        switch (this.f10382a) {
            case 0:
                break;
            default:
                ((r5.n) this.f10383b).a();
                break;
        }
    }

    @Override // r5.n
    public final r5.n c() {
        int i10 = this.f10382a;
        return this;
    }

    @Override // r5.n
    public final boolean f(r5.o oVar) {
        switch (this.f10382a) {
            case 0:
                return true;
            default:
                return ((r5.n) this.f10383b).f(oVar);
        }
    }

    @Override // r5.n
    public final int g(r5.o oVar, b0.a aVar) {
        switch (this.f10382a) {
            case 0:
                return oVar.m(Integer.MAX_VALUE) == -1 ? -1 : 0;
            default:
                return ((r5.n) this.f10383b).g(oVar, aVar);
        }
    }

    @Override // r5.n
    public final void h(r5.q qVar) {
        switch (this.f10382a) {
            case 0:
                r5.h0 h0VarU = qVar.u(0, 3);
                qVar.a(new r5.s(-9223372036854775807L));
                qVar.n();
                m4.q qVar2 = (m4.q) this.f10383b;
                m4.p pVarA = qVar2.a();
                pVarA.f14488m = m4.o0.p("text/x-unknown");
                pVarA.f14485j = qVar2.f14544n;
                a0.c.O(pVarA, h0VarU);
                break;
            default:
                ((r5.n) this.f10383b).h(qVar);
                break;
        }
    }

    @Override // r5.n
    public final void i(long j10, long j11) {
        switch (this.f10382a) {
            case 0:
                break;
            default:
                ((r5.n) this.f10383b).i(j10, j11);
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // r5.n
    public final List j() {
        switch (this.f10382a) {
        }
        ya.g0 g0Var = ya.i0.f25998b;
        return ya.a1.f25946e;
    }

    public p(m4.q qVar) {
        this.f10383b = qVar;
    }

    private final void b() {
    }

    private final void d(long j10, long j11) {
    }
}
