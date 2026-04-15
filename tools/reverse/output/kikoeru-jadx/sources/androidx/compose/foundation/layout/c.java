package androidx.compose.foundation.layout;

import cg.d;
import j1.f;
import j1.g;
import j1.h;
import j1.q;
import m0.f4;
import m0.v7;
import y.b0;
import y.j;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final FillElement f555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final FillElement f556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final FillElement f557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final WrapContentElement f558d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final WrapContentElement f559e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final WrapContentElement f560f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final WrapContentElement f561g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final WrapContentElement f562h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final WrapContentElement f563i;

    static {
        b0 b0Var = b0.f25089b;
        f555a = new FillElement(b0Var, 1.0f);
        b0 b0Var2 = b0.f25088a;
        f556b = new FillElement(b0Var2, 1.0f);
        b0 b0Var3 = b0.f25090c;
        f557c = new FillElement(b0Var3, 1.0f);
        f fVar = j1.c.f9675n;
        int i10 = 1;
        f558d = new WrapContentElement(b0Var, new j(fVar, i10), fVar);
        f fVar2 = j1.c.f9674m;
        f559e = new WrapContentElement(b0Var, new j(fVar2, i10), fVar2);
        g gVar = j1.c.f9672k;
        int i11 = 20;
        f560f = new WrapContentElement(b0Var2, new d(i11, gVar), gVar);
        g gVar2 = j1.c.f9671j;
        f561g = new WrapContentElement(b0Var2, new d(i11, gVar2), gVar2);
        h hVar = j1.c.f9666e;
        int i12 = 21;
        f562h = new WrapContentElement(b0Var3, new d(i12, hVar), hVar);
        h hVar2 = j1.c.f9662a;
        f563i = new WrapContentElement(b0Var3, new d(i12, hVar2), hVar2);
    }

    public static final q a(q qVar, float f10, float f11) {
        return qVar.e(new UnspecifiedConstraintsElement(f10, f11));
    }

    public static /* synthetic */ q b(q qVar, float f10, float f11, int i10) {
        if ((i10 & 1) != 0) {
            f10 = Float.NaN;
        }
        if ((i10 & 2) != 0) {
            f11 = Float.NaN;
        }
        return a(qVar, f10, f11);
    }

    public static final q c(q qVar, float f10) {
        return qVar.e(f10 == 1.0f ? f555a : new FillElement(b0.f25089b, f10));
    }

    public static final q d(q qVar, float f10) {
        return qVar.e(new SizeElement(0.0f, f10, 0.0f, f10, 5));
    }

    public static final q e(q qVar, float f10, float f11) {
        return qVar.e(new SizeElement(0.0f, f10, 0.0f, f11, 5));
    }

    public static /* synthetic */ q f(q qVar, float f10, float f11, int i10) {
        if ((i10 & 1) != 0) {
            f10 = Float.NaN;
        }
        if ((i10 & 2) != 0) {
            f11 = Float.NaN;
        }
        return e(qVar, f10, f11);
    }

    public static final q g(q qVar, float f10) {
        return qVar.e(new SizeElement(f10, f10, f10, f10, false));
    }

    public static final q h(q qVar) {
        float f10 = v7.f13773f;
        float f11 = v7.f13774g;
        return qVar.e(new SizeElement(f10, f11, f10, f11, false));
    }

    public static q i(q qVar, float f10, float f11, float f12, float f13, int i10) {
        return qVar.e(new SizeElement(f10, (i10 & 2) != 0 ? Float.NaN : f11, (i10 & 4) != 0 ? Float.NaN : f12, (i10 & 8) != 0 ? Float.NaN : f13, false));
    }

    public static final q j(q qVar, float f10) {
        return qVar.e(new SizeElement(f10, f10, f10, f10, true));
    }

    public static final q k(q qVar, float f10, float f11) {
        return qVar.e(new SizeElement(f10, f11, f10, f11, true));
    }

    public static final q l(q qVar, float f10, float f11, float f12, float f13) {
        return qVar.e(new SizeElement(f10, f11, f12, f13, true));
    }

    public static /* synthetic */ q m(q qVar, float f10, float f11, int i10) {
        float f12 = f4.f12981f;
        if ((i10 & 4) != 0) {
            f12 = Float.NaN;
        }
        return l(qVar, f10, f11, f12, Float.NaN);
    }

    public static final q n(q qVar, float f10) {
        return qVar.e(new SizeElement(f10, 0.0f, f10, 0.0f, 10));
    }

    public static q o(q qVar, float f10, int i10) {
        return qVar.e(new SizeElement((i10 & 1) != 0 ? Float.NaN : f10, 0.0f, (i10 & 2) != 0 ? Float.NaN : androidx.compose.material.a.f669c, 0.0f, 10));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static q p(q qVar) {
        WrapContentElement wrapContentElement;
        g gVar = j1.c.f9671j;
        if (gVar.equals(j1.c.f9672k)) {
            wrapContentElement = f560f;
        } else if (gVar.equals(gVar)) {
            wrapContentElement = f561g;
        } else {
            wrapContentElement = new WrapContentElement(b0.f25088a, new d(20, gVar), gVar);
        }
        return qVar.e(wrapContentElement);
    }

    public static q q(q qVar, h hVar, int i10) {
        WrapContentElement wrapContentElement;
        h hVar2 = j1.c.f9666e;
        if ((i10 & 1) != 0) {
            hVar = hVar2;
        }
        if (hVar.equals(hVar2)) {
            wrapContentElement = f562h;
        } else if (hVar.equals(j1.c.f9662a)) {
            wrapContentElement = f563i;
        } else {
            wrapContentElement = new WrapContentElement(b0.f25090c, new d(21, hVar), hVar);
        }
        return qVar.e(wrapContentElement);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static q r(q qVar, int i10) {
        WrapContentElement wrapContentElement;
        f fVar = j1.c.f9675n;
        if (fVar.equals(fVar)) {
            wrapContentElement = f558d;
        } else if (fVar.equals(j1.c.f9674m)) {
            wrapContentElement = f559e;
        } else {
            wrapContentElement = new WrapContentElement(b0.f25089b, new j(fVar, 1), fVar);
        }
        return qVar.e(wrapContentElement);
    }
}
