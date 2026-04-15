package androidx.compose.foundation;

import com.tencent.bugly.beta.tinker.TinkerReport;
import i2.a1;
import j1.p;
import jc.l;
import kotlin.Metadata;
import s.p1;
import u.e1;
import u.p0;
import u.v1;
import w.k;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/ScrollingContainerElement;", "Li2/a1;", "Ls/p1;", "foundation_release"}, k = 1, mv = {1, TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART, 0}, xi = 48)
final class ScrollingContainerElement extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v1 f481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e1 f482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p0 f484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k f485e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u.c f486f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f487g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final s.f f488h;

    public ScrollingContainerElement(s.f fVar, u.c cVar, p0 p0Var, e1 e1Var, v1 v1Var, k kVar, boolean z10, boolean z11) {
        this.f481a = v1Var;
        this.f482b = e1Var;
        this.f483c = z10;
        this.f484d = p0Var;
        this.f485e = kVar;
        this.f486f = cVar;
        this.f487g = z11;
        this.f488h = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ScrollingContainerElement.class != obj.getClass()) {
            return false;
        }
        ScrollingContainerElement scrollingContainerElement = (ScrollingContainerElement) obj;
        return l.a(this.f481a, scrollingContainerElement.f481a) && this.f482b == scrollingContainerElement.f482b && this.f483c == scrollingContainerElement.f483c && l.a(this.f484d, scrollingContainerElement.f484d) && l.a(this.f485e, scrollingContainerElement.f485e) && l.a(this.f486f, scrollingContainerElement.f486f) && this.f487g == scrollingContainerElement.f487g && l.a(this.f488h, scrollingContainerElement.f488h);
    }

    @Override // i2.a1
    public final p h() {
        p1 p1Var = new p1();
        p1Var.f19255q = this.f481a;
        p1Var.f19256r = this.f482b;
        p1Var.f19257s = this.f483c;
        p1Var.f19258t = this.f484d;
        p1Var.f19259u = this.f485e;
        p1Var.f19260v = this.f486f;
        p1Var.f19261w = this.f487g;
        p1Var.f19262x = this.f488h;
        return p1Var;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f482b.hashCode() + (this.f481a.hashCode() * 31)) * 31) + (this.f483c ? 1231 : 1237)) * 31) + 1237) * 31;
        p0 p0Var = this.f484d;
        int iHashCode2 = (iHashCode + (p0Var != null ? p0Var.hashCode() : 0)) * 31;
        k kVar = this.f485e;
        int iHashCode3 = (iHashCode2 + (kVar != null ? kVar.hashCode() : 0)) * 31;
        u.c cVar = this.f486f;
        int iHashCode4 = (((iHashCode3 + (cVar != null ? cVar.hashCode() : 0)) * 31) + (this.f487g ? 1231 : 1237)) * 31;
        s.f fVar = this.f488h;
        return iHashCode4 + (fVar != null ? fVar.hashCode() : 0);
    }

    @Override // i2.a1
    public final void l(p pVar) {
        k kVar = this.f485e;
        ((p1) pVar).G0(this.f488h, this.f486f, this.f484d, this.f482b, this.f481a, kVar, this.f487g, this.f483c);
    }
}
