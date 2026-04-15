package p1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f16477a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f16478b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f16479c = 0.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f16480d = 0.0f;

    public final void a(float f10, float f11, float f12, float f13) {
        this.f16477a = Math.max(f10, this.f16477a);
        this.f16478b = Math.max(f11, this.f16478b);
        this.f16479c = Math.min(f12, this.f16479c);
        this.f16480d = Math.min(f13, this.f16480d);
    }

    public final boolean b() {
        return (this.f16477a >= this.f16479c) | (this.f16478b >= this.f16480d);
    }

    public final String toString() {
        return "MutableRect(" + n7.e.I(this.f16477a) + ", " + n7.e.I(this.f16478b) + ", " + n7.e.I(this.f16479c) + ", " + n7.e.I(this.f16480d) + ')';
    }
}
