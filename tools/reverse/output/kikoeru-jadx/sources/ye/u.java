package ye;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class u implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ic.k f26268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f26269b;

    public u(String str, ic.k kVar) {
        this.f26268a = kVar;
        this.f26269b = "must return ".concat(str);
    }

    @Override // ye.e
    public final boolean a(nd.e eVar) {
        return jc.l.a(eVar.f2717g, this.f26268a.a(ie.d.e(eVar)));
    }

    @Override // ye.e
    public final String b() {
        return this.f26269b;
    }

    @Override // ye.e
    public final /* bridge */ String c(nd.e eVar) {
        return ua.j.p(this, eVar);
    }
}
