package f7;

import e7.d0;
import e7.l0;
import e7.m0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import lf.b1;
import lf.k0;
import x0.e1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lf7/i;", "Le7/m0;", "Lf7/h;", "<init>", "()V", "navigation-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@l0("composable")
public final class i extends m0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e1 f6764c = x0.v.v(Boolean.FALSE);

    @Override // e7.m0
    public final e7.u a() {
        return new h(this, c.f6760a);
    }

    @Override // e7.m0
    public final void d(List list, d0 d0Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e7.j jVar = (e7.j) it.next();
            e7.l lVarB = b();
            k0 k0Var = lVarB.f6357e;
            jc.l.e(jVar, "backStackEntry");
            b1 b1Var = lVarB.f6355c;
            Iterable iterable = (Iterable) b1Var.getValue();
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it2 = iterable.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (((e7.j) it2.next()) == jVar) {
                        Iterable iterable2 = (Iterable) k0Var.f12434a.getValue();
                        if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                            Iterator it3 = iterable2.iterator();
                            while (it3.hasNext()) {
                                if (((e7.j) it3.next()) == jVar) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            e7.j jVar2 = (e7.j) vb.m.i0((List) k0Var.f12434a.getValue());
            if (jVar2 != null) {
                b1Var.m(null, ud.e.K((Set) b1Var.getValue(), jVar2));
            }
            b1Var.m(null, ud.e.K((Set) b1Var.getValue(), jVar));
            lVarB.f(jVar);
        }
        this.f6764c.setValue(Boolean.FALSE);
    }

    @Override // e7.m0
    public final void e(e7.j jVar, boolean z10) {
        b().e(jVar, z10);
        this.f6764c.setValue(Boolean.TRUE);
    }

    public final void g(e7.j jVar) {
        e7.l lVarB = b();
        jc.l.e(jVar, "entry");
        b1 b1Var = lVarB.f6355c;
        b1Var.m(null, ud.e.K((Set) b1Var.getValue(), jVar));
        h7.g gVar = lVarB.f6360h.f6299b;
        gVar.getClass();
        if (!gVar.f8164f.contains(jVar)) {
            throw new IllegalStateException("Cannot transition entry that is not in the back stack");
        }
        jVar.g(androidx.lifecycle.p.f797d);
    }
}
