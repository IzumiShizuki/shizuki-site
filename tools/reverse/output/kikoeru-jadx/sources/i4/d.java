package i4;

import ic.k;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import jc.l;
import s8.n;
import vb.w;
import xf.m;
import xf.y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f9004a;

    public d(int i10) {
        switch (i10) {
            case 1:
                this.f9004a = new LinkedHashMap();
                break;
            case 2:
                this.f9004a = new LinkedHashMap(0, 0.75f, true);
                break;
            case 3:
            default:
                this.f9004a = new LinkedHashMap();
                break;
            case 4:
                this.f9004a = new LinkedHashMap();
                break;
            case 5:
                this.f9004a = new LinkedHashMap();
                break;
        }
    }

    public void a(pc.c cVar, k kVar) {
        l.e(cVar, "clazz");
        l.e(kVar, "initializer");
        LinkedHashMap linkedHashMap = this.f9004a;
        if (!linkedHashMap.containsKey(cVar)) {
            linkedHashMap.put(cVar, new f(cVar, kVar));
            return;
        }
        throw new IllegalArgumentException(("A `initializer` with the same `clazz` has already been added: " + cVar.x() + '.').toString());
    }

    public c b() {
        Collection collectionValues = this.f9004a.values();
        l.e(collectionValues, "initializers");
        f[] fVarArr = (f[]) collectionValues.toArray(new f[0]);
        return new c((f[]) Arrays.copyOf(fVarArr, fVarArr.length));
    }

    public y c() {
        return new y(this.f9004a);
    }

    public m d(String str, m mVar) {
        l.e(mVar, "element");
        return (m) this.f9004a.put(str, mVar);
    }

    public d(n nVar) {
        this.f9004a = w.C(nVar.f19657a);
    }
}
