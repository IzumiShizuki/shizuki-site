package c2;

import hf.r1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r1 f3262d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f3263e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i0 f3264f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f3265g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(i0 i0Var, ac.c cVar) {
        super(cVar);
        this.f3264f = i0Var;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f3263e = obj;
        this.f3265g |= Integer.MIN_VALUE;
        return this.f3264f.f(0L, null, this);
    }
}
