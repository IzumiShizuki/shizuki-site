package rf;

import java.util.concurrent.atomic.AtomicReferenceArray;
import nf.r;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k extends r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f19033e;

    public k(long j10, k kVar, int i10) {
        super(j10, kVar, i10);
        this.f19033e = new AtomicReferenceArray(j.f19032f);
    }

    @Override // nf.r
    public final int g() {
        return j.f19032f;
    }

    @Override // nf.r
    public final void h(int i10, yb.h hVar) {
        this.f19033e.set(i10, j.f19031e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f15854c + ", hashCode=" + hashCode() + ']';
    }
}
