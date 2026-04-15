package w1;

import java.util.List;
import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f23244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q1.m f23246d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f23247e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final q1.m f23248f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f23249g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f23250h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f23251i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f23252j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f23253k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f23254l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f23255m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f23256n;

    public j0(String str, List list, int i10, q1.m mVar, float f10, q1.m mVar2, float f11, float f12, int i11, int i12, float f13, float f14, float f15, float f16) {
        this.f23243a = str;
        this.f23244b = list;
        this.f23245c = i10;
        this.f23246d = mVar;
        this.f23247e = f10;
        this.f23248f = mVar2;
        this.f23249g = f11;
        this.f23250h = f12;
        this.f23251i = i11;
        this.f23252j = i12;
        this.f23253k = f13;
        this.f23254l = f14;
        this.f23255m = f15;
        this.f23256n = f16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j0.class == obj.getClass()) {
            j0 j0Var = (j0) obj;
            return jc.l.a(this.f23243a, j0Var.f23243a) && jc.l.a(this.f23246d, j0Var.f23246d) && this.f23247e == j0Var.f23247e && jc.l.a(this.f23248f, j0Var.f23248f) && this.f23249g == j0Var.f23249g && this.f23250h == j0Var.f23250h && this.f23251i == j0Var.f23251i && this.f23252j == j0Var.f23252j && this.f23253k == j0Var.f23253k && this.f23254l == j0Var.f23254l && this.f23255m == j0Var.f23255m && this.f23256n == j0Var.f23256n && this.f23245c == j0Var.f23245c && jc.l.a(this.f23244b, j0Var.f23244b);
        }
        return false;
    }

    public final int hashCode() {
        int iZ = t0.z(this.f23243a.hashCode() * 31, 31, this.f23244b);
        q1.m mVar = this.f23246d;
        int iX = t0.x(this.f23247e, (iZ + (mVar != null ? mVar.hashCode() : 0)) * 31, 31);
        q1.m mVar2 = this.f23248f;
        return t0.x(this.f23256n, t0.x(this.f23255m, t0.x(this.f23254l, t0.x(this.f23253k, (((t0.x(this.f23250h, t0.x(this.f23249g, (iX + (mVar2 != null ? mVar2.hashCode() : 0)) * 31, 31), 31) + this.f23251i) * 31) + this.f23252j) * 31, 31), 31), 31), 31) + this.f23245c;
    }
}
