package androidx.compose.foundation;

import cg.d0;
import j1.q;
import s.m0;
import s.o0;
import s.r0;
import w.k;
import x0.o2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o2 f507a = new o2(o0.f19237c);

    public static final q a(q qVar, k kVar, m0 m0Var) {
        return m0Var == null ? qVar : m0Var instanceof r0 ? qVar.e(new IndicationModifierElement(kVar, (r0) m0Var)) : j1.a.a(qVar, new d0(6, m0Var, kVar));
    }
}
