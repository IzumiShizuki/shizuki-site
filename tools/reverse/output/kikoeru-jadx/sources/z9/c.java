package z9;

import com.cnl.kikoeru.R;
import com.tencent.bugly.beta.tinker.TinkerReport;
import j2.h0;
import m0.z8;
import ub.a0;
import x0.j1;
import x0.r0;
import x0.v;
import y.u;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements ic.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f26612b;

    public /* synthetic */ c(r rVar, int i10) {
        this.f26611a = i10;
        this.f26612b = rVar;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        int i10 = this.f26611a;
        String str = null;
        r0 r0Var = x0.k.f24334a;
        int i11 = 2;
        a0 a0Var = a0.f21526a;
        r rVar = this.f26612b;
        switch (i10) {
            case 0:
                ((Integer) obj2).getClass();
                m.d(rVar, (x0.o) obj, v.D(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                m.c(rVar, (x0.o) obj, v.D(1));
                break;
            case 2:
                x0.o oVar = (x0.o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    oVar.Q();
                } else {
                    boolean zH = oVar.h(rVar);
                    Object objK = oVar.K();
                    if (zH || objK == r0Var) {
                        objK = new b(rVar, 5);
                        oVar.h0(objK);
                    }
                    android.support.v4.media.session.b.o((ic.a) objK, null, false, null, a.f26607m, oVar, 805306368, 510);
                }
                break;
            case 3:
                x0.o oVar2 = (x0.o) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!oVar2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    oVar2.Q();
                } else {
                    c9.f fVar = (c9.f) rVar.f26658f.getValue();
                    String strB = fVar != null ? fVar.b() : null;
                    if (strB == null) {
                        strB = "";
                    }
                    z8.b(na.q.h(R.string.delete_confirm, strB), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar2, 0, 0, 131070);
                }
                break;
            case 4:
                ((Integer) obj2).getClass();
                m.c(rVar, (x0.o) obj, v.D(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                m.a(rVar, (x0.o) obj, v.D(1));
                break;
            case 6:
                x0.o oVar3 = (x0.o) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!oVar3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    oVar3.Q();
                } else {
                    boolean zH2 = oVar3.h(rVar);
                    Object objK2 = oVar3.K();
                    if (zH2 || objK2 == r0Var) {
                        objK2 = new b(rVar, 4);
                        oVar3.h0(objK2);
                    }
                    android.support.v4.media.session.b.o((ic.a) objK2, null, false, null, a.f26604j, oVar3, 805306368, 510);
                }
                break;
            case 7:
                x0.o oVar4 = (x0.o) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (!oVar4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    oVar4.Q();
                } else {
                    j1.n nVar = j1.n.f9689a;
                    j1.q qVarC = androidx.compose.foundation.layout.c.c(nVar, 1.0f);
                    y.v vVarA = u.a(y.k.f25158c, j1.c.f9674m, oVar4, 0);
                    int iQ = v.q(oVar4);
                    j1 j1VarL = oVar4.l();
                    j1.q qVarC2 = j1.a.c(qVarC, oVar4);
                    i2.k.f8771g0.getClass();
                    i2.i iVar = i2.j.f8733b;
                    oVar4.a0();
                    if (oVar4.S) {
                        oVar4.k(iVar);
                    } else {
                        oVar4.k0();
                    }
                    v.A(i2.j.f8738g, vVarA, oVar4);
                    v.A(i2.j.f8737f, j1VarL, oVar4);
                    i2.h hVar = i2.j.f8741j;
                    if (oVar4.S || !jc.l.a(oVar4.K(), Integer.valueOf(iQ))) {
                        h0.s(iQ, oVar4, iQ, hVar);
                    }
                    v.A(i2.j.f8735d, qVarC2, oVar4);
                    oVar4.W(1373125810);
                    String[] strArr = m.f26643b;
                    int length = strArr.length;
                    int i12 = 0;
                    while (i12 < length) {
                        String str2 = strArr[i12];
                        boolean zH3 = oVar4.h(rVar) | oVar4.f(str2);
                        Object objK3 = oVar4.K();
                        if (zH3 || objK3 == r0Var) {
                            objK3 = new z8.f(i11, rVar, str2);
                            oVar4.h0(objK3);
                        }
                        x0.o oVar5 = oVar4;
                        android.support.v4.media.session.b.g(androidx.compose.foundation.a.d(nVar, str, (ic.a) objK3, 7), null, f1.g.f(-1349438520, new h(rVar, str2), oVar4), false, null, f1.g.f(1122105611, new h(str2, rVar), oVar4), f1.g.f(-917357876, new ba.p(18, str2), oVar4), oVar5, 1769856, 26);
                        i12++;
                        strArr = strArr;
                        oVar4 = oVar5;
                        length = length;
                        nVar = nVar;
                        str = null;
                        i11 = 2;
                    }
                    x0.o oVar6 = oVar4;
                    oVar6.p(false);
                    oVar6.p(true);
                }
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                ((Integer) obj2).getClass();
                m.a(rVar, (x0.o) obj, v.D(1));
                break;
            default:
                ((Integer) obj2).getClass();
                m.d(rVar, (x0.o) obj, v.D(1));
                break;
        }
        return a0Var;
    }

    public /* synthetic */ c(r rVar, int i10, int i11) {
        this.f26611a = i11;
        this.f26612b = rVar;
    }
}
