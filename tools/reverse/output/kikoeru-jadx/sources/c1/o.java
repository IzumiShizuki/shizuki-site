package c1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o extends n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3240d;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f3240d) {
            case 0:
                int i10 = this.f3239c;
                this.f3239c = i10 + 2;
                Object[] objArr = this.f3237a;
                return new a(0, objArr[i10], objArr[i10 + 1]);
            case 1:
                int i11 = this.f3239c;
                this.f3239c = i11 + 2;
                return this.f3237a[i11];
            default:
                int i12 = this.f3239c;
                this.f3239c = i12 + 2;
                return this.f3237a[i12 + 1];
        }
    }
}
