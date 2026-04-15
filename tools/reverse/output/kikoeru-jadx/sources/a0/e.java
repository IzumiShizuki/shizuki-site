package a0;

import b0.i1;
import b0.l1;
import s.v0;
import u.e1;
import x0.b1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e implements i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f28a;

    public e(g0 g0Var) {
        this.f28a = g0Var;
    }

    @Override // b0.i1
    public final int a() {
        g0 g0Var = this.f28a;
        return (int) (g0Var.g().f128o == e1.f20882a ? g0Var.g().c() & 4294967295L : g0Var.g().c() >> 32);
    }

    @Override // b0.i1
    public final float b() {
        g0 g0Var = this.f28a;
        return (((b1) g0Var.f45d.f153b).e() * 500) + ((b1) g0Var.f45d.f154c).e();
    }

    @Override // b0.i1
    public final int c() {
        g0 g0Var = this.f28a;
        return (-g0Var.g().f125l) + g0Var.g().f129p;
    }

    @Override // b0.i1
    public final float d() {
        g0 g0Var = this.f28a;
        int iE = ((b1) g0Var.f45d.f153b).e();
        int iE2 = ((b1) g0Var.f45d.f154c).e();
        return g0Var.d() ? (iE * 500) + iE2 + 100 : (iE * 500) + iE2;
    }

    @Override // b0.i1
    public final q2.b e() {
        return new q2.b(-1, 1);
    }

    @Override // b0.i1
    public final Object f(int i10, l1 l1Var) {
        androidx.media3.exoplayer.offline.u uVar = g0.f41w;
        g0 g0Var = this.f28a;
        g0Var.getClass();
        Object objB = g0Var.b(v0.f19292a, new d0(g0Var, i10, null), l1Var);
        ub.a0 a0Var = ub.a0.f21526a;
        zb.a aVar = zb.a.f26667a;
        if (objB != aVar) {
            objB = a0Var;
        }
        return objB == aVar ? objB : a0Var;
    }
}
