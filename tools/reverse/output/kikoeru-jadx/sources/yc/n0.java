package yc;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n0 implements me.d, m0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n0 f26122b = new n0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n0 f26123c = new n0(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26124a;

    public /* synthetic */ n0(int i10) {
        this.f26124a = i10;
    }

    @Override // me.d
    public se.w b() {
        switch (this.f26124a) {
            case 2:
                throw new IllegalStateException("This method should not be called");
            case 3:
                throw new IllegalStateException("This method should not be called");
            default:
                throw new IllegalStateException("This method should not be called");
        }
    }

    public String toString() {
        switch (this.f26124a) {
            case 7:
                return "NO_SOURCE";
            default:
                return super.toString();
        }
    }
}
