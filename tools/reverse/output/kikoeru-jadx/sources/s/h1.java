package s;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h1 extends f1 {
    @Override // s.f1, s.d1
    public final void a(long j10, long j11) {
        if (!Float.isNaN(Float.NaN)) {
            this.f19152a.setZoom(Float.NaN);
        }
        if ((9223372034707292159L & j11) != 9205357640488583168L) {
            this.f19152a.show(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)), Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)));
        } else {
            this.f19152a.show(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)));
        }
    }
}
