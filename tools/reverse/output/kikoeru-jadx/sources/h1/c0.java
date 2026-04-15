package h1;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends d0 implements Iterator, kc.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f7995f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(v vVar, Iterator it, int i10) {
        super(vVar, it);
        this.f7995f = i10;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f7995f) {
            case 0:
                a();
                if (((Map.Entry) this.f8001d) != null) {
                    return new b0(this);
                }
                throw new IllegalStateException();
            case 1:
                Map.Entry entry = (Map.Entry) this.f8002e;
                if (entry == null) {
                    throw new IllegalStateException();
                }
                a();
                return entry.getKey();
            default:
                Map.Entry entry2 = (Map.Entry) this.f8002e;
                if (entry2 == null) {
                    throw new IllegalStateException();
                }
                a();
                return entry2.getValue();
        }
    }
}
