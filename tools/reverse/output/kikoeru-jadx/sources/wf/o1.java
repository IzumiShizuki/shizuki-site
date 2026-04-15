package wf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o1 implements sf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sf.a f24156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sf.a f24157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sf.a f24158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final uf.h f24159d = ud.e.e("kotlin.Triple", new uf.g[0], new e7.y(20, this));

    public o1(sf.a aVar, sf.a aVar2, sf.a aVar3) {
        this.f24156a = aVar;
        this.f24157b = aVar2;
        this.f24158c = aVar3;
    }

    @Override // sf.a
    public final uf.g a() {
        return this.f24159d;
    }

    @Override // sf.a
    public final Object b(vf.b bVar) {
        uf.h hVar = this.f24159d;
        vf.a aVarI = bVar.i(hVar);
        Object obj = z0.f24218c;
        Object objG = obj;
        Object objG2 = objG;
        Object objG3 = objG2;
        while (true) {
            int iB = aVarI.b(hVar);
            if (iB == -1) {
                aVarI.j(hVar);
                if (objG == obj) {
                    throw new sf.h("Element 'first' is missing");
                }
                if (objG2 == obj) {
                    throw new sf.h("Element 'second' is missing");
                }
                if (objG3 != obj) {
                    return new ub.q(objG, objG2, objG3);
                }
                throw new sf.h("Element 'third' is missing");
            }
            if (iB == 0) {
                objG = aVarI.g(hVar, 0, this.f24156a, null);
            } else if (iB == 1) {
                objG2 = aVarI.g(hVar, 1, this.f24157b, null);
            } else {
                if (iB != 2) {
                    throw new sf.h(q.t0.B(iB, "Unexpected index "));
                }
                objG3 = aVarI.g(hVar, 2, this.f24158c, null);
            }
        }
    }

    @Override // sf.a
    public final void d(yf.t tVar, Object obj) {
        ub.q qVar = (ub.q) obj;
        jc.l.e(qVar, "value");
        uf.h hVar = this.f24159d;
        yf.t tVarA = tVar.a(hVar);
        tVarA.r(hVar, 0, this.f24156a, qVar.f21553a);
        tVarA.r(hVar, 1, this.f24157b, qVar.f21554b);
        tVarA.r(hVar, 2, this.f24158c, qVar.f21555c);
        tVarA.w(hVar);
    }
}
