package p4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f16573a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f16574b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Set f16575c = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f16576d = Collections.EMPTY_LIST;

    public final int a(b5.q qVar) {
        int iIntValue;
        synchronized (this.f16573a) {
            try {
                iIntValue = this.f16574b.containsKey(qVar) ? ((Integer) this.f16574b.get(qVar)).intValue() : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iIntValue;
    }

    public final void i(b5.q qVar) {
        synchronized (this.f16573a) {
            try {
                Integer num = (Integer) this.f16574b.get(qVar);
                if (num == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.f16576d);
                arrayList.remove(qVar);
                this.f16576d = Collections.unmodifiableList(arrayList);
                if (num.intValue() == 1) {
                    this.f16574b.remove(qVar);
                    HashSet hashSet = new HashSet(this.f16575c);
                    hashSet.remove(qVar);
                    this.f16575c = Collections.unmodifiableSet(hashSet);
                } else {
                    this.f16574b.put(qVar, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it;
        synchronized (this.f16573a) {
            it = this.f16576d.iterator();
        }
        return it;
    }
}
