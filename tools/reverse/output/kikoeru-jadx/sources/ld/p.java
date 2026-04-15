package ld;

import bd.j0;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f12238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o f12239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o f12240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashMap f12241d;

    static {
        cd.a aVar = cd.a.f3889c;
        o oVar = new o(aVar, 0);
        f12238a = oVar;
        cd.c cVar = cd.c.f3891c;
        o oVar2 = new o(cVar, 1);
        f12239b = oVar2;
        cd.b bVar = cd.b.f3890c;
        o oVar3 = new o(bVar, 2);
        f12240c = oVar3;
        HashMap map = new HashMap();
        f12241d = map;
        map.put(aVar, oVar);
        map.put(cVar, oVar2);
        map.put(bVar, oVar3);
    }

    public static /* synthetic */ void a(int i10) {
        String str = (i10 == 5 || i10 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 5 || i10 == 6) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "from";
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = "second";
                break;
            case 4:
                objArr[0] = "visibility";
                break;
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i10 == 5 || i10 == 6) {
            objArr[1] = "toDescriptorVisibility";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        }
        if (i10 == 2 || i10 == 3) {
            objArr[2] = "areInSamePackage";
        } else if (i10 == 4) {
            objArr[2] = "toDescriptorVisibility";
        } else if (i10 != 5 && i10 != 6) {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 5 && i10 != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static boolean b(me.d dVar, yc.n nVar, yc.k kVar) {
        yc.n nVarS;
        if (kVar == null) {
            a(1);
            throw null;
        }
        if (nVar instanceof yc.c) {
            nVarS = ee.e.s((yc.c) nVar);
        } else {
            int i10 = ee.e.f6524a;
            nVarS = nVar;
        }
        if (c(nVarS, kVar)) {
            return true;
        }
        return yc.o.f26127c.a(dVar, nVar, kVar);
    }

    public static boolean c(yc.n nVar, yc.k kVar) {
        if (nVar == null) {
            a(2);
            throw null;
        }
        if (kVar == null) {
            a(3);
            throw null;
        }
        yc.d0 d0Var = (yc.d0) ee.e.i(nVar, yc.d0.class, false);
        yc.d0 d0Var2 = (yc.d0) ee.e.i(kVar, yc.d0.class, false);
        return (d0Var2 == null || d0Var == null || !((j0) d0Var).f2596e.equals(((j0) d0Var2).f2596e)) ? false : true;
    }
}
