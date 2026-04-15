package tc;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import sc.f2;
import sc.i0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Method f20628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f20629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f20630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f20631d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f20632e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.util.ArrayList] */
    public c0(yc.t tVar, i0 i0Var, String str, List list) {
        ?? W;
        jc.l.e(i0Var, "container");
        jc.l.e(str, "constructorDesc");
        Method methodE = i0Var.e("constructor-impl", str);
        jc.l.b(methodE);
        this.f20628a = methodE;
        Method methodE2 = i0Var.e("box-impl", ef.n.G0(str, "V") + ed.d.b(i0Var.b()));
        jc.l.b(methodE2);
        this.f20629b = methodE2;
        List list2 = list;
        ArrayList arrayList = new ArrayList(vb.n.K(list2, 10));
        Iterator it = list2.iterator();
        while (true) {
            List listW = null;
            if (!it.hasNext()) {
                break;
            }
            se.w wVarB = ((yc.i0) it.next()).b();
            jc.l.d(wVarB, "getType(...)");
            se.a0 a0VarB = se.c.b(wVarB);
            ArrayList arrayListS = n7.e.s(a0VarB);
            if (arrayListS == null) {
                Class clsG = n7.e.G(a0VarB);
                if (clsG != null) {
                    listW = ud.b.w(n7.e.o(clsG, tVar));
                }
            } else {
                listW = arrayListS;
            }
            arrayList.add(listW);
        }
        this.f20630c = arrayList;
        ArrayList arrayList2 = new ArrayList(vb.n.K(list2, 10));
        int i10 = 0;
        for (Object obj : list2) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                ud.b.H();
                throw null;
            }
            yc.h hVarH = ((yc.i0) obj).b().t().h();
            jc.l.c(hVarH, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            yc.e eVar = (yc.e) hVarH;
            List list3 = (List) this.f20630c.get(i10);
            if (list3 != null) {
                List list4 = list3;
                W = new ArrayList(vb.n.K(list4, 10));
                Iterator it2 = list4.iterator();
                while (it2.hasNext()) {
                    W.add(((Method) it2.next()).getReturnType());
                }
            } else {
                Class clsJ = f2.j(eVar);
                jc.l.b(clsJ);
                W = ud.b.w(clsJ);
            }
            arrayList2.add(W);
            i10 = i11;
        }
        this.f20631d = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            vb.m.P(arrayList3, (Iterable) it3.next());
        }
        this.f20632e = arrayList3;
    }

    @Override // tc.g
    public final List a() {
        return this.f20632e;
    }

    @Override // tc.g
    public final /* bridge */ /* synthetic */ Member b() {
        return null;
    }

    @Override // tc.g
    public final /* bridge */ boolean c() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
    @Override // tc.g
    public final Object d(Object[] objArr) throws IllegalAccessException, InvocationTargetException {
        ?? W;
        jc.l.e(objArr, "args");
        ArrayList arrayList = this.f20630c;
        jc.l.e(arrayList, "other");
        int length = objArr.length;
        ArrayList<ub.k> arrayList2 = new ArrayList(Math.min(vb.n.K(arrayList, 10), length));
        int i10 = 0;
        for (Object obj : arrayList) {
            if (i10 >= length) {
                break;
            }
            arrayList2.add(new ub.k(objArr[i10], obj));
            i10++;
        }
        ArrayList arrayList3 = new ArrayList();
        for (ub.k kVar : arrayList2) {
            Object obj2 = kVar.f21543a;
            List list = (List) kVar.f21544b;
            if (list != null) {
                List list2 = list;
                W = new ArrayList(vb.n.K(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    W.add(((Method) it.next()).invoke(obj2, null));
                }
            } else {
                W = ud.b.w(obj2);
            }
            vb.m.P(arrayList3, (Iterable) W);
        }
        Object[] array = arrayList3.toArray(new Object[0]);
        this.f20628a.invoke(null, Arrays.copyOf(array, array.length));
        return this.f20629b.invoke(null, Arrays.copyOf(array, array.length));
    }

    @Override // tc.g
    public final Type n() {
        Class<?> returnType = this.f20629b.getReturnType();
        jc.l.d(returnType, "getReturnType(...)");
        return returnType;
    }
}
