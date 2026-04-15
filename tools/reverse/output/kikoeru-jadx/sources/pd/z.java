package pd;

import b0.w1;
import bd.y0;
import c7.e1;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import q.t0;
import se.s0;
import se.w0;
import yc.q0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class z extends le.p {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ pc.u[] f17092m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f17093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f17094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final re.c f17095d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final re.i f17096e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final re.e f17097f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final re.j f17098g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final re.e f17099h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final re.i f17100i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final re.i f17101j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final re.i f17102k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final re.e f17103l;

    static {
        jc.s sVar = new jc.s(z.class, "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;", 0);
        jc.a0 a0Var = jc.z.f10839a;
        f17092m = new pc.u[]{a0Var.g(sVar), t0.H(z.class, "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;", 0, a0Var), t0.H(z.class, "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;", 0, a0Var)};
    }

    public z(w1 w1Var, n nVar) {
        jc.l.e(w1Var, "c");
        this.f17093b = w1Var;
        this.f17094c = nVar;
        re.o oVar = ((od.a) w1Var.f1395c).f16315a;
        v vVar = new v(this, 0);
        re.l lVar = (re.l) oVar;
        lVar.getClass();
        this.f17095d = new re.c(lVar, vVar);
        v vVar2 = new v(this, 1);
        re.l lVar2 = (re.l) oVar;
        lVar2.getClass();
        this.f17096e = new re.i(lVar2, vVar2);
        this.f17097f = ((re.l) oVar).b(new x(this, 0));
        this.f17098g = ((re.l) oVar).c(new x(this, 1));
        this.f17099h = ((re.l) oVar).b(new x(this, 2));
        v vVar3 = new v(this, 2);
        re.l lVar3 = (re.l) oVar;
        lVar3.getClass();
        this.f17100i = new re.i(lVar3, vVar3);
        v vVar4 = new v(this, 3);
        re.l lVar4 = (re.l) oVar;
        lVar4.getClass();
        this.f17101j = new re.i(lVar4, vVar4);
        v vVar5 = new v(this, 4);
        re.l lVar5 = (re.l) oVar;
        lVar5.getClass();
        this.f17102k = new re.i(lVar5, vVar5);
        this.f17103l = ((re.l) oVar).b(new x(this, 3));
    }

    public static se.w l(ed.x xVar, w1 w1Var) {
        jc.l.e(xVar, "method");
        Class<?> declaringClass = ((Method) xVar.b()).getDeclaringClass();
        jc.l.d(declaringClass, "getDeclaringClass(...)");
        return ((e1) w1Var.f1397e).h0(xVar.f(), n7.e.F(s0.f19985b, declaringClass.isAnnotation(), null, 6));
    }

    public static k5.d u(w1 w1Var, bd.z zVar, List list) {
        ub.k kVar;
        se.w wVar;
        be.e eVar;
        be.e eVarE;
        e1 e1Var = (e1) w1Var.f1397e;
        od.a aVar = (od.a) w1Var.f1395c;
        yc.y yVar = aVar.f16329o;
        df.o oVarL0 = vb.m.L0(list);
        ArrayList arrayList = new ArrayList(vb.n.K(oVarL0, 10));
        Iterator it = oVarL0.iterator();
        boolean z10 = false;
        while (true) {
            df.b bVar = (df.b) it;
            if (!bVar.f5974b.hasNext()) {
                return new k5.d(vb.m.G0(arrayList), z10, 4);
            }
            vb.u uVar = (vb.u) bVar.next();
            int i10 = uVar.f22822a;
            ed.d0 d0Var = (ed.d0) uVar.f22823b;
            od.c cVarZ = n7.e.z(w1Var, d0Var);
            qd.a aVarF = n7.e.F(s0.f19985b, false, null, 7);
            boolean z11 = d0Var.f6494d;
            ed.b0 b0Var = d0Var.f6491a;
            if (z11) {
                ed.i iVar = b0Var instanceof ed.i ? (ed.i) b0Var : null;
                if (iVar == null) {
                    throw new AssertionError("Vararg parameter should be an array: " + d0Var);
                }
                w0 w0VarG0 = e1Var.g0(iVar, aVarF, true);
                kVar = new ub.k(w0VarG0, yVar.g().f(w0VarG0));
            } else {
                kVar = new ub.k(e1Var.h0(b0Var, aVarF), null);
            }
            se.w wVar2 = (se.w) kVar.f21543a;
            se.w wVar3 = (se.w) kVar.f21544b;
            if (jc.l.a(zVar.getName().b(), "equals") && list.size() == 1 && yVar.g().o().equals(wVar2)) {
                eVarE = be.e.e("other");
            } else {
                String str = d0Var.f6493c;
                be.e eVarD = str != null ? be.e.d(str) : null;
                if (eVarD == null) {
                    z10 = true;
                }
                if (eVarD == null) {
                    eVarE = be.e.e("p" + i10);
                } else {
                    wVar = wVar2;
                    eVar = eVarD;
                    arrayList.add(new y0(zVar, null, i10, cVarZ, eVar, wVar, false, false, false, wVar3, aVar.f16324j.c(d0Var)));
                }
            }
            wVar = wVar2;
            eVar = eVarE;
            arrayList.add(new y0(zVar, null, i10, cVarZ, eVar, wVar, false, false, false, wVar3, aVar.f16324j.c(d0Var)));
        }
    }

    @Override // le.p, le.o
    public Collection b(be.e eVar, gd.b bVar) {
        jc.l.e(eVar, "name");
        return !g().contains(eVar) ? vb.r.f22819a : (Collection) this.f17103l.a(eVar);
    }

    @Override // le.p, le.o
    public final Set c() {
        return (Set) n7.b0.r(this.f17100i, f17092m[0]);
    }

    @Override // le.p, le.o
    public final Set d() {
        return (Set) n7.b0.r(this.f17102k, f17092m[2]);
    }

    @Override // le.p, le.q
    public Collection e(le.f fVar, ic.k kVar) {
        jc.l.e(fVar, "kindFilter");
        return (Collection) this.f17095d.b();
    }

    @Override // le.p, le.o
    public Collection f(be.e eVar, gd.b bVar) {
        jc.l.e(eVar, "name");
        jc.l.e(bVar, "location");
        return !c().contains(eVar) ? vb.r.f22819a : (Collection) this.f17099h.a(eVar);
    }

    @Override // le.p, le.o
    public final Set g() {
        return (Set) n7.b0.r(this.f17101j, f17092m[1]);
    }

    public abstract Set h(le.f fVar, ic.k kVar);

    public abstract Set i(le.f fVar, le.l lVar);

    public void j(be.e eVar, ArrayList arrayList) {
        jc.l.e(eVar, "name");
    }

    public abstract c k();

    public abstract void m(LinkedHashSet linkedHashSet, be.e eVar);

    public abstract void n(be.e eVar, ArrayList arrayList);

    public abstract Set o(le.f fVar);

    public abstract bd.a0 p();

    public abstract yc.k q();

    public boolean r(nd.e eVar) {
        return true;
    }

    public abstract y s(ed.x xVar, ArrayList arrayList, se.w wVar, List list);

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, ub.h] */
    public final nd.e t(ed.x xVar) {
        jc.l.e(xVar, "method");
        w1 w1Var = this.f17093b;
        nd.e eVarS1 = nd.e.S1(q(), n7.e.z(w1Var, xVar), xVar.c(), ((od.a) w1Var.f1395c).f16324j.c(xVar), ((c) this.f17096e.b()).d(xVar.c()) != null && ((ArrayList) xVar.g()).isEmpty());
        jc.l.e(w1Var, "<this>");
        w1 w1Var2 = new w1((od.a) w1Var.f1395c, new h7.k(w1Var, eVarS1, xVar, 0), (ub.h) w1Var.f1394b);
        ArrayList typeParameters = xVar.getTypeParameters();
        ArrayList arrayList = new ArrayList(vb.n.K(typeParameters, 10));
        Iterator it = typeParameters.iterator();
        while (it.hasNext()) {
            q0 q0VarA = ((od.e) w1Var2.f1396d).a((ed.c0) it.next());
            jc.l.b(q0VarA);
            arrayList.add(q0VarA);
        }
        k5.d dVarU = u(w1Var2, eVarS1, xVar.g());
        y yVarS = s(xVar, arrayList, l(xVar, w1Var2), (List) dVarU.f11044c);
        List list = yVarS.f17091d;
        bd.a0 a0VarP = p();
        ArrayList arrayList2 = yVarS.f17090c;
        List list2 = yVarS.f17089b;
        se.w wVar = yVarS.f17088a;
        boolean zIsAbstract = Modifier.isAbstract(((Method) xVar.b()).getModifiers());
        boolean zIsFinal = Modifier.isFinal(((Method) xVar.b()).getModifiers());
        yc.x.f26154a.getClass();
        eVarS1.R1(null, a0VarP, vb.r.f22819a, arrayList2, list2, wVar, zIsAbstract ? yc.x.f26158e : !zIsFinal ? yc.x.f26157d : yc.x.f26155b, gh.g.Q(xVar.e()), vb.s.f22820a);
        eVarS1.T1(false, dVarU.f11043b);
        if (list.isEmpty()) {
            return eVarS1;
        }
        ((od.a) w1Var2.f1395c).f16319e.getClass();
        throw new UnsupportedOperationException("Should not be called");
    }

    public String toString() {
        return "Lazy scope for " + q();
    }
}
