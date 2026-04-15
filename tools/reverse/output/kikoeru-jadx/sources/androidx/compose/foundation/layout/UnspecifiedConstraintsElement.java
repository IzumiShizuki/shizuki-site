package androidx.compose.foundation.layout;

import com.tencent.bugly.beta.tinker.TinkerReport;
import f3.f;
import i2.a1;
import j1.p;
import kotlin.Metadata;
import y.o1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/UnspecifiedConstraintsElement;", "Li2/a1;", "Ly/o1;", "foundation-layout_release"}, k = 1, mv = {1, TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART, 0}, xi = 48)
final class UnspecifiedConstraintsElement extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f550b;

    public UnspecifiedConstraintsElement(float f10, float f11) {
        this.f549a = f10;
        this.f550b = f11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UnspecifiedConstraintsElement)) {
            return false;
        }
        UnspecifiedConstraintsElement unspecifiedConstraintsElement = (UnspecifiedConstraintsElement) obj;
        return f.a(this.f549a, unspecifiedConstraintsElement.f549a) && f.a(this.f550b, unspecifiedConstraintsElement.f550b);
    }

    @Override // i2.a1
    public final p h() {
        o1 o1Var = new o1();
        o1Var.f25204o = this.f549a;
        o1Var.f25205p = this.f550b;
        return o1Var;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f550b) + (Float.floatToIntBits(this.f549a) * 31);
    }

    @Override // i2.a1
    public final void l(p pVar) {
        o1 o1Var = (o1) pVar;
        o1Var.f25204o = this.f549a;
        o1Var.f25205p = this.f550b;
    }
}
