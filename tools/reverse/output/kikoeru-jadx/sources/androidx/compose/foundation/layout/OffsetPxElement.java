package androidx.compose.foundation.layout;

import com.tencent.bugly.beta.tinker.TinkerReport;
import i2.a1;
import i2.f;
import ic.k;
import j1.p;
import kotlin.Metadata;
import y.b1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/OffsetPxElement;", "Li2/a1;", "Ly/b1;", "foundation-layout_release"}, k = 1, mv = {1, TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART, 0}, xi = 48)
final class OffsetPxElement extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f538a;

    public OffsetPxElement(k kVar) {
        this.f538a = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetPxElement offsetPxElement = obj instanceof OffsetPxElement ? (OffsetPxElement) obj : null;
        return offsetPxElement != null && this.f538a == offsetPxElement.f538a;
    }

    @Override // i2.a1
    public final p h() {
        b1 b1Var = new b1();
        b1Var.f25092o = this.f538a;
        b1Var.f25093p = true;
        return b1Var;
    }

    public final int hashCode() {
        return (this.f538a.hashCode() * 31) + 1231;
    }

    @Override // i2.a1
    public final void l(p pVar) {
        b1 b1Var = (b1) pVar;
        k kVar = b1Var.f25092o;
        k kVar2 = this.f538a;
        if (kVar != kVar2 || !b1Var.f25093p) {
            f.y(b1Var).X(false);
        }
        b1Var.f25092o = kVar2;
        b1Var.f25093p = true;
    }

    public final String toString() {
        return "OffsetPxModifier(offset=" + this.f538a + ", rtlAware=true)";
    }
}
