package ua;

import ic.n;
import jc.m;
import ub.a0;
import x0.o;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f extends m implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ta.c f21502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f21503d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f21504e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f21505f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int i10, ta.c cVar, boolean z10, boolean z11, int i11) {
        super(2);
        this.f21501b = i10;
        this.f21502c = cVar;
        this.f21503d = z10;
        this.f21504e = z11;
        this.f21505f = i11;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        nh.b.b(this.f21501b, this.f21502c, this.f21503d, this.f21504e, (o) obj, this.f21505f | 1);
        return a0.f21526a;
    }
}
