package androidx.compose.foundation;

import com.tencent.bugly.beta.tinker.TinkerReport;
import i2.a1;
import j1.p;
import jc.l;
import kotlin.Metadata;
import s.j0;
import w.k;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/HoverableElement;", "Li2/a1;", "Ls/j0;", "foundation_release"}, k = 1, mv = {1, TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART, 0}, xi = 48)
final class HoverableElement extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f475a;

    public HoverableElement(k kVar) {
        this.f475a = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HoverableElement) && l.a(((HoverableElement) obj).f475a, this.f475a);
    }

    @Override // i2.a1
    public final p h() {
        j0 j0Var = new j0();
        j0Var.f19189o = this.f475a;
        return j0Var;
    }

    public final int hashCode() {
        return this.f475a.hashCode() * 31;
    }

    @Override // i2.a1
    public final void l(p pVar) {
        j0 j0Var = (j0) pVar;
        k kVar = j0Var.f19189o;
        k kVar2 = this.f475a;
        if (l.a(kVar, kVar2)) {
            return;
        }
        j0Var.D0();
        j0Var.f19189o = kVar2;
    }
}
