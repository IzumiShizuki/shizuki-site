package androidx.compose.foundation.lazy.layout;

import b0.i1;
import b0.m;
import b0.r;
import j1.q;
import u.e1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final q a(r rVar, m mVar, e1 e1Var) {
        return new LazyLayoutBeyondBoundsModifierElement(rVar, mVar, e1Var);
    }

    public static final q b(q qVar, pc.r rVar, i1 i1Var, e1 e1Var, boolean z10) {
        return qVar.e(new LazyLayoutSemanticsModifier(rVar, i1Var, e1Var, z10));
    }
}
