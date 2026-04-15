package androidx.compose.foundation.selection;

import j1.k;
import j1.q;
import m0.m5;
import q.t0;
import q2.h;
import s.m0;
import s.r0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final q a(q qVar, boolean z10, m0 m0Var, boolean z11, h hVar, ic.a aVar) {
        return qVar.e(m0Var instanceof r0 ? new SelectableElement(z10, null, (r0) m0Var, z11, hVar, aVar) : m0Var == null ? new SelectableElement(z10, null, null, z11, hVar, aVar) : new k(new b(m0Var, z10, z11, hVar, aVar)));
    }

    public static q b(boolean z10, h hVar, ic.a aVar) {
        return new k(new a(z10, hVar, aVar));
    }

    public static final q c(boolean z10, w.k kVar, boolean z11, h hVar, ic.k kVar2) {
        return new ToggleableElement(z10, kVar, z11, hVar, kVar2);
    }

    public static final q d(s2.a aVar, m5 m5Var, boolean z10, h hVar, ic.a aVar2) {
        return t0.M(m5Var) ? new TriStateToggleableElement(aVar, null, m5Var, z10, hVar, aVar2) : m5Var == null ? new TriStateToggleableElement(aVar, null, null, z10, hVar, aVar2) : new k(new d(m5Var, aVar, z10, hVar, aVar2));
    }
}
