package y;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.VerticalAlignElement;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l1 implements k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l1 f25167a = new l1();

    @Override // y.k1
    public final j1.q a(j1.q qVar, float f10) {
        if (f10 <= 0.0d) {
            z.a.a("invalid weight; must be greater than zero");
        }
        if (f10 > Float.MAX_VALUE) {
            f10 = Float.MAX_VALUE;
        }
        return qVar.e(new LayoutWeightElement(f10, true));
    }

    @Override // y.k1
    public final j1.q b(j1.q qVar) {
        return qVar.e(new VerticalAlignElement());
    }
}
