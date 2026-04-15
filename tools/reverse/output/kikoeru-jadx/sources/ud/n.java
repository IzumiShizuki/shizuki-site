package ud;

import android.database.SQLException;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.widget.EdgeEffect;
import ce.j0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jc.z;
import r.y1;
import se.a0;
import se.n0;
import se.r0;
import se.u0;
import se.w;
import se.x0;
import wd.g1;
import y0.k0;
import yc.q0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21600a;

    public /* synthetic */ n(int i10) {
        this.f21600a = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final se.w A(se.w r9, java.util.ArrayList r10) {
        /*
            java.util.List r0 = r9.q()
            r0.size()
            r10.size()
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = vb.n.K(r10, r1)
            r0.<init>(r1)
            java.util.Iterator r10 = r10.iterator()
        L19:
            boolean r1 = r10.hasNext()
            r2 = 0
            if (r1 == 0) goto L97
            java.lang.Object r1 = r10.next()
            xe.d r1 = (xe.d) r1
            r1.getClass()
            se.w r3 = r1.f24981c
            se.w r4 = r1.f24980b
            yc.q0 r1 = r1.f24979a
            te.l r5 = te.d.f20724a
            r5.b(r4, r3)
            boolean r5 = jc.l.a(r4, r3)
            if (r5 != 0) goto L8e
            se.x0 r5 = r1.e0()
            se.x0 r6 = se.x0.IN_VARIANCE
            if (r5 != r6) goto L43
            goto L8e
        L43:
            boolean r5 = vc.i.E(r4)
            se.x0 r7 = se.x0.OUT_VARIANCE
            se.x0 r8 = se.x0.INVARIANT
            if (r5 == 0) goto L60
            se.x0 r5 = r1.e0()
            if (r5 == r6) goto L60
            se.f0 r2 = new se.f0
            se.x0 r1 = r1.e0()
            if (r7 != r1) goto L5c
            r7 = r8
        L5c:
            r2.<init>(r3, r7)
            goto L93
        L60:
            if (r3 == 0) goto L88
            boolean r2 = vc.i.x(r3)
            if (r2 == 0) goto L7b
            boolean r2 = r3.u()
            if (r2 == 0) goto L7b
            se.f0 r2 = new se.f0
            se.x0 r1 = r1.e0()
            if (r6 != r1) goto L77
            r6 = r8
        L77:
            r2.<init>(r4, r6)
            goto L93
        L7b:
            se.f0 r2 = new se.f0
            se.x0 r1 = r1.e0()
            if (r7 != r1) goto L84
            r7 = r8
        L84:
            r2.<init>(r3, r7)
            goto L93
        L88:
            r9 = 140(0x8c, float:1.96E-43)
            vc.i.a(r9)
            throw r2
        L8e:
            se.f0 r2 = new se.f0
            r2.<init>(r4)
        L93:
            r0.add(r2)
            goto L19
        L97:
            r10 = 6
            se.w r9 = se.c.r(r9, r0, r2, r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ud.n.A(se.w, java.util.ArrayList):se.w");
    }

    public static final void B(k0 k0Var, int i10, Object obj) {
        k0Var.f25332e[(k0Var.f25333f - k0Var.f25328a[k0Var.f25329b - 1].f25325c) + i10] = obj;
    }

    public static final void C(k0 k0Var, int i10, Object obj, int i11, Object obj2) {
        int i12 = k0Var.f25333f - k0Var.f25328a[k0Var.f25329b - 1].f25325c;
        Object[] objArr = k0Var.f25332e;
        objArr[i10 + i12] = obj;
        objArr[i12 + i11] = obj2;
    }

    public static final void D(int i10, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Error code: " + i10);
        if (str != null) {
            sb.append(", message: ".concat(str));
        }
        throw new SQLException(sb.toString());
    }

    public static final xe.a a(w wVar) {
        xe.d dVar;
        jc.l.e(wVar, "type");
        if (se.c.m(wVar)) {
            xe.a aVarA = a(se.c.n(wVar));
            xe.a aVarA2 = a(se.c.G(wVar));
            return new xe.a(se.c.j(se.c.g(se.c.n((w) aVarA.f24976a), se.c.G((w) aVarA2.f24976a)), wVar), se.c.j(se.c.g(se.c.n((w) aVarA.f24977b), se.c.G((w) aVarA2.f24977b)), wVar));
        }
        se.k0 k0VarT = wVar.t();
        boolean z10 = true;
        if (wVar.t() instanceof fe.b) {
            jc.l.c(k0VarT, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor");
            n0 n0VarA = ((fe.b) k0VarT).a();
            w wVarB = n0VarA.b();
            jc.l.d(wVarB, "getType(...)");
            w wVarH = u0.h(wVarB, wVar.u());
            jc.l.d(wVarH, "makeNullableIfNeeded(...)");
            int iOrdinal = n0VarA.a().ordinal();
            if (iOrdinal == 1) {
                return new xe.a(wVarH, e.w(wVar).o());
            }
            if (iOrdinal == 2) {
                w wVarH2 = u0.h(e.w(wVar).n(), wVar.u());
                jc.l.d(wVarH2, "makeNullableIfNeeded(...)");
                return new xe.a(wVarH2, wVarH);
            }
            throw new AssertionError("Only nontrivial projections should have been captured, not: " + n0VarA);
        }
        if (wVar.q().isEmpty() || wVar.q().size() != k0VarT.o().size()) {
            return new xe.a(wVar, wVar);
        }
        ArrayList<xe.d> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List listQ = wVar.q();
        List listO = k0VarT.o();
        jc.l.d(listO, "getParameters(...)");
        for (ub.k kVar : vb.m.M0(listQ, listO)) {
            n0 n0Var = (n0) kVar.f21543a;
            q0 q0Var = (q0) kVar.f21544b;
            jc.l.b(q0Var);
            x0 x0VarE0 = q0Var.e0();
            if (x0VarE0 == null) {
                r0.a(35);
                throw null;
            }
            if (n0Var == null) {
                r0.a(36);
                throw null;
            }
            r0 r0Var = r0.f19980b;
            int iOrdinal2 = (n0Var.c() ? x0.OUT_VARIANCE : r0.b(x0VarE0, n0Var.a())).ordinal();
            if (iOrdinal2 == 0) {
                w wVarB2 = n0Var.b();
                jc.l.d(wVarB2, "getType(...)");
                w wVarB3 = n0Var.b();
                jc.l.d(wVarB3, "getType(...)");
                dVar = new xe.d(q0Var, wVarB2, wVarB3);
            } else if (iOrdinal2 == 1) {
                w wVarB4 = n0Var.b();
                jc.l.d(wVarB4, "getType(...)");
                dVar = new xe.d(q0Var, wVarB4, ie.d.e(q0Var).o());
            } else {
                if (iOrdinal2 != 2) {
                    throw new j0();
                }
                a0 a0VarN = ie.d.e(q0Var).n();
                w wVarB5 = n0Var.b();
                jc.l.d(wVarB5, "getType(...)");
                dVar = new xe.d(q0Var, a0VarN, wVarB5);
            }
            if (n0Var.c()) {
                arrayList.add(dVar);
                arrayList2.add(dVar);
            } else {
                xe.a aVarA3 = a(dVar.f24980b);
                w wVar2 = (w) aVarA3.f24976a;
                w wVar3 = (w) aVarA3.f24977b;
                xe.a aVarA4 = a(dVar.f24981c);
                w wVar4 = (w) aVarA4.f24976a;
                w wVar5 = (w) aVarA4.f24977b;
                q0 q0Var2 = dVar.f24979a;
                xe.d dVar2 = new xe.d(q0Var2, wVar3, wVar4);
                xe.d dVar3 = new xe.d(q0Var2, wVar2, wVar5);
                arrayList.add(dVar2);
                arrayList2.add(dVar3);
            }
        }
        if (arrayList.isEmpty()) {
            z10 = false;
        } else {
            for (xe.d dVar4 : arrayList) {
                dVar4.getClass();
                if (!te.d.f20724a.b(dVar4.f24980b, dVar4.f24981c)) {
                    break;
                }
            }
            z10 = false;
        }
        return new xe.a(z10 ? e.w(wVar).n() : A(wVar, arrayList), A(wVar, arrayList2));
    }

    public static final int b(w wVar) {
        jc.l.e(wVar, "<this>");
        zc.b bVarE = wVar.getAnnotations().e(vc.n.f22888q);
        if (bVarE == null) {
            return 0;
        }
        ge.g gVar = (ge.g) vb.w.r(vc.o.f22902e, bVarE.c());
        jc.l.c(gVar, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.constants.IntValue");
        return ((Number) ((ge.k) gVar).f7527a).intValue();
    }

    public static yd.i c(g1 g1Var) {
        jc.l.e(g1Var, "table");
        if (g1Var.f23701b.size() == 0) {
            return yd.i.f26206b;
        }
        List list = g1Var.f23701b;
        jc.l.d(list, "getRequirementList(...)");
        return new yd.i(list);
    }

    public static final a0 d(vc.i iVar, zc.h hVar, w wVar, List list, ArrayList arrayList, w wVar2, boolean z10) {
        yc.e eVarK;
        int i10 = 0;
        ArrayList arrayList2 = new ArrayList(list.size() + arrayList.size() + (wVar != null ? 1 : 0) + 1);
        List list2 = list;
        ArrayList arrayList3 = new ArrayList(vb.n.K(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList3.add(e.b((w) it.next()));
        }
        arrayList2.addAll(arrayList3);
        bf.m.a(arrayList2, wVar != null ? e.b(wVar) : null);
        int i11 = 0;
        for (Object obj : arrayList) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                b.H();
                throw null;
            }
            arrayList2.add(e.b((w) obj));
            i11 = i12;
        }
        arrayList2.add(e.b(wVar2));
        int size = list.size() + arrayList.size() + (wVar == null ? 0 : 1);
        if (z10) {
            eVarK = iVar.v(size);
        } else {
            be.e eVar = vc.o.f22898a;
            eVarK = iVar.k("Function" + size);
        }
        zc.h iVar2 = zc.g.f26696a;
        if (wVar != null) {
            be.c cVar = vc.n.f22887p;
            if (!hVar.f(cVar)) {
                ArrayList arrayListP0 = vb.m.p0(hVar, new zc.j(iVar, cVar, vb.s.f22820a));
                hVar = arrayListP0.isEmpty() ? iVar2 : new zc.i(i10, arrayListP0);
            }
        }
        if (!list.isEmpty()) {
            int size2 = list.size();
            be.c cVar2 = vc.n.f22888q;
            if (!hVar.f(cVar2)) {
                ArrayList arrayListP02 = vb.m.p0(hVar, new zc.j(iVar, cVar2, vb.w.u(new ub.k(vc.o.f22902e, new ge.k(size2)))));
                if (!arrayListP02.isEmpty()) {
                    iVar2 = new zc.i(i10, arrayListP02);
                }
                hVar = iVar2;
            }
        }
        return se.c.u(se.c.E(hVar), eVarK, arrayList2);
    }

    public static j1.q e(uh.j jVar, ic.k kVar, ic.a aVar, int i10) {
        if ((i10 & 4) != 0) {
            kVar = uh.h.f22003c;
        }
        if ((i10 & 8) != 0) {
            aVar = uh.i.f22006c;
        }
        jVar.getClass();
        jc.l.e(kVar, "onDragStarted");
        jc.l.e(aVar, "onDragStopped");
        return new j1.k(new cg.h(jVar, kVar, aVar, 1));
    }

    public static boolean f(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static final void g(z7.a aVar, String str) {
        jc.l.e(aVar, "<this>");
        jc.l.e(str, "sql");
        z7.c cVarD0 = aVar.d0(str);
        try {
            cVarD0.Z();
            gh.g.m(cVarD0, null);
        } finally {
        }
    }

    public static final be.e h(w wVar) {
        String str;
        zc.b bVarE = wVar.getAnnotations().e(vc.n.f22889r);
        if (bVarE != null) {
            Object objY0 = vb.m.y0(bVarE.c().values());
            ge.w wVar2 = objY0 instanceof ge.w ? (ge.w) objY0 : null;
            if (wVar2 != null && (str = (String) wVar2.f7527a) != null) {
                if (!be.e.f(str)) {
                    str = null;
                }
                if (str != null) {
                    return be.e.e(str);
                }
            }
        }
        return null;
    }

    public static final dd.c i(dd.b bVar, be.b bVar2, yd.e eVar) {
        jc.l.e(bVar, "<this>");
        jc.l.e(bVar2, "classId");
        jc.l.e(eVar, "metadataVersion");
        y1 y1VarA = bVar.a(bVar2, eVar);
        if (y1VarA != null) {
            return (dd.c) y1VarA.f18634b;
        }
        return null;
    }

    public static final int j(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (Exception unused) {
                int height = bitmap.getHeight() * bitmap.getWidth();
                Bitmap.Config config = bitmap.getConfig();
                return height * (config == Bitmap.Config.ALPHA_8 ? 1 : (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) ? 2 : (Build.VERSION.SDK_INT < 26 || config != Bitmap.Config.RGBA_F16) ? 4 : 8);
            }
        }
        throw new IllegalStateException(("Cannot obtain size for recycled bitmap: " + bitmap + " [" + bitmap.getWidth() + " x " + bitmap.getHeight() + "] + " + bitmap.getConfig()).toString());
    }

    public static final List k(w wVar) {
        jc.l.e(wVar, "<this>");
        s(wVar);
        int iB = b(wVar);
        if (iB == 0) {
            return vb.r.f22819a;
        }
        List listSubList = wVar.q().subList(0, iB);
        ArrayList arrayList = new ArrayList(vb.n.K(listSubList, 10));
        Iterator it = listSubList.iterator();
        while (it.hasNext()) {
            arrayList.add(((n0) it.next()).b());
        }
        return arrayList;
    }

    public static float l(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return y3.b.a(edgeEffect);
        }
        return 0.0f;
    }

    public static final wc.k m(be.d dVar) {
        if (!dVar.d() || dVar.c()) {
            return null;
        }
        wc.m mVar = wc.m.f23513b;
        be.c cVarB = dVar.i().b();
        String strB = dVar.g().b();
        jc.l.d(strB, "asString(...)");
        mVar.getClass();
        wc.l lVarA = mVar.a(cVarB, strB);
        if (lVarA != null) {
            return lVarA.f23511a;
        }
        return null;
    }

    public static final int n(String str, Bundle bundle) {
        int i10 = bundle.getInt(str, Integer.MIN_VALUE);
        if (i10 != Integer.MIN_VALUE || bundle.getInt(str, Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i10;
        }
        s.s(str);
        throw null;
    }

    public static final w o(w wVar) {
        jc.l.e(wVar, "<this>");
        s(wVar);
        if (wVar.getAnnotations().e(vc.n.f22887p) == null) {
            return null;
        }
        return ((n0) wVar.q().get(b(wVar))).b();
    }

    public static final Bundle p(String str, Bundle bundle) {
        jc.l.e(str, "key");
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        s.s(str);
        throw null;
    }

    public static final ArrayList q(String str, Bundle bundle) {
        jc.l.e(str, "key");
        ArrayList arrayListC = Build.VERSION.SDK_INT >= 34 ? d.j.c(bundle, str, g8.a.D(z.f10839a.b(Bundle.class))) : bundle.getParcelableArrayList(str);
        if (arrayListC != null) {
            return arrayListC;
        }
        s.s(str);
        throw null;
    }

    public static final List r(w wVar) {
        jc.l.e(wVar, "<this>");
        s(wVar);
        List listQ = wVar.q();
        return listQ.subList(((!s(wVar) || wVar.getAnnotations().e(vc.n.f22887p) == null) ? 0 : 1) + b(wVar), listQ.size() - 1);
    }

    public static final boolean s(w wVar) {
        jc.l.e(wVar, "<this>");
        yc.h hVarH = wVar.t().h();
        if (hVarH == null) {
            return false;
        }
        wc.k kVarM = ((hVarH instanceof yc.e) && vc.i.I(hVarH)) ? m(ie.d.h(hVarH)) : null;
        return jc.l.a(kVarM, wc.g.f23505c) || jc.l.a(kVarM, wc.j.f23508c);
    }

    public static final boolean t(Bitmap.Config config) {
        return Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE;
    }

    public static final boolean u(String str, Bundle bundle) {
        jc.l.e(str, "key");
        return bundle.containsKey(str) && bundle.get(str) == null;
    }

    public static boolean v(int i10) {
        int type = Character.getType(i10);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final boolean w(w wVar) {
        jc.l.e(wVar, "<this>");
        yc.h hVarH = wVar.t().h();
        wc.k kVarM = null;
        if (hVarH != null && (hVarH instanceof yc.e) && vc.i.I(hVarH)) {
            kVarM = m(ie.d.h(hVarH));
        }
        return jc.l.a(kVarM, wc.j.f23508c);
    }

    public static float x(EdgeEffect edgeEffect, float f10, float f11) {
        if (Build.VERSION.SDK_INT >= 31) {
            return y3.b.b(edgeEffect, f10, f11);
        }
        y3.a.a(edgeEffect, f10, f11);
        return f10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x01df, code lost:
    
        r0 = ud.e.c(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01e3, code lost:
    
        gh.g.m(r2, null);
        r10 = r0;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static v7.i z(z7.a r29, java.lang.String r30) {
        /*
            Method dump skipped, instruction units count: 517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ud.n.z(z7.a, java.lang.String):v7.i");
    }

    public int hashCode() {
        switch (this.f21600a) {
            case 1:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.f21600a) {
            case 1:
                String strY = z.f10839a.b(getClass()).y();
                jc.l.b(strY);
                return strY;
            default:
                return super.toString();
        }
    }

    public abstract n y(pc.c cVar, Object obj);
}
