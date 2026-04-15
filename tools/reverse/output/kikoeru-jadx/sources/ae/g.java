package ae;

import bd.f0;
import ce.i;
import ce.o;
import ce.s;
import j2.h0;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jc.l;
import ub.k;
import vb.m;
import vb.w;
import wd.b0;
import wd.b1;
import wd.j0;
import wd.n;
import wd.t0;
import zd.j;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f324a;

    static {
        i iVar = new i();
        iVar.a(j.f26803a);
        iVar.a(j.f26804b);
        iVar.a(j.f26805c);
        iVar.a(j.f26806d);
        iVar.a(j.f26807e);
        iVar.a(j.f26808f);
        iVar.a(j.f26809g);
        iVar.a(j.f26810h);
        iVar.a(j.f26811i);
        iVar.a(j.f26812j);
        iVar.a(j.f26813k);
        iVar.a(j.f26814l);
        iVar.a(j.f26815m);
        iVar.a(j.f26816n);
        f324a = iVar;
    }

    public static e a(n nVar, yd.f fVar, f0 f0Var) {
        String strF0;
        l.e(nVar, "proto");
        l.e(fVar, "nameResolver");
        l.e(f0Var, "typeTable");
        o oVar = j.f26803a;
        l.d(oVar, "constructorSignature");
        zd.c cVar = (zd.c) w.m(nVar, oVar);
        String string = (cVar == null || (cVar.f26750b & 1) != 1) ? "<init>" : fVar.getString(cVar.f26751c);
        if (cVar == null || (cVar.f26750b & 2) != 2) {
            List list = nVar.f23864e;
            l.d(list, "getValueParameterList(...)");
            List<b1> list2 = list;
            ArrayList arrayList = new ArrayList(vb.n.K(list2, 10));
            for (b1 b1Var : list2) {
                l.b(b1Var);
                String strE = e(ud.e.f0(b1Var, f0Var), fVar);
                if (strE == null) {
                    return null;
                }
                arrayList.add(strE);
            }
            strF0 = m.f0(arrayList, "", "(", ")V", null, 56);
        } else {
            strF0 = fVar.getString(cVar.f26752d);
        }
        return new e(string, strF0);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v2 java.lang.String, still in use, count: 2, list:
          (r4v2 java.lang.String) from 0x0052: IF  (r4v2 java.lang.String) == (null java.lang.String)  -> B:23:0x0054 A[HIDDEN] (LINE:83)
          (r4v2 java.lang.String) from 0x0055: PHI (r4v3 java.lang.String) = (r4v2 java.lang.String), (r4v5 java.lang.String) binds: [B:22:0x0052, B:20:0x0043] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public static ae.d b(wd.j0 r4, yd.f r5, bd.f0 r6, boolean r7) {
        /*
            java.lang.String r0 = "proto"
            jc.l.e(r4, r0)
            java.lang.String r0 = "nameResolver"
            jc.l.e(r5, r0)
            java.lang.String r0 = "typeTable"
            jc.l.e(r6, r0)
            ce.o r0 = zd.j.f26806d
            java.lang.String r1 = "propertySignature"
            jc.l.d(r0, r1)
            java.lang.Object r0 = vb.w.m(r4, r0)
            zd.d r0 = (zd.d) r0
            r1 = 0
            if (r0 != 0) goto L20
            goto L54
        L20:
            int r2 = r0.f26758b
            r3 = 1
            r2 = r2 & r3
            if (r2 != r3) goto L29
            zd.b r0 = r0.f26759c
            goto L2a
        L29:
            r0 = r1
        L2a:
            if (r0 != 0) goto L2f
            if (r7 == 0) goto L2f
            goto L54
        L2f:
            if (r0 == 0) goto L39
            int r7 = r0.f26742b
            r7 = r7 & r3
            if (r7 != r3) goto L39
            int r7 = r0.f26743c
            goto L3b
        L39:
            int r7 = r4.f23781f
        L3b:
            if (r0 == 0) goto L4a
            int r2 = r0.f26742b
            r3 = 2
            r2 = r2 & r3
            if (r2 != r3) goto L4a
            int r4 = r0.f26744d
            java.lang.String r4 = r5.getString(r4)
            goto L55
        L4a:
            wd.t0 r4 = ud.e.V(r4, r6)
            java.lang.String r4 = e(r4, r5)
            if (r4 != 0) goto L55
        L54:
            return r1
        L55:
            ae.d r6 = new ae.d
            java.lang.String r5 = r5.getString(r7)
            r6.<init>(r5, r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ae.g.b(wd.j0, yd.f, bd.f0, boolean):ae.d");
    }

    public static e c(b0 b0Var, yd.f fVar, f0 f0Var) {
        String strN;
        l.e(b0Var, "proto");
        l.e(fVar, "nameResolver");
        l.e(f0Var, "typeTable");
        o oVar = j.f26804b;
        l.d(oVar, "methodSignature");
        zd.c cVar = (zd.c) w.m(b0Var, oVar);
        int i10 = (cVar == null || (cVar.f26750b & 1) != 1) ? b0Var.f23554f : cVar.f26751c;
        if (cVar == null || (cVar.f26750b & 2) != 2) {
            List listY = ud.b.y(ud.e.Q(b0Var, f0Var));
            List list = b0Var.f23564p;
            l.d(list, "getValueParameterList(...)");
            List<b1> list2 = list;
            ArrayList arrayList = new ArrayList(vb.n.K(list2, 10));
            for (b1 b1Var : list2) {
                l.b(b1Var);
                arrayList.add(ud.e.f0(b1Var, f0Var));
            }
            ArrayList arrayListQ0 = m.q0(listY, arrayList);
            ArrayList arrayList2 = new ArrayList(vb.n.K(arrayListQ0, 10));
            Iterator it = arrayListQ0.iterator();
            while (it.hasNext()) {
                String strE = e((t0) it.next(), fVar);
                if (strE == null) {
                    return null;
                }
                arrayList2.add(strE);
            }
            String strE2 = e(ud.e.U(b0Var, f0Var), fVar);
            if (strE2 == null) {
                return null;
            }
            strN = h0.n(new StringBuilder(), m.f0(arrayList2, "", "(", ")", null, 56), strE2);
        } else {
            strN = fVar.getString(cVar.f26752d);
        }
        return new e(fVar.getString(i10), strN);
    }

    public static final boolean d(j0 j0Var) {
        l.e(j0Var, "proto");
        yd.b bVar = c.f315a;
        Object objK = j0Var.k(j.f26807e);
        l.d(objK, "getExtension(...)");
        return bVar.d(((Number) objK).intValue()).booleanValue();
    }

    public static String e(t0 t0Var, yd.f fVar) {
        if (t0Var.p()) {
            return b.b(fVar.a(t0Var.f23956i));
        }
        return null;
    }

    public static final k f(String[] strArr, String[] strArr2) throws s {
        l.e(strArr2, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(a.a(strArr));
        f fVarG = g(byteArrayInputStream, strArr2);
        wd.a aVar = wd.k.H;
        aVar.getClass();
        ce.f fVar = new ce.f(byteArrayInputStream);
        ce.b bVar = (ce.b) aVar.a(fVar, f324a);
        try {
            fVar.a(0);
            ce.c.b(bVar);
            return new k(fVarG, (wd.k) bVar);
        } catch (s e10) {
            e10.f3972a = bVar;
            throw e10;
        }
    }

    public static f g(ByteArrayInputStream byteArrayInputStream, String[] strArr) {
        zd.i iVar = (zd.i) zd.i.f26796h.c(byteArrayInputStream, f324a);
        l.d(iVar, "parseDelimitedFrom(...)");
        return new f(iVar, strArr);
    }

    public static final k h(String[] strArr, String[] strArr2) throws s {
        l.e(strArr, "data");
        l.e(strArr2, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(a.a(strArr));
        f fVarG = g(byteArrayInputStream, strArr2);
        wd.a aVar = wd.f0.f23667l;
        aVar.getClass();
        ce.f fVar = new ce.f(byteArrayInputStream);
        ce.b bVar = (ce.b) aVar.a(fVar, f324a);
        try {
            fVar.a(0);
            ce.c.b(bVar);
            return new k(fVarG, (wd.f0) bVar);
        } catch (s e10) {
            e10.f3972a = bVar;
            throw e10;
        }
    }
}
