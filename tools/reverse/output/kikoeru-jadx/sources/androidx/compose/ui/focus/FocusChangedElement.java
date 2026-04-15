package androidx.compose.ui.focus;

import i2.a1;
import ic.k;
import j1.p;
import kotlin.Metadata;
import o1.c;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/focus/FocusChangedElement;", "Li2/a1;", "Lo1/c;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class FocusChangedElement extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f687a;

    public FocusChangedElement(k kVar) {
        this.f687a = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FocusChangedElement) {
            return this.f687a == ((FocusChangedElement) obj).f687a;
        }
        return false;
    }

    @Override // i2.a1
    public final p h() {
        c cVar = new c();
        cVar.f16084o = this.f687a;
        return cVar;
    }

    public final int hashCode() {
        return this.f687a.hashCode();
    }

    @Override // i2.a1
    public final void l(p pVar) {
        ((c) pVar).f16084o = this.f687a;
    }
}
