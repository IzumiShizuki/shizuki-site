package androidx.compose.foundation.layout;

import com.tencent.bugly.beta.tinker.TinkerReport;
import i2.a1;
import j1.d;
import j1.p;
import jc.l;
import kotlin.Metadata;
import y.m;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/BoxChildDataElement;", "Li2/a1;", "Ly/m;", "foundation-layout_release"}, k = 1, mv = {1, TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART, 0}, xi = 48)
final class BoxChildDataElement extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f530b;

    public BoxChildDataElement(d dVar, boolean z10) {
        this.f529a = dVar;
        this.f530b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        BoxChildDataElement boxChildDataElement = obj instanceof BoxChildDataElement ? (BoxChildDataElement) obj : null;
        return boxChildDataElement != null && l.a(this.f529a, boxChildDataElement.f529a) && this.f530b == boxChildDataElement.f530b;
    }

    @Override // i2.a1
    public final p h() {
        m mVar = new m();
        mVar.f25168o = this.f529a;
        mVar.f25169p = this.f530b;
        return mVar;
    }

    public final int hashCode() {
        return (this.f529a.hashCode() * 31) + (this.f530b ? 1231 : 1237);
    }

    @Override // i2.a1
    public final void l(p pVar) {
        m mVar = (m) pVar;
        mVar.f25168o = this.f529a;
        mVar.f25169p = this.f530b;
    }
}
