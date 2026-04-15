package h7;

import android.opengl.GLES20;
import android.util.SparseArray;
import android.util.SparseIntArray;
import b0.w1;
import ba.x;
import c7.e1;
import df.m;
import e7.t;
import e7.u;
import e7.w;
import ed.c0;
import ef.n;
import j2.h0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import m7.k0;
import o.v0;
import p4.r;
import p4.y;
import pd.e0;
import q.t0;
import r5.q;
import r5.z;
import y6.a0;
import y6.d0;
import yc.l;
import yc.q0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class k implements od.e, a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f8198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f8199d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f8200e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f8201f;

    public k(w1 w1Var, l lVar, sd.e eVar, int i10) {
        this.f8196a = 2;
        jc.l.e(w1Var, "c");
        jc.l.e(eVar, "typeParameterOwner");
        this.f8198c = w1Var;
        this.f8199d = lVar;
        this.f8197b = i10;
        ArrayList typeParameters = eVar.getTypeParameters();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = typeParameters.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), Integer.valueOf(i11));
            i11++;
        }
        this.f8200e = linkedHashMap;
        this.f8201f = ((re.l) ((od.a) ((w1) this.f8198c).f1395c).f16315a).c(new bd.a(13, this));
    }

    public static void d(int i10, int i11, String str) throws p4.j {
        int iGlCreateShader = GLES20.glCreateShader(i11);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        p4.c.e(GLES20.glGetShaderInfoLog(iGlCreateShader) + ", source: \n" + str, iArr[0] == 1);
        GLES20.glAttachShader(i10, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        p4.c.d();
    }

    public static /* synthetic */ void q(k kVar, String str, int i10, String str2, int i11) {
        if ((i11 & 2) != 0) {
            i10 = kVar.f8197b;
        }
        if ((i11 & 4) != 0) {
            str2 = "";
        }
        kVar.p(i10, str, str2);
        throw null;
    }

    public int A() {
        char cCharAt;
        int i10 = this.f8197b;
        if (i10 == -1) {
            return i10;
        }
        String str = (String) this.f8201f;
        while (i10 < str.length() && ((cCharAt = str.charAt(i10)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
            i10++;
        }
        this.f8197b = i10;
        return i10;
    }

    public boolean B() {
        int iA = A();
        String str = (String) this.f8201f;
        if (iA >= str.length() || iA == -1 || str.charAt(iA) != ',') {
            return false;
        }
        this.f8197b++;
        return true;
    }

    public boolean C(boolean z10) {
        int iZ = z(A());
        String str = (String) this.f8201f;
        int length = str.length() - iZ;
        if (length >= 4 && iZ != -1) {
            int i10 = 0;
            while (true) {
                if (i10 < 4) {
                    if ("null".charAt(i10) != str.charAt(iZ + i10)) {
                        break;
                    }
                    i10++;
                } else if (length <= 4 || yf.k.g(str.charAt(iZ + 4)) != 0) {
                    if (z10) {
                        this.f8197b = iZ + 4;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public void D(char c3) {
        String str = (String) this.f8201f;
        int i10 = this.f8197b;
        if (i10 > 0 && c3 == '\"') {
            try {
                this.f8197b = i10 - 1;
                String strN = n();
                this.f8197b = i10;
                if (jc.l.a(strN, "null")) {
                    p(this.f8197b - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th2) {
                this.f8197b = i10;
                throw th2;
            }
        }
        String strR = yf.k.r(yf.k.g(c3));
        int i11 = this.f8197b;
        int i12 = i11 - 1;
        q(this, "Expected " + strR + ", but had '" + ((i11 == str.length() || i12 < 0) ? "EOF" : String.valueOf(str.charAt(i12))) + "' instead", i12, null, 4);
        throw null;
    }

    @Override // od.e
    public q0 a(c0 c0Var) {
        jc.l.e(c0Var, "javaTypeParameter");
        e0 e0Var = (e0) ((re.j) this.f8201f).a(c0Var);
        return e0Var != null ? e0Var : ((od.e) ((w1) this.f8198c).f1396d).a(c0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0141  */
    @Override // y6.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(p4.s r38) {
        /*
            Method dump skipped, instruction units count: 774
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h7.k.b(p4.s):void");
    }

    public int e(CharSequence charSequence, int i10) {
        int i11 = i10 + 4;
        if (i11 < charSequence.length()) {
            ((StringBuilder) this.f8199d).append((char) (u(charSequence, i10 + 3) + (u(charSequence, i10) << 12) + (u(charSequence, i10 + 1) << 8) + (u(charSequence, i10 + 2) << 4)));
            return i11;
        }
        this.f8197b = i10;
        if (i11 < charSequence.length()) {
            return e(charSequence, this.f8197b);
        }
        q(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }

    public boolean f() {
        int i10 = this.f8197b;
        if (i10 == -1) {
            return false;
        }
        String str = (String) this.f8201f;
        while (i10 < str.length()) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f8197b = i10;
                return (cCharAt == ',' || cCharAt == ':' || cCharAt == ']' || cCharAt == '}') ? false : true;
            }
            i10++;
        }
        this.f8197b = i10;
        return false;
    }

    public void g(int i10, String str) {
        String str2 = (String) this.f8201f;
        if (str2.length() - i10 < str.length()) {
            q(this, "Unexpected end of boolean literal", 0, null, 6);
            throw null;
        }
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (str.charAt(i11) != (str2.charAt(i10 + i11) | ' ')) {
                q(this, "Expected valid boolean literal prefix, but had '" + n() + '\'', 0, null, 6);
                throw null;
            }
        }
        this.f8197b = str.length() + i10;
    }

    public String h() {
        StringBuilder sb = (StringBuilder) this.f8199d;
        String str = (String) this.f8201f;
        k('\"');
        int i10 = this.f8197b;
        int iV0 = n.v0(str, '\"', i10, 4);
        if (iV0 == -1) {
            n();
            int i11 = this.f8197b;
            q(this, t0.D("Expected quotation mark '\"', but had '", (i11 == str.length() || i11 < 0) ? "EOF" : String.valueOf(str.charAt(i11)), "' instead"), i11, null, 4);
            throw null;
        }
        int i12 = i10;
        while (i12 < iV0) {
            if (str.charAt(i12) == '\\') {
                int iZ = this.f8197b;
                char cCharAt = str.charAt(i12);
                boolean z10 = false;
                while (cCharAt != '\"') {
                    if (cCharAt == '\\') {
                        sb.append((CharSequence) str, iZ, i12);
                        int iZ2 = z(i12 + 1);
                        if (iZ2 == -1) {
                            q(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                            throw null;
                        }
                        int iE = iZ2 + 1;
                        char cCharAt2 = str.charAt(iZ2);
                        if (cCharAt2 == 'u') {
                            iE = e(str, iE);
                        } else {
                            char c3 = cCharAt2 < 'u' ? yf.d.f26282a[cCharAt2] : (char) 0;
                            if (c3 == 0) {
                                q(this, "Invalid escaped char '" + cCharAt2 + '\'', 0, null, 6);
                                throw null;
                            }
                            sb.append(c3);
                        }
                        iZ = z(iE);
                        if (iZ == -1) {
                            q(this, "Unexpected EOF", iZ, null, 4);
                            throw null;
                        }
                    } else {
                        i12++;
                        if (i12 >= str.length()) {
                            sb.append((CharSequence) str, iZ, i12);
                            iZ = z(i12);
                            if (iZ == -1) {
                                q(this, "Unexpected EOF", iZ, null, 4);
                                throw null;
                            }
                        } else {
                            continue;
                            cCharAt = str.charAt(i12);
                        }
                    }
                    i12 = iZ;
                    z10 = true;
                    cCharAt = str.charAt(i12);
                }
                String string = !z10 ? str.subSequence(iZ, i12).toString() : o(iZ, i12);
                this.f8197b = i12 + 1;
                return string;
            }
            i12++;
        }
        this.f8197b = iV0 + 1;
        String strSubstring = str.substring(i10, iV0);
        jc.l.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public byte i() {
        String str = (String) this.f8201f;
        int i10 = this.f8197b;
        while (i10 != -1 && i10 < str.length()) {
            int i11 = i10 + 1;
            char cCharAt = str.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f8197b = i11;
                return yf.k.g(cCharAt);
            }
            i10 = i11;
        }
        this.f8197b = str.length();
        return (byte) 10;
    }

    public byte j(byte b10) {
        String str = (String) this.f8201f;
        byte bI = i();
        if (bI == b10) {
            return bI;
        }
        String strR = yf.k.r(b10);
        int i10 = this.f8197b;
        int i11 = i10 - 1;
        q(this, "Expected " + strR + ", but had '" + ((i10 == str.length() || i11 < 0) ? "EOF" : String.valueOf(str.charAt(i11))) + "' instead", i11, null, 4);
        throw null;
    }

    public void k(char c3) {
        int i10 = this.f8197b;
        if (i10 == -1) {
            D(c3);
            throw null;
        }
        String str = (String) this.f8201f;
        while (i10 < str.length()) {
            int i11 = i10 + 1;
            char cCharAt = str.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f8197b = i11;
                if (cCharAt == c3) {
                    return;
                }
                D(c3);
                throw null;
            }
            i10 = i11;
        }
        this.f8197b = -1;
        D(c3);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x018f, code lost:
    
        throw new ce.j0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0190, code lost:
    
        r10 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0191, code lost:
    
        if (r14 == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0193, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0198, code lost:
    
        if (r10 == Long.MIN_VALUE) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x019b, code lost:
    
        return -r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x019c, code lost:
    
        q(r21, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01a1, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01a2, code lost:
    
        q(r21, "Expected numeric literal", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01a7, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ef, code lost:
    
        q(r21, "Unexpected symbol '" + r15 + "' in numeric literal", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0107, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x010a, code lost:
    
        if (r12 == r1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x010c, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x010e, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x010f, code lost:
    
        if (r1 == r12) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0111, code lost:
    
        if (r14 == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0115, code lost:
    
        if (r1 == (r12 - 1)) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x011c, code lost:
    
        if (r20 == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x011e, code lost:
    
        if (r3 == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0126, code lost:
    
        if (r2.charAt(r12) != '\"') goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0128, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x012b, code lost:
    
        q(r21, "Expected closing quotation mark", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0132, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0133, code lost:
    
        q(r21, "EOF", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0138, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0139, code lost:
    
        r21.f8197b = r12;
        r1 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x013d, code lost:
    
        if (r13 == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x013f, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0142, code lost:
    
        if (r11 != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0144, code lost:
    
        r3 = java.lang.Math.pow(10.0d, -r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x014c, code lost:
    
        if (r11 != true) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x014e, code lost:
    
        r3 = java.lang.Math.pow(10.0d, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0153, code lost:
    
        r1 = r1 * r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0159, code lost:
    
        if (r1 > 9.223372036854776E18d) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x015f, code lost:
    
        if (r1 < (-9.223372036854776E18d)) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0167, code lost:
    
        if (java.lang.Math.floor(r1) != r1) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0169, code lost:
    
        r10 = (long) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x016b, code lost:
    
        q(r21, "Can't convert " + r1 + " to Long", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0183, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0184, code lost:
    
        q(r21, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0189, code lost:
    
        throw null;
     */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.String, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long l() {
        /*
            Method dump skipped, instruction units count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h7.k.l():long");
    }

    public String m() {
        String str = (String) this.f8200e;
        if (str == null) {
            return h();
        }
        jc.l.b(str);
        this.f8200e = null;
        return str;
    }

    public String n() {
        String str = (String) this.f8201f;
        String str2 = (String) this.f8200e;
        if (str2 != null) {
            jc.l.b(str2);
            this.f8200e = null;
            return str2;
        }
        int iA = A();
        if (iA >= str.length() || iA == -1) {
            q(this, "EOF", iA, null, 4);
            throw null;
        }
        byte bG = yf.k.g(str.charAt(iA));
        if (bG == 1) {
            return m();
        }
        if (bG != 0) {
            q(this, "Expected beginning of the string, but got " + str.charAt(iA), 0, null, 6);
            throw null;
        }
        boolean z10 = false;
        while (yf.k.g(str.charAt(iA)) == 0) {
            iA++;
            if (iA >= str.length()) {
                ((StringBuilder) this.f8199d).append((CharSequence) str, this.f8197b, iA);
                int iZ = z(iA);
                if (iZ == -1) {
                    this.f8197b = iA;
                    return o(0, 0);
                }
                iA = iZ;
                z10 = true;
            }
        }
        String string = !z10 ? str.subSequence(this.f8197b, iA).toString() : o(this.f8197b, iA);
        this.f8197b = iA;
        return string;
    }

    public String o(int i10, int i11) {
        StringBuilder sb = (StringBuilder) this.f8199d;
        sb.append((CharSequence) this.f8201f, i10, i11);
        String string = sb.toString();
        jc.l.d(string, "toString(...)");
        sb.setLength(0);
        return string;
    }

    public void p(int i10, String str, String str2) {
        jc.l.e(str, "message");
        jc.l.e(str2, "hint");
        throw yf.k.e(i10, str + " at path: " + ((ah.j) this.f8198c).v() + (str2.length() == 0 ? "" : "\n".concat(str2)), (String) this.f8201f);
    }

    public u r(int i10) {
        return t(i10, (w) this.f8198c, null, false);
    }

    public u s(String str, boolean z10) {
        Object next;
        w wVar;
        jc.l.e(str, "route");
        v0 v0Var = (v0) this.f8199d;
        jc.l.e(v0Var, "<this>");
        Iterator it = ((df.a) m.W(new jc.b(1, v0Var))).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            u uVar = (u) next;
            if (ef.u.d0((String) uVar.f6400b.f8191e, str, false) || uVar.f6400b.c(str) != null) {
                break;
            }
        }
        u uVar2 = (u) next;
        if (uVar2 != null) {
            return uVar2;
        }
        if (!z10 || (wVar = ((w) this.f8198c).f6401c) == null) {
            return null;
        }
        k kVar = wVar.f6409f;
        kVar.getClass();
        if (n.y0(str)) {
            return null;
        }
        return kVar.s(str, true);
    }

    public u t(int i10, u uVar, u uVar2, boolean z10) {
        w wVar = (w) this.f8198c;
        v0 v0Var = (v0) this.f8199d;
        u uVarT = (u) v0Var.d(i10);
        if (uVar2 != null) {
            if (jc.l.a(uVarT, uVar2) && jc.l.a(uVarT.f6401c, uVar2.f6401c)) {
                return uVarT;
            }
            uVarT = null;
        } else if (uVarT != null) {
            return uVarT;
        }
        if (z10) {
            Iterator it = ((df.a) m.W(new jc.b(1, v0Var))).iterator();
            while (true) {
                if (!it.hasNext()) {
                    uVarT = null;
                    break;
                }
                u uVar3 = (u) it.next();
                uVarT = (!(uVar3 instanceof w) || uVar3.equals(uVar)) ? null : ((w) uVar3).f6409f.t(i10, wVar, uVar2, true);
                if (uVarT != null) {
                    break;
                }
            }
        }
        if (uVarT != null) {
            return uVarT;
        }
        w wVar2 = wVar.f6401c;
        if (wVar2 == null || wVar2.equals(uVar)) {
            return null;
        }
        w wVar3 = wVar.f6401c;
        jc.l.b(wVar3);
        return wVar3.f6409f.t(i10, wVar, uVar2, z10);
    }

    public String toString() {
        switch (this.f8196a) {
            case 5:
                StringBuilder sb = new StringBuilder("JsonReader(source='");
                sb.append(this.f8201f);
                sb.append("', currentPosition=");
                return h0.m(sb, this.f8197b, ')');
            default:
                return super.toString();
        }
    }

    public int u(CharSequence charSequence, int i10) {
        char cCharAt = charSequence.charAt(i10);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        q(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    public t v(t tVar, e1 e1Var, boolean z10, u uVar) {
        t tVarL;
        w wVar = (w) this.f8198c;
        ArrayList arrayList = new ArrayList();
        Iterator it = wVar.iterator();
        while (true) {
            j jVar = (j) it;
            if (!jVar.hasNext()) {
                break;
            }
            u uVar2 = (u) jVar.next();
            tVarL = jc.l.a(uVar2, uVar) ? null : uVar2.k(e1Var);
            if (tVarL != null) {
                arrayList.add(tVarL);
            }
        }
        t tVar2 = (t) vb.m.j0(arrayList);
        w wVar2 = wVar.f6401c;
        if (wVar2 != null && z10 && !wVar2.equals(uVar)) {
            tVarL = wVar2.l(e1Var, wVar);
        }
        return (t) vb.m.j0(vb.l.t0(new t[]{tVar, tVar2, tVarL}));
    }

    public String w(String str) {
        jc.l.e(str, "keyToMatch");
        int i10 = this.f8197b;
        try {
            if (i() == 6 && jc.l.a(y(), str)) {
                this.f8200e = null;
                if (i() == 5) {
                    return y();
                }
            }
            return null;
        } finally {
            this.f8197b = i10;
            this.f8200e = null;
        }
    }

    public byte x() {
        String str = (String) this.f8201f;
        int i10 = this.f8197b;
        while (true) {
            int iZ = z(i10);
            if (iZ == -1) {
                this.f8197b = iZ;
                return (byte) 10;
            }
            char cCharAt = str.charAt(iZ);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.f8197b = iZ;
                return yf.k.g(cCharAt);
            }
            i10 = iZ + 1;
        }
    }

    public String y() {
        if (x() != 1) {
            return null;
        }
        String strM = m();
        this.f8200e = strM;
        return strM;
    }

    public int z(int i10) {
        if (i10 < ((String) this.f8201f).length()) {
            return i10;
        }
        return -1;
    }

    public k(w wVar) {
        this.f8196a = 0;
        this.f8198c = wVar;
        this.f8199d = new v0(0);
    }

    public k() throws p4.j {
        this.f8196a = 3;
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.f8197b = iGlCreateProgram;
        p4.c.d();
        d(iGlCreateProgram, 35633, "uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n");
        d(iGlCreateProgram, 35632, "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        p4.c.e("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(iGlCreateProgram), iArr[0] == 1);
        GLES20.glUseProgram(iGlCreateProgram);
        this.f8200e = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35721, iArr2, 0);
        this.f8198c = new m3.l[iArr2[0]];
        for (int i10 = 0; i10 < iArr2[0]; i10++) {
            int i11 = this.f8197b;
            int[] iArr3 = new int[1];
            GLES20.glGetProgramiv(i11, 35722, iArr3, 0);
            int i12 = iArr3[0];
            byte[] bArr = new byte[i12];
            GLES20.glGetActiveAttrib(i11, i10, i12, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            int i13 = 0;
            while (true) {
                if (i13 >= i12) {
                    break;
                }
                if (bArr[i13] == 0) {
                    i12 = i13;
                    break;
                }
                i13++;
            }
            String str = new String(bArr, 0, i12);
            GLES20.glGetAttribLocation(i11, str);
            m3.l lVar = new m3.l(21);
            ((m3.l[]) this.f8198c)[i10] = lVar;
            ((HashMap) this.f8200e).put(str, lVar);
        }
        this.f8201f = new HashMap();
        int[] iArr4 = new int[1];
        GLES20.glGetProgramiv(this.f8197b, 35718, iArr4, 0);
        this.f8199d = new m3.l[iArr4[0]];
        for (int i14 = 0; i14 < iArr4[0]; i14++) {
            int i15 = this.f8197b;
            int[] iArr5 = new int[1];
            GLES20.glGetProgramiv(i15, 35719, iArr5, 0);
            int i16 = iArr5[0];
            byte[] bArr2 = new byte[i16];
            GLES20.glGetActiveUniform(i15, i14, i16, new int[1], 0, new int[1], 0, new int[1], 0, bArr2, 0);
            int i17 = 0;
            while (true) {
                if (i17 >= i16) {
                    break;
                }
                if (bArr2[i17] == 0) {
                    i16 = i17;
                    break;
                }
                i17++;
            }
            String str2 = new String(bArr2, 0, i16);
            GLES20.glGetUniformLocation(i15, str2);
            m3.l lVar2 = new m3.l(22);
            ((m3.l[]) this.f8199d)[i14] = lVar2;
            ((HashMap) this.f8201f).put(str2, lVar2);
        }
        p4.c.d();
    }

    public k(String str) {
        this.f8196a = 5;
        jc.l.e(str, "source");
        ah.j jVar = new ah.j(20, (char) 0);
        jVar.f391c = new Object[8];
        int[] iArr = new int[8];
        for (int i10 = 0; i10 < 8; i10++) {
            iArr[i10] = -1;
        }
        jVar.f392d = iArr;
        jVar.f390b = -1;
        this.f8198c = jVar;
        this.f8199d = new StringBuilder();
        this.f8201f = str;
    }

    public k(z zVar, x xVar, byte[] bArr, p4.f[] fVarArr, int i10) {
        this.f8196a = 1;
        this.f8198c = zVar;
        this.f8199d = xVar;
        this.f8200e = bArr;
        this.f8201f = fVarArr;
        this.f8197b = i10;
    }

    public k(d0 d0Var, int i10) {
        this.f8196a = 4;
        this.f8201f = d0Var;
        this.f8198c = new r(new byte[5], 5);
        this.f8199d = new SparseArray();
        this.f8200e = new SparseIntArray();
        this.f8197b = i10;
    }

    @Override // y6.a0
    public void c(y yVar, q qVar, k0 k0Var) {
    }
}
