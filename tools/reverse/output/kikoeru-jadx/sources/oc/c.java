package oc;

import java.util.NoSuchElementException;
import vb.v;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f16312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16313d;

    public c(int i10, int i11, int i12) {
        this.f16310a = i12;
        this.f16311b = i11;
        boolean z10 = false;
        if (i12 <= 0 ? i10 >= i11 : i10 <= i11) {
            z10 = true;
        }
        this.f16312c = z10;
        this.f16313d = z10 ? i10 : i11;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f16312c;
    }

    @Override // vb.v
    public final int nextInt() {
        int i10 = this.f16313d;
        if (i10 != this.f16311b) {
            this.f16313d = this.f16310a + i10;
            return i10;
        }
        if (!this.f16312c) {
            throw new NoSuchElementException();
        }
        this.f16312c = false;
        return i10;
    }
}
