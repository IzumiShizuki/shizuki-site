package p7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l implements s, n7.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16898b;

    public /* synthetic */ l(int i10, Object obj) {
        this.f16897a = i10;
        this.f16898b = obj;
    }

    @Override // n7.q
    public final Object a(String str, ic.k kVar, ac.c cVar) {
        switch (this.f16897a) {
            case 0:
                return ((r) this.f16898b).a(str, kVar, cVar);
            default:
                return ((q7.d) this.f16898b).a(str, kVar, cVar);
        }
    }

    @Override // p7.s
    public final z7.a c() {
        switch (this.f16897a) {
            case 0:
                return ((r) this.f16898b).f16925a;
            default:
                return ((q7.d) this.f16898b).f17899a;
        }
    }
}
