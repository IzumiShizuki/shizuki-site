package le;

/* JADX INFO: loaded from: classes.dex */
public final class r implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f12338b;

    public /* synthetic */ r(s sVar, int i10) {
        this.f12337a = i10;
        this.f12338b = sVar;
    }

    @Override // ic.a
    public final Object b() {
        int i10 = this.f12337a;
        s sVar = this.f12338b;
        switch (i10) {
            case 0:
                qe.h hVar = sVar.f12340b;
                return ud.b.x(ee.m.i(hVar), ee.m.j(hVar));
            default:
                return sVar.f12341c ? ud.b.y(ee.m.h(sVar.f12340b)) : vb.r.f22819a;
        }
    }
}
