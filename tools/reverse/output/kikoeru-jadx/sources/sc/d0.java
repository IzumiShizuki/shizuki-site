package sc;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends i0 implements pc.c, e0, x1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashSet f19785d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f19786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f19787c;

    static {
        LinkedHashSet linkedHashSet = uc.a.f21565a;
        HashSet hashSet = new HashSet();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            hashSet.add(((be.b) it.next()).a().f2744a.toString());
        }
        f19785d = hashSet;
    }

    public d0(Class cls) {
        jc.l.e(cls, "jClass");
        this.f19786b = cls;
        this.f19787c = ub.a.c(ub.i.f21540a, new v(this, 0));
    }

    public static bd.n q(be.b bVar, dd.f fVar) {
        oe.i iVar = fVar.f5871a;
        bd.r rVar = new bd.r(iVar.f16365b, bVar.f2740a, 0);
        be.e eVarF = bVar.f();
        List listW = ud.b.w(iVar.f16365b.g().k("Any").E());
        re.l lVar = iVar.f16364a;
        bd.n nVar = new bd.n(rVar, eVarF, yc.x.f26155b, yc.f.f26109a, listW, lVar);
        nVar.q(new c0(lVar, nVar), vb.t.f22821a, null);
        return nVar;
    }

    @Override // jc.e
    public final Class b() {
        return this.f19786b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof d0) && g8.a.E(this).equals(g8.a.E((pc.c) obj));
    }

    @Override // sc.i0
    public final Collection f() {
        yc.e eVarA = a();
        if (eVarA.j() == yc.f.f26110b || eVarA.j() == yc.f.f26114f) {
            return vb.r.f22819a;
        }
        Collection collectionT = eVarA.T();
        jc.l.d(collectionT, "getConstructors(...)");
        return collectionT;
    }

    @Override // sc.i0
    public final Collection g(be.e eVar) {
        le.o oVarN0 = a().E().n0();
        gd.b bVar = gd.b.f7515b;
        Collection collectionF = oVarN0.f(eVar, bVar);
        le.o oVarK0 = a().k0();
        jc.l.d(oVarK0, "getStaticScope(...)");
        return vb.m.q0(collectionF, oVarK0.f(eVar, bVar));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ub.h] */
    @Override // pc.c
    public final List getTypeParameters() {
        z1 z1Var = ((a0) this.f19787c.getValue()).f19747g;
        pc.u uVar = a0.f19742n[6];
        Object objB = z1Var.b();
        jc.l.d(objB, "getValue(...)");
        return (List) objB;
    }

    @Override // sc.i0
    public final yc.k0 h(int i10) {
        Class<?> declaringClass;
        Class cls = this.f19786b;
        if (cls.getSimpleName().equals("DefaultImpls") && (declaringClass = cls.getDeclaringClass()) != null && declaringClass.isInterface()) {
            return ((d0) g8.a.H(declaringClass)).h(i10);
        }
        yc.e eVarA = a();
        qe.h hVar = eVarA instanceof qe.h ? (qe.h) eVarA : null;
        if (hVar != null) {
            wd.k kVar = hVar.f18170e;
            ce.o oVar = zd.j.f26812j;
            jc.l.d(oVar, "classLocalVariable");
            wd.j0 j0Var = (wd.j0) vb.w.n(kVar, oVar, i10);
            if (j0Var != null) {
                oe.k kVar2 = hVar.f18177l;
                return (yc.k0) f2.f(this.f19786b, j0Var, kVar2.f16391b, kVar2.f16393d, hVar.f18171f, w.f19897b);
            }
        }
        return null;
    }

    @Override // pc.c
    public final int hashCode() {
        return g8.a.E(this).hashCode();
    }

    @Override // sc.i0
    public final Collection k(be.e eVar) {
        le.o oVarN0 = a().E().n0();
        gd.b bVar = gd.b.f7515b;
        Collection collectionB = oVarN0.b(eVar, bVar);
        le.o oVarK0 = a().k0();
        jc.l.d(oVarK0, "getStaticScope(...)");
        return vb.m.q0(collectionB, oVarK0.b(eVar, bVar));
    }

    public final be.b r() {
        vc.k kVarD;
        be.b bVar = d2.f19789a;
        Class cls = this.f19786b;
        jc.l.e(cls, "klass");
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            jc.l.d(componentType, "getComponentType(...)");
            kVarD = componentType.isPrimitive() ? je.c.b(componentType.getSimpleName()).d() : null;
            if (kVarD != null) {
                return new be.b(vc.o.f22908k, kVarD.f22857b);
            }
            be.c cVarI = vc.n.f22877g.i();
            return new be.b(cVarI.b(), cVarI.f2744a.g());
        }
        if (cls.equals(Void.TYPE)) {
            return d2.f19789a;
        }
        kVarD = cls.isPrimitive() ? je.c.b(cls.getSimpleName()).d() : null;
        if (kVarD != null) {
            return new be.b(vc.o.f22908k, kVarD.f22856a);
        }
        be.b bVarA = ed.d.a(cls);
        if (!bVarA.f2742c) {
            String str = xc.d.f24905a;
            be.c cVarA = bVarA.a();
            jc.l.e(cVarA, "fqName");
            be.b bVar2 = (be.b) xc.d.f24912h.get(cVarA.f2744a);
            if (bVar2 != null) {
                return bVar2;
            }
        }
        return bVarA;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ub.h] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, ub.h] */
    public final hd.o s() {
        hd.o oVarA;
        hd.l0 l0Var = (hd.l0) ((a0) this.f19787c.getValue()).f19743c.getValue();
        if (l0Var != null && (oVarA = hd.n.a(l0Var)) != null) {
            return oVarA;
        }
        Class cls = this.f19786b;
        return cls.isAnnotation() ? hd.o.f8431f : cls.isInterface() ? hd.o.f8428c : cls.isEnum() ? hd.o.f8429d : cls.getSuperclass().isEnum() ? hd.o.f8430e : hd.o.f8427b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ub.h] */
    @Override // sc.e0
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final yc.e a() {
        return ((a0) this.f19787c.getValue()).a();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("class ");
        be.b bVarR = r();
        be.c cVar = bVarR.f2740a;
        String strE = cVar.f2744a.c() ? "" : q.t0.E(new StringBuilder(), cVar.f2744a.f2747a, '.');
        sb.append(strE + ef.u.i0(bVarR.f2741b.f2744a.f2747a, '.', '$'));
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ub.h] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, ub.h] */
    @Override // pc.c
    public final boolean w() {
        hd.l0 l0Var = (hd.l0) ((a0) this.f19787c.getValue()).f19743c.getValue();
        if (l0Var == null) {
            return false;
        }
        androidx.media3.exoplayer.offline.u uVar = hd.n.f8425c;
        pc.u uVar2 = hd.n.f8423a[14];
        uVar.getClass();
        jc.l.e(uVar2, "property");
        i7.j1 j1Var = (i7.j1) uVar.f969c;
        return ((((Number) ((jc.o) uVar.f968b).get(l0Var)).intValue() >>> j1Var.f9176a) & ((1 << j1Var.f9177b) - 1)) == j1Var.f9178c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ub.h] */
    @Override // pc.c
    public final String x() {
        z1 z1Var = ((a0) this.f19787c.getValue()).f19746f;
        pc.u uVar = a0.f19742n[3];
        return (String) z1Var.b();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ub.h] */
    @Override // pc.c
    public final String y() {
        z1 z1Var = ((a0) this.f19787c.getValue()).f19745e;
        pc.u uVar = a0.f19742n[2];
        return (String) z1Var.b();
    }

    @Override // pc.c
    public final boolean z(Object obj) {
        List list = ed.d.f6487a;
        Class cls = this.f19786b;
        jc.l.e(cls, "<this>");
        Integer num = (Integer) ed.d.f6490d.get(cls);
        if (num != null) {
            return jc.c0.d(num.intValue(), obj);
        }
        Class cls2 = (Class) ed.d.f6489c.get(cls);
        if (cls2 != null) {
            cls = cls2;
        }
        return cls.isInstance(obj);
    }
}
