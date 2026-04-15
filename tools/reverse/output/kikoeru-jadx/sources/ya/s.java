package ya;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s extends AbstractSet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f26049b;

    public /* synthetic */ s(u uVar, int i10) {
        this.f26048a = i10;
        this.f26049b = uVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f26048a) {
            case 0:
                this.f26049b.clear();
                break;
            default:
                this.f26049b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f26048a) {
            case 0:
                u uVar = this.f26049b;
                Map mapB = uVar.b();
                if (mapB != null) {
                    return mapB.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int iD = uVar.d(entry.getKey());
                    if (iD != -1 && ud.n.f(uVar.j()[iD], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.f26049b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f26048a) {
            case 0:
                u uVar = this.f26049b;
                Map mapB = uVar.b();
                return mapB != null ? mapB.entrySet().iterator() : new r(uVar, 1);
            default:
                u uVar2 = this.f26049b;
                Map mapB2 = uVar2.b();
                return mapB2 != null ? mapB2.keySet().iterator() : new r(uVar2, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f26048a) {
            case 0:
                u uVar = this.f26049b;
                Map mapB = uVar.b();
                if (mapB != null) {
                    return mapB.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!uVar.f()) {
                        int iC = uVar.c();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = uVar.f26056a;
                        Objects.requireNonNull(obj2);
                        int iP = q.p(key, value, iC, obj2, uVar.h(), uVar.i(), uVar.j());
                        if (iP != -1) {
                            uVar.e(iP, iC);
                            uVar.f26061f--;
                            uVar.f26060e += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                u uVar2 = this.f26049b;
                Map mapB2 = uVar2.b();
                return mapB2 != null ? mapB2.keySet().remove(obj) : uVar2.g(obj) != u.f26055j;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f26048a) {
        }
        return this.f26049b.size();
    }
}
