package m0;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a3 implements ic.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f12651a;

    public a3(boolean z10) {
        this.f12651a = z10;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        x0.o oVar = (x0.o) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            w1.f fVarB = s0.h.f19326b;
            if (fVarB == null) {
                w1.e eVar = new w1.e("Filled.ArrowDropDown", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                int i10 = w1.g0.f23208a;
                q1.n0 n0Var = new q1.n0(q1.q.f17569b);
                ArrayList arrayList = new ArrayList(32);
                arrayList.add(new w1.n(7.0f, 10.0f));
                arrayList.add(new w1.u(5.0f, 5.0f));
                arrayList.add(new w1.u(5.0f, -5.0f));
                arrayList.add(w1.j.f23242c);
                w1.e.a(eVar, arrayList, 0, n0Var);
                fVarB = eVar.b();
                s0.h.f19326b = fVarB;
            }
            float f10 = this.f12651a ? 180.0f : 360.0f;
            j1.q qVarC = j1.n.f9689a;
            if (f10 != 0.0f) {
                qVarC = androidx.compose.ui.graphics.a.c(qVarC, 0.0f, f10, null, 524031);
            }
            r3.b(fVarB, "Trailing icon for exposed dropdown menu", qVarC, 0L, oVar, 48, 8);
        } else {
            oVar.Q();
        }
        return ub.a0.f21526a;
    }
}
