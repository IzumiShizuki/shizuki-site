package ua;

import ic.n;
import j1.q;
import jc.m;
import ub.a0;
import x0.o;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a extends m implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21487b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f21488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ta.c f21489d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ic.k f21490e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(q qVar, ic.k kVar, ta.c cVar, int i10) {
        super(2);
        this.f21488c = qVar;
        this.f21490e = kVar;
        this.f21489d = cVar;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        int i10 = this.f21487b;
        o oVar = (o) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                nd.h.a(1, this.f21490e, this.f21488c, this.f21489d, oVar);
                break;
            default:
                j.a(27703, this.f21490e, this.f21488c, this.f21489d, oVar);
                break;
        }
        return a0.f21526a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(q qVar, ta.c cVar, ic.k kVar, int i10) {
        super(2);
        this.f21488c = qVar;
        this.f21489d = cVar;
        this.f21490e = kVar;
    }
}
