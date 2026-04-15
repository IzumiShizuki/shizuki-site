package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x0.o2 f12773a = new x0.o2(new i9.f(6));

    public static final long a(b1 b1Var, long j10) {
        long jF = b1Var.f();
        x0.e1 e1Var = b1Var.f12713i;
        return q1.q.c(j10, jF) ? b1Var.d() : q1.q.c(j10, b1Var.g()) ? b1Var.d() : q1.q.c(j10, b1Var.h()) ? ((q1.q) e1Var.getValue()).f17577a : q1.q.c(j10, ((q1.q) b1Var.f12708d.getValue()).f17577a) ? ((q1.q) e1Var.getValue()).f17577a : q1.q.c(j10, b1Var.a()) ? b1Var.c() : q1.q.c(j10, b1Var.i()) ? b1Var.e() : q1.q.c(j10, b1Var.b()) ? ((q1.q) b1Var.f12716l.getValue()).f17577a : q1.q.f17575h;
    }

    public static final long b(long j10, x0.o oVar) {
        oVar.W(-583916561);
        long jA = a((b1) oVar.j(f12773a), j10);
        if (jA == 16) {
            jA = ((q1.q) oVar.j(j1.f13125a)).f17577a;
        }
        oVar.p(false);
        return jA;
    }

    public static final long c(b1 b1Var) {
        return b1Var.j() ? b1Var.f() : b1Var.i();
    }

    public static b1 d(long j10, long j11, long j12, int i10) {
        long jE = (i10 & 1) != 0 ? q1.h0.e(4284612846L) : j10;
        long jE2 = (i10 & 2) != 0 ? q1.h0.e(4281794739L) : j11;
        long jE3 = (i10 & 4) != 0 ? q1.h0.e(4278442694L) : j12;
        long jE4 = q1.h0.e(4278290310L);
        long j13 = q1.q.f17571d;
        long jE5 = q1.h0.e(4289724448L);
        long j14 = q1.q.f17569b;
        return new b1(jE, jE2, jE3, jE4, j13, j13, jE5, j13, j14, j14, j14, j13, true);
    }
}
