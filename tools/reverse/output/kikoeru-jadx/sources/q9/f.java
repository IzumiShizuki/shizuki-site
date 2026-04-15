package q9;

import com.cnl.kikoeru.R;
import l0.u0;
import m0.z8;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements ic.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bg.p f17995b;

    public /* synthetic */ f(bg.p pVar, int i10) {
        this.f17994a = i10;
        this.f17995b = pVar;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        String strG;
        int i10 = this.f17994a;
        ub.a0 a0Var = ub.a0.f21526a;
        bg.p pVar = this.f17995b;
        int i11 = 3;
        switch (i10) {
            case 0:
                x0.o oVar = (x0.o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    oVar.Q();
                } else {
                    if (pVar == null || (strG = na.o.a(pVar)) == null) {
                        strG = na.q.g(R.string.main_favorite);
                    }
                    z8.b(strG, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar, 0, 0, 131070);
                }
                break;
            case 1:
                x0.o oVar2 = (x0.o) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!oVar2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    oVar2.Q();
                } else {
                    z8.b(pVar.f2937a.length() == 0 ? na.q.g(R.string.create_playlist) : na.q.g(R.string.edit_playlist), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar2, 0, 0, 131070);
                }
                break;
            case 2:
                x0.o oVar3 = (x0.o) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!oVar3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    oVar3.Q();
                } else {
                    u0.b(null, f1.g.f(979277560, new f(pVar, i11), oVar3), oVar3, 48, 1);
                }
                break;
            default:
                x0.o oVar4 = (x0.o) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (!oVar4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    oVar4.Q();
                } else {
                    z8.b(na.q.h(R.string.playlist_info, pVar.f2937a, pVar.f2942f, pVar.f2943g, pVar.f2938b, ((String[]) na.o.f15732e.getValue())[pVar.f2939c], pVar.f2940d, Integer.valueOf(pVar.f2941e), pVar.f2944h, pVar.f2945i, Integer.valueOf(pVar.f2946j)), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar4, 0, 0, 131070);
                }
                break;
        }
        return a0Var;
    }
}
