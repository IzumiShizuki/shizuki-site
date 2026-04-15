package androidx.compose.foundation;

import android.view.KeyEvent;
import d0.m;
import gh.g;
import j1.n;
import j1.q;
import q.t0;
import q1.h0;
import q1.l0;
import q1.z;
import q2.h;
import s.f0;
import s.m0;
import s.r0;
import s.s;
import u.e1;
import u.p0;
import u.v1;
import w.k;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static q a(q qVar, z zVar) {
        return qVar.e(new BackgroundElement(0L, zVar, h0.f17515a, 1));
    }

    public static final q b(q qVar, long j10, l0 l0Var) {
        return qVar.e(new BackgroundElement(j10, null, l0Var, 2));
    }

    public static q c(q qVar, k kVar, m0 m0Var, boolean z10, h hVar, ic.a aVar, int i10) {
        q qVarE;
        boolean z11 = (i10 & 4) != 0 ? true : z10;
        if ((i10 & 16) != 0) {
            hVar = null;
        }
        h hVar2 = hVar;
        if (m0Var instanceof r0) {
            qVarE = new ClickableElement(kVar, (r0) m0Var, z11, null, hVar2, aVar);
        } else if (m0Var == null) {
            qVarE = new ClickableElement(kVar, null, z11, null, hVar2, aVar);
        } else {
            n nVar = n.f9689a;
            qVarE = kVar != null ? f.a(nVar, kVar, m0Var).e(new ClickableElement(kVar, null, z11, null, hVar2, aVar)) : j1.a.a(nVar, new c(m0Var, z11, null, hVar2, aVar));
        }
        return qVar.e(qVarE);
    }

    public static q d(q qVar, String str, ic.a aVar, int i10) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        return j1.a.a(qVar, new b(true, str, aVar));
    }

    public static final q e(q qVar, k kVar, r0 r0Var, h hVar, ic.a aVar, ic.a aVar2) {
        q qVarE;
        if (t0.M(r0Var)) {
            qVarE = new CombinedClickableElement(aVar2, aVar, null, hVar, r0Var, kVar);
        } else if (r0Var == null) {
            qVarE = new CombinedClickableElement(aVar2, aVar, null, hVar, null, kVar);
        } else {
            n nVar = n.f9689a;
            qVarE = kVar != null ? f.a(nVar, kVar, r0Var).e(new CombinedClickableElement(aVar2, aVar, null, hVar, null, kVar)) : j1.a.a(nVar, new e(r0Var, hVar, aVar2, aVar, null));
        }
        return qVar.e(qVarE);
    }

    public static q f(q qVar, ic.a aVar, ic.a aVar2, ic.a aVar3, int i10) {
        if ((i10 & 32) != 0) {
            aVar2 = null;
        }
        return j1.a.a(qVar, new d(aVar, aVar2, aVar3));
    }

    public static final q g(q qVar, boolean z10, k kVar) {
        return qVar.e(z10 ? new FocusableElement(kVar) : n.f9689a);
    }

    public static final q h(q qVar, k kVar) {
        return qVar.e(new HoverableElement(kVar));
    }

    public static final boolean i(KeyEvent keyEvent) {
        long jL = a2.c.L(keyEvent);
        int i10 = a2.a.f187r;
        if (a2.a.a(jL, a2.a.f177h) ? true : a2.a.a(jL, a2.a.f180k) ? true : a2.a.a(jL, a2.a.f186q)) {
            return true;
        }
        return a2.a.a(jL, a2.a.f179j);
    }

    public static final q j(q qVar, v1 v1Var, e1 e1Var, boolean z10, p0 p0Var, k kVar, boolean z11, s.f fVar, m mVar) {
        float f10 = s.f19268a;
        e1 e1Var2 = e1.f20882a;
        n nVar = n.f9689a;
        return qVar.e(e1Var == e1Var2 ? g.k(nVar, f0.f19150c) : g.k(nVar, f0.f19149b)).e(new ScrollingContainerElement(fVar, mVar, p0Var, e1Var, v1Var, kVar, z10, z11));
    }
}
