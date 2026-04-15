package pd;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends bf.m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yc.e f16996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Set f16997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ic.k f16998d;

    public b0(yc.e eVar, Set set, ic.k kVar) {
        this.f16996b = eVar;
        this.f16997c = set;
        this.f16998d = kVar;
    }

    @Override // bf.m
    public final boolean c(Object obj) {
        yc.e eVar = (yc.e) obj;
        jc.l.e(eVar, "current");
        if (eVar == this.f16996b) {
            return true;
        }
        le.o oVarK0 = eVar.k0();
        jc.l.d(oVarK0, "getStaticScope(...)");
        if (!(oVarK0 instanceof d0)) {
            return true;
        }
        this.f16997c.addAll((Collection) this.f16998d.a(oVarK0));
        return false;
    }

    @Override // bf.m
    public final /* bridge */ /* synthetic */ Object j() {
        return ub.a0.f21526a;
    }
}
