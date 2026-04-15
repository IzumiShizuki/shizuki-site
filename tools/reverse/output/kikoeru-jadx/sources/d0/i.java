package d0;

import b0.i1;
import b0.l1;
import s.v0;
import u.e1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i implements i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f5342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f5343b;

    public i(d dVar, boolean z10) {
        this.f5342a = dVar;
        this.f5343b = z10;
    }

    @Override // b0.i1
    public final int a() {
        d dVar = this.f5342a;
        return (int) (dVar.k().f5415e == e1.f20882a ? dVar.k().c() & 4294967295L : dVar.k().c() >> 32);
    }

    @Override // b0.i1
    public final float b() {
        return gh.g.r(this.f5342a);
    }

    @Override // b0.i1
    public final int c() {
        d dVar = this.f5342a;
        return (-dVar.k().f5416f) + dVar.k().f5414d;
    }

    @Override // b0.i1
    public final float d() {
        d dVar = this.f5342a;
        return j0.a(dVar.k(), dVar.l());
    }

    @Override // b0.i1
    public final q2.b e() {
        boolean z10 = this.f5343b;
        d dVar = this.f5342a;
        return z10 ? new q2.b(dVar.l(), 1) : new q2.b(1, dVar.l());
    }

    @Override // b0.i1
    public final Object f(int i10, l1 l1Var) {
        d dVar = this.f5342a;
        Object objB = dVar.b(v0.f19292a, new ba.i0(dVar, i10, null, 1), l1Var);
        ub.a0 a0Var = ub.a0.f21526a;
        zb.a aVar = zb.a.f26667a;
        if (objB != aVar) {
            objB = a0Var;
        }
        return objB == aVar ? objB : a0Var;
    }
}
