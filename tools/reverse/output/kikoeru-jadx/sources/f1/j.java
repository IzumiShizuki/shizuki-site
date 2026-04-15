package f1;

import x0.m1;
import x0.r2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j extends c1.e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public k f6632g;

    @Override // c1.e, a1.c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final k build() {
        c1.m mVar = this.f3216c;
        k kVar = this.f6632g;
        if (mVar != kVar.f3209a) {
            this.f3215b = new e1.b();
            kVar = new k(this.f3216c, this.f3219f);
        }
        this.f6632g = kVar;
        return kVar;
    }

    @Override // c1.e, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof m1) {
            return super.containsKey((m1) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof r2) {
            return super.containsValue((r2) obj);
        }
        return false;
    }

    @Override // c1.e, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof m1) {
            return (r2) super.get((m1) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof m1) ? obj2 : (r2) super.getOrDefault((m1) obj, (r2) obj2);
    }

    @Override // c1.e, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof m1) {
            return (r2) super.remove((m1) obj);
        }
        return null;
    }
}
