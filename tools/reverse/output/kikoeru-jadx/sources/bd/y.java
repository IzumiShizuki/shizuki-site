package bd;

import com.tencent.bugly.beta.tinker.TinkerReport;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class y implements yc.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public se.p0 f2685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public yc.k f2686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public yc.x f2687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ld.o f2688d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public yc.t f2689e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2690f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f2691g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f2692h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a0 f2693i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a0 f2694j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public se.w f2695k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public be.e f2696l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f2697m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f2698n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f2699o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f2700p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f2701q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public vb.r f2702r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public zc.h f2703s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f2704t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final LinkedHashMap f2705u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Boolean f2706v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f2707w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ z f2708x;

    public y(z zVar, se.p0 p0Var, yc.k kVar, yc.x xVar, ld.o oVar, int i10, List list, List list2, a0 a0Var, se.w wVar) {
        if (p0Var == null) {
            a(0);
            throw null;
        }
        if (kVar == null) {
            a(1);
            throw null;
        }
        if (xVar == null) {
            a(2);
            throw null;
        }
        if (oVar == null) {
            a(3);
            throw null;
        }
        if (i10 == 0) {
            a(4);
            throw null;
        }
        if (list == null) {
            a(5);
            throw null;
        }
        if (list2 == null) {
            a(6);
            throw null;
        }
        if (wVar == null) {
            a(7);
            throw null;
        }
        this.f2708x = zVar;
        this.f2689e = null;
        this.f2694j = zVar.f2720j;
        this.f2697m = true;
        this.f2698n = false;
        this.f2699o = false;
        this.f2700p = false;
        this.f2701q = zVar.f2729s;
        this.f2702r = null;
        this.f2703s = null;
        this.f2704t = zVar.f2730t;
        this.f2705u = new LinkedHashMap();
        this.f2706v = null;
        this.f2707w = false;
        this.f2685a = p0Var;
        this.f2686b = kVar;
        this.f2687c = xVar;
        this.f2688d = oVar;
        this.f2690f = i10;
        this.f2691g = list;
        this.f2692h = list2;
        this.f2693i = a0Var;
        this.f2695k = wVar;
        this.f2696l = null;
    }

    public static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        switch (i10) {
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                str = "@NotNull method %s.%s must not return null";
                break;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
            case 12:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case 35:
            case 37:
            case 39:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                i11 = 2;
                break;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
            case 12:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case 35:
            case 37:
            case 39:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "newOwner";
                break;
            case 2:
                objArr[0] = "newModality";
                break;
            case 3:
                objArr[0] = "newVisibility";
                break;
            case 4:
            case 14:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "newValueParameterDescriptors";
                break;
            case 6:
                objArr[0] = "newContextReceiverParameters";
                break;
            case 7:
                objArr[0] = "newReturnType";
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                objArr[0] = "owner";
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                break;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                objArr[0] = "modality";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 17:
                objArr[0] = "name";
                break;
            case 19:
            case 21:
                objArr[0] = "parameters";
                break;
            case 23:
                objArr[0] = "type";
                break;
            case 25:
                objArr[0] = "contextReceiverParameters";
                break;
            case 35:
                objArr[0] = "additionalAnnotations";
                break;
            case 37:
            default:
                objArr[0] = "substitution";
                break;
            case 39:
                objArr[0] = "userDataKey";
                break;
        }
        switch (i10) {
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                objArr[1] = "setOwner";
                break;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
            case 12:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case 35:
            case 37:
            case 39:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                break;
            case 11:
                objArr[1] = "setModality";
                break;
            case 13:
                objArr[1] = "setVisibility";
                break;
            case 15:
                objArr[1] = "setKind";
                break;
            case 16:
                objArr[1] = "setCopyOverrides";
                break;
            case 18:
                objArr[1] = "setName";
                break;
            case 20:
                objArr[1] = "setValueParameters";
                break;
            case 22:
                objArr[1] = "setTypeParameters";
                break;
            case 24:
                objArr[1] = "setReturnType";
                break;
            case 26:
                objArr[1] = "setContextReceiverParameters";
                break;
            case 27:
                objArr[1] = "setExtensionReceiverParameter";
                break;
            case 28:
                objArr[1] = "setDispatchReceiverParameter";
                break;
            case 29:
                objArr[1] = "setOriginal";
                break;
            case 30:
                objArr[1] = "setSignatureChange";
                break;
            case 31:
                objArr[1] = "setPreserveSourceElement";
                break;
            case 32:
                objArr[1] = "setDropOriginalInContainingParts";
                break;
            case 33:
                objArr[1] = "setHiddenToOvercomeSignatureClash";
                break;
            case 34:
                objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                break;
            case 36:
                objArr[1] = "setAdditionalAnnotations";
                break;
            case 38:
                objArr[1] = "setSubstitution";
                break;
            case 40:
                objArr[1] = "putUserData";
                break;
            case 41:
                objArr[1] = "getSubstitution";
                break;
            case 42:
                objArr[1] = "setJustForTypeSubstitution";
                break;
        }
        switch (i10) {
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                objArr[2] = "setOwner";
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                break;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                objArr[2] = "setModality";
                break;
            case 12:
                objArr[2] = "setVisibility";
                break;
            case 14:
                objArr[2] = "setKind";
                break;
            case 17:
                objArr[2] = "setName";
                break;
            case 19:
                objArr[2] = "setValueParameters";
                break;
            case 21:
                objArr[2] = "setTypeParameters";
                break;
            case 23:
                objArr[2] = "setReturnType";
                break;
            case 25:
                objArr[2] = "setContextReceiverParameters";
                break;
            case 35:
                objArr[2] = "setAdditionalAnnotations";
                break;
            case 37:
                objArr[2] = "setSubstitution";
                break;
            case 39:
                objArr[2] = "putUserData";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                throw new IllegalStateException(str2);
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
            case 12:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case 35:
            case 37:
            case 39:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // yc.s
    public final yc.s A() {
        this.f2702r = vb.r.f22819a;
        return this;
    }

    @Override // yc.s
    public final yc.s E(ld.o oVar) {
        if (oVar != null) {
            this.f2688d = oVar;
            return this;
        }
        a(12);
        throw null;
    }

    @Override // yc.s
    public final yc.s F() {
        this.f2701q = true;
        return this;
    }

    @Override // yc.s
    public final yc.s N() {
        this.f2698n = true;
        return this;
    }

    @Override // yc.s
    public final yc.t build() {
        return this.f2708x.G1(this);
    }

    @Override // yc.s
    public final yc.s c(a0 a0Var) {
        this.f2694j = a0Var;
        return this;
    }

    @Override // yc.s
    public final yc.s d(List list) {
        this.f2691g = list;
        return this;
    }

    @Override // yc.s
    public final yc.s e(be.e eVar) {
        if (eVar != null) {
            this.f2696l = eVar;
            return this;
        }
        a(17);
        throw null;
    }

    @Override // yc.s
    public final yc.s h(int i10) {
        if (i10 != 0) {
            this.f2690f = i10;
            return this;
        }
        a(14);
        throw null;
    }

    @Override // yc.s
    public final yc.s k() {
        this.f2699o = true;
        return this;
    }

    @Override // yc.s
    public final yc.s l(yc.x xVar) {
        if (xVar != null) {
            this.f2687c = xVar;
            return this;
        }
        a(10);
        throw null;
    }

    @Override // yc.s
    public final yc.s p(se.w wVar) {
        if (wVar != null) {
            this.f2695k = wVar;
            return this;
        }
        a(23);
        throw null;
    }

    @Override // yc.s
    public final yc.s q(zc.h hVar) {
        if (hVar != null) {
            this.f2703s = hVar;
            return this;
        }
        a(35);
        throw null;
    }

    @Override // yc.s
    public final yc.s r() {
        this.f2705u.put(nd.e.G, Boolean.TRUE);
        return this;
    }

    @Override // yc.s
    public final yc.s s() {
        this.f2704t = true;
        return this;
    }

    @Override // yc.s
    public final yc.s u(yc.k kVar) {
        if (kVar != null) {
            this.f2686b = kVar;
            return this;
        }
        a(8);
        throw null;
    }

    @Override // yc.s
    public final yc.s x() {
        this.f2697m = false;
        return this;
    }
}
