package h1;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h0 implements ListIterator, kc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8014a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f8015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8016c;

    public h0(ef.i iVar, int i10) {
        this.f8016c = iVar;
        this.f8015b = ((List) iVar.f6570b).listIterator(vb.m.O(i10, iVar));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f8014a) {
            case 0:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
            case 1:
                ListIterator listIterator = (ListIterator) this.f8015b;
                listIterator.add(obj);
                listIterator.previous();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f8014a) {
            case 0:
                if (((jc.w) this.f8015b).f10836a < ((i0) this.f8016c).f8021d - 1) {
                }
                break;
        }
        return ((ListIterator) this.f8015b).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f8014a) {
            case 0:
                if (((jc.w) this.f8015b).f10836a >= 0) {
                }
                break;
        }
        return ((ListIterator) this.f8015b).hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f8014a) {
            case 0:
                jc.w wVar = (jc.w) this.f8015b;
                int i10 = wVar.f10836a + 1;
                i0 i0Var = (i0) this.f8016c;
                t.a(i10, i0Var.f8021d);
                wVar.f10836a = i10;
                break;
        }
        return ((ListIterator) this.f8015b).previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f8014a) {
            case 0:
                return ((jc.w) this.f8015b).f10836a + 1;
            case 1:
                vb.x xVar = (vb.x) this.f8016c;
                return ud.b.r(xVar) - ((ListIterator) this.f8015b).previousIndex();
            default:
                ef.i iVar = (ef.i) this.f8016c;
                return ud.b.r(iVar) - ((ListIterator) this.f8015b).previousIndex();
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f8014a) {
            case 0:
                jc.w wVar = (jc.w) this.f8015b;
                int i10 = wVar.f10836a;
                i0 i0Var = (i0) this.f8016c;
                t.a(i10, i0Var.f8021d);
                wVar.f10836a = i10 - 1;
                break;
        }
        return ((ListIterator) this.f8015b).next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f8014a) {
            case 0:
                return ((jc.w) this.f8015b).f10836a;
            case 1:
                vb.x xVar = (vb.x) this.f8016c;
                return ud.b.r(xVar) - ((ListIterator) this.f8015b).nextIndex();
            default:
                ef.i iVar = (ef.i) this.f8016c;
                return ud.b.r(iVar) - ((ListIterator) this.f8015b).nextIndex();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f8014a) {
            case 0:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
            case 1:
                ((ListIterator) this.f8015b).remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f8014a) {
            case 0:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
            case 1:
                ((ListIterator) this.f8015b).set(obj);
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public h0(vb.x xVar, int i10) {
        this.f8016c = xVar;
        this.f8015b = xVar.f22824a.listIterator(vb.m.O(i10, xVar));
    }

    public h0(jc.w wVar, i0 i0Var) {
        this.f8015b = wVar;
        this.f8016c = i0Var;
    }
}
