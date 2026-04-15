package q;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c1 extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e1 f17258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g2.g1 f17259d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1(e1 e1Var, g2.g1 g1Var, int i10) {
        super(1);
        this.f17257b = i10;
        this.f17258c = e1Var;
        this.f17259d = g1Var;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        long jD;
        g2.c0 c0VarD;
        switch (this.f17257b) {
            case 0:
                g2.f1 f1Var = (g2.f1) obj;
                g2.c0 c0VarD2 = f1Var.d();
                if (c0VarD2 != null) {
                    e1.B0(this.f17258c, c0VarD2);
                }
                f1Var.h(this.f17259d, 0, 0, 0.0f);
                return ub.a0.f21526a;
            default:
                g2.f1 f1Var2 = (g2.f1) obj;
                e1 e1Var = this.f17258c;
                if (e1Var.f17283o.g().c() != null) {
                    x xVarF = e1Var.f17283o.f();
                    p1.c cVarA = e1Var.f17283o.g().a();
                    jc.l.b(cVarA);
                    p1.c cVarC = e1Var.f17283o.g().c();
                    jc.l.b(cVarC);
                    xVarF.a(cVarA, cVarC);
                }
                p1.c cVarC2 = e1Var.f17283o.f().c();
                g2.c0 c0VarD3 = f1Var2.d();
                p1.b bVar = null;
                if (c0VarD3 != null) {
                    g2.c0 c0Var = e1Var.f17283o.g().f17303b.f17419g;
                    if (c0Var == null) {
                        jc.l.k("root");
                        throw null;
                    }
                    bVar = new p1.b(c0Var.o(c0VarD3, 0L));
                }
                if (cVarC2 != null) {
                    if (e1Var.f17283o.f().b()) {
                        e1Var.f17283o.g().f17306e.setValue(cVarC2);
                    }
                    jD = cVarC2.d();
                } else {
                    if (e1Var.f17283o.f().b() && (c0VarD = f1Var2.d()) != null) {
                        e1.B0(e1Var, c0VarD);
                    }
                    p1.c cVarA2 = e1Var.f17283o.g().a();
                    jc.l.b(cVarA2);
                    jD = cVarA2.d();
                }
                long jH = bVar != null ? p1.b.h(jD, bVar.f16481a) : 0L;
                f1Var2.h(this.f17259d, Math.round(Float.intBitsToFloat((int) (jH >> 32))), Math.round(Float.intBitsToFloat((int) (4294967295L & jH))), 0.0f);
                return ub.a0.f21526a;
        }
    }
}
