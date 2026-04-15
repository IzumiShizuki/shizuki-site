package x0;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a2 f24529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f24530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f24531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object[] f24532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f24533e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f24534f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f24535g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f24536h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f24537i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i2.v f24538j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f24539k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f24540l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f24541m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f24542n;

    public z1(a2 a2Var) {
        this.f24529a = a2Var;
        this.f24530b = a2Var.f24236a;
        int i10 = a2Var.f24237b;
        this.f24531c = i10;
        this.f24532d = a2Var.f24238c;
        this.f24533e = a2Var.f24239d;
        this.f24536h = i10;
        this.f24537i = -1;
        this.f24538j = new i2.v();
    }

    public final a a(int i10) {
        ArrayList arrayList = this.f24529a.f24244i;
        int iE = c2.e(arrayList, i10, this.f24531c);
        if (iE >= 0) {
            return (a) arrayList.get(iE);
        }
        a aVar = new a(i10);
        arrayList.add(-(iE + 1), aVar);
        return aVar;
    }

    public final Object b(int[] iArr, int i10) {
        int i11 = i10 * 5;
        int i12 = iArr[i11 + 1];
        if ((268435456 & i12) != 0) {
            return this.f24532d[i11 >= iArr.length ? iArr.length : iArr[i11 + 4] + Integer.bitCount(i12 >> 29)];
        }
        return k.f24334a;
    }

    public final void c() {
        this.f24534f = true;
        a2 a2Var = this.f24529a;
        a2Var.getClass();
        if (this.f24529a != a2Var || a2Var.f24240e <= 0) {
            p.c("Unexpected reader close()");
        }
        a2Var.f24240e--;
        this.f24532d = new Object[0];
    }

    public final boolean d(int i10) {
        return (this.f24530b[(i10 * 5) + 1] & 67108864) != 0;
    }

    public final void e() {
        if (this.f24539k == 0) {
            if (!(this.f24535g == this.f24536h)) {
                p.c("endGroup() not called at the end of a group");
            }
            int i10 = (this.f24537i * 5) + 2;
            int[] iArr = this.f24530b;
            int i11 = iArr[i10];
            this.f24537i = i11;
            int i12 = this.f24531c;
            this.f24536h = i11 < 0 ? i12 : c2.a(iArr, i11) + i11;
            int iB = this.f24538j.b();
            if (iB < 0) {
                this.f24540l = 0;
                this.f24541m = 0;
            } else {
                this.f24540l = iB;
                this.f24541m = i11 >= i12 - 1 ? this.f24533e : iArr[((i11 + 1) * 5) + 4];
            }
        }
    }

    public final Object f() {
        int i10 = this.f24535g;
        if (i10 < this.f24536h) {
            return b(this.f24530b, i10);
        }
        return 0;
    }

    public final int g() {
        int i10 = this.f24535g;
        if (i10 >= this.f24536h) {
            return 0;
        }
        return this.f24530b[i10 * 5];
    }

    public final Object h(int i10, int i11) {
        int[] iArr = this.f24530b;
        int iC = c2.c(iArr, i10);
        int i12 = i10 + 1;
        int i13 = iC + i11;
        return i13 < (i12 < this.f24531c ? iArr[(i12 * 5) + 4] : this.f24533e) ? this.f24532d[i13] : k.f24334a;
    }

    public final int i(int i10) {
        return this.f24530b[i10 * 5];
    }

    public final boolean j(int i10) {
        return (this.f24530b[(i10 * 5) + 1] & 134217728) != 0;
    }

    public final boolean k(int i10) {
        return (this.f24530b[(i10 * 5) + 1] & 536870912) != 0;
    }

    public final boolean l(int i10) {
        return (this.f24530b[(i10 * 5) + 1] & 1073741824) != 0;
    }

    public final Object m() {
        int i10;
        if (this.f24539k > 0 || (i10 = this.f24540l) >= this.f24541m) {
            this.f24542n = false;
            return k.f24334a;
        }
        this.f24542n = true;
        Object[] objArr = this.f24532d;
        this.f24540l = i10 + 1;
        return objArr[i10];
    }

    public final Object n(int i10) {
        int i11 = i10 * 5;
        int[] iArr = this.f24530b;
        int i12 = iArr[i11 + 1] & 1073741824;
        if (i12 != 0) {
            return i12 != 0 ? this.f24532d[iArr[i11 + 4]] : k.f24334a;
        }
        return null;
    }

    public final int o(int i10) {
        return this.f24530b[(i10 * 5) + 1] & 67108863;
    }

    public final Object p(int[] iArr, int i10) {
        int i11 = i10 * 5;
        int i12 = iArr[i11 + 1];
        if ((536870912 & i12) == 0) {
            return null;
        }
        return this.f24532d[Integer.bitCount(i12 >> 30) + iArr[i11 + 4]];
    }

    public final int q(int i10) {
        return this.f24530b[(i10 * 5) + 2];
    }

    public final void r(int i10) {
        if (!(this.f24539k == 0)) {
            p.c("Cannot reposition while in an empty region");
        }
        this.f24535g = i10;
        int[] iArr = this.f24530b;
        int i11 = this.f24531c;
        int i12 = i10 < i11 ? iArr[(i10 * 5) + 2] : -1;
        if (i12 != this.f24537i) {
            this.f24537i = i12;
            if (i12 < 0) {
                this.f24536h = i11;
            } else {
                this.f24536h = c2.a(iArr, i12) + i12;
            }
            this.f24540l = 0;
            this.f24541m = 0;
        }
    }

    public final int s() {
        if (!(this.f24539k == 0)) {
            p.c("Cannot skip while in an empty region");
        }
        int i10 = this.f24535g;
        int[] iArr = this.f24530b;
        int i11 = (iArr[(i10 * 5) + 1] & 1073741824) == 0 ? iArr[(i10 * 5) + 1] & 67108863 : 1;
        this.f24535g = c2.a(iArr, i10) + i10;
        return i11;
    }

    public final void t() {
        if (!(this.f24539k == 0)) {
            p.c("Cannot skip the enclosing group while in an empty region");
        }
        this.f24535g = this.f24536h;
        this.f24540l = 0;
        this.f24541m = 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SlotReader(current=");
        sb.append(this.f24535g);
        sb.append(", key=");
        sb.append(g());
        sb.append(", parent=");
        sb.append(this.f24537i);
        sb.append(", end=");
        return j2.h0.m(sb, this.f24536h, ')');
    }

    public final void u() {
        if (this.f24539k <= 0) {
            int i10 = this.f24537i;
            int i11 = this.f24535g;
            int[] iArr = this.f24530b;
            if (!(iArr[(i11 * 5) + 2] == i10)) {
                k1.a("Invalid slot table detected");
            }
            int i12 = this.f24540l;
            int i13 = this.f24541m;
            i2.v vVar = this.f24538j;
            if (i12 == 0 && i13 == 0) {
                vVar.c(-1);
            } else {
                vVar.c(i12);
            }
            this.f24537i = i11;
            this.f24536h = c2.a(iArr, i11) + i11;
            int i14 = i11 + 1;
            this.f24535g = i14;
            this.f24540l = c2.c(iArr, i11);
            this.f24541m = i11 >= this.f24531c - 1 ? this.f24533e : iArr[(i14 * 5) + 4];
        }
    }
}
