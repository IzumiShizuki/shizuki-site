package la;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a implements bg.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11893a;

    public a(String str) {
        jc.l.e(str, "tag");
        this.f11893a = str;
    }

    @Override // bg.t
    public final String f() {
        return name();
    }

    @Override // bg.t
    public final String name() {
        return q.t0.D("$age:", this.f11893a, "$");
    }
}
