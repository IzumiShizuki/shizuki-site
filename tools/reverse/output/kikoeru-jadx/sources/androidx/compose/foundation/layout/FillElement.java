package androidx.compose.foundation.layout;

import com.tencent.bugly.beta.tinker.TinkerReport;
import i2.a1;
import j1.p;
import kotlin.Metadata;
import y.b0;
import y.d0;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/FillElement;", "Li2/a1;", "Ly/d0;", "foundation-layout_release"}, k = 1, mv = {1, TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART, 0}, xi = 48)
public final class FillElement extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f532b;

    public FillElement(b0 b0Var, float f10) {
        this.f531a = b0Var;
        this.f532b = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FillElement)) {
            return false;
        }
        FillElement fillElement = (FillElement) obj;
        return this.f531a == fillElement.f531a && this.f532b == fillElement.f532b;
    }

    @Override // i2.a1
    public final p h() {
        d0 d0Var = new d0();
        d0Var.f25112o = this.f531a;
        d0Var.f25113p = this.f532b;
        return d0Var;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f532b) + (this.f531a.hashCode() * 31);
    }

    @Override // i2.a1
    public final void l(p pVar) {
        d0 d0Var = (d0) pVar;
        d0Var.f25112o = this.f531a;
        d0Var.f25113p = this.f532b;
    }
}
