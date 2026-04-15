package pd;

/* JADX INFO: loaded from: classes.dex */
public final class m implements ic.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f17052b;

    public /* synthetic */ m(n nVar, int i10) {
        this.f17051a = i10;
        this.f17052b = nVar;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        be.e eVar = (be.e) obj;
        switch (this.f17051a) {
            case 0:
                jc.l.e(eVar, "it");
                return this.f17052b.N(eVar);
            default:
                jc.l.e(eVar, "it");
                return this.f17052b.O(eVar);
        }
    }
}
