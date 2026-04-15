package i2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d implements h2.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8661a;

    public static final int a(int i10, long j10) {
        int i11 = b2.f8653b;
        return ((int) (j10 >> (i10 * 15))) & 32767;
    }

    public static long c(int i10, int i11, int i12, int i13) {
        return (((long) (i11 & 32767)) << 15) | ((long) (i10 & 32767)) | (((long) (i12 & 32767)) << 30) | (((long) (i13 & 32767)) << 45) | Long.MIN_VALUE;
    }

    public int b() {
        switch (this.f8661a) {
            case 1:
                return 16;
            default:
                return 8;
        }
    }

    @Override // h2.f
    public Object s(h2.g gVar) {
        return gVar.f8112a.b();
    }
}
