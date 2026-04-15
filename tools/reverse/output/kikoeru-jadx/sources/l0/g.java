package l0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g extends jc.m implements ic.o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f11482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f11483d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj, boolean z10, int i10) {
        super(3);
        this.f11481b = i10;
        this.f11483d = obj;
        this.f11482c = z10;
    }

    @Override // ic.o
    public final Object g(Object obj, Object obj2, Object obj3) {
        switch (this.f11481b) {
            case 0:
                j1.q qVar = (j1.q) obj;
                x0.o oVar = (x0.o) obj2;
                ((Number) obj3).intValue();
                oVar.W(-196777734);
                long j10 = ((q1) oVar.j(r1.f11608a)).f11600a;
                boolean zE = oVar.e(j10);
                ic.a aVar = (ic.a) this.f11483d;
                boolean zF = zE | oVar.f(aVar);
                boolean z10 = this.f11482c;
                boolean zG = zF | oVar.g(z10);
                Object objK = oVar.K();
                if (zG || objK == x0.k.f24334a) {
                    objK = new f(j10, aVar, z10);
                    oVar.h0(objK);
                }
                j1.q qVarB = androidx.compose.ui.draw.a.b(qVar, (ic.k) objK);
                oVar.p(false);
                return qVarB;
            default:
                v0.l0 l0Var = (v0.l0) obj;
                x0.o oVar2 = (x0.o) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= oVar2.f(l0Var) ? 4 : 2;
                }
                if ((iIntValue & 19) == 18 && oVar2.z()) {
                    oVar2.Q();
                } else {
                    v0.e0.f22190a.b(l0Var, null, (v0.a0) this.f11483d, this.f11482c, oVar2, (iIntValue & 14) | 24576);
                }
                return ub.a0.f21526a;
        }
    }
}
