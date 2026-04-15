package a0;

import s.v0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g0 f29d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public v0 f30e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ac.i f31f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f32g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g0 f33h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f34i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(g0 g0Var, ac.c cVar) {
        super(cVar);
        this.f33h = g0Var;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f32g = obj;
        this.f34i |= Integer.MIN_VALUE;
        return this.f33h.b(null, null, this);
    }
}
