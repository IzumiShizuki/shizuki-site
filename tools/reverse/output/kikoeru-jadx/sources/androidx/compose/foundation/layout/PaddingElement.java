package androidx.compose.foundation.layout;

import com.tencent.bugly.beta.tinker.TinkerReport;
import f3.f;
import i2.a1;
import j1.p;
import kotlin.Metadata;
import q.t0;
import y.c1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/PaddingElement;", "Li2/a1;", "Ly/c1;", "foundation-layout_release"}, k = 1, mv = {1, TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART, 0}, xi = 48)
final class PaddingElement extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f542d;

    public PaddingElement(float f10, float f11, float f12, float f13) {
        this.f539a = f10;
        this.f540b = f11;
        this.f541c = f12;
        this.f542d = f13;
        boolean z10 = true;
        boolean z11 = (f10 >= 0.0f || Float.isNaN(f10)) & (f11 >= 0.0f || Float.isNaN(f11)) & (f12 >= 0.0f || Float.isNaN(f12));
        if (f13 < 0.0f && !Float.isNaN(f13)) {
            z10 = false;
        }
        if (!z11 || !z10) {
            z.a.a("Padding must be non-negative");
        }
    }

    public final boolean equals(Object obj) {
        PaddingElement paddingElement = obj instanceof PaddingElement ? (PaddingElement) obj : null;
        return paddingElement != null && f.a(this.f539a, paddingElement.f539a) && f.a(this.f540b, paddingElement.f540b) && f.a(this.f541c, paddingElement.f541c) && f.a(this.f542d, paddingElement.f542d);
    }

    @Override // i2.a1
    public final p h() {
        c1 c1Var = new c1();
        c1Var.f25100o = this.f539a;
        c1Var.f25101p = this.f540b;
        c1Var.f25102q = this.f541c;
        c1Var.f25103r = this.f542d;
        c1Var.f25104s = true;
        return c1Var;
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.f542d) + t0.x(this.f541c, t0.x(this.f540b, Float.floatToIntBits(this.f539a) * 31, 31), 31)) * 31) + 1231;
    }

    @Override // i2.a1
    public final void l(p pVar) {
        c1 c1Var = (c1) pVar;
        c1Var.f25100o = this.f539a;
        c1Var.f25101p = this.f540b;
        c1Var.f25102q = this.f541c;
        c1Var.f25103r = this.f542d;
        c1Var.f25104s = true;
    }
}
