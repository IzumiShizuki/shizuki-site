package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k8 implements ic.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ic.n f13203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ic.n f13204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f13205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x1 f13206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f13207e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f13208f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ic.n f13209g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ic.n f13210h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ q1.l0 f13211i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ w8 f13212j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ ic.n f13213k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f13214l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ y.d1 f13215m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f13216n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ic.n f13217o;

    public k8(ic.n nVar, ic.n nVar2, String str, x1 x1Var, boolean z10, boolean z11, w.k kVar, ic.n nVar3, ic.n nVar4, q1.l0 l0Var, w8 w8Var, ic.n nVar5, boolean z12, y.d1 d1Var, boolean z13, ic.n nVar6) {
        this.f13203a = nVar;
        this.f13204b = nVar2;
        this.f13205c = str;
        this.f13206d = x1Var;
        this.f13207e = z10;
        this.f13208f = z11;
        this.f13209g = nVar3;
        this.f13210h = nVar4;
        this.f13211i = l0Var;
        this.f13212j = w8Var;
        this.f13213k = nVar5;
        this.f13214l = z12;
        this.f13215m = d1Var;
        this.f13216n = z13;
        this.f13217o = nVar6;
    }

    @Override // ic.r
    public final Object p(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int i10;
        f1.f fVar;
        f1.f fVar2;
        f1.f fVarF;
        f1.f fVar3;
        int i11;
        float fFloatValue = ((Number) obj).floatValue();
        long j10 = ((q1.q) obj2).f17577a;
        long j11 = ((q1.q) obj3).f17577a;
        float fFloatValue2 = ((Number) obj4).floatValue();
        x0.o oVar = (x0.o) obj5;
        int iIntValue = ((Number) obj6).intValue();
        if ((iIntValue & 6) == 0) {
            i10 = (oVar.c(fFloatValue) ? 4 : 2) | iIntValue;
        } else {
            i10 = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i10 |= oVar.e(j10) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            i10 |= oVar.e(j11) ? 256 : 128;
        }
        if ((iIntValue & 3072) == 0) {
            i10 |= oVar.c(fFloatValue2) ? 2048 : 1024;
        }
        int i12 = i10;
        if (oVar.N(i12 & 1, (i12 & 9363) != 9362)) {
            f1.f fVarF2 = null;
            ic.n nVar = this.f13203a;
            if (nVar == null) {
                oVar.W(986681709);
                oVar.p(false);
                fVar = null;
            } else {
                oVar.W(986681710);
                h8 h8Var = new h8(fFloatValue, j11, nVar, this.f13216n, j10);
                fFloatValue = fFloatValue;
                f1.f fVarF3 = f1.g.f(723429411, h8Var, oVar);
                oVar.p(false);
                fVar = fVarF3;
            }
            ic.n nVar2 = this.f13204b;
            boolean z10 = this.f13207e;
            x1 x1Var = this.f13206d;
            if (nVar2 == null || this.f13205c.length() != 0 || fFloatValue2 <= 0.0f) {
                oVar.W(988093542);
                oVar.p(false);
                fVar2 = null;
            } else {
                oVar.W(987666549);
                f1.f fVarF4 = f1.g.f(-426706263, new j8(fFloatValue2, x1Var, z10, nVar2), oVar);
                oVar.p(false);
                fVar2 = fVarF4;
            }
            oVar.W(-1519634405);
            boolean z11 = this.f13208f;
            x0.w0 w0VarY = x0.v.y(new q1.q(!z10 ? x1Var.f13871j : z11 ? x1Var.f13872k : x1Var.f13870i), oVar);
            oVar.p(false);
            long j12 = ((q1.q) w0VarY.getValue()).f17577a;
            ic.n nVar3 = this.f13209g;
            if (nVar3 == null) {
                oVar.W(988282301);
                oVar.p(false);
                fVarF = null;
            } else {
                oVar.W(988282302);
                fVarF = f1.g.f(-317090443, new i8(j12, nVar3, 0), oVar);
                oVar.p(false);
            }
            oVar.W(1383318157);
            x0.w0 w0VarY2 = x0.v.y(new q1.q(!z10 ? x1Var.f13874m : z11 ? x1Var.f13875n : x1Var.f13873l), oVar);
            oVar.p(false);
            long j13 = ((q1.q) w0VarY2.getValue()).f17577a;
            ic.n nVar4 = this.f13210h;
            if (nVar4 == null) {
                oVar.W(988575964);
            } else {
                oVar.W(988575965);
                fVarF2 = f1.g.f(262889693, new i8(j13, nVar4, 1), oVar);
            }
            oVar.p(false);
            f1.f fVar4 = fVarF2;
            oVar.W(-1423938813);
            x0.w0 w0VarY3 = x0.v.y(new q1.q(x1Var.f13876o), oVar);
            oVar.p(false);
            j1.q qVarB = androidx.compose.foundation.a.b(j1.n.f9689a, ((q1.q) w0VarY3.getValue()).f17577a, this.f13211i);
            int iOrdinal = this.f13212j.ordinal();
            if (iOrdinal == 0) {
                oVar.W(988856360);
                r8.c(qVarB, this.f13213k, fVar, fVar2, fVarF, fVar4, this.f13214l, fFloatValue, this.f13215m, oVar, (i12 << 21) & 29360128);
                oVar.p(false);
            } else {
                if (iOrdinal != 1) {
                    oVar.W(1971561250);
                    oVar.p(false);
                    throw new ce.j0();
                }
                oVar.W(989436742);
                Object objK = oVar.K();
                x0.r0 r0Var = x0.k.f24334a;
                if (objK == r0Var) {
                    fVar3 = fVar;
                    i11 = 29360128;
                    objK = x0.v.v(new p1.e(0L));
                    oVar.h0(objK);
                } else {
                    fVar3 = fVar;
                    i11 = 29360128;
                }
                x0.w0 w0Var = (x0.w0) objK;
                f1.f fVarF5 = f1.g.f(-1107746014, new f(w0Var, this.f13215m, this.f13217o, 4), oVar);
                boolean z12 = (i12 & 14) == 4;
                Object objK2 = oVar.K();
                if (z12 || objK2 == r0Var) {
                    objK2 = new g8(fFloatValue, w0Var, 0);
                    oVar.h0(objK2);
                }
                a5.b(qVarB, this.f13213k, fVar2, fVar3, fVarF, fVar4, this.f13214l, fFloatValue, (ic.k) objK2, fVarF5, this.f13215m, oVar, ((i12 << 21) & i11) | 805306368);
                oVar.p(false);
            }
        } else {
            oVar.Q();
        }
        return ub.a0.f21526a;
    }
}
