package fa;

import android.view.autofill.AutofillManager;
import e7.a0;
import hf.y;
import i2.j0;
import j9.d0;
import java.util.List;
import m0.b0;
import w1.i0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s extends jc.m implements ic.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7037d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(int i10, Object obj, Object obj2) {
        super(4);
        this.f7035b = i10;
        this.f7036c = obj;
        this.f7037d = obj2;
    }

    @Override // ic.p
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        int i10;
        int i11;
        switch (this.f7035b) {
            case 0:
                a0.d dVar = (a0.d) obj;
                int iIntValue = ((Number) obj2).intValue();
                x0.o oVar = (x0.o) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                y yVar = (y) this.f7037d;
                j9.u uVar = j9.u.f10753a;
                if ((iIntValue2 & 6) == 0) {
                    i10 = (oVar.f(dVar) ? 4 : 2) | iIntValue2;
                } else {
                    i10 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i10 |= oVar.d(iIntValue) ? 32 : 16;
                }
                if (oVar.N(i10 & 1, (i10 & 147) != 146)) {
                    j9.f fVar = (j9.f) ((List) this.f7036c).get(iIntValue);
                    oVar.W(200759555);
                    boolean zH = ((((i10 & 112) ^ 48) > 32 && oVar.d(iIntValue)) || (i10 & 48) == 32) | oVar.h(uVar) | oVar.h(yVar) | oVar.h(fVar);
                    Object objK = oVar.K();
                    if (zH || objK == x0.k.f24334a) {
                        objK = new q(yVar, iIntValue, fVar);
                        oVar.h0(objK);
                    }
                    b0.b((ic.a) objK, null, fVar.f10690d != d0.f10676c, null, f1.g.f(1704272769, new r(fVar, iIntValue), oVar), oVar, 196608, 26);
                    oVar.p(false);
                } else {
                    oVar.Q();
                }
                break;
            case 1:
                int iIntValue3 = ((Number) obj).intValue();
                int iIntValue4 = ((Number) obj2).intValue();
                int iIntValue5 = ((Number) obj3).intValue();
                int iIntValue6 = ((Number) obj4).intValue();
                k1.b bVar = (k1.b) this.f7036c;
                bVar.f10988f.set(iIntValue3, iIntValue4, iIntValue5, iIntValue6);
                ((AutofillManager) bVar.f10983a.f9258a).requestAutofill(bVar.f10985c, ((j0) this.f7037d).f8743b, bVar.f10988f);
                break;
            default:
                a0.d dVar2 = (a0.d) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x0.o oVar2 = (x0.o) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                a0 a0Var = (a0) this.f7037d;
                if ((iIntValue8 & 6) == 0) {
                    i11 = (oVar2.f(dVar2) ? 4 : 2) | iIntValue8;
                } else {
                    i11 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i11 |= oVar2.d(iIntValue7) ? 32 : 16;
                }
                if (oVar2.N(i11 & 1, (i11 & 147) != 146)) {
                    r9.c cVar = (r9.c) ((List) this.f7036c).get(iIntValue7);
                    oVar2.W(-1535305694);
                    String str = cVar.f18964a;
                    String str2 = cVar.f18965b;
                    i0 i0VarC = w1.b.c(cVar.f18966c, oVar2);
                    boolean zH2 = oVar2.h(a0Var) | oVar2.f(str);
                    Object objK2 = oVar2.K();
                    if (zH2 || objK2 == x0.k.f24334a) {
                        objK2 = new bd.i(12, a0Var, str, false);
                        oVar2.h0(objK2);
                    }
                    ka.b.g(null, i0VarC, 0L, str2, null, (ic.a) objK2, oVar2, 64, 21);
                    oVar2.p(false);
                } else {
                    oVar2.Q();
                }
                break;
        }
        return ub.a0.f21526a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(List list, y yVar) {
        super(4);
        this.f7035b = 0;
        j9.u uVar = j9.u.f10753a;
        this.f7036c = list;
        this.f7037d = yVar;
    }
}
