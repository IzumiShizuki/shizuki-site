package lf;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b extends mf.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f12361f = AtomicIntegerFieldUpdater.newUpdater(b.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kf.t f12362d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f12363e;

    public /* synthetic */ b(kf.t tVar, boolean z10) {
        this(tVar, z10, yb.i.f26088a, -3, kf.a.f11336a);
    }

    @Override // mf.e, lf.f
    public final Object b(g gVar, yb.c cVar) throws Throwable {
        int i10 = this.f15136b;
        zb.a aVar = zb.a.f26667a;
        if (i10 == -3) {
            boolean z10 = this.f12363e;
            if (z10 && f12361f.getAndSet(this, 1) == 1) {
                throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
            }
            Object objL = p0.l(gVar, this.f12362d, z10, cVar);
            if (objL == aVar) {
                return objL;
            }
        } else {
            Object objB = super.b(gVar, cVar);
            if (objB == aVar) {
                return objB;
            }
        }
        return ub.a0.f21526a;
    }

    @Override // mf.e
    public final String d() {
        return "channel=" + this.f12362d;
    }

    @Override // mf.e
    public final Object e(kf.s sVar, w0 w0Var) throws Throwable {
        Object objL = p0.l(new mf.s(sVar), this.f12362d, this.f12363e, w0Var);
        return objL == zb.a.f26667a ? objL : ub.a0.f21526a;
    }

    @Override // mf.e
    public final mf.e f(yb.h hVar, int i10, kf.a aVar) {
        return new b(this.f12362d, this.f12363e, hVar, i10, aVar);
    }

    @Override // mf.e
    public final f g() {
        return new b(this.f12362d, this.f12363e);
    }

    @Override // mf.e
    public final kf.t h(hf.y yVar) {
        if (this.f12363e && f12361f.getAndSet(this, 1) == 1) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
        }
        return this.f15136b == -3 ? this.f12362d : super.h(yVar);
    }

    public b(kf.t tVar, boolean z10, yb.h hVar, int i10, kf.a aVar) {
        super(hVar, i10, aVar);
        this.f12362d = tVar;
        this.f12363e = z10;
    }
}
