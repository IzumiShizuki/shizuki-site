package q9;

import androidx.compose.foundation.layout.FillElement;
import com.cnl.kikoeru.R;
import x0.e1;
import x0.j1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c0 implements ic.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r0 f17976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hf.y f17977c;

    public /* synthetic */ c0(int i10, hf.y yVar, r0 r0Var) {
        this.f17975a = i10;
        this.f17976b = r0Var;
        this.f17977c = yVar;
    }

    @Override // ic.o
    public final Object g(Object obj, Object obj2, Object obj3) {
        switch (this.f17975a) {
            case 0:
                x0.o oVar = (x0.o) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                jc.l.e((y.w) obj, "$this$RTLModalDrawer");
                if (oVar.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                    FillElement fillElement = androidx.compose.foundation.layout.c.f557c;
                    y.v vVarA = y.u.a(y.k.f25158c, j1.c.f9674m, oVar, 0);
                    int iQ = x0.v.q(oVar);
                    j1 j1VarL = oVar.l();
                    j1.q qVarC = j1.a.c(fillElement, oVar);
                    i2.k.f8771g0.getClass();
                    i2.i iVar = i2.j.f8733b;
                    oVar.a0();
                    if (oVar.S) {
                        oVar.k(iVar);
                    } else {
                        oVar.k0();
                    }
                    x0.v.A(i2.j.f8738g, vVarA, oVar);
                    x0.v.A(i2.j.f8737f, j1VarL, oVar);
                    i2.h hVar = i2.j.f8741j;
                    if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ))) {
                        j2.h0.s(iQ, oVar, iQ, hVar);
                    }
                    x0.v.A(i2.j.f8735d, qVarC, oVar);
                    ka.b.h(0, oVar);
                    f1.f fVar = a.f17949v;
                    r0 r0Var = this.f17976b;
                    m0.i0.c(fVar, null, null, f1.g.f(-580925434, new ba.l(10, r0Var), oVar), 0L, 0L, 0.0f, oVar, 3078, 118);
                    a.d(r0Var, null, oVar, 0);
                    e1 e1Var = r0Var.f18087d;
                    hf.y yVar = this.f17977c;
                    boolean zH = oVar.h(yVar) | oVar.h(r0Var);
                    Object objK = oVar.K();
                    x0.r0 r0Var2 = x0.k.f24334a;
                    if (zH || objK == r0Var2) {
                        objK = new x(1, yVar, r0Var);
                        oVar.h0(objK);
                    }
                    w.e(e1Var, (ic.k) objK, oVar, 0);
                    e1 e1Var2 = r0Var.f18088e;
                    boolean zH2 = oVar.h(yVar) | oVar.h(r0Var);
                    Object objK2 = oVar.K();
                    if (zH2 || objK2 == r0Var2) {
                        objK2 = new x(2, yVar, r0Var);
                        oVar.h0(objK2);
                    }
                    w.a(e1Var2, null, (ic.k) objK2, oVar, 0);
                    oVar.p(true);
                } else {
                    oVar.Q();
                }
                break;
            default:
                x0.o oVar2 = (x0.o) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                jc.l.e((a0.d) obj, "$this$item");
                if (oVar2.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    w1.f fVarM = n7.b0.m();
                    String strG = na.q.g(R.string.my_favorite);
                    r0 r0Var3 = this.f17976b;
                    boolean z10 = r0Var3.w() == null;
                    boolean zH3 = oVar2.h(r0Var3);
                    hf.y yVar2 = this.f17977c;
                    boolean zH4 = zH3 | oVar2.h(yVar2);
                    Object objK3 = oVar2.K();
                    if (zH4 || objK3 == x0.k.f24334a) {
                        objK3 = new c(r0Var3, yVar2);
                        oVar2.h0(objK3);
                    }
                    a.c(fVarM, strG, null, z10, 0, (ic.a) objK3, false, null, false, null, null, oVar2, 0, 0, 2004);
                } else {
                    oVar2.Q();
                }
                break;
        }
        return ub.a0.f21526a;
    }
}
