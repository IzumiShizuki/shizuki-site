package androidx.compose.foundation.layout;

import com.tencent.bugly.beta.tinker.TinkerReport;
import i2.a1;
import j1.p;
import jc.l;
import kotlin.Metadata;
import y.d1;
import y.f1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/PaddingValuesElement;", "Li2/a1;", "Ly/f1;", "foundation-layout_release"}, k = 1, mv = {1, TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART, 0}, xi = 48)
final class PaddingValuesElement extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d1 f543a;

    public PaddingValuesElement(d1 d1Var) {
        this.f543a = d1Var;
    }

    public final boolean equals(Object obj) {
        PaddingValuesElement paddingValuesElement = obj instanceof PaddingValuesElement ? (PaddingValuesElement) obj : null;
        if (paddingValuesElement == null) {
            return false;
        }
        return l.a(this.f543a, paddingValuesElement.f543a);
    }

    @Override // i2.a1
    public final p h() {
        f1 f1Var = new f1();
        f1Var.f25124o = this.f543a;
        return f1Var;
    }

    public final int hashCode() {
        return this.f543a.hashCode();
    }

    @Override // i2.a1
    public final void l(p pVar) {
        ((f1) pVar).f25124o = this.f543a;
    }
}
