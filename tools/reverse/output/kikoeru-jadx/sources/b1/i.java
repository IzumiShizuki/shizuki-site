package b1;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f1440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1441d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public k f1442e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1443f;

    public i(g gVar, int i10) {
        super(i10, gVar.f1437h);
        this.f1440c = gVar;
        this.f1441d = gVar.l();
        this.f1443f = -1;
        b();
    }

    public final void a() {
        if (this.f1441d != this.f1440c.l()) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // b1.a, java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i10 = this.f1419a;
        g gVar = this.f1440c;
        gVar.add(i10, obj);
        this.f1419a++;
        this.f1420b = gVar.a();
        this.f1441d = gVar.l();
        this.f1443f = -1;
        b();
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void b() {
        g gVar = this.f1440c;
        Object[] objArr = gVar.f1435f;
        if (objArr == null) {
            this.f1442e = null;
            return;
        }
        int i10 = (gVar.f1437h - 1) & (-32);
        int i11 = this.f1419a;
        if (i11 > i10) {
            i11 = i10;
        }
        int i12 = (gVar.f1433d / 5) + 1;
        k kVar = this.f1442e;
        if (kVar == null) {
            this.f1442e = new k(objArr, i11, i10, i12);
            return;
        }
        kVar.f1419a = i11;
        kVar.f1420b = i10;
        kVar.f1446c = i12;
        if (kVar.f1447d.length < i12) {
            kVar.f1447d = new Object[i12];
        }
        kVar.f1447d[0] = objArr;
        ?? r62 = i11 == i10 ? 1 : 0;
        kVar.f1448e = r62;
        kVar.b(i11 - r62, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f1419a;
        this.f1443f = i10;
        k kVar = this.f1442e;
        g gVar = this.f1440c;
        if (kVar == null) {
            Object[] objArr = gVar.f1436g;
            this.f1419a = i10 + 1;
            return objArr[i10];
        }
        if (kVar.hasNext()) {
            this.f1419a++;
            return kVar.next();
        }
        Object[] objArr2 = gVar.f1436g;
        int i11 = this.f1419a;
        this.f1419a = i11 + 1;
        return objArr2[i11 - kVar.f1420b];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f1419a;
        this.f1443f = i10 - 1;
        k kVar = this.f1442e;
        g gVar = this.f1440c;
        if (kVar == null) {
            Object[] objArr = gVar.f1436g;
            int i11 = i10 - 1;
            this.f1419a = i11;
            return objArr[i11];
        }
        int i12 = kVar.f1420b;
        if (i10 <= i12) {
            this.f1419a = i10 - 1;
            return kVar.previous();
        }
        Object[] objArr2 = gVar.f1436g;
        int i13 = i10 - 1;
        this.f1419a = i13;
        return objArr2[i13 - i12];
    }

    @Override // b1.a, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i10 = this.f1443f;
        if (i10 == -1) {
            throw new IllegalStateException();
        }
        g gVar = this.f1440c;
        gVar.i(i10);
        int i11 = this.f1443f;
        if (i11 < this.f1419a) {
            this.f1419a = i11;
        }
        this.f1420b = gVar.a();
        this.f1441d = gVar.l();
        this.f1443f = -1;
        b();
    }

    @Override // b1.a, java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i10 = this.f1443f;
        if (i10 == -1) {
            throw new IllegalStateException();
        }
        g gVar = this.f1440c;
        gVar.set(i10, obj);
        this.f1441d = gVar.l();
        b();
    }
}
