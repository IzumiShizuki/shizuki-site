package df;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f6007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ic.k f6008b;

    public r(k kVar, ic.k kVar2) {
        jc.l.e(kVar2, "transformer");
        this.f6007a = kVar;
        this.f6008b = kVar2;
    }

    @Override // df.k
    public final Iterator iterator() {
        return new q(this);
    }
}
