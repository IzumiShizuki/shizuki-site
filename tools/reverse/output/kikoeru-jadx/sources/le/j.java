package le;

/* JADX INFO: loaded from: classes.dex */
public final class j implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ic.a f12326b;

    public /* synthetic */ j(int i10, ic.a aVar) {
        this.f12325a = i10;
        this.f12326b = aVar;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f12325a) {
            case 0:
                o oVar = (o) this.f12326b.b();
                return oVar instanceof k ? ((k) oVar).h() : oVar;
            default:
                return vb.m.K0((Iterable) this.f12326b.b());
        }
    }
}
