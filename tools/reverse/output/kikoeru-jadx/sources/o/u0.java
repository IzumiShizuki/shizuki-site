package o;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f16051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f16052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16053c;

    public u0(int i10) {
        this.f16051a = i10 == 0 ? p.a.f16474a : new int[i10];
        this.f16052b = i10 == 0 ? p.a.f16476c : new Object[i10 << 1];
    }

    public final int a(Object obj) {
        int i10 = this.f16053c * 2;
        Object[] objArr = this.f16052b;
        if (obj == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (obj.equals(objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    public final int b(int i10, Object obj) {
        int i11 = this.f16053c;
        if (i11 == 0) {
            return -1;
        }
        int iA = p.a.a(this.f16051a, i11, i10);
        if (iA < 0 || jc.l.a(obj, this.f16052b[iA << 1])) {
            return iA;
        }
        int i12 = iA + 1;
        while (i12 < i11 && this.f16051a[i12] == i10) {
            if (jc.l.a(obj, this.f16052b[i12 << 1])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = iA - 1; i13 >= 0 && this.f16051a[i13] == i10; i13--) {
            if (jc.l.a(obj, this.f16052b[i13 << 1])) {
                return i13;
            }
        }
        return ~i12;
    }

    public final int c(Object obj) {
        return obj == null ? d() : b(obj.hashCode(), obj);
    }

    public final void clear() {
        if (this.f16053c > 0) {
            this.f16051a = p.a.f16474a;
            this.f16052b = p.a.f16476c;
            this.f16053c = 0;
        }
        if (this.f16053c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return c(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public final int d() {
        int i10 = this.f16053c;
        if (i10 == 0) {
            return -1;
        }
        int iA = p.a.a(this.f16051a, i10, 0);
        if (iA < 0 || this.f16052b[iA << 1] == null) {
            return iA;
        }
        int i11 = iA + 1;
        while (i11 < i10 && this.f16051a[i11] == 0) {
            if (this.f16052b[i11 << 1] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iA - 1; i12 >= 0 && this.f16051a[i12] == 0; i12--) {
            if (this.f16052b[i12 << 1] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    public final Object e(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f16053c) {
            z10 = true;
        }
        if (z10) {
            return this.f16052b[i10 << 1];
        }
        p.a.c("Expected index to be within 0..size()-1, but was " + i10);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof u0) {
                int i10 = this.f16053c;
                if (i10 != ((u0) obj).f16053c) {
                    return false;
                }
                u0 u0Var = (u0) obj;
                for (int i11 = 0; i11 < i10; i11++) {
                    Object objE = e(i11);
                    Object objH = h(i11);
                    Object obj2 = u0Var.get(objE);
                    if (objH == null) {
                        if (obj2 != null || !u0Var.containsKey(objE)) {
                            return false;
                        }
                    } else if (!objH.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f16053c != ((Map) obj).size()) {
                return false;
            }
            int i12 = this.f16053c;
            for (int i13 = 0; i13 < i12; i13++) {
                Object objE2 = e(i13);
                Object objH2 = h(i13);
                Object obj3 = ((Map) obj).get(objE2);
                if (objH2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objE2)) {
                        return false;
                    }
                } else if (!objH2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f16053c)) {
            p.a.c("Expected index to be within 0..size()-1, but was " + i10);
            throw null;
        }
        Object[] objArr = this.f16052b;
        int i12 = i10 << 1;
        Object obj = objArr[i12 + 1];
        if (i11 <= 1) {
            clear();
            return obj;
        }
        int i13 = i11 - 1;
        int[] iArr = this.f16051a;
        if (iArr.length <= 8 || i11 >= iArr.length / 3) {
            if (i10 < i13) {
                int i14 = i10 + 1;
                vb.l.h0(i10, i14, i11, iArr, iArr);
                Object[] objArr2 = this.f16052b;
                vb.l.i0(i12, i14 << 1, i11 << 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f16052b;
            int i15 = i13 << 1;
            objArr3[i15] = null;
            objArr3[i15 + 1] = null;
        } else {
            int i16 = i11 > 8 ? i11 + (i11 >> 1) : 8;
            int[] iArrCopyOf = Arrays.copyOf(iArr, i16);
            jc.l.d(iArrCopyOf, "copyOf(...)");
            this.f16051a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f16052b, i16 << 1);
            jc.l.d(objArrCopyOf, "copyOf(...)");
            this.f16052b = objArrCopyOf;
            if (i11 != this.f16053c) {
                throw new ConcurrentModificationException();
            }
            if (i10 > 0) {
                vb.l.h0(0, 0, i10, iArr, this.f16051a);
                vb.l.i0(0, 0, i12, objArr, this.f16052b);
            }
            if (i10 < i13) {
                int i17 = i10 + 1;
                vb.l.h0(i10, i17, i11, iArr, this.f16051a);
                vb.l.i0(i12, i17 << 1, i11 << 1, objArr, this.f16052b);
            }
        }
        if (i11 != this.f16053c) {
            throw new ConcurrentModificationException();
        }
        this.f16053c = i13;
        return obj;
    }

    public final Object g(int i10, Object obj) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f16053c) {
            z10 = true;
        }
        if (!z10) {
            p.a.c("Expected index to be within 0..size()-1, but was " + i10);
            throw null;
        }
        int i11 = (i10 << 1) + 1;
        Object[] objArr = this.f16052b;
        Object obj2 = objArr[i11];
        objArr[i11] = obj;
        return obj2;
    }

    public Object get(Object obj) {
        int iC = c(obj);
        if (iC >= 0) {
            return this.f16052b[(iC << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iC = c(obj);
        return iC >= 0 ? this.f16052b[(iC << 1) + 1] : obj2;
    }

    public final Object h(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f16053c) {
            z10 = true;
        }
        if (z10) {
            return this.f16052b[(i10 << 1) + 1];
        }
        p.a.c("Expected index to be within 0..size()-1, but was " + i10);
        throw null;
    }

    public final int hashCode() {
        int[] iArr = this.f16051a;
        Object[] objArr = this.f16052b;
        int i10 = this.f16053c;
        int i11 = 1;
        int i12 = 0;
        int iHashCode = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i12];
            i12++;
            i11 += 2;
        }
        return iHashCode;
    }

    public final boolean isEmpty() {
        return this.f16053c <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i10 = this.f16053c;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iB = obj != null ? b(iHashCode, obj) : d();
        if (iB >= 0) {
            int i11 = (iB << 1) + 1;
            Object[] objArr = this.f16052b;
            Object obj3 = objArr[i11];
            objArr[i11] = obj2;
            return obj3;
        }
        int i12 = ~iB;
        int[] iArr = this.f16051a;
        if (i10 >= iArr.length) {
            int i13 = 8;
            if (i10 >= 8) {
                i13 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i13 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i13);
            jc.l.d(iArrCopyOf, "copyOf(...)");
            this.f16051a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f16052b, i13 << 1);
            jc.l.d(objArrCopyOf, "copyOf(...)");
            this.f16052b = objArrCopyOf;
            if (i10 != this.f16053c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i12 < i10) {
            int[] iArr2 = this.f16051a;
            int i14 = i12 + 1;
            vb.l.h0(i14, i12, i10, iArr2, iArr2);
            Object[] objArr2 = this.f16052b;
            vb.l.i0(i14 << 1, i12 << 1, this.f16053c << 1, objArr2, objArr2);
        }
        int i15 = this.f16053c;
        if (i10 == i15) {
            int[] iArr3 = this.f16051a;
            if (i12 < iArr3.length) {
                iArr3[i12] = iHashCode;
                Object[] objArr3 = this.f16052b;
                int i16 = i12 << 1;
                objArr3[i16] = obj;
                objArr3[i16 + 1] = obj2;
                this.f16053c = i15 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int iC = c(obj);
        if (iC >= 0) {
            return f(iC);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iC = c(obj);
        if (iC >= 0) {
            return g(iC, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f16053c;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f16053c * 28);
        sb.append('{');
        int i10 = this.f16053c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb.append(", ");
            }
            Object objE = e(i11);
            if (objE != sb) {
                sb.append(objE);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objH = h(i11);
            if (objH != sb) {
                sb.append(objH);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        jc.l.d(string, "toString(...)");
        return string;
    }

    public final boolean remove(Object obj, Object obj2) {
        int iC = c(obj);
        if (iC < 0 || !jc.l.a(obj2, h(iC))) {
            return false;
        }
        f(iC);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iC = c(obj);
        if (iC < 0 || !jc.l.a(obj2, h(iC))) {
            return false;
        }
        g(iC, obj3);
        return true;
    }
}
