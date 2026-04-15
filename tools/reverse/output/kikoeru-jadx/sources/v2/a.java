package v2;

import android.text.SegmentFinder;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a extends SegmentFinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f22359a;

    public a(e eVar) {
        this.f22359a = eVar;
    }

    @Override // android.text.SegmentFinder
    public final int nextEndBoundary(int i10) {
        return this.f22359a.j(i10);
    }

    @Override // android.text.SegmentFinder
    public final int nextStartBoundary(int i10) {
        return this.f22359a.d(i10);
    }

    @Override // android.text.SegmentFinder
    public final int previousEndBoundary(int i10) {
        return this.f22359a.g(i10);
    }

    @Override // android.text.SegmentFinder
    public final int previousStartBoundary(int i10) {
        return this.f22359a.i(i10);
    }
}
