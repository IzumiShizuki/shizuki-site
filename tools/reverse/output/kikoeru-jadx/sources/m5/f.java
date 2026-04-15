package m5;

import android.text.TextUtils;
import java.util.Objects;
import p4.c0;
import ya.x0;
import ya.y;
import ya.y0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f extends n implements Comparable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f14678e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f14679f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f14680g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j f14681h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f14682i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f14683j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f14684k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f14685l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f14686m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f14687n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f14688o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f14689p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f14690q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f14691r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f14692s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f14693t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f14694u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f14695v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f14696w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f14697x;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f(int r14, m4.j1 r15, int r16, m5.j r17, int r18, boolean r19, m5.e r20, int r21) {
        /*
            Method dump skipped, instruction units count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m5.f.<init>(int, m4.j1, int, m5.j, int, boolean, m5.e, int):void");
    }

    @Override // m5.n
    public final int a() {
        return this.f14678e;
    }

    @Override // m5.n
    public final boolean b(n nVar) {
        int i10;
        String str;
        f fVar = (f) nVar;
        m4.q qVar = fVar.f14726d;
        this.f14681h.getClass();
        m4.q qVar2 = this.f14726d;
        int i11 = qVar2.D;
        if (i11 == -1 || i11 != qVar.D) {
            return false;
        }
        return (this.f14686m || ((str = qVar2.f14544n) != null && TextUtils.equals(str, qVar.f14544n))) && (i10 = qVar2.E) != -1 && i10 == qVar.E && this.f14695v == fVar.f14695v && this.f14696w == fVar.f14696w;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(f fVar) {
        boolean z10 = this.f14682i;
        boolean z11 = this.f14679f;
        y0 y0VarA = (z11 && z10) ? p.f14745j : p.f14745j.a();
        boolean z12 = fVar.f14682i;
        int i10 = fVar.f14693t;
        y yVarC = y.f26074a.c(z10, z12);
        Integer numValueOf = Integer.valueOf(this.f14684k);
        Integer numValueOf2 = Integer.valueOf(fVar.f14684k);
        x0 x0Var = x0.f26072c;
        y yVarB = yVarC.b(numValueOf, numValueOf2, x0Var).a(this.f14683j, fVar.f14683j).a(this.f14685l, fVar.f14685l).c(this.f14690q, fVar.f14690q).c(this.f14687n, fVar.f14687n).b(Integer.valueOf(this.f14688o), Integer.valueOf(fVar.f14688o), x0Var).a(this.f14689p, fVar.f14689p).c(z11, fVar.f14679f).b(Integer.valueOf(this.f14694u), Integer.valueOf(fVar.f14694u), x0Var);
        boolean z13 = this.f14681h.f14475z;
        int i11 = this.f14693t;
        if (z13) {
            yVarB = yVarB.b(Integer.valueOf(i11), Integer.valueOf(i10), p.f14745j.a());
        }
        y yVarB2 = yVarB.c(this.f14695v, fVar.f14695v).c(this.f14696w, fVar.f14696w).c(this.f14697x, fVar.f14697x).b(Integer.valueOf(this.f14691r), Integer.valueOf(fVar.f14691r), y0VarA).b(Integer.valueOf(this.f14692s), Integer.valueOf(fVar.f14692s), y0VarA);
        String str = fVar.f14680g;
        int i12 = c0.f16548a;
        if (Objects.equals(this.f14680g, str)) {
            yVarB2 = yVarB2.b(Integer.valueOf(i11), Integer.valueOf(i10), y0VarA);
        }
        return yVarB2.e();
    }
}
