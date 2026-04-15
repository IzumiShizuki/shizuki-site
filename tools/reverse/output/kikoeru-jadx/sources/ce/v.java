package ce;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class v implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3986a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f3988c;

    public v(w wVar) {
        this.f3988c = wVar;
        this.f3987b = wVar.f3989b.length;
    }

    public final byte a() {
        try {
            byte[] bArr = this.f3988c.f3989b;
            int i10 = this.f3986a;
            this.f3986a = i10 + 1;
            return bArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3986a < this.f3987b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        return Byte.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
