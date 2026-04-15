package androidx.compose.foundation.selection;

import com.tencent.bugly.beta.tinker.TinkerReport;
import i2.a1;
import i2.f;
import j1.p;
import jc.l;
import kotlin.Metadata;
import q2.h;
import w.k;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/selection/ToggleableElement;", "Li2/a1;", "Lf0/c;", "foundation_release"}, k = 1, mv = {1, TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART, 0}, xi = 48)
final class ToggleableElement extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f601d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ic.k f602e;

    public ToggleableElement(boolean z10, k kVar, boolean z11, h hVar, ic.k kVar2) {
        this.f598a = z10;
        this.f599b = kVar;
        this.f600c = z11;
        this.f601d = hVar;
        this.f602e = kVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ToggleableElement.class != obj.getClass()) {
            return false;
        }
        ToggleableElement toggleableElement = (ToggleableElement) obj;
        return this.f598a == toggleableElement.f598a && l.a(this.f599b, toggleableElement.f599b) && this.f600c == toggleableElement.f600c && this.f601d.equals(toggleableElement.f601d) && this.f602e == toggleableElement.f602e;
    }

    @Override // i2.a1
    public final p h() {
        return new f0.c(this.f598a, this.f599b, this.f600c, this.f601d, this.f602e);
    }

    public final int hashCode() {
        int i10 = (this.f598a ? 1231 : 1237) * 31;
        k kVar = this.f599b;
        return this.f602e.hashCode() + ((((((i10 + (kVar != null ? kVar.hashCode() : 0)) * 961) + (this.f600c ? 1231 : 1237)) * 31) + this.f601d.f17601a) * 31);
    }

    @Override // i2.a1
    public final void l(p pVar) {
        f0.c cVar = (f0.c) pVar;
        boolean z10 = cVar.H;
        boolean z11 = this.f598a;
        if (z10 != z11) {
            cVar.H = z11;
            f.o(cVar);
        }
        cVar.I = this.f602e;
        cVar.L0(this.f599b, null, this.f600c, null, this.f601d, cVar.J);
    }
}
