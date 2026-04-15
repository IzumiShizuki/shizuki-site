package z9;

import m0.z8;
import na.w;
import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l implements ic.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c9.f f26641b;

    public /* synthetic */ l(c9.f fVar, int i10) {
        this.f26640a = i10;
        this.f26641b = fVar;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        int i10 = this.f26640a;
        a0 a0Var = a0.f21526a;
        c9.f fVar = this.f26641b;
        switch (i10) {
            case 0:
                x0.o oVar = (x0.o) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!oVar.N(1 & iIntValue, (iIntValue & 3) != 2)) {
                    oVar.Q();
                } else {
                    String str = (String) fVar.f3814l.getValue();
                    xf.r rVar = w.f15765a;
                    jc.l.e(str, "<this>");
                    String strSubstring = str.substring(0, Math.min(50, str.length()));
                    jc.l.d(strSubstring, "substring(...)");
                    z8.b(strSubstring, null, 0L, 0L, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, oVar, 0, 3120, 120830);
                }
                break;
            default:
                x0.o oVar2 = (x0.o) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!oVar2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    oVar2.Q();
                } else {
                    z8.b(fVar.b(), null, 0L, 0L, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, oVar2, 0, 3120, 120830);
                }
                break;
        }
        return a0Var;
    }
}
