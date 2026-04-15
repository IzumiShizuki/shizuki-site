package pe;

import ce.i;
import ce.o;
import ef.u;
import jc.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a extends ne.a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f17104m;

    static {
        i iVar = new i();
        xd.b.a(iVar);
        o oVar = xd.b.f24964a;
        l.d(oVar, "packageFqName");
        o oVar2 = xd.b.f24966c;
        l.d(oVar2, "constructorAnnotation");
        o oVar3 = xd.b.f24965b;
        l.d(oVar3, "classAnnotation");
        o oVar4 = xd.b.f24967d;
        l.d(oVar4, "functionAnnotation");
        o oVar5 = xd.b.f24968e;
        l.d(oVar5, "propertyAnnotation");
        o oVar6 = xd.b.f24969f;
        l.d(oVar6, "propertyGetterAnnotation");
        o oVar7 = xd.b.f24970g;
        l.d(oVar7, "propertySetterAnnotation");
        o oVar8 = xd.b.f24972i;
        l.d(oVar8, "enumEntryAnnotation");
        o oVar9 = xd.b.f24971h;
        l.d(oVar9, "compileTimeValue");
        o oVar10 = xd.b.f24973j;
        l.d(oVar10, "parameterAnnotation");
        o oVar11 = xd.b.f24974k;
        l.d(oVar11, "typeAnnotation");
        o oVar12 = xd.b.f24975l;
        l.d(oVar12, "typeParameterAnnotation");
        f17104m = new a(iVar, oVar, oVar2, oVar3, oVar4, oVar5, oVar6, oVar7, oVar8, oVar9, oVar10, oVar11, oVar12);
    }

    public static String a(be.c cVar) {
        String strB;
        l.e(cVar, "fqName");
        StringBuilder sb = new StringBuilder();
        be.d dVar = cVar.f2744a;
        sb.append(u.i0(dVar.f2747a, '.', '/'));
        sb.append('/');
        if (dVar.c()) {
            strB = "default-package";
        } else {
            strB = dVar.g().b();
            l.d(strB, "asString(...)");
        }
        sb.append(strB.concat(".kotlin_builtins"));
        return sb.toString();
    }
}
