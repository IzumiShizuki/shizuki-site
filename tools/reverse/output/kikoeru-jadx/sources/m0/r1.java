package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r1 f13544a = new r1();

    public final long a(long j10, float f10, x0.o oVar, int i10) {
        oVar.W(-1687113661);
        b1 b1Var = (b1) oVar.j(c1.f12773a);
        if (Float.compare(f10, 0) <= 0 || b1Var.j()) {
            oVar.W(-1095440862);
            oVar.p(false);
        } else {
            oVar.W(-1095579370);
            x0.o2 o2Var = x2.f13883a;
            j10 = q1.h0.l(q1.q.b(((((float) Math.log(f10 + 1)) * 4.5f) + 2.0f) / 100.0f, c1.b(j10, oVar)), j10);
            oVar.p(false);
        }
        oVar.p(false);
        return j10;
    }
}
