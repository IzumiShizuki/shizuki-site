package n8;

import c7.p;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p f15655d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g f15656e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f15657f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p f15658g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f15659h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p pVar, ac.c cVar) {
        super(cVar);
        this.f15658g = pVar;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f15657f = obj;
        this.f15659h |= Integer.MIN_VALUE;
        return this.f15658g.c(null, this);
    }
}
