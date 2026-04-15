package yf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m extends a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final xf.m f26292f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(xf.c cVar, xf.m mVar, String str) {
        super(cVar, str);
        jc.l.e(cVar, "json");
        jc.l.e(mVar, "value");
        this.f26292f = mVar;
        this.f26275a.add("primitive");
    }

    @Override // yf.a
    public final xf.m E(String str) {
        jc.l.e(str, "tag");
        if (str == "primitive") {
            return this.f26292f;
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag");
    }

    @Override // yf.a
    public final xf.m S() {
        return this.f26292f;
    }

    @Override // vf.a
    public final int b(uf.g gVar) {
        jc.l.e(gVar, "descriptor");
        return 0;
    }
}
