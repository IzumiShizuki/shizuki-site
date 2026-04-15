package x4;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f24618b;

    public j(int i10, int i11, int i12, int i13, m4.q qVar, boolean z10, RuntimeException runtimeException) {
        StringBuilder sb = new StringBuilder("AudioTrack init failed ");
        sb.append(i10);
        sb.append(" Config(");
        sb.append(i11);
        sb.append(", ");
        sb.append(i12);
        sb.append(", ");
        sb.append(i13);
        sb.append(") ");
        sb.append(qVar);
        sb.append(z10 ? " (recoverable)" : "");
        super(sb.toString(), runtimeException);
        this.f24617a = i10;
        this.f24618b = z10;
    }
}
