package a0;

import g2.w0;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import u.e1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t implements w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f117d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w0 f118e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f119f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f120g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final hf.y f121h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f3.c f122i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f123j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f124k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f125l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f126m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f127n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final e1 f128o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f129p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f130q;

    public t(u uVar, int i10, boolean z10, float f10, w0 w0Var, float f11, boolean z11, hf.y yVar, f3.c cVar, long j10, List list, int i11, int i12, int i13, e1 e1Var, int i14, int i15) {
        this.f114a = uVar;
        this.f115b = i10;
        this.f116c = z10;
        this.f117d = f10;
        this.f118e = w0Var;
        this.f119f = f11;
        this.f120g = z11;
        this.f121h = yVar;
        this.f122i = cVar;
        this.f123j = j10;
        this.f124k = list;
        this.f125l = i11;
        this.f126m = i12;
        this.f127n = i13;
        this.f128o = e1Var;
        this.f129p = i14;
        this.f130q = i15;
    }

    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, java.util.List] */
    public final t a(int i10, boolean z10) {
        u uVar;
        if (this.f120g) {
            return null;
        }
        ?? r15 = this.f124k;
        if (r15.isEmpty() || (uVar = this.f114a) == null) {
            return null;
        }
        int i11 = uVar.f145o;
        int i12 = this.f115b - i10;
        if (i12 < 0 || i12 >= i11) {
            return null;
        }
        u uVar2 = (u) vb.m.Y(r15);
        u uVar3 = (u) vb.m.h0(r15);
        if (uVar2.f147q || uVar3.f147q) {
            return null;
        }
        int i13 = this.f126m;
        int i14 = this.f125l;
        if (i10 < 0) {
            if (Math.min((uVar2.f143m + uVar2.f145o) - i14, (uVar3.f143m + uVar3.f145o) - i13) <= (-i10)) {
                return null;
            }
        } else if (Math.min(i14 - uVar2.f143m, i13 - uVar3.f143m) <= i10) {
            return null;
        }
        int size = ((Collection) r15).size();
        for (int i15 = 0; i15 < size; i15++) {
            u uVar4 = (u) r15.get(i15);
            uVar4.getClass();
            int[] iArr = uVar4.f151u;
            if (!uVar4.f147q) {
                uVar4.f143m += i10;
                int length = iArr.length;
                for (int i16 = 0; i16 < length; i16++) {
                    if ((i16 & 1) != 0) {
                        iArr[i16] = iArr[i16] + i10;
                    }
                }
                if (z10) {
                    int size2 = uVar4.f132b.size();
                    for (int i17 = 0; i17 < size2; i17++) {
                        b0.a0 a0VarA = uVar4.f141k.a(i17, uVar4.f139i);
                        if (a0VarA != null) {
                            long j10 = a0VarA.f1183l;
                            a0VarA.f1183l = (((long) (((int) (j10 & 4294967295L)) + i10)) & 4294967295L) | (((long) ((int) (j10 >> 32))) << 32);
                        }
                    }
                }
            }
        }
        return new t(this.f114a, i12, this.f116c || i10 > 0, i10, this.f118e, this.f119f, this.f120g, this.f121h, this.f122i, this.f123j, r15, this.f125l, this.f126m, this.f127n, this.f128o, this.f129p, this.f130q);
    }

    @Override // g2.w0
    public final int b() {
        return this.f118e.b();
    }

    public final long c() {
        w0 w0Var = this.f118e;
        return (((long) w0Var.h()) << 32) | (((long) w0Var.b()) & 4294967295L);
    }

    @Override // g2.w0
    public final int h() {
        return this.f118e.h();
    }

    @Override // g2.w0
    public final Map i() {
        return this.f118e.i();
    }

    @Override // g2.w0
    public final void j() {
        this.f118e.j();
    }

    @Override // g2.w0
    public final ic.k k() {
        return this.f118e.k();
    }
}
