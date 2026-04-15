package ef;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g implements Iterator, kc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f6562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6565d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6566e;

    public g(CharSequence charSequence) {
        jc.l.e(charSequence, "string");
        this.f6562a = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10;
        int i11;
        int i12 = this.f6563b;
        if (i12 != 0) {
            return i12 == 1;
        }
        if (this.f6566e < 0) {
            this.f6563b = 2;
            return false;
        }
        CharSequence charSequence = this.f6562a;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i13 = this.f6564c; i13 < length2; i13++) {
            char cCharAt = charSequence.charAt(i13);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i10 = (cCharAt == '\r' && (i11 = i13 + 1) < charSequence.length() && charSequence.charAt(i11) == '\n') ? 2 : 1;
                length = i13;
                this.f6563b = 1;
                this.f6566e = i10;
                this.f6565d = length;
                return true;
            }
        }
        i10 = -1;
        this.f6563b = 1;
        this.f6566e = i10;
        this.f6565d = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f6563b = 0;
        int i10 = this.f6565d;
        int i11 = this.f6564c;
        this.f6564c = this.f6566e + i10;
        return this.f6562a.subSequence(i11, i10).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
