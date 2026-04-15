package androidx.compose.foundation.layout;

import com.tencent.bugly.beta.tinker.TinkerReport;
import f3.f;
import g2.t;
import i2.a1;
import j1.p;
import jc.l;
import kotlin.Metadata;
import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/AlignmentLineOffsetDpElement;", "Li2/a1;", "Ly/b;", "foundation-layout_release"}, k = 1, mv = {1, TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART, 0}, xi = 48)
final class AlignmentLineOffsetDpElement extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f526c;

    public AlignmentLineOffsetDpElement(t tVar, float f10, float f11) {
        this.f524a = tVar;
        this.f525b = f10;
        this.f526c = f11;
        boolean z10 = true;
        boolean z11 = f10 >= 0.0f || Float.isNaN(f10);
        if (f11 < 0.0f && !Float.isNaN(f11)) {
            z10 = false;
        }
        if (!z10 || !z11) {
            z.a.a("Padding from alignment line must be a non-negative number");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        AlignmentLineOffsetDpElement alignmentLineOffsetDpElement = obj instanceof AlignmentLineOffsetDpElement ? (AlignmentLineOffsetDpElement) obj : null;
        return alignmentLineOffsetDpElement != null && l.a(this.f524a, alignmentLineOffsetDpElement.f524a) && f.a(this.f525b, alignmentLineOffsetDpElement.f525b) && f.a(this.f526c, alignmentLineOffsetDpElement.f526c);
    }

    @Override // i2.a1
    public final p h() {
        y.b bVar = new y.b();
        bVar.f25085o = this.f524a;
        bVar.f25086p = this.f525b;
        bVar.f25087q = this.f526c;
        return bVar;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f526c) + t0.x(this.f525b, this.f524a.hashCode() * 31, 31);
    }

    @Override // i2.a1
    public final void l(p pVar) {
        y.b bVar = (y.b) pVar;
        bVar.f25085o = this.f524a;
        bVar.f25086p = this.f525b;
        bVar.f25087q = this.f526c;
    }
}
