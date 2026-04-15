package e0;

import a0.o;
import b0.s1;
import g2.c0;
import hf.a0;
import i2.g1;
import i2.y;
import j1.p;
import u.g;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f extends p implements n2.a, y {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public g f6058o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f6059p;

    public static final p1.c B0(f fVar, g1 g1Var, s1 s1Var) {
        p1.c cVar;
        if (fVar.f9703n && fVar.f6059p) {
            g1 g1VarX = i2.f.x(fVar);
            if (!g1Var.M0().f9703n) {
                g1Var = null;
            }
            if (g1Var != null && (cVar = (p1.c) s1Var.b()) != null) {
                return cVar.i(g1VarX.s(g1Var, false).d());
            }
        }
        return null;
    }

    @Override // i2.y
    public final void B(c0 c0Var) {
        this.f6059p = true;
    }

    @Override // j1.p
    public final boolean o0() {
        return false;
    }

    @Override // n2.a
    public final Object t(g1 g1Var, s1 s1Var, ac.c cVar) {
        Object objK = a0.k(new e(this, g1Var, s1Var, new o(this, g1Var, s1Var, 2), null), cVar);
        return objK == zb.a.f26667a ? objK : ub.a0.f21526a;
    }

    @Override // i2.y
    public final /* synthetic */ void m(long j10) {
    }
}
