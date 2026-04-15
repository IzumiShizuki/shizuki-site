package l0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f11520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f11521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q2.w f11522c = new q2.w("SelectionHandleInfo");

    static {
        float f10 = 25;
        f11520a = f10;
        f11521b = f10;
    }

    public static final long a(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 & 4294967295L)) - 1.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }
}
