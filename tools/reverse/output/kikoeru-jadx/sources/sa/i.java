package sa;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i implements j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f19703b = new i(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f19704c = new i(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f19705d = new i(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19706a;

    public /* synthetic */ i(int i10) {
        this.f19706a = i10;
    }

    @Override // sa.j
    public final float a(float f10) {
        switch (this.f19706a) {
            case 0:
                return f10;
            case 1:
                double d10 = f10;
                return (float) (d10 < 0.031248d ? d10 / 16.0d : nd.h.u(d10, 1.8d));
            default:
                double d11 = f10;
                return (float) (d11 <= 0.04045d ? d11 / 12.92d : nd.h.u((d11 + 0.055d) / 1.055d, 2.4d));
        }
    }

    public float b(float f10) {
        double d10 = f10;
        return (float) (d10 <= 0.0031308d ? d10 * 12.92d : (nd.h.u(d10, 0.4166666666666667d) * 1.055d) - 0.055d);
    }
}
