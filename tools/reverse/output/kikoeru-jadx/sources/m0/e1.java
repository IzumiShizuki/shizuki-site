package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e1 implements ic.o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e1 f12902b = new e1(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e1 f12903c = new e1(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e1 f12904d = new e1(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e1 f12905e = new e1(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12906a;

    public /* synthetic */ e1(int i10) {
        this.f12906a = i10;
    }

    @Override // ic.o
    public final Object g(Object obj, Object obj2, Object obj3) {
        switch (this.f12906a) {
            case 0:
                u6 u6Var = (u6) obj;
                x0.o oVar = (x0.o) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= oVar.f(u6Var) ? 4 : 2;
                }
                if (oVar.N(iIntValue & 1, (iIntValue & 19) != 18)) {
                    a.a.l(u6Var, null, null, oVar, iIntValue & 14);
                } else {
                    oVar.Q();
                }
                return ub.a0.f21526a;
            case 1:
                u6 u6Var2 = (u6) obj;
                x0.o oVar2 = (x0.o) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= oVar2.f(u6Var2) ? 4 : 2;
                }
                if (oVar2.N(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    a.a.l(u6Var2, null, null, oVar2, iIntValue2 & 14);
                } else {
                    oVar2.Q();
                }
                return ub.a0.f21526a;
            case 2:
                if (obj != null) {
                    throw new ClassCastException();
                }
                x0.o oVar3 = (x0.o) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= (iIntValue3 & 8) == 0 ? oVar3.f(null) : oVar3.h(null) ? 4 : 2;
                }
                if (oVar3.N(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    a7.d(null, null, 0L, 0L, 0L, 0.0f, oVar3, iIntValue3 & 14);
                } else {
                    oVar3.Q();
                }
                return ub.a0.f21526a;
            default:
                r.k1 k1Var = (r.k1) obj;
                x0.o oVar4 = (x0.o) obj2;
                ((Number) obj3).intValue();
                oVar4.W(1849239065);
                s3 s3Var = s3.f13595a;
                s3 s3Var2 = s3.f13596b;
                Object objR = k1Var.b(s3Var, s3Var2) ? r.d.r(67, 0, r.w.f18601d, 2) : (k1Var.b(s3Var2, s3Var) || k1Var.b(s3.f13597c, s3Var2)) ? new r.u1(83, 67, r.w.f18601d) : r.d.q(7, null);
                oVar4.p(false);
                return objR;
        }
    }
}
