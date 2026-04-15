package androidx.compose.foundation.layout;

import com.tencent.bugly.beta.tinker.TinkerReport;
import i2.a1;
import j1.p;
import kotlin.Metadata;
import y.v0;
import y.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/IntrinsicWidthElement;", "Li2/a1;", "Ly/w0;", "foundation-layout_release"}, k = 1, mv = {1, TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART, 0}, xi = 48)
final class IntrinsicWidthElement extends a1 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IntrinsicWidthElement ? (IntrinsicWidthElement) obj : null) != null;
    }

    @Override // i2.a1
    public final p h() {
        w0 w0Var = new w0();
        w0Var.f25275o = v0.f25271b;
        w0Var.f25276p = true;
        return w0Var;
    }

    public final int hashCode() {
        return (v0.f25271b.hashCode() * 31) + 1231;
    }

    @Override // i2.a1
    public final void l(p pVar) {
        w0 w0Var = (w0) pVar;
        w0Var.f25275o = v0.f25271b;
        w0Var.f25276p = true;
    }
}
