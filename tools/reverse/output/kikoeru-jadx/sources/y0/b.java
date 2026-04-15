package y0;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0.o f25296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f25297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f25298c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f25301f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f25302g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f25307l;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i2.v f25299d = new i2.v();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f25300e = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f25303h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f25304i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f25305j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f25306k = -1;

    public b(x0.o oVar, a aVar) {
        this.f25296a = oVar;
        this.f25297b = aVar;
    }

    public final void a() {
        c();
        ArrayList arrayList = this.f25303h;
        if (arrayList.isEmpty()) {
            this.f25302g++;
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public final void b() {
        int i10 = this.f25302g;
        if (i10 > 0) {
            k0 k0Var = this.f25297b.f25294a;
            k0Var.J(g0.f25319d);
            k0Var.f25330c[k0Var.f25331d - k0Var.f25328a[k0Var.f25329b - 1].f25324b] = i10;
            this.f25302g = 0;
        }
        ArrayList arrayList = this.f25303h;
        if (arrayList.isEmpty()) {
            return;
        }
        a aVar = this.f25297b;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i11] = arrayList.get(i11);
        }
        aVar.getClass();
        if (size != 0) {
            k0 k0Var2 = aVar.f25294a;
            k0Var2.J(k.f25327d);
            ud.n.B(k0Var2, 0, objArr);
        }
        arrayList.clear();
    }

    public final void c() {
        int i10 = this.f25307l;
        if (i10 > 0) {
            int i11 = this.f25304i;
            if (i11 >= 0) {
                b();
                k0 k0Var = this.f25297b.f25294a;
                k0Var.J(y.f25351d);
                int i12 = k0Var.f25331d - k0Var.f25328a[k0Var.f25329b - 1].f25324b;
                int[] iArr = k0Var.f25330c;
                iArr[i12] = i11;
                iArr[i12 + 1] = i10;
                this.f25304i = -1;
            } else {
                int i13 = this.f25306k;
                int i14 = this.f25305j;
                b();
                k0 k0Var2 = this.f25297b.f25294a;
                k0Var2.J(v.f25348d);
                int i15 = k0Var2.f25331d - k0Var2.f25328a[k0Var2.f25329b - 1].f25324b;
                int[] iArr2 = k0Var2.f25330c;
                iArr2[i15 + 1] = i13;
                iArr2[i15] = i14;
                iArr2[i15 + 2] = i10;
                this.f25305j = -1;
                this.f25306k = -1;
            }
            this.f25307l = 0;
        }
    }

    public final void d(boolean z10) {
        x0.o oVar = this.f25296a;
        int i10 = z10 ? oVar.G.f24537i : oVar.G.f24535g;
        int i11 = i10 - this.f25301f;
        if (i11 < 0) {
            x0.p.c("Tried to seek backward");
        }
        if (i11 > 0) {
            k0 k0Var = this.f25297b.f25294a;
            k0Var.J(d.f25312d);
            k0Var.f25330c[k0Var.f25331d - k0Var.f25328a[k0Var.f25329b - 1].f25324b] = i11;
            this.f25301f = i10;
        }
    }

    public final void e(int i10, int i11) {
        if (i11 > 0) {
            if (!(i10 >= 0)) {
                x0.p.c("Invalid remove index " + i10);
            }
            if (this.f25304i == i10) {
                this.f25307l += i11;
                return;
            }
            c();
            this.f25304i = i10;
            this.f25307l = i11;
        }
    }
}
