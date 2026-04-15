package m0;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import com.tencent.bugly.beta.tinker.TinkerReport;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class s2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f13591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f13592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f13593c = TinkerReport.KEY_LOADED_SUCC_COST_500_LESS;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r.u1 f13594d = new r.u1(256, (r.v) null, 6);

    static {
        float f10 = 56;
        f13591a = f10;
        f13592b = f10;
    }

    public static final void a(ic.o oVar, j1.q qVar, t2 t2Var, boolean z10, q1.l0 l0Var, float f10, long j10, long j11, long j12, f1.f fVar, x0.o oVar2, int i10) {
        int i11;
        t2 t2Var2;
        boolean z11;
        q1.l0 l0Var2;
        float f11;
        long j13;
        long j14;
        long j15;
        oVar2.Y(1979404999);
        if ((i10 & 6) == 0) {
            i11 = (oVar2.h(oVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= oVar2.f(qVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            t2Var2 = t2Var;
            i11 |= oVar2.f(t2Var2) ? 256 : 128;
        } else {
            t2Var2 = t2Var;
        }
        if ((i10 & 3072) == 0) {
            z11 = z10;
            i11 |= oVar2.g(z11) ? 2048 : 1024;
        } else {
            z11 = z10;
        }
        if ((i10 & 24576) == 0) {
            l0Var2 = l0Var;
            i11 |= oVar2.f(l0Var2) ? 16384 : 8192;
        } else {
            l0Var2 = l0Var;
        }
        if ((196608 & i10) == 0) {
            f11 = f10;
            i11 |= oVar2.c(f11) ? 131072 : 65536;
        } else {
            f11 = f10;
        }
        if ((1572864 & i10) == 0) {
            j13 = j10;
            i11 |= oVar2.e(j13) ? 1048576 : 524288;
        } else {
            j13 = j10;
        }
        if ((12582912 & i10) == 0) {
            j14 = j11;
            i11 |= oVar2.e(j14) ? 8388608 : 4194304;
        } else {
            j14 = j11;
        }
        if ((100663296 & i10) == 0) {
            j15 = j12;
            i11 |= oVar2.e(j15) ? 67108864 : 33554432;
        } else {
            j15 = j12;
        }
        if ((805306368 & i10) == 0) {
            i11 |= oVar2.h(fVar) ? 536870912 : 268435456;
        }
        if (oVar2.N(i11 & 1, (i11 & 306783379) != 306783378)) {
            oVar2.S();
            if ((i10 & 1) != 0 && !oVar2.x()) {
                oVar2.Q();
            }
            oVar2.q();
            Object objK = oVar2.K();
            if (objK == x0.k.f24334a) {
                objK = x0.v.m(oVar2);
                oVar2.h0(objK);
            }
            y.d.a(qVar.e(androidx.compose.foundation.layout.c.f557c), null, f1.g.f(-1549911011, new q2(t2Var2, z11, (hf.y) objK, j15, l0Var2, j13, j14, f11, fVar, oVar), oVar2), oVar2, 3072);
        } else {
            oVar2.Q();
        }
        x0.p1 p1VarR = oVar2.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new h2(oVar, qVar, t2Var, z10, l0Var, f10, j10, j11, j12, fVar, i10);
        }
    }

    public static final void b(final boolean z10, ic.a aVar, final ic.a aVar2, final long j10, x0.o oVar, final int i10) {
        Object obj;
        boolean z11;
        j1.q qVarA;
        final ic.a aVar3 = aVar;
        oVar.Y(1983403750);
        int i11 = i10 | (oVar.g(z10) ? 4 : 2) | (oVar.h(aVar3) ? 32 : 16) | (oVar.h(aVar2) ? 256 : 128) | (oVar.e(j10) ? 2048 : 1024);
        if (oVar.N(i11 & 1, (i11 & 1171) != 1170)) {
            String strN = a2.c.N(1, oVar);
            Object obj2 = x0.k.f24334a;
            if (z10) {
                oVar.W(1716233810);
                int i12 = i11 & 112;
                boolean z12 = i12 == 32;
                Object objK = oVar.K();
                if (z12 || objK == obj2) {
                    objK = new r2(0, aVar3);
                    oVar.h0(objK);
                }
                obj = obj2;
                SuspendPointerInputElement suspendPointerInputElement = new SuspendPointerInputElement(aVar, null, null, (PointerInputEventHandler) objK, 6);
                aVar3 = aVar;
                boolean zF = oVar.f(strN) | (i12 == 32);
                Object objK2 = oVar.K();
                if (zF || objK2 == obj) {
                    objK2 = new i2(strN, aVar3, 0);
                    oVar.h0(objK2);
                }
                z11 = true;
                qVarA = q2.m.a(suspendPointerInputElement, true, (ic.k) objK2);
                oVar.p(false);
            } else {
                obj = obj2;
                z11 = true;
                oVar.W(1716557884);
                oVar.p(false);
                qVarA = j1.n.f9689a;
            }
            j1.q qVarE = androidx.compose.foundation.layout.c.f557c.e(qVarA);
            boolean z13 = (i11 & 7168) == 2048;
            if ((i11 & 896) != 256) {
                z11 = false;
            }
            boolean z14 = z11 | z13;
            Object objK3 = oVar.K();
            if (z14 || objK3 == obj) {
                objK3 = new d9.u(j10, aVar2, 2);
                oVar.h0(objK3);
            }
            nh.b.a(0, (ic.k) objK3, qVarE, oVar);
        } else {
            oVar.Q();
        }
        x0.p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new ic.n(z10, aVar3, aVar2, j10, i10) { // from class: m0.j2

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ boolean f13126a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ic.a f13127b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ ic.a f13128c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ long f13129d;

                @Override // ic.n
                public final Object q(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iD = x0.v.D(1);
                    s2.b(this.f13126a, this.f13127b, this.f13128c, this.f13129d, (x0.o) obj3, iD);
                    return ub.a0.f21526a;
                }
            };
        }
    }

    public static final t2 c(x0.o oVar) {
        Object objK = oVar.K();
        Object obj = x0.k.f24334a;
        if (objK == obj) {
            objK = new g1.d(27);
            oVar.h0(objK);
        }
        ic.k kVar = (ic.k) objK;
        Object[] objArr = new Object[0];
        androidx.media3.exoplayer.offline.u uVar = new androidx.media3.exoplayer.offline.u(16, new ka.h(13), new h1.m(kVar, 1));
        boolean zF = oVar.f(kVar);
        Object objK2 = oVar.K();
        if (zF || objK2 == obj) {
            objK2 = new la.c(kVar);
            oVar.h0(objK2);
        }
        return (t2) g1.l.c(objArr, uVar, (ic.a) objK2, oVar, 0);
    }
}
