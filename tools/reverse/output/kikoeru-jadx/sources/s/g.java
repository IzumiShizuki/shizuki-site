package s;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f19153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f3.c f19154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f19155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y.d1 f19156d;

    public g(Context context, f3.c cVar, long j10, y.d1 d1Var) {
        this.f19153a = context;
        this.f19154b = cVar;
        this.f19155c = j10;
        this.f19156d = d1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!g.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        jc.l.c(obj, "null cannot be cast to non-null type androidx.compose.foundation.AndroidEdgeEffectOverscrollFactory");
        g gVar = (g) obj;
        return jc.l.a(this.f19153a, gVar.f19153a) && jc.l.a(this.f19154b, gVar.f19154b) && q1.q.c(this.f19155c, gVar.f19155c) && jc.l.a(this.f19156d, gVar.f19156d);
    }

    public final int hashCode() {
        int iHashCode = (this.f19154b.hashCode() + (this.f19153a.hashCode() * 31)) * 31;
        int i10 = q1.q.f17576i;
        return this.f19156d.hashCode() + q.t0.y(iHashCode, 31, this.f19155c);
    }
}
