package sa;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f19694a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final double f19695b = (nd.h.u(0.018d, 0.45d) * 1.099d) - 0.099d;

    @Override // sa.j
    public final float a(float f10) {
        double d10 = f10;
        return (d10 < f19695b ? Float.valueOf(f10 / 4.5f) : Double.valueOf(nd.h.u((d10 + 0.099d) / 1.099d, 2.2222222222222223d))).floatValue();
    }
}
