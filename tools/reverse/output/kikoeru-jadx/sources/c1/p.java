package c1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p extends n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final bf.h f3241d;

    public p(bf.h hVar) {
        this.f3241d = hVar;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f3239c;
        this.f3239c = i10 + 2;
        Object[] objArr = this.f3237a;
        return new b(this.f3241d, objArr[i10], objArr[i10 + 1]);
    }
}
