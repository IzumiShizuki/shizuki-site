package b1;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1423c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f1424d;

    public d(int i10, int i11, Object[] objArr) {
        super(i10, i11);
        this.f1424d = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f1423c) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object[] objArr = (Object[]) this.f1424d;
                int i10 = this.f1419a;
                this.f1419a = i10 + 1;
                return objArr[i10];
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                this.f1419a++;
                return this.f1424d;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f1423c) {
            case 0:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                Object[] objArr = (Object[]) this.f1424d;
                int i10 = this.f1419a - 1;
                this.f1419a = i10;
                return objArr[i10];
            default:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                this.f1419a--;
                return this.f1424d;
        }
    }

    public d(int i10, Object obj) {
        super(i10, 1);
        this.f1424d = obj;
    }
}
