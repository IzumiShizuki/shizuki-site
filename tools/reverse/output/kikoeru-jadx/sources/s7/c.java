package s7;

import i7.g2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f19546d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g2 f19547e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f19548f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d f19549g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f19550h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, ac.c cVar) {
        super(cVar);
        this.f19549g = dVar;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f19548f = obj;
        this.f19550h |= Integer.MIN_VALUE;
        return this.f19549g.b(null, 0, this);
    }
}
