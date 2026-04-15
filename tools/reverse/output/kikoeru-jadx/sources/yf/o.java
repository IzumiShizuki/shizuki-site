package yf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o extends a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final xf.e f26297f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f26298g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f26299h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(xf.c cVar, xf.e eVar) {
        super(cVar, null);
        jc.l.e(cVar, "json");
        this.f26297f = eVar;
        this.f26298g = eVar.f24993a.size();
        this.f26299h = -1;
    }

    @Override // yf.a
    public final xf.m E(String str) {
        jc.l.e(str, "tag");
        return (xf.m) this.f26297f.f24993a.get(Integer.parseInt(str));
    }

    @Override // yf.a
    public final String Q(uf.g gVar, int i10) {
        jc.l.e(gVar, "descriptor");
        return String.valueOf(i10);
    }

    @Override // yf.a
    public final xf.m S() {
        return this.f26297f;
    }

    @Override // vf.a
    public final int b(uf.g gVar) {
        jc.l.e(gVar, "descriptor");
        int i10 = this.f26299h;
        if (i10 >= this.f26298g - 1) {
            return -1;
        }
        int i11 = i10 + 1;
        this.f26299h = i11;
        return i11;
    }
}
