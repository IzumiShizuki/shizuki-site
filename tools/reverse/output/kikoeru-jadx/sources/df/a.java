package df;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f5972a;

    public a(k kVar) {
        this.f5972a = new AtomicReference(kVar);
    }

    @Override // df.k
    public final Iterator iterator() {
        k kVar = (k) this.f5972a.getAndSet(null);
        if (kVar != null) {
            return kVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
