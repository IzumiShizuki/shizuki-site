package b1;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import jc.l;
import pc.f0;
import x0.k1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g extends vb.f implements Collection, kc.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f1430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f1431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f1432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1433d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e1.b f1434e = new e1.b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object[] f1435f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object[] f1436g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1437h;

    public g(c cVar, Object[] objArr, Object[] objArr2, int i10) {
        this.f1430a = cVar;
        this.f1431b = objArr;
        this.f1432c = objArr2;
        this.f1433d = i10;
        this.f1435f = objArr;
        this.f1436g = objArr2;
        this.f1437h = cVar.a();
    }

    public static void k(Object[] objArr, int i10, Iterator it) {
        while (i10 < 32 && it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
    }

    public final void A(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i10 = this.f1437h;
        int i11 = i10 >> 5;
        int i12 = this.f1433d;
        if (i11 > (1 << i12)) {
            this.f1435f = B(this.f1433d + 5, u(objArr), objArr2);
            this.f1436g = objArr3;
            this.f1433d += 5;
            this.f1437h++;
            return;
        }
        if (objArr == null) {
            this.f1435f = objArr2;
            this.f1436g = objArr3;
            this.f1437h = i10 + 1;
        } else {
            this.f1435f = B(i12, objArr, objArr2);
            this.f1436g = objArr3;
            this.f1437h++;
        }
    }

    public final Object[] B(int i10, Object[] objArr, Object[] objArr2) {
        int I = f0.I(a() - 1, i10);
        Object[] objArrR = r(objArr);
        if (i10 == 5) {
            objArrR[I] = objArr2;
            return objArrR;
        }
        objArrR[I] = B(i10 - 5, (Object[]) objArrR[I], objArr2);
        return objArrR;
    }

    public final int C(ic.k kVar, Object[] objArr, int i10, int i11, e eVar, ArrayList arrayList, ArrayList arrayList2) {
        if (p(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = eVar.f1425a;
        l.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrT = objArr2;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj2 = objArr[i12];
            if (!((Boolean) kVar.a(obj2)).booleanValue()) {
                if (i11 == 32) {
                    objArrT = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : t();
                    i11 = 0;
                }
                objArrT[i11] = obj2;
                i11++;
            }
        }
        eVar.f1425a = objArrT;
        if (objArr2 != objArrT) {
            arrayList2.add(objArr2);
        }
        return i11;
    }

    public final int D(ic.k kVar, Object[] objArr, int i10, e eVar) {
        Object[] objArrR = objArr;
        int i11 = i10;
        boolean z10 = false;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (((Boolean) kVar.a(obj)).booleanValue()) {
                if (!z10) {
                    objArrR = r(objArr);
                    z10 = true;
                    i11 = i12;
                }
            } else if (z10) {
                objArrR[i11] = obj;
                i11++;
            }
        }
        eVar.f1425a = objArrR;
        return i11;
    }

    public final int E(ic.k kVar, int i10, e eVar) {
        int iD = D(kVar, this.f1436g, i10, eVar);
        if (iD == i10) {
            return i10;
        }
        Object obj = eVar.f1425a;
        l.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iD, i10, (Object) null);
        this.f1436g = objArr;
        this.f1437h -= i10 - iD;
        return iD;
    }

    public final boolean F(ic.k kVar) {
        Object[] objArrY;
        int i10;
        ic.k kVar2 = kVar;
        int iL = L();
        Object[] objArrV = null;
        e eVar = new e(null);
        boolean z10 = false;
        if (this.f1435f != null) {
            a aVarQ = q(0);
            int iD = 32;
            while (iD == 32 && aVarQ.hasNext()) {
                iD = D(kVar2, (Object[]) aVarQ.next(), 32, eVar);
            }
            if (iD == 32) {
                int iE = E(kVar2, iL, eVar);
                if (iE == 0) {
                    x(this.f1437h, this.f1433d, this.f1435f);
                }
                if (iE != iL) {
                }
            } else {
                int i11 = (aVarQ.f1419a - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iC = iD;
                while (aVarQ.hasNext()) {
                    iC = C(kVar2, (Object[]) aVarQ.next(), 32, iC, eVar, arrayList2, arrayList);
                    kVar2 = kVar;
                }
                int iC2 = C(kVar, this.f1436g, iL, iC, eVar, arrayList2, arrayList);
                Object obj = eVar.f1425a;
                l.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                Object[] objArr = (Object[]) obj;
                Arrays.fill(objArr, iC2, 32, (Object) null);
                if (arrayList.isEmpty()) {
                    objArrY = this.f1435f;
                    l.b(objArrY);
                } else {
                    objArrY = y(this.f1435f, i11, this.f1433d, arrayList.iterator());
                }
                int size = i11 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    k1.a("invalid size");
                }
                if (size == 0) {
                    this.f1433d = 0;
                } else {
                    int i12 = size - 1;
                    while (true) {
                        i10 = this.f1433d;
                        if ((i12 >> i10) != 0) {
                            break;
                        }
                        this.f1433d = i10 - 5;
                        Object[] objArr2 = objArrY[0];
                        l.c(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                        objArrY = objArr2;
                    }
                    objArrV = v(i12, i10, objArrY);
                }
                this.f1435f = objArrV;
                this.f1436g = objArr;
                this.f1437h = size + iC2;
            }
            z10 = true;
        } else if (E(kVar2, iL, eVar) != iL) {
            z10 = true;
        }
        if (z10) {
            ((AbstractList) this).modCount++;
        }
        return z10;
    }

    public final Object[] G(Object[] objArr, int i10, int i11, e eVar) {
        int I = f0.I(i11, i10);
        if (i10 == 0) {
            Object obj = objArr[I];
            Object[] objArrR = r(objArr);
            vb.l.i0(I, I + 1, 32, objArr, objArrR);
            objArrR[31] = eVar.f1425a;
            eVar.f1425a = obj;
            return objArrR;
        }
        int I2 = objArr[31] == null ? f0.I(I() - 1, i10) : 31;
        Object[] objArrR2 = r(objArr);
        int i12 = i10 - 5;
        int i13 = I + 1;
        if (i13 <= I2) {
            while (true) {
                Object obj2 = objArrR2[I2];
                l.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrR2[I2] = G((Object[]) obj2, i12, 0, eVar);
                if (I2 == i13) {
                    break;
                }
                I2--;
            }
        }
        Object obj3 = objArrR2[I];
        l.c(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrR2[I] = G((Object[]) obj3, i12, i11, eVar);
        return objArrR2;
    }

    public final Object H(Object[] objArr, int i10, int i11, int i12) {
        int i13 = this.f1437h - i10;
        if (i13 == 1) {
            Object obj = this.f1436g[0];
            x(i10, i11, objArr);
            return obj;
        }
        Object[] objArr2 = this.f1436g;
        Object obj2 = objArr2[i12];
        Object[] objArrR = r(objArr2);
        vb.l.i0(i12, i12 + 1, i13, objArr2, objArrR);
        objArrR[i13 - 1] = null;
        this.f1435f = objArr;
        this.f1436g = objArrR;
        this.f1437h = (i10 + i13) - 1;
        this.f1433d = i11;
        return obj2;
    }

    public final int I() {
        int i10 = this.f1437h;
        if (i10 <= 32) {
            return 0;
        }
        return (i10 - 1) & (-32);
    }

    public final Object[] J(Object[] objArr, int i10, int i11, Object obj, e eVar) {
        int I = f0.I(i11, i10);
        Object[] objArrR = r(objArr);
        if (i10 != 0) {
            Object obj2 = objArrR[I];
            l.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrR[I] = J((Object[]) obj2, i10 - 5, i11, obj, eVar);
            return objArrR;
        }
        if (objArrR != objArr) {
            ((AbstractList) this).modCount++;
        }
        eVar.f1425a = objArrR[I];
        objArrR[I] = obj;
        return objArrR;
    }

    public final void K(Collection collection, int i10, Object[] objArr, int i11, Object[][] objArr2, int i12, Object[] objArr3) {
        Object[] objArrT;
        if (i12 < 1) {
            k1.a("requires at least one nullBuffer");
        }
        Object[] objArrR = r(objArr);
        objArr2[0] = objArrR;
        int i13 = i10 & 31;
        int size = ((collection.size() + i10) - 1) & 31;
        int i14 = (i11 - i13) + size;
        if (i14 < 32) {
            vb.l.i0(size + 1, i13, i11, objArrR, objArr3);
        } else {
            int i15 = i14 - 31;
            if (i12 == 1) {
                objArrT = objArrR;
            } else {
                objArrT = t();
                i12--;
                objArr2[i12] = objArrT;
            }
            int i16 = i11 - i15;
            vb.l.i0(0, i16, i11, objArrR, objArr3);
            vb.l.i0(size + 1, i13, i16, objArrR, objArrT);
            objArr3 = objArrT;
        }
        Iterator it = collection.iterator();
        k(objArrR, i13, it);
        for (int i17 = 1; i17 < i12; i17++) {
            Object[] objArrT2 = t();
            k(objArrT2, 0, it);
            objArr2[i17] = objArrT2;
        }
        k(objArr3, 0, it);
    }

    public final int L() {
        int i10 = this.f1437h;
        return i10 <= 32 ? i10 : i10 - ((i10 - 1) & (-32));
    }

    @Override // vb.f
    public final int a() {
        return this.f1437h;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        g8.a.o(i10, a());
        if (i10 == a()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int I = I();
        if (i10 >= I) {
            o(i10 - I, obj, this.f1435f);
            return;
        }
        e eVar = new e(null);
        Object[] objArr = this.f1435f;
        l.b(objArr);
        o(0, eVar.f1425a, n(objArr, this.f1433d, i10, obj, eVar));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        Collection collection2;
        g gVar;
        Object[] objArrT;
        g8.a.o(i10, this.f1437h);
        if (i10 == this.f1437h) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i11 = (i10 >> 5) << 5;
        int size = ((collection.size() + (this.f1437h - i11)) - 1) / 32;
        if (size == 0) {
            int i12 = i10 & 31;
            int size2 = ((collection.size() + i10) - 1) & 31;
            Object[] objArr = this.f1436g;
            Object[] objArrR = r(objArr);
            vb.l.i0(size2 + 1, i12, L(), objArr, objArrR);
            k(objArrR, i12, collection.iterator());
            this.f1436g = objArrR;
            this.f1437h = collection.size() + this.f1437h;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iL = L();
        int size3 = collection.size() + this.f1437h;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i10 >= I()) {
            objArrT = t();
            collection2 = collection;
            K(collection2, i10, this.f1436g, iL, objArr2, size, objArrT);
            gVar = this;
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            gVar = this;
            if (size3 > iL) {
                int i13 = size3 - iL;
                Object[] objArrS = s(i13, gVar.f1436g);
                gVar.m(collection2, i10, i13, objArr2, size, objArrS);
                objArr2 = objArr2;
                objArrT = objArrS;
            } else {
                Object[] objArr3 = gVar.f1436g;
                objArrT = t();
                int i14 = iL - size3;
                vb.l.i0(0, i14, iL, objArr3, objArrT);
                int i15 = 32 - i14;
                Object[] objArrS2 = s(i15, gVar.f1436g);
                int i16 = size - 1;
                objArr2[i16] = objArrS2;
                gVar.m(collection2, i10, i15, objArr2, i16, objArrS2);
                collection2 = collection2;
            }
        }
        gVar.f1435f = z(gVar.f1435f, i11, objArr2);
        gVar.f1436g = objArrT;
        gVar.f1437h = collection2.size() + gVar.f1437h;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        Object[] objArr;
        g8.a.n(i10, a());
        if (I() <= i10) {
            objArr = this.f1436g;
        } else {
            objArr = this.f1435f;
            l.b(objArr);
            for (int i11 = this.f1433d; i11 > 0; i11 -= 5) {
                Object obj = objArr[f0.I(i10, i11)];
                l.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i10 & 31];
    }

    @Override // vb.f
    public final Object i(int i10) {
        g8.a.n(i10, a());
        ((AbstractList) this).modCount++;
        int I = I();
        if (i10 >= I) {
            return H(this.f1435f, I, this.f1433d, i10 - I);
        }
        e eVar = new e(this.f1436g[0]);
        Object[] objArr = this.f1435f;
        l.b(objArr);
        H(G(objArr, this.f1433d, i10, eVar), I, this.f1433d, 0);
        return eVar.f1425a;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final c j() {
        c fVar;
        Object[] objArr = this.f1435f;
        if (objArr == this.f1431b && this.f1436g == this.f1432c) {
            fVar = this.f1430a;
        } else {
            this.f1434e = new e1.b();
            this.f1431b = objArr;
            Object[] objArr2 = this.f1436g;
            this.f1432c = objArr2;
            if (objArr != null) {
                fVar = new f(objArr, objArr2, this.f1437h, this.f1433d);
            } else if (objArr2.length == 0) {
                fVar = j.f1444b;
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(objArr2, this.f1437h);
                l.d(objArrCopyOf, "copyOf(...)");
                fVar = new j(objArrCopyOf);
            }
        }
        this.f1430a = fVar;
        return fVar;
    }

    public final int l() {
        return ((AbstractList) this).modCount;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        g8.a.o(i10, this.f1437h);
        return new i(this, i10);
    }

    public final void m(Collection collection, int i10, int i11, Object[][] objArr, int i12, Object[] objArr2) {
        if (this.f1435f == null) {
            throw new IllegalStateException("root is null");
        }
        int i13 = i10 >> 5;
        a aVarQ = q(I() >> 5);
        int i14 = i12;
        Object[] objArrS = objArr2;
        while (aVarQ.f1419a - 1 != i13) {
            Object[] objArr3 = (Object[]) aVarQ.previous();
            vb.l.i0(0, 32 - i11, 32, objArr3, objArrS);
            objArrS = s(i11, objArr3);
            i14--;
            objArr[i14] = objArrS;
        }
        Object[] objArr4 = (Object[]) aVarQ.previous();
        int I = i12 - (((I() >> 5) - 1) - i13);
        if (I < i12) {
            objArr2 = objArr[I];
            l.b(objArr2);
        }
        K(collection, i10, objArr4, 32, objArr, I, objArr2);
    }

    public final Object[] n(Object[] objArr, int i10, int i11, Object obj, e eVar) {
        Object obj2;
        int I = f0.I(i11, i10);
        if (i10 == 0) {
            eVar.f1425a = objArr[31];
            Object[] objArrR = r(objArr);
            vb.l.i0(I + 1, I, 31, objArr, objArrR);
            objArrR[I] = obj;
            return objArrR;
        }
        Object[] objArrR2 = r(objArr);
        int i12 = i10 - 5;
        Object obj3 = objArrR2[I];
        l.c(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrR2[I] = n((Object[]) obj3, i12, i11, obj, eVar);
        while (true) {
            I++;
            if (I >= 32 || (obj2 = objArrR2[I]) == null) {
                break;
            }
            objArrR2[I] = n((Object[]) obj2, i12, 0, eVar.f1425a, eVar);
        }
        return objArrR2;
    }

    public final void o(int i10, Object obj, Object[] objArr) {
        int iL = L();
        Object[] objArrR = r(this.f1436g);
        if (iL >= 32) {
            Object[] objArr2 = this.f1436g;
            Object obj2 = objArr2[31];
            vb.l.i0(i10 + 1, i10, 31, objArr2, objArrR);
            objArrR[i10] = obj;
            A(objArr, objArrR, u(obj2));
            return;
        }
        vb.l.i0(i10 + 1, i10, iL, this.f1436g, objArrR);
        objArrR[i10] = obj;
        this.f1435f = objArr;
        this.f1436g = objArrR;
        this.f1437h++;
    }

    public final boolean p(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f1434e;
    }

    public final a q(int i10) {
        Object[] objArr = this.f1435f;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root");
        }
        int I = I() >> 5;
        g8.a.o(i10, I);
        int i11 = this.f1433d;
        return i11 == 0 ? new d(i10, objArr) : new k(objArr, i10, I, i11 / 5);
    }

    public final Object[] r(Object[] objArr) {
        if (objArr == null) {
            return t();
        }
        if (p(objArr)) {
            return objArr;
        }
        Object[] objArrT = t();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        vb.l.m0(0, length, 6, objArr, objArrT);
        return objArrT;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return F(new b(1, collection));
    }

    public final Object[] s(int i10, Object[] objArr) {
        if (p(objArr)) {
            vb.l.i0(i10, 0, 32 - i10, objArr, objArr);
            return objArr;
        }
        Object[] objArrT = t();
        vb.l.i0(i10, 0, 32 - i10, objArr, objArrT);
        return objArrT;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        g8.a.n(i10, a());
        if (I() > i10) {
            e eVar = new e(null);
            Object[] objArr = this.f1435f;
            l.b(objArr);
            this.f1435f = J(objArr, this.f1433d, i10, obj, eVar);
            return eVar.f1425a;
        }
        Object[] objArrR = r(this.f1436g);
        if (objArrR != this.f1436g) {
            ((AbstractList) this).modCount++;
        }
        int i11 = i10 & 31;
        Object obj2 = objArrR[i11];
        objArrR[i11] = obj;
        this.f1436g = objArrR;
        return obj2;
    }

    public final Object[] t() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f1434e;
        return objArr;
    }

    public final Object[] u(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f1434e;
        return objArr;
    }

    public final Object[] v(int i10, int i11, Object[] objArr) {
        if (i11 < 0) {
            k1.a("shift should be positive");
        }
        if (i11 == 0) {
            return objArr;
        }
        int I = f0.I(i10, i11);
        Object obj = objArr[I];
        l.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object objV = v(i10, i11 - 5, (Object[]) obj);
        if (I < 31) {
            int i12 = I + 1;
            if (objArr[i12] != null) {
                if (p(objArr)) {
                    Arrays.fill(objArr, i12, 32, (Object) null);
                }
                Object[] objArrT = t();
                vb.l.i0(0, 0, i12, objArr, objArrT);
                objArr = objArrT;
            }
        }
        if (objV == objArr[I]) {
            return objArr;
        }
        Object[] objArrR = r(objArr);
        objArrR[I] = objV;
        return objArrR;
    }

    public final Object[] w(Object[] objArr, int i10, int i11, e eVar) {
        Object[] objArrW;
        int I = f0.I(i11 - 1, i10);
        if (i10 == 5) {
            eVar.f1425a = objArr[I];
            objArrW = null;
        } else {
            Object obj = objArr[I];
            l.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrW = w((Object[]) obj, i10 - 5, i11, eVar);
        }
        if (objArrW == null && I == 0) {
            return null;
        }
        Object[] objArrR = r(objArr);
        objArrR[I] = objArrW;
        return objArrR;
    }

    public final void x(int i10, int i11, Object[] objArr) {
        if (i11 == 0) {
            this.f1435f = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f1436g = objArr;
            this.f1437h = i10;
            this.f1433d = i11;
            return;
        }
        e eVar = new e(null);
        l.b(objArr);
        Object[] objArrW = w(objArr, i11, i10, eVar);
        l.b(objArrW);
        Object obj = eVar.f1425a;
        l.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.f1436g = (Object[]) obj;
        this.f1437h = i10;
        if (objArrW[1] == null) {
            this.f1435f = (Object[]) objArrW[0];
            this.f1433d = i11 - 5;
        } else {
            this.f1435f = objArrW;
            this.f1433d = i11;
        }
    }

    public final Object[] y(Object[] objArr, int i10, int i11, Iterator it) {
        if (!it.hasNext()) {
            k1.a("invalid buffersIterator");
        }
        if (!(i11 >= 0)) {
            k1.a("negative shift");
        }
        if (i11 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrR = r(objArr);
        int I = f0.I(i10, i11);
        int i12 = i11 - 5;
        objArrR[I] = y((Object[]) objArrR[I], i10, i12, it);
        while (true) {
            I++;
            if (I >= 32 || !it.hasNext()) {
                break;
            }
            objArrR[I] = y((Object[]) objArrR[I], 0, i12, it);
        }
        return objArrR;
    }

    public final Object[] z(Object[] objArr, int i10, Object[][] objArr2) {
        jc.b bVarA = jc.k.a(objArr2);
        int i11 = i10 >> 5;
        int i12 = this.f1433d;
        Object[] objArrY = i11 < (1 << i12) ? y(objArr, i10, i12, bVarA) : r(objArr);
        while (bVarA.hasNext()) {
            this.f1433d += 5;
            objArrY = u(objArrY);
            int i13 = this.f1433d;
            y(objArrY, 1 << i13, i13, bVarA);
        }
        return objArrY;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int iL = L();
        if (iL < 32) {
            Object[] objArrR = r(this.f1436g);
            objArrR[iL] = obj;
            this.f1436g = objArrR;
            this.f1437h = a() + 1;
        } else {
            A(this.f1435f, this.f1436g, u(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iL = L();
        Iterator it = collection.iterator();
        if (32 - iL >= collection.size()) {
            Object[] objArrR = r(this.f1436g);
            k(objArrR, iL, it);
            this.f1436g = objArrR;
            this.f1437h = collection.size() + this.f1437h;
            return true;
        }
        int size = ((collection.size() + iL) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrR2 = r(this.f1436g);
        k(objArrR2, iL, it);
        objArr[0] = objArrR2;
        for (int i10 = 1; i10 < size; i10++) {
            Object[] objArrT = t();
            k(objArrT, 0, it);
            objArr[i10] = objArrT;
        }
        this.f1435f = z(this.f1435f, I(), objArr);
        Object[] objArrT2 = t();
        k(objArrT2, 0, it);
        this.f1436g = objArrT2;
        this.f1437h = collection.size() + this.f1437h;
        return true;
    }
}
