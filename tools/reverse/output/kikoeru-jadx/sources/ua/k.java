package ua;

import ic.n;
import jc.m;
import ub.a0;
import x0.o;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k extends m implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f21521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ta.c f21522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f21523d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f21524e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(long j10, ta.c cVar, float f10, int i10) {
        super(2);
        this.f21521b = j10;
        this.f21522c = cVar;
        this.f21523d = f10;
        this.f21524e = i10;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        l.F(this.f21521b, this.f21522c, this.f21523d, (o) obj, this.f21524e | 1);
        return a0.f21526a;
    }
}
