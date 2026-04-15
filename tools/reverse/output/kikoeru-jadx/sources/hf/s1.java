package hf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s1 extends nf.q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8589e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s1(yb.h hVar, yb.c cVar, int i10) {
        super(cVar, hVar);
        this.f8589e = i10;
    }

    @Override // hf.k1
    public final boolean E(Throwable th2) {
        switch (this.f8589e) {
            case 0:
                return false;
            default:
                if (th2 instanceof mf.k) {
                    return true;
                }
                return w(th2);
        }
    }
}
