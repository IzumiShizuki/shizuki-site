package u9;

import ic.n;
import m0.z0;
import ub.a0;
import x0.k;
import x0.o;
import x0.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f21458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w0 f21460c;

    public c(boolean z10, int i10, w0 w0Var) {
        this.f21458a = z10;
        this.f21459b = i10;
        this.f21460c = w0Var;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        o oVar = (o) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            int i10 = this.f21459b;
            boolean zD = oVar.d(i10);
            Object objK = oVar.K();
            if (zD || objK == k.f24334a) {
                objK = new b(this.f21460c, i10);
                oVar.h0(objK);
            }
            z0.a(this.f21458a, (ic.k) objK, null, false, null, oVar, 0, 60);
        } else {
            oVar.Q();
        }
        return a0.f21526a;
    }
}
