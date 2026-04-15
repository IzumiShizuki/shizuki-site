package bd;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class p0 extends z0 implements yc.k0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f2638f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public re.h f2639g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ic.a f2640h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final yc.x f2641i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ld.o f2642j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Collection f2643k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final yc.k0 f2644l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f2645m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f2646n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f2647o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f2648p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f2649q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f2650r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public List f2651s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public a0 f2652t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public a0 f2653u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ArrayList f2654v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public q0 f2655w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public r0 f2656x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public w f2657y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public w f2658z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(yc.k kVar, yc.k0 k0Var, zc.h hVar, yc.x xVar, ld.o oVar, boolean z10, be.e eVar, int i10, yc.m0 m0Var, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        super(kVar, hVar, eVar, null, m0Var);
        if (kVar == null) {
            U0(0);
            throw null;
        }
        if (hVar == null) {
            U0(1);
            throw null;
        }
        if (xVar == null) {
            U0(2);
            throw null;
        }
        if (oVar == null) {
            U0(3);
            throw null;
        }
        if (eVar == null) {
            U0(4);
            throw null;
        }
        if (i10 == 0) {
            U0(5);
            throw null;
        }
        if (m0Var == null) {
            U0(6);
            throw null;
        }
        this.f2638f = z10;
        this.f2643k = null;
        this.f2651s = Collections.EMPTY_LIST;
        this.f2641i = xVar;
        this.f2642j = oVar;
        this.f2644l = k0Var == null ? this : k0Var;
        this.f2645m = i10;
        this.f2646n = z11;
        this.f2647o = z12;
        this.f2648p = z13;
        this.f2649q = z14;
        this.f2650r = z15;
    }

    public static p0 E1(yc.k kVar, yc.x xVar, ld.o oVar, boolean z10, be.e eVar, int i10, yc.m0 m0Var) {
        if (kVar == null) {
            U0(7);
            throw null;
        }
        if (oVar == null) {
            U0(10);
            throw null;
        }
        if (eVar == null) {
            U0(11);
            throw null;
        }
        if (i10 == 0) {
            U0(12);
            throw null;
        }
        if (m0Var != null) {
            return new p0(kVar, null, zc.g.f26696a, xVar, oVar, z10, eVar, i10, m0Var, false, false, false, false, false);
        }
        U0(13);
        throw null;
    }

    public static yc.t G1(se.r0 r0Var, yc.j0 j0Var) {
        if (j0Var == null) {
            U0(31);
            throw null;
        }
        yc.t tVar = ((n0) j0Var).f2623l;
        if (tVar != null) {
            return tVar.h(r0Var);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void U0(int r11) {
        /*
            Method dump skipped, instruction units count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bd.p0.U0(int):void");
    }

    @Override // yc.b
    public final Collection A() {
        Collection collection = this.f2643k;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        if (collection != null) {
            return collection;
        }
        U0(41);
        throw null;
    }

    @Override // yc.t0
    public final boolean C0() {
        return this.f2646n;
    }

    @Override // yc.c
    /* JADX INFO: renamed from: D1, reason: merged with bridge method [inline-methods] */
    public final p0 F0(yc.k kVar, yc.x xVar, ld.o oVar) {
        o0 o0Var = new o0(this);
        if (kVar == null) {
            o0.a(0);
            throw null;
        }
        o0Var.f2626a = kVar;
        o0Var.f2629d = null;
        o0Var.f2627b = xVar;
        if (oVar == null) {
            o0.a(8);
            throw null;
        }
        o0Var.f2628c = oVar;
        o0Var.f2630e = 2;
        o0Var.f2632g = false;
        p0 p0VarB = o0Var.b();
        if (p0VarB != null) {
            return p0VarB;
        }
        U0(42);
        throw null;
    }

    @Override // yc.b
    public Object E0(yc.a aVar) {
        return null;
    }

    public p0 F1(yc.k kVar, yc.x xVar, ld.o oVar, yc.k0 k0Var, int i10, be.e eVar) {
        if (kVar == null) {
            U0(32);
            throw null;
        }
        if (xVar == null) {
            U0(33);
            throw null;
        }
        if (oVar == null) {
            U0(34);
            throw null;
        }
        if (i10 == 0) {
            U0(35);
            throw null;
        }
        if (eVar == null) {
            U0(36);
            throw null;
        }
        return new p0(kVar, k0Var, getAnnotations(), xVar, oVar, this.f2638f, eVar, i10, yc.m0.p0, this.f2646n, S(), this.f2648p, P(), this.f2650r);
    }

    @Override // yc.c
    public final void H0(Collection collection) {
        if (collection != null) {
            this.f2643k = collection;
        } else {
            U0(40);
            throw null;
        }
    }

    public final void H1(q0 q0Var, r0 r0Var, w wVar, w wVar2) {
        this.f2655w = q0Var;
        this.f2656x = r0Var;
        this.f2657y = wVar;
        this.f2658z = wVar2;
    }

    public final void I1(re.h hVar, ic.a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "compileTimeInitializerFactory", "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl", "setCompileTimeInitializer"));
        }
        this.f2640h = aVar;
        if (hVar == null) {
            hVar = (re.h) aVar.b();
        }
        this.f2639g = hVar;
    }

    public final void K1(se.w wVar, List list, a0 a0Var, a0 a0Var2, List list2) {
        if (wVar == null) {
            U0(17);
            throw null;
        }
        if (list == null) {
            U0(18);
            throw null;
        }
        if (list2 == null) {
            U0(19);
            throw null;
        }
        this.f2737e = wVar;
        this.f2654v = new ArrayList(list);
        this.f2653u = a0Var2;
        this.f2652t = a0Var;
        this.f2651s = list2;
    }

    @Override // yc.k0
    public final ArrayList N() {
        ArrayList arrayList = new ArrayList(2);
        q0 q0Var = this.f2655w;
        if (q0Var != null) {
            arrayList.add(q0Var);
        }
        r0 r0Var = this.f2656x;
        if (r0Var != null) {
            arrayList.add(r0Var);
        }
        return arrayList;
    }

    @Override // yc.w
    public final boolean O0() {
        return false;
    }

    @Override // yc.w
    public boolean P() {
        return this.f2649q;
    }

    @Override // yc.t0
    public boolean S() {
        return this.f2647o;
    }

    @Override // yc.k
    public final Object a0(yc.m mVar, Object obj) {
        return mVar.v(this, obj);
    }

    @Override // yc.w
    public final boolean c0() {
        return this.f2648p;
    }

    @Override // yc.k0
    public final q0 d() {
        return this.f2655w;
    }

    @Override // yc.k0
    public final r0 e() {
        return this.f2656x;
    }

    @Override // yc.n
    public final ld.o f() {
        ld.o oVar = this.f2642j;
        if (oVar != null) {
            return oVar;
        }
        U0(25);
        throw null;
    }

    @Override // yc.k0
    public final boolean g0() {
        return this.f2650r;
    }

    @Override // bd.z0, yc.b
    public final List getTypeParameters() {
        ArrayList arrayList = this.f2654v;
        if (arrayList != null) {
            return arrayList;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    @Override // yc.c
    public final int j() {
        int i10 = this.f2645m;
        if (i10 != 0) {
            return i10;
        }
        U0(39);
        throw null;
    }

    @Override // yc.t0
    public final ge.g m0() {
        re.h hVar = this.f2639g;
        if (hVar != null) {
            return (ge.g) hVar.b();
        }
        return null;
    }

    @Override // bd.z0, yc.b
    public final se.w n() {
        se.w wVarB = b();
        if (wVarB != null) {
            return wVarB;
        }
        U0(23);
        throw null;
    }

    @Override // yc.w
    public final yc.x s() {
        yc.x xVar = this.f2641i;
        if (xVar != null) {
            return xVar;
        }
        U0(24);
        throw null;
    }

    @Override // bd.z0, yc.b
    public final a0 s0() {
        return this.f2652t;
    }

    @Override // yc.t0
    public final boolean u0() {
        return this.f2638f;
    }

    @Override // bd.z0, yc.b
    public final a0 v0() {
        return this.f2653u;
    }

    @Override // yc.k0
    public final w w0() {
        return this.f2658z;
    }

    @Override // yc.k0
    public final w y0() {
        return this.f2657y;
    }

    @Override // yc.b
    public final List z0() {
        List list = this.f2651s;
        if (list != null) {
            return list;
        }
        U0(22);
        throw null;
    }

    @Override // yc.o0
    public final yc.k0 h(se.r0 r0Var) {
        if (r0Var == null) {
            U0(27);
            throw null;
        }
        if (r0Var.f19981a.e()) {
            return this;
        }
        o0 o0Var = new o0(this);
        se.p0 p0VarF = r0Var.f();
        if (p0VarF == null) {
            o0.a(15);
            throw null;
        }
        o0Var.f2631f = p0VarF;
        o0Var.f2629d = a();
        return o0Var.b();
    }

    @Override // bd.q, bd.p, yc.k, yc.b
    public final yc.k0 a() {
        yc.k0 k0Var = this.f2644l;
        yc.k0 k0VarA = k0Var == this ? this : k0Var.a();
        if (k0VarA != null) {
            return k0VarA;
        }
        U0(38);
        throw null;
    }

    public void J1(se.w wVar) {
    }
}
