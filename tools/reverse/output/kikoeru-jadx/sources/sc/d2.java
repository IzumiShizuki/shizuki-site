package sc;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final be.b f19789a;

    static {
        be.c cVar = new be.c("java.lang.Void");
        f19789a = new be.b(cVar.b(), cVar.f2744a.g());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static m a(yc.t tVar) {
        String strG = g8.a.G(tVar);
        if (strG == null) {
            if (tVar instanceof bd.q0) {
                String strB = ie.d.k(tVar).getName().b();
                jc.l.d(strB, "asString(...)");
                strG = ld.v.a(strB);
            } else if (tVar instanceof bd.r0) {
                String strB2 = ie.d.k(tVar).getName().b();
                jc.l.d(strB2, "asString(...)");
                strG = ld.v.b(strB2);
            } else {
                strG = ((bd.p) tVar).getName().b();
                jc.l.d(strG, "asString(...)");
            }
        }
        return new m(new ae.e(strG, ua.l.J(tVar, 1)));
    }

    public static n7.e b(yc.k0 k0Var) {
        jc.l.e(k0Var, "possiblyOverriddenProperty");
        yc.k0 k0VarA = ((yc.k0) ee.e.s(k0Var)).a();
        jc.l.d(k0VarA, "getOriginal(...)");
        if (k0VarA instanceof qe.q) {
            qe.q qVar = (qe.q) k0VarA;
            wd.j0 j0Var = qVar.A;
            ce.o oVar = zd.j.f26806d;
            jc.l.d(oVar, "propertySignature");
            zd.d dVar = (zd.d) vb.w.m(j0Var, oVar);
            if (dVar != null) {
                return new p(k0VarA, j0Var, dVar, qVar.B, qVar.C);
            }
        } else if (k0VarA instanceof nd.f) {
            nd.f fVar = (nd.f) k0VarA;
            yc.m0 m0VarM = fVar.m();
            dd.g gVar = m0VarM instanceof dd.g ? (dd.g) m0VarM : null;
            ed.s sVar = gVar != null ? gVar.f5873a : null;
            if (sVar instanceof ed.u) {
                return new n(((ed.u) sVar).f6514a);
            }
            if (!(sVar instanceof ed.x)) {
                throw new hc.a("Incorrect resolution sequence for Java field " + k0VarA + " (source = " + sVar + ')');
            }
            Method method = ((ed.x) sVar).f6516a;
            bd.r0 r0Var = fVar.f2656x;
            yc.m0 m0VarM2 = r0Var != null ? r0Var.m() : null;
            dd.g gVar2 = m0VarM2 instanceof dd.g ? (dd.g) m0VarM2 : null;
            ed.s sVar2 = gVar2 != null ? gVar2.f5873a : null;
            ed.x xVar = sVar2 instanceof ed.x ? (ed.x) sVar2 : null;
            return new o(method, xVar != null ? xVar.f6516a : null);
        }
        bd.q0 q0VarD = k0VarA.d();
        jc.l.b(q0VarD);
        m mVarA = a(q0VarD);
        bd.r0 r0VarE = k0VarA.e();
        return new q(mVarA, r0VarE != null ? a(r0VarE) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static n7.d c(yc.t tVar) {
        Method method;
        jc.l.e(tVar, "possiblySubstitutedFunction");
        yc.t tVarA = ((yc.t) ee.e.s(tVar)).a();
        jc.l.d(tVarA, "getOriginal(...)");
        if (!(tVarA instanceof qe.b)) {
            if (tVarA instanceof nd.e) {
                yc.m0 m0VarM = ((nd.e) tVarA).m();
                dd.g gVar = m0VarM instanceof dd.g ? (dd.g) m0VarM : null;
                ed.s sVar = gVar != null ? gVar.f5873a : null;
                ed.x xVar = sVar instanceof ed.x ? (ed.x) sVar : null;
                if (xVar != null && (method = xVar.f6516a) != null) {
                    return new k(method);
                }
                throw new hc.a("Incorrect resolution sequence for Java method " + tVarA);
            }
            if (!(tVarA instanceof nd.b)) {
                bd.p pVar = (bd.p) tVarA;
                if ((pVar.getName().equals(vc.o.f22900c) && ee.m.n(tVarA)) || ((pVar.getName().equals(vc.o.f22898a) && ee.m.n(tVarA)) || (jc.l.a(pVar.getName(), xc.a.f24900e) && tVarA.o0().isEmpty()))) {
                    return a(tVarA);
                }
                throw new hc.a("Unknown origin of " + tVarA + " (" + tVarA.getClass() + ')');
            }
            yc.m0 m0VarM2 = ((nd.b) tVarA).m();
            dd.g gVar2 = m0VarM2 instanceof dd.g ? (dd.g) m0VarM2 : null;
            Object obj = gVar2 != null ? gVar2.f5873a : null;
            if (obj instanceof ed.r) {
                return new j(((ed.r) obj).f6512a);
            }
            if (obj instanceof ed.o) {
                Class cls = ((ed.o) obj).f6508a;
                if (cls.isAnnotation()) {
                    return new i(cls);
                }
            }
            throw new hc.a("Incorrect resolution sequence for Java constructor " + tVarA + " (" + obj + ')');
        }
        qe.k kVar = (qe.k) tVarA;
        ce.b bVarX = kVar.X();
        if (bVarX instanceof wd.b0) {
            ce.i iVar = ae.g.f324a;
            ae.e eVarC = ae.g.c((wd.b0) bVarX, kVar.p0(), kVar.l0());
            if (eVarC != null) {
                return new m(eVarC);
            }
        }
        if (bVarX instanceof wd.n) {
            ce.i iVar2 = ae.g.f324a;
            ae.e eVarA = ae.g.a((wd.n) bVarX, kVar.p0(), kVar.l0());
            if (eVarA != null) {
                String str = eVarA.f318e;
                String str2 = eVarA.f319f;
                yc.k kVarY = tVar.y();
                jc.l.d(kVarY, "getContainingDeclaration(...)");
                if (ee.g.b(kVarY)) {
                    return new m(eVarA);
                }
                yc.k kVarY2 = tVar.y();
                jc.l.d(kVarY2, "getContainingDeclaration(...)");
                if (!ee.g.c(kVarY2)) {
                    return new l(eVarA);
                }
                yc.j jVar = (yc.j) tVar;
                if (jVar.U()) {
                    if (!jc.l.a(str, "constructor-impl") || !ef.u.c0(str2, ")V", false)) {
                        throw new IllegalArgumentException(("Invalid signature: " + eVarA).toString());
                    }
                } else {
                    if (!jc.l.a(str, "constructor-impl")) {
                        throw new IllegalArgumentException(("Invalid signature: " + eVarA).toString());
                    }
                    yc.e eVarV = jVar.V();
                    jc.l.d(eVarV, "getConstructedClass(...)");
                    be.b bVarF = ie.d.f(eVarV);
                    jc.l.b(bVarF);
                    String strB = ae.b.b(bVarF.b());
                    if (ef.u.c0(str2, ")V", false)) {
                        String str3 = ef.n.G0(str2, "V") + strB;
                        jc.l.e(str, "name");
                        jc.l.e(str3, "desc");
                        eVarA = new ae.e(str, str3);
                    } else if (!ef.u.c0(str2, strB, false)) {
                        throw new IllegalArgumentException(("Invalid signature: " + eVarA).toString());
                    }
                }
                return new m(eVarA);
            }
        }
        return a(tVarA);
    }
}
