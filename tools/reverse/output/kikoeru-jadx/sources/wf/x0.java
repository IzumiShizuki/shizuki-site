package wf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class x0 implements sf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sf.a f24205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i1 f24206b;

    public x0(sf.a aVar) {
        jc.l.e(aVar, "serializer");
        this.f24205a = aVar;
        this.f24206b = new i1(aVar.a());
    }

    @Override // sf.a
    public final uf.g a() {
        return this.f24206b;
    }

    @Override // sf.a
    public final Object b(vf.b bVar) {
        if (bVar.v()) {
            return bVar.d(this.f24205a);
        }
        return null;
    }

    @Override // sf.a
    public final void d(yf.t tVar, Object obj) {
        if (obj != null) {
            tVar.s(this.f24205a, obj);
        } else {
            tVar.p();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && x0.class == obj.getClass() && jc.l.a(this.f24205a, ((x0) obj).f24205a);
    }

    public final int hashCode() {
        return this.f24205a.hashCode();
    }
}
