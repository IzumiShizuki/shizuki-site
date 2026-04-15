package df;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f5984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ic.k f5985c;

    public f(k kVar, ic.k kVar2, int i10) {
        this.f5983a = i10;
        switch (i10) {
            case 1:
                jc.l.e(kVar, "sequence");
                this.f5984b = kVar;
                this.f5985c = kVar2;
                break;
            default:
                this.f5984b = kVar;
                this.f5985c = kVar2;
                break;
        }
    }

    @Override // df.k
    public final Iterator iterator() {
        switch (this.f5983a) {
            case 0:
                return new e(this);
            default:
                return new e(this, (byte) 0);
        }
    }
}
