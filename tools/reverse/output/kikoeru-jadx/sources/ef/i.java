package ef;

import h1.h0;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i extends vb.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6569a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6570b;

    public i(j jVar) {
        this.f6570b = jVar;
    }

    @Override // vb.a
    public final int a() {
        switch (this.f6569a) {
            case 0:
                return ((j) this.f6570b).f6571a.groupCount() + 1;
            default:
                return ((List) this.f6570b).size();
        }
    }

    @Override // vb.a, java.util.Collection, java.util.List
    public /* bridge */ boolean contains(Object obj) {
        switch (this.f6569a) {
            case 0:
                if (obj instanceof String) {
                    return super.contains((String) obj);
                }
                return false;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.List
    public final Object get(int i10) {
        switch (this.f6569a) {
            case 0:
                String strGroup = ((j) this.f6570b).f6571a.group(i10);
                return strGroup == null ? "" : strGroup;
            default:
                return ((List) this.f6570b).get(vb.m.N(i10, this));
        }
    }

    @Override // vb.d, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.f6569a) {
            case 0:
                if (obj instanceof String) {
                    return super.indexOf((String) obj);
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    @Override // vb.d, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        switch (this.f6569a) {
            case 1:
                return new h0(this, 0);
            default:
                return super.iterator();
        }
    }

    @Override // vb.d, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.f6569a) {
            case 0:
                if (obj instanceof String) {
                    return super.lastIndexOf((String) obj);
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // vb.d, java.util.List
    public ListIterator listIterator() {
        switch (this.f6569a) {
            case 1:
                return new h0(this, 0);
            default:
                return super.listIterator();
        }
    }

    @Override // vb.d, java.util.List
    public ListIterator listIterator(int i10) {
        switch (this.f6569a) {
            case 1:
                return new h0(this, i10);
            default:
                return super.listIterator(i10);
        }
    }

    public i(List list) {
        jc.l.e(list, "delegate");
        this.f6570b = list;
    }
}
