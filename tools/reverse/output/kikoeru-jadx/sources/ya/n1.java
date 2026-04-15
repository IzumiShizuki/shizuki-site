package ya;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class n1 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f26027a;

    public n1(Iterator it) {
        it.getClass();
        this.f26027a = it;
    }

    public abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f26027a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.f26027a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f26027a.remove();
    }
}
