package df;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c implements k, d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f5976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5977b;

    public c(k kVar, int i10) {
        jc.l.e(kVar, "sequence");
        this.f5976a = kVar;
        this.f5977b = i10;
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + '.').toString());
    }

    @Override // df.d
    public final k a(int i10) {
        int i11 = this.f5977b + i10;
        return i11 < 0 ? new c(this, i10) : new c(this.f5976a, i11);
    }

    @Override // df.k
    public final Iterator iterator() {
        return new b(this);
    }
}
