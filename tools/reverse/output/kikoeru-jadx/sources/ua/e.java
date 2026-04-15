package ua;

import hf.y;
import ic.n;
import r.z0;
import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e extends ac.i implements n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f21495e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f21496f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f21497g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r.c f21498h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ta.c f21499i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f21500j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(boolean z10, r.c cVar, ta.c cVar2, long j10, yb.c cVar3, int i10) {
        super(2, cVar3);
        this.f21495e = i10;
        this.f21497g = z10;
        this.f21498h = cVar;
        this.f21499i = cVar2;
        this.f21500j = j10;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f21495e) {
            case 0:
                return new e(this.f21497g, this.f21498h, this.f21499i, this.f21500j, cVar, 0);
            default:
                return new e(this.f21497g, this.f21498h, this.f21499i, this.f21500j, cVar, 1);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        y yVar = (y) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f21495e) {
        }
        return ((e) o(yVar, cVar)).u(a0.f21526a);
    }

    @Override // ac.a
    public final Object u(Object obj) {
        switch (this.f21495e) {
            case 0:
                int i10 = this.f21496f;
                if (i10 == 0) {
                    ub.a.f(obj);
                    boolean z10 = this.f21497g;
                    long j10 = this.f21500j;
                    ta.c cVar = this.f21499i;
                    zb.a aVar = zb.a.f26667a;
                    if (z10) {
                        p1.b bVar = new p1.b(nh.b.C(cVar, j10));
                        z0 z0VarQ = r.d.q(6, null);
                        this.f21496f = 2;
                        if (r.c.d(this.f21498h, bVar, z0VarQ, null, this, 12) == aVar) {
                            return aVar;
                        }
                    } else {
                        p1.b bVar2 = new p1.b(nh.b.C(cVar, j10));
                        this.f21496f = 1;
                        if (this.f21498h.f(bVar2, this) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i10 != 1 && i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                }
                return a0.f21526a;
            default:
                int i11 = this.f21496f;
                if (i11 == 0) {
                    ub.a.f(obj);
                    boolean z11 = this.f21497g;
                    long j11 = this.f21500j;
                    ta.c cVar2 = this.f21499i;
                    zb.a aVar2 = zb.a.f26667a;
                    if (z11) {
                        p1.b bVar3 = new p1.b(nh.b.C(cVar2, j11));
                        z0 z0VarQ2 = r.d.q(6, null);
                        this.f21496f = 2;
                        if (r.c.d(this.f21498h, bVar3, z0VarQ2, null, this, 12) == aVar2) {
                            return aVar2;
                        }
                        return a0.f21526a;
                    }
                    p1.b bVar4 = new p1.b(nh.b.C(cVar2, j11));
                    this.f21496f = 1;
                    if (this.f21498h.f(bVar4, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1 && i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                }
                return a0.f21526a;
        }
    }
}
