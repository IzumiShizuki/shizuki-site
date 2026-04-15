package c0;

import b0.s1;
import ba.v0;
import i2.g1;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x extends jc.j implements ic.n {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f3175i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(int i10, Object obj, Class cls, String str, String str2, int i11, int i12, int i13) {
        super(i10, obj, cls, str, str2, i11, i12);
        this.f3175i = i13;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        boolean zB;
        s.c0 c0VarF0;
        switch (this.f3175i) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                int iIntValue2 = ((Number) obj2).intValue();
                z zVar = (z) this.f10819b;
                ah.j jVar = zVar.f3184e;
                int[] iArr = new int[iIntValue2];
                int iMin = 0;
                if (((o) zVar.f3183d.getValue()).f3122j.p(iIntValue)) {
                    vb.l.q0(iArr, iIntValue, 0, 6);
                } else {
                    jVar.m(iIntValue + iIntValue2);
                    int iU = jVar.u(iIntValue);
                    if (iU != -2 && iU != -1) {
                        if (iU < 0) {
                            x.a.a("Expected positive lane number, got " + iU + " instead.");
                        }
                        iMin = Math.min(iU, iIntValue2);
                    }
                    int i10 = iMin - 1;
                    int iO = iIntValue;
                    while (true) {
                        if (-1 < i10) {
                            iO = jVar.o(iO, i10);
                            iArr[i10] = iO;
                            if (iO == -1) {
                                vb.l.q0(iArr, -1, i10, 2);
                            } else {
                                i10--;
                            }
                        }
                    }
                    iArr[iMin] = iIntValue;
                    while (true) {
                        iMin++;
                        if (iMin < iIntValue2) {
                            iIntValue++;
                            int length = jVar.f390b + ((int[]) jVar.f391c).length;
                            while (true) {
                                if (iIntValue >= length) {
                                    iIntValue = jVar.f390b + ((int[]) jVar.f391c).length;
                                } else {
                                    if (jVar.b(iIntValue, iMin)) {
                                    }
                                    iIntValue++;
                                }
                                break;
                            }
                            iArr[iMin] = iIntValue;
                        }
                    }
                }
                return iArr;
            case 1:
                return j9.u.c((j9.u) this.f10819b, (List) obj, (yb.c) obj2);
            case 2:
                return j9.u.b((j9.u) this.f10819b, (List) obj, (yb.c) obj2);
            case 3:
                return j9.u.a((j9.u) this.f10819b, (List) obj, (yb.c) obj2);
            case 4:
                o1.u uVar = (o1.u) obj;
                o1.u uVar2 = (o1.u) obj2;
                s.b0 b0Var = (s.b0) this.f10819b;
                if (b0Var.f9703n && (zB = uVar2.b()) != uVar.b()) {
                    ic.k kVar = b0Var.f19107r;
                    if (kVar != null) {
                        kVar.a(Boolean.valueOf(zB));
                    }
                    yb.c cVar = null;
                    if (zB) {
                        hf.a0.y(b0Var.n0(), null, null, new v0(16, b0Var, cVar), 3);
                        jc.y yVar = new jc.y();
                        i2.f.t(b0Var, new s1(16, yVar, b0Var));
                        b0.v0 v0Var = (b0.v0) yVar.f10838a;
                        if (v0Var != null) {
                            v0Var.a();
                        } else {
                            v0Var = null;
                        }
                        b0Var.f19109t = v0Var;
                        g1 g1Var = b0Var.f19110u;
                        if (g1Var != null && g1Var.M0().f9703n && (c0VarF0 = b0Var.F0()) != null) {
                            c0VarF0.B0(b0Var.f19110u);
                        }
                    } else {
                        b0.v0 v0Var2 = b0Var.f19109t;
                        if (v0Var2 != null) {
                            v0Var2.b();
                        }
                        b0Var.f19109t = null;
                        s.c0 c0VarF02 = b0Var.F0();
                        if (c0VarF02 != null) {
                            c0VarF02.B0(null);
                        }
                    }
                    i2.f.o(b0Var);
                    w.k kVar2 = b0Var.f19106q;
                    if (kVar2 != null) {
                        if (zB) {
                            w.f fVar = b0Var.f19108s;
                            if (fVar != null) {
                                b0Var.E0(kVar2, new w.g(fVar));
                                b0Var.f19108s = null;
                            }
                            w.f fVar2 = new w.f();
                            b0Var.E0(kVar2, fVar2);
                            b0Var.f19108s = fVar2;
                        } else {
                            w.f fVar3 = b0Var.f19108s;
                            if (fVar3 != null) {
                                b0Var.E0(kVar2, new w.g(fVar3));
                                b0Var.f19108s = null;
                            }
                        }
                    }
                }
                return ub.a0.f21526a;
            case 5:
                se.w wVar = (se.w) obj;
                se.w wVar2 = (se.w) obj2;
                jc.l.e(wVar, "p0");
                jc.l.e(wVar2, "p1");
                ((te.s) this.f10819b).getClass();
                te.k.f20742b.getClass();
                te.l lVar = te.j.f20741b;
                return Boolean.valueOf(lVar.b(wVar, wVar2) && !lVar.b(wVar2, wVar));
            case 6:
                se.w wVar3 = (se.w) obj;
                se.w wVar4 = (se.w) obj2;
                jc.l.e(wVar3, "p0");
                jc.l.e(wVar4, "p1");
                return Boolean.valueOf(((te.l) this.f10819b).a(wVar3, wVar4));
            default:
                uf.g gVar = (uf.g) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                jc.l.e(gVar, "p0");
                yf.i iVar = (yf.i) this.f10819b;
                iVar.getClass();
                boolean z10 = !gVar.t(iIntValue3) && gVar.s(iIntValue3).n();
                iVar.f26289b = z10;
                return Boolean.valueOf(z10);
        }
    }
}
