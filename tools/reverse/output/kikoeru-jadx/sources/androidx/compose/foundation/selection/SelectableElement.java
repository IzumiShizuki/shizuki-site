package androidx.compose.foundation.selection;

import com.tencent.bugly.beta.tinker.TinkerReport;
import i2.a1;
import i2.f;
import j1.p;
import jc.l;
import kotlin.Metadata;
import q2.h;
import s.r0;
import w.k;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/selection/SelectableElement;", "Li2/a1;", "Lf0/b;", "foundation_release"}, k = 1, mv = {1, TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART, 0}, xi = 48)
final class SelectableElement extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r0 f594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f595d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h f596e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ic.a f597f;

    public SelectableElement(boolean z10, k kVar, r0 r0Var, boolean z11, h hVar, ic.a aVar) {
        this.f592a = z10;
        this.f593b = kVar;
        this.f594c = r0Var;
        this.f595d = z11;
        this.f596e = hVar;
        this.f597f = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SelectableElement.class != obj.getClass()) {
            return false;
        }
        SelectableElement selectableElement = (SelectableElement) obj;
        return this.f592a == selectableElement.f592a && l.a(this.f593b, selectableElement.f593b) && l.a(this.f594c, selectableElement.f594c) && this.f595d == selectableElement.f595d && this.f596e.equals(selectableElement.f596e) && this.f597f == selectableElement.f597f;
    }

    @Override // i2.a1
    public final p h() {
        f0.b bVar = new f0.b(this.f593b, this.f594c, this.f595d, null, this.f596e, this.f597f);
        bVar.H = this.f592a;
        return bVar;
    }

    public final int hashCode() {
        int i10 = (this.f592a ? 1231 : 1237) * 31;
        k kVar = this.f593b;
        int iHashCode = (i10 + (kVar != null ? kVar.hashCode() : 0)) * 31;
        r0 r0Var = this.f594c;
        return this.f597f.hashCode() + ((((((iHashCode + (r0Var != null ? r0Var.hashCode() : 0)) * 31) + (this.f595d ? 1231 : 1237)) * 31) + this.f596e.f17601a) * 31);
    }

    @Override // i2.a1
    public final void l(p pVar) {
        f0.b bVar = (f0.b) pVar;
        boolean z10 = bVar.H;
        boolean z11 = this.f592a;
        if (z10 != z11) {
            bVar.H = z11;
            f.o(bVar);
        }
        bVar.L0(this.f593b, this.f594c, this.f595d, null, this.f596e, this.f597f);
    }
}
