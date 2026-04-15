package l0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class z extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s0 f11666c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(s0 s0Var, int i10) {
        super(1);
        this.f11665b = i10;
        this.f11666c = s0Var;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        q qVar;
        q qVar2;
        boolean z10;
        switch (this.f11665b) {
            case 0:
                return new b0.h0(12, this.f11666c);
            case 1:
                long jLongValue = ((Number) obj).longValue();
                s0 s0Var = this.f11666c;
                if (s0Var.f11611a.a().b(jLongValue)) {
                    s0Var.n();
                    s0Var.p();
                }
                return ub.a0.f21526a;
            case 2:
                long jLongValue2 = ((Number) obj).longValue();
                s0 s0Var2 = this.f11666c;
                if (s0Var2.f11611a.a().b(jLongValue2)) {
                    s0Var2.i();
                    s0Var2.m(null);
                }
                return ub.a0.f21526a;
            case 3:
                long jLongValue3 = ((Number) obj).longValue();
                s0 s0Var3 = this.f11666c;
                r rVarE = s0Var3.e();
                if (rVarE != null && (qVar2 = rVarE.f11602a) != null && jLongValue3 == qVar2.f11598c) {
                    s0Var3.f11624n.setValue(null);
                }
                r rVarE2 = s0Var3.e();
                if (rVarE2 != null && (qVar = rVarE2.f11603b) != null && jLongValue3 == qVar.f11598c) {
                    s0Var3.f11625o.setValue(null);
                }
                if (s0Var3.f11611a.a().b(jLongValue3)) {
                    s0Var3.p();
                }
                return ub.a0.f21526a;
            case 4:
                g2.c0 c0Var = (g2.c0) obj;
                s0 s0Var4 = this.f11666c;
                s0Var4.f11621k = c0Var;
                if (((Boolean) s0Var4.f11619i.getValue()).booleanValue() && s0Var4.e() != null) {
                    p1.b bVar = c0Var != null ? new p1.b(c0Var.c(0L)) : null;
                    if (!jc.l.a(s0Var4.f11620j, bVar)) {
                        s0Var4.f11620j = bVar;
                        s0Var4.n();
                        s0Var4.p();
                    }
                }
                return ub.a0.f21526a;
            case 5:
                o1.u uVar = (o1.u) obj;
                s0 s0Var5 = this.f11666c;
                x0.e1 e1Var = s0Var5.f11619i;
                if (!uVar.a() && ((Boolean) e1Var.getValue()).booleanValue()) {
                    s0Var5.i();
                }
                e1Var.setValue(Boolean.valueOf(uVar.a()));
                return ub.a0.f21526a;
            case 6:
                this.f11666c.l(((Boolean) obj).booleanValue());
                return ub.a0.f21526a;
            case 7:
                if (h0.q0.f7813a.a(((a2.b) obj).f188a) == h0.m0.COPY) {
                    this.f11666c.b();
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                this.f11666c.m((r) obj);
                return ub.a0.f21526a;
        }
    }
}
