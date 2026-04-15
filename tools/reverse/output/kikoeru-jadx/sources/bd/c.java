package bd;

import com.tencent.bugly.beta.tinker.TinkerReport;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class c extends e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final be.e f2549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final re.i f2550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final re.i f2551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final re.i f2552d;

    public c(re.o oVar, be.e eVar) {
        if (oVar == null) {
            k(0);
            throw null;
        }
        if (eVar == null) {
            k(1);
            throw null;
        }
        this.f2549a = eVar;
        re.l lVar = (re.l) oVar;
        this.f2550b = new re.i(lVar, new b(this, 0));
        this.f2551c = new re.i(lVar, new b(this, 1));
        this.f2552d = new re.i(lVar, new b(this, 2));
    }

    public static /* synthetic */ void k(int i10) {
        String str = (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 6 || i10 == 9 || i10 == 12 || i10 == 14 || i10 == 16 || i10 == 17 || i10 == 19 || i10 == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 6 || i10 == 9 || i10 == 12 || i10 == 14 || i10 == 16 || i10 == 17 || i10 == 19 || i10 == 20) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 7:
            case 13:
                objArr[0] = "typeArguments";
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
            case 11:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
            case 15:
                objArr[0] = "typeSubstitution";
                break;
            case 18:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i10 == 2) {
            objArr[1] = "getName";
        } else if (i10 == 3) {
            objArr[1] = "getOriginal";
        } else if (i10 == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i10 == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i10 == 6) {
            objArr[1] = "getContextReceivers";
        } else if (i10 == 9 || i10 == 12 || i10 == 14 || i10 == 16) {
            objArr[1] = "getMemberScope";
        } else if (i10 == 17) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i10 == 19) {
            objArr[1] = "substitute";
        } else if (i10 != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i10) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                break;
            case 7:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
            case 11:
            case 13:
            case 15:
                objArr[2] = "getMemberScope";
                break;
            case 18:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 2 && i10 != 3 && i10 != 4 && i10 != 5 && i10 != 6 && i10 != 9 && i10 != 12 && i10 != 14 && i10 != 16 && i10 != 17 && i10 != 19 && i10 != 20) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // yc.e, yc.h
    public final se.a0 E() {
        se.a0 a0Var = (se.a0) this.f2550b.b();
        if (a0Var != null) {
            return a0Var;
        }
        k(20);
        throw null;
    }

    @Override // yc.e
    public le.o I0() {
        le.o oVar = (le.o) this.f2551c.b();
        if (oVar != null) {
            return oVar;
        }
        k(4);
        throw null;
    }

    @Override // yc.e
    public le.o N0() {
        ie.d.i(ee.e.d(this));
        le.o oVarI = i(te.f.f20727a);
        if (oVarI != null) {
            return oVarI;
        }
        k(17);
        throw null;
    }

    @Override // yc.e
    public List Q0() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        k(6);
        throw null;
    }

    @Override // yc.e
    public final a0 T0() {
        a0 a0Var = (a0) this.f2552d.b();
        if (a0Var != null) {
            return a0Var;
        }
        k(5);
        throw null;
    }

    @Override // bd.e0, yc.e, yc.k, yc.b
    public final yc.h a() {
        return this;
    }

    @Override // yc.k
    public final Object a0(yc.m mVar, Object obj) {
        return mVar.K(this, obj);
    }

    @Override // bd.e0
    public le.o c(se.p0 p0Var, te.f fVar) {
        if (!p0Var.e()) {
            return new le.t(i(fVar), new se.r0(p0Var));
        }
        le.o oVarI = i(fVar);
        if (oVarI != null) {
            return oVarI;
        }
        k(12);
        throw null;
    }

    @Override // yc.e
    public final le.o f0(se.p0 p0Var) {
        ie.d.i(ee.e.d(this));
        le.o oVarC = c(p0Var, te.f.f20727a);
        if (oVarC != null) {
            return oVarC;
        }
        k(16);
        throw null;
    }

    @Override // yc.k
    public final be.e getName() {
        be.e eVar = this.f2549a;
        if (eVar != null) {
            return eVar;
        }
        k(2);
        throw null;
    }

    @Override // yc.o0
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public yc.e h(se.r0 r0Var) {
        if (r0Var != null) {
            return r0Var.f19981a.e() ? this : new d0(this, r0Var);
        }
        k(18);
        throw null;
    }

    @Override // bd.e0, yc.k, yc.b
    public final yc.k a() {
        return this;
    }

    @Override // bd.e0, yc.e, yc.k, yc.b
    public final yc.e a() {
        return this;
    }
}
