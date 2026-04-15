package m0;

import com.tencent.bugly.beta.tinker.TinkerReport;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class y7 {
    static {
        lc.b.C(20);
    }

    public static final void a(final boolean z10, final ic.a aVar, final j1.q qVar, boolean z11, final long j10, final long j11, final f1.f fVar, x0.o oVar, final int i10) {
        final boolean z12;
        boolean z13;
        oVar.Y(-1847932236);
        int i11 = i10 | (oVar.g(z10) ? 4 : 2) | (oVar.h(aVar) ? 32 : 16) | 27648 | (oVar.e(j10) ? 131072 : 65536) | (oVar.e(j11) ? 1048576 : 524288);
        if (oVar.N(i11 & 1, (4793491 & i11) != 4793490)) {
            oVar.S();
            if ((i10 & 1) == 0 || oVar.x()) {
                z13 = true;
            } else {
                oVar.Q();
                z13 = z11;
            }
            oVar.q();
            int i12 = i11 >> 15;
            b(j10, j11, z10, f1.g.f(-652402312, new x7(qVar, z10, l5.a(0.0f, 2, j10, true), z13, aVar, fVar), oVar), oVar, (i12 & 112) | (i12 & 14) | 3072 | ((i11 << 6) & 896));
            z12 = z13;
        } else {
            oVar.Q();
            z12 = z11;
        }
        x0.p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new ic.n(z10, aVar, qVar, z12, j10, j11, fVar, i10) { // from class: m0.w7

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ boolean f13835a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ic.a f13836b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ j1.q f13837c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ boolean f13838d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ long f13839e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ long f13840f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ f1.f f13841g;

                @Override // ic.n
                public final Object q(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iD = x0.v.D(12583297);
                    y7.a(this.f13835a, this.f13836b, this.f13837c, this.f13838d, this.f13839e, this.f13840f, this.f13841g, (x0.o) obj, iD);
                    return ub.a0.f21526a;
                }
            };
        }
    }

    public static final void b(long j10, long j11, boolean z10, f1.f fVar, x0.o oVar, int i10) {
        int i11;
        boolean z11;
        oVar.Y(-1841653376);
        if ((i10 & 6) == 0) {
            i11 = (oVar.e(j10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= oVar.e(j11) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            z11 = z10;
            i11 |= oVar.g(z11) ? 256 : 128;
        } else {
            z11 = z10;
        }
        if ((i10 & 3072) == 0) {
            i11 |= oVar.h(fVar) ? 2048 : 1024;
        }
        if (oVar.N(i11 & 1, (i11 & 1171) != 1170)) {
            int i12 = i11 >> 6;
            r.q1 q1VarF = r.t1.f(Boolean.valueOf(z11), null, oVar, i12 & 14, 2);
            x0.e1 e1Var = q1VarF.f18542d;
            boolean zBooleanValue = ((Boolean) e1Var.getValue()).booleanValue();
            oVar.W(90393475);
            long j12 = zBooleanValue ? j10 : j11;
            oVar.p(false);
            r1.c cVarF = q1.q.f(j12);
            boolean zF = oVar.f(cVarF);
            Object objK = oVar.K();
            if (zF || objK == x0.k.f24334a) {
                q.r rVar = q.r.f17425e;
                q.a0 a0Var = new q.a0(0, cVarF);
                r.v1 v1Var = r.w1.f18620a;
                r.v1 v1Var2 = new r.v1(rVar, a0Var);
                oVar.h0(v1Var2);
                objK = v1Var2;
            }
            r.v1 v1Var3 = (r.v1) objK;
            boolean zBooleanValue2 = ((Boolean) q1VarF.f18539a.b1()).booleanValue();
            oVar.W(90393475);
            long j13 = zBooleanValue2 ? j10 : j11;
            oVar.p(false);
            q1.q qVar = new q1.q(j13);
            boolean zBooleanValue3 = ((Boolean) e1Var.getValue()).booleanValue();
            oVar.W(90393475);
            long j14 = zBooleanValue3 ? j10 : j11;
            oVar.p(false);
            q1.q qVar2 = new q1.q(j14);
            r.k1 k1VarF = q1VarF.f();
            oVar.W(297582231);
            r.u1 u1Var = k1VarF.b(Boolean.FALSE, Boolean.TRUE) ? new r.u1(TinkerReport.KEY_APPLIED_PACKAGE_CHECK_SIGNATURE, 100, r.w.f18601d) : r.d.r(100, 0, r.w.f18601d, 2);
            oVar.p(false);
            r.m1 m1VarD = r.t1.d(q1VarF, qVar, qVar2, u1Var, v1Var3, oVar, 0);
            x0.v.b(new x0.n1[]{j1.f13125a.a(new q1.q(q1.q.b(1.0f, ((q1.q) m1VarD.f18491j.getValue()).f17577a))), h1.f13043a.a(Float.valueOf(q1.q.d(((q1.q) m1VarD.f18491j.getValue()).f17577a)))}, fVar, oVar, (i12 & 112) | 8);
        } else {
            oVar.Q();
        }
        x0.p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new l0(j10, j11, z11, fVar, i10, 1);
        }
    }
}
