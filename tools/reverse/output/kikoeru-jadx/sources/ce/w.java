package ce;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class w extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f3989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3990c = 0;

    public w(byte[] bArr) {
        this.f3989b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e) || size() != ((e) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof w) {
            return v((w) obj, 0, size());
        }
        if (obj instanceof b0) {
            return obj.equals(this);
        }
        String strValueOf = String.valueOf(obj.getClass());
        throw new IllegalArgumentException(j2.h0.n(new StringBuilder(strValueOf.length() + 49), "Has a new type of ByteString been created? Found ", strValueOf));
    }

    public final int hashCode() {
        int iP = this.f3990c;
        if (iP == 0) {
            int size = size();
            iP = p(size, 0, size);
            if (iP == 0) {
                iP = 1;
            }
            this.f3990c = iP;
        }
        return iP;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new v(this);
    }

    @Override // ce.e
    public void k(int i10, int i11, int i12, byte[] bArr) {
        System.arraycopy(this.f3989b, i10, bArr, i11, i12);
    }

    @Override // ce.e
    public final int l() {
        return 0;
    }

    @Override // ce.e
    public final boolean m() {
        return true;
    }

    @Override // ce.e
    public final boolean n() {
        byte[] bArr = this.f3989b;
        return f0.c(bArr, 0, bArr.length) == 0;
    }

    @Override // ce.e
    public final int p(int i10, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + this.f3989b[i13];
        }
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (r0[r9] > (-65)) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001c, code lost:
    
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0049, code lost:
    
        if (r0[r9] > (-65)) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0092, code lost:
    
        if (r0[r8] > (-65)) goto L59;
     */
    @Override // ce.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int q(int r8, int r9, int r10) {
        /*
            r7 = this;
            int r10 = r10 + r9
            byte[] r0 = r7.f3989b
            if (r8 == 0) goto L95
            if (r9 < r10) goto L8
            return r8
        L8:
            byte r1 = (byte) r8
            r2 = -32
            r3 = -1
            r4 = -65
            if (r1 >= r2) goto L1f
            r8 = -62
            if (r1 < r8) goto L94
            int r8 = r9 + 1
            r9 = r0[r9]
            if (r9 <= r4) goto L1c
            goto L94
        L1c:
            r9 = r8
            goto L95
        L1f:
            r5 = -16
            if (r1 >= r5) goto L4c
            int r8 = r8 >> 8
            int r8 = ~r8
            byte r8 = (byte) r8
            if (r8 != 0) goto L37
            int r8 = r9 + 1
            r9 = r0[r9]
            if (r8 < r10) goto L34
            int r8 = ce.f0.a(r1, r9)
            return r8
        L34:
            r6 = r9
            r9 = r8
            r8 = r6
        L37:
            if (r8 > r4) goto L94
            r5 = -96
            if (r1 != r2) goto L3f
            if (r8 < r5) goto L94
        L3f:
            r2 = -19
            if (r1 != r2) goto L45
            if (r8 >= r5) goto L94
        L45:
            int r8 = r9 + 1
            r9 = r0[r9]
            if (r9 <= r4) goto L1c
            goto L94
        L4c:
            int r2 = r8 >> 8
            int r2 = ~r2
            byte r2 = (byte) r2
            if (r2 != 0) goto L5f
            int r8 = r9 + 1
            r2 = r0[r9]
            if (r8 < r10) goto L5d
            int r8 = ce.f0.a(r1, r2)
            return r8
        L5d:
            r9 = 0
            goto L65
        L5f:
            int r8 = r8 >> 16
            byte r8 = (byte) r8
            r6 = r9
            r9 = r8
            r8 = r6
        L65:
            if (r9 != 0) goto L81
            int r9 = r8 + 1
            r8 = r0[r8]
            if (r9 < r10) goto L7e
            r9 = -12
            if (r1 > r9) goto L7d
            if (r2 > r4) goto L7d
            if (r8 <= r4) goto L76
            goto L7d
        L76:
            int r9 = r2 << 8
            r9 = r9 ^ r1
            int r8 = r8 << 16
            r8 = r8 ^ r9
            return r8
        L7d:
            return r3
        L7e:
            r6 = r9
            r9 = r8
            r8 = r6
        L81:
            if (r2 > r4) goto L94
            int r1 = r1 << 28
            int r2 = r2 + 112
            int r2 = r2 + r1
            int r1 = r2 >> 30
            if (r1 != 0) goto L94
            if (r9 > r4) goto L94
            int r9 = r8 + 1
            r8 = r0[r8]
            if (r8 <= r4) goto L95
        L94:
            return r3
        L95:
            int r8 = ce.f0.c(r0, r9, r10)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ce.w.q(int, int, int):int");
    }

    @Override // ce.e
    public final int r() {
        return this.f3990c;
    }

    @Override // ce.e
    public final String s() {
        byte[] bArr = this.f3989b;
        return new String(bArr, 0, bArr.length, "UTF-8");
    }

    @Override // ce.e
    public int size() {
        return this.f3989b.length;
    }

    @Override // ce.e
    public final void u(OutputStream outputStream, int i10, int i11) throws IOException {
        outputStream.write(this.f3989b, i10, i11);
    }

    public final boolean v(w wVar, int i10, int i11) {
        byte[] bArr = wVar.f3989b;
        int length = bArr.length;
        byte[] bArr2 = this.f3989b;
        if (i11 > length) {
            int length2 = bArr2.length;
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i11);
            sb.append(length2);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i10 + i11 <= bArr.length) {
            int i12 = 0;
            while (i12 < i11) {
                if (bArr2[i12] != bArr[i10]) {
                    return false;
                }
                i12++;
                i10++;
            }
            return true;
        }
        int length3 = wVar.f3989b.length;
        StringBuilder sb2 = new StringBuilder(59);
        sb2.append("Ran off end of other: ");
        sb2.append(i10);
        sb2.append(", ");
        sb2.append(i11);
        sb2.append(", ");
        sb2.append(length3);
        throw new IllegalArgumentException(sb2.toString());
    }
}
