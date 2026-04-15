package ee;

import bd.q0;
import pc.f0;
import se.a0;
import se.u0;
import se.w;
import yc.k0;
import yc.r0;
import yc.t0;
import yc.u;
import yc.z;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f6525a = 0;

    static {
        be.c cVar = new be.c("kotlin.jvm.JvmInline");
        cVar.b();
        be.e eVarG = cVar.f2744a.g();
        be.c cVar2 = be.c.f2743c;
        f0.U(eVarG).f2744a.c();
        new be.c("kotlin.jvm.JvmName");
    }

    public static final boolean a(yc.c cVar) {
        r0 r0VarJ0;
        jc.l.e(cVar, "<this>");
        if (!(cVar instanceof q0)) {
            return false;
        }
        k0 k0VarD1 = ((q0) cVar).D1();
        jc.l.d(k0VarD1, "getCorrespondingProperty(...)");
        if (k0VarD1.v0() != null) {
            return false;
        }
        yc.k kVarY = k0VarD1.y();
        yc.e eVar = kVarY instanceof yc.e ? (yc.e) kVarY : null;
        if (eVar == null || (r0VarJ0 = eVar.J0()) == null) {
            return false;
        }
        be.e name = k0VarD1.getName();
        jc.l.d(name, "getName(...)");
        return r0VarJ0.a(name);
    }

    public static final boolean b(yc.k kVar) {
        jc.l.e(kVar, "<this>");
        return (kVar instanceof yc.e) && (((yc.e) kVar).J0() instanceof u);
    }

    public static final boolean c(yc.k kVar) {
        jc.l.e(kVar, "<this>");
        return (kVar instanceof yc.e) && (((yc.e) kVar).J0() instanceof z);
    }

    public static final boolean d(t0 t0Var) {
        if (t0Var.v0() != null) {
            return false;
        }
        yc.k kVarY = t0Var.y();
        be.e eVar = null;
        yc.e eVar2 = kVarY instanceof yc.e ? (yc.e) kVarY : null;
        if (eVar2 != null) {
            int i10 = ie.d.f9520a;
            r0 r0VarJ0 = eVar2.J0();
            u uVar = r0VarJ0 instanceof u ? (u) r0VarJ0 : null;
            if (uVar != null) {
                eVar = uVar.f26148a;
            }
        }
        return jc.l.a(eVar, t0Var.getName());
    }

    public static final boolean e(yc.k kVar) {
        jc.l.e(kVar, "<this>");
        return b(kVar) || c(kVar);
    }

    public static final boolean f(w wVar) {
        yc.h hVarH = wVar.t().h();
        if (hVarH != null) {
            return e(hVarH);
        }
        return false;
    }

    public static final boolean g(w wVar) {
        jc.l.e(wVar, "<this>");
        yc.h hVarH = wVar.t().h();
        return (hVarH == null || !c(hVarH) || u0.e(wVar)) ? false : true;
    }

    public static final a0 h(w wVar) {
        jc.l.e(wVar, "<this>");
        yc.h hVarH = wVar.t().h();
        yc.e eVar = hVarH instanceof yc.e ? (yc.e) hVarH : null;
        if (eVar != null) {
            int i10 = ie.d.f9520a;
            r0 r0VarJ0 = eVar.J0();
            u uVar = r0VarJ0 instanceof u ? (u) r0VarJ0 : null;
            if (uVar != null) {
                return (a0) uVar.f26149b;
            }
        }
        return null;
    }
}
