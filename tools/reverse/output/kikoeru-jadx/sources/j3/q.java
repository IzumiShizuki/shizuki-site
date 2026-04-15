package j3;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f10157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f10158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f10159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f10160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f10161f;

    public q(int i10) {
        boolean z10 = (i10 & 1) != 0;
        boolean z11 = (i10 & 2) != 0;
        boolean z12 = (i10 & 4) != 0;
        this.f10156a = z10;
        this.f10157b = z11;
        this.f10158c = z.f10198a;
        this.f10159d = z12;
        this.f10160e = true;
        this.f10161f = "";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f10156a == qVar.f10156a && this.f10157b == qVar.f10157b && this.f10158c == qVar.f10158c && this.f10159d == qVar.f10159d && this.f10160e == qVar.f10160e;
    }

    public final int hashCode() {
        return ((((this.f10158c.hashCode() + ((((this.f10156a ? 1231 : 1237) * 31) + (this.f10157b ? 1231 : 1237)) * 31)) * 31) + (this.f10159d ? 1231 : 1237)) * 31) + (this.f10160e ? 1231 : 1237);
    }
}
