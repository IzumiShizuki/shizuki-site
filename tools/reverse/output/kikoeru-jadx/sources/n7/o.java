package n7;

import i7.p2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f15557d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p2 f15558e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15559f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p2 p2Var, ac.c cVar) {
        super(cVar);
        this.f15558e = p2Var;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f15557d = obj;
        this.f15559f |= Integer.MIN_VALUE;
        this.f15558e.o(null, this);
        return zb.a.f26667a;
    }
}
