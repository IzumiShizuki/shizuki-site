package se;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ue.i f19993a = ue.l.c(ue.k.DONT_CARE, new String[0]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ue.i f19994b = ue.l.c(ue.k.UNINFERRED_LAMBDA_PARAMETER_TYPE, new String[0]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t0 f19995c = new t0("NO_EXPECTED_TYPE");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t0 f19996d = new t0("UNIT_EXPECTED_TYPE");

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(int r27) {
        /*
            Method dump skipped, instruction units count: 774
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: se.u0.a(int):void");
    }

    public static boolean b(w wVar) {
        if (wVar == null) {
            a(28);
            throw null;
        }
        if (wVar.u()) {
            return true;
        }
        return c.m(wVar) && b(((q) wVar.x()).f19979c);
    }

    public static boolean c(w wVar, ic.k kVar, bf.j jVar) {
        if (wVar == null) {
            return false;
        }
        w0 w0VarX = wVar.x();
        if (l(wVar)) {
            return ((Boolean) kVar.a(w0VarX)).booleanValue();
        }
        if (jVar != null && jVar.contains(wVar)) {
            return false;
        }
        if (((Boolean) kVar.a(w0VarX)).booleanValue()) {
            return true;
        }
        if (jVar == null) {
            int i10 = bf.j.f2808c;
            jVar = bf.m.e();
        }
        jVar.add(wVar);
        q qVar = w0VarX instanceof q ? (q) w0VarX : null;
        if (qVar != null && (c(qVar.f19978b, kVar, jVar) || c(qVar.f19979c, kVar, jVar))) {
            return true;
        }
        if ((w0VarX instanceof l) && c(((l) w0VarX).f19968b, kVar, jVar)) {
            return true;
        }
        k0 k0VarT = wVar.t();
        if (k0VarT instanceof v) {
            Iterator it = ((v) k0VarT).f19998b.iterator();
            while (it.hasNext()) {
                if (c((w) it.next(), kVar, jVar)) {
                    return true;
                }
            }
            return false;
        }
        for (n0 n0Var : wVar.q()) {
            if (!n0Var.c()) {
                if (c(n0Var.b(), kVar, jVar)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static List d(List list) {
        if (list == null) {
            a(16);
            throw null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new f0(((yc.q0) it.next()).E()));
        }
        return vb.m.G0(arrayList);
    }

    public static boolean e(w wVar) {
        if (wVar == null) {
            a(27);
            throw null;
        }
        if (!wVar.u() && (!c.m(wVar) || !e(((q) wVar.x()).f19979c))) {
            if (!(wVar.x() instanceof l)) {
                if (f(wVar)) {
                    if (!(wVar.t().h() instanceof yc.e)) {
                        r0 r0VarD = r0.d(wVar);
                        Collection<w> collectionI = wVar.t().i();
                        ArrayList arrayList = new ArrayList(collectionI.size());
                        for (w wVar2 : collectionI) {
                            if (wVar2 == null) {
                                a(21);
                                throw null;
                            }
                            w wVarI = r0VarD.i(wVar2, x0.INVARIANT);
                            w wVarH = wVarI != null ? h(wVarI, wVar.u()) : null;
                            if (wVarH != null) {
                                arrayList.add(wVarH);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (e((w) it.next())) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
                k0 k0VarT = wVar.t();
                if (k0VarT instanceof v) {
                    Iterator it2 = ((v) k0VarT).f19998b.iterator();
                    while (it2.hasNext()) {
                        if (e((w) it2.next())) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static boolean f(w wVar) {
        if (wVar == null) {
            a(60);
            throw null;
        }
        if ((wVar.t().h() instanceof yc.q0 ? (yc.q0) wVar.t().h() : null) != null) {
            return true;
        }
        wVar.t();
        return false;
    }

    public static w0 g(w wVar, boolean z10) {
        if (wVar == null) {
            a(3);
            throw null;
        }
        w0 w0VarZ = wVar.x().z(z10);
        if (w0VarZ != null) {
            return w0VarZ;
        }
        a(4);
        throw null;
    }

    public static w h(w wVar, boolean z10) {
        if (wVar != null) {
            return z10 ? g(wVar, true) : wVar;
        }
        a(8);
        throw null;
    }

    public static a0 i(a0 a0Var, boolean z10) {
        if (a0Var == null) {
            a(5);
            throw null;
        }
        if (!z10) {
            return a0Var;
        }
        a0 a0VarZ = a0Var.z(true);
        if (a0VarZ != null) {
            return a0VarZ;
        }
        a(6);
        throw null;
    }

    public static f0 j(yc.q0 q0Var) {
        if (q0Var != null) {
            return new f0(q0Var);
        }
        a(45);
        throw null;
    }

    public static n0 k(yc.q0 q0Var, qd.a aVar) {
        if (q0Var != null) {
            return aVar.f18138a == s0.f19984a ? new f0(c.y(q0Var)) : new f0(q0Var);
        }
        a(46);
        throw null;
    }

    public static boolean l(w wVar) {
        if (wVar != null) {
            return wVar == f19995c || wVar == f19996d;
        }
        a(0);
        throw null;
    }
}
