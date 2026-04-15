package androidx.compose.ui.draw;

import g2.p;
import i2.a1;
import i2.f;
import j1.d;
import jc.l;
import kotlin.Metadata;
import n1.g;
import p1.e;
import q.t0;
import q1.k;
import v1.b;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/PainterElement;", "Li2/a1;", "Ln1/g;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class PainterElement extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k f681e;

    public PainterElement(b bVar, d dVar, p pVar, float f10, k kVar) {
        this.f677a = bVar;
        this.f678b = dVar;
        this.f679c = pVar;
        this.f680d = f10;
        this.f681e = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) obj;
        return l.a(this.f677a, painterElement.f677a) && l.a(this.f678b, painterElement.f678b) && l.a(this.f679c, painterElement.f679c) && Float.compare(this.f680d, painterElement.f680d) == 0 && l.a(this.f681e, painterElement.f681e);
    }

    @Override // i2.a1
    public final j1.p h() {
        g gVar = new g();
        gVar.f15245o = this.f677a;
        gVar.f15246p = true;
        gVar.f15247q = this.f678b;
        gVar.f15248r = this.f679c;
        gVar.f15249s = this.f680d;
        gVar.f15250t = this.f681e;
        return gVar;
    }

    public final int hashCode() {
        int iX = t0.x(this.f680d, (this.f679c.hashCode() + ((this.f678b.hashCode() + (((this.f677a.hashCode() * 31) + 1231) * 31)) * 31)) * 31, 31);
        k kVar = this.f681e;
        return iX + (kVar == null ? 0 : kVar.hashCode());
    }

    @Override // i2.a1
    public final void l(j1.p pVar) {
        g gVar = (g) pVar;
        boolean z10 = gVar.f15246p;
        b bVar = this.f677a;
        boolean z11 = (z10 && e.a(gVar.f15245o.h(), bVar.h())) ? false : true;
        gVar.f15245o = bVar;
        gVar.f15246p = true;
        gVar.f15247q = this.f678b;
        gVar.f15248r = this.f679c;
        gVar.f15249s = this.f680d;
        gVar.f15250t = this.f681e;
        if (z11) {
            f.n(gVar);
        }
        f.m(gVar);
    }

    public final String toString() {
        return "PainterElement(painter=" + this.f677a + ", sizeToIntrinsics=true, alignment=" + this.f678b + ", contentScale=" + this.f679c + ", alpha=" + this.f680d + ", colorFilter=" + this.f681e + ')';
    }
}
