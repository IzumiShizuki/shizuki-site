package b0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p0 extends jc.m implements ic.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1326d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1327e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1328f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(ic.a aVar, j1.q qVar, z0 z0Var, ic.n nVar, int i10) {
        super(2);
        this.f1324b = 0;
        this.f1325c = aVar;
        this.f1326d = qVar;
        this.f1327e = z0Var;
        this.f1328f = nVar;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f1324b) {
            case 0:
                ((Number) obj2).intValue();
                g0.a((ic.a) this.f1325c, (j1.q) this.f1326d, (z0) this.f1327e, (ic.n) this.f1328f, (x0.o) obj, x0.v.D(1));
                break;
            case 1:
                float fFloatValue = ((Number) obj2).floatValue();
                jc.l.e((c2.t) obj, "<anonymous parameter 0>");
                jc.v vVar = (jc.v) this.f1325c;
                float f10 = vVar.f10835a + fFloatValue;
                vVar.f10835a = f10;
                ((cg.v) this.f1326d).H((300000 * (f10 / ((int) (((f3.l) ((x0.w0) this.f1328f).getValue()).f6666a >> 32)))) + ((jc.x) this.f1327e).f10837a);
                break;
            default:
                x0.o oVar = (x0.o) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    r.q1 q1Var = (r.q1) this.f1325c;
                    r.x xVar = (r.x) this.f1326d;
                    r.v1 v1Var = r.w1.f18620a;
                    Object objB1 = q1Var.f18539a.b1();
                    oVar.W(-438678252);
                    Object obj3 = this.f1327e;
                    float f11 = jc.l.a(objB1, obj3) ? 1.0f : 0.0f;
                    oVar.p(false);
                    Float fValueOf = Float.valueOf(f11);
                    Object value = q1Var.f18542d.getValue();
                    oVar.W(-438678252);
                    float f12 = jc.l.a(value, obj3) ? 1.0f : 0.0f;
                    oVar.p(false);
                    Float fValueOf2 = Float.valueOf(f12);
                    q1Var.f();
                    oVar.W(438406499);
                    oVar.p(false);
                    r.m1 m1VarD = r.t1.d(q1Var, fValueOf, fValueOf2, xVar, v1Var, oVar, 0);
                    boolean zF = oVar.f(m1VarD);
                    Object objK = oVar.K();
                    if (zF || objK == x0.k.f24334a) {
                        objK = new q.a0(1, m1VarD);
                        oVar.h0(objK);
                    }
                    j1.q qVarA = androidx.compose.ui.graphics.a.a(j1.n.f9689a, (ic.k) objK);
                    f1.f fVar = (f1.f) this.f1328f;
                    g2.v0 v0VarD = y.p.d(j1.c.f9662a, false);
                    int iQ = x0.v.q(oVar);
                    x0.j1 j1VarL = oVar.l();
                    j1.q qVarC = j1.a.c(qVarA, oVar);
                    i2.k.f8771g0.getClass();
                    i2.i iVar = i2.j.f8733b;
                    oVar.a0();
                    if (oVar.S) {
                        oVar.k(iVar);
                    } else {
                        oVar.k0();
                    }
                    x0.v.A(i2.j.f8738g, v0VarD, oVar);
                    x0.v.A(i2.j.f8737f, j1VarL, oVar);
                    i2.h hVar = i2.j.f8741j;
                    if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ))) {
                        j2.h0.s(iQ, oVar, iQ, hVar);
                    }
                    x0.v.A(i2.j.f8735d, qVarC, oVar);
                    fVar.g(obj3, oVar, 0);
                    oVar.p(true);
                } else {
                    oVar.Q();
                }
                break;
        }
        return ub.a0.f21526a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        super(2);
        this.f1324b = i10;
        this.f1325c = obj;
        this.f1326d = obj2;
        this.f1327e = obj3;
        this.f1328f = obj4;
    }
}
