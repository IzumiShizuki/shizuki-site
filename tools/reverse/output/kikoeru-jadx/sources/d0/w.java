package d0;

import g2.w0;
import java.util.List;
import java.util.Map;
import u.e1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class w implements w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f5411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5414d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e1 f5415e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f5416f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f5417g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j f5418h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j f5419i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f5420j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f5421k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f5422l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final v.k f5423m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final w0 f5424n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f5425o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List f5426p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f5427q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final hf.y f5428r;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ w(int i10, int i11, int i12, int i13, int i14, v.k kVar, w0 w0Var, hf.y yVar) {
        vb.r rVar = vb.r.f22819a;
        this(rVar, i10, i11, i12, e1.f20883b, i13, i14, null, null, 0.0f, 0, false, kVar, w0Var, false, rVar, rVar, yVar);
    }

    public final w a(int i10) {
        int i11;
        int i12 = this.f5412b + this.f5413c;
        if (this.f5425o) {
            return null;
        }
        List list = this.f5411a;
        if (list.isEmpty() || this.f5418h == null || (i11 = this.f5421k - i10) < 0 || i11 >= i12) {
            return null;
        }
        float f10 = this.f5420j - (i12 != 0 ? i10 / i12 : 0.0f);
        if (this.f5419i == null || f10 >= 0.5f || f10 <= -0.5f) {
            return null;
        }
        j jVar = (j) vb.m.Y(list);
        j jVar2 = (j) vb.m.h0(list);
        int i13 = this.f5417g;
        int i14 = this.f5416f;
        if (i10 < 0) {
            if (Math.min((jVar.f5357l + i12) - i14, (jVar2.f5357l + i12) - i13) <= (-i10)) {
                return null;
            }
        } else if (Math.min(i14 - jVar.f5357l, i13 - jVar2.f5357l) <= i10) {
            return null;
        }
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            ((j) list.get(i15)).a(i10);
        }
        List list2 = this.f5426p;
        int size2 = list2.size();
        for (int i16 = 0; i16 < size2; i16++) {
            ((j) list2.get(i16)).a(i10);
        }
        List list3 = this.f5427q;
        int size3 = list3.size();
        for (int i17 = 0; i17 < size3; i17++) {
            ((j) list3.get(i17)).a(i10);
        }
        return new w(this.f5411a, this.f5412b, this.f5413c, this.f5414d, this.f5415e, this.f5416f, this.f5417g, this.f5418h, this.f5419i, f10, i11, this.f5422l || i10 > 0, this.f5423m, this.f5424n, this.f5425o, this.f5426p, this.f5427q, this.f5428r);
    }

    @Override // g2.w0
    public final int b() {
        return this.f5424n.b();
    }

    public final long c() {
        w0 w0Var = this.f5424n;
        return (((long) w0Var.h()) << 32) | (((long) w0Var.b()) & 4294967295L);
    }

    @Override // g2.w0
    public final int h() {
        return this.f5424n.h();
    }

    @Override // g2.w0
    public final Map i() {
        return this.f5424n.i();
    }

    @Override // g2.w0
    public final void j() {
        this.f5424n.j();
    }

    @Override // g2.w0
    public final ic.k k() {
        return this.f5424n.k();
    }

    public w(List list, int i10, int i11, int i12, e1 e1Var, int i13, int i14, j jVar, j jVar2, float f10, int i15, boolean z10, v.k kVar, w0 w0Var, boolean z11, List list2, List list3, hf.y yVar) {
        this.f5411a = list;
        this.f5412b = i10;
        this.f5413c = i11;
        this.f5414d = i12;
        this.f5415e = e1Var;
        this.f5416f = i13;
        this.f5417g = i14;
        this.f5418h = jVar;
        this.f5419i = jVar2;
        this.f5420j = f10;
        this.f5421k = i15;
        this.f5422l = z10;
        this.f5423m = kVar;
        this.f5424n = w0Var;
        this.f5425o = z11;
        this.f5426p = list2;
        this.f5427q = list3;
        this.f5428r = yVar;
    }
}
