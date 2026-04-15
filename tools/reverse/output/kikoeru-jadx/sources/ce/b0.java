package ce;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f3896h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f3898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f3899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f3900e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f3901f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f3902g = 0;

    static {
        ArrayList arrayList = new ArrayList();
        int i10 = 1;
        int i11 = 1;
        while (i10 > 0) {
            arrayList.add(Integer.valueOf(i10));
            int i12 = i11 + i10;
            i11 = i10;
            i10 = i12;
        }
        arrayList.add(Integer.MAX_VALUE);
        f3896h = new int[arrayList.size()];
        int i13 = 0;
        while (true) {
            int[] iArr = f3896h;
            if (i13 >= iArr.length) {
                return;
            }
            iArr[i13] = ((Integer) arrayList.get(i13)).intValue();
            i13++;
        }
    }

    public b0(e eVar, e eVar2) {
        this.f3898c = eVar;
        this.f3899d = eVar2;
        int size = eVar.size();
        this.f3900e = size;
        this.f3897b = eVar2.size() + size;
        this.f3901f = Math.max(eVar.l(), eVar2.l()) + 1;
    }

    public final boolean equals(Object obj) {
        int iR;
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            int size = eVar.size();
            int i10 = this.f3897b;
            if (i10 == size) {
                if (i10 == 0) {
                    return true;
                }
                if (this.f3902g == 0 || (iR = eVar.r()) == 0 || this.f3902g == iR) {
                    z zVar = new z(this);
                    w wVarA = zVar.next();
                    z zVar2 = new z(eVar);
                    w wVarA2 = zVar2.next();
                    int i11 = 0;
                    int i12 = 0;
                    int i13 = 0;
                    while (true) {
                        int length = wVarA.f3989b.length - i11;
                        int length2 = wVarA2.f3989b.length - i12;
                        int iMin = Math.min(length, length2);
                        if (!(i11 == 0 ? wVarA.v(wVarA2, i12, iMin) : wVarA2.v(wVarA, i11, iMin))) {
                            break;
                        }
                        i13 += iMin;
                        if (i13 >= i10) {
                            if (i13 == i10) {
                                return true;
                            }
                            throw new IllegalStateException();
                        }
                        if (iMin == length) {
                            wVarA = zVar.next();
                            i11 = 0;
                        } else {
                            i11 += iMin;
                        }
                        if (iMin == length2) {
                            wVarA2 = zVar2.next();
                            i12 = 0;
                        } else {
                            i12 += iMin;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iP = this.f3902g;
        if (iP == 0) {
            int i10 = this.f3897b;
            iP = p(i10, 0, i10);
            if (iP == 0) {
                iP = 1;
            }
            this.f3902g = iP;
        }
        return iP;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new a0(this);
    }

    @Override // ce.e
    public final void k(int i10, int i11, int i12, byte[] bArr) {
        int i13 = i10 + i12;
        e eVar = this.f3898c;
        int i14 = this.f3900e;
        if (i13 <= i14) {
            eVar.k(i10, i11, i12, bArr);
            return;
        }
        e eVar2 = this.f3899d;
        if (i10 >= i14) {
            eVar2.k(i10 - i14, i11, i12, bArr);
            return;
        }
        int i15 = i14 - i10;
        eVar.k(i10, i11, i15, bArr);
        eVar2.k(0, i11 + i15, i12 - i15, bArr);
    }

    @Override // ce.e
    public final int l() {
        return this.f3901f;
    }

    @Override // ce.e
    public final boolean m() {
        return this.f3897b >= f3896h[this.f3901f];
    }

    @Override // ce.e
    public final boolean n() {
        int iQ = this.f3898c.q(0, 0, this.f3900e);
        e eVar = this.f3899d;
        return eVar.q(iQ, 0, eVar.size()) == 0;
    }

    @Override // ce.e
    public final int p(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        e eVar = this.f3898c;
        int i14 = this.f3900e;
        if (i13 <= i14) {
            return eVar.p(i10, i11, i12);
        }
        e eVar2 = this.f3899d;
        if (i11 >= i14) {
            return eVar2.p(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return eVar2.p(eVar.p(i10, i11, i15), 0, i12 - i15);
    }

    @Override // ce.e
    public final int q(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        e eVar = this.f3898c;
        int i14 = this.f3900e;
        if (i13 <= i14) {
            return eVar.q(i10, i11, i12);
        }
        e eVar2 = this.f3899d;
        if (i11 >= i14) {
            return eVar2.q(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return eVar2.q(eVar.q(i10, i11, i15), 0, i12 - i15);
    }

    @Override // ce.e
    public final int r() {
        return this.f3902g;
    }

    @Override // ce.e
    public final String s() {
        byte[] bArr;
        int i10 = this.f3897b;
        if (i10 == 0) {
            bArr = r.f3963a;
        } else {
            byte[] bArr2 = new byte[i10];
            k(0, 0, i10, bArr2);
            bArr = bArr2;
        }
        return new String(bArr, "UTF-8");
    }

    @Override // ce.e
    public final int size() {
        return this.f3897b;
    }

    @Override // ce.e
    public final void u(OutputStream outputStream, int i10, int i11) {
        int i12 = i10 + i11;
        e eVar = this.f3898c;
        int i13 = this.f3900e;
        if (i12 <= i13) {
            eVar.u(outputStream, i10, i11);
            return;
        }
        e eVar2 = this.f3899d;
        if (i10 >= i13) {
            eVar2.u(outputStream, i10 - i13, i11);
            return;
        }
        int i14 = i13 - i10;
        eVar.u(outputStream, i10, i14);
        eVar2.u(outputStream, 0, i11 - i14);
    }
}
