package androidx.compose.foundation.layout;

import com.tencent.bugly.beta.tinker.TinkerReport;
import i2.a1;
import j1.f;
import j1.p;
import kotlin.Metadata;
import y.q0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/HorizontalAlignElement;", "Li2/a1;", "Ly/q0;", "foundation-layout_release"}, k = 1, mv = {1, TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART, 0}, xi = 48)
public final class HorizontalAlignElement extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f533a;

    public HorizontalAlignElement(f fVar) {
        this.f533a = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        HorizontalAlignElement horizontalAlignElement = obj instanceof HorizontalAlignElement ? (HorizontalAlignElement) obj : null;
        if (horizontalAlignElement == null) {
            return false;
        }
        return this.f533a.equals(horizontalAlignElement.f533a);
    }

    @Override // i2.a1
    public final p h() {
        q0 q0Var = new q0();
        q0Var.f25219o = this.f533a;
        return q0Var;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f533a.f9679a);
    }

    @Override // i2.a1
    public final void l(p pVar) {
        ((q0) pVar).f25219o = this.f533a;
    }
}
