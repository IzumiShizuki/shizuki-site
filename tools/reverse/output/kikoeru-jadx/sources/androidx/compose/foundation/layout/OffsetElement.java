package androidx.compose.foundation.layout;

import com.tencent.bugly.beta.tinker.TinkerReport;
import f3.f;
import i2.a1;
import j1.p;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/OffsetElement;", "Li2/a1;", "Ly/a1;", "foundation-layout_release"}, k = 1, mv = {1, TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART, 0}, xi = 48)
final class OffsetElement extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f537b;

    public OffsetElement(float f10, float f11) {
        this.f536a = f10;
        this.f537b = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetElement offsetElement = obj instanceof OffsetElement ? (OffsetElement) obj : null;
        return offsetElement != null && f.a(this.f536a, offsetElement.f536a) && f.a(this.f537b, offsetElement.f537b);
    }

    @Override // i2.a1
    public final p h() {
        y.a1 a1Var = new y.a1();
        a1Var.f25082o = this.f536a;
        a1Var.f25083p = this.f537b;
        a1Var.f25084q = true;
        return a1Var;
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.f537b) + (Float.floatToIntBits(this.f536a) * 31)) * 31) + 1231;
    }

    @Override // i2.a1
    public final void l(p pVar) {
        y.a1 a1Var = (y.a1) pVar;
        float f10 = a1Var.f25082o;
        float f11 = this.f536a;
        boolean zA = f.a(f10, f11);
        float f12 = this.f537b;
        if (!zA || !f.a(a1Var.f25083p, f12) || !a1Var.f25084q) {
            i2.f.y(a1Var).X(false);
        }
        a1Var.f25082o = f11;
        a1Var.f25083p = f12;
        a1Var.f25084q = true;
    }

    public final String toString() {
        return "OffsetModifierElement(x=" + ((Object) f.b(this.f536a)) + ", y=" + ((Object) f.b(this.f537b)) + ", rtlAware=true)";
    }
}
