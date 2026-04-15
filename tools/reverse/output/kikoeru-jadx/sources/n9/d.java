package n9;

import i7.g;

/* JADX INFO: loaded from: classes.dex */
public final class d extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f15665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15666e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g f15667f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, yb.c cVar) {
        super(cVar);
        this.f15667f = gVar;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f15665d = obj;
        this.f15666e |= Integer.MIN_VALUE;
        return this.f15667f.n(null, this);
    }
}
