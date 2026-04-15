package ce;

import com.tencent.bugly.beta.tinker.TinkerReport;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.Character;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.text.BreakIterator;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f3930d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f3931e;

    public g(byte b10, int i10) {
        this.f3927a = i10;
        switch (i10) {
            case 6:
                break;
            default:
                this.f3930d = new long[10];
                this.f3931e = new Object[10];
                break;
        }
    }

    public static int d(int i10, int i11) {
        return f(i11) + k(i10);
    }

    public static int e(int i10, int i11) {
        return f(i11) + k(i10);
    }

    public static int f(int i10) {
        if (i10 >= 0) {
            return i(i10);
        }
        return 10;
    }

    public static int g(int i10, b bVar) {
        return h(bVar) + k(i10);
    }

    public static int h(b bVar) {
        int iC = bVar.c();
        return i(iC) + iC;
    }

    public static int i(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int j(long j10) {
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (((-16384) & j10) == 0) {
            return 2;
        }
        if (((-2097152) & j10) == 0) {
            return 3;
        }
        if (((-268435456) & j10) == 0) {
            return 4;
        }
        if (((-34359738368L) & j10) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j10) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j10) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j10) == 0) {
            return 8;
        }
        return (j10 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int k(int i10) {
        return i(i10 << 3);
    }

    public static g u(OutputStream outputStream, int i10) {
        return new g(outputStream, new byte[i10]);
    }

    public int A(int i10) {
        b(i10);
        int iPreceding = ((BreakIterator) this.f3931e).preceding(i10);
        return (s(iPreceding) && o(iPreceding) && !r(iPreceding)) ? A(iPreceding) : iPreceding;
    }

    public void B() throws IOException {
        OutputStream outputStream = (OutputStream) this.f3931e;
        if (outputStream == null) {
            throw new androidx.media3.exoplayer.offline.e("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
        outputStream.write((byte[]) this.f3930d, 0, this.f3929c);
        this.f3929c = 0;
    }

    public void C(int i10, int i11, String str) {
        if (i10 > i11) {
            z2.a.a("start index must be less than or equal to end index: " + i10 + " > " + i11);
        }
        if (i10 < 0) {
            z2.a.a("start must be non-negative, but was " + i10);
        }
        m4.j jVar = (m4.j) this.f3931e;
        if (jVar == null) {
            int iMax = Math.max(TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK, str.length() + 128);
            char[] cArr = new char[iMax];
            int iMin = Math.min(i10, 64);
            int iMin2 = Math.min(((String) this.f3930d).length() - i11, 64);
            String str2 = (String) this.f3930d;
            int i12 = i10 - iMin;
            jc.l.c(str2, "null cannot be cast to non-null type java.lang.String");
            str2.getChars(i12, i10, cArr, 0);
            String str3 = (String) this.f3930d;
            int i13 = iMax - iMin2;
            int i14 = iMin2 + i11;
            jc.l.c(str3, "null cannot be cast to non-null type java.lang.String");
            str3.getChars(i11, i14, cArr, i13);
            str.getChars(0, str.length(), cArr, iMin);
            int length = str.length() + iMin;
            m4.j jVar2 = new m4.j((byte) 0, 5);
            jVar2.f14296b = iMax;
            jVar2.f14299e = cArr;
            jVar2.f14297c = length;
            jVar2.f14298d = i13;
            this.f3931e = jVar2;
            this.f3928b = i12;
            this.f3929c = i14;
            return;
        }
        int i15 = this.f3928b;
        int i16 = i10 - i15;
        int i17 = i11 - i15;
        if (i16 < 0 || i17 > jVar.f14296b - jVar.d()) {
            this.f3930d = toString();
            this.f3931e = null;
            this.f3928b = -1;
            this.f3929c = -1;
            C(i10, i11, str);
            return;
        }
        int length2 = str.length() - (i17 - i16);
        if (length2 > jVar.d()) {
            int iD = length2 - jVar.d();
            int i18 = jVar.f14296b;
            do {
                i18 *= 2;
            } while (i18 - jVar.f14296b < iD);
            char[] cArr2 = new char[i18];
            vb.l.j0((char[]) jVar.f14299e, cArr2, 0, 0, jVar.f14297c);
            int i19 = jVar.f14296b;
            int i20 = jVar.f14298d;
            int i21 = i19 - i20;
            int i22 = i18 - i21;
            vb.l.j0((char[]) jVar.f14299e, cArr2, i22, i20, i21 + i20);
            jVar.f14299e = cArr2;
            jVar.f14296b = i18;
            jVar.f14298d = i22;
        }
        int i23 = jVar.f14297c;
        if (i16 < i23 && i17 <= i23) {
            int i24 = i23 - i17;
            char[] cArr3 = (char[]) jVar.f14299e;
            vb.l.j0(cArr3, cArr3, jVar.f14298d - i24, i17, i23);
            jVar.f14297c = i16;
            jVar.f14298d -= i24;
        } else if (i16 >= i23 || i17 < i23) {
            int iD2 = jVar.d() + i16;
            int iD3 = jVar.d() + i17;
            int i25 = jVar.f14298d;
            char[] cArr4 = (char[]) jVar.f14299e;
            vb.l.j0(cArr4, cArr4, jVar.f14297c, i25, iD2);
            jVar.f14297c += iD2 - i25;
            jVar.f14298d = iD3;
        } else {
            jVar.f14298d = jVar.d() + i17;
            jVar.f14297c = i16;
        }
        str.getChars(0, str.length(), (char[]) jVar.f14299e, jVar.f14297c);
        jVar.f14297c = str.length() + jVar.f14297c;
    }

    public synchronized int D() {
        return this.f3929c;
    }

    public void E(int i10, int i11) throws IOException {
        Q(i10, 0);
        G(i11);
    }

    public void F(int i10, int i11) throws IOException {
        Q(i10, 0);
        G(i11);
    }

    public void G(int i10) throws IOException {
        if (i10 >= 0) {
            O(i10);
        } else {
            P(i10);
        }
    }

    public void H(int i10, b bVar) throws IOException {
        Q(i10, 2);
        I(bVar);
    }

    public void I(b bVar) throws IOException {
        O(bVar.c());
        bVar.f(this);
    }

    public void J(int i10) throws IOException {
        byte b10 = (byte) i10;
        if (this.f3929c == this.f3928b) {
            B();
        }
        byte[] bArr = (byte[]) this.f3930d;
        int i11 = this.f3929c;
        this.f3929c = i11 + 1;
        bArr[i11] = b10;
    }

    public void K(e eVar) throws IOException {
        int size = eVar.size();
        byte[] bArr = (byte[]) this.f3930d;
        int i10 = this.f3928b;
        int i11 = this.f3929c;
        int i12 = i10 - i11;
        if (i12 >= size) {
            eVar.j(0, i11, size, bArr);
            this.f3929c += size;
            return;
        }
        eVar.j(0, i11, i12, bArr);
        int i13 = size - i12;
        this.f3929c = i10;
        B();
        if (i13 <= i10) {
            eVar.j(i12, 0, i13, bArr);
            this.f3929c = i13;
            return;
        }
        OutputStream outputStream = (OutputStream) this.f3931e;
        if (i12 < 0) {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Source offset < 0: ");
            sb.append(i12);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i13 < 0) {
            StringBuilder sb2 = new StringBuilder(23);
            sb2.append("Length < 0: ");
            sb2.append(i13);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        int i14 = i12 + i13;
        if (i14 <= eVar.size()) {
            if (i13 > 0) {
                eVar.u(outputStream, i12, i13);
            }
        } else {
            StringBuilder sb3 = new StringBuilder(39);
            sb3.append("Source end offset exceeded: ");
            sb3.append(i14);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }

    public void L(byte[] bArr) throws IOException {
        int length = bArr.length;
        byte[] bArr2 = (byte[]) this.f3930d;
        int i10 = this.f3928b;
        int i11 = this.f3929c;
        int i12 = i10 - i11;
        if (i12 >= length) {
            System.arraycopy(bArr, 0, bArr2, i11, length);
            this.f3929c += length;
            return;
        }
        System.arraycopy(bArr, 0, bArr2, i11, i12);
        int i13 = length - i12;
        this.f3929c = i10;
        B();
        if (i13 > i10) {
            ((OutputStream) this.f3931e).write(bArr, i12, i13);
        } else {
            System.arraycopy(bArr, i12, bArr2, 0, i13);
            this.f3929c = i13;
        }
    }

    public void M(int i10) throws IOException {
        J(i10 & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK);
        J((i10 >> 8) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK);
        J((i10 >> 16) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK);
        J((i10 >> 24) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK);
    }

    public void N(long j10) throws IOException {
        J(((int) j10) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK);
        J(((int) (j10 >> 8)) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK);
        J(((int) (j10 >> 16)) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK);
        J(((int) (j10 >> 24)) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK);
        J(((int) (j10 >> 32)) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK);
        J(((int) (j10 >> 40)) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK);
        J(((int) (j10 >> 48)) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK);
        J(((int) (j10 >> 56)) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK);
    }

    public void O(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            J((i10 & 127) | 128);
            i10 >>>= 7;
        }
        J(i10);
    }

    public void P(long j10) throws IOException {
        while (((-128) & j10) != 0) {
            J((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        J((int) j10);
    }

    public void Q(int i10, int i11) throws IOException {
        O((i10 << 3) | i11);
    }

    public synchronized void a(long j10, Object obj) {
        if (this.f3929c > 0) {
            if (j10 <= ((long[]) this.f3930d)[((this.f3928b + r0) - 1) % ((Object[]) this.f3931e).length]) {
                c();
            }
        }
        l();
        int i10 = this.f3928b;
        int i11 = this.f3929c;
        Object[] objArr = (Object[]) this.f3931e;
        int length = (i10 + i11) % objArr.length;
        ((long[]) this.f3930d)[length] = j10;
        objArr[length] = obj;
        this.f3929c = i11 + 1;
    }

    public void b(int i10) {
        int i11 = this.f3928b;
        int i12 = this.f3929c;
        boolean z10 = false;
        if (i10 <= i12 && i11 <= i10) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        z2.a.a("Invalid offset: " + i10 + ". Valid range is [" + i11 + " , " + i12 + ']');
    }

    public synchronized void c() {
        this.f3928b = 0;
        this.f3929c = 0;
        Arrays.fill((Object[]) this.f3931e, (Object) null);
    }

    public void l() {
        int length = ((Object[]) this.f3931e).length;
        if (this.f3929c < length) {
            return;
        }
        int i10 = length * 2;
        long[] jArr = new long[i10];
        Object[] objArr = new Object[i10];
        int i11 = this.f3928b;
        int i12 = length - i11;
        System.arraycopy((long[]) this.f3930d, i11, jArr, 0, i12);
        System.arraycopy((Object[]) this.f3931e, this.f3928b, objArr, 0, i12);
        int i13 = this.f3928b;
        if (i13 > 0) {
            System.arraycopy((long[]) this.f3930d, 0, jArr, i12, i13);
            System.arraycopy((Object[]) this.f3931e, 0, objArr, i12, this.f3928b);
        }
        this.f3930d = jArr;
        this.f3931e = objArr;
        this.f3928b = 0;
    }

    public void m() throws IOException {
        if (((OutputStream) this.f3931e) != null) {
            B();
        }
    }

    public int n() {
        m4.j jVar = (m4.j) this.f3931e;
        if (jVar == null) {
            return ((String) this.f3930d).length();
        }
        return (jVar.f14296b - jVar.d()) + (((String) this.f3930d).length() - (this.f3929c - this.f3928b));
    }

    public boolean o(int i10) {
        CharSequence charSequence = (CharSequence) this.f3930d;
        int i11 = this.f3928b + 1;
        if (i10 > this.f3929c || i11 > i10) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointBefore(charSequence, i10))) {
            int i12 = i10 - 1;
            if (!Character.isSurrogate(charSequence.charAt(i12))) {
                if (!c4.k.d()) {
                    return false;
                }
                c4.k kVarA = c4.k.a();
                if (kVarA.c() != 1 || kVarA.b(charSequence, i12) == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean p(int i10) {
        int i11 = this.f3928b + 1;
        if (i10 > this.f3929c || i11 > i10) {
            return false;
        }
        return ud.n.v(Character.codePointBefore((CharSequence) this.f3930d, i10));
    }

    public boolean q(int i10) {
        b(i10);
        if (!((BreakIterator) this.f3931e).isBoundary(i10)) {
            return false;
        }
        if (s(i10) && s(i10 - 1) && s(i10 + 1)) {
            return false;
        }
        return i10 <= 0 || i10 >= ((CharSequence) this.f3930d).length() - 1 || !(r(i10) || r(i10 + 1));
    }

    public boolean r(int i10) {
        CharSequence charSequence = (CharSequence) this.f3930d;
        int i11 = i10 - 1;
        Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(charSequence.charAt(i11));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (jc.l.a(unicodeBlockOf, unicodeBlock) && jc.l.a(Character.UnicodeBlock.of(charSequence.charAt(i10)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return jc.l.a(Character.UnicodeBlock.of(charSequence.charAt(i10)), unicodeBlock) && jc.l.a(Character.UnicodeBlock.of(charSequence.charAt(i11)), Character.UnicodeBlock.KATAKANA);
    }

    public boolean s(int i10) {
        CharSequence charSequence = (CharSequence) this.f3930d;
        int i11 = this.f3928b;
        if (i10 >= this.f3929c || i11 > i10) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointAt(charSequence, i10)) && !Character.isSurrogate(charSequence.charAt(i10))) {
            if (!c4.k.d()) {
                return false;
            }
            c4.k kVarA = c4.k.a();
            if (kVarA.c() != 1 || kVarA.b(charSequence, i10) == -1) {
                return false;
            }
        }
        return true;
    }

    public boolean t(int i10) {
        int i11 = this.f3928b;
        if (i10 >= this.f3929c || i11 > i10) {
            return false;
        }
        return ud.n.v(Character.codePointAt((CharSequence) this.f3930d, i10));
    }

    public String toString() {
        switch (this.f3927a) {
            case 6:
                m4.j jVar = (m4.j) this.f3931e;
                if (jVar == null) {
                    return (String) this.f3930d;
                }
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) this.f3930d, 0, this.f3928b);
                sb.append((char[]) jVar.f14299e, 0, jVar.f14297c);
                char[] cArr = (char[]) jVar.f14299e;
                int i10 = jVar.f14298d;
                sb.append(cArr, i10, jVar.f14296b - i10);
                String str = (String) this.f3930d;
                sb.append((CharSequence) str, this.f3929c, str.length());
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public int v(int i10) {
        b(i10);
        int iFollowing = ((BreakIterator) this.f3931e).following(i10);
        return (s(iFollowing + (-1)) && s(iFollowing) && !r(iFollowing)) ? v(iFollowing) : iFollowing;
    }

    public Object w(long j10, boolean z10) {
        Object objZ = null;
        long j11 = Long.MAX_VALUE;
        while (this.f3929c > 0) {
            long j12 = j10 - ((long[]) this.f3930d)[this.f3928b];
            if (j12 < 0 && (z10 || (-j12) >= j11)) {
                break;
            }
            objZ = z();
            j11 = j12;
        }
        return objZ;
    }

    public synchronized Object x() {
        return this.f3929c == 0 ? null : z();
    }

    public synchronized Object y(long j10) {
        return w(j10, true);
    }

    public Object z() {
        p4.c.i(this.f3929c > 0);
        Object[] objArr = (Object[]) this.f3931e;
        int i10 = this.f3928b;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.f3928b = (i10 + 1) % objArr.length;
        this.f3929c--;
        return obj;
    }

    public g(CharSequence charSequence, int i10, Locale locale) {
        this.f3927a = 5;
        this.f3930d = charSequence;
        if (charSequence.length() < 0) {
            z2.a.a("input start index is outside the CharSequence");
        }
        if (i10 < 0 || i10 > charSequence.length()) {
            z2.a.a("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.f3931e = wordInstance;
        this.f3928b = Math.max(0, -50);
        this.f3929c = Math.min(charSequence.length(), i10 + 50);
        wordInstance.setText(new u2.c(charSequence, i10));
    }

    public g(OutputStream outputStream, byte[] bArr) {
        this.f3927a = 0;
        this.f3931e = outputStream;
        this.f3930d = bArr;
        this.f3929c = 0;
        this.f3928b = bArr.length;
    }

    public g(int i10, int i11, float[] fArr, float[] fArr2) {
        this.f3927a = 3;
        this.f3928b = i10;
        p4.c.c(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
        this.f3930d = fArr;
        this.f3931e = fArr2;
        this.f3929c = i11;
    }

    public g(g gVar) {
        this.f3927a = 4;
        float[] fArr = (float[]) gVar.f3930d;
        this.f3928b = fArr.length / 3;
        this.f3930d = (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
        float[] fArr2 = (float[]) gVar.f3931e;
        this.f3931e = (FloatBuffer) ByteBuffer.allocateDirect(fArr2.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr2).flip();
        int i10 = gVar.f3929c;
        if (i10 == 1) {
            this.f3929c = 5;
        } else if (i10 != 2) {
            this.f3929c = 4;
        } else {
            this.f3929c = 6;
        }
    }

    public g(int i10) {
        this.f3927a = 1;
        this.f3930d = new l6.r[i10];
        this.f3929c = 0;
    }
}
