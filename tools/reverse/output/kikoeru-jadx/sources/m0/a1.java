package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f12645a = 32;

    public static q1 a(long j10, long j11, x0.o oVar, int i10) {
        long jL;
        if ((i10 & 1) != 0) {
            x0.o2 o2Var = c1.f12773a;
            jL = q1.h0.l(q1.q.b(0.12f, ((b1) oVar.j(o2Var)).e()), ((b1) oVar.j(o2Var)).i());
        } else {
            jL = j10;
        }
        long jB = (i10 & 2) != 0 ? q1.q.b(0.87f, ((b1) oVar.j(c1.f12773a)).e()) : j11;
        long jB2 = q1.q.b(0.54f, jB);
        x0.o2 o2Var2 = c1.f12773a;
        long jE = ((b1) oVar.j(o2Var2)).e();
        x0.z zVar = j1.f13125a;
        long j12 = ((q1.q) oVar.j(zVar)).f17577a;
        if (((b1) oVar.j(o2Var2)).j()) {
            q1.h0.r(j12);
        } else {
            q1.h0.r(j12);
        }
        long jL2 = q1.h0.l(q1.q.b(0.045599997f, jE), ((b1) oVar.j(o2Var2)).i());
        long j13 = ((q1.q) oVar.j(zVar)).f17577a;
        if (((b1) oVar.j(o2Var2)).j()) {
            q1.h0.r(j13);
        } else {
            q1.h0.r(j13);
        }
        long jB3 = q1.q.b(0.3306f, jB);
        long j14 = ((q1.q) oVar.j(zVar)).f17577a;
        if (((b1) oVar.j(o2Var2)).j()) {
            q1.h0.r(j14);
        } else {
            q1.h0.r(j14);
        }
        return new q1(jL, jB, jB2, jL2, jB3, q1.q.b(0.2052f, jB2));
    }
}
