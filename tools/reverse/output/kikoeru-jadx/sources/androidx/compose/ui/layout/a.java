package androidx.compose.ui.layout;

import g2.d0;
import g2.u0;
import ic.k;
import ic.o;
import j1.q;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final Object a(u0 u0Var) {
        Object objA = u0Var.A();
        d0 d0Var = objA instanceof d0 ? (d0) objA : null;
        if (d0Var != null) {
            return d0Var.f7165o;
        }
        return null;
    }

    public static final q b(q qVar, o oVar) {
        return qVar.e(new LayoutElement(oVar));
    }

    public static final q c(q qVar, Object obj) {
        return qVar.e(new LayoutIdElement(obj));
    }

    public static final q d(q qVar, k kVar) {
        return qVar.e(new OnGloballyPositionedElement(kVar));
    }

    public static final q e(q qVar, k kVar) {
        return qVar.e(new OnSizeChangedModifier(kVar));
    }
}
