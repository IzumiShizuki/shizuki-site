package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j0 implements kc.e, Set, kc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f15992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f15993b;

    public j0(h0 h0Var) {
        jc.l.e(h0Var, "parent");
        this.f15992a = h0Var;
        this.f15993b = h0Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.f15993b.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        jc.l.e(collection, "elements");
        h0 h0Var = this.f15993b;
        h0Var.getClass();
        int i10 = h0Var.f15980g;
        for (Object obj : collection) {
            int iD = h0Var.d(obj);
            h0Var.f15975b[iD] = obj;
            long[] jArr = h0Var.f15976c;
            int i11 = h0Var.f15977d;
            jArr[iD] = (((long) i11) & 2147483647L) | 4611686016279904256L;
            if (i11 != Integer.MAX_VALUE) {
                jArr[i11] = ((2147483647L & ((long) iD)) << 31) | (jArr[i11] & (-4611686016279904257L));
            }
            h0Var.f15977d = iD;
            if (h0Var.f15978e == Integer.MAX_VALUE) {
                h0Var.f15978e = iD;
            }
        }
        return i10 != h0Var.f15980g;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f15993b.b();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f15992a.c(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        jc.l.e(collection, "elements");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f15992a.c(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j0.class != obj.getClass()) {
            return false;
        }
        return jc.l.a(this.f15992a, ((j0) obj).f15992a);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f15992a.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f15992a.f15980g == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new d1.c(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f15993b.g(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0095, code lost:
    
        if (((r5 & ((~r5) << 6)) & r12) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0097, code lost:
    
        r14 = -1;
     */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean removeAll(java.util.Collection r21) {
        /*
            r20 = this;
            r0 = r21
            java.lang.String r1 = "elements"
            jc.l.e(r0, r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r1 = r20
            o.h0 r2 = r1.f15993b
            r2.getClass()
            int r3 = r2.f15980g
            java.util.Iterator r0 = r0.iterator()
        L16:
            boolean r4 = r0.hasNext()
            r5 = 1
            r6 = 0
            if (r4 == 0) goto La5
            java.lang.Object r4 = r0.next()
            if (r4 == 0) goto L29
            int r7 = r4.hashCode()
            goto L2a
        L29:
            r7 = 0
        L2a:
            r8 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r7 = r7 * r8
            int r8 = r7 << 16
            r7 = r7 ^ r8
            r8 = r7 & 127(0x7f, float:1.78E-43)
            int r9 = r2.f15979f
            int r7 = r7 >>> 7
            r7 = r7 & r9
        L39:
            long[] r10 = r2.f15974a
            int r11 = r7 >> 3
            r12 = r7 & 7
            int r12 = r12 << 3
            r13 = r10[r11]
            long r13 = r13 >>> r12
            int r11 = r11 + r5
            r15 = r10[r11]
            int r10 = 64 - r12
            long r10 = r15 << r10
            r15 = r6
            r21 = 1
            long r5 = (long) r12
            long r5 = -r5
            r12 = 63
            long r5 = r5 >> r12
            long r5 = r5 & r10
            long r5 = r5 | r13
            long r10 = (long) r8
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r10 = r10 * r12
            long r10 = r10 ^ r5
            long r12 = r10 - r12
            long r10 = ~r10
            long r10 = r10 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
        L68:
            r16 = 0
            int r14 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r14 == 0) goto L8b
            int r14 = java.lang.Long.numberOfTrailingZeros(r10)
            int r14 = r14 >> 3
            int r14 = r14 + r7
            r14 = r14 & r9
            r18 = r12
            java.lang.Object[] r12 = r2.f15975b
            r12 = r12[r14]
            boolean r12 = jc.l.a(r12, r4)
            if (r12 == 0) goto L83
            goto L98
        L83:
            r12 = 1
            long r12 = r10 - r12
            long r10 = r10 & r12
            r12 = r18
            goto L68
        L8b:
            r18 = r12
            long r10 = ~r5
            r12 = 6
            long r10 = r10 << r12
            long r5 = r5 & r10
            long r5 = r5 & r18
            int r10 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r10 == 0) goto L9f
            r14 = -1
        L98:
            if (r14 < 0) goto L16
            r2.h(r14)
            goto L16
        L9f:
            int r6 = r15 + 8
            int r7 = r7 + r6
            r7 = r7 & r9
            r5 = 1
            goto L39
        La5:
            r21 = 1
            int r0 = r2.f15980g
            if (r3 == r0) goto Lac
            return r21
        Lac:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.j0.removeAll(java.util.Collection):boolean");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        jc.l.e(collection, "elements");
        return this.f15993b.i(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f15992a.f15980g;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return jc.g.a(this);
    }

    public final String toString() {
        return this.f15992a.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        jc.l.e(objArr, "array");
        return jc.g.b(this, objArr);
    }
}
