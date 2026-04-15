package h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {
    static {
        float f10 = 40;
        a2.c.e(f10, f10);
    }

    public static final void a(String str, ic.k kVar, j1.q qVar, boolean z10, boolean z11, t2.l0 l0Var, t0 t0Var, s0 s0Var, boolean z12, int i10, int i11, y2.g0 g0Var, ic.k kVar2, w.k kVar3, q1.n0 n0Var, f1.f fVar, x0.o oVar, int i12, int i13) {
        int i14;
        boolean z13;
        int i15;
        ic.k kVar4;
        ic.k kVar5;
        oVar.Y(945255183);
        if ((i12 & 6) == 0) {
            i14 = (oVar.f(str) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            i14 |= oVar.h(kVar) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i14 |= oVar.f(qVar) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            z13 = z10;
            i14 |= oVar.g(z13) ? 2048 : 1024;
        } else {
            z13 = z10;
        }
        if ((i12 & 24576) == 0) {
            i14 |= oVar.g(z11) ? 16384 : 8192;
        }
        if ((i12 & 196608) == 0) {
            i14 |= oVar.f(l0Var) ? 131072 : 65536;
        }
        if ((i12 & 1572864) == 0) {
            i14 |= oVar.f(t0Var) ? 1048576 : 524288;
        }
        if ((i12 & 12582912) == 0) {
            i14 |= oVar.f(s0Var) ? 8388608 : 4194304;
        }
        if ((i12 & 100663296) == 0) {
            i14 |= oVar.g(z12) ? 67108864 : 33554432;
        }
        if ((i12 & 805306368) == 0) {
            i14 |= oVar.d(i10) ? 536870912 : 268435456;
        }
        if ((i13 & 6) == 0) {
            i15 = i13 | (oVar.d(i11) ? 4 : 2);
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= oVar.f(g0Var) ? 32 : 16;
        }
        int i16 = i15 | 384;
        if ((i13 & 3072) == 0) {
            i16 |= oVar.f(kVar3) ? 2048 : 1024;
        }
        if ((i13 & 24576) == 0) {
            i16 |= oVar.f(n0Var) ? 16384 : 8192;
        }
        if ((i13 & 196608) == 0) {
            i16 |= oVar.h(fVar) ? 131072 : 65536;
        }
        if (oVar.N(i14 & 1, ((i14 & 306783379) == 306783378 && (i16 & 74899) == 74898) ? false : true)) {
            oVar.S();
            if ((i12 & 1) == 0 || oVar.x()) {
                kVar5 = h.f7633d;
            } else {
                oVar.Q();
                kVar5 = kVar2;
            }
            oVar.q();
            Object objK = oVar.K();
            ic.k kVar6 = kVar5;
            Object obj = x0.k.f24334a;
            if (objK == obj) {
                objK = x0.v.v(new y2.y(0L, str, 6));
                oVar.h0(objK);
            }
            x0.w0 w0Var = (x0.w0) objK;
            y2.y yVar = (y2.y) w0Var.getValue();
            y2.y yVar2 = new y2.y(new t2.g(str), yVar.f25435b, yVar.f25436c);
            boolean zF = oVar.f(yVar2);
            Object objK2 = oVar.K();
            if (zF || objK2 == obj) {
                objK2 = new b0.s1(4, yVar2, w0Var);
                oVar.h0(objK2);
            }
            x0.v.h((ic.a) objK2, oVar);
            boolean z14 = (i14 & 14) == 4;
            Object objK3 = oVar.K();
            if (z14 || objK3 == obj) {
                objK3 = x0.v.v(str);
                oVar.h0(objK3);
            }
            x0.w0 w0Var2 = (x0.w0) objK3;
            y2.j jVarA = t0Var.a(z12);
            boolean z15 = !z12;
            int i17 = z12 ? 1 : i11;
            int i18 = z12 ? 1 : i10;
            boolean zF2 = oVar.f(w0Var2) | ((i14 & 112) == 32);
            Object objK4 = oVar.K();
            if (zF2 || objK4 == obj) {
                objK4 = new cg.b(kVar, w0Var, w0Var2);
                oVar.h0(objK4);
            }
            int i19 = i16 << 9;
            q0.e(yVar2, (ic.k) objK4, qVar, l0Var, g0Var, kVar6, kVar3, n0Var, z15, i18, i17, jVarA, s0Var, z13, z11, fVar, oVar, (i14 & 896) | ((i14 >> 6) & 7168) | (i19 & 57344) | (i19 & 458752) | (3670016 & i19) | (i19 & 29360128), ((i14 >> 15) & 896) | (i14 & 7168) | (i14 & 57344) | (i16 & 458752));
            kVar4 = kVar6;
        } else {
            oVar.Q();
            kVar4 = kVar2;
        }
        x0.p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new j(str, kVar, qVar, z10, z11, l0Var, t0Var, s0Var, z12, i10, i11, g0Var, kVar4, kVar3, n0Var, fVar, i12, i13);
        }
    }

    public static final void b(y2.y yVar, ic.k kVar, j1.q qVar, boolean z10, t2.l0 l0Var, t0 t0Var, s0 s0Var, boolean z11, int i10, int i11, y2.g0 g0Var, ic.k kVar2, w.k kVar3, q1.n0 n0Var, f1.f fVar, x0.o oVar, int i12, int i13) {
        int i14;
        boolean z12;
        int i15;
        int i16;
        ic.k kVar4;
        ic.k kVar5;
        oVar.Y(1804514146);
        if ((i12 & 6) == 0) {
            i14 = (oVar.f(yVar) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            i14 |= oVar.h(kVar) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i14 |= oVar.f(qVar) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            z12 = z10;
            i14 |= oVar.g(z12) ? 2048 : 1024;
        } else {
            z12 = z10;
        }
        if ((i12 & 24576) == 0) {
            i14 |= oVar.g(false) ? 16384 : 8192;
        }
        if ((i12 & 196608) == 0) {
            i15 = 196608;
            i14 |= oVar.f(l0Var) ? 131072 : 65536;
        } else {
            i15 = 196608;
        }
        if ((i12 & 1572864) == 0) {
            i14 |= oVar.f(t0Var) ? 1048576 : 524288;
        }
        if ((i12 & 12582912) == 0) {
            i14 |= oVar.f(s0Var) ? 8388608 : 4194304;
        }
        if ((i12 & 100663296) == 0) {
            i14 |= oVar.g(z11) ? 67108864 : 33554432;
        }
        if ((i12 & 805306368) == 0) {
            i14 |= oVar.d(i10) ? 536870912 : 268435456;
        }
        if ((i13 & 6) == 0) {
            i16 = i13 | (oVar.d(i11) ? 4 : 2);
        } else {
            i16 = i13;
        }
        if ((i13 & 48) == 0) {
            i16 |= oVar.f(g0Var) ? 32 : 16;
        }
        int i17 = i16 | 384;
        if ((i13 & 3072) == 0) {
            i17 |= oVar.f(kVar3) ? 2048 : 1024;
        }
        if ((i13 & 24576) == 0) {
            i17 |= oVar.f(n0Var) ? 16384 : 8192;
        }
        if ((i13 & i15) == 0) {
            i17 |= oVar.h(fVar) ? 131072 : 65536;
        }
        if (oVar.N(i14 & 1, ((i14 & 306783379) == 306783378 && (74899 & i17) == 74898) ? false : true)) {
            oVar.S();
            if ((i12 & 1) == 0 || oVar.x()) {
                kVar5 = h.f7632c;
            } else {
                oVar.Q();
                kVar5 = kVar2;
            }
            oVar.q();
            y2.j jVarA = t0Var.a(z11);
            boolean z13 = !z11;
            int i18 = z11 ? 1 : i11;
            int i19 = z11 ? 1 : i10;
            boolean z14 = ((i14 & 14) == 4) | ((i14 & 112) == 32);
            Object objK = oVar.K();
            if (z14 || objK == x0.k.f24334a) {
                objK = new b0.o1(7, yVar, kVar);
                oVar.h0(objK);
            }
            int i20 = i17 << 9;
            q0.e(yVar, (ic.k) objK, qVar, l0Var, g0Var, kVar5, kVar3, n0Var, z13, i19, i18, jVarA, s0Var, z12, false, fVar, oVar, ((i14 >> 6) & 7168) | (i14 & 910) | (i20 & 57344) | (i20 & 458752) | (i20 & 3670016) | (i20 & 29360128), (i14 & 7168) | ((i14 >> 15) & 896) | (i14 & 57344) | (i17 & 458752));
            kVar4 = kVar5;
        } else {
            oVar.Q();
            kVar4 = kVar2;
        }
        x0.p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new i(yVar, kVar, qVar, z10, l0Var, t0Var, s0Var, z11, i10, i11, g0Var, kVar4, kVar3, n0Var, fVar, i12, i13);
        }
    }
}
