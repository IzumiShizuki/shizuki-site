package b1;

import java.util.NoSuchElementException;
import jc.l;
import pc.f0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object[] f1447d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1448e;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public k(Object[] objArr, int i10, int i11, int i12) {
        super(i10, i11);
        this.f1446c = i12;
        Object[] objArr2 = new Object[i12];
        this.f1447d = objArr2;
        ?? r52 = i10 == i11 ? 1 : 0;
        this.f1448e = r52;
        objArr2[0] = objArr;
        b(i10 - r52, 1);
    }

    public final Object a() {
        int i10 = this.f1419a & 31;
        Object obj = this.f1447d[this.f1446c - 1];
        l.c(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return ((Object[]) obj)[i10];
    }

    public final void b(int i10, int i11) {
        int i12 = (this.f1446c - i11) * 5;
        while (i11 < this.f1446c) {
            Object[] objArr = this.f1447d;
            Object obj = objArr[i11 - 1];
            l.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i11] = ((Object[]) obj)[f0.I(i10, i12)];
            i12 -= 5;
            i11++;
        }
    }

    public final void c(int i10) {
        int i11 = 0;
        while (f0.I(this.f1419a, i11) == i10) {
            i11 += 5;
        }
        if (i11 > 0) {
            b(this.f1419a, ((this.f1446c - 1) - (i11 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objA = a();
        int i10 = this.f1419a + 1;
        this.f1419a = i10;
        if (i10 == this.f1420b) {
            this.f1448e = true;
            return objA;
        }
        c(0);
        return objA;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.f1419a--;
        if (this.f1448e) {
            this.f1448e = false;
            return a();
        }
        c(31);
        return a();
    }
}
