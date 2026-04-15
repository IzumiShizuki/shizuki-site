package nd;

import bd.a0;
import bd.s0;
import bd.y;
import bd.z;
import com.tencent.bugly.beta.tinker.TinkerReport;
import ee.m;
import ef.l;
import j2.h0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import ld.o;
import se.r0;
import se.w;
import yc.k;
import yc.m0;
import yc.t;
import yc.x;
import ye.p;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e extends s0 implements a {
    public static final he.b F = new he.b();
    public static final he.b G = new he.b();
    public int D;
    public final boolean E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(k kVar, s0 s0Var, zc.h hVar, be.e eVar, int i10, m0 m0Var, boolean z10) {
        super(kVar, s0Var, hVar, eVar, i10, m0Var);
        if (kVar == null) {
            U0(0);
            throw null;
        }
        if (hVar == null) {
            U0(1);
            throw null;
        }
        if (eVar == null) {
            U0(2);
            throw null;
        }
        if (i10 == 0) {
            U0(3);
            throw null;
        }
        this.D = 0;
        this.E = z10;
    }

    public static e S1(k kVar, od.c cVar, be.e eVar, dd.g gVar, boolean z10) {
        if (kVar == null) {
            U0(5);
            throw null;
        }
        if (eVar != null) {
            return new e(kVar, null, cVar, eVar, 1, gVar, z10);
        }
        U0(7);
        throw null;
    }

    public static /* synthetic */ void U0(int i10) {
        String str = (i10 == 13 || i10 == 18 || i10 == 21) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 13 || i10 == 18 || i10 == 21) ? 2 : 3];
        switch (i10) {
            case 1:
            case 6:
            case 16:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 15:
                objArr[0] = "kind";
                break;
            case 4:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
            case 17:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                objArr[0] = "contextReceiverParameters";
                break;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                objArr[0] = "typeParameters";
                break;
            case 11:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case 14:
                objArr[0] = "newOwner";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i10 == 13) {
            objArr[1] = "initialize";
        } else if (i10 == 18) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i10 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i10) {
            case 5:
            case 6:
            case 7:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                objArr[2] = "createJavaMethod";
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
            case 11:
            case 12:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 21:
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 13 && i10 != 18 && i10 != 21) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // bd.s0, bd.z
    public final z F1(int i10, be.e eVar, k kVar, t tVar, m0 m0Var, zc.h hVar) {
        if (kVar == null) {
            U0(14);
            throw null;
        }
        if (i10 == 0) {
            U0(15);
            throw null;
        }
        if (hVar == null) {
            U0(16);
            throw null;
        }
        s0 s0Var = (s0) tVar;
        if (eVar == null) {
            eVar = getName();
        }
        e eVar2 = new e(kVar, s0Var, hVar, eVar, i10, m0Var, this.E);
        int i11 = this.D;
        boolean z10 = false;
        if (i11 != 1) {
            if (i11 == 2) {
                z10 = true;
            } else if (i11 != 3) {
                if (i11 != 4) {
                    throw null;
                }
                z10 = true;
            }
        }
        eVar2.T1(z10, h0.d(i11));
        return eVar2;
    }

    @Override // nd.a
    public final a O(w wVar, ArrayList arrayList, w wVar2, ub.k kVar) {
        ArrayList arrayListD = h.d(arrayList, o0(), this);
        a0 a0VarK = wVar == null ? null : m.k(this, wVar, zc.g.f26696a);
        y yVarJ1 = J1(r0.f19980b);
        yVarJ1.f2691g = arrayListD;
        yVarJ1.f2695k = wVar2;
        yVarJ1.f2693i = a0VarK;
        yVarJ1.f2700p = true;
        yVarJ1.f2699o = true;
        e eVar = (e) yVarJ1.f2708x.G1(yVarJ1);
        if (kVar != null) {
            eVar.K1((yc.a) kVar.f21543a, kVar.f21544b);
        }
        if (eVar != null) {
            return eVar;
        }
        U0(21);
        throw null;
    }

    @Override // bd.s0
    public final s0 R1(a0 a0Var, a0 a0Var2, List list, List list2, List list3, w wVar, x xVar, o oVar, Map map) {
        ye.f fVar;
        if (list == null) {
            U0(9);
            throw null;
        }
        if (list2 == null) {
            U0(10);
            throw null;
        }
        if (list3 == null) {
            U0(11);
            throw null;
        }
        if (oVar == null) {
            U0(12);
            throw null;
        }
        super.R1(a0Var, a0Var2, list, list2, list3, wVar, xVar, oVar, map);
        for (ye.h hVar : p.f26244a) {
            l lVar = hVar.f26228b;
            be.e eVar = hVar.f26227a;
            if (eVar == null || jc.l.a(getName(), eVar)) {
                if (lVar != null) {
                    String strB = getName().b();
                    jc.l.d(strB, "asString(...)");
                    if (!lVar.d(strB)) {
                        continue;
                    }
                }
                Collection collection = hVar.f26229c;
                if (collection == null || collection.contains(getName())) {
                    ye.e[] eVarArr = hVar.f26231e;
                    int length = eVarArr.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= length) {
                            fVar = ((String) hVar.f26230d.a(this)) != null ? new ye.f(false) : ye.f.f26216c;
                        } else {
                            if (eVarArr[i10].c(this) != null) {
                                fVar = new ye.f(false);
                                break;
                            }
                            i10++;
                        }
                    }
                    this.f2723m = fVar.f9048a;
                    return this;
                }
            }
        }
        fVar = ye.f.f26215b;
        this.f2723m = fVar.f9048a;
        return this;
    }

    public final void T1(boolean z10, boolean z11) {
        this.D = z10 ? z11 ? 4 : 2 : z11 ? 3 : 1;
    }

    @Override // bd.z, yc.b
    public final boolean Z() {
        return h0.d(this.D);
    }
}
