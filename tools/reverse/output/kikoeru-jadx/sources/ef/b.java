package ef;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Iterator, kc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6546a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public oc.d f6549d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df.j f6550e;

    public b(df.j jVar) {
        this.f6550e = jVar;
        int iK = nh.b.k(0, 0, ((CharSequence) jVar.f5994b).length());
        this.f6547b = iK;
        this.f6548c = iK;
    }

    public final void a() {
        ub.k kVar;
        df.j jVar = this.f6550e;
        CharSequence charSequence = (CharSequence) jVar.f5994b;
        int i10 = this.f6548c;
        if (i10 < 0) {
            this.f6546a = 0;
            this.f6549d = null;
            return;
        }
        if (i10 <= charSequence.length() && (kVar = (ub.k) ((ic.n) jVar.f5995c).q(charSequence, Integer.valueOf(this.f6548c))) != null) {
            int iIntValue = ((Number) kVar.f21543a).intValue();
            int iIntValue2 = ((Number) kVar.f21544b).intValue();
            this.f6549d = nh.b.E(this.f6547b, iIntValue);
            int i11 = iIntValue + iIntValue2;
            this.f6547b = i11;
            this.f6548c = i11 + (iIntValue2 == 0 ? 1 : 0);
        } else {
            this.f6549d = new oc.d(this.f6547b, n.s0(charSequence), 1);
            this.f6548c = -1;
        }
        this.f6546a = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f6546a == -1) {
            a();
        }
        return this.f6546a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f6546a == -1) {
            a();
        }
        if (this.f6546a == 0) {
            throw new NoSuchElementException();
        }
        oc.d dVar = this.f6549d;
        jc.l.c(dVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f6549d = null;
        this.f6546a = -1;
        return dVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
