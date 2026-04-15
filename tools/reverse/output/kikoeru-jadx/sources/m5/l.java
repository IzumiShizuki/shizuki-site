package m5;

import m4.j1;
import q.t0;
import ya.i0;
import ya.x0;
import ya.y;
import ya.y0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l extends n implements Comparable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f14714e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f14715f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f14716g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f14717h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f14718i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f14719j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f14720k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f14721l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f14722m;

    public l(int i10, j1 j1Var, int i11, j jVar, int i12, String str) {
        int iG;
        super(i10, j1Var, i11);
        int i13 = 0;
        this.f14715f = t0.v(i12, false);
        int i14 = this.f14726d.f14535e;
        int i15 = jVar.f14472w;
        i0 i0Var = jVar.f14470u;
        int i16 = i14 & (~i15);
        this.f14716g = (i16 & 1) != 0;
        this.f14717h = (i16 & 2) != 0;
        i0 i0VarU = i0Var.isEmpty() ? i0.u("") : i0Var;
        int i17 = 0;
        while (true) {
            if (i17 >= i0VarU.size()) {
                i17 = Integer.MAX_VALUE;
                iG = 0;
                break;
            } else {
                iG = p.g(this.f14726d, (String) i0VarU.get(i17), jVar.f14473x);
                if (iG > 0) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        this.f14718i = i17;
        this.f14719j = iG;
        int i18 = this.f14726d.f14536f;
        int i19 = jVar.f14471v;
        y0 y0Var = p.f14745j;
        int iBitCount = (i18 == 0 || i18 != i19) ? Integer.bitCount(i18 & i19) : Integer.MAX_VALUE;
        this.f14720k = iBitCount;
        this.f14722m = (this.f14726d.f14536f & 1088) != 0;
        int iG2 = p.g(this.f14726d, str, p.j(str) == null);
        this.f14721l = iG2;
        boolean z10 = iG > 0 || (i0Var.isEmpty() && iBitCount > 0) || this.f14716g || (this.f14717h && iG2 > 0);
        if (t0.v(i12, jVar.p0) && z10) {
            i13 = 1;
        }
        this.f14714e = i13;
    }

    @Override // m5.n
    public final int a() {
        return this.f14714e;
    }

    @Override // m5.n
    public final /* bridge */ /* synthetic */ boolean b(n nVar) {
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(l lVar) {
        y yVarC = y.f26074a.c(this.f14715f, lVar.f14715f);
        Integer numValueOf = Integer.valueOf(this.f14718i);
        Integer numValueOf2 = Integer.valueOf(lVar.f14718i);
        x0 x0Var = x0.f26071b;
        x0 x0Var2 = x0.f26072c;
        y yVarB = yVarC.b(numValueOf, numValueOf2, x0Var2);
        int i10 = lVar.f14719j;
        int i11 = this.f14719j;
        y yVarA = yVarB.a(i11, i10);
        int i12 = lVar.f14720k;
        int i13 = this.f14720k;
        y yVarC2 = yVarA.a(i13, i12).c(this.f14716g, lVar.f14716g);
        Boolean boolValueOf = Boolean.valueOf(this.f14717h);
        Boolean boolValueOf2 = Boolean.valueOf(lVar.f14717h);
        if (i11 != 0) {
            x0Var = x0Var2;
        }
        y yVarA2 = yVarC2.b(boolValueOf, boolValueOf2, x0Var).a(this.f14721l, lVar.f14721l);
        if (i13 == 0) {
            yVarA2 = yVarA2.d(this.f14722m, lVar.f14722m);
        }
        return yVarA2.e();
    }
}
