package androidx.compose.animation;

import b0.d0;
import com.tencent.bugly.beta.tinker.TinkerReport;
import i2.a1;
import ic.n;
import j1.p;
import kotlin.Metadata;
import q.b1;
import q.q1;
import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/animation/RenderInTransitionOverlayNodeElement;", "Li2/a1;", "Lq/b1;", "animation_release"}, k = 1, mv = {1, TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART, 0}, xi = 48)
public final /* data */ class RenderInTransitionOverlayNodeElement extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q1 f449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f451c;

    public RenderInTransitionOverlayNodeElement(q1 q1Var, d0 d0Var, n nVar) {
        this.f449a = q1Var;
        this.f450b = d0Var;
        this.f451c = nVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RenderInTransitionOverlayNodeElement)) {
            return false;
        }
        RenderInTransitionOverlayNodeElement renderInTransitionOverlayNodeElement = (RenderInTransitionOverlayNodeElement) obj;
        return this.f449a.equals(renderInTransitionOverlayNodeElement.f449a) && this.f450b == renderInTransitionOverlayNodeElement.f450b && this.f451c == renderInTransitionOverlayNodeElement.f451c;
    }

    @Override // i2.a1
    public final p h() {
        return new b1(this.f449a, this.f450b, this.f451c);
    }

    public final int hashCode() {
        return this.f451c.hashCode() + t0.x(0.0f, (this.f450b.hashCode() + (this.f449a.hashCode() * 31)) * 31, 31);
    }

    @Override // i2.a1
    public final void l(p pVar) {
        b1 b1Var = (b1) pVar;
        b1Var.f17239o = this.f449a;
        b1Var.f17240p = this.f450b;
        b1Var.f17242r.f(0.0f);
        b1Var.f17241q = this.f451c;
    }

    public final String toString() {
        return "RenderInTransitionOverlayNodeElement(sharedTransitionScope=" + this.f449a + ", renderInOverlay=" + this.f450b + ", zIndexInOverlay=0.0, clipInOverlay=" + this.f451c + ')';
    }
}
