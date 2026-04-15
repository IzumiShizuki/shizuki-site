package androidx.compose.ui.draw;

import i2.a1;
import ic.k;
import j1.p;
import kotlin.Metadata;
import n1.d;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/DrawBehindElement;", "Li2/a1;", "Ln1/d;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class DrawBehindElement extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f674a;

    public DrawBehindElement(k kVar) {
        this.f674a = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DrawBehindElement) {
            return this.f674a == ((DrawBehindElement) obj).f674a;
        }
        return false;
    }

    @Override // i2.a1
    public final p h() {
        d dVar = new d();
        dVar.f15240o = this.f674a;
        return dVar;
    }

    public final int hashCode() {
        return this.f674a.hashCode();
    }

    @Override // i2.a1
    public final void l(p pVar) {
        ((d) pVar).f15240o = this.f674a;
    }
}
