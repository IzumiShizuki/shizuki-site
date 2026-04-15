package androidx.compose.foundation.layout;

import com.tencent.bugly.beta.tinker.TinkerReport;
import i2.a1;
import j1.p;
import kotlin.Metadata;
import y.y0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/LayoutWeightElement;", "Li2/a1;", "Ly/y0;", "foundation-layout_release"}, k = 1, mv = {1, TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART, 0}, xi = 48)
public final class LayoutWeightElement extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f535b;

    public LayoutWeightElement(float f10, boolean z10) {
        this.f534a = f10;
        this.f535b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        LayoutWeightElement layoutWeightElement = obj instanceof LayoutWeightElement ? (LayoutWeightElement) obj : null;
        return layoutWeightElement != null && this.f534a == layoutWeightElement.f534a && this.f535b == layoutWeightElement.f535b;
    }

    @Override // i2.a1
    public final p h() {
        y0 y0Var = new y0();
        y0Var.f25289o = this.f534a;
        y0Var.f25290p = this.f535b;
        return y0Var;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f534a) * 31) + (this.f535b ? 1231 : 1237);
    }

    @Override // i2.a1
    public final void l(p pVar) {
        y0 y0Var = (y0) pVar;
        y0Var.f25289o = this.f534a;
        y0Var.f25290p = this.f535b;
    }
}
