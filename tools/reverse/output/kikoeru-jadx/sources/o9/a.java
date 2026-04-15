package o9;

import ac.c;
import i7.g;

/* JADX INFO: loaded from: classes.dex */
public final class a extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f16284d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16285e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g f16286f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(g gVar, yb.c cVar) {
        super(cVar);
        this.f16286f = gVar;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f16284d = obj;
        this.f16285e |= Integer.MIN_VALUE;
        return this.f16286f.n(null, this);
    }
}
