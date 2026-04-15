package ud;

import android.net.Uri;
import ce.j0;
import g2.v0;
import g5.w;
import j2.h0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import jc.c0;
import lh.b0;
import q.t0;
import se.n0;
import ug.d0;
import uh.y;
import wf.f0;
import x0.j1;
import x0.p1;
import x0.r0;
import x0.w0;
import ya.f1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {
    public static final Map A(Map map) {
        int size = map.size();
        if (size == 0) {
            return vb.s.f22820a;
        }
        if (size != 1) {
            return Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) vb.m.X(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }

    public static final ve.h B(te.b bVar, ve.d dVar) {
        jc.l.e(bVar, "c");
        jc.l.e(dVar, "<this>");
        return bVar.q0(dVar);
    }

    public static final ve.h C(te.b bVar, ve.e eVar) {
        jc.l.e(bVar, "c");
        jc.l.e(eVar, "<this>");
        return bVar.R(eVar);
    }

    public static Set D(ug.r rVar) {
        int size = rVar.size();
        TreeSet treeSet = null;
        for (int i10 = 0; i10 < size; i10++) {
            if ("Vary".equalsIgnoreCase(rVar.i(i10))) {
                String strK = rVar.k(i10);
                if (treeSet == null) {
                    Comparator comparator = String.CASE_INSENSITIVE_ORDER;
                    jc.l.d(comparator, "CASE_INSENSITIVE_ORDER");
                    treeSet = new TreeSet(comparator);
                }
                Iterator it = ef.n.L0(strK, new char[]{','}).iterator();
                while (it.hasNext()) {
                    treeSet.add(ef.n.X0((String) it.next()).toString());
                }
            }
        }
        return treeSet == null ? vb.t.f22821a : treeSet;
    }

    public static Object E(ic.n nVar, Object obj, yb.c cVar) {
        jc.l.e(nVar, "<this>");
        yb.h hVarS = cVar.s();
        Object dVar = hVarS == yb.i.f26088a ? new zb.d(cVar) : new zb.e(cVar, hVarS);
        c0.c(2, nVar);
        return nVar.q(obj, dVar);
    }

    public static final void a(y yVar, Object obj, j1.q qVar, boolean z10, boolean z11, f1.f fVar, x0.o oVar, int i10) {
        int i11;
        boolean z12;
        jc.l.e(yVar, "state");
        jc.l.e(obj, "key");
        oVar.Y(1129341741);
        if ((i10 & 6) == 0) {
            i11 = (oVar.f(yVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= oVar.h(obj) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= oVar.f(qVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= oVar.g(z10) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            z12 = z11;
            i11 |= oVar.g(z12) ? 16384 : 8192;
        } else {
            z12 = z11;
        }
        if ((196608 & i10) == 0) {
            i11 |= oVar.h(fVar) ? 131072 : 65536;
        }
        if ((74899 & i11) == 74898 && oVar.z()) {
            oVar.Q();
        } else {
            oVar.W(-1931606931);
            Object objK = oVar.K();
            r0 r0Var = x0.k.f24334a;
            if (objK == r0Var) {
                objK = x0.v.v(new p1.b(0L));
                oVar.h0(objK);
            }
            w0 w0Var = (w0) objK;
            oVar.p(false);
            oVar.W(-1931604065);
            Object objK2 = oVar.K();
            if (objK2 == r0Var) {
                objK2 = new cg.c(w0Var, 8);
                oVar.h0(objK2);
            }
            oVar.p(false);
            j1.q qVarD = androidx.compose.ui.layout.a.d(qVar, (ic.k) objK2);
            v0 v0VarD = y.p.d(j1.c.f9662a, false);
            int iQ = x0.v.q(oVar);
            j1 j1VarL = oVar.l();
            j1.q qVarC = j1.a.c(qVarD, oVar);
            i2.k.f8771g0.getClass();
            i2.i iVar = i2.j.f8733b;
            oVar.a0();
            if (oVar.S) {
                oVar.k(iVar);
            } else {
                oVar.k0();
            }
            x0.v.A(i2.j.f8738g, v0VarD, oVar);
            x0.v.A(i2.j.f8737f, j1VarL, oVar);
            i2.h hVar = i2.j.f8741j;
            if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ))) {
                h0.s(iQ, oVar, iQ, hVar);
            }
            x0.v.A(i2.j.f8735d, qVarC, oVar);
            oVar.W(872009262);
            int i12 = i11 & 14;
            boolean zF = (i12 == 4) | oVar.f(obj);
            Object objK3 = oVar.K();
            if (zF || objK3 == r0Var) {
                objK3 = new uh.j(yVar, obj, new a0.n(w0Var, 5));
                oVar.h0(objK3);
            }
            oVar.p(false);
            fVar.l((uh.j) objK3, Boolean.valueOf(z12), oVar, Integer.valueOf((i11 >> 9) & 1008));
            oVar.p(true);
            HashSet hashSet = yVar.f22086q;
            Boolean boolValueOf = Boolean.valueOf(z10);
            oVar.W(-1931590537);
            boolean zH = ((i11 & 7168) == 2048) | (i12 == 4) | oVar.h(obj);
            Object objK4 = oVar.K();
            if (zH || objK4 == r0Var) {
                objK4 = new uh.l(z10, yVar, obj, null);
                oVar.h0(objK4);
            }
            oVar.p(false);
            x0.v.f(hashSet, boolValueOf, (ic.n) objK4, oVar);
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new uh.m(yVar, obj, qVar, z10, z12, fVar, i10);
        }
    }

    public static final ve.g b(te.b bVar, ve.e eVar) {
        jc.l.e(bVar, "c");
        jc.l.e(eVar, "<this>");
        return bVar.t(eVar);
    }

    public static final ve.e c(te.b bVar, ve.d dVar) {
        jc.l.e(bVar, "c");
        jc.l.e(dVar, "<this>");
        return bVar.p(dVar);
    }

    public static String d(int i10, int i11, String str) {
        if (i10 < 0) {
            return ua.j.q("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return ua.j.q("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(t0.B(i11, "negative size: "));
    }

    public static s4.m e(z4.m mVar, String str, z4.j jVar, int i10) {
        Map map = Collections.EMPTY_MAP;
        Uri uriY = p4.c.y(str, jVar.f26432c);
        long j10 = jVar.f26430a;
        long j11 = jVar.f26431b;
        String strA = mVar.a();
        if (strA == null) {
            strA = p4.c.y(((z4.b) mVar.f26438b.get(0)).f26385a, jVar.f26432c).toString();
        }
        String str2 = strA;
        p4.c.k(uriY, "The uri must be set.");
        return new s4.m(uriY, 0L, 1, null, f1.f25977g, j10, j11, str2, i10);
    }

    public static void f(long j10, String str, boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException(ua.j.q(str, Long.valueOf(j10)));
        }
    }

    public static void g(int i10, int i11) {
        String strQ;
        if (i10 < 0 || i10 >= i11) {
            if (i10 < 0) {
                strQ = ua.j.q("%s (%s) must not be negative", "index", Integer.valueOf(i10));
            } else {
                if (i11 < 0) {
                    throw new IllegalArgumentException(t0.B(i11, "negative size: "));
                }
                strQ = ua.j.q("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
            }
            throw new IndexOutOfBoundsException(strQ);
        }
    }

    public static void h(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void i(int i10, int i11) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(d(i10, i11, "index"));
        }
    }

    public static void j(int i10, int i11, int i12) {
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            throw new IndexOutOfBoundsException((i10 < 0 || i10 > i12) ? d(i10, i12, "start index") : (i11 < 0 || i11 > i12) ? d(i11, i12, "end index") : ua.j.q("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static yb.c k(ic.n nVar, yb.c cVar, yb.c cVar2) {
        jc.l.e(nVar, "<this>");
        if (nVar instanceof ac.a) {
            return ((ac.a) nVar).o(cVar, cVar2);
        }
        yb.h hVarS = cVar2.s();
        return hVarS == yb.i.f26088a ? new zb.b(nVar, cVar2, cVar) : new zb.c(cVar2, hVarS, nVar, cVar);
    }

    public static final boolean l(String str, String str2) {
        jc.l.e(str, "current");
        if (str.equals(str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (i10 < str.length()) {
                    char cCharAt = str.charAt(i10);
                    int i13 = i12 + 1;
                    if (i12 == 0 && cCharAt != '(') {
                        break;
                    }
                    if (cCharAt == '(') {
                        i11++;
                    } else if (cCharAt == ')' && i11 - 1 == 0 && i12 != str.length() - 1) {
                        break;
                    }
                    i10++;
                    i12 = i13;
                } else if (i11 == 0) {
                    String strSubstring = str.substring(1, str.length() - 1);
                    jc.l.d(strSubstring, "substring(...)");
                    return jc.l.a(ef.n.X0(strSubstring).toString(), str2);
                }
            }
        }
        return false;
    }

    public static final String m(Collection collection) {
        jc.l.e(collection, "collection");
        if (collection.isEmpty()) {
            return " }";
        }
        return ef.o.Y(vb.m.f0(collection, ",\n", "\n", "\n", null, 56)) + "},";
    }

    public static t n(android.support.v4.media.session.b bVar) {
        if (bVar instanceof ae.e) {
            ae.e eVar = (ae.e) bVar;
            String str = eVar.f318e;
            String str2 = eVar.f319f;
            jc.l.e(str, "name");
            jc.l.e(str2, "desc");
            return new t(str.concat(str2));
        }
        if (!(bVar instanceof ae.d)) {
            throw new j0();
        }
        ae.d dVar = (ae.d) bVar;
        String str3 = dVar.f316e;
        String str4 = dVar.f317f;
        jc.l.e(str3, "name");
        jc.l.e(str4, "desc");
        return new t(str3 + '#' + str4);
    }

    public static final ve.d o(te.b bVar, n0 n0Var) {
        jc.l.e(bVar, "c");
        jc.l.e(n0Var, "<this>");
        return bVar.N0(n0Var);
    }

    public static yb.c p(yb.c cVar) {
        jc.l.e(cVar, "<this>");
        ac.c cVar2 = cVar instanceof ac.c ? (ac.c) cVar : null;
        if (cVar2 == null || (cVar = cVar2.f303c) != null) {
            return cVar;
        }
        yb.e eVar = (yb.e) cVar2.s().R(yb.d.f26087a);
        yb.c gVar = eVar != null ? new nf.g((hf.u) eVar, cVar2) : cVar2;
        cVar2.f303c = gVar;
        return gVar;
    }

    public static final boolean q(te.b bVar, ve.e eVar) {
        jc.l.e(bVar, "c");
        jc.l.e(eVar, "<this>");
        return bVar.e0(eVar);
    }

    public static String r(ug.t tVar) {
        jc.l.e(tVar, "url");
        lh.i iVar = lh.i.f12572d;
        return w.t(tVar.f21876h).c("MD5").e();
    }

    public static final void s(String str) {
        jc.l.e(str, "key");
        throw new IllegalArgumentException(t0.D("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }

    public static final ve.e t(te.b bVar, ve.d dVar) {
        jc.l.e(bVar, "c");
        jc.l.e(dVar, "<this>");
        return bVar.v0(dVar);
    }

    public static final int u(te.b bVar, ve.h hVar) {
        jc.l.e(bVar, "c");
        jc.l.e(hVar, "<this>");
        return bVar.f(hVar);
    }

    public static final void v(i4.d dVar, String str, Integer num) {
        jc.l.e(dVar, "<this>");
        f0 f0Var = xf.n.f25012a;
        dVar.d(str, new xf.s(num, false));
    }

    public static final void w(i4.d dVar, String str, String str2) {
        jc.l.e(dVar, "<this>");
        dVar.d(str, xf.n.a(str2));
    }

    public static int x(b0 b0Var) throws IOException {
        byte bK;
        try {
            lh.f fVar = b0Var.f12545b;
            b0Var.a0(1L);
            long j10 = 0;
            while (true) {
                long j11 = j10 + 1;
                if (!b0Var.P(j11)) {
                    break;
                }
                bK = fVar.k(j10);
                if ((bK < 48 || bK > 57) && (j10 != 0 || bK != 45)) {
                    break;
                }
                j10 = j11;
            }
            if (j10 == 0) {
                gh.g.j(16);
                String string = Integer.toString(bK, 16);
                jc.l.d(string, "toString(...)");
                throw new NumberFormatException("Expected a digit or '-' but was 0x".concat(string));
            }
            long jY = fVar.y();
            String strX = b0Var.x(Long.MAX_VALUE);
            if (jY >= 0 && jY <= 2147483647L && strX.length() <= 0) {
                return (int) jY;
            }
            throw new IOException("expected an int but was \"" + jY + strX + '\"');
        } catch (NumberFormatException e10) {
            throw new IOException(e10.getMessage());
        }
    }

    public static final d0 y(d0 d0Var) {
        jc.l.e(d0Var, "<this>");
        ug.c0 c0VarG = d0Var.g();
        ug.f0 f0Var = d0Var.f21762g;
        c0VarG.f21735g = new wg.c(f0Var.i(), f0Var.g());
        return c0VarG.a();
    }

    public static final List z(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? Collections.unmodifiableList(new ArrayList(list)) : Collections.singletonList(vb.m.Y(list)) : vb.r.f22819a;
    }
}
