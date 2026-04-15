package bd;

import com.tencent.bugly.beta.tinker.TinkerReport;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class z extends q implements yc.t {
    public final int A;
    public yc.t B;
    public Map C;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f2715e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f2716f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public se.w f2717g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f2718h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a0 f2719i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a0 f2720j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public yc.x f2721k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ld.o f2722l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f2723m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f2724n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f2725o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f2726p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f2727q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f2728r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f2729s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f2730t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f2731u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f2732v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f2733w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Collection f2734x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public volatile i f2735y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final yc.t f2736z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(int i10, be.e eVar, yc.k kVar, yc.t tVar, yc.m0 m0Var, zc.h hVar) {
        super(kVar, hVar, eVar, m0Var);
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
        if (m0Var == null) {
            U0(4);
            throw null;
        }
        this.f2722l = yc.o.f26133i;
        this.f2723m = false;
        this.f2724n = false;
        this.f2725o = false;
        this.f2726p = false;
        this.f2727q = false;
        this.f2728r = false;
        this.f2729s = false;
        this.f2730t = false;
        this.f2731u = false;
        this.f2732v = true;
        this.f2733w = false;
        this.f2734x = null;
        this.f2735y = null;
        this.B = null;
        this.C = null;
        this.f2736z = tVar == null ? this : tVar;
        this.A = i10;
    }

    public static ArrayList H1(yc.t tVar, List list, se.r0 r0Var, boolean z10, boolean z11, boolean[] zArr) {
        if (list == null) {
            U0(30);
            throw null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            y0 y0Var = (y0) it.next();
            y0 y0Var2 = y0Var;
            se.w wVarB = y0Var2.b();
            se.x0 x0Var = se.x0.IN_VARIANCE;
            se.w wVarI = r0Var.i(wVarB, x0Var);
            se.w wVar = y0Var.f2713j;
            se.w wVarI2 = wVar == null ? null : r0Var.i(wVar, x0Var);
            if (wVarI == null) {
                return null;
            }
            if ((wVarI != y0Var2.b() || wVar != wVarI2) && zArr != null) {
                zArr[0] = true;
            }
            x xVar = y0Var instanceof x0 ? new x((List) ((x0) y0Var).f2684l.getValue()) : null;
            y0 y0Var3 = z10 ? null : y0Var;
            int i10 = y0Var.f2709f;
            zc.h annotations = y0Var.getAnnotations();
            be.e name = y0Var.getName();
            boolean zE1 = y0Var.E1();
            boolean z12 = y0Var.f2711h;
            boolean z13 = y0Var.f2712i;
            yc.m0 m0VarM = z11 ? y0Var.m() : yc.m0.p0;
            jc.l.e(annotations, "annotations");
            jc.l.e(name, "name");
            jc.l.e(m0VarM, "source");
            arrayList.add(xVar == null ? new y0(tVar, y0Var3, i10, annotations, name, wVarI, zE1, z12, z13, wVarI2, m0VarM) : new x0(tVar, y0Var3, i10, annotations, name, wVarI, zE1, z12, z13, wVarI2, m0VarM, xVar));
        }
        return arrayList;
    }

    public static /* synthetic */ void U0(int i10) {
        String str;
        int i11;
        switch (i10) {
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                str = "@NotNull method %s.%s must not return null";
                break;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                i11 = 2;
                break;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "source";
                break;
            case 5:
                objArr[0] = "contextReceiverParameters";
                break;
            case 6:
                objArr[0] = "typeParameters";
                break;
            case 7:
            case 28:
            case 30:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                objArr[0] = "visibility";
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 11:
                objArr[0] = "unsubstitutedReturnType";
                break;
            case 12:
                objArr[0] = "extensionReceiverParameter";
                break;
            case 17:
                objArr[0] = "overriddenDescriptors";
                break;
            case 22:
                objArr[0] = "originalSubstitutor";
                break;
            case 24:
            case 29:
            case 31:
                objArr[0] = "substitutor";
                break;
            case 25:
                objArr[0] = "configuration";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                objArr[1] = "initialize";
                break;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 14:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 15:
                objArr[1] = "getModality";
                break;
            case 16:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getTypeParameters";
                break;
            case 19:
                objArr[1] = "getValueParameters";
                break;
            case 20:
                objArr[1] = "getOriginal";
                break;
            case 21:
                objArr[1] = "getKind";
                break;
            case 23:
                objArr[1] = "newCopyBuilder";
                break;
            case 26:
                objArr[1] = "copy";
                break;
            case 27:
                objArr[1] = "getSourceToUseForCopy";
                break;
        }
        switch (i10) {
            case 5:
            case 6:
            case 7:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                objArr[2] = "initialize";
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                break;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                objArr[2] = "setVisibility";
                break;
            case 11:
                objArr[2] = "setReturnType";
                break;
            case 12:
                objArr[2] = "setExtensionReceiverParameter";
                break;
            case 17:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 22:
                objArr[2] = "substitute";
                break;
            case 24:
                objArr[2] = "newCopyBuilder";
                break;
            case 25:
                objArr[2] = "doSubstitute";
                break;
            case 28:
            case 29:
            case 30:
            case 31:
                objArr[2] = "getSubstitutedValueParameters";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                throw new IllegalStateException(str2);
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public Collection A() {
        i iVar = this.f2735y;
        if (iVar != null) {
            this.f2734x = (Collection) iVar.b();
            this.f2735y = null;
        }
        Collection collection = this.f2734x;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        if (collection != null) {
            return collection;
        }
        U0(14);
        throw null;
    }

    @Override // yc.c
    /* JADX INFO: renamed from: D1, reason: merged with bridge method [inline-methods] */
    public s0 F0(yc.k kVar, yc.x xVar, ld.o oVar) {
        return (s0) E1(kVar, xVar, oVar);
    }

    @Override // yc.b
    public Object E0(yc.a aVar) {
        Map map = this.C;
        if (map == null) {
            return null;
        }
        return map.get(aVar);
    }

    public final yc.t E1(yc.k kVar, yc.x xVar, ld.o oVar) {
        yc.t tVarBuild = M0().u(kVar).l(xVar).E(oVar).h(2).x().build();
        if (tVarBuild != null) {
            return tVarBuild;
        }
        U0(26);
        throw null;
    }

    public abstract z F1(int i10, be.e eVar, yc.k kVar, yc.t tVar, yc.m0 m0Var, zc.h hVar);

    @Override // yc.t
    public final boolean G0() {
        return this.f2729s;
    }

    public z G1(y yVar) {
        a0 a0Var;
        z zVar;
        ArrayList arrayList;
        a0 a0Var2;
        se.w wVarI;
        se.x0 x0Var = se.x0.IN_VARIANCE;
        boolean[] zArr = new boolean[1];
        zc.h hVarI = yVar.f2703s != null ? ua.l.I(getAnnotations(), yVar.f2703s) : getAnnotations();
        yc.k kVar = yVar.f2686b;
        yc.t tVar = yVar.f2689e;
        int i10 = yVar.f2690f;
        be.e eVar = yVar.f2696l;
        yc.m0 m0VarM = yVar.f2699o ? ((q) (tVar != null ? tVar : a())).m() : yc.m0.p0;
        if (m0VarM == null) {
            U0(27);
            throw null;
        }
        z zVarF1 = F1(i10, eVar, kVar, tVar, m0VarM, hVarI);
        List typeParameters = yVar.f2702r;
        if (typeParameters == null) {
            typeParameters = getTypeParameters();
        }
        zArr[0] = zArr[0] | (!typeParameters.isEmpty());
        ArrayList arrayList2 = new ArrayList(typeParameters.size());
        se.r0 r0VarC = se.c.C(typeParameters, yVar.f2685a, zVarF1, arrayList2, zArr);
        if (r0VarC != null) {
            ArrayList arrayList3 = new ArrayList();
            if (!yVar.f2692h.isEmpty()) {
                int i11 = 0;
                for (a0 a0Var3 : yVar.f2692h) {
                    se.w wVarI2 = r0VarC.i(a0Var3.b(), x0Var);
                    if (wVarI2 != null) {
                        int i12 = i11 + 1;
                        arrayList3.add(ee.m.e(zVarF1, wVarI2, ((me.a) a0Var3.D1()).B1(), a0Var3.getAnnotations(), i11));
                        zArr[0] = zArr[0] | (wVarI2 != a0Var3.b());
                        i11 = i12;
                    }
                }
            }
            a0 a0Var4 = yVar.f2693i;
            if (a0Var4 != null) {
                se.w wVarI3 = r0VarC.i(a0Var4.b(), x0Var);
                if (wVarI3 != null) {
                    yVar.f2693i.D1();
                    a0 a0Var5 = new a0(zVarF1, new me.b(zVarF1, wVarI3), yVar.f2693i.getAnnotations());
                    zArr[0] = (wVarI3 != yVar.f2693i.b()) | zArr[0];
                    a0Var = a0Var5;
                }
                return null;
            }
            a0Var = null;
            a0 a0Var6 = yVar.f2694j;
            if (a0Var6 != null) {
                a0 a0VarH = a0Var6.h(r0VarC);
                if (a0VarH != null) {
                    zArr[0] = zArr[0] | (a0VarH != yVar.f2694j);
                    zVar = null;
                    arrayList = arrayList2;
                    a0Var2 = a0VarH;
                }
                return null;
            }
            zVar = null;
            arrayList = arrayList2;
            a0Var2 = null;
            ArrayList arrayListH1 = H1(zVarF1, yVar.f2691g, r0VarC, yVar.f2700p, yVar.f2699o, zArr);
            if (arrayListH1 == null || (wVarI = r0VarC.i(yVar.f2695k, se.x0.OUT_VARIANCE)) == null) {
                return zVar;
            }
            boolean z10 = zArr[0] | (wVarI != yVar.f2695k);
            zArr[0] = z10;
            if (!z10 && yVar.f2707w) {
                return this;
            }
            zVarF1.I1(a0Var, a0Var2, arrayList3, arrayList, arrayListH1, wVarI, yVar.f2687c, yVar.f2688d);
            zVarF1.f2723m = this.f2723m;
            zVarF1.f2724n = this.f2724n;
            zVarF1.f2725o = this.f2725o;
            zVarF1.f2726p = this.f2726p;
            zVarF1.f2727q = this.f2727q;
            zVarF1.f2731u = this.f2731u;
            zVarF1.f2728r = this.f2728r;
            zVarF1.L1(this.f2732v);
            zVarF1.f2729s = yVar.f2701q;
            zVarF1.f2730t = yVar.f2704t;
            Boolean bool = yVar.f2706v;
            zVarF1.M1(bool != null ? bool.booleanValue() : this.f2733w);
            if (!yVar.f2705u.isEmpty() || this.C != null) {
                LinkedHashMap linkedHashMap = yVar.f2705u;
                Map map = this.C;
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        if (!linkedHashMap.containsKey(entry.getKey())) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                }
                if (linkedHashMap.size() == 1) {
                    zVarF1.C = Collections.singletonMap(linkedHashMap.keySet().iterator().next(), linkedHashMap.values().iterator().next());
                } else {
                    zVarF1.C = linkedHashMap;
                }
            }
            if (yVar.f2698n || this.B != null) {
                yc.t tVar2 = this.B;
                if (tVar2 == null) {
                    tVar2 = this;
                }
                zVarF1.B = tVar2.h(r0VarC);
            }
            if (yVar.f2697m && !a().A().isEmpty()) {
                if (yVar.f2685a.e()) {
                    i iVar = this.f2735y;
                    if (iVar != null) {
                        zVarF1.f2735y = iVar;
                        return zVarF1;
                    }
                    zVarF1.H0(A());
                    return zVarF1;
                }
                zVarF1.f2735y = new i(1, this, r0VarC);
            }
            return zVarF1;
        }
        return null;
    }

    public void H0(Collection collection) {
        if (collection == null) {
            U0(17);
            throw null;
        }
        this.f2734x = collection;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((yc.t) it.next()).L0()) {
                this.f2730t = true;
                return;
            }
        }
    }

    @Override // yc.t
    public boolean I() {
        return this.f2731u;
    }

    public void I1(a0 a0Var, a0 a0Var2, List list, List list2, List list3, se.w wVar, yc.x xVar, ld.o oVar) {
        if (list == null) {
            U0(5);
            throw null;
        }
        if (list2 == null) {
            U0(6);
            throw null;
        }
        if (list3 == null) {
            U0(7);
            throw null;
        }
        if (oVar == null) {
            U0(8);
            throw null;
        }
        this.f2715e = vb.m.G0(list2);
        this.f2716f = vb.m.G0(list3);
        this.f2717g = wVar;
        this.f2721k = xVar;
        this.f2722l = oVar;
        this.f2719i = a0Var;
        this.f2720j = a0Var2;
        this.f2718h = list;
        for (int i10 = 0; i10 < list2.size(); i10++) {
            yc.q0 q0Var = (yc.q0) list2.get(i10);
            if (q0Var.getIndex() != i10) {
                throw new IllegalStateException(q0Var + " index is " + q0Var.getIndex() + " but position is " + i10);
            }
        }
        for (int i11 = 0; i11 < list3.size(); i11++) {
            y0 y0Var = (y0) list3.get(i11);
            if (y0Var.f2709f != i11) {
                throw new IllegalStateException(y0Var + "index is " + y0Var.f2709f + " but position is " + i11);
            }
        }
    }

    public final y J1(se.r0 r0Var) {
        if (r0Var != null) {
            return new y(this, r0Var.f(), y(), s(), f(), j(), o0(), z0(), this.f2719i, n());
        }
        U0(24);
        throw null;
    }

    public final void K1(yc.a aVar, Object obj) {
        if (this.C == null) {
            this.C = new LinkedHashMap();
        }
        this.C.put(aVar, obj);
    }

    @Override // yc.t
    public final boolean L0() {
        return this.f2730t;
    }

    public void L1(boolean z10) {
        this.f2732v = z10;
    }

    public yc.s M0() {
        return J1(se.r0.f19980b);
    }

    public void M1(boolean z10) {
        this.f2733w = z10;
    }

    public final void N1(se.a0 a0Var) {
        if (a0Var != null) {
            this.f2717g = a0Var;
        } else {
            U0(11);
            throw null;
        }
    }

    @Override // yc.w
    public final boolean O0() {
        return false;
    }

    @Override // yc.w
    public boolean P() {
        return this.f2725o;
    }

    @Override // yc.t
    public final boolean R0() {
        if (this.f2724n) {
            return true;
        }
        Iterator it = a().A().iterator();
        while (it.hasNext()) {
            if (((yc.t) it.next()).R0()) {
                return true;
            }
        }
        return false;
    }

    @Override // yc.b
    public boolean Z() {
        return this.f2733w;
    }

    @Override // bd.q, bd.p, yc.k, yc.b
    public yc.t a() {
        yc.t tVar = this.f2736z;
        yc.t tVarA = tVar == this ? this : tVar.a();
        if (tVarA != null) {
            return tVarA;
        }
        U0(20);
        throw null;
    }

    public Object a0(yc.m mVar, Object obj) {
        return mVar.m(this, obj);
    }

    @Override // yc.w
    public final boolean c0() {
        return this.f2728r;
    }

    @Override // yc.n
    public final ld.o f() {
        ld.o oVar = this.f2722l;
        if (oVar != null) {
            return oVar;
        }
        U0(16);
        throw null;
    }

    @Override // yc.b
    public final List getTypeParameters() {
        List list = this.f2715e;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    @Override // yc.t
    public boolean h0() {
        return this.f2727q;
    }

    @Override // yc.t
    public final boolean i0() {
        if (this.f2723m) {
            return true;
        }
        Iterator it = a().A().iterator();
        while (it.hasNext()) {
            if (((yc.t) it.next()).i0()) {
                return true;
            }
        }
        return false;
    }

    @Override // yc.c
    public final int j() {
        int i10 = this.A;
        if (i10 != 0) {
            return i10;
        }
        U0(21);
        throw null;
    }

    @Override // yc.t
    public boolean l() {
        return this.f2726p;
    }

    public se.w n() {
        return this.f2717g;
    }

    @Override // yc.b
    public final List o0() {
        List list = this.f2716f;
        if (list != null) {
            return list;
        }
        U0(19);
        throw null;
    }

    @Override // yc.t
    public final yc.t r0() {
        return this.B;
    }

    @Override // yc.w
    public final yc.x s() {
        yc.x xVar = this.f2721k;
        if (xVar != null) {
            return xVar;
        }
        U0(15);
        throw null;
    }

    @Override // yc.b
    public final a0 s0() {
        return this.f2720j;
    }

    @Override // yc.b
    public final a0 v0() {
        return this.f2719i;
    }

    @Override // yc.b
    public final List z0() {
        List list = this.f2718h;
        if (list != null) {
            return list;
        }
        U0(13);
        throw null;
    }

    @Override // yc.o0
    public yc.t h(se.r0 r0Var) {
        if (r0Var == null) {
            U0(22);
            throw null;
        }
        if (r0Var.f19981a.e()) {
            return this;
        }
        y yVarJ1 = J1(r0Var);
        yVarJ1.f2689e = a();
        yVarJ1.f2699o = true;
        yVarJ1.f2707w = true;
        return yVarJ1.f2708x.G1(yVarJ1);
    }
}
