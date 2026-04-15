package bd;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s implements ic.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f2667b;

    public /* synthetic */ s(u uVar, int i10) {
        this.f2666a = i10;
        this.f2667b = uVar;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f2666a) {
            case 0:
                be.e eVar = (be.e) obj;
                if (eVar != null) {
                    u uVar = this.f2667b;
                    return uVar.j(eVar, uVar.i().f(eVar, gd.b.f7519f));
                }
                u.h(8);
                throw null;
            default:
                be.e eVar2 = (be.e) obj;
                if (eVar2 != null) {
                    u uVar2 = this.f2667b;
                    return uVar2.j(eVar2, uVar2.i().b(eVar2, gd.b.f7519f));
                }
                u.h(4);
                throw null;
        }
    }
}
