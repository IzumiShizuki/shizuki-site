package de;

/* JADX INFO: loaded from: classes.dex */
public final class f implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f5901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vc.i f5902c;

    public /* synthetic */ f(i iVar, vc.i iVar2, int i10) {
        this.f5900a = i10;
        this.f5901b = iVar;
        this.f5902c = iVar2;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f5900a) {
            case 0:
                i iVar = this.f5901b;
                return ef.n.T0(iVar.n().a(this.f5902c.j(vc.n.C), iVar), "Collection");
            default:
                i iVar2 = this.f5901b;
                return ef.n.T0(iVar2.n().a(this.f5902c.k("Array"), iVar2), "Array");
        }
    }
}
