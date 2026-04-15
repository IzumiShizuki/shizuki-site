package androidx.compose.foundation;

import com.tencent.bugly.beta.tinker.TinkerReport;
import i2.a1;
import j1.p;
import jc.l;
import kotlin.Metadata;
import s.b0;
import w.k;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/FocusableElement;", "Li2/a1;", "Ls/b0;", "foundation_release"}, k = 1, mv = {1, TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART, 0}, xi = 48)
final class FocusableElement extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f474a;

    public FocusableElement(k kVar) {
        this.f474a = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FocusableElement) {
            return l.a(this.f474a, ((FocusableElement) obj).f474a);
        }
        return false;
    }

    @Override // i2.a1
    public final p h() {
        return new b0(this.f474a, 1, null);
    }

    public final int hashCode() {
        k kVar = this.f474a;
        if (kVar != null) {
            return kVar.hashCode();
        }
        return 0;
    }

    @Override // i2.a1
    public final void l(p pVar) {
        ((b0) pVar).G0(this.f474a);
    }
}
