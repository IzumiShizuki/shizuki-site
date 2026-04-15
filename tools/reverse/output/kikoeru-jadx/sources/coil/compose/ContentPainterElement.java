package coil.compose;

import g2.p;
import i2.a1;
import i2.f;
import i8.l;
import i8.s;
import j1.d;
import kotlin.Metadata;
import p1.e;
import q.t0;
import q1.k;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcoil/compose/ContentPainterElement;", "Li2/a1;", "Li8/s;", "coil-compose-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ContentPainterElement extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f4287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f4288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f4289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f4290d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k f4291e;

    public ContentPainterElement(l lVar, d dVar, p pVar, float f10, k kVar) {
        this.f4287a = lVar;
        this.f4288b = dVar;
        this.f4289c = pVar;
        this.f4290d = f10;
        this.f4291e = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentPainterElement)) {
            return false;
        }
        ContentPainterElement contentPainterElement = (ContentPainterElement) obj;
        return this.f4287a.equals(contentPainterElement.f4287a) && jc.l.a(this.f4288b, contentPainterElement.f4288b) && jc.l.a(this.f4289c, contentPainterElement.f4289c) && Float.compare(this.f4290d, contentPainterElement.f4290d) == 0 && jc.l.a(this.f4291e, contentPainterElement.f4291e);
    }

    @Override // i2.a1
    public final j1.p h() {
        s sVar = new s();
        sVar.f9453o = this.f4287a;
        sVar.f9454p = this.f4288b;
        sVar.f9455q = this.f4289c;
        sVar.f9456r = this.f4290d;
        sVar.f9457s = this.f4291e;
        return sVar;
    }

    public final int hashCode() {
        int iX = t0.x(this.f4290d, (this.f4289c.hashCode() + ((this.f4288b.hashCode() + (this.f4287a.hashCode() * 31)) * 31)) * 31, 31);
        k kVar = this.f4291e;
        return iX + (kVar == null ? 0 : kVar.hashCode());
    }

    @Override // i2.a1
    public final void l(j1.p pVar) {
        s sVar = (s) pVar;
        long jH = sVar.f9453o.h();
        l lVar = this.f4287a;
        boolean zA = e.a(jH, lVar.h());
        sVar.f9453o = lVar;
        sVar.f9454p = this.f4288b;
        sVar.f9455q = this.f4289c;
        sVar.f9456r = this.f4290d;
        sVar.f9457s = this.f4291e;
        if (!zA) {
            f.n(sVar);
        }
        f.m(sVar);
    }

    public final String toString() {
        return "ContentPainterElement(painter=" + this.f4287a + ", alignment=" + this.f4288b + ", contentScale=" + this.f4289c + ", alpha=" + this.f4290d + ", colorFilter=" + this.f4291e + ')';
    }
}
