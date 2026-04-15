package ba;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements bg.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2294b;

    public a0(String str, String str2) {
        jc.l.e(str, "name");
        jc.l.e(str2, "query");
        this.f2293a = str;
        this.f2294b = str2;
    }

    @Override // bg.t
    public final String f() {
        return this.f2294b;
    }

    @Override // bg.t
    public final String name() {
        return this.f2293a;
    }
}
