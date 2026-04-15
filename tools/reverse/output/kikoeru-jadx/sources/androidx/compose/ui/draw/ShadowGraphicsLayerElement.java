package androidx.compose.ui.draw;

import a0.f0;
import f3.f;
import i2.a1;
import i2.g1;
import j1.p;
import jc.l;
import kotlin.Metadata;
import q.t0;
import q1.l0;
import q1.q;
import ub.v;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;", "Li2/a1;", "Lq1/l;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ShadowGraphicsLayerElement extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0 f683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f686e;

    public ShadowGraphicsLayerElement(float f10, l0 l0Var, boolean z10, long j10, long j11) {
        this.f682a = f10;
        this.f683b = l0Var;
        this.f684c = z10;
        this.f685d = j10;
        this.f686e = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShadowGraphicsLayerElement)) {
            return false;
        }
        ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) obj;
        return f.a(this.f682a, shadowGraphicsLayerElement.f682a) && l.a(this.f683b, shadowGraphicsLayerElement.f683b) && this.f684c == shadowGraphicsLayerElement.f684c && q.c(this.f685d, shadowGraphicsLayerElement.f685d) && q.c(this.f686e, shadowGraphicsLayerElement.f686e);
    }

    @Override // i2.a1
    public final p h() {
        return new q1.l(new f0(26, this));
    }

    public final int hashCode() {
        int iHashCode = (((this.f683b.hashCode() + (Float.floatToIntBits(this.f682a) * 31)) * 31) + (this.f684c ? 1231 : 1237)) * 31;
        int i10 = q.f17576i;
        return v.a(this.f686e) + t0.y(iHashCode, 31, this.f685d);
    }

    @Override // i2.a1
    public final void l(p pVar) {
        q1.l lVar = (q1.l) pVar;
        lVar.f17548o = new f0(26, this);
        g1 g1Var = i2.f.v(lVar, 2).f8703r;
        if (g1Var != null) {
            g1Var.l1(lVar.f17548o, true);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        sb.append((Object) f.b(this.f682a));
        sb.append(", shape=");
        sb.append(this.f683b);
        sb.append(", clip=");
        sb.append(this.f684c);
        sb.append(", ambientColor=");
        t0.K(this.f685d, ", spotColor=", sb);
        sb.append((Object) q.i(this.f686e));
        sb.append(')');
        return sb.toString();
    }
}
