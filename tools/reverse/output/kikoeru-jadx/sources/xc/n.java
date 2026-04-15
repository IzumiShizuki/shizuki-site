package xc;

import bd.h0;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import vb.t;
import yc.d0;
import yc.g0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final re.l f24952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f24953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public oe.i f24954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final re.j f24955d;

    public n(re.l lVar, dd.b bVar, h0 h0Var) {
        this.f24952a = lVar;
        this.f24953b = h0Var;
        this.f24955d = lVar.c(new bd.a(14, this));
    }

    @Override // yc.g0
    public final void a(be.c cVar, ArrayList arrayList) {
        jc.l.e(cVar, "fqName");
        bf.m.a(arrayList, this.f24955d.a(cVar));
    }

    @Override // yc.g0
    public final boolean b(be.c cVar) {
        jc.l.e(cVar, "fqName");
        re.j jVar = this.f24955d;
        Object obj = ((ConcurrentHashMap) jVar.f19003c).get(cVar);
        return ((obj == null || obj == re.k.f19006b) ? c(cVar) : (d0) jVar.a(cVar)) == null;
    }

    public final pe.c c(be.c cVar) {
        InputStream inputStreamF;
        jc.l.e(cVar, "fqName");
        be.e eVar = vc.o.f22907j;
        jc.l.e(eVar, "segment");
        if (cVar.f2744a.h(eVar)) {
            pe.a.f17104m.getClass();
            inputStreamF = pe.d.F(pe.a.a(cVar));
        } else {
            inputStreamF = null;
        }
        if (inputStreamF != null) {
            return n7.e.g(cVar, this.f24952a, this.f24953b, inputStreamF);
        }
        return null;
    }

    @Override // yc.g0
    public final Collection p(be.c cVar, ic.k kVar) {
        jc.l.e(cVar, "fqName");
        return t.f22821a;
    }
}
