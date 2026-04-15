package ce;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d extends OutputStream {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f3909f = new byte[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3912c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3914e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3910a = 128;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f3911b = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f3913d = new byte[128];

    public final void b(int i10) {
        this.f3911b.add(new w(this.f3913d));
        int length = this.f3912c + this.f3913d.length;
        this.f3912c = length;
        this.f3913d = new byte[Math.max(this.f3910a, Math.max(i10, length >>> 1))];
        this.f3914e = 0;
    }

    public final void g() {
        int i10 = this.f3914e;
        byte[] bArr = this.f3913d;
        int length = bArr.length;
        ArrayList arrayList = this.f3911b;
        if (i10 >= length) {
            arrayList.add(new w(this.f3913d));
            this.f3913d = f3909f;
        } else if (i10 > 0) {
            byte[] bArr2 = new byte[i10];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i10));
            arrayList.add(new w(bArr2));
        }
        this.f3912c += this.f3914e;
        this.f3914e = 0;
    }

    public final synchronized e i() {
        ArrayList arrayList;
        g();
        arrayList = this.f3911b;
        if (!(arrayList != null)) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add((e) it.next());
            }
            arrayList = arrayList2;
        }
        return arrayList.isEmpty() ? e.f3915a : e.a(arrayList.iterator(), arrayList.size());
    }

    public final String toString() {
        int i10;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        synchronized (this) {
            i10 = this.f3912c + this.f3914e;
        }
        return String.format("<ByteString.Output@%s size=%d>", hexString, Integer.valueOf(i10));
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i10) {
        try {
            if (this.f3914e == this.f3913d.length) {
                b(1);
            }
            byte[] bArr = this.f3913d;
            int i11 = this.f3914e;
            this.f3914e = i11 + 1;
            bArr[i11] = (byte) i10;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i10, int i11) {
        try {
            byte[] bArr2 = this.f3913d;
            int length = bArr2.length;
            int i12 = this.f3914e;
            if (i11 <= length - i12) {
                System.arraycopy(bArr, i10, bArr2, i12, i11);
                this.f3914e += i11;
            } else {
                int length2 = bArr2.length - i12;
                System.arraycopy(bArr, i10, bArr2, i12, length2);
                int i13 = i11 - length2;
                b(i13);
                System.arraycopy(bArr, i10 + length2, this.f3913d, 0, i13);
                this.f3914e = i13;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
