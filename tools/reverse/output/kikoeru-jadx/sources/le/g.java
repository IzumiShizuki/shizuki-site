package le;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g extends ee.m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f12319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f12320d;

    public g(ArrayList arrayList, h hVar) {
        this.f12319c = arrayList;
        this.f12320d = hVar;
    }

    @Override // ee.m
    public final void b(yc.c cVar) {
        jc.l.e(cVar, "fakeOverride");
        ee.l.r(cVar, null);
        this.f12319c.add(cVar);
    }

    @Override // ee.m
    public final void d(yc.c cVar, yc.c cVar2) {
        jc.l.e(cVar2, "fromCurrent");
        throw new IllegalStateException(("Conflict in scope of " + this.f12320d.f12322b + ": " + cVar + " vs " + cVar2).toString());
    }
}
