package s;

import android.view.KeyEvent;
import u.n2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class q extends d {
    @Override // s.d
    public final Object F0(c2.x xVar, yb.c cVar) {
        p pVar = new p(this, null, 0);
        q.a0 a0Var = new q.a0(8, this);
        i7.k kVar = n2.f21015a;
        Object objK = hf.a0.k(new f7.w(xVar, pVar, a0Var, new u.i1(xVar), (yb.c) null), cVar);
        ub.a0 a0Var2 = ub.a0.f21526a;
        zb.a aVar = zb.a.f26667a;
        if (objK != aVar) {
            objK = a0Var2;
        }
        return objK == aVar ? objK : a0Var2;
    }

    @Override // s.d
    public final boolean J0(KeyEvent keyEvent) {
        return false;
    }

    @Override // s.d
    public final void K0(KeyEvent keyEvent) {
        this.f19124v.b();
    }
}
