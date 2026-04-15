package l0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class y extends jc.m implements ic.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11661b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s0 f11662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a1 f11663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f1.f f11664e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(s0 s0Var, a1 a1Var, f1.f fVar) {
        super(2);
        this.f11662c = s0Var;
        this.f11663d = a1Var;
        this.f11664e = fVar;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f11661b) {
            case 0:
                x0.o oVar = (x0.o) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x0.v.a(b1.f11429a.a(this.f11663d), f1.g.f(-272381430, new h0.o(this.f11664e, this.f11662c), oVar), oVar, 56);
                } else {
                    oVar.Q();
                }
                break;
            default:
                x0.o oVar2 = (x0.o) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (oVar2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    a1 a1Var = this.f11663d;
                    f1.f fVar = this.f11664e;
                    s0 s0Var = this.f11662c;
                    h0.q0.c(s0Var, f1.g.f(577209674, new y(a1Var, fVar, s0Var), oVar2), oVar2, 48);
                } else {
                    oVar2.Q();
                }
                break;
        }
        return ub.a0.f21526a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(a1 a1Var, f1.f fVar, s0 s0Var) {
        super(2);
        this.f11663d = a1Var;
        this.f11664e = fVar;
        this.f11662c = s0Var;
    }
}
