package t2;

import java.util.List;
import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f20326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0 f20327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f20328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f20329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f20330e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f20331f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f3.c f20332g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f3.m f20333h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final x2.d f20334i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f20335j;

    public h0(g gVar, l0 l0Var, List list, int i10, boolean z10, int i11, f3.c cVar, f3.m mVar, x2.d dVar, long j10) {
        this.f20326a = gVar;
        this.f20327b = l0Var;
        this.f20328c = list;
        this.f20329d = i10;
        this.f20330e = z10;
        this.f20331f = i11;
        this.f20332g = cVar;
        this.f20333h = mVar;
        this.f20334i = dVar;
        this.f20335j = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return jc.l.a(this.f20326a, h0Var.f20326a) && jc.l.a(this.f20327b, h0Var.f20327b) && jc.l.a(this.f20328c, h0Var.f20328c) && this.f20329d == h0Var.f20329d && this.f20330e == h0Var.f20330e && this.f20331f == h0Var.f20331f && jc.l.a(this.f20332g, h0Var.f20332g) && this.f20333h == h0Var.f20333h && jc.l.a(this.f20334i, h0Var.f20334i) && f3.a.b(this.f20335j, h0Var.f20335j);
    }

    public final int hashCode() {
        int iHashCode = (this.f20334i.hashCode() + ((this.f20333h.hashCode() + ((this.f20332g.hashCode() + ((((((t0.z(j2.h0.f(this.f20326a.hashCode() * 31, 31, this.f20327b), 31, this.f20328c) + this.f20329d) * 31) + (this.f20330e ? 1231 : 1237)) * 31) + this.f20331f) * 31)) * 31)) * 31)) * 31;
        long j10 = this.f20335j;
        return ((int) ((j10 >>> 32) ^ j10)) + iHashCode;
    }

    public final String toString() {
        return "TextLayoutInput(text=" + ((Object) this.f20326a) + ", style=" + this.f20327b + ", placeholders=" + this.f20328c + ", maxLines=" + this.f20329d + ", softWrap=" + this.f20330e + ", overflow=" + ((Object) lc.b.W(this.f20331f)) + ", density=" + this.f20332g + ", layoutDirection=" + this.f20333h + ", fontFamilyResolver=" + this.f20334i + ", constraints=" + ((Object) f3.a.l(this.f20335j)) + ')';
    }
}
