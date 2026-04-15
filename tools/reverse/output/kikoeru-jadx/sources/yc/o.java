package yc;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ld.o f26125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ld.o f26126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ld.o f26127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ld.o f26128d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ld.o f26129e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ld.o f26130f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ld.o f26131g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ld.o f26132h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ld.o f26133i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ld.o f26134j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final n0 f26135k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final n0 f26136l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final n0 f26137m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ye.n f26138n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final HashMap f26139o;

    static {
        y0 y0Var = y0.f26161c;
        ld.o oVar = new ld.o(y0Var, 3);
        f26125a = oVar;
        z0 z0Var = z0.f26164c;
        ld.o oVar2 = new ld.o(z0Var, 4);
        f26126b = oVar2;
        a1 a1Var = a1.f26093c;
        ld.o oVar3 = new ld.o(a1Var, 5);
        f26127c = oVar3;
        v0 v0Var = v0.f26152c;
        ld.o oVar4 = new ld.o(v0Var, 6);
        f26128d = oVar4;
        b1 b1Var = b1.f26096c;
        ld.o oVar5 = new ld.o(b1Var, 7);
        f26129e = oVar5;
        x0 x0Var = x0.f26160c;
        ld.o oVar6 = new ld.o(x0Var, 8);
        f26130f = oVar6;
        u0 u0Var = u0.f26150c;
        ld.o oVar7 = new ld.o(u0Var, 9);
        f26131g = oVar7;
        w0 w0Var = w0.f26153c;
        ld.o oVar8 = new ld.o(w0Var, 10);
        f26132h = oVar8;
        c1 c1Var = c1.f26100c;
        ld.o oVar9 = new ld.o(c1Var, 11);
        f26133i = oVar9;
        Collections.unmodifiableSet(vb.l.N0(new ld.o[]{oVar, oVar2, oVar4, oVar6}));
        HashMap map = new HashMap(6);
        map.put(oVar2, 0);
        map.put(oVar, 0);
        map.put(oVar4, 1);
        map.put(oVar3, 1);
        map.put(oVar5, 2);
        Collections.unmodifiableMap(map);
        f26134j = oVar5;
        f26135k = new n0(2);
        f26136l = new n0(3);
        f26137m = new n0(4);
        try {
            Iterator it = Arrays.asList(new ye.n[0]).iterator();
            f26138n = it.hasNext() ? (ye.n) it.next() : ye.n.f26241a;
            HashMap map2 = new HashMap();
            f26139o = map2;
            map2.put(y0Var, oVar);
            map2.put(z0Var, oVar2);
            map2.put(a1Var, oVar3);
            map2.put(v0Var, oVar4);
            map2.put(b1Var, oVar5);
            map2.put(x0Var, oVar6);
            map2.put(u0Var, oVar7);
            map2.put(w0Var, oVar8);
            map2.put(c1Var, oVar9);
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(int r8) {
        /*
            r0 = 16
            if (r8 == r0) goto L7
            java.lang.String r1 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L9
        L7:
            java.lang.String r1 = "@NotNull method %s.%s must not return null"
        L9:
            r2 = 3
            r3 = 2
            if (r8 == r0) goto Lf
            r4 = 3
            goto L10
        Lf:
            r4 = 2
        L10:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities"
            r6 = 1
            r7 = 0
            if (r8 == r6) goto L3a
            if (r8 == r2) goto L3a
            r2 = 5
            if (r8 == r2) goto L3a
            r2 = 7
            if (r8 == r2) goto L3a
            switch(r8) {
                case 9: goto L3a;
                case 10: goto L35;
                case 11: goto L30;
                case 12: goto L35;
                case 13: goto L30;
                case 14: goto L2b;
                case 15: goto L2b;
                case 16: goto L28;
                default: goto L23;
            }
        L23:
            java.lang.String r2 = "what"
            r4[r7] = r2
            goto L3e
        L28:
            r4[r7] = r5
            goto L3e
        L2b:
            java.lang.String r2 = "visibility"
            r4[r7] = r2
            goto L3e
        L30:
            java.lang.String r2 = "second"
            r4[r7] = r2
            goto L3e
        L35:
            java.lang.String r2 = "first"
            r4[r7] = r2
            goto L3e
        L3a:
            java.lang.String r2 = "from"
            r4[r7] = r2
        L3e:
            java.lang.String r2 = "toDescriptorVisibility"
            if (r8 == r0) goto L45
            r4[r6] = r5
            goto L47
        L45:
            r4[r6] = r2
        L47:
            switch(r8) {
                case 2: goto L70;
                case 3: goto L70;
                case 4: goto L6b;
                case 5: goto L6b;
                case 6: goto L66;
                case 7: goto L66;
                case 8: goto L61;
                case 9: goto L61;
                case 10: goto L5c;
                case 11: goto L5c;
                case 12: goto L57;
                case 13: goto L57;
                case 14: goto L52;
                case 15: goto L4f;
                case 16: goto L74;
                default: goto L4a;
            }
        L4a:
            java.lang.String r2 = "isVisible"
            r4[r3] = r2
            goto L74
        L4f:
            r4[r3] = r2
            goto L74
        L52:
            java.lang.String r2 = "isPrivate"
            r4[r3] = r2
            goto L74
        L57:
            java.lang.String r2 = "compare"
            r4[r3] = r2
            goto L74
        L5c:
            java.lang.String r2 = "compareLocal"
            r4[r3] = r2
            goto L74
        L61:
            java.lang.String r2 = "findInvisibleMember"
            r4[r3] = r2
            goto L74
        L66:
            java.lang.String r2 = "inSameFile"
            r4[r3] = r2
            goto L74
        L6b:
            java.lang.String r2 = "isVisibleWithAnyReceiver"
            r4[r3] = r2
            goto L74
        L70:
            java.lang.String r2 = "isVisibleIgnoringReceiver"
            r4[r3] = r2
        L74:
            java.lang.String r1 = java.lang.String.format(r1, r4)
            if (r8 == r0) goto L80
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r1)
            goto L85
        L80:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r1)
        L85:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: yc.o.a(int):void");
    }

    public static Integer b(ld.o oVar, ld.o oVar2) {
        if (oVar == null) {
            a(12);
            throw null;
        }
        e1 e1Var = oVar.f12236a;
        if (oVar2 == null) {
            a(13);
            throw null;
        }
        e1 e1Var2 = oVar2.f12236a;
        Integer numA = e1Var.a(e1Var2);
        if (numA != null) {
            return numA;
        }
        Integer numA2 = e1Var2.a(e1Var);
        if (numA2 != null) {
            return Integer.valueOf(-numA2.intValue());
        }
        return null;
    }

    public static n c(me.d dVar, n nVar, k kVar) {
        n nVarC;
        if (nVar == null) {
            a(8);
            throw null;
        }
        if (kVar == null) {
            a(9);
            throw null;
        }
        for (n nVar2 = (n) nVar.a(); nVar2 != null && nVar2.f() != f26130f; nVar2 = (n) ee.e.i(nVar2, n.class, true)) {
            if (!nVar2.f().a(dVar, nVar2, kVar)) {
                return nVar2;
            }
        }
        if (!(nVar instanceof bd.u0) || (nVarC = c(dVar, ((bd.v0) ((bd.u0) nVar)).F, kVar)) == null) {
            return null;
        }
        return nVarC;
    }

    public static boolean d(n nVar, k kVar) {
        if (kVar == null) {
            a(7);
            throw null;
        }
        n0 n0VarF = ee.e.f(kVar);
        if (n0VarF != n0.f26122b) {
            return n0VarF.equals(ee.e.f(nVar));
        }
        return false;
    }

    public static boolean e(ld.o oVar) {
        if (oVar != null) {
            return oVar == f26125a || oVar == f26126b;
        }
        a(14);
        throw null;
    }

    public static ld.o f(e1 e1Var) {
        if (e1Var == null) {
            a(15);
            throw null;
        }
        ld.o oVar = (ld.o) f26139o.get(e1Var);
        if (oVar != null) {
            return oVar;
        }
        throw new IllegalArgumentException("Inapplicable visibility: " + e1Var);
    }
}
