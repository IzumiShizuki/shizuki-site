package mb;

import com.tencent.bugly.beta.tinker.TinkerReport;
import eb.i;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class b implements Closeable, Flushable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Pattern f15081l = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String[] f15082m = new String[128];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String[] f15083n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Writer f15084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f15085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i f15087d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f15088e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f15089f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f15090g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f15091h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f15092i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f15093j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f15094k;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f15082m[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f15082m;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f15083n = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public b(Writer writer) {
        int[] iArr = new int[32];
        this.f15085b = iArr;
        this.f15086c = 0;
        if (iArr.length == 0) {
            this.f15085b = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f15085b;
        int i10 = this.f15086c;
        this.f15086c = i10 + 1;
        iArr2[i10] = 6;
        this.f15091h = 2;
        this.f15094k = true;
        Objects.requireNonNull(writer, "out == null");
        this.f15084a = writer;
        D(i.f6449d);
    }

    public final int B() {
        int i10 = this.f15086c;
        if (i10 != 0) {
            return this.f15085b[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void D(i iVar) {
        Objects.requireNonNull(iVar);
        this.f15087d = iVar;
        this.f15089f = ",";
        if (iVar.f6452c) {
            this.f15088e = ": ";
            if (iVar.f6450a.isEmpty()) {
                this.f15089f = ", ";
            }
        } else {
            this.f15088e = ":";
        }
        this.f15090g = this.f15087d.f6450a.isEmpty() && this.f15087d.f6451b.isEmpty();
    }

    public final void G(int i10) {
        if (i10 == 0) {
            throw null;
        }
        this.f15091h = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.f15092i
            if (r0 == 0) goto L7
            java.lang.String[] r0 = mb.b.f15083n
            goto L9
        L7:
            java.lang.String[] r0 = mb.b.f15082m
        L9:
            java.io.Writer r1 = r8.f15084a
            r2 = 34
            r1.write(r2)
            int r3 = r9.length()
            r4 = 0
            r5 = 0
        L16:
            if (r4 >= r3) goto L41
            char r6 = r9.charAt(r4)
            r7 = 128(0x80, float:1.8E-43)
            if (r6 >= r7) goto L25
            r6 = r0[r6]
            if (r6 != 0) goto L32
            goto L3e
        L25:
            r7 = 8232(0x2028, float:1.1535E-41)
            if (r6 != r7) goto L2c
            java.lang.String r6 = "\\u2028"
            goto L32
        L2c:
            r7 = 8233(0x2029, float:1.1537E-41)
            if (r6 != r7) goto L3e
            java.lang.String r6 = "\\u2029"
        L32:
            if (r5 >= r4) goto L39
            int r7 = r4 - r5
            r1.write(r9, r5, r7)
        L39:
            r1.write(r6)
            int r5 = r4 + 1
        L3e:
            int r4 = r4 + 1
            goto L16
        L41:
            if (r5 >= r3) goto L47
            int r3 = r3 - r5
            r1.write(r9, r5, r3)
        L47:
            r1.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mb.b.L(java.lang.String):void");
    }

    public void O(double d10) throws IOException {
        e0();
        if (this.f15091h == 1 || !(Double.isNaN(d10) || Double.isInfinite(d10))) {
            b();
            this.f15084a.append((CharSequence) Double.toString(d10));
        } else {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d10);
        }
    }

    public void R(long j10) throws IOException {
        e0();
        b();
        this.f15084a.write(Long.toString(j10));
    }

    public void X(Number number) throws IOException {
        if (number == null) {
            y();
            return;
        }
        e0();
        String string = number.toString();
        if (!string.equals("-Infinity") && !string.equals("Infinity") && !string.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (cls != Integer.class && cls != Long.class && cls != Double.class && cls != Float.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class && !f15081l.matcher(string).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + string);
            }
        } else if (this.f15091h != 1) {
            throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(string));
        }
        b();
        this.f15084a.append((CharSequence) string);
    }

    public void Y(String str) throws IOException {
        if (str == null) {
            y();
            return;
        }
        e0();
        b();
        L(str);
    }

    public final void b() throws IOException {
        int iB = B();
        if (iB == 1) {
            this.f15085b[this.f15086c - 1] = 2;
            u();
            return;
        }
        Writer writer = this.f15084a;
        if (iB == 2) {
            writer.append((CharSequence) this.f15089f);
            u();
        } else {
            if (iB == 4) {
                writer.append((CharSequence) this.f15088e);
                this.f15085b[this.f15086c - 1] = 5;
                return;
            }
            if (iB != 6) {
                if (iB != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (this.f15091h != 1) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.f15085b[this.f15086c - 1] = 7;
        }
    }

    public void c0(boolean z10) throws IOException {
        e0();
        b();
        this.f15084a.write(z10 ? "true" : "false");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f15084a.close();
        int i10 = this.f15086c;
        if (i10 > 1 || (i10 == 1 && this.f15085b[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f15086c = 0;
    }

    public final void e0() throws IOException {
        if (this.f15093j != null) {
            int iB = B();
            if (iB == 5) {
                this.f15084a.write(this.f15089f);
            } else if (iB != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            u();
            this.f15085b[this.f15086c - 1] = 4;
            L(this.f15093j);
            this.f15093j = null;
        }
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.f15086c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f15084a.flush();
    }

    public void g() throws IOException {
        e0();
        b();
        int i10 = this.f15086c;
        int[] iArr = this.f15085b;
        if (i10 == iArr.length) {
            this.f15085b = Arrays.copyOf(iArr, i10 * 2);
        }
        int[] iArr2 = this.f15085b;
        int i11 = this.f15086c;
        this.f15086c = i11 + 1;
        iArr2[i11] = 1;
        this.f15084a.write(91);
    }

    public void i() throws IOException {
        e0();
        b();
        int i10 = this.f15086c;
        int[] iArr = this.f15085b;
        if (i10 == iArr.length) {
            this.f15085b = Arrays.copyOf(iArr, i10 * 2);
        }
        int[] iArr2 = this.f15085b;
        int i11 = this.f15086c;
        this.f15086c = i11 + 1;
        iArr2[i11] = 3;
        this.f15084a.write(TinkerReport.KEY_APPLIED_DEXOPT_FORMAT);
    }

    public final void k(int i10, int i11, char c3) throws IOException {
        int iB = B();
        if (iB != i11 && iB != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f15093j != null) {
            throw new IllegalStateException("Dangling name: " + this.f15093j);
        }
        this.f15086c--;
        if (iB == i11) {
            u();
        }
        this.f15084a.write(c3);
    }

    public void n() throws IOException {
        k(1, 2, ']');
    }

    public void o() throws IOException {
        k(3, 5, '}');
    }

    public void q(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f15093j != null) {
            throw new IllegalStateException("Already wrote a name, expecting a value.");
        }
        int iB = B();
        if (iB != 3 && iB != 5) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.f15093j = str;
    }

    public final void u() throws IOException {
        if (this.f15090g) {
            return;
        }
        String str = this.f15087d.f6450a;
        Writer writer = this.f15084a;
        writer.write(str);
        int i10 = this.f15086c;
        for (int i11 = 1; i11 < i10; i11++) {
            writer.write(this.f15087d.f6451b);
        }
    }

    public b y() throws IOException {
        if (this.f15093j != null) {
            if (!this.f15094k) {
                this.f15093j = null;
                return this;
            }
            e0();
        }
        b();
        this.f15084a.write("null");
        return this;
    }
}
