package androidx.compose.ui.graphics;

import ic.k;
import j1.q;
import q1.h0;
import q1.l0;
import q1.p0;
import q1.w;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final q a(q qVar, k kVar) {
        return qVar.e(new BlockGraphicsLayerElement(kVar));
    }

    public static final q b(q qVar, float f10, float f11, float f12, float f13, long j10, l0 l0Var, boolean z10, long j11, long j12) {
        return qVar.e(new GraphicsLayerElement(f10, f11, f12, f13, j10, l0Var, z10, j11, j12));
    }

    public static q c(q qVar, float f10, float f11, l0 l0Var, int i10) {
        float f12 = (i10 & 4) != 0 ? 1.0f : f10;
        float f13 = (i10 & 256) != 0 ? 0.0f : f11;
        long j10 = p0.f17566b;
        l0 l0Var2 = (i10 & 2048) != 0 ? h0.f17515a : l0Var;
        boolean z10 = (i10 & 4096) == 0;
        long j11 = w.f17581a;
        return b(qVar, 1.0f, 1.0f, f12, f13, j10, l0Var2, z10, j11, j11);
    }
}
