package ce;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class z implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Stack f3991a = new Stack();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w f3992b;

    public z(e eVar) {
        while (eVar instanceof b0) {
            b0 b0Var = (b0) eVar;
            this.f3991a.push(b0Var);
            eVar = b0Var.f3898c;
        }
        this.f3992b = (w) eVar;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final w next() {
        w wVar;
        w wVar2 = this.f3992b;
        if (wVar2 == null) {
            throw new NoSuchElementException();
        }
        while (true) {
            Stack stack = this.f3991a;
            if (!stack.isEmpty()) {
                e eVar = ((b0) stack.pop()).f3899d;
                while (eVar instanceof b0) {
                    b0 b0Var = (b0) eVar;
                    stack.push(b0Var);
                    eVar = b0Var.f3898c;
                }
                wVar = (w) eVar;
                if (wVar.f3989b.length != 0) {
                    break;
                }
            } else {
                wVar = null;
                break;
            }
        }
        this.f3992b = wVar;
        return wVar2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3992b != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
