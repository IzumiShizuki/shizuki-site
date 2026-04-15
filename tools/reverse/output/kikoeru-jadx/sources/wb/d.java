package wb;

import java.util.ConcurrentModificationException;
import java.util.Map;
import jc.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Map.Entry, kc.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f23470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23472c;

    public d(e eVar, int i10) {
        l.e(eVar, "map");
        this.f23470a = eVar;
        this.f23471b = i10;
        this.f23472c = eVar.f23481h;
    }

    public final void a() {
        if (this.f23470a.f23481h != this.f23472c) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return l.a(entry.getKey(), getKey()) && l.a(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.f23470a.f23474a[this.f23471b];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.f23470a.f23475b;
        l.b(objArr);
        return objArr[this.f23471b];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        e eVar = this.f23470a;
        eVar.c();
        Object[] objArr = eVar.f23475b;
        if (objArr == null) {
            int length = eVar.f23474a.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            eVar.f23475b = objArr;
        }
        int i10 = this.f23471b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
