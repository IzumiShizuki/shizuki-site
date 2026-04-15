package androidx.compose.ui.input.nestedscroll;

import b0.d0;
import b2.d;
import b2.g;
import i2.a1;
import j1.p;
import jc.l;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;", "Li2/a1;", "Lb2/g;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class NestedScrollElement extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b2.a f704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f705b;

    public NestedScrollElement(b2.a aVar, d dVar) {
        this.f704a = aVar;
        this.f705b = dVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof NestedScrollElement)) {
            return false;
        }
        NestedScrollElement nestedScrollElement = (NestedScrollElement) obj;
        return l.a(nestedScrollElement.f704a, this.f704a) && l.a(nestedScrollElement.f705b, this.f705b);
    }

    @Override // i2.a1
    public final p h() {
        return new g(this.f704a, this.f705b);
    }

    public final int hashCode() {
        int iHashCode = this.f704a.hashCode() * 31;
        d dVar = this.f705b;
        return iHashCode + (dVar != null ? dVar.hashCode() : 0);
    }

    @Override // i2.a1
    public final void l(p pVar) {
        g gVar = (g) pVar;
        gVar.f1468o = this.f704a;
        d dVar = gVar.f1469p;
        if (dVar.f1455a == gVar) {
            dVar.f1455a = null;
        }
        d dVar2 = this.f705b;
        if (dVar2 == null) {
            gVar.f1469p = new d();
        } else if (!dVar2.equals(dVar)) {
            gVar.f1469p = dVar2;
        }
        if (gVar.f9703n) {
            d dVar3 = gVar.f1469p;
            dVar3.f1455a = gVar;
            dVar3.f1456b = null;
            gVar.f1470q = null;
            dVar3.f1457c = new d0(2, gVar);
            dVar3.f1458d = gVar.n0();
        }
    }
}
