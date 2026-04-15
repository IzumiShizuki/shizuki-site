package wf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long[] f24195e = new long[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uf.g f24196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0.x f24197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f24198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f24199d;

    public w(uf.g gVar, c0.x xVar) {
        jc.l.e(gVar, "descriptor");
        this.f24196a = gVar;
        this.f24197b = xVar;
        int iP = gVar.p();
        if (iP <= 64) {
            this.f24198c = iP != 64 ? (-1) << iP : 0L;
            this.f24199d = f24195e;
            return;
        }
        this.f24198c = 0L;
        int i10 = (iP - 1) >>> 6;
        long[] jArr = new long[i10];
        if ((iP & 63) != 0) {
            jArr[i10 - 1] = (-1) << iP;
        }
        this.f24199d = jArr;
    }
}
