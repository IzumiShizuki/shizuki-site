package b1;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f1438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f1439d;

    public h(int i10, int i11, int i12, Object[] objArr, Object[] objArr2) {
        super(i10, i11);
        this.f1438c = objArr2;
        int i13 = (i11 - 1) & (-32);
        this.f1439d = new k(objArr, i10 > i13 ? i13 : i10, i13, i12);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        k kVar = this.f1439d;
        if (kVar.hasNext()) {
            this.f1419a++;
            return kVar.next();
        }
        int i10 = this.f1419a;
        this.f1419a = i10 + 1;
        return this.f1438c[i10 - kVar.f1420b];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f1419a;
        k kVar = this.f1439d;
        int i11 = kVar.f1420b;
        if (i10 <= i11) {
            this.f1419a = i10 - 1;
            return kVar.previous();
        }
        int i12 = i10 - 1;
        this.f1419a = i12;
        return this.f1438c[i12 - i11];
    }
}
