package hf;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m extends g1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8568e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k f8569f;

    public /* synthetic */ m(k kVar, int i10) {
        this.f8568e = i10;
        this.f8569f = kVar;
    }

    @Override // hf.g1
    public final boolean k() {
        switch (this.f8568e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // hf.g1
    public final void l(Throwable th2) {
        switch (this.f8568e) {
            case 0:
                k1 k1VarJ = j();
                k kVar = this.f8569f;
                Throwable thP = kVar.p(k1VarJ);
                if (kVar.y()) {
                    nf.g gVar = (nf.g) kVar.f8560d;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = nf.g.f15826h;
                    while (true) {
                        Object obj = atomicReferenceFieldUpdater.get(gVar);
                        app.nekogram.translator.r rVar = nf.b.f15816c;
                        if (jc.l.a(obj, rVar)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(gVar, rVar, thP)) {
                                if (atomicReferenceFieldUpdater.get(gVar) != rVar) {
                                }
                                break;
                            }
                        } else if (!(obj instanceof Throwable)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(gVar, obj, null)) {
                                if (atomicReferenceFieldUpdater.get(gVar) != obj) {
                                }
                            }
                        }
                    }
                }
                kVar.t(thP);
                if (!kVar.y()) {
                    kVar.n();
                }
                break;
            default:
                this.f8569f.h(ub.a0.f21526a);
                break;
        }
    }
}
