package androidx.compose.ui.graphics;

import i2.a1;
import i2.f;
import i2.g1;
import ic.k;
import j1.p;
import kotlin.Metadata;
import q1.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/BlockGraphicsLayerElement;", "Li2/a1;", "Lq1/l;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class BlockGraphicsLayerElement extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f692a;

    public BlockGraphicsLayerElement(k kVar) {
        this.f692a = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BlockGraphicsLayerElement) {
            return this.f692a == ((BlockGraphicsLayerElement) obj).f692a;
        }
        return false;
    }

    @Override // i2.a1
    public final p h() {
        return new l(this.f692a);
    }

    public final int hashCode() {
        return this.f692a.hashCode();
    }

    @Override // i2.a1
    public final void l(p pVar) {
        l lVar = (l) pVar;
        lVar.f17548o = this.f692a;
        g1 g1Var = f.v(lVar, 2).f8703r;
        if (g1Var != null) {
            g1Var.l1(lVar.f17548o, true);
        }
    }
}
