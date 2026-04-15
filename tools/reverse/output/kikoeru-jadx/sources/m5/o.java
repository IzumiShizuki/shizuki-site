package m5;

import java.util.Objects;
import ya.x0;
import ya.y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o extends n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f14727e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j f14728f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f14729g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f14730h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f14731i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f14732j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f14733k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f14734l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f14735m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f14736n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f14737o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f14738p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f14739q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f14740r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f14741s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f14742t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f14743u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f14744v;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public o(int r7, m4.j1 r8, int r9, m5.j r10, int r11, java.lang.String r12, int r13, boolean r14) {
        /*
            Method dump skipped, instruction units count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m5.o.<init>(int, m4.j1, int, m5.j, int, java.lang.String, int, boolean):void");
    }

    public static int c(o oVar, o oVar2) {
        y yVarC = y.f26074a.c(oVar.f14730h, oVar2.f14730h);
        Integer numValueOf = Integer.valueOf(oVar.f14735m);
        Integer numValueOf2 = Integer.valueOf(oVar2.f14735m);
        x0 x0Var = x0.f26072c;
        y yVarB = yVarC.b(numValueOf, numValueOf2, x0Var).a(oVar.f14736n, oVar2.f14736n).a(oVar.f14737o, oVar2.f14737o).c(oVar.f14738p, oVar2.f14738p).a(oVar.f14739q, oVar2.f14739q).c(oVar.f14731i, oVar2.f14731i).c(oVar.f14727e, oVar2.f14727e).c(oVar.f14729g, oVar2.f14729g).b(Integer.valueOf(oVar.f14734l), Integer.valueOf(oVar2.f14734l), x0Var);
        boolean z10 = oVar.f14742t;
        y yVarC2 = yVarB.c(z10, oVar2.f14742t);
        boolean z11 = oVar.f14743u;
        y yVarC3 = yVarC2.c(z11, oVar2.f14743u);
        if (z10 && z11) {
            yVarC3 = yVarC3.a(oVar.f14744v, oVar2.f14744v);
        }
        return yVarC3.e();
    }

    @Override // m5.n
    public final int a() {
        return this.f14741s;
    }

    @Override // m5.n
    public final boolean b(n nVar) {
        o oVar = (o) nVar;
        if (!this.f14740r && !Objects.equals(this.f14726d.f14544n, oVar.f14726d.f14544n)) {
            return false;
        }
        this.f14728f.getClass();
        return this.f14742t == oVar.f14742t && this.f14743u == oVar.f14743u;
    }
}
