package q;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f17464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f17465b;

    public v0(float f10, f3.c cVar) {
        this.f17464a = f10;
        float fA = cVar.a();
        float f11 = w0.f17468a;
        this.f17465b = fA * 386.0878f * 160.0f * 0.84f;
    }

    public u0 a(float f10) {
        double dB = b(f10);
        double d10 = w0.f17468a;
        double d11 = d10 - 1.0d;
        return new u0(f10, (float) (Math.exp((d10 / d11) * dB) * ((double) (this.f17464a * this.f17465b))), (long) (Math.exp(dB / d11) * 1000.0d));
    }

    public double b(float f10) {
        float[] fArr = b.f17234a;
        return Math.log(((double) (Math.abs(f10) * 0.35f)) / ((double) (this.f17464a * this.f17465b)));
    }

    public v0(float f10, float f11, float f12, float f13) {
        this.f17464a = f12;
        this.f17465b = f13;
    }
}
