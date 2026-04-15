package v;

import java.util.concurrent.CancellationException;
import jc.m;
import jc.v;
import u.k1;
import ub.a0;
import x0.e1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h extends m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f22117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v f22118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k1 f22119e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ic.k f22120f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(float f10, v vVar, k1 k1Var, ic.k kVar, int i10) {
        super(1);
        this.f22116b = i10;
        this.f22117c = f10;
        this.f22118d = vVar;
        this.f22119e = k1Var;
        this.f22120f = kVar;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        float fA;
        switch (this.f22116b) {
            case 0:
                r.i iVar = (r.i) obj;
                e1 e1Var = iVar.f18451e;
                float fAbs = Math.abs(((Number) e1Var.getValue()).floatValue());
                float f10 = this.f22117c;
                float fAbs2 = Math.abs(f10);
                ic.k kVar = this.f22120f;
                k1 k1Var = this.f22119e;
                v vVar = this.f22118d;
                if (fAbs >= fAbs2) {
                    float fD = j.d(((Number) e1Var.getValue()).floatValue(), f10);
                    j.b(iVar, k1Var, kVar, fD - vVar.f10835a);
                    iVar.a();
                    vVar.f10835a = fD;
                } else {
                    j.b(iVar, k1Var, kVar, ((Number) e1Var.getValue()).floatValue() - vVar.f10835a);
                    vVar.f10835a = ((Number) e1Var.getValue()).floatValue();
                }
                break;
            default:
                r.i iVar2 = (r.i) obj;
                float fD2 = j.d(((Number) iVar2.f18451e.getValue()).floatValue(), this.f22117c);
                v vVar2 = this.f22118d;
                float f11 = fD2 - vVar2.f10835a;
                try {
                    fA = this.f22119e.a(f11);
                } catch (CancellationException unused) {
                    iVar2.a();
                    fA = 0.0f;
                }
                this.f22120f.a(Float.valueOf(fA));
                if (Math.abs(f11 - fA) > 0.5f || fD2 != ((Number) iVar2.f18451e.getValue()).floatValue()) {
                    iVar2.a();
                }
                vVar2.f10835a += fA;
                break;
        }
        return a0.f21526a;
    }
}
