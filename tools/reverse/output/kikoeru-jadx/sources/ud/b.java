package ud;

import android.view.inputmethod.ExtractedText;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import o.k0;
import o.l0;
import o.s0;
import q.t0;
import u.e1;
import ug.h0;
import x0.q2;
import x0.r0;
import x0.w0;
import y2.y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static ArrayList A(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new vb.i(objArr, true));
    }

    public static final List B(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? list : w(list.get(0)) : vb.r.f22819a;
    }

    public static yb.h C(yb.f fVar, yb.h hVar) {
        jc.l.e(hVar, "context");
        return hVar == yb.i.f26088a ? fVar : (yb.h) hVar.y(new q2(4), fVar);
    }

    public static final void D(int i10, int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException(t0.C(i11, "fromIndex (0) is greater than toIndex (", ")."));
        }
        if (i11 <= i10) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i11 + ") is greater than size (" + i10 + ").");
    }

    public static final boolean E(k0 k0Var, Object obj, Object obj2) {
        Object objG = k0Var.g(obj);
        if (objG == null) {
            return false;
        }
        if (!(objG instanceof l0)) {
            if (!objG.equals(obj2)) {
                return false;
            }
            k0Var.k(obj);
            return true;
        }
        l0 l0Var = (l0) objG;
        boolean zL = l0Var.l(obj2);
        if (zL && l0Var.g()) {
            k0Var.k(obj);
        }
        return zL;
    }

    public static final void F(k0 k0Var, Object obj) {
        boolean zG;
        long[] jArr = k0Var.f15995a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        Object obj2 = k0Var.f15996b[i13];
                        Object obj3 = k0Var.f15997c[i13];
                        if (obj3 instanceof l0) {
                            l0 l0Var = (l0) obj3;
                            l0Var.l(obj);
                            zG = l0Var.g();
                        } else {
                            zG = obj3 == obj;
                        }
                        if (zG) {
                            k0Var.l(i13);
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public static final void G(int i10, int i11, Object[] objArr) {
        jc.l.e(objArr, "<this>");
        while (i10 < i11) {
            objArr[i10] = null;
            i10++;
        }
    }

    public static void H() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static final ExtractedText I(y yVar) {
        ExtractedText extractedText = new ExtractedText();
        String str = yVar.f25434a.f20320b;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j10 = yVar.f25435b;
        extractedText.selectionStart = t2.k0.e(j10);
        extractedText.selectionEnd = t2.k0.d(j10);
        extractedText.flags = !ef.n.o0(yVar.f25434a.f20320b, '\n') ? 1 : 0;
        return extractedText;
    }

    public static final String J(String str) {
        jc.l.e(str, "<this>");
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if ('A' <= cCharAt && cCharAt < '[') {
                cCharAt = Character.toLowerCase(cCharAt);
            }
            sb.append(cCharAt);
        }
        String string = sb.toString();
        jc.l.d(string, "toString(...)");
        return string;
    }

    public static final String a(Object[] objArr, int i10, int i11, vb.f fVar) {
        StringBuilder sb = new StringBuilder((i11 * 3) + 2);
        sb.append("[");
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i10 + i12];
            if (obj == fVar) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String string = sb.toString();
        jc.l.d(string, "toString(...)");
        return string;
    }

    public static final void b(k0 k0Var, Object obj, Object obj2) {
        int iF = k0Var.f(obj);
        boolean z10 = iF < 0;
        Object obj3 = z10 ? null : k0Var.f15997c[iF];
        if (obj3 != null) {
            if (obj3 instanceof l0) {
                ((l0) obj3).a(obj2);
            } else if (obj3 != obj2) {
                l0 l0Var = new l0();
                l0Var.a(obj3);
                l0Var.a(obj2);
                obj2 = l0Var;
            }
            obj2 = obj3;
        }
        if (!z10) {
            k0Var.f15997c[iF] = obj2;
            return;
        }
        int i10 = ~iF;
        k0Var.f15996b[i10] = obj;
        k0Var.f15997c[i10] = obj2;
    }

    public static ArrayList c(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new vb.i(objArr, true));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(androidx.lifecycle.q r5, ac.c r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof x8.b
            if (r0 == 0) goto L13
            r0 = r6
            x8.b r0 = (x8.b) r0
            int r1 = r0.f24836g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24836g = r1
            goto L18
        L13:
            x8.b r0 = new x8.b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f24835f
            int r1 = r0.f24836g
            ub.a0 r2 = ub.a0.f21526a
            r3 = 1
            if (r1 == 0) goto L35
            if (r1 != r3) goto L2d
            jc.y r5 = r0.f24834e
            androidx.lifecycle.q r0 = r0.f24833d
            ub.a.f(r6)     // Catch: java.lang.Throwable -> L2b
            goto L71
        L2b:
            r6 = move-exception
            goto L80
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            ub.a.f(r6)
            androidx.lifecycle.p r6 = r5.a1()
            androidx.lifecycle.p r1 = androidx.lifecycle.p.f797d
            int r6 = r6.compareTo(r1)
            if (r6 < 0) goto L45
            return r2
        L45:
            jc.y r6 = new jc.y
            r6.<init>()
            r0.f24833d = r5     // Catch: java.lang.Throwable -> L7b
            r0.f24834e = r6     // Catch: java.lang.Throwable -> L7b
            r0.f24836g = r3     // Catch: java.lang.Throwable -> L7b
            hf.k r1 = new hf.k     // Catch: java.lang.Throwable -> L7b
            yb.c r0 = ud.s.p(r0)     // Catch: java.lang.Throwable -> L7b
            r1.<init>(r3, r0)     // Catch: java.lang.Throwable -> L7b
            r1.r()     // Catch: java.lang.Throwable -> L7b
            c4.l r0 = new c4.l     // Catch: java.lang.Throwable -> L7b
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L7b
            r6.f10838a = r0     // Catch: java.lang.Throwable -> L7b
            r5.W0(r0)     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r0 = r1.q()     // Catch: java.lang.Throwable -> L7b
            zb.a r1 = zb.a.f26667a
            if (r0 != r1) goto L6f
            return r1
        L6f:
            r0 = r5
            r5 = r6
        L71:
            java.lang.Object r5 = r5.f10838a
            androidx.lifecycle.w r5 = (androidx.lifecycle.w) r5
            if (r5 == 0) goto L7a
            r0.q1(r5)
        L7a:
            return r2
        L7b:
            r0 = move-exception
            r4 = r0
            r0 = r5
            r5 = r6
            r6 = r4
        L80:
            java.lang.Object r5 = r5.f10838a
            androidx.lifecycle.w r5 = (androidx.lifecycle.w) r5
            if (r5 == 0) goto L89
            r0.q1(r5)
        L89:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ud.b.d(androidx.lifecycle.q, ac.c):java.lang.Object");
    }

    public static int e(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        jc.l.e(arrayList, "<this>");
        D(arrayList.size(), size);
        int i10 = size - 1;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            int iJ = j((Comparable) arrayList.get(i12), comparable);
            if (iJ < 0) {
                i11 = i12 + 1;
            } else {
                if (iJ <= 0) {
                    return i12;
                }
                i10 = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static final Object f(Object obj, boolean z10) {
        je.c cVar;
        jc.l.e(obj, "possiblyPrimitiveType");
        if (z10) {
            obj = (m) obj;
            if ((obj instanceof l) && (cVar = ((l) obj).f21591i) != null) {
                be.c cVar2 = cVar.f10863d;
                if (cVar2 == null) {
                    je.c.a(15);
                    throw null;
                }
                String strD = je.b.b(cVar2).d();
                jc.l.d(strD, "getInternalName(...)");
                return h.d(strD);
            }
        }
        return obj;
    }

    public static wb.b g(wb.b bVar) {
        bVar.m();
        bVar.f23468c = true;
        return bVar.f23467b > 0 ? bVar : wb.b.f23465d;
    }

    public static final String h(String str) {
        char cCharAt;
        jc.l.e(str, "<this>");
        if (str.length() == 0 || 'a' > (cCharAt = str.charAt(0)) || cCharAt >= '{') {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length());
        sb.append(Character.toUpperCase(cCharAt));
        sb.append((CharSequence) str, 1, str.length());
        return sb.toString();
    }

    public static final w0 i(w.k kVar, x0.o oVar, int i10) {
        Object objK = oVar.K();
        r0 r0Var = x0.k.f24334a;
        if (objK == r0Var) {
            objK = x0.v.v(Boolean.FALSE);
            oVar.h0(objK);
        }
        w0 w0Var = (w0) objK;
        boolean z10 = (((i10 & 14) ^ 6) > 4 && oVar.f(kVar)) || (i10 & 6) == 4;
        Object objK2 = oVar.K();
        if (z10 || objK2 == r0Var) {
            objK2 = new w.e(kVar, w0Var, null, 1);
            oVar.h0(objK2);
        }
        x0.v.e((ic.n) objK2, kVar, oVar);
        return w0Var;
    }

    public static int j(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static k0 k() {
        long[] jArr = s0.f16040a;
        return new k0();
    }

    public static wb.b l() {
        return new wb.b(10);
    }

    public static final float m(d0.d dVar) {
        return dVar.k().f5415e == e1.f20883b ? Float.intBitsToFloat((int) (dVar.o() >> 32)) : Float.intBitsToFloat((int) (dVar.o() & 4294967295L));
    }

    public static ug.q n(SSLSession sSLSession) throws IOException {
        List listJ;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") || cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            throw new IOException("cipherSuite == ".concat(cipherSuite));
        }
        ug.l lVarD = ug.l.f21809b.d(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        h0.f21797b.getClass();
        h0 h0VarE = ug.b.e(protocol);
        try {
            listJ = wg.g.j(sSLSession.getPeerCertificates());
        } catch (SSLPeerUnverifiedException unused) {
            listJ = vb.r.f22819a;
        }
        return new ug.q(h0VarE, lVarD, wg.g.j(sSLSession.getLocalCertificates()), new sf.j(2, listJ));
    }

    public static yb.f o(yb.f fVar, yb.g gVar) {
        jc.l.e(gVar, "key");
        if (jc.l.a(fVar.getKey(), gVar)) {
            return fVar;
        }
        return null;
    }

    public static final int p(x2.k kVar, int i10) {
        boolean z10 = jc.l.g(kVar.f24566a, x2.k.f24560b.f24566a) >= 0;
        boolean z11 = i10 == 1;
        if (z11 && z10) {
            return 3;
        }
        if (z10) {
            return 1;
        }
        return z11 ? 2 : 0;
    }

    public static oc.d q(Collection collection) {
        jc.l.e(collection, "<this>");
        return new oc.d(0, collection.size() - 1, 1);
    }

    public static int r(List list) {
        jc.l.e(list, "<this>");
        return list.size() - 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static dd.c s(oe.w r4, boolean r5, boolean r6, java.lang.Boolean r7, boolean r8, dd.b r9, yd.e r10) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ud.b.s(oe.w, boolean, boolean, java.lang.Boolean, boolean, dd.b, yd.e):dd.c");
    }

    public static boolean t(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    public static final boolean u(d0.d dVar, float f10) {
        dVar.k().getClass();
        return !(((dVar.p() ? -f10 : m(dVar)) > 0.0f ? 1 : ((dVar.p() ? -f10 : m(dVar)) == 0.0f ? 0 : -1)) > 0);
    }

    public static final boolean v(int i10, String str) {
        char cCharAt = str.charAt(i10);
        return 'A' <= cCharAt && cCharAt < '[';
    }

    public static List w(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        jc.l.d(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    public static List x(Object... objArr) {
        jc.l.e(objArr, "elements");
        return objArr.length > 0 ? vb.l.c0(objArr) : vb.r.f22819a;
    }

    public static List y(Object obj) {
        return obj != null ? w(obj) : vb.r.f22819a;
    }

    public static yb.h z(yb.f fVar, yb.g gVar) {
        jc.l.e(gVar, "key");
        return jc.l.a(fVar.getKey(), gVar) ? yb.i.f26088a : fVar;
    }
}
