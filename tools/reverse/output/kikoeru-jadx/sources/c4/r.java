package c4;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3391b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3392c = -1;

    public r(int i10) {
        this.f3390a = i10;
    }

    @Override // c4.q
    public final boolean Q0(CharSequence charSequence, int i10, int i11, w wVar) {
        int i12 = this.f3390a;
        if (i10 > i12 || i12 >= i11) {
            return i11 <= i12;
        }
        this.f3391b = i10;
        this.f3392c = i11;
        return false;
    }

    @Override // c4.q
    public final Object getResult() {
        return this;
    }
}
