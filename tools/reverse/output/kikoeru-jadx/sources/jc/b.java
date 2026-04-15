package jc;

import java.util.Iterator;
import java.util.NoSuchElementException;
import o.v0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class b implements Iterator, kc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f10816c;

    public /* synthetic */ b(int i10, Object obj) {
        this.f10814a = i10;
        this.f10816c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f10814a) {
            case 0:
                if (this.f10815b < ((Object[]) this.f10816c).length) {
                }
                break;
            case 1:
                if (this.f10815b < ((v0) this.f10816c).g()) {
                }
                break;
            case 2:
                if (this.f10815b < ((byte[]) this.f10816c).length) {
                }
                break;
            case 3:
                if (this.f10815b < ((int[]) this.f10816c).length) {
                }
                break;
            case 4:
                if (this.f10815b < ((long[]) this.f10816c).length) {
                }
                break;
            case 5:
                if (this.f10815b < ((short[]) this.f10816c).length) {
                }
                break;
            case 6:
                if (this.f10815b > 0) {
                }
                break;
            default:
                if (this.f10815b < ((vb.d) this.f10816c).a()) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f10814a) {
            case 0:
                try {
                    Object[] objArr = (Object[]) this.f10816c;
                    int i10 = this.f10815b;
                    this.f10815b = i10 + 1;
                    return objArr[i10];
                } catch (ArrayIndexOutOfBoundsException e10) {
                    this.f10815b--;
                    throw new NoSuchElementException(e10.getMessage());
                }
            case 1:
                v0 v0Var = (v0) this.f10816c;
                int i11 = this.f10815b;
                this.f10815b = i11 + 1;
                return v0Var.h(i11);
            case 2:
                int i12 = this.f10815b;
                byte[] bArr = (byte[]) this.f10816c;
                if (i12 >= bArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f10815b));
                }
                this.f10815b = i12 + 1;
                return new ub.r(bArr[i12]);
            case 3:
                int i13 = this.f10815b;
                int[] iArr = (int[]) this.f10816c;
                if (i13 >= iArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f10815b));
                }
                this.f10815b = i13 + 1;
                return new ub.t(iArr[i13]);
            case 4:
                int i14 = this.f10815b;
                long[] jArr = (long[]) this.f10816c;
                if (i14 >= jArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f10815b));
                }
                this.f10815b = i14 + 1;
                return new ub.v(jArr[i14]);
            case 5:
                int i15 = this.f10815b;
                short[] sArr = (short[]) this.f10816c;
                if (i15 >= sArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f10815b));
                }
                this.f10815b = i15 + 1;
                return new ub.y(sArr[i15]);
            case 6:
                wf.x xVar = (wf.x) this.f10816c;
                int i16 = xVar.f24087c;
                int i17 = this.f10815b;
                this.f10815b = i17 - 1;
                return xVar.f24089e[i16 - i17];
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                vb.d dVar = (vb.d) this.f10816c;
                int i18 = this.f10815b;
                this.f10815b = i18 + 1;
                return dVar.get(i18);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f10814a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 4:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 5:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 6:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(Object[] objArr) {
        this.f10814a = 0;
        l.e(objArr, "array");
        this.f10816c = objArr;
    }

    public b(wf.x xVar) {
        this.f10814a = 6;
        this.f10816c = xVar;
        this.f10815b = xVar.f24087c;
    }
}
