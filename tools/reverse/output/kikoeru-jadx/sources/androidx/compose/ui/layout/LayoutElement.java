package androidx.compose.ui.layout;

import g2.g0;
import i2.a1;
import ic.o;
import j1.p;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/LayoutElement;", "Li2/a1;", "Lg2/g0;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class LayoutElement extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f711a;

    public LayoutElement(o oVar) {
        this.f711a = oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LayoutElement) {
            return this.f711a == ((LayoutElement) obj).f711a;
        }
        return false;
    }

    @Override // i2.a1
    public final p h() {
        g0 g0Var = new g0();
        g0Var.f7179o = this.f711a;
        return g0Var;
    }

    public final int hashCode() {
        return this.f711a.hashCode();
    }

    @Override // i2.a1
    public final void l(p pVar) {
        ((g0) pVar).f7179o = this.f711a;
    }
}
