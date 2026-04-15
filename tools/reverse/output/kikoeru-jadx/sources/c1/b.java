package c1;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b extends a implements kc.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final bf.h f3206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f3207e;

    public b(bf.h hVar, Object obj, Object obj2) {
        super(0, obj, obj2);
        this.f3206d = hVar;
        this.f3207e = obj2;
    }

    @Override // c1.a, java.util.Map.Entry
    public final Object getValue() {
        return this.f3207e;
    }

    @Override // c1.a, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f3207e;
        this.f3207e = obj;
        f fVar = (f) this.f3206d.f2804b;
        e eVar = fVar.f3220d;
        Object obj3 = this.f3204b;
        if (!eVar.containsKey(obj3)) {
            return obj2;
        }
        boolean z10 = fVar.f3213c;
        if (!z10) {
            eVar.put(obj3, obj);
        } else {
            if (!z10) {
                throw new NoSuchElementException();
            }
            n nVar = fVar.f3211a[fVar.f3212b];
            Object obj4 = nVar.f3237a[nVar.f3239c];
            eVar.put(obj3, obj);
            fVar.c(obj4 != null ? obj4.hashCode() : 0, eVar.f3216c, obj4, 0);
        }
        fVar.f3223g = eVar.f3218e;
        return obj2;
    }
}
