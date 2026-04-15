package ya;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p0 extends o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f26035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f26036b;

    public p0(Object obj) {
        this.f26035a = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f26036b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f26036b) {
            throw new NoSuchElementException();
        }
        this.f26036b = true;
        return this.f26035a;
    }
}
