package m9;

import i7.s0;

/* JADX INFO: loaded from: classes.dex */
public final class k extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f15031d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15032e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s0 f15033f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(s0 s0Var, yb.c cVar) {
        super(cVar);
        this.f15033f = s0Var;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f15031d = obj;
        this.f15032e |= Integer.MIN_VALUE;
        return this.f15033f.n(null, this);
    }
}
