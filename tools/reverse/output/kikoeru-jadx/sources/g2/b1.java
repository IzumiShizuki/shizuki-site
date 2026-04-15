package g2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b1 implements t1, p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b1 f7160b = new b1(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7161a;

    public /* synthetic */ b1(int i10) {
        this.f7161a = i10;
    }

    @Override // g2.t1
    public boolean T(Object obj, Object obj2) {
        return false;
    }

    @Override // g2.p
    public long a(long j10, long j11) {
        switch (this.f7161a) {
            case 1:
                float fMax = Math.max(Float.intBitsToFloat((int) (j11 >> 32)) / Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)) / Float.intBitsToFloat((int) (j10 & 4294967295L)));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L);
                int i10 = l1.f7233a;
                return jFloatToRawIntBits;
            case 2:
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) / Float.intBitsToFloat((int) (j10 >> 32));
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
                int i11 = l1.f7233a;
                return jFloatToRawIntBits2;
            case 3:
                float fD = n1.d(j10, j11);
                long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(fD)) << 32) | (((long) Float.floatToRawIntBits(fD)) & 4294967295L);
                int i12 = l1.f7233a;
                return jFloatToRawIntBits3;
            default:
                if (Float.intBitsToFloat((int) (j10 >> 32)) <= Float.intBitsToFloat((int) (j11 >> 32)) && Float.intBitsToFloat((int) (j10 & 4294967295L)) <= Float.intBitsToFloat((int) (j11 & 4294967295L))) {
                    long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L);
                    int i13 = l1.f7233a;
                    return jFloatToRawIntBits4;
                }
                float fD2 = n1.d(j10, j11);
                long jFloatToRawIntBits5 = (((long) Float.floatToRawIntBits(fD2)) << 32) | (((long) Float.floatToRawIntBits(fD2)) & 4294967295L);
                int i14 = l1.f7233a;
                return jFloatToRawIntBits5;
        }
    }

    @Override // g2.t1
    public void l(s1 s1Var) {
        s1Var.clear();
    }

    public String toString() {
        switch (this.f7161a) {
            case 5:
                return "ReusedSlotId";
            default:
                return super.toString();
        }
    }
}
