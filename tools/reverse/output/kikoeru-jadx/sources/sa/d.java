package sa;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f19692a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final double f19693b = (Math.pow(0.0181d, 0.45d) * 1.0993d) - 0.09929999999999994d;

    @Override // sa.j
    public final float a(float f10) {
        double d10 = f10;
        return (d10 < f19693b ? Float.valueOf(f10 / 4.5f) : Double.valueOf(nd.h.u((d10 + 0.09929999999999994d) / 1.0993d, 2.2222222222222223d))).floatValue();
    }
}
