package mb;

import com.tencent.bugly.beta.tinker.TinkerReport;
import j2.h0;
import java.io.Closeable;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;
import m3.l;
import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class a implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringReader f15066a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f15073h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f15074i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f15075j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int[] f15076k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String[] f15078m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int[] f15079n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f15080o = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char[] f15067b = new char[1024];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15068c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15069d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15070e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15071f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f15072g = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f15077l = 1;

    static {
        l.f14077b = new l(9);
    }

    public a(StringReader stringReader) {
        int[] iArr = new int[32];
        this.f15076k = iArr;
        iArr[0] = 6;
        this.f15078m = new String[32];
        this.f15079n = new int[32];
        this.f15066a = stringReader;
    }

    public final boolean B(char c3) throws c {
        if (c3 == '\t' || c3 == '\n' || c3 == '\f' || c3 == '\r' || c3 == ' ') {
            return false;
        }
        if (c3 != '#') {
            if (c3 == ',') {
                return false;
            }
            if (c3 != '/' && c3 != '=') {
                if (c3 == '{' || c3 == '}' || c3 == ':') {
                    return false;
                }
                if (c3 != ';') {
                    switch (c3) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        i();
        return false;
    }

    public final String D() {
        return " at line " + (this.f15070e + 1) + " column " + ((this.f15068c - this.f15071f) + 1) + " path " + u(false);
    }

    public final boolean G() throws IOException {
        int iK = this.f15072g;
        if (iK == 0) {
            iK = k();
        }
        if (iK == 5) {
            this.f15072g = 0;
            int[] iArr = this.f15079n;
            int i10 = this.f15077l - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        }
        if (iK != 6) {
            throw p0("a boolean");
        }
        this.f15072g = 0;
        int[] iArr2 = this.f15079n;
        int i11 = this.f15077l - 1;
        iArr2[i11] = iArr2[i11] + 1;
        return false;
    }

    public final double L() throws IOException {
        int iK = this.f15072g;
        if (iK == 0) {
            iK = k();
        }
        if (iK == 15) {
            this.f15072g = 0;
            int[] iArr = this.f15079n;
            int i10 = this.f15077l - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f15073h;
        }
        if (iK == 16) {
            this.f15075j = new String(this.f15067b, this.f15068c, this.f15074i);
            this.f15068c += this.f15074i;
        } else if (iK == 8 || iK == 9) {
            this.f15075j = e0(iK == 8 ? '\'' : '\"');
        } else if (iK == 10) {
            this.f15075j = g0();
        } else if (iK != 11) {
            throw p0("a double");
        }
        this.f15072g = 11;
        double d10 = Double.parseDouble(this.f15075j);
        if (this.f15080o != 1 && (Double.isNaN(d10) || Double.isInfinite(d10))) {
            o0("JSON forbids NaN and infinities: " + d10);
            throw null;
        }
        this.f15075j = null;
        this.f15072g = 0;
        int[] iArr2 = this.f15079n;
        int i11 = this.f15077l - 1;
        iArr2[i11] = iArr2[i11] + 1;
        return d10;
    }

    public final int O() throws IOException {
        int iK = this.f15072g;
        if (iK == 0) {
            iK = k();
        }
        if (iK == 15) {
            long j10 = this.f15073h;
            int i10 = (int) j10;
            if (j10 != i10) {
                throw new NumberFormatException("Expected an int but was " + this.f15073h + D());
            }
            this.f15072g = 0;
            int[] iArr = this.f15079n;
            int i11 = this.f15077l - 1;
            iArr[i11] = iArr[i11] + 1;
            return i10;
        }
        if (iK == 16) {
            this.f15075j = new String(this.f15067b, this.f15068c, this.f15074i);
            this.f15068c += this.f15074i;
        } else {
            if (iK != 8 && iK != 9 && iK != 10) {
                throw p0("an int");
            }
            if (iK == 10) {
                this.f15075j = g0();
            } else {
                this.f15075j = e0(iK == 8 ? '\'' : '\"');
            }
            try {
                int i12 = Integer.parseInt(this.f15075j);
                this.f15072g = 0;
                int[] iArr2 = this.f15079n;
                int i13 = this.f15077l - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return i12;
            } catch (NumberFormatException unused) {
            }
        }
        this.f15072g = 11;
        double d10 = Double.parseDouble(this.f15075j);
        int i14 = (int) d10;
        if (i14 != d10) {
            throw new NumberFormatException("Expected an int but was " + this.f15075j + D());
        }
        this.f15075j = null;
        this.f15072g = 0;
        int[] iArr3 = this.f15079n;
        int i15 = this.f15077l - 1;
        iArr3[i15] = iArr3[i15] + 1;
        return i14;
    }

    public final long R() throws IOException {
        int iK = this.f15072g;
        if (iK == 0) {
            iK = k();
        }
        if (iK == 15) {
            this.f15072g = 0;
            int[] iArr = this.f15079n;
            int i10 = this.f15077l - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f15073h;
        }
        if (iK == 16) {
            this.f15075j = new String(this.f15067b, this.f15068c, this.f15074i);
            this.f15068c += this.f15074i;
        } else {
            if (iK != 8 && iK != 9 && iK != 10) {
                throw p0("a long");
            }
            if (iK == 10) {
                this.f15075j = g0();
            } else {
                this.f15075j = e0(iK == 8 ? '\'' : '\"');
            }
            try {
                long j10 = Long.parseLong(this.f15075j);
                this.f15072g = 0;
                int[] iArr2 = this.f15079n;
                int i11 = this.f15077l - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return j10;
            } catch (NumberFormatException unused) {
            }
        }
        this.f15072g = 11;
        double d10 = Double.parseDouble(this.f15075j);
        long j11 = (long) d10;
        if (j11 != d10) {
            throw new NumberFormatException("Expected a long but was " + this.f15075j + D());
        }
        this.f15075j = null;
        this.f15072g = 0;
        int[] iArr3 = this.f15079n;
        int i12 = this.f15077l - 1;
        iArr3[i12] = iArr3[i12] + 1;
        return j11;
    }

    public final String X() throws IOException {
        String strE0;
        int iK = this.f15072g;
        if (iK == 0) {
            iK = k();
        }
        if (iK == 14) {
            strE0 = g0();
        } else if (iK == 12) {
            strE0 = e0('\'');
        } else {
            if (iK != 13) {
                throw p0("a name");
            }
            strE0 = e0('\"');
        }
        this.f15072g = 0;
        this.f15078m[this.f15077l - 1] = strE0;
        return strE0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0074, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int Y(boolean r10) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mb.a.Y(boolean):int");
    }

    public final void b() throws IOException {
        int iK = this.f15072g;
        if (iK == 0) {
            iK = k();
        }
        if (iK != 3) {
            throw p0("BEGIN_ARRAY");
        }
        i0(1);
        this.f15079n[this.f15077l - 1] = 0;
        this.f15072g = 0;
    }

    public final void c0() throws IOException {
        int iK = this.f15072g;
        if (iK == 0) {
            iK = k();
        }
        if (iK != 7) {
            throw p0("null");
        }
        this.f15072g = 0;
        int[] iArr = this.f15079n;
        int i10 = this.f15077l - 1;
        iArr[i10] = iArr[i10] + 1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f15072g = 0;
        this.f15076k[0] = 8;
        this.f15077l = 1;
        this.f15066a.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003d, code lost:
    
        r11.f15068c = r8;
        r8 = r8 - r3;
        r2 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
    
        if (r1 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0044, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r8 * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006b, code lost:
    
        if (r1 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006d, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007b, code lost:
    
        r1.append(r7, r3, r2 - r3);
        r11.f15068c = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String e0(char r12) throws mb.c {
        /*
            r11 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r11.f15068c
            int r3 = r11.f15069d
        L6:
            r4 = r3
            r3 = r2
        L8:
            r5 = 16
            r6 = 1
            char[] r7 = r11.f15067b
            if (r2 >= r4) goto L6b
            int r8 = r2 + 1
            char r2 = r7[r2]
            int r9 = r11.f15080o
            r10 = 3
            if (r9 != r10) goto L23
            r9 = 32
            if (r2 < r9) goto L1d
            goto L23
        L1d:
            java.lang.String r12 = "Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode"
            r11.o0(r12)
            throw r0
        L23:
            if (r2 != r12) goto L39
            r11.f15068c = r8
            int r8 = r8 - r3
            int r8 = r8 - r6
            if (r1 != 0) goto L31
            java.lang.String r12 = new java.lang.String
            r12.<init>(r7, r3, r8)
            return r12
        L31:
            r1.append(r7, r3, r8)
            java.lang.String r12 = r1.toString()
            return r12
        L39:
            r9 = 92
            if (r2 != r9) goto L5e
            r11.f15068c = r8
            int r8 = r8 - r3
            int r2 = r8 + (-1)
            if (r1 != 0) goto L4f
            int r8 = r8 * 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r4 = java.lang.Math.max(r8, r5)
            r1.<init>(r4)
        L4f:
            r1.append(r7, r3, r2)
            char r2 = r11.j0()
            r1.append(r2)
            int r2 = r11.f15068c
            int r3 = r11.f15069d
            goto L6
        L5e:
            r5 = 10
            if (r2 != r5) goto L69
            int r2 = r11.f15070e
            int r2 = r2 + r6
            r11.f15070e = r2
            r11.f15071f = r8
        L69:
            r2 = r8
            goto L8
        L6b:
            if (r1 != 0) goto L7b
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r4.<init>(r1)
            r1 = r4
        L7b:
            int r4 = r2 - r3
            r1.append(r7, r3, r4)
            r11.f15068c = r2
            boolean r2 = r11.q(r6)
            if (r2 == 0) goto L8a
            goto L2
        L8a:
            java.lang.String r12 = "Unterminated string"
            r11.o0(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mb.a.e0(char):java.lang.String");
    }

    public final String f0() throws IOException {
        String str;
        int iK = this.f15072g;
        if (iK == 0) {
            iK = k();
        }
        if (iK == 10) {
            str = g0();
        } else if (iK == 8) {
            str = e0('\'');
        } else if (iK == 9) {
            str = e0('\"');
        } else if (iK == 11) {
            str = this.f15075j;
            this.f15075j = null;
        } else if (iK == 15) {
            str = Long.toString(this.f15073h);
        } else {
            if (iK != 16) {
                throw p0("a string");
            }
            str = new String(this.f15067b, this.f15068c, this.f15074i);
            this.f15068c += this.f15074i;
        }
        this.f15072g = 0;
        int[] iArr = this.f15079n;
        int i10 = this.f15077l - 1;
        iArr[i10] = iArr[i10] + 1;
        return str;
    }

    public final void g() throws IOException {
        int iK = this.f15072g;
        if (iK == 0) {
            iK = k();
        }
        if (iK != 1) {
            throw p0("BEGIN_OBJECT");
        }
        i0(3);
        this.f15072g = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
    
        i();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String g0() throws mb.c {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = 0
        L3:
            int r3 = r7.f15068c
            int r4 = r3 + r2
            int r5 = r7.f15069d
            char[] r6 = r7.f15067b
            if (r4 >= r5) goto L4e
            int r3 = r3 + r2
            char r3 = r6[r3]
            r4 = 9
            if (r3 == r4) goto L5a
            r4 = 10
            if (r3 == r4) goto L5a
            r4 = 12
            if (r3 == r4) goto L5a
            r4 = 13
            if (r3 == r4) goto L5a
            r4 = 32
            if (r3 == r4) goto L5a
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5a
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5a
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5a
            r4 = 58
            if (r3 == r4) goto L5a
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5a;
                case 92: goto L4a;
                case 93: goto L5a;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r7.i()
            goto L5a
        L4e:
            int r3 = r6.length
            if (r2 >= r3) goto L5c
            int r3 = r2 + 1
            boolean r3 = r7.q(r3)
            if (r3 == 0) goto L5a
            goto L3
        L5a:
            r1 = r2
            goto L7a
        L5c:
            if (r0 != 0) goto L69
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L69:
            int r3 = r7.f15068c
            r0.append(r6, r3, r2)
            int r3 = r7.f15068c
            int r3 = r3 + r2
            r7.f15068c = r3
            r2 = 1
            boolean r2 = r7.q(r2)
            if (r2 != 0) goto L2
        L7a:
            if (r0 != 0) goto L84
            java.lang.String r0 = new java.lang.String
            int r2 = r7.f15068c
            r0.<init>(r6, r2, r1)
            goto L8d
        L84:
            int r2 = r7.f15068c
            r0.append(r6, r2, r1)
            java.lang.String r0 = r0.toString()
        L8d:
            int r2 = r7.f15068c
            int r2 = r2 + r1
            r7.f15068c = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mb.a.g0():java.lang.String");
    }

    public final int h0() throws IOException {
        int iK = this.f15072g;
        if (iK == 0) {
            iK = k();
        }
        switch (iK) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            case 17:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    public final void i() throws c {
        if (this.f15080o == 1) {
            return;
        }
        o0("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        throw null;
    }

    public final void i0(int i10) {
        int i11 = this.f15077l;
        int[] iArr = this.f15076k;
        if (i11 == iArr.length) {
            int i12 = i11 * 2;
            this.f15076k = Arrays.copyOf(iArr, i12);
            this.f15079n = Arrays.copyOf(this.f15079n, i12);
            this.f15078m = (String[]) Arrays.copyOf(this.f15078m, i12);
        }
        int[] iArr2 = this.f15076k;
        int i13 = this.f15077l;
        this.f15077l = i13 + 1;
        iArr2[i13] = i10;
    }

    public final char j0() throws c {
        int i10;
        if (this.f15068c == this.f15069d && !q(1)) {
            o0("Unterminated escape sequence");
            throw null;
        }
        int i11 = this.f15068c;
        int i12 = i11 + 1;
        this.f15068c = i12;
        char[] cArr = this.f15067b;
        char c3 = cArr[i11];
        if (c3 != '\n') {
            if (c3 != '\"') {
                if (c3 != '\'') {
                    if (c3 != '/' && c3 != '\\') {
                        if (c3 == 'b') {
                            return '\b';
                        }
                        if (c3 == 'f') {
                            return '\f';
                        }
                        if (c3 == 'n') {
                            return '\n';
                        }
                        if (c3 == 'r') {
                            return '\r';
                        }
                        if (c3 == 't') {
                            return '\t';
                        }
                        if (c3 != 'u') {
                            o0("Invalid escape sequence");
                            throw null;
                        }
                        if (i11 + 5 > this.f15069d && !q(4)) {
                            o0("Unterminated escape sequence");
                            throw null;
                        }
                        int i13 = this.f15068c;
                        int i14 = i13 + 4;
                        int i15 = 0;
                        while (i13 < i14) {
                            char c10 = cArr[i13];
                            int i16 = i15 << 4;
                            if (c10 >= '0' && c10 <= '9') {
                                i10 = c10 - '0';
                            } else if (c10 >= 'a' && c10 <= 'f') {
                                i10 = c10 - 'W';
                            } else {
                                if (c10 < 'A' || c10 > 'F') {
                                    o0("Malformed Unicode escape \\u".concat(new String(cArr, this.f15068c, 4)));
                                    throw null;
                                }
                                i10 = c10 - '7';
                            }
                            i15 = i10 + i16;
                            i13++;
                        }
                        this.f15068c += 4;
                        return (char) i15;
                    }
                }
            }
            return c3;
        }
        if (this.f15080o == 3) {
            o0("Cannot escape a newline character in strict mode");
            throw null;
        }
        this.f15070e++;
        this.f15071f = i12;
        if (this.f15080o == 3) {
            o0("Invalid escaped character \"'\" in strict mode");
            throw null;
        }
        return c3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:169:0x0217, code lost:
    
        if (B(r12) != false) goto L125;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0187 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x026f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int k() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 791
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mb.a.k():int");
    }

    public final void k0(char c3) throws c {
        do {
            int i10 = this.f15068c;
            int i11 = this.f15069d;
            while (i10 < i11) {
                int i12 = i10 + 1;
                char c10 = this.f15067b[i10];
                if (c10 == c3) {
                    this.f15068c = i12;
                    return;
                }
                if (c10 == '\\') {
                    this.f15068c = i12;
                    j0();
                    i10 = this.f15068c;
                    i11 = this.f15069d;
                } else {
                    if (c10 == '\n') {
                        this.f15070e++;
                        this.f15071f = i12;
                    }
                    i10 = i12;
                }
            }
            this.f15068c = i10;
        } while (q(1));
        o0("Unterminated string");
        throw null;
    }

    public final void l0() {
        char c3;
        do {
            if (this.f15068c >= this.f15069d && !q(1)) {
                return;
            }
            int i10 = this.f15068c;
            int i11 = i10 + 1;
            this.f15068c = i11;
            c3 = this.f15067b[i10];
            if (c3 == '\n') {
                this.f15070e++;
                this.f15071f = i11;
                return;
            }
        } while (c3 != '\r');
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
    
        i();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m0() throws mb.c {
        /*
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.f15068c
            int r2 = r1 + r0
            int r3 = r4.f15069d
            if (r2 >= r3) goto L51
            char[] r2 = r4.f15067b
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L4b
            r2 = 10
            if (r1 == r2) goto L4b
            r2 = 12
            if (r1 == r2) goto L4b
            r2 = 13
            if (r1 == r2) goto L4b
            r2 = 32
            if (r1 == r2) goto L4b
            r2 = 35
            if (r1 == r2) goto L48
            r2 = 44
            if (r1 == r2) goto L4b
            r2 = 47
            if (r1 == r2) goto L48
            r2 = 61
            if (r1 == r2) goto L48
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L4b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L4b
            r2 = 58
            if (r1 == r2) goto L4b
            r2 = 59
            if (r1 == r2) goto L48
            switch(r1) {
                case 91: goto L4b;
                case 92: goto L48;
                case 93: goto L4b;
                default: goto L45;
            }
        L45:
            int r0 = r0 + 1
            goto L1
        L48:
            r4.i()
        L4b:
            int r1 = r4.f15068c
            int r1 = r1 + r0
            r4.f15068c = r1
            return
        L51:
            int r1 = r1 + r0
            r4.f15068c = r1
            r0 = 1
            boolean r0 = r4.q(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mb.a.m0():void");
    }

    public final void n() throws IOException {
        int iK = this.f15072g;
        if (iK == 0) {
            iK = k();
        }
        if (iK != 4) {
            throw p0("END_ARRAY");
        }
        int i10 = this.f15077l;
        this.f15077l = i10 - 1;
        int[] iArr = this.f15079n;
        int i11 = i10 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.f15072g = 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void n0() throws IOException {
        int i10 = 0;
        do {
            int iK = this.f15072g;
            if (iK == 0) {
                iK = k();
            }
            switch (iK) {
                case 1:
                    i0(3);
                    i10++;
                    this.f15072g = 0;
                    break;
                case 2:
                    if (i10 == 0) {
                        this.f15078m[this.f15077l - 1] = null;
                    }
                    this.f15077l--;
                    i10--;
                    this.f15072g = 0;
                    break;
                case 3:
                    i0(1);
                    i10++;
                    this.f15072g = 0;
                    break;
                case 4:
                    this.f15077l--;
                    i10--;
                    this.f15072g = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.f15072g = 0;
                    break;
                case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                    k0('\'');
                    this.f15072g = 0;
                    break;
                case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                    k0('\"');
                    this.f15072g = 0;
                    break;
                case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                    m0();
                    this.f15072g = 0;
                    break;
                case 12:
                    k0('\'');
                    if (i10 == 0) {
                        this.f15078m[this.f15077l - 1] = "<skipped>";
                    }
                    this.f15072g = 0;
                    break;
                case 13:
                    k0('\"');
                    if (i10 == 0) {
                        this.f15078m[this.f15077l - 1] = "<skipped>";
                    }
                    this.f15072g = 0;
                    break;
                case 14:
                    m0();
                    if (i10 == 0) {
                        this.f15078m[this.f15077l - 1] = "<skipped>";
                    }
                    this.f15072g = 0;
                    break;
                case 16:
                    this.f15068c += this.f15074i;
                    this.f15072g = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i10 > 0);
        int[] iArr = this.f15079n;
        int i11 = this.f15077l - 1;
        iArr[i11] = iArr[i11] + 1;
    }

    public final void o() throws IOException {
        int iK = this.f15072g;
        if (iK == 0) {
            iK = k();
        }
        if (iK != 2) {
            throw p0("END_OBJECT");
        }
        int i10 = this.f15077l;
        int i11 = i10 - 1;
        this.f15077l = i11;
        this.f15078m[i11] = null;
        int[] iArr = this.f15079n;
        int i12 = i10 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.f15072g = 0;
    }

    public final void o0(String str) throws c {
        StringBuilder sbP = h0.p(str);
        sbP.append(D());
        sbP.append("\nSee ");
        sbP.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("malformed-json"));
        throw new c(sbP.toString());
    }

    public final IllegalStateException p0(String str) {
        String str2 = h0() == 9 ? "adapter-not-null-safe" : "unexpected-json-structure";
        StringBuilder sbK = a0.c.K("Expected ", str, " but was ");
        sbK.append(h0.A(h0()));
        sbK.append(D());
        sbK.append("\nSee ");
        sbK.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(str2));
        return new IllegalStateException(sbK.toString());
    }

    public final boolean q(int i10) throws IOException {
        int i11;
        int i12;
        int i13 = this.f15071f;
        int i14 = this.f15068c;
        this.f15071f = i13 - i14;
        int i15 = this.f15069d;
        char[] cArr = this.f15067b;
        if (i15 != i14) {
            int i16 = i15 - i14;
            this.f15069d = i16;
            System.arraycopy(cArr, i14, cArr, 0, i16);
        } else {
            this.f15069d = 0;
        }
        this.f15068c = 0;
        do {
            int i17 = this.f15069d;
            int i18 = this.f15066a.read(cArr, i17, cArr.length - i17);
            if (i18 == -1) {
                return false;
            }
            i11 = this.f15069d + i18;
            this.f15069d = i11;
            if (this.f15070e == 0 && (i12 = this.f15071f) == 0 && i11 > 0 && cArr[0] == 65279) {
                this.f15068c++;
                this.f15071f = i12 + 1;
                i10++;
            }
        } while (i11 < i10);
        return true;
    }

    public final String toString() {
        return a.class.getSimpleName() + D();
    }

    public final String u(boolean z10) {
        StringBuilder sb = new StringBuilder("$");
        int i10 = 0;
        while (true) {
            int i11 = this.f15077l;
            if (i10 >= i11) {
                return sb.toString();
            }
            int i12 = this.f15076k[i10];
            switch (i12) {
                case 1:
                case 2:
                    int i13 = this.f15079n[i10];
                    if (z10 && i13 > 0 && i10 == i11 - 1) {
                        i13--;
                    }
                    sb.append('[');
                    sb.append(i13);
                    sb.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb.append('.');
                    String str = this.f15078m[i10];
                    if (str != null) {
                        sb.append(str);
                    }
                    break;
                case 6:
                case 7:
                case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                    break;
                default:
                    throw new AssertionError(t0.B(i12, "Unknown scope value: "));
            }
            i10++;
        }
    }

    public final boolean y() throws IOException {
        int iK = this.f15072g;
        if (iK == 0) {
            iK = k();
        }
        return (iK == 2 || iK == 4 || iK == 17) ? false : true;
    }
}
