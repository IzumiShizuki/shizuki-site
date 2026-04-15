package androidx.compose.ui.focus;

import i2.a1;
import j1.p;
import jc.l;
import kotlin.Metadata;
import o1.r;
import o1.t;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/focus/FocusRequesterElement;", "Li2/a1;", "Lo1/t;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class FocusRequesterElement extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f690a;

    public FocusRequesterElement(r rVar) {
        this.f690a = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusRequesterElement) && l.a(this.f690a, ((FocusRequesterElement) obj).f690a);
    }

    @Override // i2.a1
    public final p h() {
        t tVar = new t();
        tVar.f16126o = this.f690a;
        return tVar;
    }

    public final int hashCode() {
        return this.f690a.hashCode();
    }

    @Override // i2.a1
    public final void l(p pVar) {
        t tVar = (t) pVar;
        tVar.f16126o.f16125a.j(tVar);
        r rVar = this.f690a;
        tVar.f16126o = rVar;
        rVar.f16125a.b(tVar);
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.f690a + ')';
    }
}
