package androidx.compose.ui;

import i2.a1;
import i2.f;
import j1.m;
import j1.p;
import jc.l;
import kotlin.Metadata;
import x0.j1;
import x0.x;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/CompositionLocalMapInjectionElement;", "Li2/a1;", "Lj1/m;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CompositionLocalMapInjectionElement extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f671a;

    public CompositionLocalMapInjectionElement(j1 j1Var) {
        this.f671a = j1Var;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof CompositionLocalMapInjectionElement) && l.a(((CompositionLocalMapInjectionElement) obj).f671a, this.f671a);
    }

    @Override // i2.a1
    public final p h() {
        m mVar = new m();
        mVar.f9688o = this.f671a;
        return mVar;
    }

    public final int hashCode() {
        return this.f671a.hashCode();
    }

    @Override // i2.a1
    public final void l(p pVar) {
        m mVar = (m) pVar;
        x xVar = this.f671a;
        mVar.f9688o = xVar;
        f.y(mVar).c0(xVar);
    }
}
