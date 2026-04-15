package wf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d extends r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m0 f24102c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(sf.a aVar, int i10) {
        super(aVar);
        this.f24101b = i10;
        switch (i10) {
            case 1:
                jc.l.e(aVar, "eSerializer");
                super(aVar);
                uf.g gVarA = aVar.a();
                jc.l.e(gVarA, "elementDesc");
                this.f24102c = new c(gVarA, 2);
                break;
            case 2:
                jc.l.e(aVar, "eSerializer");
                super(aVar);
                uf.g gVarA2 = aVar.a();
                jc.l.e(gVarA2, "elementDesc");
                this.f24102c = new c(gVarA2, 3);
                break;
            default:
                jc.l.e(aVar, "element");
                uf.g gVarA3 = aVar.a();
                jc.l.e(gVarA3, "elementDesc");
                this.f24102c = new c(gVarA3, 1);
                break;
        }
    }

    @Override // sf.a
    public final uf.g a() {
        switch (this.f24101b) {
        }
        return (c) this.f24102c;
    }

    @Override // wf.a
    public final Object e() {
        switch (this.f24101b) {
            case 0:
                return new ArrayList();
            case 1:
                return new HashSet();
            default:
                return new LinkedHashSet();
        }
    }

    @Override // wf.a
    public final int f(Object obj) {
        switch (this.f24101b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                jc.l.e(arrayList, "<this>");
                return arrayList.size();
            case 1:
                HashSet hashSet = (HashSet) obj;
                jc.l.e(hashSet, "<this>");
                return hashSet.size();
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                jc.l.e(linkedHashSet, "<this>");
                return linkedHashSet.size();
        }
    }

    @Override // wf.a
    public final Iterator g(Object obj) {
        Collection collection = (Collection) obj;
        jc.l.e(collection, "<this>");
        return collection.iterator();
    }

    @Override // wf.a
    public final int h(Object obj) {
        Collection collection = (Collection) obj;
        jc.l.e(collection, "<this>");
        return collection.size();
    }

    @Override // wf.a
    public final Object k(Object obj) {
        switch (this.f24101b) {
            case 0:
                jc.l.e(null, "<this>");
                return new ArrayList((Collection) null);
            case 1:
                jc.l.e(null, "<this>");
                return new HashSet((Collection) null);
            default:
                jc.l.e(null, "<this>");
                return new LinkedHashSet((Collection) null);
        }
    }

    @Override // wf.a
    public final Object l(Object obj) {
        switch (this.f24101b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                jc.l.e(arrayList, "<this>");
                return arrayList;
            case 1:
                HashSet hashSet = (HashSet) obj;
                jc.l.e(hashSet, "<this>");
                return hashSet;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                jc.l.e(linkedHashSet, "<this>");
                return linkedHashSet;
        }
    }

    @Override // wf.r
    public final void m(int i10, Object obj, Object obj2) {
        switch (this.f24101b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                jc.l.e(arrayList, "<this>");
                arrayList.add(i10, obj2);
                break;
            case 1:
                HashSet hashSet = (HashSet) obj;
                jc.l.e(hashSet, "<this>");
                hashSet.add(obj2);
                break;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                jc.l.e(linkedHashSet, "<this>");
                linkedHashSet.add(obj2);
                break;
        }
    }
}
