package u9;

import a0.g0;
import android.view.View;
import ic.p;
import java.util.List;
import jc.l;
import jc.m;
import ub.a0;
import ub.k;
import uh.y;
import x0.o;
import x0.r0;
import x0.w0;
import z9.r;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g extends m implements p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f21474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f21475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f21476e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f21477f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(List list, Object obj, Object obj2, Object obj3, int i10) {
        super(4);
        this.f21473b = i10;
        this.f21474c = list;
        this.f21475d = obj;
        this.f21476e = obj2;
        this.f21477f = obj3;
    }

    @Override // ic.p
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        int i10 = this.f21473b;
        a0 a0Var = a0.f21526a;
        List list = this.f21474c;
        Object obj5 = this.f21475d;
        Object obj6 = this.f21476e;
        Object obj7 = this.f21477f;
        int i11 = 4;
        boolean z10 = true;
        int i12 = 0;
        switch (i10) {
            case 0:
                a0.d dVar = (a0.d) obj;
                int iIntValue = ((Number) obj2).intValue();
                o oVar = (o) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                int i13 = (iIntValue2 & 6) == 0 ? iIntValue2 | (oVar.f(dVar) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i13 |= oVar.d(iIntValue) ? 32 : 16;
                }
                if (!oVar.N(i13 & 1, (i13 & 147) != 146)) {
                    oVar.Q();
                } else {
                    k kVar = (k) list.get(iIntValue);
                    oVar.W(-205789332);
                    i iVar = (i) kVar.f21543a;
                    ua.j.b(dVar, (y) obj5, iVar, null, false, null, f1.g.f(2117093381, new f(((Boolean) kVar.f21544b).booleanValue(), iIntValue, (w0) obj6, (View) obj7, iVar), oVar), oVar, (i13 & 14) | 1572864);
                    oVar.p(false);
                }
                break;
            default:
                a0.d dVar2 = (a0.d) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                o oVar2 = (o) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                e7.a0 a0Var2 = (e7.a0) obj7;
                g0 g0Var = (g0) obj6;
                r rVar = (r) obj5;
                int i14 = (iIntValue4 & 6) == 0 ? iIntValue4 | (oVar2.f(dVar2) ? 4 : 2) : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i14 |= oVar2.d(iIntValue3) ? 32 : 16;
                }
                if (!oVar2.N(i14 & 1, (i14 & 147) != 146)) {
                    oVar2.Q();
                } else {
                    c9.f fVar = (c9.f) list.get(iIntValue3);
                    oVar2.W(-643036993);
                    boolean zH = ((((i14 & 112) ^ 48) > 32 && oVar2.d(iIntValue3)) || (i14 & 48) == 32) | oVar2.h(rVar) | oVar2.h(fVar) | oVar2.f(g0Var);
                    Object objK = oVar2.K();
                    r0 r0Var = x0.k.f24334a;
                    Object obj8 = objK;
                    if (zH || objK == r0Var) {
                        z9.k kVar2 = new z9.k(rVar, fVar, g0Var, iIntValue3);
                        oVar2.h0(kVar2);
                        obj8 = kVar2;
                    }
                    ic.k kVar3 = (ic.k) obj8;
                    boolean zH2 = oVar2.h(fVar) | oVar2.h(a0Var2);
                    Object objK2 = oVar2.K();
                    Object obj9 = objK2;
                    if (zH2 || objK2 == r0Var) {
                        ee.j jVar = new ee.j(10, fVar, a0Var2);
                        oVar2.h0(jVar);
                        obj9 = jVar;
                    }
                    ic.k kVar4 = (ic.k) obj9;
                    h2.g gVar = la.j.f12014b;
                    l.e(kVar4, "onClick");
                    android.support.v4.media.session.b.g(new j1.k(new ba.k(i11, kVar3, kVar4)), null, f1.g.f(342340278, new z9.l(fVar, i12), oVar2), false, null, null, f1.g.f(-1569512518, new z9.l(fVar, z10 ? 1 : 0), oVar2), oVar2, 1573248, 58);
                    oVar2.p(false);
                }
                break;
        }
        return a0Var;
    }
}
