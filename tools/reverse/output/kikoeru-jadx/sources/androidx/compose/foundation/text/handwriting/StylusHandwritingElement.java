package androidx.compose.foundation.text.handwriting;

import com.tencent.bugly.beta.tinker.TinkerReport;
import i2.a1;
import j1.p;
import jc.l;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/handwriting/StylusHandwritingElement;", "Li2/a1;", "Li0/a;", "foundation_release"}, k = 1, mv = {1, TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART, 0}, xi = 48)
final /* data */ class StylusHandwritingElement extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ic.a f622a;

    public StylusHandwritingElement(ic.a aVar) {
        this.f622a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StylusHandwritingElement) && l.a(this.f622a, ((StylusHandwritingElement) obj).f622a);
    }

    @Override // i2.a1
    public final p h() {
        return new i0.a(this.f622a);
    }

    public final int hashCode() {
        return this.f622a.hashCode();
    }

    @Override // i2.a1
    public final void l(p pVar) {
        ((i0.a) pVar).f8632q = this.f622a;
    }

    public final String toString() {
        return "StylusHandwritingElement(onHandwritingSlopExceeded=" + this.f622a + ')';
    }
}
