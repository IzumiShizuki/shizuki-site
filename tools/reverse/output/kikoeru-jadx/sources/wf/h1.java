package wf;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h1 extends r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pc.c f24126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f24127c;

    public h1(pc.c cVar, sf.a aVar) {
        super(aVar);
        this.f24126b = cVar;
        uf.g gVarA = aVar.a();
        jc.l.e(gVarA, "elementDesc");
        this.f24127c = new c(gVarA, 0);
    }

    @Override // sf.a
    public final uf.g a() {
        return this.f24127c;
    }

    @Override // wf.a
    public final Object e() {
        return new ArrayList();
    }

    @Override // wf.a
    public final int f(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        jc.l.e(arrayList, "<this>");
        return arrayList.size();
    }

    @Override // wf.a
    public final Iterator g(Object obj) {
        Object[] objArr = (Object[]) obj;
        jc.l.e(objArr, "<this>");
        return jc.k.a(objArr);
    }

    @Override // wf.a
    public final int h(Object obj) {
        Object[] objArr = (Object[]) obj;
        jc.l.e(objArr, "<this>");
        return objArr.length;
    }

    @Override // wf.a
    public final Object k(Object obj) {
        jc.l.e(null, "<this>");
        vb.l.c0(null);
        throw null;
    }

    @Override // wf.a
    public final Object l(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        jc.l.e(arrayList, "<this>");
        pc.c cVar = this.f24126b;
        jc.l.e(cVar, "eClass");
        Object objNewInstance = Array.newInstance((Class<?>) g8.a.D(cVar), arrayList.size());
        jc.l.c(objNewInstance, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
        Object[] array = arrayList.toArray((Object[]) objNewInstance);
        jc.l.d(array, "toArray(...)");
        return array;
    }

    @Override // wf.r
    public final void m(int i10, Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        jc.l.e(arrayList, "<this>");
        arrayList.add(i10, obj2);
    }
}
