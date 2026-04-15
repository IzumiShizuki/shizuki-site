package androidx.compose.foundation.layout;

import com.tencent.bugly.beta.tinker.TinkerReport;
import i2.a1;
import j1.p;
import kotlin.Metadata;
import y.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/AspectRatioElement;", "Li2/a1;", "Ly/l;", "foundation-layout_release"}, k = 1, mv = {1, TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART, 0}, xi = 48)
final class AspectRatioElement extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f528b;

    public AspectRatioElement(float f10, boolean z10) {
        this.f527a = f10;
        this.f528b = z10;
        if (f10 > 0.0f) {
            return;
        }
        z.a.a("aspectRatio " + f10 + " must be > 0");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        AspectRatioElement aspectRatioElement = obj instanceof AspectRatioElement ? (AspectRatioElement) obj : null;
        if (aspectRatioElement != null && this.f527a == aspectRatioElement.f527a) {
            return this.f528b == ((AspectRatioElement) obj).f528b;
        }
        return false;
    }

    @Override // i2.a1
    public final p h() {
        l lVar = new l();
        lVar.f25165o = this.f527a;
        lVar.f25166p = this.f528b;
        return lVar;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f527a) * 31) + (this.f528b ? 1231 : 1237);
    }

    @Override // i2.a1
    public final void l(p pVar) {
        l lVar = (l) pVar;
        lVar.f25165o = this.f527a;
        lVar.f25166p = this.f528b;
    }
}
