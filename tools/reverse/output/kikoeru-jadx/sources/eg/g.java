package eg;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6600d;

    public g(int i10, int i11, int i12, int i13) {
        this.f6597a = i10;
        this.f6598b = i11;
        this.f6599c = i12;
        this.f6600d = i13;
    }

    public boolean a(int i10) {
        if (i10 == 1) {
            if (this.f6597a - this.f6598b <= 1) {
                return false;
            }
        } else if (this.f6599c - this.f6600d <= 1) {
            return false;
        }
        return true;
    }
}
