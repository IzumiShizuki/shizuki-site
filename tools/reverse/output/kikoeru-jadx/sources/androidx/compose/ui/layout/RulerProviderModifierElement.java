package androidx.compose.ui.layout;

import g2.k1;
import g2.x;
import i2.a1;
import i2.f;
import i2.j0;
import j1.p;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/RulerProviderModifierElement;", "Li2/a1;", "Lg2/k1;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class RulerProviderModifierElement extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f715a;

    public RulerProviderModifierElement(x xVar) {
        this.f715a = xVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        RulerProviderModifierElement rulerProviderModifierElement = obj instanceof RulerProviderModifierElement ? (RulerProviderModifierElement) obj : null;
        return (rulerProviderModifierElement != null ? rulerProviderModifierElement.f715a : null) == this.f715a;
    }

    @Override // i2.a1
    public final p h() {
        return new k1(this.f715a);
    }

    public final int hashCode() {
        return this.f715a.hashCode();
    }

    @Override // i2.a1
    public final void l(p pVar) {
        k1 k1Var = (k1) pVar;
        x xVar = k1Var.f7225o;
        x xVar2 = this.f715a;
        if (xVar != xVar2) {
            k1Var.f7225o = xVar2;
            j0.Y(f.y(k1Var), false, 7);
        }
    }
}
