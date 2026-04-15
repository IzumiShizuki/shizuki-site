package h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class v extends jc.m implements ic.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u0 f7887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t2.l0 f7888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7890e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p1 f7891f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y2.y f7892g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ y2.g0 f7893h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ j1.q f7894i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j1.q f7895j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ j1.q f7896k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j1.q f7897l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e0.b f7898m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l0.l1 f7899n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f7900o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f7901p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ ic.k f7902q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y2.r f7903r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f3.c f7904s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(u0 u0Var, t2.l0 l0Var, int i10, int i11, p1 p1Var, y2.y yVar, y2.g0 g0Var, j1.q qVar, j1.q qVar2, j1.q qVar3, j1.q qVar4, e0.b bVar, l0.l1 l1Var, boolean z10, boolean z11, ic.k kVar, y2.r rVar, f3.c cVar) {
        super(2);
        this.f7887b = u0Var;
        this.f7888c = l0Var;
        this.f7889d = i10;
        this.f7890e = i11;
        this.f7891f = p1Var;
        this.f7892g = yVar;
        this.f7893h = g0Var;
        this.f7894i = qVar;
        this.f7895j = qVar2;
        this.f7896k = qVar3;
        this.f7897l = qVar4;
        this.f7898m = bVar;
        this.f7899n = l1Var;
        this.f7900o = z10;
        this.f7901p = z11;
        this.f7902q = kVar;
        this.f7903r = rVar;
        this.f7904s = cVar;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        j1.q u1Var;
        x0.o oVar = (x0.o) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            u0 u0Var = this.f7887b;
            j1.q qVarF = androidx.compose.foundation.layout.c.f(j1.n.f9689a, ((f3.f) u0Var.f7863g.getValue()).f6657a, 0.0f, 2);
            int i10 = this.f7889d;
            int i11 = this.f7890e;
            t2.l0 l0Var = this.f7888c;
            j1.q qVarA = j1.a.a(qVarF, new j0(i10, i11, l0Var));
            boolean zH = oVar.h(u0Var);
            Object objK = oVar.K();
            if (zH || objK == x0.k.f24334a) {
                objK = new b0.d0(10, u0Var);
                oVar.h0(objK);
            }
            ic.a aVar = (ic.a) objK;
            p1 p1Var = this.f7891f;
            u.e1 e1Var = (u.e1) p1Var.f7807f.getValue();
            y2.y yVar = this.f7892g;
            long j10 = yVar.f25435b;
            int i12 = t2.k0.f20357c;
            int iE = (int) (j10 >> 32);
            long j11 = p1Var.f7806e;
            if (iE == ((int) (j11 >> 32)) && (iE = (int) (j10 & 4294967295L)) == ((int) (j11 & 4294967295L))) {
                iE = t2.k0.e(j10);
            }
            p1Var.f7806e = yVar.f25435b;
            y2.d0 d0VarA = t1.a(this.f7893h, yVar.f25434a);
            int iOrdinal = e1Var.ordinal();
            if (iOrdinal == 0) {
                u1Var = new u1(p1Var, iE, d0VarA, aVar);
            } else {
                if (iOrdinal != 1) {
                    throw new ce.j0();
                }
                u1Var = new l0(p1Var, iE, d0VarA, aVar);
            }
            l0.u0.f(androidx.compose.foundation.relocation.a.a(j1.a.a(gh.g.l(qVarA).e(u1Var).e(this.f7894i).e(this.f7895j), new cg.m0(3, l0Var)).e(this.f7896k).e(this.f7897l), this.f7898m), f1.g.f(-1172467467, new u(this.f7899n, u0Var, this.f7900o, this.f7901p, this.f7902q, this.f7892g, this.f7903r, this.f7904s, this.f7890e), oVar), oVar, 48);
        } else {
            oVar.Q();
        }
        return ub.a0.f21526a;
    }
}
