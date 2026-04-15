package yf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e extends k5.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f26284d;

    public e(b7.m mVar, boolean z10) {
        super(mVar);
        this.f26284d = z10;
    }

    @Override // k5.d
    public final void l(String str) {
        jc.l.e(str, "value");
        if (this.f26284d) {
            super.l(str);
        } else {
            j(str);
        }
    }
}
