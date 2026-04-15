package y;

import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class v1 extends jc.m implements ic.o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25273b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v1(int i10, int i11) {
        super(i10);
        this.f25273b = i11;
    }

    @Override // ic.o
    public final Object g(Object obj, Object obj2, Object obj3) {
        int i10 = this.f25273b;
        x0.r0 r0Var = x0.k.f24334a;
        switch (i10) {
            case 0:
                x0.o oVar = (x0.o) obj2;
                ((Number) obj3).intValue();
                oVar.W(359872873);
                WeakHashMap weakHashMap = s1.f25236u;
                s1 s1VarF = o0.f(oVar);
                boolean zF = oVar.f(s1VarF);
                Object objK = oVar.K();
                if (zF || objK == r0Var) {
                    objK = new s0(s1VarF.f25239c);
                    oVar.h0(objK);
                }
                s0 s0Var = (s0) objK;
                oVar.p(false);
                return s0Var;
            case 1:
                x0.o oVar2 = (x0.o) obj2;
                ((Number) obj3).intValue();
                oVar2.W(359872873);
                WeakHashMap weakHashMap2 = s1.f25236u;
                s1 s1VarF2 = o0.f(oVar2);
                boolean zF2 = oVar2.f(s1VarF2);
                Object objK2 = oVar2.K();
                if (zF2 || objK2 == r0Var) {
                    objK2 = new s0(s1VarF2.f25241e);
                    oVar2.h0(objK2);
                }
                s0 s0Var2 = (s0) objK2;
                oVar2.p(false);
                return s0Var2;
            default:
                x0.o oVar3 = (x0.o) obj2;
                ((Number) obj3).intValue();
                oVar3.W(359872873);
                WeakHashMap weakHashMap3 = s1.f25236u;
                s1 s1VarF3 = o0.f(oVar3);
                boolean zF3 = oVar3.f(s1VarF3);
                Object objK3 = oVar3.K();
                if (zF3 || objK3 == r0Var) {
                    objK3 = new s0(s1VarF3.f25242f);
                    oVar3.h0(objK3);
                }
                s0 s0Var3 = (s0) objK3;
                oVar3.p(false);
                return s0Var3;
        }
    }
}
