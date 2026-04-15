package a9;

import com.cnl.kikoeru.R;
import e7.a0;
import hd.q0;
import jc.y;
import jc.z;
import m0.b1;
import m0.c1;
import m0.j1;
import q.m1;
import q1.n0;
import w1.g0;
import w1.i0;
import x0.n1;
import x0.r0;
import x0.v;
import x0.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements ic.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f256b;

    public /* synthetic */ q(a0 a0Var, int i10) {
        this.f255a = i10;
        this.f256b = a0Var;
    }

    @Override // ic.o
    public final Object g(Object obj, Object obj2, Object obj3) {
        int i10 = this.f255a;
        ub.a0 a0Var = ub.a0.f21526a;
        r0 r0Var = x0.k.f24334a;
        a0 a0Var2 = this.f256b;
        switch (i10) {
            case 0:
                m1 fVar = (m1) obj;
                x0.o oVar = (x0.o) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                jc.l.e(fVar, "$this$SharedTransitionLayout");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= oVar.f(fVar) ? 4 : 2;
                }
                if (!oVar.N(iIntValue & 1, (iIntValue & 19) != 18)) {
                    oVar.Q();
                } else {
                    Boolean bool = Boolean.FALSE;
                    oVar.W(500600386);
                    hg.a aVarA = gg.c.a();
                    y yVar = new y();
                    oVar.W(1849434622);
                    Object objK = oVar.K();
                    if (objK == r0Var) {
                        objK = lc.b.G("sharedElementTranslation", bool, aVarA, true, z.a(Boolean.TYPE));
                        oVar.h0(objK);
                    }
                    fg.f fVar2 = (fg.f) objK;
                    oVar.p(false);
                    yVar.f10838a = fVar2;
                    v.c(fVar2, new t(yVar, 0), oVar);
                    fg.f fVar3 = (fg.f) yVar.f10838a;
                    oVar.p(false);
                    if (!((Boolean) fVar3.getValue()).booleanValue()) {
                        fVar = new f(fVar);
                    }
                    v.b(new n1[]{u.f265c.a(a0Var2), j1.f13125a.a(new q1.q(((b1) oVar.j(c1.f12773a)).c())), u.f263a.a(fVar)}, f1.g.f(1673786378, new r(0, a0Var2), oVar), oVar, 56);
                }
                break;
            default:
                x0.o oVar2 = (x0.o) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                jc.l.e((a0.d) obj, "$this$item");
                if (!oVar2.N(1 & iIntValue2, (iIntValue2 & 17) != 16)) {
                    oVar2.Q();
                } else {
                    Object objK2 = oVar2.K();
                    if (objK2 == r0Var) {
                        objK2 = v.m(oVar2);
                        oVar2.h0(objK2);
                    }
                    hf.y yVar2 = (hf.y) objK2;
                    Object objK3 = oVar2.K();
                    if (objK3 == r0Var) {
                        objK3 = v.v(null);
                        oVar2.h0(objK3);
                    }
                    w0 w0Var = (w0) objK3;
                    w1.f fVarB = nh.b.f15904k;
                    if (fVarB == null) {
                        w1.e eVar = new w1.e("Filled.Shuffle", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i11 = g0.f23208a;
                        n0 n0Var = new n0(q1.q.f17569b);
                        q0 q0Var = new q0((byte) 0, 6);
                        q0Var.u(10.59f, 9.17f);
                        q0Var.s(5.41f, 4.0f);
                        q0Var.s(4.0f, 5.41f);
                        q0Var.t(5.17f, 5.17f);
                        q0Var.t(1.42f, -1.41f);
                        q0Var.l();
                        q0Var.u(14.5f, 4.0f);
                        q0Var.t(2.04f, 2.04f);
                        q0Var.s(4.0f, 18.59f);
                        q0Var.s(5.41f, 20.0f);
                        q0Var.s(17.96f, 7.46f);
                        q0Var.s(20.0f, 9.5f);
                        q0Var.s(20.0f, 4.0f);
                        q0Var.r(-5.5f);
                        q0Var.l();
                        q0Var.u(14.83f, 13.41f);
                        q0Var.t(-1.41f, 1.41f);
                        q0Var.t(3.13f, 3.13f);
                        q0Var.s(14.5f, 20.0f);
                        q0Var.s(20.0f, 20.0f);
                        q0Var.z(-5.5f);
                        q0Var.t(-2.04f, 2.04f);
                        q0Var.t(-3.13f, -3.13f);
                        q0Var.l();
                        w1.e.a(eVar, q0Var.f8447b, 0, n0Var);
                        fVarB = eVar.b();
                        nh.b.f15904k = fVarB;
                    }
                    i0 i0VarC = w1.b.c(fVarB, oVar2);
                    String strG = na.q.g(R.string.random_asmr);
                    boolean zH = oVar2.h(yVar2) | oVar2.h(a0Var2);
                    Object objK4 = oVar2.K();
                    if (zH || objK4 == r0Var) {
                        objK4 = new ba.c((Object) yVar2, w0Var, (Object) a0Var2, 21);
                        oVar2.h0(objK4);
                    }
                    ka.b.g(null, i0VarC, 0L, strG, null, (ic.a) objK4, oVar2, 64, 21);
                }
                break;
        }
        return a0Var;
    }
}
