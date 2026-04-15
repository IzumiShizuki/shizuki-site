package l6;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f11732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f11733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f11734c;

    public x4.f a() {
        if (this.f11732a || !(this.f11733b || this.f11734c)) {
            return new x4.f(this);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }
}
