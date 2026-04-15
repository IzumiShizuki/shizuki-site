package androidx.compose.ui.focus;

import ic.k;
import j1.q;
import o1.o;
import o1.r;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final q a(k kVar) {
        return new FocusPropertiesElement(new o(kVar));
    }

    public static final q b(q qVar, r rVar) {
        return qVar.e(new FocusRequesterElement(rVar));
    }

    public static final q c(q qVar, k kVar) {
        return qVar.e(new FocusChangedElement(kVar));
    }
}
