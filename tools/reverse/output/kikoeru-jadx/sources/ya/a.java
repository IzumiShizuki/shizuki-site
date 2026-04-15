package ya;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f25941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f25942b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Collection f25943c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Iterator f25944d = o0.f26031a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v0 f25945e;

    public a(v0 v0Var) {
        this.f25945e = v0Var;
        this.f25941a = v0Var.f26067d.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f25941a.hasNext() || this.f25944d.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f25944d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f25941a.next();
            this.f25942b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f25943c = collection;
            this.f25944d = collection.iterator();
        }
        return this.f25944d.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f25944d.remove();
        Collection collection = this.f25943c;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f25941a.remove();
        }
        v0 v0Var = this.f25945e;
        v0Var.f26068e--;
    }
}
