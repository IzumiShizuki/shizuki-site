package qe;

import bd.f0;
import java.util.List;
import se.a0;
import se.h0;
import se.k0;
import se.r0;
import se.u0;
import se.x0;
import wd.v0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s extends bd.h implements k {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final v0 f18214i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final yd.f f18215j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final f0 f18216k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final yd.i f18217l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j f18218m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public a0 f18219n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public a0 f18220o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public List f18221p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public a0 f18222q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(re.o oVar, yc.k kVar, zc.h hVar, be.e eVar, ld.o oVar2, v0 v0Var, yd.f fVar, f0 f0Var, yd.i iVar, j jVar) {
        super(oVar, kVar, hVar, eVar, oVar2);
        jc.l.e(oVar, "storageManager");
        jc.l.e(kVar, "containingDeclaration");
        jc.l.e(oVar2, "visibility");
        jc.l.e(v0Var, "proto");
        jc.l.e(fVar, "nameResolver");
        jc.l.e(f0Var, "typeTable");
        jc.l.e(iVar, "versionRequirementTable");
        this.f18214i = v0Var;
        this.f18215j = fVar;
        this.f18216k = f0Var;
        this.f18217l = iVar;
        this.f18218m = jVar;
    }

    public final yc.e D1() {
        if (se.c.l(E1())) {
            return null;
        }
        yc.h hVarH = E1().t().h();
        if (hVarH instanceof yc.e) {
            return (yc.e) hVarH;
        }
        return null;
    }

    @Override // yc.h
    public final a0 E() {
        a0 a0Var = this.f18222q;
        if (a0Var != null) {
            return a0Var;
        }
        jc.l.k("defaultTypeImpl");
        throw null;
    }

    public final a0 E1() {
        a0 a0Var = this.f18220o;
        if (a0Var != null) {
            return a0Var;
        }
        jc.l.k("expandedType");
        throw null;
    }

    public final a0 F1() {
        a0 a0Var = this.f18219n;
        if (a0Var != null) {
            return a0Var;
        }
        jc.l.k("underlyingType");
        throw null;
    }

    public final void G1(List list, a0 a0Var, a0 a0Var2) {
        le.o oVarN0;
        a0 a0VarX;
        jc.l.e(a0Var, "underlyingType");
        jc.l.e(a0Var2, "expandedType");
        this.f2573g = list;
        this.f18219n = a0Var;
        this.f18220o = a0Var2;
        this.f18221p = yc.v.c(this);
        yc.e eVarD1 = D1();
        if (eVarD1 == null || (oVarN0 = eVarD1.N0()) == null) {
            oVarN0 = le.n.f12335b;
        }
        le.o oVar = oVarN0;
        bd.f fVar = new bd.f();
        ue.i iVar = u0.f19993a;
        if (ue.l.f(this)) {
            a0VarX = ue.l.c(ue.k.UNABLE_TO_SUBSTITUTE_TYPE, toString());
        } else {
            k0 k0VarQ = Q();
            if (k0VarQ == null) {
                u0.a(12);
                throw null;
            }
            List listD = u0.d(((bd.g) k0VarQ).o());
            h0.f19950b.getClass();
            a0VarX = se.c.x(h0.f19951c, k0VarQ, listD, false, oVar, fVar);
        }
        this.f18222q = a0VarX;
    }

    @Override // qe.k
    public final ce.b X() {
        return this.f18214i;
    }

    @Override // yc.o0
    public final yc.l h(r0 r0Var) {
        jc.l.e(r0Var, "substitutor");
        if (r0Var.f19981a.e()) {
            return this;
        }
        yc.k kVarY = y();
        jc.l.d(kVarY, "getContainingDeclaration(...)");
        zc.h annotations = getAnnotations();
        jc.l.d(annotations, "<get-annotations>(...)");
        be.e name = getName();
        jc.l.d(name, "getName(...)");
        s sVar = new s(this.f2571e, kVarY, annotations, name, this.f2572f, this.f18214i, this.f18215j, this.f18216k, this.f18217l, this.f18218m);
        List listL = L();
        a0 a0VarF1 = F1();
        x0 x0Var = x0.INVARIANT;
        sVar.G1(listL, se.c.b(r0Var.g(a0VarF1, x0Var)), se.c.b(r0Var.g(E1(), x0Var)));
        return sVar;
    }

    @Override // qe.k
    public final f0 l0() {
        return this.f18216k;
    }

    @Override // qe.k
    public final yd.f p0() {
        return this.f18215j;
    }

    @Override // qe.k
    public final j q0() {
        return this.f18218m;
    }
}
