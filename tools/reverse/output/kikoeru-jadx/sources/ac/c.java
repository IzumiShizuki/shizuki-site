package ac;

import hf.k;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jc.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class c extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yb.h f302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient yb.c f303c;

    public c(yb.c cVar, yb.h hVar) {
        super(cVar);
        this.f302b = hVar;
    }

    @Override // yb.c
    public yb.h s() {
        yb.h hVar = this.f302b;
        l.b(hVar);
        return hVar;
    }

    @Override // ac.a
    public void w() {
        yb.c cVar = this.f303c;
        if (cVar != null && cVar != this) {
            yb.f fVarR = s().R(yb.d.f26087a);
            l.b(fVarR);
            nf.g gVar = (nf.g) cVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = nf.g.f15826h;
            while (atomicReferenceFieldUpdater.get(gVar) == nf.b.f15816c) {
            }
            Object obj = atomicReferenceFieldUpdater.get(gVar);
            k kVar = obj instanceof k ? (k) obj : null;
            if (kVar != null) {
                kVar.n();
            }
        }
        this.f303c = b.f301a;
    }

    public c(yb.c cVar) {
        this(cVar, cVar != null ? cVar.s() : null);
    }
}
