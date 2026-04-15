package ya;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26037a = 2;

    public static int b(int i10) {
        if (i10 < 3) {
            d(i10, "expectedSize");
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) Math.ceil(((double) i10) / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    public static void c(int i10, Object[] objArr) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (objArr[i11] == null) {
                throw new NullPointerException(q.t0.B(i11, "at index "));
            }
        }
    }

    public static void d(int i10, String str) {
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i10);
    }

    public static Object e(int i10) {
        if (i10 < 2 || i10 > 1073741824 || Integer.highestOneBit(i10) != i10) {
            throw new IllegalArgumentException(q.t0.B(i10, "must be power of 2 between 2^1 and 2^30: "));
        }
        return i10 <= 256 ? new byte[i10] : i10 <= 65536 ? new short[i10] : new int[i10];
    }

    public static boolean g(Object obj, Map map) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static boolean h(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() == set2.size()) {
                return set.containsAll(set2);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static j1 i(Set set, xa.e eVar) {
        if (set instanceof SortedSet) {
            Set set2 = (SortedSet) set;
            if (!(set2 instanceof j1)) {
                return new k1(set2, eVar);
            }
            j1 j1Var = (j1) set2;
            xa.e eVar2 = j1Var.f26006b;
            eVar2.getClass();
            return new k1((SortedSet) j1Var.f26005a, new xa.f(Arrays.asList(eVar2, eVar)));
        }
        if (!(set instanceof j1)) {
            set.getClass();
            return new j1(set, eVar);
        }
        j1 j1Var2 = (j1) set;
        xa.e eVar3 = j1Var2.f26006b;
        eVar3.getClass();
        return new j1(j1Var2.f26005a, new xa.f(Arrays.asList(eVar3, eVar)));
    }

    public static Object j(AbstractCollection abstractCollection, String str) {
        Iterator it = abstractCollection.iterator();
        return it.hasNext() ? it.next() : str;
    }

    public static Object k(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            return list.get(list.size() - 1);
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static int l(Set set) {
        Iterator it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 = ~(~(i10 + (next != null ? next.hashCode() : 0)));
        }
        return i10;
    }

    public static i1 m(Set set, m0 m0Var) {
        ud.s.h(set, "set1");
        ud.s.h(m0Var, "set2");
        return new i1(set, m0Var);
    }

    public static int n(int i10, int i11, int i12) {
        return (i10 & (~i12)) | (i11 & i12);
    }

    public static ArrayList o(Object... objArr) {
        int length = objArr.length;
        d(length, "arraySize");
        ArrayList arrayList = new ArrayList(g8.a.Y(((long) length) + 5 + ((long) (length / 10))));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public static int p(Object obj, Object obj2, int i10, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i11;
        int i12;
        int iS = s(obj);
        int i13 = iS & i10;
        int iT = t(i13, obj3);
        if (iT != 0) {
            int i14 = ~i10;
            int i15 = iS & i14;
            int i16 = -1;
            while (true) {
                i11 = iT - 1;
                i12 = iArr[i11];
                if ((i12 & i14) == i15 && ud.n.f(obj, objArr[i11]) && (objArr2 == null || ud.n.f(obj2, objArr2[i11]))) {
                    break;
                }
                int i17 = i12 & i10;
                if (i17 == 0) {
                    break;
                }
                i16 = i11;
                iT = i17;
            }
            int i18 = i12 & i10;
            if (i16 == -1) {
                u(i13, i18, obj3);
                return i11;
            }
            iArr[i16] = n(iArr[i16], i18, i10);
            return i11;
        }
        return -1;
    }

    public static void q(List list, xa.e eVar, int i10, int i11) {
        for (int size = list.size() - 1; size > i11; size--) {
            if (eVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            list.remove(i12);
        }
    }

    public static int r(int i10) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i10) * (-862048943)), 15)) * 461845907);
    }

    public static int s(Object obj) {
        return r(obj == null ? 0 : obj.hashCode());
    }

    public static int t(int i10, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i10] & 255 : obj instanceof short[] ? ((short[]) obj)[i10] & 65535 : ((int[]) obj)[i10];
    }

    public static void u(int i10, int i11, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i10] = (byte) i11;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i10] = (short) i11;
        } else {
            ((int[]) obj)[i10] = i11;
        }
    }

    public static AbstractList v(List list, xa.d dVar) {
        return q.t0.M(list) ? new r0(list, dVar) : new s0(list, dVar);
    }

    public abstract Object f();

    public String toString() {
        switch (this.f26037a) {
            case 2:
                return f().toString();
            default:
                return super.toString();
        }
    }
}
