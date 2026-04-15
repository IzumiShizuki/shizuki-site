package c1;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j extends vb.h implements a1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f3229b;

    public /* synthetic */ j(c cVar, int i10) {
        this.f3228a = i10;
        this.f3229b = cVar;
    }

    @Override // vb.a
    public final int a() {
        switch (this.f3228a) {
            case 0:
                c cVar = this.f3229b;
                cVar.getClass();
                return cVar.f3210b;
            default:
                c cVar2 = this.f3229b;
                cVar2.getClass();
                return cVar2.f3210b;
        }
    }

    @Override // vb.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        switch (this.f3228a) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    c cVar = this.f3229b;
                    Object obj2 = cVar.get(key);
                    if (obj2 != null) {
                        return obj2.equals(entry.getValue());
                    }
                    if (entry.getValue() == null && cVar.containsKey(entry.getKey())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.f3229b.containsKey(obj);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f3228a) {
            case 0:
                m mVar = this.f3229b.f3209a;
                n[] nVarArr = new n[8];
                for (int i10 = 0; i10 < 8; i10++) {
                    nVarArr[i10] = new o(0);
                }
                return new k(mVar, nVarArr);
            default:
                m mVar2 = this.f3229b.f3209a;
                n[] nVarArr2 = new n[8];
                for (int i11 = 0; i11 < 8; i11++) {
                    nVarArr2[i11] = new o(1);
                }
                return new k(mVar2, nVarArr2);
        }
    }
}
