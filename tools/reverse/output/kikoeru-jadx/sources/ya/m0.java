package ya;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class m0 extends d0 implements Set {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f26017c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient i0 f26018b;

    public static int o(int i10) {
        int iMax = Math.max(i10, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static m0 p(int i10, Object... objArr) {
        if (i10 == 0) {
            return g1.f25986j;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new m1(obj);
        }
        int iO = o(i10);
        Object[] objArr2 = new Object[iO];
        int i11 = iO - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            Object obj2 = objArr[i14];
            if (obj2 == null) {
                throw new NullPointerException(q.t0.B(i14, "at index "));
            }
            int iHashCode = obj2.hashCode();
            int iR = q.r(iHashCode);
            while (true) {
                int i15 = iR & i11;
                Object obj3 = objArr2[i15];
                if (obj3 == null) {
                    objArr[i13] = obj2;
                    objArr2[i15] = obj2;
                    i12 += iHashCode;
                    i13++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iR++;
            }
        }
        Arrays.fill(objArr, i13, i10, (Object) null);
        if (i13 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new m1(obj4);
        }
        if (o(i13) < iO / 2) {
            return p(i13, objArr);
        }
        int length = objArr.length;
        if (i13 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i13);
        }
        return new g1(i12, i11, i13, objArr, objArr2);
    }

    public static m0 q(Collection collection) {
        if ((collection instanceof m0) && !(collection instanceof SortedSet)) {
            m0 m0Var = (m0) collection;
            if (!m0Var.m()) {
                return m0Var;
            }
        }
        Object[] array = collection.toArray();
        return p(array.length, array);
    }

    @Override // ya.d0
    public i0 a() {
        i0 i0Var = this.f26018b;
        if (i0Var != null) {
            return i0Var;
        }
        i0 i0VarR = r();
        this.f26018b = i0VarR;
        return i0VarR;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof m0) && (this instanceof g1) && (((m0) obj) instanceof g1) && hashCode() != obj.hashCode()) {
            return false;
        }
        return q.h(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return q.l(this);
    }

    public i0 r() {
        Object[] array = toArray(d0.f25966a);
        g0 g0Var = i0.f25998b;
        return i0.o(array.length, array);
    }
}
