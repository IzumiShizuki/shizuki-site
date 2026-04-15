package pd;

import b0.w1;
import bd.y0;
import c7.e1;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import se.s0;
import yc.q0;

/* JADX INFO: loaded from: classes.dex */
public final class j implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17040a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f17041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f17042c;

    public j(w1 w1Var, n nVar) {
        this.f17041b = w1Var;
        this.f17042c = nVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, ub.h] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [pd.n] */
    /* JADX WARN: Type inference failed for: r2v8, types: [pd.n] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v10, types: [nd.b] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [bd.l, bd.z, nd.b] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // ic.a
    public final Object b() throws IllegalAccessException, InvocationTargetException {
        n nVar;
        ?? r42;
        ?? arrayList;
        ?? r15;
        ArrayList<ed.x> arrayList2;
        ?? r22;
        ub.k kVar;
        List listD;
        switch (this.f17040a) {
            case 0:
                n nVar2 = this.f17042c;
                ed.o oVar = nVar2.f17055o;
                w1 w1Var = nVar2.f17093b;
                yc.e eVar = nVar2.f17054n;
                Constructor<?>[] declaredConstructors = oVar.f6508a.getDeclaredConstructors();
                jc.l.d(declaredConstructors, "getDeclaredConstructors(...)");
                boolean z10 = false;
                List<ed.r> listG0 = df.m.g0(df.m.e0(new df.h(vb.l.d0(declaredConstructors), false, ed.j.f6503i), ed.k.f6504i));
                ArrayList arrayList3 = new ArrayList(listG0.size());
                for (ed.r rVar : listG0) {
                    od.c cVarZ = n7.e.z(w1Var, rVar);
                    od.a aVar = (od.a) w1Var.f1395c;
                    nd.b bVarU1 = nd.b.U1(eVar, cVarZ, z10, aVar.f16324j.c(rVar));
                    w1 w1Var2 = new w1(aVar, new h7.k(w1Var, bVarU1, rVar, eVar.L().size()), (ub.h) w1Var.f1394b);
                    Constructor constructor = rVar.f6512a;
                    Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                    jc.l.b(genericParameterTypes);
                    if (genericParameterTypes.length == 0) {
                        listD = vb.r.f22819a;
                    } else {
                        Class declaringClass = constructor.getDeclaringClass();
                        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
                            genericParameterTypes = (Type[]) vb.l.o0(1, genericParameterTypes.length, genericParameterTypes);
                        }
                        Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                        if (parameterAnnotations.length < genericParameterTypes.length) {
                            throw new IllegalStateException("Illegal generic signature: " + constructor);
                        }
                        if (parameterAnnotations.length > genericParameterTypes.length) {
                            parameterAnnotations = (Annotation[][]) vb.l.o0(parameterAnnotations.length - genericParameterTypes.length, parameterAnnotations.length, parameterAnnotations);
                        }
                        listD = rVar.d(genericParameterTypes, parameterAnnotations, constructor.isVarArgs());
                    }
                    k5.d dVarU = z.u(w1Var2, bVarU1, listD);
                    List listL = eVar.L();
                    jc.l.d(listL, "getDeclaredTypeParameters(...)");
                    List list = listL;
                    ArrayList typeParameters = rVar.getTypeParameters();
                    ArrayList arrayList4 = new ArrayList(vb.n.K(typeParameters, 10));
                    Iterator it = typeParameters.iterator();
                    while (it.hasNext()) {
                        q0 q0VarA = ((od.e) w1Var2.f1396d).a((ed.c0) it.next());
                        jc.l.b(q0VarA);
                        arrayList4.add(q0VarA);
                    }
                    bVarU1.S1((List) dVarU.f11044c, gh.g.Q(rVar.e()), vb.m.q0(list, arrayList4));
                    bVarU1.L1(false);
                    bVarU1.M1(dVarU.f11043b);
                    bVarU1.N1(eVar.E());
                    ((od.a) w1Var2.f1395c).f16321g.getClass();
                    arrayList3.add(bVarU1);
                    z10 = false;
                }
                boolean zG = oVar.g();
                Class cls = oVar.f6508a;
                s0 s0Var = s0.f19985b;
                w1 w1Var3 = this.f17041b;
                zc.f fVar = zc.g.f26696a;
                if (zG) {
                    nd.b bVarU12 = nd.b.U1(eVar, fVar, true, ((od.a) w1Var.f1395c).f16324j.c(oVar));
                    ArrayList arrayListF = oVar.f();
                    ArrayList arrayList5 = new ArrayList(arrayListF.size());
                    nVar = nVar2;
                    qd.a aVarF = n7.e.F(s0Var, false, null, 6);
                    int i10 = 0;
                    for (Iterator it2 = arrayListF.iterator(); it2.hasNext(); it2 = it2) {
                        ed.a0 a0Var = (ed.a0) it2.next();
                        arrayList5.add(new y0(bVarU12, null, i10, fVar, a0Var.c(), ((e1) w1Var.f1397e).h0(a0Var.f(), aVarF), false, false, false, null, ((od.a) w1Var.f1395c).f16324j.c(a0Var)));
                        i10++;
                    }
                    bVarU12.M1(false);
                    ld.o oVarF = eVar.f();
                    jc.l.d(oVarF, "getVisibility(...)");
                    if (oVarF.equals(ld.p.f12239b)) {
                        oVarF = ld.p.f12240c;
                        jc.l.d(oVarF, "PROTECTED_AND_PACKAGE");
                    }
                    bVarU12.R1(arrayList5, oVarF);
                    bVarU12.L1(false);
                    bVarU12.N1(eVar.E());
                    String strJ = ua.l.J(bVarU12, 2);
                    if (arrayList3.isEmpty()) {
                        arrayList3.add(bVarU12);
                        ((od.a) w1Var3.f1395c).f16321g.getClass();
                    } else {
                        Iterator it3 = arrayList3.iterator();
                        while (it3.hasNext()) {
                            if (jc.l.a(ua.l.J((bd.l) it3.next(), 2), strJ)) {
                            }
                        }
                        arrayList3.add(bVarU12);
                        ((od.a) w1Var3.f1395c).f16321g.getClass();
                    }
                } else {
                    nVar = nVar2;
                }
                ((je.a) ((od.a) w1Var3.f1395c).f16338x).a(eVar, arrayList3, w1Var3);
                td.c cVar = ((od.a) w1Var3.f1395c).f16332r;
                boolean zIsEmpty = arrayList3.isEmpty();
                List listY = arrayList3;
                if (zIsEmpty) {
                    boolean zIsAnnotation = cls.isAnnotation();
                    cls.isInterface();
                    if (zIsAnnotation) {
                        od.a aVar2 = (od.a) w1Var.f1395c;
                        e1 e1Var = (e1) w1Var.f1397e;
                        nd.b bVarU13 = nd.b.U1(eVar, fVar, true, aVar2.f16324j.c(oVar));
                        if (zIsAnnotation) {
                            Collection collectionD = oVar.d();
                            arrayList = new ArrayList(collectionD.size());
                            qd.a aVarF2 = n7.e.F(s0Var, true, null, 6);
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = new ArrayList();
                            for (Object obj : collectionD) {
                                if (jc.l.a(((ed.x) obj).c(), ld.w.f12258b)) {
                                    arrayList6.add(obj);
                                } else {
                                    arrayList7.add(obj);
                                }
                            }
                            arrayList6.size();
                            ed.x xVar = (ed.x) vb.m.a0(arrayList6);
                            if (xVar != null) {
                                ed.b0 b0VarF = xVar.f();
                                if (b0VarF instanceof ed.i) {
                                    ed.i iVar = (ed.i) b0VarF;
                                    kVar = new ub.k(e1Var.g0(iVar, aVarF2, true), e1Var.h0(iVar.f6501b, aVarF2));
                                } else {
                                    kVar = new ub.k(e1Var.h0(b0VarF, aVarF2), null);
                                }
                                se.w wVar = (se.w) kVar.f21543a;
                                se.w wVar2 = (se.w) kVar.f21544b;
                                arrayList2 = arrayList7;
                                nd.b bVar = bVarU13;
                                ?? r23 = nVar;
                                r23.v(arrayList, bVar, 0, xVar, wVar, wVar2);
                                r22 = r23;
                                r42 = bVar;
                            } else {
                                r42 = bVarU13;
                                arrayList2 = arrayList7;
                                r22 = nVar;
                            }
                            int i11 = xVar != null ? 1 : 0;
                            int i12 = 0;
                            for (ed.x xVar2 : arrayList2) {
                                r22.v(arrayList, r42, i12 + i11, xVar2, e1Var.h0(xVar2.f(), aVarF2), null);
                                i12++;
                            }
                        } else {
                            r42 = bVarU13;
                            arrayList = Collections.EMPTY_LIST;
                        }
                        r42.M1(false);
                        ld.o oVarF2 = eVar.f();
                        jc.l.d(oVarF2, "getVisibility(...)");
                        if (oVarF2.equals(ld.p.f12239b)) {
                            oVarF2 = ld.p.f12240c;
                            jc.l.d(oVarF2, "PROTECTED_AND_PACKAGE");
                        }
                        r42.R1(arrayList, oVarF2);
                        r42.L1(true);
                        r42.N1(eVar.E());
                        ((od.a) w1Var.f1395c).f16321g.getClass();
                        r15 = r42;
                    } else {
                        r15 = 0;
                    }
                    listY = ud.b.y(r15);
                }
                return vb.m.G0(cVar.e(w1Var3, listY));
            default:
                w1 w1Var4 = this.f17041b;
                return vb.m.K0(((je.a) ((od.a) w1Var4.f1395c).f16338x).f(this.f17042c.f17054n, w1Var4));
        }
    }

    public j(n nVar, w1 w1Var) {
        this.f17042c = nVar;
        this.f17041b = w1Var;
    }
}
