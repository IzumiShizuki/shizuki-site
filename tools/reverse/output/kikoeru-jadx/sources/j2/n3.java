package j2;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.cnl.kikoeru.R;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n3 extends jc.m implements ic.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o3 f9925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ic.n f9926d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n3(o3 o3Var, ic.n nVar, int i10) {
        super(2);
        this.f9924b = i10;
        this.f9925c = o3Var;
        this.f9926d = nVar;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f9924b) {
            case 0:
                x0.o oVar = (x0.o) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AndroidCompositionLocals_androidKt.a(this.f9925c.f9944a, this.f9926d, oVar, 0);
                } else {
                    oVar.Q();
                }
                break;
            default:
                x0.o oVar2 = (x0.o) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (oVar2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    o3 o3Var = this.f9925c;
                    v vVar = o3Var.f9944a;
                    Object tag = vVar.getTag(R.id.inspection_slot_table_set);
                    yb.c cVar = null;
                    Set set = (!(tag instanceof Set) || ((tag instanceof kc.a) && !(tag instanceof kc.e))) ? null : (Set) tag;
                    if (set == null) {
                        Object parent = vVar.getParent();
                        View view = parent instanceof View ? (View) parent : null;
                        Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                        set = (!(tag2 instanceof Set) || ((tag2 instanceof kc.a) && !(tag2 instanceof kc.e))) ? null : (Set) tag2;
                    }
                    if (set != null) {
                        x0.t tVar = oVar2.U;
                        if (tVar == null) {
                            tVar = new x0.t(oVar2.f24382h);
                            oVar2.U = tVar;
                        }
                        set.add(tVar);
                        oVar2.f24391q = true;
                        oVar2.C = true;
                        oVar2.f24377c.i();
                        oVar2.H.i();
                        x0.d2 d2Var = oVar2.I;
                        x0.a2 a2Var = d2Var.f24265a;
                        d2Var.f24269e = a2Var.f24245j;
                        d2Var.f24270f = a2Var.f24246k;
                    }
                    boolean zH = oVar2.h(o3Var);
                    Object objK = oVar2.K();
                    x0.r0 r0Var = x0.k.f24334a;
                    if (zH || objK == r0Var) {
                        objK = new m3(o3Var, cVar, 0);
                        oVar2.h0(objK);
                    }
                    x0.v.e((ic.n) objK, vVar, oVar2);
                    boolean zH2 = oVar2.h(o3Var);
                    Object objK2 = oVar2.K();
                    if (zH2 || objK2 == r0Var) {
                        objK2 = new m3(o3Var, cVar, 1);
                        oVar2.h0(objK2);
                    }
                    x0.v.e((ic.n) objK2, vVar, oVar2);
                    x0.v.a(i1.f.f8642a.a(set), f1.g.f(-280240369, new n3(o3Var, this.f9926d, 0), oVar2), oVar2, 56);
                } else {
                    oVar2.Q();
                }
                break;
        }
        return ub.a0.f21526a;
    }
}
