package b0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f1265c;

    public i(int i10, int i11, t tVar) {
        this.f1263a = i10;
        this.f1264b = i11;
        this.f1265c = tVar;
        if (i10 < 0) {
            x.a.a("startIndex should be >= 0");
        }
        if (i11 > 0) {
            return;
        }
        x.a.a("size should be > 0");
    }
}
