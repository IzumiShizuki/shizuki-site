package y;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g2.g1[] f25221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f25222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g2.x0 f25223d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jc.w f25224e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jc.w f25225f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s f25226g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(g2.g1[] g1VarArr, List list, g2.x0 x0Var, jc.w wVar, jc.w wVar2, s sVar) {
        super(1);
        this.f25221b = g1VarArr;
        this.f25222c = list;
        this.f25223d = x0Var;
        this.f25224e = wVar;
        this.f25225f = wVar2;
        this.f25226g = sVar;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        g2.f1 f1Var = (g2.f1) obj;
        g2.g1[] g1VarArr = this.f25221b;
        int length = g1VarArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i11 < length) {
            int i12 = i10;
            g2.g1 g1Var = g1VarArr[i11];
            jc.l.c(g1Var, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
            p.b(f1Var, g1Var, (g2.u0) this.f25222c.get(i12), this.f25223d.getLayoutDirection(), this.f25224e.f10836a, this.f25225f.f10836a, this.f25226g.f25231a);
            i11++;
            i10 = i12 + 1;
        }
        return ub.a0.f21526a;
    }
}
