package androidx.compose.foundation.gestures;

import com.tencent.bugly.beta.tinker.TinkerReport;
import i2.a1;
import j1.p;
import jc.l;
import kotlin.Metadata;
import u.e1;
import u.u1;
import u.v1;
import w.k;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollableElement;", "Li2/a1;", "Lu/u1;", "foundation_release"}, k = 1, mv = {1, TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART, 0}, xi = 48)
final class ScrollableElement extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v1 f516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e1 f517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f519d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k f520e;

    public ScrollableElement(v1 v1Var, e1 e1Var, boolean z10, boolean z11, k kVar) {
        this.f516a = v1Var;
        this.f517b = e1Var;
        this.f518c = z10;
        this.f519d = z11;
        this.f520e = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollableElement)) {
            return false;
        }
        ScrollableElement scrollableElement = (ScrollableElement) obj;
        return l.a(this.f516a, scrollableElement.f516a) && this.f517b == scrollableElement.f517b && this.f518c == scrollableElement.f518c && this.f519d == scrollableElement.f519d && l.a(this.f520e, scrollableElement.f520e);
    }

    @Override // i2.a1
    public final p h() {
        return new u1(null, null, null, this.f517b, this.f516a, this.f520e, this.f518c, this.f519d);
    }

    public final int hashCode() {
        int iHashCode = (((((this.f517b.hashCode() + (this.f516a.hashCode() * 31)) * 961) + (this.f518c ? 1231 : 1237)) * 31) + (this.f519d ? 1231 : 1237)) * 961;
        k kVar = this.f520e;
        return (iHashCode + (kVar != null ? kVar.hashCode() : 0)) * 31;
    }

    @Override // i2.a1
    public final void l(p pVar) {
        ((u1) pVar).N0(null, null, null, this.f517b, this.f516a, this.f520e, this.f518c, this.f519d);
    }
}
