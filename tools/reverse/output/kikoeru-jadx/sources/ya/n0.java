package ya;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f26023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f26024c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Iterator f26025d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f26026e;

    public n0() {
        this.f26022a = 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        Object next;
        int i10 = this.f26022a;
        if (i10 == 4) {
            throw new IllegalStateException();
        }
        int iB = w0.c.b(i10);
        if (iB == 0) {
            return true;
        }
        if (iB == 2) {
            return false;
        }
        this.f26022a = 4;
        switch (this.f26024c) {
            case 0:
                do {
                    Iterator it = this.f26025d;
                    if (!it.hasNext()) {
                        this.f26022a = 3;
                        next = null;
                    } else {
                        next = it.next();
                    }
                    break;
                } while (!((xa.e) this.f26026e).apply(next));
                break;
            default:
                do {
                    Iterator it2 = this.f26025d;
                    if (!it2.hasNext()) {
                        this.f26022a = 3;
                        next = null;
                    } else {
                        next = it2.next();
                    }
                    break;
                } while (!((i1) this.f26026e).f26000b.contains(next));
                break;
        }
        this.f26023b = next;
        if (this.f26022a == 3) {
            return false;
        }
        this.f26022a = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f26022a = 2;
        Object obj = this.f26023b;
        this.f26023b = null;
        return obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n0(Iterator it, xa.e eVar) {
        this();
        this.f26024c = 0;
        this.f26025d = it;
        this.f26026e = eVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n0(i1 i1Var) {
        this();
        this.f26024c = 1;
        this.f26026e = i1Var;
        this.f26025d = i1Var.f25999a.iterator();
    }
}
