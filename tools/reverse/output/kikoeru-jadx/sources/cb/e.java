package cb;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e extends android.support.v4.media.session.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3847e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3848f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3849g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3850h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3851i;

    public e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(6);
        this.f3847e = atomicReferenceFieldUpdater;
        this.f3848f = atomicReferenceFieldUpdater2;
        this.f3849g = atomicReferenceFieldUpdater3;
        this.f3850h = atomicReferenceFieldUpdater4;
        this.f3851i = atomicReferenceFieldUpdater5;
    }

    @Override // android.support.v4.media.session.b
    public final d E(p pVar) {
        return (d) this.f3850h.getAndSet(pVar, d.f3842d);
    }

    @Override // android.support.v4.media.session.b
    public final o F(p pVar) {
        return (o) this.f3849g.getAndSet(pVar, o.f3865c);
    }

    @Override // android.support.v4.media.session.b
    public final void R(o oVar, o oVar2) {
        this.f3848f.lazySet(oVar, oVar2);
    }

    @Override // android.support.v4.media.session.b
    public final void S(o oVar, Thread thread) {
        this.f3847e.lazySet(oVar, thread);
    }

    @Override // android.support.v4.media.session.b
    public final boolean v(p pVar, d dVar, d dVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f3850h;
            if (atomicReferenceFieldUpdater.compareAndSet(pVar, dVar, dVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(pVar) == dVar);
        return false;
    }

    @Override // android.support.v4.media.session.b
    public final boolean w(p pVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f3851i;
            if (atomicReferenceFieldUpdater.compareAndSet(pVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(pVar) == obj);
        return false;
    }

    @Override // android.support.v4.media.session.b
    public final boolean x(p pVar, o oVar, o oVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f3849g;
            if (atomicReferenceFieldUpdater.compareAndSet(pVar, oVar, oVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(pVar) == oVar);
        return false;
    }
}
