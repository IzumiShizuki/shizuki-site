package c1;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class d implements Iterator, kc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n[] f3211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3213c = true;

    public d(m mVar, n[] nVarArr) {
        this.f3211a = nVarArr;
        nVarArr[0].a(Integer.bitCount(mVar.f3233a) * 2, 0, mVar.f3236d);
        this.f3212b = 0;
        a();
    }

    public final void a() {
        int i10 = this.f3212b;
        n[] nVarArr = this.f3211a;
        n nVar = nVarArr[i10];
        if (nVar.f3239c < nVar.f3238b) {
            return;
        }
        while (-1 < i10) {
            int iB = b(i10);
            if (iB == -1) {
                n nVar2 = nVarArr[i10];
                int i11 = nVar2.f3239c;
                Object[] objArr = nVar2.f3237a;
                if (i11 < objArr.length) {
                    int length = objArr.length;
                    nVar2.f3239c = i11 + 1;
                    iB = b(i10);
                }
            }
            if (iB != -1) {
                this.f3212b = iB;
                return;
            }
            if (i10 > 0) {
                n nVar3 = nVarArr[i10 - 1];
                int i12 = nVar3.f3239c;
                int length2 = nVar3.f3237a.length;
                nVar3.f3239c = i12 + 1;
            }
            nVarArr[i10].a(0, 0, m.f3232e.f3236d);
            i10--;
        }
        this.f3213c = false;
    }

    public final int b(int i10) {
        n[] nVarArr = this.f3211a;
        n nVar = nVarArr[i10];
        int i11 = nVar.f3239c;
        if (i11 < nVar.f3238b) {
            return i10;
        }
        Object[] objArr = nVar.f3237a;
        if (i11 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i11];
        jc.l.c(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        m mVar = (m) obj;
        if (i10 == 6) {
            n nVar2 = nVarArr[i10 + 1];
            Object[] objArr2 = mVar.f3236d;
            nVar2.a(objArr2.length, 0, objArr2);
        } else {
            nVarArr[i10 + 1].a(Integer.bitCount(mVar.f3233a) * 2, 0, mVar.f3236d);
        }
        return b(i10 + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3213c;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.f3213c) {
            throw new NoSuchElementException();
        }
        Object next = this.f3211a[this.f3212b].next();
        a();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
