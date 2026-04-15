package ch;

import a0.f0;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import ba.u0;
import com.tencent.bugly.beta.tinker.TinkerReport;
import hd.c1;
import hd.d1;
import hd.e1;
import hd.q0;
import hf.r1;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import lf.b1;
import lf.g1;
import lf.i0;
import lf.o0;
import lf.p0;
import q.t0;
import t2.l0;
import u3.x0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l implements t2.r, o6.d, ud.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f4201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f4202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f4203d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f4204e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f4205f;

    public /* synthetic */ l(boolean z10) {
        this.f4200a = 10;
    }

    public void A(Object obj, String str) {
        jc.l.e(str, "key");
        ((LinkedHashMap) this.f4201b).put(str, obj);
        i0 i0Var = (i0) ((LinkedHashMap) this.f4203d).get(str);
        if (i0Var != null) {
            ((b1) i0Var).l(obj);
        }
        i0 i0Var2 = (i0) ((LinkedHashMap) this.f4204e).get(str);
        if (i0Var2 != null) {
            ((b1) i0Var2).l(obj);
        }
    }

    public void B(String str) {
        jc.l.e(str, "url");
        if (ef.u.k0(str, "ws:", true)) {
            String strSubstring = str.substring(3);
            jc.l.d(strSubstring, "substring(...)");
            str = "http:".concat(strSubstring);
        } else if (ef.u.k0(str, "wss:", true)) {
            String strSubstring2 = str.substring(4);
            jc.l.d(strSubstring2, "substring(...)");
            str = "https:".concat(strSubstring2);
        }
        jc.l.e(str, "<this>");
        ug.s sVar = new ug.s();
        sVar.d(null, str);
        this.f4201b = sVar.b();
    }

    @Override // o6.d
    public int a(long j10) {
        long[] jArr = (long[]) this.f4202c;
        int iA = p4.c0.a(jArr, j10, false);
        if (iA < jArr.length) {
            return iA;
        }
        return -1;
    }

    @Override // ud.o, ud.p
    public void b() {
        ((id.h) this.f4202c).b();
        id.h hVar = (id.h) this.f4203d;
        ((HashMap) hVar.f9506c).put((be.e) this.f4204e, new ge.a((zc.b) vb.m.x0((ArrayList) this.f4205f)));
    }

    @Override // t2.r
    public boolean c() {
        ArrayList arrayList = (ArrayList) this.f4205f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((t2.q) arrayList.get(i10)).f20384a.c()) {
                return true;
            }
        }
        return false;
    }

    @Override // ud.o
    public void d(be.e eVar, Object obj) {
        ((id.h) this.f4201b).d(eVar, obj);
    }

    @Override // o6.d
    public long e(int i10) {
        return ((long[]) this.f4202c)[i10];
    }

    @Override // o6.d
    public List f(long j10) {
        u6.c cVar = (u6.c) this.f4201b;
        Map map = (Map) this.f4203d;
        HashMap map2 = (HashMap) this.f4204e;
        HashMap map3 = (HashMap) this.f4205f;
        ArrayList<Pair> arrayList = new ArrayList();
        cVar.g(j10, cVar.f21404h, arrayList);
        TreeMap treeMap = new TreeMap();
        cVar.i(j10, false, cVar.f21404h, treeMap);
        cVar.h(j10, map, map2, cVar.f21404h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                u6.f fVar = (u6.f) map2.get(pair.first);
                fVar.getClass();
                arrayList2.add(new o4.b(null, null, null, bitmapDecodeByteArray, fVar.f21424c, 0, fVar.f21426e, fVar.f21423b, 0, Integer.MIN_VALUE, -3.4028235E38f, fVar.f21427f, fVar.f21428g, false, -16777216, fVar.f21431j, 0.0f));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            u6.f fVar2 = (u6.f) map2.get(entry.getKey());
            fVar2.getClass();
            o4.a aVar = (o4.a) entry.getValue();
            CharSequence charSequence = aVar.f16171a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (u6.a aVar2 : (u6.a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), u6.a.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar2), spannableStringBuilder.getSpanEnd(aVar2), (CharSequence) "");
            }
            for (int i10 = 0; i10 < spannableStringBuilder.length(); i10++) {
                if (spannableStringBuilder.charAt(i10) == ' ') {
                    int i11 = i10 + 1;
                    int i12 = i11;
                    while (i12 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i12) == ' ') {
                        i12++;
                    }
                    int i13 = i12 - i11;
                    if (i13 > 0) {
                        spannableStringBuilder.delete(i10, i13 + i10);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i14 = 0; i14 < spannableStringBuilder.length() - 1; i14++) {
                if (spannableStringBuilder.charAt(i14) == '\n') {
                    int i15 = i14 + 1;
                    if (spannableStringBuilder.charAt(i15) == ' ') {
                        spannableStringBuilder.delete(i15, i14 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i16 = 0; i16 < spannableStringBuilder.length() - 1; i16++) {
                if (spannableStringBuilder.charAt(i16) == ' ') {
                    int i17 = i16 + 1;
                    if (spannableStringBuilder.charAt(i17) == '\n') {
                        spannableStringBuilder.delete(i16, i17);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f10 = fVar2.f21424c;
            int i18 = fVar2.f21425d;
            aVar.f16175e = f10;
            aVar.f16176f = i18;
            aVar.f16177g = fVar2.f21426e;
            aVar.f16178h = fVar2.f21423b;
            aVar.f16182l = fVar2.f21427f;
            float f11 = fVar2.f21430i;
            int i19 = fVar2.f21429h;
            aVar.f16181k = f11;
            aVar.f16180j = i19;
            aVar.f16186p = fVar2.f21431j;
            arrayList2.add(aVar.a());
        }
        return arrayList2;
    }

    @Override // o6.d
    public int g() {
        return ((long[]) this.f4202c).length;
    }

    @Override // ud.o
    public void h(be.e eVar, ge.f fVar) {
        ((id.h) this.f4201b).h(eVar, fVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ub.h] */
    @Override // t2.r
    public float i() {
        return ((Number) this.f4203d.getValue()).floatValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ub.h] */
    @Override // t2.r
    public float j() {
        return ((Number) this.f4204e.getValue()).floatValue();
    }

    @Override // ud.o
    public void k(be.e eVar, be.b bVar, be.e eVar2) {
        ((id.h) this.f4201b).k(eVar, bVar, eVar2);
    }

    @Override // ud.o
    public ud.p l(be.e eVar) {
        return ((id.h) this.f4201b).l(eVar);
    }

    public void m(m8.f fVar, Class cls) {
        ((ArrayList) this.f4204e).add(new ub.k(fVar, cls));
    }

    public void n(p8.a aVar, Class cls) {
        ((ArrayList) this.f4202c).add(new ub.k(aVar, cls));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.text.Bidi o(int r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.f4201b
            android.text.Layout r0 = (android.text.Layout) r0
            java.lang.Object r1 = r14.f4202c
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.Object r2 = r14.f4203d
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object r3 = r14.f4204e
            boolean[] r3 = (boolean[]) r3
            boolean r4 = r3[r15]
            if (r4 == 0) goto L1b
            java.lang.Object r15 = r2.get(r15)
            java.text.Bidi r15 = (java.text.Bidi) r15
            return r15
        L1b:
            r4 = 0
            if (r15 != 0) goto L20
            r5 = 0
            goto L2c
        L20:
            int r5 = r15 + (-1)
            java.lang.Object r5 = r1.get(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
        L2c:
            java.lang.Object r1 = r1.get(r15)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int r11 = r1 - r5
            java.lang.Object r6 = r14.f4205f
            char[] r6 = (char[]) r6
            if (r6 == 0) goto L44
            int r7 = r6.length
            if (r7 >= r11) goto L42
            goto L44
        L42:
            r7 = r6
            goto L47
        L44:
            char[] r6 = new char[r11]
            goto L42
        L47:
            java.lang.CharSequence r6 = r0.getText()
            android.text.TextUtils.getChars(r6, r5, r1, r7, r4)
            boolean r1 = java.text.Bidi.requiresBidi(r7, r4, r11)
            r5 = 0
            r13 = 1
            if (r1 == 0) goto L76
            int r1 = r14.v(r15)
            int r1 = r0.getLineForOffset(r1)
            int r0 = r0.getParagraphDirection(r1)
            r1 = -1
            if (r0 != r1) goto L67
            r12 = 1
            goto L68
        L67:
            r12 = 0
        L68:
            java.text.Bidi r6 = new java.text.Bidi
            r9 = 0
            r10 = 0
            r8 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            int r0 = r6.getRunCount()
            if (r0 != r13) goto L77
        L76:
            r6 = r5
        L77:
            r2.set(r15, r6)
            r3[r15] = r13
            if (r6 == 0) goto L87
            java.lang.Object r15 = r14.f4205f
            char[] r15 = (char[]) r15
            if (r7 != r15) goto L86
            r7 = r5
            goto L87
        L86:
            r7 = r15
        L87:
            r14.f4205f = r7
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.l.o(int):java.text.Bidi");
    }

    public void p(ug.g gVar) {
        jc.l.e(gVar, "cacheControl");
        String string = gVar.toString();
        if (string.length() == 0) {
            ((q0) this.f4202c).x("Cache-Control");
        } else {
            w("Cache-Control", string);
        }
    }

    @Override // ud.o
    public ud.o q(be.b bVar, be.e eVar) {
        return ((id.h) this.f4201b).q(bVar, eVar);
    }

    public e7.u r(int i10) {
        vb.j jVar = new vb.j();
        e7.w wVar = (e7.w) this.f4204e;
        jc.l.b(wVar);
        jVar.addLast(wVar);
        while (!jVar.isEmpty()) {
            e7.u uVar = (e7.u) jVar.removeFirst();
            if (uVar.f6400b.f8187a == i10) {
                return uVar;
            }
            if (uVar instanceof e7.w) {
                Iterator it = ((e7.w) uVar).iterator();
                while (true) {
                    h7.j jVar2 = (h7.j) it;
                    if (jVar2.hasNext()) {
                        jVar.addLast((e7.u) jVar2.next());
                    }
                }
            }
        }
        return null;
    }

    public float s(int i10, boolean z10) {
        Layout layout = (Layout) this.f4201b;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i10));
        if (i10 > lineEnd) {
            i10 = lineEnd;
        }
        return z10 ? layout.getPrimaryHorizontal(i10) : layout.getSecondaryHorizontal(i10);
    }

    public float t(boolean z10, int i10, boolean z11) {
        int i11;
        int i12;
        int iX = i10;
        Layout layout = (Layout) this.f4201b;
        if (!z11) {
            return s(iX, z10);
        }
        int iQ = x0.q(layout, iX, z11);
        int lineStart = layout.getLineStart(iQ);
        int lineEnd = layout.getLineEnd(iQ);
        if (iX != lineStart && iX != lineEnd) {
            return s(iX, z10);
        }
        if (iX == 0 || iX == layout.getText().length()) {
            return s(iX, z10);
        }
        int iU = u(iX, z11);
        boolean z12 = layout.getParagraphDirection(layout.getLineForOffset(v(iU))) == -1;
        int iX2 = x(lineEnd, lineStart);
        int iV = v(iU);
        int i13 = lineStart - iV;
        int i14 = iX2 - iV;
        Bidi bidiO = o(iU);
        Bidi bidiCreateLineBidi = bidiO != null ? bidiO.createLineBidi(i13, i14) : null;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = layout.isRtlCharAt(lineStart);
            if (z10 || z12 == zIsRtlCharAt) {
                z12 = !z12;
            }
            return iX == lineStart ? z12 : !z12 ? layout.getLineLeft(iQ) : layout.getLineRight(iQ);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        u2.e[] eVarArr = new u2.e[runCount];
        int i15 = 0;
        while (i15 < runCount) {
            int i16 = i15;
            eVarArr[i16] = new u2.e(bidiCreateLineBidi.getRunStart(i15) + lineStart, bidiCreateLineBidi.getRunLimit(i15) + lineStart, bidiCreateLineBidi.getRunLevel(i15) % 2 == 1);
            i15 = i16 + 1;
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i17 = 0; i17 < runCount2; i17++) {
            bArr[i17] = (byte) bidiCreateLineBidi.getRunLevel(i17);
        }
        Bidi.reorderVisually(bArr, 0, eVarArr, 0, runCount);
        if (iX == lineStart) {
            int i18 = 0;
            while (true) {
                if (i18 >= runCount) {
                    i12 = -1;
                    break;
                }
                if (eVarArr[i18].f21218a == iX) {
                    i12 = i18;
                    break;
                }
                i18++;
            }
            boolean z13 = (z10 || z12 == eVarArr[i12].f21220c) ? !z12 : z12;
            return (i12 == 0 && z13) ? layout.getLineLeft(iQ) : (i12 != runCount - 1 || z13) ? z13 ? layout.getPrimaryHorizontal(eVarArr[i12 - 1].f21218a) : layout.getPrimaryHorizontal(eVarArr[i12 + 1].f21218a) : layout.getLineRight(iQ);
        }
        if (iX > iX2) {
            iX = x(iX, lineStart);
        }
        int i19 = 0;
        while (true) {
            if (i19 >= runCount) {
                i11 = -1;
                break;
            }
            if (eVarArr[i19].f21219b == iX) {
                i11 = i19;
                break;
            }
            i19++;
        }
        boolean z14 = (z10 || z12 == eVarArr[i11].f21220c) ? z12 : !z12;
        return (i11 == 0 && z14) ? layout.getLineLeft(iQ) : (i11 != runCount - 1 || z14) ? z14 ? layout.getPrimaryHorizontal(eVarArr[i11 - 1].f21219b) : layout.getPrimaryHorizontal(eVarArr[i11 + 1].f21219b) : layout.getLineRight(iQ);
    }

    public String toString() {
        String str;
        switch (this.f4200a) {
            case 4:
                StringBuilder sb = new StringBuilder("KmVersionRequirement(kind=");
                e1 e1Var = (e1) this.f4201b;
                if (e1Var == null) {
                    jc.l.k("kind");
                    throw null;
                }
                sb.append(e1Var);
                sb.append(", level=");
                d1 d1Var = (d1) this.f4202c;
                if (d1Var == null) {
                    jc.l.k("level");
                    throw null;
                }
                sb.append(d1Var);
                sb.append(", version=");
                c1 c1Var = (c1) this.f4205f;
                if (c1Var == null) {
                    jc.l.k("version");
                    throw null;
                }
                sb.append(c1Var);
                sb.append(", errorCode=");
                sb.append((Integer) this.f4204e);
                sb.append(", message=");
                return t0.E(sb, (String) this.f4203d, ')');
            case 11:
                String str2 = (String) this.f4203d;
                StringBuilder sb2 = new StringBuilder("since ");
                sb2.append((yd.h) this.f4201b);
                sb2.append(' ');
                sb2.append((ub.d) this.f4204e);
                Integer num = (Integer) this.f4205f;
                String str3 = "";
                if (num != null) {
                    str = " error " + num.intValue();
                } else {
                    str = "";
                }
                sb2.append(str);
                if (str2 != null) {
                    str3 = ": " + str2;
                }
                sb2.append(str3);
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public int u(int i10, boolean z10) {
        ArrayList arrayList = (ArrayList) this.f4202c;
        int iE = ud.b.e(arrayList, Integer.valueOf(i10));
        int i11 = iE < 0 ? -(iE + 1) : iE + 1;
        if (z10 && i11 > 0) {
            int i12 = i11 - 1;
            if (i10 == ((Number) arrayList.get(i12)).intValue()) {
                return i12;
            }
        }
        return i11;
    }

    public int v(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return ((Number) ((ArrayList) this.f4202c).get(i10 - 1)).intValue();
    }

    public void w(String str, String str2) {
        jc.l.e(str2, "value");
        q0 q0Var = (q0) this.f4202c;
        q0Var.getClass();
        ua.j.n(str);
        ua.j.o(str2, str);
        q0Var.x(str);
        ua.j.h(q0Var, str, str2);
    }

    public int x(int i10, int i11) {
        while (i10 > i11) {
            char cCharAt = ((Layout) this.f4201b).getText().charAt(i10 - 1);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != 5760 && ((jc.l.g(cCharAt, 8192) < 0 || jc.l.g(cCharAt, 8202) > 0 || cCharAt == 8199) && cCharAt != 8287 && cCharAt != 12288)) {
                return i10;
            }
            i10--;
        }
        return i10;
    }

    public void y(String str, ug.b0 b0Var) {
        jc.l.e(str, "method");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        if (b0Var == null) {
            if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("QUERY") || str.equals("REPORT")) {
                throw new IllegalArgumentException(t0.D("method ", str, " must have a request body.").toString());
            }
        } else if (!gh.g.K(str)) {
            throw new IllegalArgumentException(t0.D("method ", str, " must not have a request body.").toString());
        }
        this.f4203d = str;
        this.f4204e = b0Var;
    }

    public void z(ug.a0 a0Var) {
        y("POST", a0Var);
    }

    public l(yd.h hVar, wd.e1 e1Var, ub.d dVar, Integer num, String str) {
        this.f4200a = 11;
        jc.l.e(e1Var, "kind");
        this.f4201b = hVar;
        this.f4202c = e1Var;
        this.f4204e = dVar;
        this.f4205f = num;
        this.f4203d = str;
    }

    public l(Map map) {
        this.f4200a = 2;
        jc.l.e(map, "initialState");
        this.f4201b = vb.w.C(map);
        this.f4202c = new LinkedHashMap();
        this.f4203d = new LinkedHashMap();
        this.f4204e = new LinkedHashMap();
        this.f4205f = new d.h(1, this);
    }

    public l(Layout layout) {
        this.f4200a = 7;
        this.f4201b = layout;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iV0 = ef.n.v0(((Layout) this.f4201b).getText(), '\n', length, 4);
            length = iV0 < 0 ? ((Layout) this.f4201b).getText().length() : iV0 + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < ((Layout) this.f4201b).getText().length());
        this.f4202c = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList2.add(null);
        }
        this.f4203d = arrayList2;
        this.f4204e = new boolean[((ArrayList) this.f4202c).size()];
        ((ArrayList) this.f4202c).size();
    }

    public l(lf.f fVar, k4.a aVar) {
        this.f4200a = 5;
        jc.l.e(fVar, "src");
        this.f4201b = new ah.j((byte) 0, 6);
        o0 o0VarA = p0.a(1, Integer.MAX_VALUE, kf.a.f11336a);
        this.f4202c = o0VarA;
        yb.c cVar = null;
        this.f4203d = new g1(o0VarA, new b0.x(7, this, cVar));
        r1 r1VarY = hf.a0.y(aVar, null, hf.z.f8617b, new u0(fVar, this, cVar, 10), 1);
        r1VarY.B(new f0(16, this));
        this.f4204e = r1VarY;
        this.f4205f = new i7.n(new u0(9, this, cVar));
    }

    public l(u6.c cVar, HashMap map, HashMap map2, HashMap map3) {
        this.f4200a = 8;
        this.f4201b = cVar;
        this.f4204e = map2;
        this.f4205f = map3;
        this.f4203d = Collections.unmodifiableMap(map);
        TreeSet treeSet = new TreeSet();
        int i10 = 0;
        cVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = ((Long) it.next()).longValue();
            i10++;
        }
        this.f4202c = jArr;
    }

    public l(t2.g gVar, l0 l0Var, List list, f3.c cVar, x2.d dVar) {
        String strSubstring;
        ArrayList arrayList;
        String str;
        List list2;
        t2.g gVar2 = gVar;
        l0 l0Var2 = l0Var;
        this.f4200a = 6;
        this.f4201b = gVar2;
        this.f4202c = list;
        final int i10 = 0;
        ic.a aVar = new ic.a(this) { // from class: t2.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ch.l f20376b;

            {
                this.f20376b = this;
            }

            @Override // ic.a
            public final Object b() {
                Object obj;
                Object obj2;
                switch (i10) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) this.f20376b.f4205f;
                        if (arrayList2.isEmpty()) {
                            obj = null;
                        } else {
                            Object obj3 = arrayList2.get(0);
                            float fI = ((q) obj3).f20384a.i();
                            int iR = ud.b.r(arrayList2);
                            int i11 = 1;
                            if (1 <= iR) {
                                while (true) {
                                    Object obj4 = arrayList2.get(i11);
                                    float fI2 = ((q) obj4).f20384a.i();
                                    if (Float.compare(fI, fI2) < 0) {
                                        obj3 = obj4;
                                        fI = fI2;
                                    }
                                    if (i11 != iR) {
                                        i11++;
                                    }
                                }
                            }
                            obj = obj3;
                        }
                        q qVar = (q) obj;
                        return Float.valueOf(qVar != null ? qVar.f20384a.i() : 0.0f);
                    default:
                        ArrayList arrayList3 = (ArrayList) this.f20376b.f4205f;
                        if (arrayList3.isEmpty()) {
                            obj2 = null;
                        } else {
                            Object obj5 = arrayList3.get(0);
                            float fC = ((q) obj5).f20384a.f1481i.c();
                            int iR2 = ud.b.r(arrayList3);
                            int i12 = 1;
                            if (1 <= iR2) {
                                while (true) {
                                    Object obj6 = arrayList3.get(i12);
                                    float fC2 = ((q) obj6).f20384a.f1481i.c();
                                    if (Float.compare(fC, fC2) < 0) {
                                        obj5 = obj6;
                                        fC = fC2;
                                    }
                                    if (i12 != iR2) {
                                        i12++;
                                    }
                                }
                            }
                            obj2 = obj5;
                        }
                        q qVar2 = (q) obj2;
                        return Float.valueOf(qVar2 != null ? qVar2.f20384a.f1481i.c() : 0.0f);
                }
            }
        };
        ub.i iVar = ub.i.f21541b;
        this.f4203d = ub.a.c(iVar, aVar);
        final int i11 = 1;
        this.f4204e = ub.a.c(iVar, new ic.a(this) { // from class: t2.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ch.l f20376b;

            {
                this.f20376b = this;
            }

            @Override // ic.a
            public final Object b() {
                Object obj;
                Object obj2;
                switch (i11) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) this.f20376b.f4205f;
                        if (arrayList2.isEmpty()) {
                            obj = null;
                        } else {
                            Object obj3 = arrayList2.get(0);
                            float fI = ((q) obj3).f20384a.i();
                            int iR = ud.b.r(arrayList2);
                            int i112 = 1;
                            if (1 <= iR) {
                                while (true) {
                                    Object obj4 = arrayList2.get(i112);
                                    float fI2 = ((q) obj4).f20384a.i();
                                    if (Float.compare(fI, fI2) < 0) {
                                        obj3 = obj4;
                                        fI = fI2;
                                    }
                                    if (i112 != iR) {
                                        i112++;
                                    }
                                }
                            }
                            obj = obj3;
                        }
                        q qVar = (q) obj;
                        return Float.valueOf(qVar != null ? qVar.f20384a.i() : 0.0f);
                    default:
                        ArrayList arrayList3 = (ArrayList) this.f20376b.f4205f;
                        if (arrayList3.isEmpty()) {
                            obj2 = null;
                        } else {
                            Object obj5 = arrayList3.get(0);
                            float fC = ((q) obj5).f20384a.f1481i.c();
                            int iR2 = ud.b.r(arrayList3);
                            int i12 = 1;
                            if (1 <= iR2) {
                                while (true) {
                                    Object obj6 = arrayList3.get(i12);
                                    float fC2 = ((q) obj6).f20384a.f1481i.c();
                                    if (Float.compare(fC, fC2) < 0) {
                                        obj5 = obj6;
                                        fC = fC2;
                                    }
                                    if (i12 != iR2) {
                                        i12++;
                                    }
                                }
                            }
                            obj2 = obj5;
                        }
                        q qVar2 = (q) obj2;
                        return Float.valueOf(qVar2 != null ? qVar2.f20384a.f1481i.c() : 0.0f);
                }
            }
        });
        t2.s sVar = l0Var2.f20363b;
        t2.g gVar3 = t2.h.f20325a;
        ArrayList arrayList2 = gVar2.f20322d;
        String str2 = gVar2.f20320b;
        vb.r rVar = vb.r.f22819a;
        List listC0 = arrayList2 != null ? vb.m.C0(arrayList2, new t2.f(i11)) : rVar;
        ArrayList arrayList3 = new ArrayList();
        vb.j jVar = new vb.j();
        int size = listC0.size();
        int i12 = 0;
        int i13 = 0;
        while (i12 < size) {
            t2.e eVar = (t2.e) listC0.get(i12);
            t2.s sVarA = sVar.a((t2.s) eVar.f20309a);
            int i14 = eVar.f20310b;
            int i15 = eVar.f20311c;
            if (i14 > i15) {
                z2.a.a("Reversed range is not supported");
            }
            while (i13 < i14 && !jVar.isEmpty()) {
                t2.e eVar2 = (t2.e) jVar.last();
                List list3 = listC0;
                int i16 = eVar2.f20311c;
                vb.r rVar2 = rVar;
                Object obj = eVar2.f20309a;
                if (i14 < i16) {
                    arrayList3.add(new t2.e(i13, i14, obj));
                    i13 = i14;
                    listC0 = list3;
                    rVar = rVar2;
                } else {
                    int i17 = size;
                    arrayList3.add(new t2.e(i13, i16, obj));
                    i13 = eVar2.f20311c;
                    while (!jVar.isEmpty() && i13 == ((t2.e) jVar.last()).f20311c) {
                        jVar.removeLast();
                    }
                    listC0 = list3;
                    rVar = rVar2;
                    size = i17;
                }
            }
            List list4 = listC0;
            vb.r rVar3 = rVar;
            int i18 = size;
            if (i13 < i14) {
                arrayList3.add(new t2.e(i13, i14, sVar));
                i13 = i14;
            }
            t2.e eVar3 = (t2.e) jVar.n();
            if (eVar3 != null) {
                int i19 = eVar3.f20311c;
                Object obj2 = eVar3.f20309a;
                int i20 = eVar3.f20310b;
                if (i20 == i14 && i19 == i15) {
                    jVar.removeLast();
                    jVar.addLast(new t2.e(i14, i15, ((t2.s) obj2).a(sVarA)));
                } else if (i20 == i19) {
                    arrayList3.add(new t2.e(i20, i19, obj2));
                    jVar.removeLast();
                    jVar.addLast(new t2.e(i14, i15, sVarA));
                } else if (i19 >= i15) {
                    jVar.addLast(new t2.e(i14, i15, ((t2.s) obj2).a(sVarA)));
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                jVar.addLast(new t2.e(i14, i15, sVarA));
            }
            i12++;
            listC0 = list4;
            rVar = rVar3;
            size = i18;
        }
        vb.r rVar4 = rVar;
        while (i13 <= str2.length() && !jVar.isEmpty()) {
            t2.e eVar4 = (t2.e) jVar.last();
            Object obj3 = eVar4.f20309a;
            int i21 = eVar4.f20311c;
            arrayList3.add(new t2.e(i13, i21, obj3));
            while (!jVar.isEmpty() && i21 == ((t2.e) jVar.last()).f20311c) {
                jVar.removeLast();
            }
            i13 = i21;
        }
        if (i13 < str2.length()) {
            arrayList3.add(new t2.e(i13, str2.length(), sVar));
        }
        if (arrayList3.isEmpty()) {
            arrayList3.add(new t2.e(0, 0, sVar));
        }
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        int size2 = arrayList3.size();
        int i22 = 0;
        while (i22 < size2) {
            t2.e eVar5 = (t2.e) arrayList3.get(i22);
            int i23 = eVar5.f20310b;
            int i24 = eVar5.f20311c;
            if (i23 != i24) {
                strSubstring = str2.substring(i23, i24);
                jc.l.d(strSubstring, "substring(...)");
            } else {
                strSubstring = "";
            }
            List listA = t2.h.a(gVar2, i23, i24, new sf.i(3));
            t2.g gVar4 = new t2.g(strSubstring, listA == null ? rVar4 : listA);
            t2.s sVar2 = (t2.s) eVar5.f20309a;
            if (sVar2.f20388b == Integer.MIN_VALUE) {
                arrayList = arrayList3;
                str = str2;
                sVar2 = new t2.s(sVar2.f20387a, sVar.f20388b, sVar2.f20389c, sVar2.f20390d, sVar2.f20391e, sVar2.f20392f, sVar2.f20393g, sVar2.f20394h, sVar2.f20395i);
            } else {
                arrayList = arrayList3;
                str = str2;
            }
            l0 l0Var3 = new l0(l0Var2.f20362a, sVar.a(sVar2));
            List list5 = gVar4.f20319a;
            List list6 = list5 == null ? rVar4 : list5;
            List list7 = (List) this.f4202c;
            ArrayList arrayList5 = new ArrayList(list7.size());
            int size3 = list7.size();
            int i25 = 0;
            while (i25 < size3) {
                t2.e eVar6 = (t2.e) list7.get(i25);
                int i26 = eVar6.f20310b;
                t2.s sVar3 = sVar;
                int i27 = eVar6.f20311c;
                if (t2.h.b(i23, i24, i26, i27)) {
                    if (i23 > i26 || i27 > i24) {
                        z2.a.a("placeholder can not overlap with paragraph.");
                    }
                    list2 = list7;
                    arrayList5.add(new t2.e(i26 - i23, i27 - i23, eVar6.f20309a));
                } else {
                    list2 = list7;
                }
                i25++;
                list7 = list2;
                sVar = sVar3;
            }
            arrayList4.add(new t2.q(new b3.c(strSubstring, l0Var3, list6, arrayList5, dVar, cVar), i23, i24));
            i22++;
            gVar2 = gVar;
            l0Var2 = l0Var;
            str2 = str;
            arrayList3 = arrayList;
        }
        this.f4205f = arrayList4;
    }

    public l(int i10) {
        this.f4200a = i10;
        switch (i10) {
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                this.f4205f = wg.a.f24220b;
                this.f4203d = "GET";
                this.f4202c = new q0((byte) 0, 5);
                break;
            case 12:
                this.f4201b = new HashMap();
                this.f4202c = new HashMap();
                this.f4203d = new HashMap();
                this.f4204e = new HashMap();
                this.f4205f = new HashMap();
                break;
        }
    }

    public l(e7.a0 a0Var) {
        Intent launchIntentForPackage;
        this.f4200a = 1;
        Context context = a0Var.f6298a;
        jc.l.e(context, "context");
        this.f4201b = context;
        this.f4202c = new c4.n(context, false);
        df.e eVar = new df.e(df.m.f0(df.m.b0(context, new d9.i(14)), new d9.i(15)));
        Activity activity = (Activity) (!eVar.hasNext() ? null : eVar.next());
        if (activity != null) {
            launchIntentForPackage = new Intent(context, activity.getClass());
        } else {
            launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                launchIntentForPackage = new Intent();
            }
        }
        launchIntentForPackage.addFlags(268468224);
        this.f4203d = launchIntentForPackage;
        this.f4205f = new ArrayList();
        this.f4204e = a0Var.f6299b.g();
    }

    public l(h8.b bVar) {
        this.f4200a = 3;
        this.f4201b = vb.m.H0(bVar.f8204a);
        this.f4202c = vb.m.H0(bVar.f8205b);
        this.f4203d = vb.m.H0(bVar.f8206c);
        this.f4204e = vb.m.H0(bVar.f8207d);
        this.f4205f = vb.m.H0(bVar.f8208e);
    }

    public l(id.h hVar, id.h hVar2, be.e eVar, ArrayList arrayList) {
        this.f4200a = 9;
        this.f4202c = hVar;
        this.f4203d = hVar2;
        this.f4204e = eVar;
        this.f4205f = arrayList;
        this.f4201b = hVar;
    }

    public l(yg.c cVar) {
        this.f4200a = 0;
        jc.l.e(cVar, "taskRunner");
        this.f4201b = cVar;
        this.f4204e = n.f4206a;
        this.f4205f = c.f4156a;
    }
}
