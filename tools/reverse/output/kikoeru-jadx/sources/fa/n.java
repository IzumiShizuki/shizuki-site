package fa;

import bg.a2;
import la.d0;
import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements ic.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7017a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a2 f7018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ic.a f7019c;

    public /* synthetic */ n(a2 a2Var, ic.a aVar) {
        this.f7018b = a2Var;
        this.f7019c = aVar;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f7017a) {
            case 0:
                ((Integer) obj2).getClass();
                t.c(this.f7018b, this.f7019c, (x0.o) obj, x0.v.D(49));
                break;
            default:
                x0.o oVar = (x0.o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    d0.d(this.f7018b, null, false, this.f7019c, null, oVar, 0, 18);
                } else {
                    oVar.Q();
                }
                break;
        }
        return a0.f21526a;
    }

    public /* synthetic */ n(a2 a2Var, ic.a aVar, int i10) {
        this.f7018b = a2Var;
        this.f7019c = aVar;
    }
}
