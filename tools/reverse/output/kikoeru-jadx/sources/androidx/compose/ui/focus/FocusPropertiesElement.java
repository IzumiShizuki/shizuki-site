package androidx.compose.ui.focus;

import i2.a1;
import j1.p;
import jc.l;
import kotlin.Metadata;
import o1.o;
import o1.q;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/focus/FocusPropertiesElement;", "Li2/a1;", "Lo1/q;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class FocusPropertiesElement extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f689a;

    public FocusPropertiesElement(o oVar) {
        this.f689a = oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusPropertiesElement) && l.a(this.f689a, ((FocusPropertiesElement) obj).f689a);
    }

    @Override // i2.a1
    public final p h() {
        q qVar = new q();
        qVar.f16121o = this.f689a;
        return qVar;
    }

    public final int hashCode() {
        return this.f689a.f16120a.hashCode();
    }

    @Override // i2.a1
    public final void l(p pVar) {
        ((q) pVar).f16121o = this.f689a;
    }

    public final String toString() {
        return "FocusPropertiesElement(scope=" + this.f689a + ')';
    }
}
