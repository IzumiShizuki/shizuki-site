package ud;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import bd.f0;
import com.cnl.kikoeru.R;
import java.io.DataInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m4.p0;
import se.a0;
import se.n0;
import se.u0;
import se.w;
import se.w0;
import se.x0;
import t2.k0;
import wd.b0;
import wd.b1;
import wd.j0;
import wd.r0;
import wd.t0;
import wd.v0;
import wd.y0;
import x0.d2;
import y2.y;
import yc.q0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class e implements v2.d {
    public static final t2.g A(y yVar, int i10) {
        t2.g gVar = yVar.f25434a;
        long j10 = yVar.f25435b;
        return gVar.subSequence(k0.d(j10), Math.min(k0.d(j10) + i10, yVar.f25434a.f20320b.length()));
    }

    public static final t2.g B(y yVar, int i10) {
        t2.g gVar = yVar.f25434a;
        long j10 = yVar.f25435b;
        return gVar.subSequence(Math.max(0, k0.e(j10) - i10), k0.e(j10));
    }

    public static final boolean C(q0 q0Var, se.k0 k0Var, Set set) {
        jc.l.e(q0Var, "typeParameter");
        List upperBounds = q0Var.getUpperBounds();
        jc.l.d(upperBounds, "getUpperBounds(...)");
        List<w> list = upperBounds;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (w wVar : list) {
            jc.l.b(wVar);
            if (m(wVar, q0Var.E().t(), set) && (k0Var == null || jc.l.a(wVar.t(), k0Var))) {
                return true;
            }
        }
        return false;
    }

    public static final t0 D(wd.k kVar, f0 f0Var) {
        jc.l.e(kVar, "<this>");
        int i10 = kVar.f23803c;
        if ((i10 & 16) == 16) {
            return kVar.f23824x;
        }
        if ((i10 & 32) == 32) {
            return f0Var.b(kVar.f23825y);
        }
        return null;
    }

    public static final w0 E(w wVar) {
        jc.l.e(wVar, "<this>");
        w0 w0VarG = u0.g(wVar, true);
        jc.l.d(w0VarG, "makeNullable(...)");
        return w0VarG;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object F(se.w r18, ud.v r19, ic.o r20) {
        /*
            Method dump skipped, instruction units count: 1030
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ud.e.F(se.w, ud.v, ic.o):java.lang.Object");
    }

    public static LinkedHashSet G(Set set, Object obj) {
        jc.l.e(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(vb.w.t(set.size()));
        boolean z10 = false;
        for (Object obj2 : set) {
            boolean z11 = true;
            if (!z10 && jc.l.a(obj2, obj)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    public static final t0 I(t0 t0Var, f0 f0Var) {
        jc.l.e(t0Var, "<this>");
        int i10 = t0Var.f23950c;
        if ((i10 & 256) == 256) {
            return t0Var.f23960m;
        }
        if ((i10 & 512) == 512) {
            return f0Var.b(t0Var.f23961n);
        }
        return null;
    }

    public static LinkedHashSet J(Set set, Iterable iterable) {
        jc.l.e(set, "<this>");
        jc.l.e(iterable, "elements");
        Integer numValueOf = iterable instanceof Collection ? Integer.valueOf(((Collection) iterable).size()) : null;
        LinkedHashSet linkedHashSet = new LinkedHashSet(vb.w.t(numValueOf != null ? set.size() + numValueOf.intValue() : set.size() * 2));
        linkedHashSet.addAll(set);
        vb.m.P(linkedHashSet, iterable);
        return linkedHashSet;
    }

    public static LinkedHashSet K(Set set, Object obj) {
        jc.l.e(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(vb.w.t(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }

    public static final void L(d2 d2Var, x0.c cVar, int i10) {
        while (true) {
            int i11 = d2Var.f24286v;
            if (i10 > i11 && i10 < d2Var.f24285u) {
                return;
            }
            if (i11 == 0 && i10 == 0) {
                return;
            }
            d2Var.L();
            if (d2Var.x(d2Var.f24286v)) {
                cVar.j();
            }
            d2Var.j();
        }
    }

    public static final List N(z7.c cVar) {
        int iB = vb.w.b(cVar, "id");
        int iB2 = vb.w.b(cVar, "seq");
        int iB3 = vb.w.b(cVar, "from");
        int iB4 = vb.w.b(cVar, "to");
        wb.b bVarL = b.l();
        while (cVar.Z()) {
            bVarL.add(new v7.e(cVar.M(iB3), (int) cVar.getLong(iB), (int) cVar.getLong(iB2), cVar.M(iB4)));
        }
        return vb.m.B0(b.g(bVarL));
    }

    public static xd.a O(InputStream inputStream) {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        oc.d dVar = new oc.d(1, dataInputStream.readInt(), 1);
        ArrayList arrayList = new ArrayList(vb.n.K(dVar, 10));
        oc.c cVarA = dVar.iterator();
        while (cVarA.f16312c) {
            cVarA.nextInt();
            arrayList.add(Integer.valueOf(dataInputStream.readInt()));
        }
        int[] iArrF0 = vb.m.F0(arrayList);
        return new xd.a(Arrays.copyOf(iArrF0, iArrF0.length));
    }

    public static final v7.h P(z7.a aVar, String str, boolean z10) {
        z7.c cVarD0 = aVar.d0("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int iB = vb.w.b(cVarD0, "seqno");
            int iB2 = vb.w.b(cVarD0, "cid");
            int iB3 = vb.w.b(cVarD0, "name");
            int iB4 = vb.w.b(cVarD0, "desc");
            if (iB != -1 && iB2 != -1 && iB3 != -1 && iB4 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (cVarD0.Z()) {
                    if (((int) cVarD0.getLong(iB2)) >= 0) {
                        int i10 = (int) cVarD0.getLong(iB);
                        String strM = cVarD0.M(iB3);
                        String str2 = cVarD0.getLong(iB4) > 0 ? "DESC" : "ASC";
                        linkedHashMap.put(Integer.valueOf(i10), strM);
                        linkedHashMap2.put(Integer.valueOf(i10), str2);
                    }
                }
                List listC0 = vb.m.C0(linkedHashMap.entrySet(), new gb.j(3));
                ArrayList arrayList = new ArrayList(vb.n.K(listC0, 10));
                Iterator it = listC0.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List listG0 = vb.m.G0(arrayList);
                List listC02 = vb.m.C0(linkedHashMap2.entrySet(), new gb.j(4));
                ArrayList arrayList2 = new ArrayList(vb.n.K(listC02, 10));
                Iterator it2 = listC02.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                v7.h hVar = new v7.h(str, z10, listG0, vb.m.G0(arrayList2));
                gh.g.m(cVarD0, null);
                return hVar;
            }
            gh.g.m(cVarD0, null);
            return null;
        } finally {
        }
    }

    public static final t0 Q(b0 b0Var, f0 f0Var) {
        jc.l.e(b0Var, "<this>");
        jc.l.e(f0Var, "typeTable");
        int i10 = b0Var.f23551c;
        if ((i10 & 32) == 32) {
            return b0Var.f23558j;
        }
        if ((i10 & 64) == 64) {
            return f0Var.b(b0Var.f23559k);
        }
        return null;
    }

    public static final t0 R(j0 j0Var, f0 f0Var) {
        jc.l.e(j0Var, "<this>");
        int i10 = j0Var.f23778c;
        if ((i10 & 32) == 32) {
            return j0Var.f23785j;
        }
        if ((i10 & 64) == 64) {
            return f0Var.b(j0Var.f23786k);
        }
        return null;
    }

    public static final w S(w wVar, zc.h hVar) {
        return (wVar.getAnnotations().isEmpty() && hVar.isEmpty()) ? wVar : wVar.x().C(se.c.t(wVar.r(), hVar));
    }

    public static final w0 T(w wVar) {
        w0 w0VarS;
        jc.l.e(wVar, "<this>");
        w0 w0VarX = wVar.x();
        if (w0VarX instanceof se.q) {
            se.q qVar = (se.q) w0VarX;
            a0 a0VarS = qVar.f19978b;
            if (!a0VarS.t().o().isEmpty() && a0VarS.t().h() != null) {
                List listO = a0VarS.t().o();
                jc.l.d(listO, "getParameters(...)");
                List list = listO;
                ArrayList arrayList = new ArrayList(vb.n.K(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new se.f0((q0) it.next()));
                }
                a0VarS = se.c.s(a0VarS, arrayList, null, 2);
            }
            a0 a0VarS2 = qVar.f19979c;
            if (!a0VarS2.t().o().isEmpty() && a0VarS2.t().h() != null) {
                List listO2 = a0VarS2.t().o();
                jc.l.d(listO2, "getParameters(...)");
                List list2 = listO2;
                ArrayList arrayList2 = new ArrayList(vb.n.K(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new se.f0((q0) it2.next()));
                }
                a0VarS2 = se.c.s(a0VarS2, arrayList2, null, 2);
            }
            w0VarS = se.c.g(a0VarS, a0VarS2);
        } else {
            if (!(w0VarX instanceof a0)) {
                throw new ce.j0();
            }
            a0 a0Var = (a0) w0VarX;
            boolean zIsEmpty = a0Var.t().o().isEmpty();
            w0VarS = a0Var;
            if (!zIsEmpty) {
                yc.h hVarH = a0Var.t().h();
                w0VarS = a0Var;
                if (hVarH != null) {
                    List listO3 = a0Var.t().o();
                    jc.l.d(listO3, "getParameters(...)");
                    List list3 = listO3;
                    ArrayList arrayList3 = new ArrayList(vb.n.K(list3, 10));
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(new se.f0((q0) it3.next()));
                    }
                    w0VarS = se.c.s(a0Var, arrayList3, null, 2);
                }
            }
        }
        return se.c.j(w0VarS, w0VarX);
    }

    public static final t0 U(b0 b0Var, f0 f0Var) {
        jc.l.e(b0Var, "<this>");
        jc.l.e(f0Var, "typeTable");
        int i10 = b0Var.f23551c;
        if ((i10 & 8) == 8) {
            t0 t0Var = b0Var.f23555g;
            jc.l.d(t0Var, "getReturnType(...)");
            return t0Var;
        }
        if ((i10 & 16) == 16) {
            return f0Var.b(b0Var.f23556h);
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Function");
    }

    public static final t0 V(j0 j0Var, f0 f0Var) {
        jc.l.e(j0Var, "<this>");
        jc.l.e(f0Var, "typeTable");
        int i10 = j0Var.f23778c;
        if ((i10 & 8) == 8) {
            t0 t0Var = j0Var.f23782g;
            jc.l.d(t0Var, "getReturnType(...)");
            return t0Var;
        }
        if ((i10 & 16) == 16) {
            return f0Var.b(j0Var.f23783h);
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Property");
    }

    public static void W(EditorInfo editorInfo, CharSequence charSequence) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            m2.c.g(editorInfo, charSequence);
            return;
        }
        charSequence.getClass();
        if (i10 >= 30) {
            m2.c.g(editorInfo, charSequence);
            return;
        }
        int i11 = editorInfo.initialSelStart;
        int i12 = editorInfo.initialSelEnd;
        int i13 = i11 > i12 ? i12 : i11;
        if (i11 <= i12) {
            i11 = i12;
        }
        int length = charSequence.length();
        if (i13 < 0 || i11 > length) {
            Z(editorInfo, null, 0, 0);
            return;
        }
        int i14 = editorInfo.inputType & 4095;
        if (i14 == 129 || i14 == 225 || i14 == 18) {
            Z(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            Z(editorInfo, charSequence, i13, i11);
            return;
        }
        int i15 = i11 - i13;
        int i16 = i15 > 1024 ? 0 : i15;
        int i17 = 2048 - i16;
        int iMin = Math.min(charSequence.length() - i11, i17 - Math.min(i13, (int) (((double) i17) * 0.8d)));
        int iMin2 = Math.min(i13, i17 - iMin);
        int i18 = i13 - iMin2;
        if (Character.isLowSurrogate(charSequence.charAt(i18))) {
            i18++;
            iMin2--;
        }
        if (Character.isHighSurrogate(charSequence.charAt((i11 + iMin) - 1))) {
            iMin--;
        }
        int i19 = iMin2 + i16;
        Z(editorInfo, i16 != i15 ? TextUtils.concat(charSequence.subSequence(i18, i18 + iMin2), charSequence.subSequence(i11, iMin + i11)) : charSequence.subSequence(i18, i19 + iMin + i18), iMin2, i19);
    }

    public static Set X(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        jc.l.d(setSingleton, "singleton(...)");
        return setSingleton;
    }

    public static void Y(EditorInfo editorInfo, boolean z10) {
        if (Build.VERSION.SDK_INT >= 35) {
            w3.a.a(editorInfo, z10);
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", z10);
    }

    public static void Z(EditorInfo editorInfo, CharSequence charSequence, int i10, int i11) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i10);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i11);
    }

    public static final t0 a(t0 t0Var, f0 f0Var) {
        jc.l.e(t0Var, "<this>");
        int i10 = t0Var.f23950c;
        if ((i10 & 1024) == 1024) {
            return t0Var.f23962o;
        }
        if ((i10 & 2048) == 2048) {
            return f0Var.b(t0Var.f23963p);
        }
        return null;
    }

    public static b7.q0 a0(int i10, r5.o oVar, p4.s sVar) throws p0 {
        b7.q0 q0VarB = b7.q0.b(oVar, sVar);
        while (true) {
            int i11 = q0VarB.f2038b;
            if (i11 == i10) {
                return q0VarB;
            }
            q.t0.J(i11, "Ignoring unknown WAV chunk: ", "WavHeaderReader");
            long j10 = q0VarB.f2037a;
            long j11 = 8 + j10;
            if (j10 % 2 != 0) {
                j11 = 9 + j10;
            }
            if (j11 > 2147483647L) {
                throw p0.c("Chunk is too large (~2GB+) to skip; id: " + i11);
            }
            oVar.r((int) j11);
            q0VarB = b7.q0.b(oVar, sVar);
        }
    }

    public static final se.f0 b(w wVar) {
        jc.l.e(wVar, "<this>");
        return new se.f0(wVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public static final List b0(wd.k kVar, f0 f0Var) {
        jc.l.e(kVar, "<this>");
        List list = kVar.f23808h;
        boolean zIsEmpty = list.isEmpty();
        ?? arrayList = list;
        if (zIsEmpty) {
            arrayList = 0;
        }
        if (arrayList == 0) {
            List list2 = kVar.f23809i;
            jc.l.d(list2, "getSupertypeIdList(...)");
            List<Integer> list3 = list2;
            arrayList = new ArrayList(vb.n.K(list3, 10));
            for (Integer num : list3) {
                jc.l.b(num);
                arrayList.add(f0Var.b(num.intValue()));
            }
        }
        return arrayList;
    }

    public static wb.g c(wb.g gVar) {
        wb.e eVar = gVar.f23490a;
        eVar.b();
        return eVar.f23482i > 0 ? gVar : wb.g.f23489b;
    }

    public static String c0(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            if (cCharAt >= 'A' && cCharAt <= 'Z') {
                char[] charArray = str.toCharArray();
                while (i10 < length) {
                    char c3 = charArray[i10];
                    if (c3 >= 'A' && c3 <= 'Z') {
                        charArray[i10] = (char) (c3 ^ ' ');
                    }
                    i10++;
                }
                return String.valueOf(charArray);
            }
            i10++;
        }
        return str;
    }

    public static String d0(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            if (cCharAt >= 'a' && cCharAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i10 < length) {
                    char c3 = charArray[i10];
                    if (c3 >= 'a' && c3 <= 'z') {
                        charArray[i10] = (char) (c3 ^ ' ');
                    }
                    i10++;
                }
                return String.valueOf(charArray);
            }
            i10++;
        }
        return str;
    }

    public static final uf.h e(String str, uf.g[] gVarArr, ic.k kVar) {
        if (ef.n.y0(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        uf.a aVar = new uf.a(str);
        kVar.a(aVar);
        return new uf.h(str, uf.k.f21705b, aVar.f21672c.size(), vb.l.M0(gVarArr), aVar);
    }

    public static final t0 e0(r0 r0Var, f0 f0Var) {
        int i10 = r0Var.f23916b;
        if ((i10 & 2) == 2) {
            return r0Var.f23918d;
        }
        if ((i10 & 4) == 4) {
            return f0Var.b(r0Var.f23919e);
        }
        return null;
    }

    public static final uf.h f(String str, n nVar, uf.g[] gVarArr, ic.k kVar) {
        jc.l.e(str, "serialName");
        if (ef.n.y0(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (nVar.equals(uf.k.f21705b)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        uf.a aVar = new uf.a(str);
        kVar.a(aVar);
        return new uf.h(str, nVar, aVar.f21672c.size(), vb.l.M0(gVarArr), aVar);
    }

    public static final t0 f0(b1 b1Var, f0 f0Var) {
        jc.l.e(b1Var, "<this>");
        jc.l.e(f0Var, "typeTable");
        int i10 = b1Var.f23576c;
        if ((i10 & 4) == 4) {
            t0 t0Var = b1Var.f23579f;
            jc.l.d(t0Var, "getType(...)");
            return t0Var;
        }
        if ((i10 & 8) == 8) {
            return f0Var.b(b1Var.f23580g);
        }
        throw new IllegalStateException("No type in ProtoBuf.ValueParameter");
    }

    public static final t0 g0(v0 v0Var, f0 f0Var) {
        int i10 = v0Var.f23995c;
        if ((i10 & 4) == 4) {
            t0 t0Var = v0Var.f23999g;
            jc.l.d(t0Var, "getUnderlyingType(...)");
            return t0Var;
        }
        if ((i10 & 8) == 8) {
            return f0Var.b(v0Var.f24000h);
        }
        throw new IllegalStateException("No underlyingType in ProtoBuf.TypeAlias");
    }

    public static uf.h h(String str, n nVar, uf.g[] gVarArr) {
        jc.l.e(str, "serialName");
        if (ef.n.y0(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (nVar.equals(uf.k.f21705b)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        uf.a aVar = new uf.a(str);
        return new uf.h(str, nVar, aVar.f21672c.size(), vb.l.M0(gVarArr), aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public static final List h0(y0 y0Var, f0 f0Var) {
        jc.l.e(y0Var, "<this>");
        List list = y0Var.f24049h;
        boolean zIsEmpty = list.isEmpty();
        ?? arrayList = list;
        if (zIsEmpty) {
            arrayList = 0;
        }
        if (arrayList == 0) {
            List list2 = y0Var.f24050i;
            jc.l.d(list2, "getUpperBoundIdList(...)");
            List<Integer> list3 = list2;
            arrayList = new ArrayList(vb.n.K(list3, 10));
            for (Integer num : list3) {
                jc.l.b(num);
                arrayList.add(f0Var.b(num.intValue()));
            }
        }
        return arrayList;
    }

    public static final t0 i0(b1 b1Var, f0 f0Var) {
        jc.l.e(b1Var, "<this>");
        int i10 = b1Var.f23576c;
        if ((i10 & 16) == 16) {
            return b1Var.f23581h;
        }
        if ((i10 & 32) == 32) {
            return f0Var.b(b1Var.f23582i);
        }
        return null;
    }

    public static boolean k(r5.o oVar) {
        p4.s sVar = new p4.s(8);
        int i10 = b7.q0.b(oVar, sVar).f2038b;
        if (i10 != 1380533830 && i10 != 1380333108) {
            return false;
        }
        oVar.z(sVar.f16611a, 0, 4);
        sVar.G(0);
        int iG = sVar.g();
        if (iG == 1463899717) {
            return true;
        }
        p4.c.n("WavHeaderReader", "Unsupported form type: " + iG);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String l(yc.e r3, ud.h r4) {
        /*
            java.lang.String r0 = "klass"
            jc.l.e(r3, r0)
            java.lang.String r0 = "typeMappingConfiguration"
            jc.l.e(r4, r0)
            yc.k r0 = r3.y()
            java.lang.String r1 = "getContainingDeclaration(...)"
            jc.l.d(r0, r1)
            be.e r1 = r3.getName()
            if (r1 == 0) goto L20
            be.e r2 = be.g.f2755a
            boolean r2 = r1.f2752b
            if (r2 != 0) goto L20
            goto L22
        L20:
            be.e r1 = be.g.f2757c
        L22:
            java.lang.String r1 = r1.c()
            boolean r2 = r0 instanceof yc.d0
            if (r2 == 0) goto L58
            yc.d0 r0 = (yc.d0) r0
            bd.j0 r0 = (bd.j0) r0
            be.c r3 = r0.f2596e
            be.d r4 = r3.f2744a
            boolean r4 = r4.c()
            if (r4 == 0) goto L39
            return r1
        L39:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            be.d r3 = r3.f2744a
            java.lang.String r3 = r3.f2747a
            r0 = 46
            r2 = 47
            java.lang.String r3 = ef.u.i0(r3, r0, r2)
            r4.append(r3)
            r4.append(r2)
            r4.append(r1)
            java.lang.String r3 = r4.toString()
            return r3
        L58:
            boolean r2 = r0 instanceof yc.e
            if (r2 == 0) goto L60
            r2 = r0
            yc.e r2 = (yc.e) r2
            goto L61
        L60:
            r2 = 0
        L61:
            if (r2 == 0) goto L7c
            java.lang.String r3 = l(r2, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            r3 = 36
            r4.append(r3)
            r4.append(r1)
            java.lang.String r3 = r4.toString()
            return r3
        L7c:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unexpected container: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = " for "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r4.<init>(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ud.e.l(yc.e, ud.h):java.lang.String");
    }

    public static final boolean m(w wVar, se.k0 k0Var, Set set) {
        boolean zM;
        if (jc.l.a(wVar.t(), k0Var)) {
            return true;
        }
        yc.h hVarH = wVar.t().h();
        yc.i iVar = hVarH instanceof yc.i ? (yc.i) hVarH : null;
        List listL = iVar != null ? iVar.L() : null;
        Iterable iterableL0 = vb.m.L0(wVar.q());
        if (!(iterableL0 instanceof Collection) || !((Collection) iterableL0).isEmpty()) {
            Iterator it = iterableL0.iterator();
            do {
                df.b bVar = (df.b) it;
                if (bVar.f5974b.hasNext()) {
                    vb.u uVar = (vb.u) bVar.next();
                    int i10 = uVar.f22822a;
                    n0 n0Var = (n0) uVar.f22823b;
                    q0 q0Var = listL != null ? (q0) vb.m.b0(i10, listL) : null;
                    if ((q0Var == null || set == null || !set.contains(q0Var)) && !n0Var.c()) {
                        w wVarB = n0Var.b();
                        jc.l.d(wVarB, "getType(...)");
                        zM = m(wVarB, k0Var, set);
                    } else {
                        zM = false;
                    }
                }
            } while (!zM);
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public static final List n(wd.k kVar, f0 f0Var) {
        jc.l.e(kVar, "<this>");
        List list = kVar.f23813m;
        boolean zIsEmpty = list.isEmpty();
        ?? arrayList = list;
        if (zIsEmpty) {
            arrayList = 0;
        }
        if (arrayList == 0) {
            List list2 = kVar.f23814n;
            jc.l.d(list2, "getContextReceiverTypeIdList(...)");
            List<Integer> list3 = list2;
            arrayList = new ArrayList(vb.n.K(list3, 10));
            for (Integer num : list3) {
                jc.l.b(num);
                arrayList.add(f0Var.b(num.intValue()));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public static final List o(b0 b0Var, f0 f0Var) {
        jc.l.e(b0Var, "<this>");
        List list = b0Var.f23560l;
        boolean zIsEmpty = list.isEmpty();
        ?? arrayList = list;
        if (zIsEmpty) {
            arrayList = 0;
        }
        if (arrayList == 0) {
            List list2 = b0Var.f23561m;
            jc.l.d(list2, "getContextReceiverTypeIdList(...)");
            List<Integer> list3 = list2;
            arrayList = new ArrayList(vb.n.K(list3, 10));
            for (Integer num : list3) {
                jc.l.b(num);
                arrayList.add(f0Var.b(num.intValue()));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public static final List p(j0 j0Var, f0 f0Var) {
        jc.l.e(j0Var, "<this>");
        List list = j0Var.f23787l;
        boolean zIsEmpty = list.isEmpty();
        ?? arrayList = list;
        if (zIsEmpty) {
            arrayList = 0;
        }
        if (arrayList == 0) {
            List list2 = j0Var.f23788m;
            jc.l.d(list2, "getContextReceiverTypeIdList(...)");
            List<Integer> list3 = list2;
            arrayList = new ArrayList(vb.n.K(list3, 10));
            for (Integer num : list3) {
                jc.l.b(num);
                arrayList.add(f0Var.b(num.intValue()));
            }
        }
        return arrayList;
    }

    public static ug.a0 q(String str, ug.v vVar) {
        jc.l.e(str, "<this>");
        Charset charset = ef.a.f6541a;
        if (vVar != null) {
            Charset charsetA = ug.v.a(vVar);
            if (charsetA == null) {
                vVar = vb.w.w(vVar + "; charset=utf-8");
            } else {
                charset = charsetA;
            }
        }
        byte[] bytes = str.getBytes(charset);
        jc.l.d(bytes, "getBytes(...)");
        int length = bytes.length;
        wg.e.a(bytes.length, 0, length);
        return new ug.a0(vVar, length, bytes);
    }

    public static final se.f0 r(w wVar, x0 x0Var, q0 q0Var) {
        jc.l.e(wVar, "type");
        if ((q0Var != null ? q0Var.e0() : null) == x0Var) {
            x0Var = x0.INVARIANT;
        }
        return new se.f0(wVar, x0Var);
    }

    public static boolean s(CharSequence charSequence, String str) {
        char c3;
        int length = charSequence.length();
        if (charSequence == str) {
            return true;
        }
        if (length == str.length()) {
            for (int i10 = 0; i10 < length; i10++) {
                if (charSequence.charAt(i10) == str.charAt(i10) || ((c3 = (char) ((r3 | ' ') - 97)) < 26 && c3 == ((char) ((r4 | ' ') - 97)))) {
                }
            }
            return true;
        }
        return false;
    }

    public static final t0 t(v0 v0Var, f0 f0Var) {
        int i10 = v0Var.f23995c;
        if ((i10 & 16) == 16) {
            t0 t0Var = v0Var.f24001i;
            jc.l.d(t0Var, "getExpandedType(...)");
            return t0Var;
        }
        if ((i10 & 32) == 32) {
            return f0Var.b(v0Var.f24002j);
        }
        throw new IllegalStateException("No expandedType in ProtoBuf.TypeAlias");
    }

    public static final void u(w wVar, a0 a0Var, LinkedHashSet linkedHashSet, Set set) {
        yc.h hVarH = wVar.t().h();
        if (hVarH instanceof q0) {
            if (!jc.l.a(wVar.t(), a0Var.t())) {
                linkedHashSet.add(hVarH);
                return;
            }
            for (w wVar2 : ((q0) hVarH).getUpperBounds()) {
                jc.l.b(wVar2);
                u(wVar2, a0Var, linkedHashSet, set);
            }
            return;
        }
        yc.h hVarH2 = wVar.t().h();
        yc.i iVar = hVarH2 instanceof yc.i ? (yc.i) hVarH2 : null;
        List listL = iVar != null ? iVar.L() : null;
        int i10 = 0;
        for (n0 n0Var : wVar.q()) {
            int i11 = i10 + 1;
            q0 q0Var = listL != null ? (q0) vb.m.b0(i10, listL) : null;
            if ((q0Var == null || set == null || !set.contains(q0Var)) && !n0Var.c() && !vb.m.S(linkedHashSet, n0Var.b().t().h()) && !jc.l.a(n0Var.b().t(), a0Var.t())) {
                w wVarB = n0Var.b();
                jc.l.d(wVarB, "getType(...)");
                u(wVarB, a0Var, linkedHashSet, set);
            }
            i10 = i11;
        }
    }

    public static final t0 v(t0 t0Var, f0 f0Var) {
        jc.l.e(t0Var, "<this>");
        int i10 = t0Var.f23950c;
        if ((i10 & 4) == 4) {
            return t0Var.f23954g;
        }
        if ((i10 & 8) == 8) {
            return f0Var.b(t0Var.f23955h);
        }
        return null;
    }

    public static final vc.i w(w wVar) {
        jc.l.e(wVar, "<this>");
        vc.i iVarG = wVar.t().g();
        jc.l.d(iVarG, "getBuiltIns(...)");
        return iVarG;
    }

    public static final ViewParent x(View view) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public static final w y(q0 q0Var) {
        Object obj;
        jc.l.e(q0Var, "<this>");
        List upperBounds = q0Var.getUpperBounds();
        jc.l.d(upperBounds, "getUpperBounds(...)");
        upperBounds.isEmpty();
        List upperBounds2 = q0Var.getUpperBounds();
        jc.l.d(upperBounds2, "getUpperBounds(...)");
        Iterator it = upperBounds2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            yc.h hVarH = ((w) next).t().h();
            yc.e eVar = hVarH instanceof yc.e ? (yc.e) hVarH : null;
            if (eVar != null && eVar.j() != yc.f.f26110b && eVar.j() != yc.f.f26113e) {
                obj = next;
                break;
            }
        }
        w wVar = (w) obj;
        if (wVar != null) {
            return wVar;
        }
        List upperBounds3 = q0Var.getUpperBounds();
        jc.l.d(upperBounds3, "getUpperBounds(...)");
        Object objY = vb.m.Y(upperBounds3);
        jc.l.d(objY, "first(...)");
        return (w) objY;
    }

    public static final t2.g z(y yVar) {
        t2.g gVar = yVar.f25434a;
        long j10 = yVar.f25435b;
        gVar.getClass();
        return gVar.subSequence(k0.e(j10), k0.d(j10));
    }

    public abstract int H(int i10);

    public abstract int M(int i10);

    @Override // v2.d
    public int d(int i10) {
        int iH = H(i10);
        if (iH == -1 || H(iH) == -1) {
            return -1;
        }
        return iH;
    }

    @Override // v2.d
    public int g(int i10) {
        int iM = M(i10);
        if (iM == -1 || M(iM) == -1) {
            return -1;
        }
        return iM;
    }

    @Override // v2.d
    public int i(int i10) {
        return M(i10);
    }

    @Override // v2.d
    public int j(int i10) {
        return H(i10);
    }
}
