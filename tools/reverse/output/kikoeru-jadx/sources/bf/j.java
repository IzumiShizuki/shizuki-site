package bf;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import jc.c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j extends vb.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f2808c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f2809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2810b;

    public j(int i10) {
    }

    @Override // vb.g
    public final int a() {
        return this.f2810b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007c, code lost:
    
        if (jc.c0.b(r0).add(r7) == false) goto L26;
     */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean add(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.f2810b
            r1 = 1
            if (r0 != 0) goto L9
            r6.f2809a = r7
            goto L7f
        L9:
            r2 = 0
            if (r0 != r1) goto L21
            java.lang.Object r0 = r6.f2809a
            boolean r0 = jc.l.a(r0, r7)
            if (r0 == 0) goto L15
            goto L7e
        L15:
            java.lang.Object r0 = r6.f2809a
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r0
            r3[r1] = r7
            r6.f2809a = r3
            goto L7f
        L21:
            r3 = 5
            if (r0 >= r3) goto L6d
            java.lang.Object r0 = r6.f2809a
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>"
            jc.l.c(r0, r3)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            boolean r3 = vb.l.e0(r7, r0)
            if (r3 == 0) goto L34
            goto L7e
        L34:
            int r3 = r6.f2810b
            r4 = 4
            if (r3 != r4) goto L5c
            int r3 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r3)
            java.lang.String r3 = "elements"
            jc.l.e(r0, r3)
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            int r4 = r0.length
            int r4 = vb.w.t(r4)
            r3.<init>(r4)
            int r4 = r0.length
        L4e:
            if (r2 >= r4) goto L58
            r5 = r0[r2]
            r3.add(r5)
            int r2 = r2 + 1
            goto L4e
        L58:
            r3.add(r7)
            goto L6a
        L5c:
            int r3 = r3 + r1
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r0, r3)
            java.lang.String r0 = "copyOf(...)"
            jc.l.d(r3, r0)
            int r0 = r3.length
            int r0 = r0 - r1
            r3[r0] = r7
        L6a:
            r6.f2809a = r3
            goto L7f
        L6d:
            java.lang.Object r0 = r6.f2809a
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>"
            jc.l.c(r0, r3)
            java.util.Set r0 = jc.c0.b(r0)
            boolean r7 = r0.add(r7)
            if (r7 != 0) goto L7f
        L7e:
            return r2
        L7f:
            int r7 = r6.f2810b
            int r7 = r7 + r1
            r6.f2810b = r7
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: bf.j.add(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f2809a = null;
        this.f2810b = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (a() == 0) {
            return false;
        }
        if (a() == 1) {
            return jc.l.a(this.f2809a, obj);
        }
        if (a() < 5) {
            Object obj2 = this.f2809a;
            jc.l.c(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return vb.l.e0(obj, (Object[]) obj2);
        }
        Object obj3 = this.f2809a;
        jc.l.c(obj3, "null cannot be cast to non-null type kotlin.collections.Set<T of org.jetbrains.kotlin.utils.SmartSet>");
        return ((Set) obj3).contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i10 = this.f2810b;
        if (i10 == 0) {
            return Collections.EMPTY_SET.iterator();
        }
        if (i10 == 1) {
            return new i(0, this.f2809a);
        }
        if (i10 < 5) {
            Object obj = this.f2809a;
            jc.l.c(obj, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return new h((Object[]) obj);
        }
        Object obj2 = this.f2809a;
        jc.l.c(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
        return c0.b(obj2).iterator();
    }
}
