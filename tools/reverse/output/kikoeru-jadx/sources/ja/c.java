package ja;

import hd.q0;
import ic.n;
import j2.h0;
import m0.r3;
import q1.n0;
import q1.q;
import ub.a0;
import w1.f;
import w1.g0;
import x0.o;
import x0.v;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10796a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f10797b;

    public /* synthetic */ c(int i10, boolean z10) {
        this.f10797b = z10;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        f fVarT;
        int i10 = this.f10796a;
        a0 a0Var = a0.f21526a;
        boolean z10 = this.f10797b;
        switch (i10) {
            case 0:
                ((Integer) obj2).getClass();
                d.a(z10, (o) obj, v.D(49));
                break;
            default:
                o oVar = (o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    oVar.Q();
                } else {
                    if (z10) {
                        fVarT = nh.b.f15906m;
                        if (fVarT == null) {
                            w1.e eVar = new w1.e("Filled.Visibility", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            int i11 = g0.f23208a;
                            n0 n0Var = new n0(q.f17569b);
                            q0 q0VarH = h0.h(12.0f, 4.5f);
                            q0VarH.m(7.0f, 4.5f, 2.73f, 7.61f, 1.0f, 12.0f);
                            q0VarH.n(1.73f, 4.39f, 6.0f, 7.5f, 11.0f, 7.5f);
                            q0VarH.w(9.27f, -3.11f, 11.0f, -7.5f);
                            q0VarH.n(-1.73f, -4.39f, -6.0f, -7.5f, -11.0f, -7.5f);
                            q0VarH.l();
                            q0VarH.u(12.0f, 17.0f);
                            q0VarH.n(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
                            q0VarH.w(2.24f, -5.0f, 5.0f, -5.0f);
                            q0VarH.w(5.0f, 2.24f, 5.0f, 5.0f);
                            q0VarH.w(-2.24f, 5.0f, -5.0f, 5.0f);
                            q0VarH.l();
                            q0VarH.u(12.0f, 9.0f);
                            q0VarH.n(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
                            q0VarH.w(1.34f, 3.0f, 3.0f, 3.0f);
                            q0VarH.w(3.0f, -1.34f, 3.0f, -3.0f);
                            q0VarH.w(-1.34f, -3.0f, -3.0f, -3.0f);
                            q0VarH.l();
                            w1.e.a(eVar, q0VarH.f8447b, 0, n0Var);
                            fVarT = eVar.b();
                            nh.b.f15906m = fVarT;
                        }
                    } else {
                        fVarT = n7.d.t();
                    }
                    r3.b(fVarT, null, null, 0L, oVar, 48, 12);
                }
                break;
        }
        return a0Var;
    }

    public /* synthetic */ c(boolean z10) {
        this.f10797b = z10;
    }
}
