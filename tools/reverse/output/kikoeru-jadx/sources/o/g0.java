package o;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f15970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15971b;

    public g0(int i10) {
        this.f15970a = i10 == 0 ? q0.f16032a : new Object[i10];
    }

    public final void a(Object obj) {
        int i10 = this.f15971b + 1;
        Object[] objArr = this.f15970a;
        if (objArr.length < i10) {
            l(i10, objArr);
        }
        Object[] objArr2 = this.f15970a;
        int i11 = this.f15971b;
        objArr2[i11] = obj;
        this.f15971b = i11 + 1;
    }

    public final void b(List list) {
        if (list.isEmpty()) {
            return;
        }
        int i10 = this.f15971b;
        int size = list.size() + i10;
        Object[] objArr = this.f15970a;
        if (objArr.length < size) {
            l(size, objArr);
        }
        Object[] objArr2 = this.f15970a;
        int size2 = list.size();
        for (int i11 = 0; i11 < size2; i11++) {
            objArr2[i11 + i10] = list.get(i11);
        }
        this.f15971b = list.size() + this.f15971b;
    }

    public final void c() {
        vb.l.p0(0, this.f15971b, this.f15970a);
        this.f15971b = 0;
    }

    public final Object d() {
        if (!g()) {
            return this.f15970a[0];
        }
        p.a.e("ObjectList is empty.");
        throw null;
    }

    public final Object e(int i10) {
        if (i10 >= 0 && i10 < this.f15971b) {
            return this.f15970a[i10];
        }
        m(i10);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g0) {
            g0 g0Var = (g0) obj;
            int i10 = g0Var.f15971b;
            int i11 = this.f15971b;
            if (i10 == i11) {
                Object[] objArr = this.f15970a;
                Object[] objArr2 = g0Var.f15970a;
                oc.d dVarE = nh.b.E(0, i11);
                int i12 = dVarE.f16307a;
                int i13 = dVarE.f16308b;
                if (i12 > i13) {
                    return true;
                }
                while (jc.l.a(objArr[i12], objArr2[i12])) {
                    if (i12 == i13) {
                        return true;
                    }
                    i12++;
                }
                return false;
            }
        }
        return false;
    }

    public final int f(Object obj) {
        int i10 = 0;
        if (obj == null) {
            Object[] objArr = this.f15970a;
            int i11 = this.f15971b;
            while (i10 < i11) {
                if (objArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        Object[] objArr2 = this.f15970a;
        int i12 = this.f15971b;
        while (i10 < i12) {
            if (obj.equals(objArr2[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public final boolean g() {
        return this.f15971b == 0;
    }

    public final boolean h() {
        return this.f15971b != 0;
    }

    public final int hashCode() {
        Object[] objArr = this.f15970a;
        int i10 = this.f15971b;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = objArr[i11];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    public final boolean i(Object obj) {
        int iF = f(obj);
        if (iF < 0) {
            return false;
        }
        j(iF);
        return true;
    }

    public final Object j(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f15971b)) {
            m(i10);
            throw null;
        }
        Object[] objArr = this.f15970a;
        Object obj = objArr[i10];
        if (i10 != i11 - 1) {
            vb.l.i0(i10, i10 + 1, i11, objArr, objArr);
        }
        int i12 = this.f15971b - 1;
        this.f15971b = i12;
        objArr[i12] = null;
        return obj;
    }

    public final void k(int i10, int i11) {
        int i12;
        if (i10 < 0 || i10 > (i12 = this.f15971b) || i11 < 0 || i11 > i12) {
            p.a.d("Start (" + i10 + ") and end (" + i11 + ") must be in 0.." + this.f15971b);
            throw null;
        }
        if (i11 < i10) {
            p.a.c("Start (" + i10 + ") is more than end (" + i11 + ')');
            throw null;
        }
        if (i11 != i10) {
            if (i11 < i12) {
                Object[] objArr = this.f15970a;
                vb.l.i0(i10, i11, i12, objArr, objArr);
            }
            int i13 = this.f15971b;
            int i14 = i13 - (i11 - i10);
            vb.l.p0(i14, i13, this.f15970a);
            this.f15971b = i14;
        }
    }

    public final void l(int i10, Object[] objArr) {
        jc.l.e(objArr, "oldContent");
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i10, (length * 3) / 2)];
        vb.l.i0(0, 0, length, objArr, objArr2);
        this.f15970a = objArr2;
    }

    public final void m(int i10) {
        StringBuilder sbO = j2.h0.o(i10, "Index ", " must be in 0..");
        sbO.append(this.f15971b - 1);
        p.a.d(sbO.toString());
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        Object[] objArr = this.f15970a;
        int i10 = this.f15971b;
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                sb.append((CharSequence) "]");
                break;
            }
            Object obj = objArr[i11];
            if (i11 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i11 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) (obj == this ? "(this)" : String.valueOf(obj)));
            i11++;
        }
        String string = sb.toString();
        jc.l.d(string, "toString(...)");
        return string;
    }

    public /* synthetic */ g0() {
        this(16);
    }
}
