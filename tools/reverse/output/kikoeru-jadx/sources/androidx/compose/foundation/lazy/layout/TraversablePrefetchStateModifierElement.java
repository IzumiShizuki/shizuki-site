package androidx.compose.foundation.lazy.layout;

import b0.a2;
import b0.z0;
import com.tencent.bugly.beta.tinker.TinkerReport;
import i2.a1;
import j1.p;
import jc.l;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/TraversablePrefetchStateModifierElement;", "Li2/a1;", "Lb0/a2;", "foundation_release"}, k = 1, mv = {1, TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART, 0}, xi = 48)
final /* data */ class TraversablePrefetchStateModifierElement extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z0 f575a;

    public TraversablePrefetchStateModifierElement(z0 z0Var) {
        this.f575a = z0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TraversablePrefetchStateModifierElement) && l.a(this.f575a, ((TraversablePrefetchStateModifierElement) obj).f575a);
    }

    @Override // i2.a1
    public final p h() {
        a2 a2Var = new a2();
        a2Var.f1192o = this.f575a;
        return a2Var;
    }

    public final int hashCode() {
        return this.f575a.hashCode();
    }

    @Override // i2.a1
    public final void l(p pVar) {
        ((a2) pVar).f1192o = this.f575a;
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.f575a + ')';
    }
}
