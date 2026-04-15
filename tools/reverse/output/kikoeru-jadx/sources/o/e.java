package o;

import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e extends u0 implements Map {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ce.i0 f15941d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f15942e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f15943f;

    @Override // java.util.Map
    public final Set entrySet() {
        ce.i0 i0Var = this.f15941d;
        if (i0Var != null) {
            return i0Var;
        }
        ce.i0 i0Var2 = new ce.i0(this, 1);
        this.f15941d = i0Var2;
        return i0Var2;
    }

    public final boolean i(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean j(Collection collection) {
        int i10 = this.f16053c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i10 != this.f16053c;
    }

    @Override // java.util.Map
    public final Set keySet() {
        b bVar = this.f15942e;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(this);
        this.f15942e = bVar2;
        return bVar2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        int size = map.size() + this.f16053c;
        int i10 = this.f16053c;
        int[] iArr = this.f16051a;
        if (iArr.length < size) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, size);
            jc.l.d(iArrCopyOf, "copyOf(...)");
            this.f16051a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f16052b, size * 2);
            jc.l.d(objArrCopyOf, "copyOf(...)");
            this.f16052b = objArrCopyOf;
        }
        if (this.f16053c != i10) {
            throw new ConcurrentModificationException();
        }
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        d dVar = this.f15943f;
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d(this);
        this.f15943f = dVar2;
        return dVar2;
    }
}
