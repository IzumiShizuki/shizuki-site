package rf;

import ba.l;
import e7.y;
import hf.c2;
import hf.h0;
import ic.o;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import nf.r;
import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b implements hf.j, c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hf.k f19014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f19015b;

    public b(c cVar, hf.k kVar) {
        this.f19015b = cVar;
        this.f19014a = kVar;
    }

    @Override // hf.c2
    public final void a(r rVar, int i10) {
        this.f19014a.a(rVar, i10);
    }

    @Override // yb.c
    public final void h(Object obj) {
        this.f19014a.h(obj);
    }

    @Override // hf.j
    public final void m(Object obj, o oVar) throws h0 {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f19016h;
        c cVar = this.f19015b;
        atomicReferenceFieldUpdater.set(cVar, null);
        y yVar = new y(13, cVar, this);
        hf.k kVar = this.f19014a;
        kVar.D(a0.f21526a, kVar.f8552c, new l(4, yVar));
    }

    @Override // yb.c
    public final yb.h s() {
        return this.f19014a.f8561e;
    }

    @Override // hf.j
    public final boolean t(Throwable th2) {
        return this.f19014a.t(th2);
    }

    @Override // hf.j
    public final app.nekogram.translator.r v(Object obj, o oVar) {
        c cVar = this.f19015b;
        l lVar = new l(cVar, this);
        app.nekogram.translator.r rVarG = this.f19014a.G((a0) obj, lVar);
        if (rVarG != null) {
            c.f19016h.set(cVar, null);
        }
        return rVarG;
    }

    @Override // hf.j
    public final void z(Object obj) throws h0 {
        this.f19014a.z(obj);
    }
}
