package xa;

import java.util.Iterator;
import java.util.NoSuchElementException;
import ud.s;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g implements Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f24882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharSequence f24883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f24884d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f24886f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ h f24887g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24881a = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f24885e = 0;

    public g(h hVar, ah.j jVar, CharSequence charSequence) {
        this.f24887g = hVar;
        this.f24884d = (a) jVar.f391c;
        this.f24886f = jVar.f390b;
        this.f24883c = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String string;
        a aVar;
        int i10 = this.f24881a;
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
        this.f24881a = 4;
        int i11 = this.f24885e;
        while (true) {
            int length = this.f24885e;
            if (length == -1) {
                this.f24881a = 3;
                string = null;
                break;
            }
            b bVar = (b) this.f24887g.f24888a;
            CharSequence charSequence = this.f24883c;
            int length2 = charSequence.length();
            s.i(length, length2);
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (bVar.a(charSequence.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = charSequence.length();
                this.f24885e = -1;
            } else {
                this.f24885e = length + 1;
            }
            int i12 = this.f24885e;
            if (i12 == i11) {
                int i13 = i12 + 1;
                this.f24885e = i13;
                if (i13 > charSequence.length()) {
                    this.f24885e = -1;
                }
            } else {
                while (true) {
                    aVar = this.f24884d;
                    if (i11 >= length || !aVar.a(charSequence.charAt(i11))) {
                        break;
                    }
                    i11++;
                }
                while (length > i11 && aVar.a(charSequence.charAt(length - 1))) {
                    length--;
                }
                int i14 = this.f24886f;
                if (i14 == 1) {
                    length = charSequence.length();
                    this.f24885e = -1;
                    while (length > i11 && aVar.a(charSequence.charAt(length - 1))) {
                        length--;
                    }
                } else {
                    this.f24886f = i14 - 1;
                }
                string = charSequence.subSequence(i11, length).toString();
            }
        }
        this.f24882b = string;
        if (this.f24881a == 3) {
            return false;
        }
        this.f24881a = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f24881a = 2;
        String str = this.f24882b;
        this.f24882b = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
