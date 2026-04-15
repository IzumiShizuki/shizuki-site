package ba;

import com.cnl.kikoeru.R;
import com.tencent.bugly.beta.tinker.TinkerReport;
import i7.p2;
import java.util.LinkedHashMap;
import java.util.Map;
import m0.q4;
import m0.r4;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2472e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2473f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(int i10, yb.c cVar) {
        super(2, cVar);
        this.f2472e = i10;
        switch (i10) {
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                fa.v vVar = fa.v.f7039a;
                super(2, cVar);
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                fa.v vVar2 = fa.v.f7039a;
                super(2, cVar);
                break;
            default:
                j9.u uVar = j9.u.f10753a;
                break;
        }
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        int i10 = 2;
        switch (this.f2472e) {
            case 0:
                return new t(i10, cVar, 0);
            case 1:
                return new t(i10, cVar, 1);
            case 2:
                return new t(i10, cVar, i10);
            case 3:
                return new t(i10, cVar, 3);
            case 4:
                return new t(i10, cVar, 4);
            case 5:
                return new t(i10, cVar, 5);
            case 6:
                return new t(i10, cVar, 6);
            case 7:
                j9.u uVar = j9.u.f10753a;
                return new t(7, cVar);
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                fa.v vVar = fa.v.f7039a;
                return new t(8, cVar);
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                fa.v vVar2 = fa.v.f7039a;
                return new t(9, cVar);
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                return new t(i10, cVar, 10);
            case 11:
                return new t(i10, cVar, 11);
            case 12:
                t tVar = new t(i10, cVar, 12);
                tVar.f2473f = ((Number) obj).intValue();
                return tVar;
            case 13:
                return new t(i10, cVar, 13);
            default:
                return new t(i10, cVar, 14);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f2472e) {
            case 12:
                break;
        }
        return ((t) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ac.a
    public final Object u(Object obj) throws Throwable {
        int i10 = this.f2472e;
        int i11 = 2;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        yb.c cVar = null;
        ub.a0 a0Var = ub.a0.f21526a;
        zb.a aVar = zb.a.f26667a;
        int i12 = 1;
        switch (i10) {
            case 0:
                int i13 = this.f2473f;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                    return a0Var;
                }
                ub.a.f(obj);
                LinkedHashMap linkedHashMap = b9.f.f2281a;
                this.f2473f = 1;
                pf.e eVar = hf.l0.f8566a;
                Object objH = hf.a0.H(pf.d.f17138c, new b9.e(true, null), this);
                if (objH != aVar) {
                    objH = a0Var;
                }
                return objH == aVar ? aVar : a0Var;
            case 1:
                int i14 = this.f2473f;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                    return obj;
                }
                ub.a.f(obj);
                this.f2473f = 1;
                pf.e eVar2 = hf.l0.f8566a;
                Object objH2 = hf.a0.H(pf.d.f17138c.h0(5), new f9.a(i11, cVar, (int) (objArr == true ? 1 : 0)), this);
                return objH2 == aVar ? aVar : objH2;
            case 2:
                int i15 = this.f2473f;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                    return obj;
                }
                ub.a.f(obj);
                this.f2473f = 1;
                pf.e eVar3 = hf.l0.f8566a;
                Object objH3 = hf.a0.H(pf.d.f17138c.h0(5), new f9.b(2, null), this);
                return objH3 == aVar ? aVar : objH3;
            case 3:
                int i16 = this.f2473f;
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                    return obj;
                }
                ub.a.f(obj);
                this.f2473f = 1;
                pf.e eVar4 = hf.l0.f8566a;
                Object objH4 = hf.a0.H(pf.d.f17138c.h0(5), new f9.a(i11, cVar, i12), this);
                return objH4 == aVar ? aVar : objH4;
            case 4:
                int i17 = this.f2473f;
                if (i17 != 0) {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                    return obj;
                }
                ub.a.f(obj);
                this.f2473f = 1;
                pf.e eVar5 = hf.l0.f8566a;
                Object objH5 = hf.a0.H(pf.d.f17138c.h0(5), new f9.a(i11, cVar, (int) (objArr2 == true ? 1 : 0)), this);
                return objH5 == aVar ? aVar : objH5;
            case 5:
                int i18 = this.f2473f;
                if (i18 != 0) {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                    return obj;
                }
                ub.a.f(obj);
                this.f2473f = 1;
                pf.e eVar6 = hf.l0.f8566a;
                Object objH6 = hf.a0.H(pf.d.f17138c.h0(5), new f9.b(2, null), this);
                return objH6 == aVar ? aVar : objH6;
            case 6:
                int i19 = this.f2473f;
                if (i19 == 0) {
                    ub.a.f(obj);
                    this.f2473f = 1;
                    pf.e eVar7 = hf.l0.f8566a;
                    obj = hf.a0.H(pf.d.f17138c.h0(5), new f9.a(i11, cVar, i12), this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                }
                ub.k kVar = (ub.k) obj;
                ka.n.c(na.q.h(R.string.history_metadata_tip, new Integer(((Number) kVar.f21543a).intValue()), new Integer(((Number) kVar.f21544b).intValue())), 0L, null, null, 511);
                return a0Var;
            case 7:
                int i20 = this.f2473f;
                if (i20 != 0) {
                    if (i20 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                    return a0Var;
                }
                ub.a.f(obj);
                j9.u uVar = j9.u.f10753a;
                this.f2473f = 1;
                return uVar.f(true, this) == aVar ? aVar : a0Var;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                int i21 = this.f2473f;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                    return a0Var;
                }
                ub.a.f(obj);
                fa.v vVar = fa.v.f7039a;
                p2 p2Var = fa.v.f7042d;
                this.f2473f = 1;
                m0.x xVar = (m0.x) p2Var.f9258a;
                m0.x xVar2 = (m0.x) p2Var.f9258a;
                Map map = xVar.d().f12652a;
                r4 r4Var = r4.f13549b;
                boolean zContainsKey = map.containsKey(r4Var);
                if (q4.f13505a[((r4) xVar2.f13851g.getValue()).ordinal()] == 1) {
                    Map map2 = xVar2.d().f12652a;
                    r4 r4Var2 = r4.f13550c;
                    if (map2.containsKey(r4Var2)) {
                        r4Var = r4Var2;
                    }
                } else if (!zContainsKey) {
                    r4Var = r4.f13548a;
                }
                Object objJ = p2.j(p2Var, r4Var, this);
                if (objJ != aVar) {
                    objJ = a0Var;
                }
                return objJ == aVar ? aVar : a0Var;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                int i22 = this.f2473f;
                if (i22 != 0) {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                    return a0Var;
                }
                ub.a.f(obj);
                fa.v vVar2 = fa.v.f7039a;
                p2 p2Var2 = fa.v.f7042d;
                this.f2473f = 1;
                return p2Var2.x(this) == aVar ? aVar : a0Var;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                int i23 = this.f2473f;
                if (i23 != 0) {
                    if (i23 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                    return a0Var;
                }
                ub.a.f(obj);
                j9.u uVar2 = j9.u.f10753a;
                this.f2473f = 1;
                return j9.u.f10753a.f(false, this) == aVar ? aVar : a0Var;
            case 11:
                int i24 = this.f2473f;
                if (i24 != 0) {
                    if (i24 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                    return a0Var;
                }
                ub.a.f(obj);
                j9.u uVar3 = j9.u.f10753a;
                this.f2473f = 1;
                return j9.u.f10753a.f(false, this) == aVar ? aVar : a0Var;
            case 12:
                ub.a.f(obj);
                return Boolean.valueOf(this.f2473f > 0);
            case 13:
                int i25 = this.f2473f;
                if (i25 != 0) {
                    if (i25 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                    return a0Var;
                }
                ub.a.f(obj);
                this.f2473f = 1;
                na.q.b();
                return a0Var == aVar ? aVar : a0Var;
            default:
                int i26 = this.f2473f;
                if (i26 != 0) {
                    if (i26 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                    return a0Var;
                }
                ub.a.f(obj);
                LinkedHashMap linkedHashMap2 = b9.f.f2281a;
                this.f2473f = 1;
                pf.e eVar8 = hf.l0.f8566a;
                Object objH7 = hf.a0.H(pf.d.f17138c, new b9.e(false, null), this);
                if (objH7 != aVar) {
                    objH7 = a0Var;
                }
                return objH7 == aVar ? aVar : a0Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(int i10, yb.c cVar, int i11) {
        super(i10, cVar);
        this.f2472e = i11;
    }
}
