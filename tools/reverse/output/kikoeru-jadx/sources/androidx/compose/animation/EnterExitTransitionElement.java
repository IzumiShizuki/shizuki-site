package androidx.compose.animation;

import com.tencent.bugly.beta.tinker.TinkerReport;
import i2.a1;
import j1.p;
import jc.l;
import kotlin.Metadata;
import q.g0;
import q.p0;
import q.q0;
import q.r0;
import r.j1;
import r.q1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/animation/EnterExitTransitionElement;", "Li2/a1;", "Lq/p0;", "animation_release"}, k = 1, mv = {1, TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART, 0}, xi = 48)
final /* data */ class EnterExitTransitionElement extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q1 f441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j1 f442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j1 f443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j1 f444d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q0 f445e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r0 f446f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ic.a f447g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g0 f448h;

    public EnterExitTransitionElement(q1 q1Var, j1 j1Var, j1 j1Var2, j1 j1Var3, q0 q0Var, r0 r0Var, ic.a aVar, g0 g0Var) {
        this.f441a = q1Var;
        this.f442b = j1Var;
        this.f443c = j1Var2;
        this.f444d = j1Var3;
        this.f445e = q0Var;
        this.f446f = r0Var;
        this.f447g = aVar;
        this.f448h = g0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnterExitTransitionElement)) {
            return false;
        }
        EnterExitTransitionElement enterExitTransitionElement = (EnterExitTransitionElement) obj;
        return l.a(this.f441a, enterExitTransitionElement.f441a) && l.a(this.f442b, enterExitTransitionElement.f442b) && l.a(this.f443c, enterExitTransitionElement.f443c) && l.a(this.f444d, enterExitTransitionElement.f444d) && l.a(this.f445e, enterExitTransitionElement.f445e) && l.a(this.f446f, enterExitTransitionElement.f446f) && l.a(this.f447g, enterExitTransitionElement.f447g) && l.a(this.f448h, enterExitTransitionElement.f448h);
    }

    @Override // i2.a1
    public final p h() {
        return new p0(this.f441a, this.f442b, this.f443c, this.f444d, this.f445e, this.f446f, this.f447g, this.f448h);
    }

    public final int hashCode() {
        int iHashCode = this.f441a.hashCode() * 31;
        j1 j1Var = this.f442b;
        int iHashCode2 = (iHashCode + (j1Var == null ? 0 : j1Var.hashCode())) * 31;
        j1 j1Var2 = this.f443c;
        int iHashCode3 = (iHashCode2 + (j1Var2 == null ? 0 : j1Var2.hashCode())) * 31;
        j1 j1Var3 = this.f444d;
        return this.f448h.hashCode() + ((this.f447g.hashCode() + ((this.f446f.f17436a.hashCode() + ((this.f445e.f17411a.hashCode() + ((iHashCode3 + (j1Var3 != null ? j1Var3.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }

    @Override // i2.a1
    public final void l(p pVar) {
        p0 p0Var = (p0) pVar;
        p0Var.f17391o = this.f441a;
        p0Var.f17392p = this.f442b;
        p0Var.f17393q = this.f443c;
        p0Var.f17394r = this.f444d;
        p0Var.f17395s = this.f445e;
        p0Var.f17396t = this.f446f;
        p0Var.f17397u = this.f447g;
        p0Var.f17398v = this.f448h;
    }

    public final String toString() {
        return "EnterExitTransitionElement(transition=" + this.f441a + ", sizeAnimation=" + this.f442b + ", offsetAnimation=" + this.f443c + ", slideAnimation=" + this.f444d + ", enter=" + this.f445e + ", exit=" + this.f446f + ", isEnabled=" + this.f447g + ", graphicsLayerBlock=" + this.f448h + ')';
    }
}
