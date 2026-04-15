package a0;

import b0.r0;
import g2.f1;
import g2.g1;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class u implements r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j1.f f133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f3.m f134d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f135e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f136f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f137g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f138h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f139i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f140j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.b f141k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f142l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f143m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f144n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f145o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f146p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f147q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f148r = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f149s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f150t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int[] f151u;

    public u(int i10, List list, j1.f fVar, f3.m mVar, int i11, int i12, int i13, long j10, Object obj, Object obj2, androidx.compose.foundation.lazy.layout.b bVar, long j11) {
        this.f131a = i10;
        this.f132b = list;
        this.f133c = fVar;
        this.f134d = mVar;
        this.f135e = i11;
        this.f136f = i12;
        this.f137g = i13;
        this.f138h = j10;
        this.f139i = obj;
        this.f140j = obj2;
        this.f141k = bVar;
        this.f142l = j11;
        int size = list.size();
        int i14 = 0;
        int iMax = 0;
        for (int i15 = 0; i15 < size; i15++) {
            g1 g1Var = (g1) list.get(i15);
            i14 += g1Var.f7181b;
            iMax = Math.max(iMax, g1Var.f7180a);
        }
        this.f144n = i14;
        int i16 = i14 + this.f137g;
        this.f145o = i16 >= 0 ? i16 : 0;
        this.f146p = iMax;
        this.f151u = new int[this.f132b.size() * 2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(f1 f1Var, boolean z10) {
        if (this.f148r == Integer.MIN_VALUE) {
            x.a.a("position() should be called first");
        }
        List list = this.f132b;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            g1 g1Var = (g1) list.get(i10);
            int i11 = this.f149s - g1Var.f7181b;
            int i12 = this.f150t;
            long jI = i(i10);
            b0.a0 a0VarA = this.f141k.a(i10, this.f139i);
            t1.b bVar = null;
            Object[] objArr = 0;
            if (a0VarA != null) {
                if (z10) {
                    a0VarA.f1189r = jI;
                } else {
                    if (!f3.j.b(a0VarA.f1189r, b0.a0.f1170s)) {
                        jI = a0VarA.f1189r;
                    }
                    long jD = f3.j.d(jI, ((f3.j) a0VarA.f1188q.getValue()).f6660a);
                    int i13 = (int) (jI & 4294967295L);
                    if (((i13 <= i11 && ((int) (jD & 4294967295L)) <= i11) || (i13 >= i12 && ((int) (jD & 4294967295L)) >= i12)) && ((Boolean) a0VarA.f1179h.getValue()).booleanValue()) {
                        hf.a0.y(a0VarA.f1172a, null, null, new b0.u(a0VarA, objArr == true ? 1 : 0, 1), 3);
                    }
                    jI = jD;
                }
                bVar = a0VarA.f1185n;
            }
            long jD2 = f3.j.d(jI, this.f138h);
            if (!z10 && a0VarA != null) {
                a0VarA.f1184m = jD2;
            }
            if (bVar != null) {
                f1Var.getClass();
                f1.b(f1Var, g1Var);
                g1Var.d0(f3.j.d(jD2, g1Var.f7184e), 0.0f, bVar);
            } else {
                f1.q(f1Var, g1Var, jD2);
            }
        }
    }

    @Override // b0.r0
    public final int b() {
        return this.f132b.size();
    }

    @Override // b0.r0
    public final int c() {
        return this.f145o;
    }

    @Override // b0.r0
    public final int d() {
        return 1;
    }

    @Override // b0.r0
    public final Object e(int i10) {
        return ((g1) this.f132b.get(i10)).A();
    }

    @Override // b0.r0
    public final long f() {
        return this.f142l;
    }

    @Override // b0.r0
    public final boolean g() {
        return true;
    }

    @Override // b0.r0
    public final int getIndex() {
        return this.f131a;
    }

    @Override // b0.r0
    public final Object getKey() {
        return this.f139i;
    }

    @Override // b0.r0
    public final void h() {
        this.f147q = true;
    }

    @Override // b0.r0
    public final long i(int i10) {
        int i11 = i10 * 2;
        int[] iArr = this.f151u;
        return (((long) iArr[i11]) << 32) | (((long) iArr[i11 + 1]) & 4294967295L);
    }

    @Override // b0.r0
    public final int j() {
        return 0;
    }

    @Override // b0.r0
    public final void k(int i10, int i11, int i12, int i13) {
        l(i10, i12, i13);
    }

    public final void l(int i10, int i11, int i12) {
        this.f143m = i10;
        this.f148r = i12;
        List list = this.f132b;
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            g1 g1Var = (g1) list.get(i13);
            int i14 = i13 * 2;
            j1.f fVar = this.f133c;
            if (fVar == null) {
                x.a.b("null horizontalAlignment when isVertical == true");
                throw new ce.j0();
            }
            int iA = fVar.a(g1Var.f7180a, i11, this.f134d);
            int[] iArr = this.f151u;
            iArr[i14] = iA;
            iArr[i14 + 1] = i10;
            i10 += g1Var.f7181b;
        }
        this.f149s = -this.f135e;
        this.f150t = this.f148r + this.f136f;
    }
}
