package df;

import java.util.Iterator;
import wf.x;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o implements Iterable, kc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6003b;

    public /* synthetic */ o(int i10, Object obj) {
        this.f6002a = i10;
        this.f6003b = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f6002a) {
            case 0:
                return ((k) this.f6003b).iterator();
            case 1:
                return new jc.b((x) this.f6003b);
            case 2:
                return jc.k.a((Object[]) this.f6003b);
            default:
                return new b((Iterator) ((ic.a) this.f6003b).b());
        }
    }
}
