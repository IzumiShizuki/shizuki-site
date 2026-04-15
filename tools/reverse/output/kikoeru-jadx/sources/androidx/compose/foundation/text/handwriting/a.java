package androidx.compose.foundation.text.handwriting;

import androidx.compose.ui.input.pointer.StylusHoverIconModifierElement;
import i0.b;
import i2.o;
import j1.n;
import j1.q;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f623a;

    static {
        float f10 = 40;
        float f11 = 10;
        f623a = new o(f11, f10, f11, f10);
    }

    public static final q a(boolean z10, boolean z11, ic.a aVar) {
        q stylusHoverIconModifierElement = n.f9689a;
        if (!z10 || !b.f8635a) {
            return stylusHoverIconModifierElement;
        }
        if (z11) {
            stylusHoverIconModifierElement = new StylusHoverIconModifierElement(f623a);
        }
        return stylusHoverIconModifierElement.e(new StylusHandwritingElement(aVar));
    }
}
