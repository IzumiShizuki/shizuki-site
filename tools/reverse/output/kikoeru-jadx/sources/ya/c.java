package ya;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class c implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25951a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f25952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f25953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f25954d;

    public c(l lVar) {
        this.f25954d = lVar;
        Collection collection = lVar.f26012b;
        this.f25953c = collection;
        this.f25952b = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public void a() {
        l lVar = (l) this.f25954d;
        lVar.i();
        if (lVar.f26012b != ((Collection) this.f25953c)) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f25951a) {
            case 0:
                break;
            case 1:
                break;
            default:
                a();
                break;
        }
        return this.f25952b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f25951a) {
            case 0:
                Map.Entry entry = (Map.Entry) this.f25952b.next();
                this.f25953c = (Collection) entry.getValue();
                return ((d) this.f25954d).a(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) this.f25952b.next();
                this.f25953c = entry2;
                return entry2.getKey();
            default:
                a();
                return this.f25952b.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f25951a) {
            case 0:
                if (!(((Collection) this.f25953c) != null)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                this.f25952b.remove();
                ((d) this.f25954d).f25965d.f26068e -= ((Collection) this.f25953c).size();
                ((Collection) this.f25953c).clear();
                this.f25953c = null;
                return;
            case 1:
                Map.Entry entry = (Map.Entry) this.f25953c;
                if (!(entry != null)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                Collection collection = (Collection) entry.getValue();
                this.f25952b.remove();
                ((e) this.f25954d).f25970b.f26068e -= collection.size();
                collection.clear();
                this.f25953c = null;
                return;
            default:
                this.f25952b.remove();
                l lVar = (l) this.f25954d;
                v0 v0Var = lVar.f26015e;
                v0Var.f26068e--;
                lVar.j();
                return;
        }
    }

    public c(l lVar, ListIterator listIterator) {
        this.f25954d = lVar;
        this.f25953c = lVar.f26012b;
        this.f25952b = listIterator;
    }

    public c(e eVar, Iterator it) {
        this.f25952b = it;
        this.f25954d = eVar;
    }

    public c(d dVar) {
        this.f25954d = dVar;
        this.f25952b = dVar.f25964c.entrySet().iterator();
    }
}
