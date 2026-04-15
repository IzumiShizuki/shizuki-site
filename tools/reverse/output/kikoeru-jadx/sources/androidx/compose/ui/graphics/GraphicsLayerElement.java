package androidx.compose.ui.graphics;

import i2.a1;
import i2.f;
import i2.g1;
import j1.p;
import jc.l;
import kotlin.Metadata;
import q.a0;
import q.t0;
import q1.h0;
import q1.l0;
import q1.m0;
import q1.p0;
import q1.q;
import ub.v;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/GraphicsLayerElement;", "Li2/a1;", "Lq1/m0;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class GraphicsLayerElement extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f696d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f697e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l0 f698f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f699g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f700h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f701i;

    public GraphicsLayerElement(float f10, float f11, float f12, float f13, long j10, l0 l0Var, boolean z10, long j11, long j12) {
        this.f693a = f10;
        this.f694b = f11;
        this.f695c = f12;
        this.f696d = f13;
        this.f697e = j10;
        this.f698f = l0Var;
        this.f699g = z10;
        this.f700h = j11;
        this.f701i = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphicsLayerElement)) {
            return false;
        }
        GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) obj;
        return Float.compare(this.f693a, graphicsLayerElement.f693a) == 0 && Float.compare(this.f694b, graphicsLayerElement.f694b) == 0 && Float.compare(this.f695c, graphicsLayerElement.f695c) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.f696d, graphicsLayerElement.f696d) == 0 && Float.compare(8.0f, 8.0f) == 0 && p0.a(this.f697e, graphicsLayerElement.f697e) && l.a(this.f698f, graphicsLayerElement.f698f) && this.f699g == graphicsLayerElement.f699g && q.c(this.f700h, graphicsLayerElement.f700h) && q.c(this.f701i, graphicsLayerElement.f701i);
    }

    @Override // i2.a1
    public final p h() {
        m0 m0Var = new m0();
        m0Var.f17549o = this.f693a;
        m0Var.f17550p = this.f694b;
        m0Var.f17551q = this.f695c;
        m0Var.f17552r = this.f696d;
        m0Var.f17553s = 8.0f;
        m0Var.f17554t = this.f697e;
        m0Var.f17555u = this.f698f;
        m0Var.f17556v = this.f699g;
        m0Var.f17557w = this.f700h;
        m0Var.f17558x = this.f701i;
        m0Var.f17559y = 3;
        m0Var.f17560z = new a0(3, m0Var);
        return m0Var;
    }

    public final int hashCode() {
        int iX = t0.x(8.0f, t0.x(this.f696d, t0.x(0.0f, t0.x(0.0f, t0.x(0.0f, t0.x(0.0f, t0.x(0.0f, t0.x(this.f695c, t0.x(this.f694b, Float.floatToIntBits(this.f693a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i10 = p0.f17567c;
        long j10 = this.f697e;
        int iHashCode = (((this.f698f.hashCode() + ((((int) (j10 ^ (j10 >>> 32))) + iX) * 31)) * 31) + (this.f699g ? 1231 : 1237)) * 961;
        int i11 = q.f17576i;
        return (((v.a(this.f701i) + t0.y(iHashCode, 31, this.f700h)) * 961) + 3) * 31;
    }

    @Override // i2.a1
    public final void l(p pVar) {
        m0 m0Var = (m0) pVar;
        m0Var.f17549o = this.f693a;
        m0Var.f17550p = this.f694b;
        m0Var.f17551q = this.f695c;
        m0Var.f17552r = this.f696d;
        m0Var.f17553s = 8.0f;
        m0Var.f17554t = this.f697e;
        m0Var.f17555u = this.f698f;
        m0Var.f17556v = this.f699g;
        m0Var.f17557w = this.f700h;
        m0Var.f17558x = this.f701i;
        m0Var.f17559y = 3;
        g1 g1Var = f.v(m0Var, 2).f8703r;
        if (g1Var != null) {
            g1Var.l1(m0Var.f17560z, true);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphicsLayerElement(scaleX=");
        sb.append(this.f693a);
        sb.append(", scaleY=");
        sb.append(this.f694b);
        sb.append(", alpha=");
        sb.append(this.f695c);
        sb.append(", translationX=0.0, translationY=0.0, shadowElevation=0.0, rotationX=0.0, rotationY=0.0, rotationZ=");
        sb.append(this.f696d);
        sb.append(", cameraDistance=8.0, transformOrigin=");
        sb.append((Object) p0.d(this.f697e));
        sb.append(", shape=");
        sb.append(this.f698f);
        sb.append(", clip=");
        sb.append(this.f699g);
        sb.append(", renderEffect=null, ambientShadowColor=");
        t0.K(this.f700h, ", spotShadowColor=", sb);
        sb.append((Object) q.i(this.f701i));
        sb.append(", compositingStrategy=CompositingStrategy(value=0), blendMode=");
        sb.append((Object) h0.G(3));
        sb.append(", colorFilter=null)");
        return sb.toString();
    }
}
