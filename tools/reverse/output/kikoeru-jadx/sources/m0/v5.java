package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class v5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x0.o2 f13759a = new x0.o2(new i9.f(13));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f13760b = 16;

    public static final void a(j1.q qVar, x5 x5Var, final f1.f fVar, final f1.f fVar2, ic.o oVar, ic.n nVar, int i10, boolean z10, q1.l0 l0Var, float f10, long j10, long j11, long j12, final long j13, long j14, final f1.f fVar3, x0.o oVar2, final int i11) {
        final j1.q qVar2;
        final x5 x5Var2;
        final ic.o oVar3;
        final ic.n nVar2;
        final int i12;
        final boolean z11;
        final q1.l0 l0Var2;
        final float f11;
        final long j15;
        final long j16;
        final long j17;
        final long j18;
        ic.o oVar4;
        long jB;
        x5 x5Var3;
        long j19;
        j1.q qVar3;
        long j20;
        float f12;
        long j21;
        int i13;
        boolean z12;
        q1.l0 l0Var3;
        ic.n nVar3;
        oVar2.Y(1135600301);
        int i14 = i11 | 920346646;
        if (oVar2.N(i14 & 1, (306783379 & i14) != 306783378)) {
            oVar2.S();
            if ((i11 & 1) == 0 || oVar2.x()) {
                t2 t2VarC = s2.c(oVar2);
                Object objK = oVar2.K();
                x0.r0 r0Var = x0.k.f24334a;
                if (objK == r0Var) {
                    objK = new u6();
                    oVar2.h0(objK);
                }
                u6 u6Var = (u6) objK;
                Object objK2 = oVar2.K();
                if (objK2 == r0Var) {
                    objK2 = new x5(t2VarC, u6Var);
                    oVar2.h0(objK2);
                }
                x5 x5Var4 = (x5) objK2;
                f1.f fVar4 = f1.f12969a;
                f1.f fVar5 = f1.f12970b;
                g0.f fVar6 = ((y5) oVar2.j(z5.f13997a)).f13963c;
                float f13 = g2.f13014a;
                long jI = ((b1) oVar2.j(c1.f12773a)).i();
                long jB2 = c1.b(jI, oVar2);
                long jA = g2.a(oVar2);
                oVar4 = fVar4;
                jB = c1.b(j13, oVar2);
                x5Var3 = x5Var4;
                j19 = jA;
                qVar3 = j1.n.f9689a;
                j20 = jB2;
                f12 = f13;
                j21 = jI;
                i13 = 2;
                z12 = true;
                l0Var3 = fVar6;
                nVar3 = fVar5;
            } else {
                oVar2.Q();
                qVar3 = qVar;
                x5Var3 = x5Var;
                oVar4 = oVar;
                nVar3 = nVar;
                i13 = i10;
                z12 = z10;
                l0Var3 = l0Var;
                f12 = f10;
                j21 = j10;
                j20 = j11;
                j19 = j12;
                jB = j14;
            }
            oVar2.q();
            b(y.d.e(0), qVar3, x5Var3, fVar, fVar2, oVar4, nVar3, i13, z12, l0Var3, f12, j21, j20, j19, j13, jB, fVar3, oVar2, 920349744, 102236550);
            i12 = i13;
            z11 = z12;
            l0Var2 = l0Var3;
            f11 = f12;
            j15 = j21;
            j16 = j20;
            j17 = j19;
            j18 = jB;
            qVar2 = qVar3;
            x5Var2 = x5Var3;
            oVar3 = oVar4;
            nVar2 = nVar3;
        } else {
            oVar2.Q();
            qVar2 = qVar;
            x5Var2 = x5Var;
            oVar3 = oVar;
            nVar2 = nVar;
            i12 = i10;
            z11 = z10;
            l0Var2 = l0Var;
            f11 = f10;
            j15 = j10;
            j16 = j11;
            j17 = j12;
            j18 = j14;
        }
        x0.p1 p1VarR = oVar2.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new ic.n(x5Var2, fVar, fVar2, oVar3, nVar2, i12, z11, l0Var2, f11, j15, j16, j17, j13, j18, fVar3, i11) { // from class: m0.r5

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ x5 f13553b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ f1.f f13554c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ f1.f f13555d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ ic.o f13556e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ ic.n f13557f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ int f13558g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ boolean f13559h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final /* synthetic */ q1.l0 f13560i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public final /* synthetic */ float f13561j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                public final /* synthetic */ long f13562k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                public final /* synthetic */ long f13563l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public final /* synthetic */ long f13564m;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                public final /* synthetic */ long f13565n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                public final /* synthetic */ long f13566o;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                public final /* synthetic */ f1.f f13567p;

                @Override // ic.n
                public final Object q(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iD = x0.v.D(3457);
                    v5.a(this.f13552a, this.f13553b, this.f13554c, this.f13555d, this.f13556e, this.f13557f, this.f13558g, this.f13559h, this.f13560i, this.f13561j, this.f13562k, this.f13563l, this.f13564m, this.f13565n, this.f13566o, this.f13567p, (x0.o) obj, iD);
                    return ub.a0.f21526a;
                }
            };
        }
    }

    public static final void b(final y.e0 e0Var, j1.q qVar, final x5 x5Var, final f1.f fVar, final f1.f fVar2, final ic.o oVar, final ic.n nVar, final int i10, final boolean z10, final q1.l0 l0Var, final float f10, final long j10, final long j11, final long j12, final long j13, final long j14, final f1.f fVar3, x0.o oVar2, final int i11, final int i12) {
        int i13;
        f1.f fVar4;
        int i14;
        f1.f fVar5;
        final j1.q qVar2;
        oVar2.Y(50073903);
        if ((i11 & 6) == 0) {
            i13 = (oVar2.f(e0Var) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= oVar2.f(qVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= oVar2.f(x5Var) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            fVar4 = fVar;
            i13 |= oVar2.h(fVar4) ? 2048 : 1024;
        } else {
            fVar4 = fVar;
        }
        if ((i11 & 24576) == 0) {
            i13 |= oVar2.h(fVar2) ? 16384 : 8192;
        }
        if ((i11 & 196608) == 0) {
            i13 |= oVar2.h(oVar) ? 131072 : 65536;
        }
        if ((i11 & 1572864) == 0) {
            i13 |= oVar2.h(nVar) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i13 |= oVar2.d(i10) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i13 |= oVar2.g(false) ? 67108864 : 33554432;
        }
        if ((i11 & 805306368) == 0) {
            i13 |= oVar2.h(null) ? 536870912 : 268435456;
        }
        int i15 = i13;
        if ((i12 & 6) == 0) {
            i14 = i12 | (oVar2.g(z10) ? 4 : 2);
        } else {
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            i14 |= oVar2.f(l0Var) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i14 |= oVar2.c(f10) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i14 |= oVar2.e(j10) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            i14 |= oVar2.e(j11) ? 16384 : 8192;
        }
        if ((i12 & 196608) == 0) {
            i14 |= oVar2.e(j12) ? 131072 : 65536;
        }
        if ((i12 & 1572864) == 0) {
            i14 |= oVar2.e(j13) ? 1048576 : 524288;
        }
        if ((i12 & 12582912) == 0) {
            i14 |= oVar2.e(j14) ? 8388608 : 4194304;
        }
        if ((i12 & 100663296) == 0) {
            fVar5 = fVar3;
            i14 |= oVar2.h(fVar5) ? 67108864 : 33554432;
        } else {
            fVar5 = fVar3;
        }
        if (oVar2.N(i15 & 1, ((i15 & 306783379) == 306783378 && (38347923 & i14) == 38347922) ? false : true)) {
            oVar2.S();
            if ((i11 & 1) != 0 && !oVar2.x()) {
                oVar2.Q();
            }
            oVar2.q();
            boolean z11 = (i15 & 14) == 4;
            Object objK = oVar2.K();
            if (z11 || objK == x0.k.f24334a) {
                objK = new s4(e0Var);
                oVar2.h0(objK);
            }
            f1.f fVarF = f1.g.f(-1236753028, new t5((s4) objK, e0Var, j13, j14, i10, fVar4, fVar5, nVar, fVar2, oVar, x5Var), oVar2);
            oVar2.W(1400751284);
            qVar2 = qVar;
            fVarF.g(qVar2, oVar2, Integer.valueOf(((i15 >> 3) & 14) | 48));
            oVar2.p(false);
        } else {
            qVar2 = qVar;
            oVar2.Q();
        }
        x0.p1 p1VarR = oVar2.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new ic.n() { // from class: m0.n5
                @Override // ic.n
                public final Object q(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iD = x0.v.D(i11 | 1);
                    int iD2 = x0.v.D(i12);
                    v5.b(e0Var, qVar2, x5Var, fVar, fVar2, oVar, nVar, i10, z10, l0Var, f10, j10, j11, j12, j13, j14, fVar3, (x0.o) obj, iD, iD2);
                    return ub.a0.f21526a;
                }
            };
        }
    }

    public static final void c(final int i10, final f1.f fVar, final f1.f fVar2, final f1.f fVar3, final ic.n nVar, final y.r1 r1Var, final f1.f fVar4, x0.o oVar, final int i11) {
        oVar.Y(675142332);
        int i12 = i11 | (oVar.g(false) ? 4 : 2) | (oVar.d(i10) ? 32 : 16) | (oVar.h(fVar) ? 256 : 128) | (oVar.h(fVar2) ? 2048 : 1024) | (oVar.h(nVar) ? 131072 : 65536) | (oVar.f(r1Var) ? 1048576 : 524288) | (oVar.h(fVar4) ? 8388608 : 4194304);
        if (oVar.N(i12 & 1, (4793491 & i12) != 4793490)) {
            Object objK = oVar.K();
            x0.r0 r0Var = x0.k.f24334a;
            if (objK == r0Var) {
                objK = new u5();
                oVar.h0(objK);
            }
            u5 u5Var = (u5) objK;
            boolean z10 = ((i12 & 896) == 256) | ((3670016 & i12) == 1048576) | ((458752 & i12) == 131072) | ((i12 & 112) == 32) | ((i12 & 14) == 4) | ((29360128 & i12) == 8388608) | ((i12 & 7168) == 2048);
            Object objK2 = oVar.K();
            if (z10 || objK2 == r0Var) {
                o5 o5Var = new o5(fVar, fVar3, nVar, i10, r1Var, u5Var, fVar4, fVar2);
                oVar.h0(o5Var);
                objK2 = o5Var;
            }
            g2.n1.c(null, (ic.n) objK2, oVar, 0, 1);
        } else {
            oVar.Q();
        }
        x0.p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new ic.n(i10, fVar, fVar2, fVar3, nVar, r1Var, fVar4, i11) { // from class: m0.p5

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f13451a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ f1.f f13452b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ f1.f f13453c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ f1.f f13454d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ ic.n f13455e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ y.r1 f13456f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ f1.f f13457g;

                @Override // ic.n
                public final Object q(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iD = x0.v.D(24577);
                    v5.c(this.f13451a, this.f13452b, this.f13453c, this.f13454d, this.f13455e, this.f13456f, this.f13457g, (x0.o) obj, iD);
                    return ub.a0.f21526a;
                }
            };
        }
    }
}
