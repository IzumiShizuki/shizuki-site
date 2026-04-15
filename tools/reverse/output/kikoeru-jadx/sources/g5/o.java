package g5;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f7397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f7398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f7399d;

    public o(m4.q qVar, u uVar, boolean z10, int i10) {
        this("Decoder init failed: [" + i10 + "], " + qVar, uVar, qVar.f14544n, z10, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i10 < 0 ? "neg_" : "") + Math.abs(i10));
    }

    public o(String str, Throwable th2, String str2, boolean z10, n nVar, String str3) {
        super(str, th2);
        this.f7396a = str2;
        this.f7397b = z10;
        this.f7398c = nVar;
        this.f7399d = str3;
    }
}
