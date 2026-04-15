package b1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import vb.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f1444b = new j(new Object[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f1445a;

    public j(Object[] objArr) {
        this.f1445a = objArr;
    }

    @Override // vb.a
    public final int a() {
        return this.f1445a.length;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        g8.a.n(i10, a());
        return this.f1445a[i10];
    }

    @Override // b1.c
    public final c i(int i10, Object obj) {
        Object[] objArr = this.f1445a;
        g8.a.o(i10, objArr.length);
        if (i10 == objArr.length) {
            return j(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            l.m0(0, i10, 6, objArr, objArr2);
            l.i0(i10 + 1, i10, objArr.length, objArr, objArr2);
            objArr2[i10] = obj;
            return new j(objArr2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        jc.l.d(objArrCopyOf, "copyOf(...)");
        l.i0(i10 + 1, i10, objArr.length - 1, objArr, objArrCopyOf);
        objArrCopyOf[i10] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new f(objArrCopyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // vb.d, java.util.List
    public final int indexOf(Object obj) {
        return l.A0(obj, this.f1445a);
    }

    @Override // b1.c
    public final c j(Object obj) {
        Object[] objArr = this.f1445a;
        if (objArr.length >= 32) {
            Object[] objArr2 = new Object[32];
            objArr2[0] = obj;
            return new f(objArr, objArr2, objArr.length + 1, 0);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
        jc.l.d(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[objArr.length] = obj;
        return new j(objArrCopyOf);
    }

    @Override // b1.c
    public final c k(Collection collection) {
        Object[] objArr = this.f1445a;
        if (collection.size() + objArr.length > 32) {
            g gVarL = l();
            gVarL.addAll(collection);
            return gVarL.j();
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        jc.l.d(objArrCopyOf, "copyOf(...)");
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[length] = it.next();
            length++;
        }
        return new j(objArrCopyOf);
    }

    @Override // b1.c
    public final g l() {
        return new g(this, null, this.f1445a, 0);
    }

    @Override // vb.d, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.f1445a;
        jc.l.e(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i10 = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i10 < 0) {
                        break;
                    }
                    length = i10;
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i11 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i11 < 0) {
                        break;
                    }
                    length2 = i11;
                }
            }
        }
        return -1;
    }

    @Override // vb.d, java.util.List
    public final ListIterator listIterator(int i10) {
        Object[] objArr = this.f1445a;
        g8.a.o(i10, objArr.length);
        return new d(i10, objArr.length, objArr);
    }

    @Override // b1.c
    public final c m(b bVar) {
        Object[] objArr = this.f1445a;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArrCopyOf = objArr;
        boolean z10 = false;
        for (int i10 = 0; i10 < length2; i10++) {
            Object obj = objArr[i10];
            if (((Boolean) bVar.a(obj)).booleanValue()) {
                if (!z10) {
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    jc.l.d(objArrCopyOf, "copyOf(...)");
                    z10 = true;
                    length = i10;
                }
            } else if (z10) {
                objArrCopyOf[length] = obj;
                length++;
            }
        }
        return length == objArr.length ? this : length == 0 ? f1444b : new j(l.o0(0, length, objArrCopyOf));
    }

    @Override // b1.c
    public final c n(int i10) {
        Object[] objArr = this.f1445a;
        g8.a.n(i10, objArr.length);
        if (objArr.length == 1) {
            return f1444b;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length - 1);
        jc.l.d(objArrCopyOf, "copyOf(...)");
        l.i0(i10, i10 + 1, objArr.length, objArr, objArrCopyOf);
        return new j(objArrCopyOf);
    }

    @Override // b1.c
    public final c o(int i10, Object obj) {
        Object[] objArr = this.f1445a;
        g8.a.n(i10, objArr.length);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        jc.l.d(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i10] = obj;
        return new j(objArrCopyOf);
    }
}
