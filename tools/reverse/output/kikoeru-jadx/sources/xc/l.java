package xc;

import bd.h0;
import bd.r;
import bd.s0;
import bd.y0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import jc.s;
import jc.z;
import n7.b0;
import pc.u;
import q.t0;
import se.a0;
import se.p0;
import se.r0;
import se.y;
import vb.t;
import vb.w;
import x0.h1;
import yc.v;
import yc.x;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l implements ad.b, ad.d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ u[] f24942h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f24943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final re.i f24944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f24945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final re.i f24946d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final re.e f24947e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final re.i f24948f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final re.e f24949g;

    static {
        s sVar = new s(l.class, "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;", 0);
        jc.a0 a0Var = z.f10839a;
        f24942h = new u[]{a0Var.g(sVar), t0.H(l.class, "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;", 0, a0Var), t0.H(l.class, "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;", 0, a0Var)};
    }

    public l(h0 h0Var, re.l lVar, h1 h1Var) {
        this.f24943a = h0Var;
        this.f24944b = new re.i(lVar, h1Var);
        r rVar = new r(h0Var, new be.c("java.io"), 1);
        List listW = ud.b.w(new y(lVar, new j(this, 1)));
        bd.n nVar = new bd.n(rVar, be.e.e("Serializable"), x.f26158e, yc.f.f26110b, listW, lVar);
        nVar.q(le.n.f12335b, t.f22821a, null);
        this.f24945c = nVar.E();
        this.f24946d = new re.i(lVar, new bd.i(21, this, lVar, false));
        this.f24947e = new re.e(lVar, new ConcurrentHashMap(3, 1.0f, 2), new re.f(), 0);
        this.f24948f = new re.i(lVar, new j(this, 0));
        this.f24949g = lVar.b(new x0.t0(1, this));
    }

    @Override // ad.b
    public final Collection a(yc.e eVar) {
        yc.e eVarB;
        if (eVar.j() == yc.f.f26109a) {
            g().getClass();
            pd.i iVarF = f(eVar);
            if (iVarF != null && (eVarB = e.b(ie.d.g(iVarF), b.f24901f)) != null) {
                r0 r0Var = new r0(w.g(eVarB, iVarF));
                List list = (List) iVarF.f17034q.f17057q.b();
                ArrayList<bd.l> arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    bd.l lVar = (bd.l) next;
                    bd.l lVar2 = lVar;
                    if (lVar2.f().f12236a.f26108b) {
                        Collection collectionT = eVarB.T();
                        jc.l.d(collectionT, "getConstructors(...)");
                        Collection<bd.l> collection = collectionT;
                        if (!(collection instanceof Collection) || !collection.isEmpty()) {
                            for (bd.l lVar3 : collection) {
                                jc.l.b(lVar3);
                                if (ee.l.j(lVar3, lVar.h(r0Var)) == 1) {
                                    break;
                                }
                            }
                        }
                        if (lVar2.o0().size() == 1) {
                            List listO0 = lVar2.o0();
                            jc.l.d(listO0, "getValueParameters(...)");
                            yc.h hVarH = ((y0) vb.m.x0(listO0)).b().t().h();
                            if (jc.l.a(hVarH != null ? ie.d.h(hVarH) : null, ie.d.h(eVar))) {
                            }
                        }
                        if (!vc.i.C(lVar) && !o.f24961f.contains(ua.j.y(iVarF, ua.l.J(lVar, 3)))) {
                            arrayList.add(next);
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList(vb.n.K(arrayList, 10));
                for (bd.l lVar4 : arrayList) {
                    bd.l lVar5 = lVar4;
                    lVar5.getClass();
                    bd.y yVarJ1 = lVar5.J1(r0.f19980b);
                    yVarJ1.f2686b = eVar;
                    yVarJ1.p(eVar.E());
                    yVarJ1.f2699o = true;
                    p0 p0VarF = r0Var.f();
                    if (p0VarF == null) {
                        bd.y.a(37);
                        throw null;
                    }
                    yVarJ1.f2685a = p0VarF;
                    if (!o.f24962g.contains(ua.j.y(iVarF, ua.l.J(lVar4, 3)))) {
                        yVarJ1.q((zc.h) b0.r(this.f24948f, f24942h[2]));
                    }
                    bd.z zVarG1 = yVarJ1.f2708x.G1(yVarJ1);
                    jc.l.c(zVarG1, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor");
                    arrayList2.add((bd.l) zVarG1);
                }
                return arrayList2;
            }
        }
        return vb.r.f22819a;
    }

    @Override // ad.b
    public final Collection b(yc.e eVar) {
        Set setC;
        jc.l.e(eVar, "classDescriptor");
        g().getClass();
        pd.i iVarF = f(eVar);
        if (iVarF == null || (setC = iVarF.q().c()) == null) {
            setC = t.f22821a;
        }
        return setC;
    }

    @Override // ad.b
    public final Collection c(yc.e eVar) {
        be.d dVarH = ie.d.h(eVar);
        LinkedHashSet linkedHashSet = o.f24956a;
        be.d dVar = vc.n.f22877g;
        boolean zEquals = dVarH.equals(dVar);
        boolean zIsAssignableFrom = false;
        a0 a0Var = this.f24945c;
        if (!zEquals) {
            HashMap map = vc.n.f22878g0;
            if (map.get(dVarH) == null) {
                if (dVarH.equals(dVar) || map.get(dVarH) != null) {
                    zIsAssignableFrom = true;
                } else {
                    String str = d.f24905a;
                    be.b bVarF = d.f(dVarH);
                    if (bVarF != null) {
                        try {
                            zIsAssignableFrom = Serializable.class.isAssignableFrom(Class.forName(bVarF.a().f2744a.f2747a));
                        } catch (ClassNotFoundException unused) {
                        }
                    }
                }
                return zIsAssignableFrom ? ud.b.w(a0Var) : vb.r.f22819a;
            }
        }
        return ud.b.x((a0) b0.r(this.f24946d, f24942h[1]), a0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c8 A[EDGE_INSN: B:142:0x01c8->B:61:0x01c8 BREAK  A[LOOP:4: B:74:0x01f5->B:143:?]] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x024d  */
    @Override // ad.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Collection d(be.e r18, yc.e r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 898
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xc.l.d(be.e, yc.e):java.util.Collection");
    }

    @Override // ad.d
    public final boolean e(yc.e eVar, qe.r rVar) {
        jc.l.e(eVar, "classDescriptor");
        pd.i iVarF = f(eVar);
        if (iVarF == null || !rVar.getAnnotations().f(ad.e.f312a)) {
            return true;
        }
        g().getClass();
        String strJ = ua.l.J(rVar, 3);
        pd.n nVarQ = iVarF.q();
        be.e name = rVar.getName();
        jc.l.d(name, "getName(...)");
        Collection collectionF = nVarQ.f(name, gd.b.f7514a);
        if ((collectionF instanceof Collection) && collectionF.isEmpty()) {
            return false;
        }
        Iterator it = collectionF.iterator();
        while (it.hasNext()) {
            if (jc.l.a(ua.l.J((s0) it.next(), 3), strJ)) {
                return true;
            }
        }
        return false;
    }

    public final pd.i f(yc.e eVar) {
        be.c cVarA;
        if (eVar == null) {
            vc.i.a(108);
            throw null;
        }
        if (!vc.i.b(eVar, vc.n.f22865a) && vc.i.I(eVar)) {
            be.d dVarH = ie.d.h(eVar);
            if (dVarH.d()) {
                String str = d.f24905a;
                be.b bVarF = d.f(dVarH);
                if (bVarF != null && (cVarA = bVarF.a()) != null) {
                    yc.e eVarJ = v.j(g().f24930a, cVarA);
                    if (eVarJ instanceof pd.i) {
                        return (pd.i) eVarJ;
                    }
                }
            }
        }
        return null;
    }

    public final h g() {
        return (h) b0.r(this.f24944b, f24942h[0]);
    }
}
