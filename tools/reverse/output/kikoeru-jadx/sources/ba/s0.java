package ba;

import bg.a2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s0 implements ic.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.w0 f2470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0.w0 f2471c;

    public /* synthetic */ s0(x0.w0 w0Var, x0.w0 w0Var2, int i10) {
        this.f2469a = 2;
        this.f2470b = w0Var;
        this.f2471c = w0Var2;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        int i10 = this.f2469a;
        ub.a0 a0Var = ub.a0.f21526a;
        x0.w0 w0Var = this.f2471c;
        x0.w0 w0Var2 = this.f2470b;
        switch (i10) {
            case 0:
                a2 a2Var = (a2) obj;
                jc.l.e(a2Var, "work");
                jc.l.e((String) obj2, "<unused var>");
                w0Var.setValue(Long.valueOf(a2Var.f2823f));
                w0Var2.setValue(Boolean.TRUE);
                break;
            case 1:
                x0.o oVar = (x0.o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!oVar.N(1 & iIntValue, (iIntValue & 3) != 2)) {
                    oVar.Q();
                } else {
                    w1.f fVarB = n7.d.f15441c;
                    if (fVarB == null) {
                        w1.e eVar = new w1.e("Filled.Close", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i11 = w1.g0.f23208a;
                        q1.n0 n0Var = new q1.n0(q1.q.f17569b);
                        hd.q0 q0Var = new hd.q0((byte) 0, 6);
                        q0Var.u(19.0f, 6.41f);
                        q0Var.s(17.59f, 5.0f);
                        q0Var.s(12.0f, 10.59f);
                        q0Var.s(6.41f, 5.0f);
                        q0Var.s(5.0f, 6.41f);
                        q0Var.s(10.59f, 12.0f);
                        q0Var.s(5.0f, 17.59f);
                        q0Var.s(6.41f, 19.0f);
                        q0Var.s(12.0f, 13.41f);
                        q0Var.s(17.59f, 19.0f);
                        q0Var.s(19.0f, 17.59f);
                        q0Var.s(13.41f, 12.0f);
                        q0Var.l();
                        w1.e.a(eVar, q0Var.f8447b, 0, n0Var);
                        fVarB = eVar.b();
                        n7.d.f15441c = fVarB;
                    }
                    boolean zF = oVar.f(w0Var2) | oVar.f(w0Var);
                    Object objK = oVar.K();
                    if (zF || objK == x0.k.f24334a) {
                        objK = new fa.c(w0Var, w0Var2, 3);
                        oVar.h0(objK);
                    }
                    na.c.b(fVarB, (ic.a) objK, oVar, 0);
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                la.l.n(w0Var2, w0Var, (x0.o) obj, x0.v.D(1));
                break;
            default:
                a2 a2Var2 = (a2) obj;
                jc.l.e(a2Var2, "work");
                jc.l.e((String) obj2, "<unused var>");
                w0Var.setValue(Long.valueOf(a2Var2.f2823f));
                w0Var2.setValue(Boolean.TRUE);
                break;
        }
        return a0Var;
    }

    public /* synthetic */ s0(x0.w0 w0Var, x0.w0 w0Var2, int i10, byte b10) {
        this.f2469a = i10;
        this.f2470b = w0Var;
        this.f2471c = w0Var2;
    }
}
