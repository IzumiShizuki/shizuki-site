package ee;

import app.nekogram.translator.r;
import bd.a0;
import bd.q0;
import bd.r0;
import bd.s0;
import bd.y0;
import com.tencent.bugly.beta.tinker.TinkerReport;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import le.o;
import qe.s;
import se.f0;
import se.h0;
import se.w;
import yc.k0;
import yc.m0;
import yc.p0;
import yc.t;
import yc.v;
import yc.x;
import yc.y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f6539a = new r(10, "ResolutionAnchorProvider");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r f6540b = new r(10, "StdlibClassFinder");

    public static /* synthetic */ void a(int i10) {
        String str = (i10 == 12 || i10 == 23 || i10 == 25) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 12 || i10 == 23 || i10 == 25) ? 2 : 3];
        switch (i10) {
            case 1:
            case 4:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
            case 14:
            case 16:
            case 18:
            case 31:
            case 33:
            case 35:
                objArr[0] = "annotations";
                break;
            case 2:
            case 5:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                objArr[0] = "parameterAnnotations";
                break;
            case 3:
            case 7:
            case 13:
            case 15:
            case 17:
            default:
                objArr[0] = "propertyDescriptor";
                break;
            case 6:
            case 11:
            case 19:
                objArr[0] = "sourceElement";
                break;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                objArr[0] = "visibility";
                break;
            case 12:
            case 23:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case 20:
                objArr[0] = "containingClass";
                break;
            case 21:
                objArr[0] = "source";
                break;
            case 22:
            case 24:
            case 26:
                objArr[0] = "enumClass";
                break;
            case 27:
            case 28:
            case 29:
                objArr[0] = "descriptor";
                break;
            case 30:
            case 32:
            case 34:
                objArr[0] = "owner";
                break;
        }
        if (i10 == 12) {
            objArr[1] = "createSetter";
        } else if (i10 == 23) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i10 != 25) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i10) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
            case 11:
                objArr[2] = "createSetter";
                break;
            case 12:
            case 23:
            case 25:
                break;
            case 13:
            case 14:
                objArr[2] = "createDefaultGetter";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "createGetter";
                break;
            case 20:
            case 21:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case 22:
                objArr[2] = "createEnumValuesMethod";
                break;
            case 24:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case 26:
                objArr[2] = "createEnumEntriesProperty";
                break;
            case 27:
                objArr[2] = "isEnumValuesMethod";
                break;
            case 28:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case 29:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case 30:
            case 31:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            case 32:
            case 33:
                objArr[2] = "createContextReceiverParameterForCallable";
                break;
            case 34:
            case 35:
                objArr[2] = "createContextReceiverParameterForClass";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 12 && i10 != 23 && i10 != 25) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static final void c(yc.e eVar, LinkedHashSet linkedHashSet, o oVar, boolean z10) {
        for (yc.k kVar : a.a.E(oVar, le.f.f12312o, 2)) {
            if (kVar instanceof yc.e) {
                yc.e eVarD1 = (yc.e) kVar;
                if (eVarD1.c0()) {
                    be.e name = eVarD1.getName();
                    jc.l.d(name, "getName(...)");
                    yc.h hVarA = oVar.a(name, gd.b.f7517d);
                    eVarD1 = hVarA instanceof yc.e ? (yc.e) hVarA : hVarA instanceof p0 ? ((s) ((p0) hVarA)).D1() : null;
                }
                if (eVarD1 != null) {
                    int i10 = e.f6524a;
                    Iterator it = eVarD1.Q().i().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (e.o((w) it.next(), eVar.a())) {
                                linkedHashSet.add(eVarD1);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (z10) {
                        o oVarI0 = eVarD1.I0();
                        jc.l.d(oVarI0, "getUnsubstitutedInnerClassesScope(...)");
                        c(eVar, linkedHashSet, oVarI0, z10);
                    }
                }
            }
        }
    }

    public static a0 e(yc.b bVar, w wVar, be.e eVar, zc.h hVar, int i10) {
        if (bVar == null) {
            a(32);
            throw null;
        }
        if (hVar == null) {
            a(33);
            throw null;
        }
        if (wVar == null) {
            return null;
        }
        me.a aVar = new me.a(bVar, wVar, eVar);
        ef.l lVar = be.f.f2753a;
        return new a0(bVar, aVar, hVar, be.e.e(be.f.f2754b + '_' + i10));
    }

    public static q0 f(k0 k0Var, zc.h hVar) {
        return l(k0Var, hVar, true, k0Var.m());
    }

    public static r0 g(k0 k0Var, zc.h hVar) {
        m0 m0VarM = k0Var.m();
        if (m0VarM != null) {
            return m(k0Var, hVar, zc.g.f26696a, true, k0Var.f(), m0VarM);
        }
        a(6);
        throw null;
    }

    public static bd.p0 h(bd.c cVar) {
        if (cVar == null) {
            a(26);
            throw null;
        }
        y yVarD = e.d(cVar);
        jc.l.e(yVarD, "<this>");
        yc.e eVarD = v.d(yVarD, be.h.A);
        if (eVarD == null) {
            return null;
        }
        ld.o oVar = yc.o.f26129e;
        be.e eVar = vc.o.f22899b;
        m0 m0VarM = cVar.m();
        x xVar = x.f26155b;
        bd.p0 p0VarE1 = bd.p0.E1(cVar, xVar, oVar, false, eVar, 4, m0VarM);
        q0 q0Var = new q0(p0VarE1, zc.g.f26696a, xVar, oVar, false, false, false, 4, null, cVar.m());
        p0VarE1.H1(q0Var, null, null, null);
        h0.f19950b.getClass();
        h0 h0Var = h0.f19951c;
        se.k0 k0VarQ = eVarD.Q();
        List listSingletonList = Collections.singletonList(new f0(cVar.E()));
        jc.l.e(h0Var, "attributes");
        jc.l.e(k0VarQ, "constructor");
        jc.l.e(listSingletonList, "arguments");
        se.a0 a0VarV = se.c.v(listSingletonList, h0Var, k0VarQ, false);
        List list = Collections.EMPTY_LIST;
        p0VarE1.K1(a0VarV, list, null, null, list);
        q0Var.G1(p0VarE1.n());
        return p0VarE1;
    }

    public static s0 i(bd.c cVar) {
        if (cVar == null) {
            a(24);
            throw null;
        }
        s0 s0VarO1 = s0.O1(cVar, vc.o.f22900c, 4, cVar.m());
        y0 y0Var = new y0(s0VarO1, null, 0, zc.g.f26696a, be.e.e("value"), ie.d.e(cVar).u(), false, false, false, null, cVar.m());
        List list = Collections.EMPTY_LIST;
        return s0VarO1.I1(null, null, list, list, Collections.singletonList(y0Var), cVar.E(), x.f26155b, yc.o.f26129e);
    }

    public static s0 j(bd.c cVar) {
        if (cVar == null) {
            a(22);
            throw null;
        }
        s0 s0VarO1 = s0.O1(cVar, vc.o.f22898a, 4, cVar.m());
        List list = Collections.EMPTY_LIST;
        return s0VarO1.I1(null, null, list, list, list, ie.d.e(cVar).h(cVar.E()), x.f26155b, yc.o.f26129e);
    }

    public static a0 k(yc.b bVar, w wVar, zc.h hVar) {
        if (wVar == null) {
            return null;
        }
        return new a0(bVar, new me.b(bVar, wVar), hVar);
    }

    public static q0 l(k0 k0Var, zc.h hVar, boolean z10, m0 m0Var) {
        if (hVar == null) {
            a(18);
            throw null;
        }
        if (m0Var != null) {
            return new q0(k0Var, hVar, k0Var.s(), k0Var.f(), z10, false, false, 1, null, m0Var);
        }
        a(19);
        throw null;
    }

    public static r0 m(k0 k0Var, zc.h hVar, zc.h hVar2, boolean z10, ld.o oVar, m0 m0Var) {
        if (hVar == null) {
            a(8);
            throw null;
        }
        if (hVar2 == null) {
            a(9);
            throw null;
        }
        if (oVar == null) {
            a(10);
            throw null;
        }
        if (m0Var == null) {
            a(11);
            throw null;
        }
        r0 r0Var = new r0(k0Var, hVar, k0Var.s(), oVar, z10, false, false, 1, null, m0Var);
        r0Var.f2664m = r0.F1(r0Var, k0Var.b(), hVar2);
        return r0Var;
    }

    public static boolean n(t tVar) {
        if (tVar.j() != 4) {
            return false;
        }
        yc.k kVarY = tVar.y();
        int i10 = e.f6524a;
        return e.m(kVarY, yc.f.f26111c);
    }

    public static final Collection o(Collection collection, ic.k kVar) {
        jc.l.e(collection, "<this>");
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        int i10 = bf.j.f2808c;
        bf.j jVarE = bf.m.e();
        while (!linkedList.isEmpty()) {
            Object objY = vb.m.Y(linkedList);
            int i11 = bf.j.f2808c;
            bf.j jVarE2 = bf.m.e();
            ArrayList arrayListG = l.g(objY, linkedList, kVar, new bd.a(5, jVarE2));
            if (arrayListG.size() == 1 && jVarE2.isEmpty()) {
                Object objW0 = vb.m.w0(arrayListG);
                jc.l.d(objW0, "single(...)");
                jVarE.add(objW0);
            } else {
                Object objS = l.s(arrayListG, kVar);
                yc.b bVar = (yc.b) kVar.a(objS);
                for (Object obj : arrayListG) {
                    jc.l.b(obj);
                    if (!l.k(bVar, (yc.b) kVar.a(obj))) {
                        jVarE2.add(obj);
                    }
                }
                if (!jVarE2.isEmpty()) {
                    jVarE.addAll(jVarE2);
                }
                jVarE.add(objS);
            }
        }
        return jVarE;
    }

    public abstract void b(yc.c cVar);

    public abstract void d(yc.c cVar, yc.c cVar2);

    public void p(yc.c cVar, Collection collection) {
        jc.l.e(cVar, "member");
        cVar.H0(collection);
    }
}
