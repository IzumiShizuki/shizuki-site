package vb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class l extends ua.l {
    public static int A0(Object obj, Object[] objArr) {
        jc.l.e(objArr, "<this>");
        int i10 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i10 < length) {
                if (objArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i10 < length2) {
            if (obj.equals(objArr[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static int B0(int[] iArr, int i10) {
        jc.l.e(iArr, "<this>");
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (i10 == iArr[i11]) {
                return i11;
            }
        }
        return -1;
    }

    public static final void C0(Object[] objArr, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, ic.k kVar) {
        jc.l.e(objArr, "<this>");
        sb.append(charSequence2);
        int i10 = 0;
        for (Object obj : objArr) {
            i10++;
            if (i10 > 1) {
                sb.append(charSequence);
            }
            a.a.s(sb, obj, kVar);
        }
        sb.append(charSequence3);
    }

    public static String D0(Object[] objArr, String str, String str2, String str3, ic.k kVar, int i10) {
        if ((i10 & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        if ((i10 & 32) != 0) {
            kVar = null;
        }
        jc.l.e(objArr, "<this>");
        StringBuilder sb = new StringBuilder();
        C0(objArr, sb, str4, str2, str3, "...", kVar);
        return sb.toString();
    }

    public static Object E0(Object[] objArr) {
        jc.l.e(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[objArr.length - 1];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static int F0(int[] iArr) {
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        int i10 = iArr[0];
        int i11 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                int i12 = iArr[i11];
                if (i10 < i12) {
                    i10 = i12;
                }
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        return i10;
    }

    public static Integer G0(int[] iArr) {
        jc.l.e(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        int i10 = iArr[0];
        int i11 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                int i12 = iArr[i11];
                if (i10 > i12) {
                    i10 = i12;
                }
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        return Integer.valueOf(i10);
    }

    public static char H0(char[] cArr) {
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static Object I0(Object[] objArr) {
        jc.l.e(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return objArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static byte[] J0(byte[] bArr, oc.d dVar) {
        jc.l.e(bArr, "<this>");
        jc.l.e(dVar, "indices");
        return dVar.isEmpty() ? new byte[0] : n0(bArr, dVar.f16307a, dVar.f16308b + 1);
    }

    public static void K0(Object[] objArr, Comparator comparator) {
        jc.l.e(objArr, "<this>");
        jc.l.e(comparator, "comparator");
        if (objArr.length > 1) {
            Arrays.sort(objArr, comparator);
        }
    }

    public static void L0(Object[] objArr, Comparator comparator, int i10, int i11) {
        jc.l.e(objArr, "<this>");
        jc.l.e(comparator, "comparator");
        Arrays.sort(objArr, i10, i11, comparator);
    }

    public static List M0(Object[] objArr) {
        jc.l.e(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? new ArrayList(new i(objArr, false)) : ud.b.w(objArr[0]) : r.f22819a;
    }

    public static Set N0(Object[] objArr) {
        jc.l.e(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            return t.f22821a;
        }
        if (length == 1) {
            return ud.e.X(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(w.t(objArr.length));
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
        return linkedHashSet;
    }

    public static df.o O0(Object[] objArr) {
        jc.l.e(objArr, "<this>");
        return new df.o(3, new t9.f(3, objArr));
    }

    public static ArrayList P0(Object[] objArr, Object[] objArr2) {
        jc.l.e(objArr, "<this>");
        jc.l.e(objArr2, "other");
        int iMin = Math.min(objArr.length, objArr2.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(new ub.k(objArr[i10], objArr2[i10]));
        }
        return arrayList;
    }

    public static Iterable b0(Object[] objArr) {
        jc.l.e(objArr, "<this>");
        return objArr.length == 0 ? r.f22819a : new df.o(2, objArr);
    }

    public static List c0(Object[] objArr) {
        jc.l.e(objArr, "<this>");
        List listAsList = Arrays.asList(objArr);
        jc.l.d(listAsList, "asList(...)");
        return listAsList;
    }

    public static df.k d0(Object[] objArr) {
        return objArr.length == 0 ? df.g.f5986a : new df.n(3, objArr);
    }

    public static boolean e0(Object obj, Object[] objArr) {
        jc.l.e(objArr, "<this>");
        return A0(obj, objArr) >= 0;
    }

    public static boolean f0(int[] iArr, int i10) {
        jc.l.e(iArr, "<this>");
        return B0(iArr, i10) >= 0;
    }

    public static void g0(int i10, int i11, int i12, byte[] bArr, byte[] bArr2) {
        jc.l.e(bArr, "<this>");
        jc.l.e(bArr2, "destination");
        System.arraycopy(bArr, i11, bArr2, i10, i12 - i11);
    }

    public static void h0(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        jc.l.e(iArr, "<this>");
        jc.l.e(iArr2, "destination");
        System.arraycopy(iArr, i11, iArr2, i10, i12 - i11);
    }

    public static void i0(int i10, int i11, int i12, Object[] objArr, Object[] objArr2) {
        jc.l.e(objArr, "<this>");
        jc.l.e(objArr2, "destination");
        System.arraycopy(objArr, i11, objArr2, i10, i12 - i11);
    }

    public static void j0(char[] cArr, char[] cArr2, int i10, int i11, int i12) {
        jc.l.e(cArr, "<this>");
        System.arraycopy(cArr, i11, cArr2, i10, i12 - i11);
    }

    public static void k0(long[] jArr, long[] jArr2, int i10, int i11, int i12) {
        jc.l.e(jArr, "<this>");
        jc.l.e(jArr2, "destination");
        System.arraycopy(jArr, i11, jArr2, i10, i12 - i11);
    }

    public static /* synthetic */ void l0(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = iArr.length;
        }
        h0(i10, 0, i11, iArr, iArr2);
    }

    public static /* synthetic */ void m0(int i10, int i11, int i12, Object[] objArr, Object[] objArr2) {
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = objArr.length;
        }
        i0(0, i10, i11, objArr, objArr2);
    }

    public static byte[] n0(byte[] bArr, int i10, int i11) {
        jc.l.e(bArr, "<this>");
        ua.l.L(i11, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i10, i11);
        jc.l.d(bArrCopyOfRange, "copyOfRange(...)");
        return bArrCopyOfRange;
    }

    public static Object[] o0(int i10, int i11, Object[] objArr) {
        jc.l.e(objArr, "<this>");
        ua.l.L(i11, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i10, i11);
        jc.l.d(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    public static void p0(int i10, int i11, Object[] objArr) {
        jc.l.e(objArr, "<this>");
        Arrays.fill(objArr, i10, i11, (Object) null);
    }

    public static void q0(int[] iArr, int i10, int i11, int i12) {
        if ((i12 & 4) != 0) {
            i11 = iArr.length;
        }
        Arrays.fill(iArr, 0, i11, i10);
    }

    public static void r0(long[] jArr, long j10) {
        int length = jArr.length;
        jc.l.e(jArr, "<this>");
        Arrays.fill(jArr, 0, length, j10);
    }

    public static ArrayList t0(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object u0(Object[] objArr) {
        jc.l.e(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static Object v0(Object[] objArr) {
        jc.l.e(objArr, "<this>");
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    public static oc.d w0(int[] iArr) {
        return new oc.d(0, iArr.length - 1, 1);
    }

    public static int x0(long[] jArr) {
        jc.l.e(jArr, "<this>");
        return jArr.length - 1;
    }

    public static Integer y0(int[] iArr, int i10) {
        jc.l.e(iArr, "<this>");
        if (i10 < 0 || i10 >= iArr.length) {
            return null;
        }
        return Integer.valueOf(iArr[i10]);
    }

    public static Object z0(int i10, Object[] objArr) {
        jc.l.e(objArr, "<this>");
        if (i10 < 0 || i10 >= objArr.length) {
            return null;
        }
        return objArr[i10];
    }
}
