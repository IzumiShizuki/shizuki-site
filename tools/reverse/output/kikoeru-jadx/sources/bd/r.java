package bd;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r extends j0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2663g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(yc.y yVar, be.c cVar, int i10) {
        super(yVar, cVar);
        this.f2663g = i10;
        switch (i10) {
            case 1:
                super(yVar, cVar);
                break;
            default:
                jc.l.e(yVar, "module");
                jc.l.e(cVar, "fqName");
                break;
        }
    }

    @Override // yc.d0
    public final /* bridge */ /* synthetic */ le.o n0() {
        switch (this.f2663g) {
        }
        return le.n.f12335b;
    }
}
