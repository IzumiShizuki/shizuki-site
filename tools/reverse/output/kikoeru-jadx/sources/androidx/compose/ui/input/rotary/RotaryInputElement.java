package androidx.compose.ui.input.rotary;

import i2.a1;
import j1.p;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/rotary/RotaryInputElement;", "Li2/a1;", "Le2/a;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class RotaryInputElement extends a1 {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof RotaryInputElement);
    }

    @Override // i2.a1
    public final p h() {
        j2.p pVar = j2.p.f9951e;
        e2.a aVar = new e2.a();
        aVar.f6062o = pVar;
        return aVar;
    }

    public final int hashCode() {
        return j2.p.f9951e.hashCode() * 31;
    }

    @Override // i2.a1
    public final void l(p pVar) {
        ((e2.a) pVar).f6062o = j2.p.f9951e;
    }
}
