package sc;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends u implements jc.i, pc.f, g {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ pc.u[] f19817k = {jc.z.f10839a.g(new jc.s(k0.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", 0))};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i0 f19818e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f19819f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f19820g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z1 f19821h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f19822i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f19823j;

    public k0(i0 i0Var, String str, String str2, yc.t tVar, Object obj) {
        this.f19818e = i0Var;
        this.f19819f = str2;
        this.f19820g = obj;
        this.f19821h = nd.h.r(tVar, new bd.i(13, this, str, false));
        j0 j0Var = new j0(this, 0);
        ub.i iVar = ub.i.f21540a;
        this.f19822i = ub.a.c(iVar, j0Var);
        this.f19823j = ub.a.c(iVar, new j0(this, 1));
    }

    @Override // pc.b
    public final boolean I() {
        return r().I();
    }

    @Override // ic.k
    public final Object a(Object obj) {
        return h(obj);
    }

    @Override // ic.a
    public final Object b() {
        return h(new Object[0]);
    }

    @Override // jc.i
    public final int c() {
        return n7.d.q(i());
    }

    public final boolean equals(Object obj) {
        k0 k0VarB = f2.b(obj);
        return k0VarB != null && jc.l.a(this.f19818e, k0VarB.f19818e) && getName().equals(k0VarB.getName()) && jc.l.a(this.f19819f, k0VarB.f19819f) && jc.l.a(this.f19820g, k0VarB.f19820g);
    }

    @Override // ic.o
    public final Object g(Object obj, Object obj2, Object obj3) {
        return h(obj, obj2, obj3);
    }

    @Override // pc.b
    public final String getName() {
        String strB = ((bd.p) r()).getName().b();
        jc.l.d(strB, "asString(...)");
        return strB;
    }

    public final int hashCode() {
        return this.f19819f.hashCode() + ((getName().hashCode() + (this.f19818e.hashCode() * 31)) * 31);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ub.h] */
    @Override // sc.u
    public final tc.g i() {
        return (tc.g) this.f19822i.getValue();
    }

    @Override // sc.u
    public final i0 j() {
        return this.f19818e;
    }

    @Override // ic.q
    public final Object k(a0.d dVar, Integer num, Object obj, x0.o oVar, Integer num2) {
        return h(dVar, num, obj, oVar, num2);
    }

    @Override // ic.p
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        return h(obj, obj2, obj3, obj4);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ub.h] */
    @Override // sc.u
    public final tc.g m() {
        return (tc.g) this.f19823j.getValue();
    }

    @Override // ic.r
    public final Object p(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return h(obj, obj2, obj3, obj4, obj5, obj6);
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        return h(obj, obj2);
    }

    @Override // sc.u
    public final boolean t() {
        return this.f19820g != jc.c.f10817a;
    }

    public final String toString() throws IOException {
        StringBuilder sb = new StringBuilder();
        nh.a.f(sb, this);
        sb.append("fun ");
        nh.a.g(sb, this);
        sb.append(lc.b.M(be.e.e(getName())));
        vb.m.e0(nh.b.y(this), sb, ", ", "(", ")", c.f19773l, 48);
        sb.append(": ");
        sb.append(nh.a.A(n()));
        return sb.toString();
    }

    public final tc.w u(Constructor constructor, yc.t tVar, boolean z10) {
        Object obj = this.f19820g;
        Class<?> cls = null;
        if (!z10) {
            bd.l lVar = tVar instanceof bd.l ? (bd.l) tVar : null;
            if (lVar != null) {
                bd.l lVar2 = lVar;
                if (!yc.o.e(lVar2.f())) {
                    yc.e eVarV = lVar.V();
                    jc.l.d(eVarV, "getConstructedClass(...)");
                    if (!ee.g.e(eVarV) && !ee.e.p(lVar.V())) {
                        List listO0 = lVar2.o0();
                        jc.l.d(listO0, "getValueParameters(...)");
                        List list = listO0;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                se.w wVarB = ((bd.y0) it.next()).b();
                                jc.l.d(wVarB, "getType(...)");
                                if (a2.c.Z(wVarB)) {
                                    if (t()) {
                                        return new tc.h(constructor, n7.e.f(obj, r()), 0);
                                    }
                                    Class declaringClass = constructor.getDeclaringClass();
                                    jc.l.d(declaringClass, "getDeclaringClass(...)");
                                    Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                                    jc.l.d(genericParameterTypes, "getGenericParameterTypes(...)");
                                    return new tc.i(constructor, declaringClass, null, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : vb.l.o0(0, genericParameterTypes.length - 1, genericParameterTypes)), 0);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (t()) {
            return new tc.h(constructor, n7.e.f(obj, r()), 1);
        }
        Class declaringClass2 = constructor.getDeclaringClass();
        jc.l.d(declaringClass2, "getDeclaringClass(...)");
        Class declaringClass3 = constructor.getDeclaringClass();
        Class<?> declaringClass4 = declaringClass3.getDeclaringClass();
        if (declaringClass4 != null && !Modifier.isStatic(declaringClass3.getModifiers())) {
            cls = declaringClass4;
        }
        Type[] genericParameterTypes2 = constructor.getGenericParameterTypes();
        jc.l.d(genericParameterTypes2, "getGenericParameterTypes(...)");
        return new tc.i(constructor, declaringClass2, cls, genericParameterTypes2, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final tc.q v(java.lang.reflect.Method r6, boolean r7) {
        /*
            r5 = this;
            boolean r0 = r5.t()
            r1 = 0
            if (r0 == 0) goto L50
            tc.t r0 = new tc.t
            yc.t r2 = r5.r()
            bd.a0 r2 = r2.s0()
            java.lang.Object r3 = r5.f19820g
            if (r2 == 0) goto L44
            se.w r2 = r2.b()
            int r4 = ee.g.f6525a
            se.k0 r2 = r2.t()
            yc.h r2 = r2.h()
            if (r2 == 0) goto L29
            boolean r1 = ee.g.b(r2)
        L29:
            r2 = 1
            if (r1 != r2) goto L44
            java.lang.Class[] r1 = r6.getParameterTypes()
            java.lang.String r4 = "getParameterTypes(...)"
            jc.l.d(r1, r4)
            java.lang.Object r1 = vb.l.v0(r1)
            java.lang.Class r1 = (java.lang.Class) r1
            if (r1 == 0) goto L44
            boolean r1 = r1.isInterface()
            if (r1 != r2) goto L44
            goto L4c
        L44:
            yc.t r1 = r5.r()
            java.lang.Object r3 = n7.e.f(r3, r1)
        L4c:
            r0.<init>(r6, r7, r3)
            return r0
        L50:
            tc.v r7 = new tc.v
            r0 = 6
            r2 = 2
            r7.<init>(r6, r1, r0, r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: sc.k0.v(java.lang.reflect.Method, boolean):tc.q");
    }

    @Override // sc.u
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public final yc.t r() {
        pc.u uVar = f19817k[0];
        Object objB = this.f19821h.b();
        jc.l.d(objB, "getValue(...)");
        return (yc.t) objB;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public k0(i0 i0Var, yc.t tVar) {
        jc.l.e(tVar, "descriptor");
        String strB = ((bd.p) tVar).getName().b();
        jc.l.d(strB, "asString(...)");
        this(i0Var, strB, d2.c(tVar).a(), tVar, jc.c.f10817a);
    }
}
