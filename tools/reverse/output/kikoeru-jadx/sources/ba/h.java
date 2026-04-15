package ba;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements ic.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.w0 f2369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ic.a f2370c;

    public /* synthetic */ h(x0.w0 w0Var, ic.a aVar, int i10) {
        this.f2368a = i10;
        this.f2369b = w0Var;
        this.f2370c = aVar;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f2368a) {
            case 0:
                ((Integer) obj2).getClass();
                z.g(this.f2369b, this.f2370c, (x0.o) obj, x0.v.D(7));
                break;
            case 1:
                x0.o oVar = (x0.o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x0.w0 w0Var = this.f2369b;
                    boolean zF = oVar.f(w0Var);
                    ic.a aVar = this.f2370c;
                    boolean zF2 = zF | oVar.f(aVar);
                    Object objK = oVar.K();
                    if (zF2 || objK == x0.k.f24334a) {
                        objK = new o0(w0Var, aVar, 0);
                        oVar.h0(objK);
                    }
                    android.support.v4.media.session.b.o((ic.a) objK, null, false, null, z.f2519e, oVar, 805306368, 510);
                } else {
                    oVar.Q();
                }
                return ub.a0.f21526a;
            case 2:
                ((Integer) obj2).getClass();
                ha.b.c(this.f2369b, this.f2370c, (x0.o) obj, x0.v.D(7));
                break;
            case 3:
                x0.o oVar2 = (x0.o) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (oVar2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x0.w0 w0Var2 = this.f2369b;
                    boolean zF3 = oVar2.f(w0Var2);
                    ic.a aVar2 = this.f2370c;
                    boolean zF4 = zF3 | oVar2.f(aVar2);
                    Object objK2 = oVar2.K();
                    if (zF4 || objK2 == x0.k.f24334a) {
                        objK2 = new o0(w0Var2, aVar2, 2);
                        oVar2.h0(objK2);
                    }
                    android.support.v4.media.session.b.o((ic.a) objK2, null, false, null, m9.e.f15005j, oVar2, 805306368, 510);
                } else {
                    oVar2.Q();
                }
                return ub.a0.f21526a;
            case 4:
                x0.o oVar3 = (x0.o) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (oVar3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x0.w0 w0Var3 = this.f2369b;
                    boolean zF5 = oVar3.f(w0Var3);
                    ic.a aVar3 = this.f2370c;
                    boolean zF6 = zF5 | oVar3.f(aVar3);
                    Object objK3 = oVar3.K();
                    if (zF6 || objK3 == x0.k.f24334a) {
                        objK3 = new o0(w0Var3, aVar3, 3);
                        oVar3.h0(objK3);
                    }
                    android.support.v4.media.session.b.o((ic.a) objK3, null, false, null, q9.a.f17939l, oVar3, 805306368, 510);
                } else {
                    oVar3.Q();
                }
                return ub.a0.f21526a;
            case 5:
                ((Integer) obj2).getClass();
                z9.m.b(this.f2369b, this.f2370c, (x0.o) obj, x0.v.D(1));
                break;
            default:
                ((Integer) obj2).getClass();
                z9.m.b(this.f2369b, this.f2370c, (x0.o) obj, x0.v.D(1));
                break;
        }
        return ub.a0.f21526a;
    }

    public /* synthetic */ h(x0.w0 w0Var, ic.a aVar, int i10, int i11) {
        this.f2368a = i11;
        this.f2369b = w0Var;
        this.f2370c = aVar;
    }
}
