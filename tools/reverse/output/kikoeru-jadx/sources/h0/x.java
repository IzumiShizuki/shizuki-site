package h0;

import j2.u2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class x extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u0 f7929c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(u0 u0Var, int i10) {
        super(1);
        this.f7928b = i10;
        this.f7929c = u0Var;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        ic.k kVar;
        ub.a0 a0Var;
        u2 u2Var;
        switch (this.f7928b) {
            case 0:
                g2.c0 c0Var = (g2.c0) obj;
                r1 r1VarD = this.f7929c.d();
                if (r1VarD != null) {
                    r1VarD.f7829c = c0Var;
                }
                return ub.a0.f21526a;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                this.f7929c.f7873q.setValue(bool);
                return ub.a0.f21526a;
            case 2:
                int i10 = ((y2.i) obj).f25408a;
                r0 r0Var = this.f7929c.f7874r;
                r0Var.getClass();
                if (i10 == 7) {
                    kVar = r0Var.a().f7831a;
                } else {
                    if (i10 == 2 || i10 == 6 || i10 == 5) {
                        r0Var.a();
                    } else if (i10 == 3) {
                        kVar = r0Var.a().f7832b;
                    } else if (i10 == 4) {
                        r0Var.a();
                    } else if (i10 != 1 && i10 != 0) {
                        throw new IllegalStateException("invalid ImeAction");
                    }
                    kVar = null;
                }
                ub.a0 a0Var2 = ub.a0.f21526a;
                if (kVar != null) {
                    kVar.a(r0Var);
                    a0Var = a0Var2;
                } else {
                    a0Var = null;
                }
                if (a0Var == null) {
                    if (i10 == 6) {
                        o1.i iVar = r0Var.f7826c;
                        if (iVar == null) {
                            jc.l.k("focusManager");
                            throw null;
                        }
                        ((o1.k) iVar).f(1);
                    } else if (i10 == 5) {
                        o1.i iVar2 = r0Var.f7826c;
                        if (iVar2 == null) {
                            jc.l.k("focusManager");
                            throw null;
                        }
                        ((o1.k) iVar2).f(2);
                    } else if (i10 == 7 && (u2Var = r0Var.f7824a) != null) {
                        ((j2.n1) u2Var).a();
                    }
                }
                return a0Var2;
            default:
                y2.y yVar = (y2.y) obj;
                String str = yVar.f25434a.f20320b;
                u0 u0Var = this.f7929c;
                x0.e1 e1Var = u0Var.f7876t;
                t2.g gVar = u0Var.f7866j;
                if (!jc.l.a(str, gVar != null ? gVar.f20320b : null)) {
                    u0Var.f7867k.setValue(i0.f7679a);
                    if (((Boolean) e1Var.getValue()).booleanValue()) {
                        e1Var.setValue(Boolean.FALSE);
                    } else {
                        u0Var.f7875s.setValue(Boolean.FALSE);
                    }
                }
                long j10 = t2.k0.f20356b;
                u0Var.f(j10);
                u0Var.e(j10);
                u0Var.f7877u.a(yVar);
                u0Var.f7858b.c();
                return ub.a0.f21526a;
        }
    }
}
