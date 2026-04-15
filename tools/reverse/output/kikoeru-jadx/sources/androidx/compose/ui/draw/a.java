package androidx.compose.ui.draw;

import g2.p;
import ic.k;
import j1.c;
import j1.d;
import j1.q;
import v1.b;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final q a(q qVar, k kVar) {
        return qVar.e(new DrawBehindElement(kVar));
    }

    public static final q b(q qVar, k kVar) {
        return qVar.e(new DrawWithCacheElement(kVar));
    }

    public static final q c(q qVar, k kVar) {
        return qVar.e(new DrawWithContentElement(kVar));
    }

    public static q d(q qVar, b bVar, d dVar, p pVar, float f10, q1.k kVar, int i10) {
        if ((i10 & 4) != 0) {
            dVar = c.f9666e;
        }
        return qVar.e(new PainterElement(bVar, dVar, pVar, (i10 & 16) != 0 ? 1.0f : f10, kVar));
    }
}
