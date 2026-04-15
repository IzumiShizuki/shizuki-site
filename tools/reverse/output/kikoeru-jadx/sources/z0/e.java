package z0;

import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import jc.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e implements RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f26372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f26373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26374c = 0;

    public e(Object[] objArr) {
        this.f26372a = objArr;
    }

    public final void a(int i10, Object obj) {
        int i11 = this.f26374c + 1;
        if (this.f26372a.length < i11) {
            m(i11);
        }
        Object[] objArr = this.f26372a;
        int i12 = this.f26374c;
        if (i10 != i12) {
            System.arraycopy(objArr, i10, objArr, i10 + 1, i12 - i10);
        }
        objArr[i10] = obj;
        this.f26374c++;
    }

    public final void b(Object obj) {
        int i10 = this.f26374c + 1;
        if (this.f26372a.length < i10) {
            m(i10);
        }
        Object[] objArr = this.f26372a;
        int i11 = this.f26374c;
        objArr[i11] = obj;
        this.f26374c = i11 + 1;
    }

    public final void c(int i10, List list) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i11 = this.f26374c + size;
        if (this.f26372a.length < i11) {
            m(i11);
        }
        Object[] objArr = this.f26372a;
        int i12 = this.f26374c;
        if (i10 != i12) {
            System.arraycopy(objArr, i10, objArr, i10 + size, i12 - i10);
        }
        int size2 = list.size();
        for (int i13 = 0; i13 < size2; i13++) {
            objArr[i10 + i13] = list.get(i13);
        }
        this.f26374c += size;
    }

    public final void d(int i10, e eVar) {
        int i11 = eVar.f26374c;
        if (i11 == 0) {
            return;
        }
        int i12 = this.f26374c + i11;
        if (this.f26372a.length < i12) {
            m(i12);
        }
        Object[] objArr = this.f26372a;
        int i13 = this.f26374c;
        if (i10 != i13) {
            System.arraycopy(objArr, i10, objArr, i10 + i11, i13 - i10);
        }
        System.arraycopy(eVar.f26372a, 0, objArr, i10, i11);
        this.f26374c += i11;
    }

    public final boolean e(int i10, Collection collection) {
        int i11 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i12 = this.f26374c + size;
        if (this.f26372a.length < i12) {
            m(i12);
        }
        Object[] objArr = this.f26372a;
        int i13 = this.f26374c;
        if (i10 != i13) {
            System.arraycopy(objArr, i10, objArr, i10 + size, i13 - i10);
        }
        for (Object obj : collection) {
            int i14 = i11 + 1;
            if (i11 < 0) {
                ud.b.H();
                throw null;
            }
            objArr[i11 + i10] = obj;
            i11 = i14;
        }
        this.f26374c += size;
        return true;
    }

    public final List f() {
        b bVar = this.f26373b;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(this);
        this.f26373b = bVar2;
        return bVar2;
    }

    public final void g() {
        Object[] objArr = this.f26372a;
        int i10 = this.f26374c;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f26374c = 0;
    }

    public final boolean h(Object obj) {
        int i10 = this.f26374c - 1;
        if (i10 >= 0) {
            for (int i11 = 0; !l.a(this.f26372a[i11], obj); i11++) {
                if (i11 != i10) {
                }
            }
            return true;
        }
        return false;
    }

    public final int i(Object obj) {
        Object[] objArr = this.f26372a;
        int i10 = this.f26374c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (l.a(obj, objArr[i11])) {
                return i11;
            }
        }
        return -1;
    }

    public final boolean j(Object obj) {
        int i10 = i(obj);
        if (i10 < 0) {
            return false;
        }
        k(i10);
        return true;
    }

    public final Object k(int i10) {
        Object[] objArr = this.f26372a;
        Object obj = objArr[i10];
        int i11 = this.f26374c;
        if (i10 != i11 - 1) {
            int i12 = i10 + 1;
            System.arraycopy(objArr, i12, objArr, i10, i11 - i12);
        }
        int i13 = this.f26374c - 1;
        this.f26374c = i13;
        objArr[i13] = null;
        return obj;
    }

    public final void l(int i10, int i11) {
        if (i11 > i10) {
            int i12 = this.f26374c;
            if (i11 < i12) {
                Object[] objArr = this.f26372a;
                System.arraycopy(objArr, i11, objArr, i10, i12 - i11);
            }
            int i13 = this.f26374c;
            int i14 = i13 - (i11 - i10);
            int i15 = i13 - 1;
            if (i14 <= i15) {
                int i16 = i14;
                while (true) {
                    this.f26372a[i16] = null;
                    if (i16 == i15) {
                        break;
                    } else {
                        i16++;
                    }
                }
            }
            this.f26374c = i14;
        }
    }

    public final void m(int i10) {
        Object[] objArr = this.f26372a;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i10, length * 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.f26372a = objArr2;
    }
}
