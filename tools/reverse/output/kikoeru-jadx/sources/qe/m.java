package qe;

/* JADX INFO: loaded from: classes.dex */
public final class m implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f18194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f18195c;

    public /* synthetic */ m(n nVar, o oVar, int i10) {
        this.f18193a = i10;
        this.f18194b = nVar;
        this.f18195c = oVar;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f18193a) {
            case 0:
                return ud.e.J(this.f18194b.f18197a.keySet(), this.f18195c.o());
            default:
                return ud.e.J(this.f18194b.f18198b.keySet(), this.f18195c.p());
        }
    }
}
