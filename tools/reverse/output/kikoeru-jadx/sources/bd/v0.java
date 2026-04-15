package bd;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends z implements u0 {
    public static final k0 G;
    public final re.o D;
    public final yc.p0 E;
    public l F;

    static {
        jc.z.f10839a.g(new jc.s(v0.class, "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;", 0));
        G = new k0();
    }

    public v0(re.o oVar, yc.p0 p0Var, l lVar, u0 u0Var, zc.h hVar, int i10, yc.m0 m0Var) {
        super(i10, be.g.f2759e, p0Var, u0Var, m0Var, hVar);
        this.D = oVar;
        this.E = p0Var;
        i iVar = new i(2, this, lVar, false);
        re.l lVar2 = (re.l) oVar;
        lVar2.getClass();
        new re.h(lVar2, iVar);
        this.F = lVar;
    }

    @Override // bd.z, yc.c
    public final yc.c F0(yc.e eVar, yc.x xVar, ld.o oVar) {
        jc.l.e(eVar, "newOwner");
        jc.l.e(oVar, "visibility");
        j2.h0.q(2, "kind");
        y yVarJ1 = J1(se.r0.f19980b);
        yVarJ1.f2686b = eVar;
        yVarJ1.f2687c = xVar;
        yVarJ1.f2688d = oVar;
        yVarJ1.f2690f = 2;
        yVarJ1.f2697m = false;
        zc.a aVarG1 = yVarJ1.f2708x.G1(yVarJ1);
        jc.l.c(aVarG1, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (u0) aVarG1;
    }

    @Override // bd.z
    public final z F1(int i10, be.e eVar, yc.k kVar, yc.t tVar, yc.m0 m0Var, zc.h hVar) {
        jc.l.e(kVar, "newOwner");
        j2.h0.q(i10, "kind");
        jc.l.e(hVar, "annotations");
        if (i10 != 1) {
        }
        return new v0(this.D, this.E, this.F, this, hVar, 1, m0Var);
    }

    @Override // bd.z, bd.q, bd.p, yc.k, yc.b
    /* JADX INFO: renamed from: O1, reason: merged with bridge method [inline-methods] */
    public final u0 a() {
        yc.t tVarA = super.a();
        jc.l.c(tVarA, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (u0) tVarA;
    }

    @Override // bd.z, yc.t, yc.o0
    /* JADX INFO: renamed from: P1, reason: merged with bridge method [inline-methods] */
    public final v0 h(se.r0 r0Var) {
        jc.l.e(r0Var, "substitutor");
        yc.t tVarH = super.h(r0Var);
        jc.l.c(tVarH, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl");
        v0 v0Var = (v0) tVarH;
        se.w wVar = v0Var.f2717g;
        jc.l.b(wVar);
        l lVarH = this.F.C1().h(se.r0.d(wVar));
        if (lVarH == null) {
            return null;
        }
        v0Var.F = lVarH;
        return v0Var;
    }

    @Override // yc.j
    public final boolean U() {
        return this.F.D;
    }

    @Override // yc.j
    public final yc.e V() {
        yc.e eVarV = this.F.V();
        jc.l.d(eVarV, "getConstructedClass(...)");
        return eVarV;
    }

    @Override // bd.z, yc.b
    public final se.w n() {
        se.w wVar = this.f2717g;
        jc.l.b(wVar);
        return wVar;
    }

    @Override // bd.q, yc.k
    public final yc.i y() {
        return this.E;
    }

    @Override // bd.q, yc.k
    public final yc.k y() {
        return this.E;
    }
}
