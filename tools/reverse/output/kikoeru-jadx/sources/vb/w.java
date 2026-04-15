package vb;

import android.content.Context;
import android.graphics.Paint;
import android.os.Build;
import android.text.Layout;
import android.view.View;
import androidx.compose.material3.MinimumInteractiveModifier;
import bd.a0;
import bd.y0;
import ce.c0;
import cg.f0;
import com.cnl.kikoeru.R;
import g2.n1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import q.t0;
import q1.h0;
import se.g0;
import se.x0;
import v0.z;
import wd.j0;
import wf.i1;
import x0.j1;
import x0.o2;
import x0.p1;
import x0.y1;
import yc.m0;
import yc.q0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class w {
    public static Map A(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return s.f22820a;
        }
        if (size == 1) {
            return u((ub.k) arrayList.get(0));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(t(arrayList.size()));
        z(linkedHashMap, arrayList);
        return linkedHashMap;
    }

    public static Map B(Map map) {
        jc.l.e(map, "<this>");
        int size = map.size();
        if (size == 0) {
            return s.f22820a;
        }
        if (size != 1) {
            return C(map);
        }
        jc.l.e(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        jc.l.d(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }

    public static LinkedHashMap C(Map map) {
        jc.l.e(map, "<this>");
        return new LinkedHashMap(map);
    }

    public static final void a(f0 f0Var, j1.q qVar, boolean z10, v0.f fVar, w.k kVar, x0.o oVar, int i10) {
        int i11;
        v0.f fVar2;
        j1.q qVar2;
        w.k kVar2;
        boolean z11;
        int i12;
        v0.f fVar3;
        v0.f fVar4;
        j1.q qVar3;
        w.k kVar3;
        boolean z12;
        f1.f fVar5 = cg.j.f4050a;
        oVar.Y(-1142896114);
        if ((i10 & 6) == 0) {
            i11 = (oVar.h(f0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        int i13 = i11 | 432;
        if ((i10 & 3072) == 0) {
            i13 = i11 | 1456;
        }
        int i14 = i13 | 24576;
        if ((196608 & i10) == 0) {
            i14 |= oVar.h(fVar5) ? 131072 : 65536;
        }
        if ((74899 & i14) == 74898 && oVar.z()) {
            oVar.Q();
            qVar3 = qVar;
            z12 = z10;
            fVar4 = fVar;
            kVar3 = kVar;
        } else {
            oVar.S();
            if ((i10 & 1) == 0 || oVar.x()) {
                oVar.X(-1519621781);
                v0.a aVar = (v0.a) oVar.j(v0.c.f22176a);
                oVar.X(1437915677);
                v0.f fVar6 = aVar.K;
                if (fVar6 == null) {
                    long j10 = ((q1.q) oVar.j(v0.d.f22183a)).f17577a;
                    long j11 = q1.q.f17574g;
                    v0.f fVar7 = new v0.f(j11, j10, j11, q1.q.b(0.38f, j10));
                    aVar.K = fVar7;
                    fVar6 = fVar7;
                }
                long j12 = fVar6.f22192b;
                oVar.p(false);
                long j13 = ((q1.q) oVar.j(v0.d.f22183a)).f17577a;
                if (q1.q.c(j12, j13)) {
                    oVar.p(false);
                    fVar2 = fVar6;
                } else {
                    long jB = q1.q.b(0.38f, j13);
                    long j14 = fVar6.f22191a;
                    long j15 = fVar6.f22193c;
                    long j16 = q1.q.f17575h;
                    fVar2 = new v0.f(j14, j13 != j16 ? j13 : j12, j15, jB != j16 ? jB : fVar6.f22194d);
                    oVar.p(false);
                }
                int i15 = i14 & (-7169);
                oVar.X(793644531);
                Object objK = oVar.K();
                if (objK == x0.k.f24334a) {
                    objK = t0.I(oVar);
                }
                oVar.p(false);
                qVar2 = j1.n.f9689a;
                kVar2 = (w.k) objK;
                z11 = true;
                i12 = i15;
                fVar3 = fVar2;
            } else {
                oVar.Q();
                qVar2 = qVar;
                z11 = z10;
                kVar2 = kVar;
                i12 = i14 & (-7169);
                fVar3 = fVar;
            }
            oVar.q();
            o2 o2Var = v0.k.f22245a;
            j1.q qVarE = qVar2.e(MinimumInteractiveModifier.f670a);
            float f10 = w0.d.f23012b;
            j1.q qVarC = androidx.compose.foundation.a.c(androidx.compose.foundation.a.b(gh.g.k(androidx.compose.foundation.layout.c.j(qVarE, f10), z.a(5, oVar)), z11 ? fVar3.f22191a : fVar3.f22193c, h0.f17515a), kVar2, u0.j.a(f10 / 2, oVar), z11, new q2.h(0), f0Var, 8);
            j1.h hVar = j1.c.f9666e;
            oVar.X(733328855);
            y.s sVarE = y.p.e(hVar, oVar, 6);
            oVar.X(-1323940314);
            int iQ = x0.v.q(oVar);
            j1 j1VarL = oVar.l();
            i2.k.f8771g0.getClass();
            ic.a aVar2 = i2.j.f8733b;
            f1.f fVarK = n1.k(qVarC);
            oVar.a0();
            if (oVar.S) {
                oVar.k(aVar2);
            } else {
                oVar.k0();
            }
            x0.v.A(i2.j.f8738g, sVarE, oVar);
            x0.v.A(i2.j.f8737f, j1VarL, oVar);
            i2.h hVar2 = i2.j.f8741j;
            if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ))) {
                j2.h0.s(iQ, oVar, iQ, hVar2);
            }
            fVarK.g(new y1(oVar), oVar, 0);
            oVar.X(2058660585);
            x0.v.a(v0.d.f22183a.a(new q1.q(z11 ? fVar3.f22192b : fVar3.f22194d)), fVar5, oVar, ((i12 >> 12) & 112) | 8);
            oVar.p(false);
            oVar.p(true);
            oVar.p(false);
            oVar.p(false);
            j1.q qVar4 = qVar2;
            fVar4 = fVar3;
            qVar3 = qVar4;
            kVar3 = kVar2;
            z12 = z11;
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new v0.g(f0Var, qVar3, z12, fVar4, kVar3, i10);
        }
    }

    public static final int b(z7.c cVar, String str) {
        jc.l.e(cVar, "<this>");
        int iC = c(cVar, str);
        if (iC >= 0) {
            return iC;
        }
        int iC2 = c(cVar, "`" + str + '`');
        if (iC2 >= 0) {
            return iC2;
        }
        if (Build.VERSION.SDK_INT > 25 || str.length() == 0) {
            return -1;
        }
        int columnCount = cVar.getColumnCount();
        String strConcat = ".".concat(str);
        String strG = a0.c.G('`', ".", str);
        for (int i10 = 0; i10 < columnCount; i10++) {
            String columnName = cVar.getColumnName(i10);
            if (columnName.length() >= str.length() + 2 && (ef.u.c0(columnName, strConcat, false) || (columnName.charAt(0) == '`' && ef.u.c0(columnName, strG, false)))) {
                return i10;
            }
        }
        return -1;
    }

    public static final int c(z7.c cVar, String str) {
        jc.l.e(cVar, "<this>");
        jc.l.e(str, "name");
        int columnCount = cVar.getColumnCount();
        for (int i10 = 0; i10 < columnCount; i10++) {
            if (str.equals(cVar.getColumnName(i10))) {
                return i10;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        if (gh.g.o(r9, r1, jc.l.a(r7, r2) ? r0.getWidth() : x8.d.d(r7.f20563a, r8), jc.l.a(r7, r2) ? r0.getHeight() : x8.d.d(r7.f20564b, r8), r8) == 1.0d) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap d(android.graphics.drawable.Drawable r5, android.graphics.Bitmap.Config r6, t8.h r7, t8.g r8, boolean r9) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vb.w.d(android.graphics.drawable.Drawable, android.graphics.Bitmap$Config, t8.h, t8.g, boolean):android.graphics.Bitmap");
    }

    public static wc.f e(wc.c cVar, boolean z10) {
        String lowerCase;
        jc.l.e(cVar, "functionClass");
        List list = cVar.f23502k;
        wc.f fVar = new wc.f(cVar, null, 1, z10);
        a0 a0VarT0 = cVar.T0();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((q0) obj).e0() != x0.IN_VARIANCE) {
                break;
            }
            arrayList.add(obj);
        }
        df.o oVarL0 = m.L0(arrayList);
        ArrayList arrayList2 = new ArrayList(n.K(oVarL0, 10));
        Iterator it = oVarL0.iterator();
        while (true) {
            df.b bVar = (df.b) it;
            if (!bVar.f5974b.hasNext()) {
                se.a0 a0VarE = ((q0) m.h0(list)).E();
                yc.x xVar = yc.x.f26158e;
                ld.o oVar = yc.o.f26129e;
                r rVar = r.f22819a;
                fVar.I1(null, a0VarT0, rVar, rVar, arrayList2, a0VarE, xVar, oVar);
                wc.f fVar2 = fVar;
                fVar2.f2733w = true;
                return fVar2;
            }
            u uVar = (u) bVar.next();
            int i10 = uVar.f22822a;
            q0 q0Var = (q0) uVar.f22823b;
            String strB = q0Var.getName().b();
            jc.l.d(strB, "asString(...)");
            if (strB.equals("T")) {
                lowerCase = "instance";
            } else if (strB.equals("E")) {
                lowerCase = "receiver";
            } else {
                lowerCase = strB.toLowerCase(Locale.ROOT);
                jc.l.d(lowerCase, "toLowerCase(...)");
            }
            wc.f fVar3 = fVar;
            be.e eVarE = be.e.e(lowerCase);
            se.a0 a0VarE2 = q0Var.E();
            jc.l.d(a0VarE2, "getDefaultType(...)");
            arrayList2.add(new y0(fVar3, null, i10, zc.g.f26696a, eVarE, a0VarE2, false, false, false, null, m0.p0));
            fVar = fVar3;
        }
    }

    public static final x2.e f(Context context) {
        r5.p pVar = new r5.p(12);
        context.getApplicationContext();
        return new x2.e(pVar, new x2.a(Build.VERSION.SDK_INT >= 31 ? x2.l.f24567a.a(context) : 0));
    }

    public static final g0 g(yc.e eVar, yc.e eVar2) {
        jc.l.e(eVar, "from");
        jc.l.e(eVar2, "to");
        eVar.L().size();
        eVar2.L().size();
        List listL = eVar.L();
        jc.l.d(listL, "getDeclaredTypeParameters(...)");
        List list = listL;
        ArrayList arrayList = new ArrayList(n.K(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((q0) it.next()).Q());
        }
        List listL2 = eVar2.L();
        jc.l.d(listL2, "getDeclaredTypeParameters(...)");
        List list2 = listL2;
        ArrayList arrayList2 = new ArrayList(n.K(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            se.a0 a0VarE = ((q0) it2.next()).E();
            jc.l.d(a0VarE, "getDefaultType(...)");
            arrayList2.add(ud.e.b(a0VarE));
        }
        return new g0(1, A(m.M0(arrayList, arrayList2)));
    }

    public static ug.v h(String str) {
        jc.l.e(str, "<this>");
        ef.j jVarB = ug.v.f21877c.b(0, str);
        if (jVarB == null) {
            throw new IllegalArgumentException(a0.c.G('\"', "No subtype found for: \"", str));
        }
        String str2 = (String) ((ef.i) jVarB.a()).get(1);
        Locale locale = Locale.ROOT;
        String lowerCase = str2.toLowerCase(locale);
        jc.l.d(lowerCase, "toLowerCase(...)");
        String lowerCase2 = ((String) ((ef.i) jVarB.a()).get(2)).toLowerCase(locale);
        jc.l.d(lowerCase2, "toLowerCase(...)");
        ArrayList arrayList = new ArrayList();
        int i10 = jVarB.b().f16308b;
        while (true) {
            int i11 = i10 + 1;
            if (i11 >= str.length()) {
                return new ug.v(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]));
            }
            ef.j jVarB2 = ug.v.f21878d.b(i11, str);
            if (jVarB2 == null) {
                StringBuilder sb = new StringBuilder("Parameter is not formatted correctly: \"");
                String strSubstring = str.substring(i11);
                jc.l.d(strSubstring, "substring(...)");
                sb.append(strSubstring);
                sb.append("\" for: \"");
                throw new IllegalArgumentException(t0.E(sb, str, '\"').toString());
            }
            c1.l lVar = jVarB2.f6573c;
            ef.h hVarI = lVar.i(1);
            String str3 = hVarI != null ? hVarI.f6567a : null;
            if (str3 == null) {
                i10 = jVarB2.b().f16308b;
            } else {
                ef.h hVarI2 = lVar.i(2);
                String strSubstring2 = hVarI2 != null ? hVarI2.f6567a : null;
                if (strSubstring2 == null) {
                    ef.h hVarI3 = lVar.i(3);
                    jc.l.b(hVarI3);
                    strSubstring2 = hVarI3.f6567a;
                } else if (ef.n.M0('\'', strSubstring2) && ef.n.q0('\'', strSubstring2) && strSubstring2.length() > 2) {
                    strSubstring2 = strSubstring2.substring(1, strSubstring2.length() - 1);
                    jc.l.d(strSubstring2, "substring(...)");
                }
                arrayList.add(str3);
                arrayList.add(strSubstring2);
                i10 = jVarB2.b().f16308b;
            }
        }
    }

    public static final pc.c i(uf.g gVar) {
        jc.l.e(gVar, "<this>");
        if (gVar instanceof uf.b) {
            return ((uf.b) gVar).f21678b;
        }
        if (gVar instanceof i1) {
            return i(((i1) gVar).f24131a);
        }
        return null;
    }

    public static final int j(z7.c cVar, String str) throws IOException {
        jc.l.e(cVar, "stmt");
        int iB = b(cVar, str);
        if (iB >= 0) {
            return iB;
        }
        int columnCount = cVar.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i10 = 0; i10 < columnCount; i10++) {
            arrayList.add(cVar.getColumnName(i10));
        }
        throw new IllegalArgumentException("Column '" + str + "' does not exist. Available columns: [" + m.f0(arrayList, null, null, null, null, 63) + ']');
    }

    public static final float k(Layout layout, int i10, Paint paint) {
        float fAbs;
        float width;
        float lineLeft = layout.getLineLeft(i10);
        u2.j jVar = u2.l.f21265a;
        if (layout.getEllipsisCount(i10) <= 0 || layout.getParagraphDirection(i10) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i10) + layout.getLineStart(i10)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i10);
        if ((paragraphAlignment == null ? -1 : w2.d.f23311a[paragraphAlignment.ordinal()]) == 1) {
            fAbs = Math.abs(lineLeft);
            width = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            fAbs = Math.abs(lineLeft);
            width = layout.getWidth() - fMeasureText;
        }
        return width + fAbs;
    }

    public static final float l(Layout layout, int i10, Paint paint) {
        float width;
        float width2;
        u2.j jVar = u2.l.f21265a;
        if (layout.getEllipsisCount(i10) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i10) != -1 || layout.getWidth() >= layout.getLineRight(i10)) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getLineRight(i10) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i10) + layout.getLineStart(i10)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i10);
        if ((paragraphAlignment != null ? w2.d.f23311a[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i10);
            width2 = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i10);
            width2 = layout.getWidth() - fMeasureText;
        }
        return width - width2;
    }

    public static final Object m(ce.m mVar, ce.o oVar) {
        jc.l.e(mVar, "<this>");
        jc.l.e(oVar, "extension");
        if (mVar.l(oVar)) {
            return mVar.k(oVar);
        }
        return null;
    }

    public static final Object n(ce.m mVar, ce.o oVar, int i10) {
        jc.l.e(mVar, "<this>");
        jc.l.e(oVar, "extension");
        mVar.o(oVar);
        ce.j jVar = mVar.f3953a;
        ce.n nVar = oVar.f3961d;
        jVar.getClass();
        c0 c0Var = jVar.f3946a;
        if (!nVar.f3957c) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object obj = c0Var.get(nVar);
        if (i10 >= (obj == null ? 0 : ((List) obj).size())) {
            return null;
        }
        mVar.o(oVar);
        if (!nVar.f3957c) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object obj2 = c0Var.get(nVar);
        if (obj2 != null) {
            return oVar.a(((List) obj2).get(i10));
        }
        throw new IndexOutOfBoundsException();
    }

    public static final z3.a o(View view) {
        z3.a aVar = (z3.a) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (aVar != null) {
            return aVar;
        }
        z3.a aVar2 = new z3.a();
        view.setTag(R.id.pooling_container_listener_holder_tag, aVar2);
        return aVar2;
    }

    public static final ud.t p(j0 j0Var, yd.f fVar, bd.f0 f0Var, boolean z10, boolean z11, boolean z12) {
        jc.l.e(j0Var, "proto");
        jc.l.e(fVar, "nameResolver");
        ce.o oVar = zd.j.f26806d;
        jc.l.d(oVar, "propertySignature");
        zd.d dVar = (zd.d) m(j0Var, oVar);
        if (dVar != null) {
            if (z10) {
                ce.i iVar = ae.g.f324a;
                ae.d dVarB = ae.g.b(j0Var, fVar, f0Var, z12);
                if (dVarB != null) {
                    return ud.s.n(dVarB);
                }
            } else if (z11 && (dVar.f26758b & 2) == 2) {
                zd.c cVar = dVar.f26760d;
                jc.l.d(cVar, "getSyntheticMethod(...)");
                return new ud.t(fVar.getString(cVar.f26751c).concat(fVar.getString(cVar.f26752d)));
            }
        }
        return null;
    }

    public static Object r(Object obj, Map map) {
        jc.l.e(map, "<this>");
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean s(ug.d0 r2, b7.b1 r3) {
        /*
            java.lang.String r0 = "request"
            jc.l.e(r3, r0)
            int r0 = r2.f21759d
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 == r1) goto L5a
            r1 = 410(0x19a, float:5.75E-43)
            if (r0 == r1) goto L5a
            r1 = 414(0x19e, float:5.8E-43)
            if (r0 == r1) goto L5a
            r1 = 501(0x1f5, float:7.02E-43)
            if (r0 == r1) goto L5a
            r1 = 203(0xcb, float:2.84E-43)
            if (r0 == r1) goto L5a
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 == r1) goto L5a
            r1 = 307(0x133, float:4.3E-43)
            if (r0 == r1) goto L33
            r1 = 308(0x134, float:4.32E-43)
            if (r0 == r1) goto L5a
            r1 = 404(0x194, float:5.66E-43)
            if (r0 == r1) goto L5a
            r1 = 405(0x195, float:5.68E-43)
            if (r0 == r1) goto L5a
            switch(r0) {
                case 300: goto L5a;
                case 301: goto L5a;
                case 302: goto L33;
                default: goto L32;
            }
        L32:
            goto L6c
        L33:
            ug.r r0 = r2.f21761f
            java.lang.String r1 = "Expires"
            java.lang.String r0 = r0.a(r1)
            if (r0 != 0) goto L3e
            r0 = 0
        L3e:
            if (r0 != 0) goto L5a
            ug.g r0 = r2.b()
            int r0 = r0.f21783c
            r1 = -1
            if (r0 != r1) goto L5a
            ug.g r0 = r2.b()
            boolean r0 = r0.f21786f
            if (r0 != 0) goto L5a
            ug.g r0 = r2.b()
            boolean r0 = r0.f21785e
            if (r0 != 0) goto L5a
            goto L6c
        L5a:
            ug.g r2 = r2.b()
            boolean r2 = r2.f21782b
            if (r2 != 0) goto L6c
            ug.g r2 = r3.p()
            boolean r2 = r2.f21782b
            if (r2 != 0) goto L6c
            r2 = 1
            return r2
        L6c:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: vb.w.s(ug.d0, b7.b1):boolean");
    }

    public static int t(int i10) {
        if (i10 < 0) {
            return i10;
        }
        if (i10 < 3) {
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) ((i10 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map u(ub.k kVar) {
        jc.l.e(kVar, "pair");
        Map mapSingletonMap = Collections.singletonMap(kVar.f21543a, kVar.f21544b);
        jc.l.d(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }

    public static Map v(ub.k... kVarArr) {
        if (kVarArr.length <= 0) {
            return s.f22820a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(t(kVarArr.length));
        y(linkedHashMap, kVarArr);
        return linkedHashMap;
    }

    public static ug.v w(String str) {
        jc.l.e(str, "<this>");
        try {
            return h(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static LinkedHashMap x(Map map, Map map2) {
        jc.l.e(map, "<this>");
        jc.l.e(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static final void y(HashMap map, ub.k[] kVarArr) {
        for (ub.k kVar : kVarArr) {
            map.put(kVar.f21543a, kVar.f21544b);
        }
    }

    public static void z(Map map, ArrayList arrayList) {
        jc.l.e(map, "<this>");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ub.k kVar = (ub.k) it.next();
            map.put(kVar.f21543a, kVar.f21544b);
        }
    }
}
