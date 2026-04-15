package wf;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class r extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sf.a f24170a;

    public r(sf.a aVar) {
        this.f24170a = aVar;
    }

    @Override // sf.a
    public void d(yf.t tVar, Object obj) {
        int iH = h(obj);
        uf.g gVarA = a();
        jc.l.e(gVarA, "descriptor");
        yf.t tVarA = tVar.a(gVarA);
        Iterator itG = g(obj);
        for (int i10 = 0; i10 < iH; i10++) {
            tVarA.r(a(), i10, this.f24170a, itG.next());
        }
        tVarA.w(gVarA);
    }

    @Override // wf.a
    public void j(vf.a aVar, int i10, Object obj) {
        m(i10, obj, aVar.g(a(), i10, this.f24170a, null));
    }

    public abstract void m(int i10, Object obj, Object obj2);
}
