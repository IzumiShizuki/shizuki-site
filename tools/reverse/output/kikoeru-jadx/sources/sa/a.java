package sa;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f19687a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final double f19688b = ((Math.log(65504.0d) / lc.a.f12168a) + 9.72d) / 17.52d;

    @Override // sa.j
    public final float a(float f10) {
        double d10 = f10;
        return (float) (d10 <= -0.3013698630136986d ? (nd.h.u(2.0d, (d10 * 17.52d) - 9.72d) - 1.52587890625E-5d) * 2.0d : d10 < f19688b ? Math.pow(2.0d, (d10 * 17.52d) - 9.72d) : 65504.0d);
    }
}
