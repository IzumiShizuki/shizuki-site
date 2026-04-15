package la;

import androidx.compose.foundation.BorderModifierNodeElement;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import m0.j1;
import m0.r1;
import m0.x2;
import x0.n1;
import x0.p1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f12099a = 12;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f12100b = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f12101c = 2;

    /* JADX WARN: Removed duplicated region for block: B:112:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(j1.q r21, boolean r22, q1.l0 r23, s.o r24, m0.q1 r25, final ic.n r26, f1.f r27, x0.o r28, int r29, int r30) {
        /*
            Method dump skipped, instruction units count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: la.t.a(j1.q, boolean, q1.l0, s.o, m0.q1, ic.n, f1.f, x0.o, int, int):void");
    }

    public static final void b(j1.q qVar, q1.l0 l0Var, final long j10, long j11, s.o oVar, float f10, final f1.f fVar, x0.o oVar2, int i10) {
        j1.q qVar2;
        int i11;
        q1.l0 l0Var2;
        s.o oVar3;
        float f11;
        float f12;
        oVar2.Y(-2073782279);
        if ((i10 & 6) == 0) {
            qVar2 = qVar;
            i11 = (oVar2.f(qVar2) ? 4 : 2) | i10;
        } else {
            qVar2 = qVar;
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            l0Var2 = l0Var;
            i11 |= oVar2.f(l0Var2) ? 32 : 16;
        } else {
            l0Var2 = l0Var;
        }
        if ((i10 & 384) == 0) {
            i11 |= oVar2.e(j10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= oVar2.e(j11) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            oVar3 = oVar;
            i11 |= oVar2.f(oVar3) ? 16384 : 8192;
        } else {
            oVar3 = oVar;
        }
        int i12 = i11 | 196608;
        if ((1572864 & i10) == 0) {
            i12 |= oVar2.h(fVar) ? 1048576 : 524288;
        }
        if (oVar2.N(i12 & 1, (599187 & i12) != 599186)) {
            oVar2.S();
            if ((i10 & 1) == 0 || oVar2.x()) {
                f12 = 0;
            } else {
                oVar2.Q();
                f12 = f10;
            }
            oVar2.q();
            x0.z zVar = x2.f13884b;
            final float f13 = ((f3.f) oVar2.j(zVar)).f6657a + f12;
            final j1.q qVar3 = qVar2;
            final float f14 = f12;
            final q1.l0 l0Var3 = l0Var2;
            final s.o oVar4 = oVar3;
            x0.v.b(new n1[]{j1.f13125a.a(new q1.q(j11)), zVar.a(new f3.f(f13))}, f1.g.f(594311993, new ic.n() { // from class: la.q
                @Override // ic.n
                public final Object q(Object obj, Object obj2) {
                    x0.o oVar5 = (x0.o) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    boolean zN = oVar5.N(iIntValue & 1, (iIntValue & 3) != 2);
                    ub.a0 a0Var = ub.a0.f21526a;
                    if (!zN) {
                        oVar5.Q();
                        return a0Var;
                    }
                    r1 r1Var = (r1) oVar5.j(x2.f13883a);
                    long jI = ((m0.b1) oVar5.j(m0.c1.f12773a)).i();
                    long jA = j10;
                    if (!q1.q.c(jA, jI) || r1Var == null) {
                        oVar5.W(-1557694413);
                        oVar5.p(false);
                    } else {
                        oVar5.W(-1557762520);
                        jA = r1Var.a(jA, f13, oVar5, 0);
                        oVar5.p(false);
                    }
                    j1.q borderModifierNodeElement = j1.n.f9689a;
                    float f15 = f14;
                    q1.l0 l0Var4 = l0Var3;
                    j1.q qVarU = lc.b.U(borderModifierNodeElement, f15, l0Var4, false, 24);
                    s.o oVar6 = oVar4;
                    if (oVar6 != null) {
                        borderModifierNodeElement = new BorderModifierNodeElement(oVar6.f19235a, oVar6.f19236b, l0Var4);
                    }
                    j1.q qVarK = gh.g.k(androidx.compose.foundation.a.b(qVarU.e(borderModifierNodeElement), jA, l0Var4), l0Var4);
                    Object objK = oVar5.K();
                    x0.r0 r0Var = x0.k.f24334a;
                    if (objK == r0Var) {
                        objK = new g1.d(19);
                        oVar5.h0(objK);
                    }
                    j1.q qVarA = q2.m.a(qVarK, false, (ic.k) objK);
                    Object objK2 = oVar5.K();
                    if (objK2 == r0Var) {
                        objK2 = s.f12095a;
                        oVar5.h0(objK2);
                    }
                    j1.q qVarE = c2.e0.a(qVarA, a0Var, (PointerInputEventHandler) objK2).e(qVar3);
                    g2.v0 v0VarD = y.p.d(j1.c.f9662a, true);
                    int iQ = x0.v.q(oVar5);
                    x0.j1 j1VarL = oVar5.l();
                    j1.q qVarC = j1.a.c(qVarE, oVar5);
                    i2.k.f8771g0.getClass();
                    i2.i iVar = i2.j.f8733b;
                    oVar5.a0();
                    if (oVar5.S) {
                        oVar5.k(iVar);
                    } else {
                        oVar5.k0();
                    }
                    x0.v.A(i2.j.f8738g, v0VarD, oVar5);
                    x0.v.A(i2.j.f8737f, j1VarL, oVar5);
                    i2.h hVar = i2.j.f8741j;
                    if (oVar5.S || !jc.l.a(oVar5.K(), Integer.valueOf(iQ))) {
                        j2.h0.s(iQ, oVar5, iQ, hVar);
                    }
                    x0.v.A(i2.j.f8735d, qVarC, oVar5);
                    fVar.q(oVar5, 0);
                    oVar5.p(true);
                    return a0Var;
                }
            }, oVar2), oVar2, 56);
            f11 = f14;
        } else {
            oVar2.Q();
            f11 = f10;
        }
        p1 p1VarR = oVar2.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new r(qVar, l0Var, j10, j11, oVar, f11, fVar, i10);
        }
    }
}
