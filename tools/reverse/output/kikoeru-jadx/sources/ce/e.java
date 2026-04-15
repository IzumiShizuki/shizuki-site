package ce;

import b0.c1;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.Stack;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class e implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f3915a = new w(new byte[0]);

    public static e a(Iterator it, int i10) {
        if (i10 == 1) {
            return (e) it.next();
        }
        int i11 = i10 >>> 1;
        return a(it, i11).i(a(it, i10 - i11));
    }

    public static d o() {
        return new d();
    }

    public final e i(e eVar) {
        int size = size();
        int size2 = eVar.size();
        if (((long) size) + ((long) size2) >= 2147483647L) {
            StringBuilder sb = new StringBuilder(53);
            sb.append("ByteString would be too long: ");
            sb.append(size);
            sb.append("+");
            sb.append(size2);
            throw new IllegalArgumentException(sb.toString());
        }
        int[] iArr = b0.f3896h;
        b0 b0Var = this instanceof b0 ? (b0) this : null;
        if (eVar.size() == 0) {
            return this;
        }
        if (size() == 0) {
            return eVar;
        }
        int size3 = eVar.size() + size();
        if (size3 < 128) {
            int size4 = size();
            int size5 = eVar.size();
            byte[] bArr = new byte[size4 + size5];
            j(0, 0, size4, bArr);
            eVar.j(0, size4, size5, bArr);
            return new w(bArr);
        }
        if (b0Var != null) {
            e eVar2 = b0Var.f3899d;
            if (eVar.size() + eVar2.size() < 128) {
                int size6 = eVar2.size();
                int size7 = eVar.size();
                byte[] bArr2 = new byte[size6 + size7];
                eVar2.j(0, 0, size6, bArr2);
                eVar.j(0, size6, size7, bArr2);
                return new b0(b0Var.f3898c, new w(bArr2));
            }
        }
        if (b0Var != null) {
            e eVar3 = b0Var.f3899d;
            e eVar4 = b0Var.f3898c;
            if (eVar4.l() > eVar3.l() && b0Var.f3901f > eVar.l()) {
                return new b0(eVar4, new b0(eVar3, eVar));
            }
        }
        if (size3 >= b0.f3896h[Math.max(l(), eVar.l()) + 1]) {
            return new b0(this, eVar);
        }
        c1 c1Var = new c1(15);
        c1Var.l(this);
        c1Var.l(eVar);
        Stack stack = (Stack) c1Var.f1208b;
        e b0Var2 = (e) stack.pop();
        while (!stack.isEmpty()) {
            b0Var2 = new b0((e) stack.pop(), b0Var2);
        }
        return b0Var2;
    }

    public final void j(int i10, int i11, int i12, byte[] bArr) {
        if (i10 < 0) {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Source offset < 0: ");
            sb.append(i10);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i11 < 0) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Target offset < 0: ");
            sb2.append(i11);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i12 < 0) {
            StringBuilder sb3 = new StringBuilder(23);
            sb3.append("Length < 0: ");
            sb3.append(i12);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        int i13 = i10 + i12;
        if (i13 > size()) {
            StringBuilder sb4 = new StringBuilder(34);
            sb4.append("Source end offset < 0: ");
            sb4.append(i13);
            throw new IndexOutOfBoundsException(sb4.toString());
        }
        int i14 = i11 + i12;
        if (i14 <= bArr.length) {
            if (i12 > 0) {
                k(i10, i11, i12, bArr);
            }
        } else {
            StringBuilder sb5 = new StringBuilder(34);
            sb5.append("Target end offset < 0: ");
            sb5.append(i14);
            throw new IndexOutOfBoundsException(sb5.toString());
        }
    }

    public abstract void k(int i10, int i11, int i12, byte[] bArr);

    public abstract int l();

    public abstract boolean m();

    public abstract boolean n();

    public abstract int p(int i10, int i11, int i12);

    public abstract int q(int i10, int i11, int i12);

    public abstract int r();

    public abstract String s();

    public abstract int size();

    public final String t() {
        try {
            return s();
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("UTF-8 not supported?", e10);
        }
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    public abstract void u(OutputStream outputStream, int i10, int i11);
}
