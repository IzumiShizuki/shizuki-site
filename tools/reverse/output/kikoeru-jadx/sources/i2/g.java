package i2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g implements o1.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f8697a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Boolean f8698b;

    @Override // o1.l
    public final boolean a() {
        Boolean bool = f8698b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw j2.h0.g("canFocus is read before it is written");
    }

    @Override // o1.l
    public final void c(boolean z10) {
        f8698b = Boolean.valueOf(z10);
    }

    @Override // o1.l
    public final /* synthetic */ void b(i3.n nVar) {
    }

    @Override // o1.l
    public final /* synthetic */ void d(i3.n nVar) {
    }
}
