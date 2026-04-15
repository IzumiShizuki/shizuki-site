package ya;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u f26043d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f26044e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u f26045f;

    public r(u uVar, int i10) {
        this.f26044e = i10;
        this.f26045f = uVar;
        this.f26043d = uVar;
        this.f26040a = uVar.f26060e;
        this.f26041b = uVar.isEmpty() ? -1 : 0;
        this.f26042c = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f26041b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object tVar;
        u uVar = this.f26043d;
        if (uVar.f26060e != this.f26040a) {
            throw new ConcurrentModificationException();
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f26041b;
        this.f26042c = i10;
        switch (this.f26044e) {
            case 0:
                tVar = this.f26045f.i()[i10];
                break;
            case 1:
                tVar = new t(this.f26045f, i10);
                break;
            default:
                tVar = this.f26045f.j()[i10];
                break;
        }
        int i11 = this.f26041b + 1;
        if (i11 >= uVar.f26061f) {
            i11 = -1;
        }
        this.f26041b = i11;
        return tVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        u uVar = this.f26043d;
        int i10 = uVar.f26060e;
        int i11 = this.f26040a;
        if (i10 != i11) {
            throw new ConcurrentModificationException();
        }
        int i12 = this.f26042c;
        if (!(i12 >= 0)) {
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
        this.f26040a = i11 + 32;
        uVar.remove(uVar.i()[i12]);
        this.f26041b--;
        this.f26042c = -1;
    }
}
