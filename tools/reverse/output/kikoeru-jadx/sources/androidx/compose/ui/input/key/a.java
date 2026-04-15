package androidx.compose.ui.input.key;

import ic.k;
import j1.q;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final q a(q qVar, k kVar) {
        return qVar.e(new KeyInputElement(kVar, null));
    }

    public static final q b(q qVar, k kVar) {
        return qVar.e(new KeyInputElement(null, kVar));
    }
}
