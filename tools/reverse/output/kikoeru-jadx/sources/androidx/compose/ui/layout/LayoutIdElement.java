package androidx.compose.ui.layout;

import g2.d0;
import i2.a1;
import j1.p;
import jc.l;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/LayoutIdElement;", "Li2/a1;", "Lg2/d0;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class LayoutIdElement extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f712a;

    public LayoutIdElement(Object obj) {
        this.f712a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutIdElement) && l.a(this.f712a, ((LayoutIdElement) obj).f712a);
    }

    @Override // i2.a1
    public final p h() {
        d0 d0Var = new d0();
        d0Var.f7165o = this.f712a;
        return d0Var;
    }

    public final int hashCode() {
        return this.f712a.hashCode();
    }

    @Override // i2.a1
    public final void l(p pVar) {
        ((d0) pVar).f7165o = this.f712a;
    }

    public final String toString() {
        return "LayoutIdElement(layoutId=" + this.f712a + ')';
    }
}
