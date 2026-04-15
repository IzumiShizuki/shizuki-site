package tc;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f20621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f20622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f20623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f20624d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f20625e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f20626f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f20627g;

    public c(Class cls, ArrayList arrayList, a aVar, b bVar, List list) {
        jc.l.e(cls, "jClass");
        jc.l.e(list, "methods");
        this.f20621a = cls;
        this.f20622b = arrayList;
        this.f20623c = aVar;
        this.f20624d = list;
        List list2 = list;
        ArrayList arrayList2 = new ArrayList(vb.n.K(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Method) it.next()).getGenericReturnType());
        }
        this.f20625e = arrayList2;
        List list3 = this.f20624d;
        ArrayList arrayList3 = new ArrayList(vb.n.K(list3, 10));
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            Class<?> returnType = ((Method) it2.next()).getReturnType();
            jc.l.b(returnType);
            List list4 = ed.d.f6487a;
            Class<?> cls2 = (Class) ed.d.f6489c.get(returnType);
            if (cls2 != null) {
                returnType = cls2;
            }
            arrayList3.add(returnType);
        }
        this.f20626f = arrayList3;
        List list5 = this.f20624d;
        ArrayList arrayList4 = new ArrayList(vb.n.K(list5, 10));
        Iterator it3 = list5.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((Method) it3.next()).getDefaultValue());
        }
        this.f20627g = arrayList4;
        if (this.f20623c == a.f20611b && bVar == b.f20614a && !vb.m.n0(this.f20622b, "value").isEmpty()) {
            throw new UnsupportedOperationException("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
        }
    }

    @Override // tc.g
    public final List a() {
        return this.f20625e;
    }

    @Override // tc.g
    public final /* bridge */ /* synthetic */ Member b() {
        return null;
    }

    @Override // tc.g
    public final /* bridge */ boolean c() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    @Override // tc.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.Object[] r18) {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tc.c.d(java.lang.Object[]):java.lang.Object");
    }

    @Override // tc.g
    public final Type n() {
        return this.f20621a;
    }

    public /* synthetic */ c(Class cls, ArrayList arrayList, a aVar) {
        ArrayList arrayList2 = new ArrayList(vb.n.K(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(cls.getDeclaredMethod((String) it.next(), null));
        }
        this(cls, arrayList, aVar, b.f20615b, arrayList2);
    }
}
