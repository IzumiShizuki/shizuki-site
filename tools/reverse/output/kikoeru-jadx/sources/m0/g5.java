package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class g5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f13022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r.r f13023b;

    static {
        float f10 = d5.f12860a;
        f13022a = 40;
        new r.r(0.2f, 0.8f);
        new r.r(0.4f, 1.0f);
        new r.r(0.0f, 0.65f);
        new r.r(0.1f, 0.45f);
        f13023b = new r.r(0.4f, 0.2f);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final j1.q r28, long r29, float r31, long r32, int r34, x0.o r35, final int r36, final int r37) {
        /*
            Method dump skipped, instruction units count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.g5.a(j1.q, long, float, long, int, x0.o, int, int):void");
    }

    public static final void b(s1.d dVar, float f10, float f11, long j10, s1.h hVar) {
        float f12 = 2;
        float f13 = hVar.f19352a / f12;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar.e() >> 32)) - (f12 * f13);
        dVar.m0(j10, f10, f11, (((long) Float.floatToRawIntBits(f13)) << 32) | (((long) Float.floatToRawIntBits(f13)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), (768 & 64) != 0 ? 1.0f : 0.0f, hVar);
    }
}
