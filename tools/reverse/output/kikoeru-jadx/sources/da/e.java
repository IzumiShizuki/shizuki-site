package da;

import m0.r3;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements ic.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f5673b;

    public /* synthetic */ e(m0 m0Var, int i10) {
        this.f5672a = i10;
        this.f5673b = m0Var;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f5672a) {
            case 0:
                c0.f fVar = (c0.f) obj;
                ic.k kVar = (ic.k) obj2;
                jc.l.e(fVar, "$this$MusicList");
                jc.l.e(kVar, "it");
                m0 m0Var = this.f5673b;
                a0.c.B(fVar, "Title", new f1.f(new ba.l(3, m0Var), 816151107, true));
                a.i(fVar, m0Var.z(), 0, m0Var);
                kVar.a(fVar);
                break;
            default:
                x0.o oVar = (x0.o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    la.l.o(this.f5673b.f5744g, oVar, 0);
                    r3.b(nh.a.q(), "Translate", null, 0L, oVar, 48, 12);
                } else {
                    oVar.Q();
                }
                break;
        }
        return ub.a0.f21526a;
    }
}
