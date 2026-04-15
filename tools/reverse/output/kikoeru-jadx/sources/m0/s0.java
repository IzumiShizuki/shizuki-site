package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y.e1 f13582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f13583b = 64;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f13584c = 36;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f13585d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final y.e1 f13586e;

    static {
        float f10 = 16;
        float f11 = 8;
        f13582a = new y.e1(f10, f11, f10, f11);
        f13586e = new y.e1(f11, f11, f11, f11);
    }

    public static k1 a(long j10, long j11, long j12, long j13, x0.o oVar, int i10, int i11) {
        if ((i11 & 1) != 0) {
            j10 = ((b1) oVar.j(c1.f12773a)).f();
        }
        if ((i11 & 2) != 0) {
            j11 = c1.b(j10, oVar);
        }
        if ((i11 & 4) != 0) {
            x0.o2 o2Var = c1.f12773a;
            j12 = q1.h0.l(q1.q.b(0.12f, ((b1) oVar.j(o2Var)).e()), ((b1) oVar.j(o2Var)).i());
        }
        if ((i11 & 8) != 0) {
            x0.o2 o2Var2 = c1.f12773a;
            long jE = ((b1) oVar.j(o2Var2)).e();
            long j14 = ((q1.q) oVar.j(j1.f13125a)).f17577a;
            if (((b1) oVar.j(o2Var2)).j()) {
                q1.h0.r(j14);
            } else {
                q1.h0.r(j14);
            }
            j13 = q1.q.b(0.38f, jE);
        }
        return new k1(j10, j11, j12, j13);
    }

    public static k1 b(long j10, x0.o oVar, int i10) {
        long j11 = q1.q.f17574g;
        if ((i10 & 2) != 0) {
            j10 = ((b1) oVar.j(c1.f12773a)).f();
        }
        long j12 = j10;
        x0.o2 o2Var = c1.f12773a;
        long jE = ((b1) oVar.j(o2Var)).e();
        long j13 = ((q1.q) oVar.j(j1.f13125a)).f17577a;
        if (((b1) oVar.j(o2Var)).j()) {
            q1.h0.r(j13);
        } else {
            q1.h0.r(j13);
        }
        return new k1(j11, j12, j11, q1.q.b(0.38f, jE));
    }
}
