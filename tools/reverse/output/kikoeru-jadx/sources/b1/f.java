package b1;

import java.util.Arrays;
import java.util.ListIterator;
import jc.l;
import pc.f0;
import x0.k1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f1426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f1427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1429d;

    public f(Object[] objArr, Object[] objArr2, int i10, int i11) {
        this.f1426a = objArr;
        this.f1427b = objArr2;
        this.f1428c = i10;
        this.f1429d = i11;
        if (!(a() > 32)) {
            k1.a("Trie-based persistent vector should have at least 33 elements, got " + a());
        }
        int length = objArr2.length;
    }

    public static Object[] p(Object[] objArr, int i10, int i11, Object obj, e eVar) {
        Object[] objArrCopyOf;
        int I = f0.I(i11, i10);
        if (i10 == 0) {
            if (I == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                l.d(objArrCopyOf, "copyOf(...)");
            }
            vb.l.i0(I + 1, I, 31, objArr, objArrCopyOf);
            eVar.f1425a = objArr[31];
            objArrCopyOf[I] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        l.d(objArrCopyOf2, "copyOf(...)");
        int i12 = i10 - 5;
        Object obj2 = objArr[I];
        l.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[I] = p((Object[]) obj2, i12, i11, obj, eVar);
        while (true) {
            I++;
            if (I >= 32 || objArrCopyOf2[I] == null) {
                break;
            }
            Object obj3 = objArr[I];
            l.c(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrCopyOf2[I] = p((Object[]) obj3, i12, 0, eVar.f1425a, eVar);
        }
        return objArrCopyOf2;
    }

    public static Object[] r(Object[] objArr, int i10, int i11, e eVar) {
        Object[] objArrR;
        int I = f0.I(i11, i10);
        if (i10 == 5) {
            eVar.f1425a = objArr[I];
            objArrR = null;
        } else {
            Object obj = objArr[I];
            l.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrR = r((Object[]) obj, i10 - 5, i11, eVar);
        }
        if (objArrR == null && I == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        l.d(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[I] = objArrR;
        return objArrCopyOf;
    }

    public static Object[] x(Object[] objArr, int i10, int i11, Object obj) {
        int I = f0.I(i11, i10);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        l.d(objArrCopyOf, "copyOf(...)");
        if (i10 == 0) {
            objArrCopyOf[I] = obj;
            return objArrCopyOf;
        }
        Object obj2 = objArrCopyOf[I];
        l.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf[I] = x((Object[]) obj2, i10 - 5, i11, obj);
        return objArrCopyOf;
    }

    @Override // vb.a
    public final int a() {
        return this.f1428c;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        Object[] objArr;
        g8.a.n(i10, a());
        if (w() <= i10) {
            objArr = this.f1427b;
        } else {
            objArr = this.f1426a;
            for (int i11 = this.f1429d; i11 > 0; i11 -= 5) {
                Object obj = objArr[f0.I(i10, i11)];
                l.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i10 & 31];
    }

    @Override // b1.c
    public final c i(int i10, Object obj) {
        int i11 = this.f1428c;
        g8.a.o(i10, i11);
        if (i10 == i11) {
            return j(obj);
        }
        int iW = w();
        Object[] objArr = this.f1426a;
        if (i10 >= iW) {
            return q(i10 - iW, obj, objArr);
        }
        e eVar = new e(null);
        return q(0, eVar.f1425a, p(objArr, this.f1429d, i10, obj, eVar));
    }

    @Override // b1.c
    public final c j(Object obj) {
        int iW = w();
        int i10 = this.f1428c;
        int i11 = i10 - iW;
        Object[] objArr = this.f1426a;
        Object[] objArr2 = this.f1427b;
        if (i11 >= 32) {
            Object[] objArr3 = new Object[32];
            objArr3[0] = obj;
            return s(objArr, objArr2, objArr3);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        l.d(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i11] = obj;
        return new f(objArr, objArrCopyOf, i10 + 1, this.f1429d);
    }

    @Override // b1.c
    public final g l() {
        return new g(this, this.f1426a, this.f1427b, this.f1429d);
    }

    @Override // vb.d, java.util.List
    public final ListIterator listIterator(int i10) {
        g8.a.o(i10, this.f1428c);
        return new h(i10, this.f1428c, (this.f1429d / 5) + 1, this.f1426a, this.f1427b);
    }

    @Override // b1.c
    public final c m(b bVar) {
        g gVar = new g(this, this.f1426a, this.f1427b, this.f1429d);
        gVar.F(bVar);
        return gVar.j();
    }

    @Override // b1.c
    public final c n(int i10) {
        g8.a.n(i10, this.f1428c);
        int iW = w();
        Object[] objArr = this.f1426a;
        int i11 = this.f1429d;
        return i10 >= iW ? v(objArr, iW, i11, i10 - iW) : v(u(objArr, i11, i10, new e(this.f1427b[0])), iW, i11, 0);
    }

    @Override // b1.c
    public final c o(int i10, Object obj) {
        int i11 = this.f1428c;
        g8.a.n(i10, i11);
        int iW = w();
        Object[] objArr = this.f1426a;
        Object[] objArr2 = this.f1427b;
        int i12 = this.f1429d;
        if (iW > i10) {
            return new f(x(objArr, i12, i10, obj), objArr2, i11, i12);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        l.d(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i10 & 31] = obj;
        return new f(objArr, objArrCopyOf, i11, i12);
    }

    public final f q(int i10, Object obj, Object[] objArr) {
        int iW = w();
        int i11 = this.f1428c;
        int i12 = i11 - iW;
        Object[] objArr2 = this.f1427b;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        l.d(objArrCopyOf, "copyOf(...)");
        if (i12 < 32) {
            vb.l.i0(i10 + 1, i10, i12, objArr2, objArrCopyOf);
            objArrCopyOf[i10] = obj;
            return new f(objArr, objArrCopyOf, i11 + 1, this.f1429d);
        }
        Object obj2 = objArr2[31];
        vb.l.i0(i10 + 1, i10, i12 - 1, objArr2, objArrCopyOf);
        objArrCopyOf[i10] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return s(objArr, objArrCopyOf, objArr3);
    }

    public final f s(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i10 = this.f1428c;
        int i11 = i10 >> 5;
        int i12 = this.f1429d;
        if (i11 <= (1 << i12)) {
            return new f(t(i12, objArr, objArr2), objArr3, i10 + 1, i12);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i13 = i12 + 5;
        return new f(t(i13, objArr4, objArr2), objArr3, i10 + 1, i13);
    }

    public final Object[] t(int i10, Object[] objArr, Object[] objArr2) {
        Object[] objArrCopyOf;
        int I = f0.I(a() - 1, i10);
        if (objArr != null) {
            objArrCopyOf = Arrays.copyOf(objArr, 32);
            l.d(objArrCopyOf, "copyOf(...)");
        } else {
            objArrCopyOf = new Object[32];
        }
        if (i10 == 5) {
            objArrCopyOf[I] = objArr2;
            return objArrCopyOf;
        }
        objArrCopyOf[I] = t(i10 - 5, (Object[]) objArrCopyOf[I], objArr2);
        return objArrCopyOf;
    }

    public final Object[] u(Object[] objArr, int i10, int i11, e eVar) {
        Object[] objArrCopyOf;
        int I = f0.I(i11, i10);
        if (i10 == 0) {
            if (I == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                l.d(objArrCopyOf, "copyOf(...)");
            }
            vb.l.i0(I, I + 1, 32, objArr, objArrCopyOf);
            objArrCopyOf[31] = eVar.f1425a;
            eVar.f1425a = objArr[I];
            return objArrCopyOf;
        }
        int I2 = objArr[31] == null ? f0.I(w() - 1, i10) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        l.d(objArrCopyOf2, "copyOf(...)");
        int i12 = i10 - 5;
        int i13 = I + 1;
        if (i13 <= I2) {
            while (true) {
                Object obj = objArrCopyOf2[I2];
                l.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrCopyOf2[I2] = u((Object[]) obj, i12, 0, eVar);
                if (I2 == i13) {
                    break;
                }
                I2--;
            }
        }
        Object obj2 = objArrCopyOf2[I];
        l.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[I] = u((Object[]) obj2, i12, i11, eVar);
        return objArrCopyOf2;
    }

    public final c v(Object[] objArr, int i10, int i11, int i12) {
        int i13 = this.f1428c - i10;
        if (i13 != 1) {
            Object[] objArr2 = this.f1427b;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            l.d(objArrCopyOf, "copyOf(...)");
            int i14 = i13 - 1;
            if (i12 < i14) {
                vb.l.i0(i12, i12 + 1, i13, objArr2, objArrCopyOf);
            }
            objArrCopyOf[i14] = null;
            return new f(objArr, objArrCopyOf, (i10 + i13) - 1, i11);
        }
        if (i11 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                l.d(objArr, "copyOf(...)");
            }
            return new j(objArr);
        }
        e eVar = new e(null);
        Object[] objArrR = r(objArr, i11, i10 - 1, eVar);
        l.b(objArrR);
        Object obj = eVar.f1425a;
        l.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr3 = (Object[]) obj;
        if (objArrR[1] != null) {
            return new f(objArrR, objArr3, i10, i11);
        }
        Object obj2 = objArrR[0];
        l.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return new f((Object[]) obj2, objArr3, i10, i11 - 5);
    }

    public final int w() {
        return (this.f1428c - 1) & (-32);
    }
}
