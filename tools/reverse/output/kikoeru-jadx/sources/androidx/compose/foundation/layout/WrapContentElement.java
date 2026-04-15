package androidx.compose.foundation.layout;

import com.tencent.bugly.beta.tinker.TinkerReport;
import i2.a1;
import ic.n;
import j1.p;
import jc.l;
import jc.m;
import kotlin.Metadata;
import y.b0;
import y.x1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/WrapContentElement;", "Li2/a1;", "Ly/x1;", "foundation-layout_release"}, k = 1, mv = {1, TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART, 0}, xi = 48)
final class WrapContentElement extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f553c;

    /* JADX WARN: Multi-variable type inference failed */
    public WrapContentElement(b0 b0Var, n nVar, Object obj) {
        this.f551a = b0Var;
        this.f552b = (m) nVar;
        this.f553c = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WrapContentElement.class != obj.getClass()) {
            return false;
        }
        WrapContentElement wrapContentElement = (WrapContentElement) obj;
        return this.f551a == wrapContentElement.f551a && l.a(this.f553c, wrapContentElement.f553c);
    }

    @Override // i2.a1
    public final p h() {
        x1 x1Var = new x1();
        x1Var.f25286o = this.f551a;
        x1Var.f25287p = this.f552b;
        return x1Var;
    }

    public final int hashCode() {
        return this.f553c.hashCode() + (((this.f551a.hashCode() * 31) + 1237) * 31);
    }

    @Override // i2.a1
    public final void l(p pVar) {
        x1 x1Var = (x1) pVar;
        x1Var.f25286o = this.f551a;
        x1Var.f25287p = this.f552b;
    }
}
