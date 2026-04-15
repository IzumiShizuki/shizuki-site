package df;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6001b;

    public /* synthetic */ n(int i10, Object obj) {
        this.f6000a = i10;
        this.f6001b = obj;
    }

    @Override // df.k
    public final Iterator iterator() {
        switch (this.f6000a) {
            case 0:
                return (Iterator) this.f6001b;
            case 1:
                return new bf.i(1, this.f6001b);
            case 2:
                return new ef.g((CharSequence) this.f6001b);
            case 3:
                return jc.k.a((Object[]) this.f6001b);
            default:
                return ((Iterable) this.f6001b).iterator();
        }
    }
}
