package wb;

import c1.i;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import jc.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Map, Serializable, kc.d {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final e f23473n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f23474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f23475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f23476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f23477d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23478e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f23479f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f23480g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f23481h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f23482i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public f f23483j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public i f23484k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public f f23485l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f23486m;

    static {
        e eVar = new e(0);
        eVar.f23486m = true;
        f23473n = eVar;
    }

    public e() {
        this(8);
    }

    public final int a(Object obj) {
        c();
        while (true) {
            int iL = l(obj);
            int i10 = this.f23478e * 2;
            int length = this.f23477d.length / 2;
            if (i10 > length) {
                i10 = length;
            }
            int i11 = 0;
            while (true) {
                int[] iArr = this.f23477d;
                int i12 = iArr[iL];
                if (i12 <= 0) {
                    int i13 = this.f23479f;
                    Object[] objArr = this.f23474a;
                    if (i13 < objArr.length) {
                        int i14 = i13 + 1;
                        this.f23479f = i14;
                        objArr[i13] = obj;
                        this.f23476c[i13] = iL;
                        iArr[iL] = i14;
                        this.f23482i++;
                        this.f23481h++;
                        if (i11 > this.f23478e) {
                            this.f23478e = i11;
                        }
                        return i13;
                    }
                    i(1);
                } else {
                    if (l.a(this.f23474a[i12 - 1], obj)) {
                        return -i12;
                    }
                    i11++;
                    if (i11 > i10) {
                        m(this.f23477d.length * 2);
                        break;
                    }
                    iL = iL == 0 ? this.f23477d.length - 1 : iL - 1;
                }
            }
        }
    }

    public final e b() {
        c();
        this.f23486m = true;
        if (this.f23482i > 0) {
            return this;
        }
        e eVar = f23473n;
        l.c(eVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return eVar;
    }

    public final void c() {
        if (this.f23486m) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        c();
        int i10 = this.f23479f - 1;
        if (i10 >= 0) {
            int i11 = 0;
            while (true) {
                int[] iArr = this.f23476c;
                int i12 = iArr[i11];
                if (i12 >= 0) {
                    this.f23477d[i12] = 0;
                    iArr[i11] = -1;
                }
                if (i11 == i10) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        ud.b.G(0, this.f23479f, this.f23474a);
        Object[] objArr = this.f23475b;
        if (objArr != null) {
            ud.b.G(0, this.f23479f, objArr);
        }
        this.f23482i = 0;
        this.f23479f = 0;
        this.f23481h++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return j(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return k(obj) >= 0;
    }

    public final void d(boolean z10) {
        int i10;
        Object[] objArr = this.f23475b;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i10 = this.f23479f;
            if (i11 >= i10) {
                break;
            }
            int[] iArr = this.f23476c;
            int i13 = iArr[i11];
            if (i13 >= 0) {
                Object[] objArr2 = this.f23474a;
                objArr2[i12] = objArr2[i11];
                if (objArr != null) {
                    objArr[i12] = objArr[i11];
                }
                if (z10) {
                    iArr[i12] = i13;
                    this.f23477d[i13] = i12 + 1;
                }
                i12++;
            }
            i11++;
        }
        ud.b.G(i12, i10, this.f23474a);
        if (objArr != null) {
            ud.b.G(i12, this.f23479f, objArr);
        }
        this.f23479f = i12;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        f fVar = this.f23485l;
        if (fVar != null) {
            return fVar;
        }
        f fVar2 = new f(this, 0);
        this.f23485l = fVar2;
        return fVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.f23482i == map.size() && g(map.entrySet());
    }

    public final boolean g(Collection collection) {
        l.e(collection, "m");
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!h((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iJ = j(obj);
        if (iJ < 0) {
            return null;
        }
        Object[] objArr = this.f23475b;
        l.b(objArr);
        return objArr[iJ];
    }

    public final boolean h(Map.Entry entry) {
        l.e(entry, "entry");
        int iJ = j(entry.getKey());
        if (iJ < 0) {
            return false;
        }
        Object[] objArr = this.f23475b;
        l.b(objArr);
        return l.a(objArr[iJ], entry.getValue());
    }

    @Override // java.util.Map
    public final int hashCode() {
        c cVar = new c(this, 0);
        int i10 = 0;
        while (cVar.hasNext()) {
            int i11 = cVar.f5470a;
            e eVar = (e) cVar.f5473d;
            if (i11 >= eVar.f23479f) {
                throw new NoSuchElementException();
            }
            cVar.f5470a = i11 + 1;
            cVar.f5471b = i11;
            Object obj = eVar.f23474a[i11];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = eVar.f23475b;
            l.b(objArr);
            Object obj2 = objArr[cVar.f5471b];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            cVar.c();
            i10 += iHashCode ^ iHashCode2;
        }
        return i10;
    }

    public final void i(int i10) {
        Object[] objArrCopyOf;
        Object[] objArr = this.f23474a;
        int length = objArr.length;
        int i11 = this.f23479f;
        int i12 = length - i11;
        int i13 = i11 - this.f23482i;
        if (i12 < i10 && i12 + i13 >= i10 && i13 >= objArr.length / 4) {
            d(true);
            return;
        }
        int i14 = i11 + i10;
        if (i14 < 0) {
            throw new OutOfMemoryError();
        }
        if (i14 > objArr.length) {
            int length2 = objArr.length;
            int i15 = length2 + (length2 >> 1);
            if (i15 - i14 < 0) {
                i15 = i14;
            }
            if (i15 - 2147483639 > 0) {
                i15 = i14 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] objArrCopyOf2 = Arrays.copyOf(objArr, i15);
            l.d(objArrCopyOf2, "copyOf(...)");
            this.f23474a = objArrCopyOf2;
            Object[] objArr2 = this.f23475b;
            if (objArr2 != null) {
                objArrCopyOf = Arrays.copyOf(objArr2, i15);
                l.d(objArrCopyOf, "copyOf(...)");
            } else {
                objArrCopyOf = null;
            }
            this.f23475b = objArrCopyOf;
            int[] iArrCopyOf = Arrays.copyOf(this.f23476c, i15);
            l.d(iArrCopyOf, "copyOf(...)");
            this.f23476c = iArrCopyOf;
            int iHighestOneBit = Integer.highestOneBit((i15 >= 1 ? i15 : 1) * 3);
            if (iHighestOneBit > this.f23477d.length) {
                m(iHighestOneBit);
            }
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f23482i == 0;
    }

    public final int j(Object obj) {
        int iL = l(obj);
        int i10 = this.f23478e;
        while (true) {
            int i11 = this.f23477d[iL];
            if (i11 == 0) {
                return -1;
            }
            if (i11 > 0) {
                int i12 = i11 - 1;
                if (l.a(this.f23474a[i12], obj)) {
                    return i12;
                }
            }
            i10--;
            if (i10 < 0) {
                return -1;
            }
            iL = iL == 0 ? this.f23477d.length - 1 : iL - 1;
        }
    }

    public final int k(Object obj) {
        int i10 = this.f23479f;
        while (true) {
            i10--;
            if (i10 < 0) {
                return -1;
            }
            if (this.f23476c[i10] >= 0) {
                Object[] objArr = this.f23475b;
                l.b(objArr);
                if (l.a(objArr[i10], obj)) {
                    return i10;
                }
            }
        }
    }

    @Override // java.util.Map
    public final Set keySet() {
        f fVar = this.f23483j;
        if (fVar != null) {
            return fVar;
        }
        f fVar2 = new f(this, 1);
        this.f23483j = fVar2;
        return fVar2;
    }

    public final int l(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f23480g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        r3[r0] = r6;
        r5.f23476c[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(int r6) {
        /*
            r5 = this;
            int r0 = r5.f23481h
            int r0 = r0 + 1
            r5.f23481h = r0
            int r0 = r5.f23479f
            int r1 = r5.f23482i
            r2 = 0
            if (r0 <= r1) goto L10
            r5.d(r2)
        L10:
            int[] r0 = new int[r6]
            r5.f23477d = r0
            int r6 = java.lang.Integer.numberOfLeadingZeros(r6)
            int r6 = r6 + 1
            r5.f23480g = r6
        L1c:
            int r6 = r5.f23479f
            if (r2 >= r6) goto L50
            int r6 = r2 + 1
            java.lang.Object[] r0 = r5.f23474a
            r0 = r0[r2]
            int r0 = r5.l(r0)
            int r1 = r5.f23478e
        L2c:
            int[] r3 = r5.f23477d
            r4 = r3[r0]
            if (r4 != 0) goto L3a
            r3[r0] = r6
            int[] r1 = r5.f23476c
            r1[r2] = r0
            r2 = r6
            goto L1c
        L3a:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L48
            int r4 = r0 + (-1)
            if (r0 != 0) goto L46
            int r0 = r3.length
            int r0 = r0 + (-1)
            goto L2c
        L46:
            r0 = r4
            goto L2c
        L48:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            r6.<init>(r0)
            throw r6
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wb.e.m(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[LOOP:0: B:9:0x0024->B:33:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(int r12) {
        /*
            r11 = this;
            java.lang.Object[] r0 = r11.f23474a
            java.lang.String r1 = "<this>"
            jc.l.e(r0, r1)
            r1 = 0
            r0[r12] = r1
            java.lang.Object[] r0 = r11.f23475b
            if (r0 == 0) goto L10
            r0[r12] = r1
        L10:
            int[] r0 = r11.f23476c
            r0 = r0[r12]
            int r1 = r11.f23478e
            int r1 = r1 * 2
            int[] r2 = r11.f23477d
            int r2 = r2.length
            int r2 = r2 / 2
            if (r1 <= r2) goto L20
            r1 = r2
        L20:
            r2 = 0
            r3 = r1
            r4 = 0
            r1 = r0
        L24:
            int r5 = r0 + (-1)
            if (r0 != 0) goto L2e
            int[] r0 = r11.f23477d
            int r0 = r0.length
            int r0 = r0 + (-1)
            goto L2f
        L2e:
            r0 = r5
        L2f:
            int r4 = r4 + 1
            int r5 = r11.f23478e
            r6 = -1
            if (r4 <= r5) goto L3b
            int[] r0 = r11.f23477d
            r0[r1] = r2
            goto L6c
        L3b:
            int[] r5 = r11.f23477d
            r7 = r5[r0]
            if (r7 != 0) goto L44
            r5[r1] = r2
            goto L6c
        L44:
            if (r7 >= 0) goto L4b
            r5[r1] = r6
        L48:
            r1 = r0
            r4 = 0
            goto L65
        L4b:
            java.lang.Object[] r5 = r11.f23474a
            int r8 = r7 + (-1)
            r5 = r5[r8]
            int r5 = r11.l(r5)
            int r5 = r5 - r0
            int[] r9 = r11.f23477d
            int r10 = r9.length
            int r10 = r10 + (-1)
            r5 = r5 & r10
            if (r5 < r4) goto L65
            r9[r1] = r7
            int[] r4 = r11.f23476c
            r4[r8] = r1
            goto L48
        L65:
            int r3 = r3 + r6
            if (r3 >= 0) goto L24
            int[] r0 = r11.f23477d
            r0[r1] = r6
        L6c:
            int[] r0 = r11.f23476c
            r0[r12] = r6
            int r12 = r11.f23482i
            int r12 = r12 + r6
            r11.f23482i = r12
            int r12 = r11.f23481h
            int r12 = r12 + 1
            r11.f23481h = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wb.e.n(int):void");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        c();
        int iA = a(obj);
        Object[] objArr = this.f23475b;
        if (objArr == null) {
            int length = this.f23474a.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.f23475b = objArr;
        }
        if (iA >= 0) {
            objArr[iA] = obj2;
            return null;
        }
        int i10 = (-iA) - 1;
        Object obj3 = objArr[i10];
        objArr[i10] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        l.e(map, "from");
        c();
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        i(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iA = a(entry.getKey());
            Object[] objArr = this.f23475b;
            if (objArr == null) {
                int length = this.f23474a.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.f23475b = objArr;
            }
            if (iA >= 0) {
                objArr[iA] = entry.getValue();
            } else {
                int i10 = (-iA) - 1;
                if (!l.a(entry.getValue(), objArr[i10])) {
                    objArr[i10] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        c();
        int iJ = j(obj);
        if (iJ < 0) {
            return null;
        }
        Object[] objArr = this.f23475b;
        l.b(objArr);
        Object obj2 = objArr[iJ];
        n(iJ);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f23482i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f23482i * 3) + 2);
        sb.append("{");
        int i10 = 0;
        c cVar = new c(this, 0);
        while (cVar.hasNext()) {
            if (i10 > 0) {
                sb.append(", ");
            }
            int i11 = cVar.f5470a;
            e eVar = (e) cVar.f5473d;
            if (i11 >= eVar.f23479f) {
                throw new NoSuchElementException();
            }
            cVar.f5470a = i11 + 1;
            cVar.f5471b = i11;
            Object obj = eVar.f23474a[i11];
            if (obj == eVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = eVar.f23475b;
            l.b(objArr);
            Object obj2 = objArr[cVar.f5471b];
            if (obj2 == eVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            cVar.c();
            i10++;
        }
        sb.append("}");
        String string = sb.toString();
        l.d(string, "toString(...)");
        return string;
    }

    @Override // java.util.Map
    public final Collection values() {
        i iVar = this.f23484k;
        if (iVar != null) {
            return iVar;
        }
        i iVar2 = new i(1, this);
        this.f23484k = iVar2;
        return iVar2;
    }

    public e(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i10];
        int[] iArr = new int[i10];
        int iHighestOneBit = Integer.highestOneBit((i10 < 1 ? 1 : i10) * 3);
        this.f23474a = objArr;
        this.f23475b = null;
        this.f23476c = iArr;
        this.f23477d = new int[iHighestOneBit];
        this.f23478e = 2;
        this.f23479f = 0;
        this.f23480g = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }
}
