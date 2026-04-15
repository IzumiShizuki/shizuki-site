package lf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class u0 implements t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12501a;

    @Override // lf.t0
    public final f a(mf.u uVar) {
        switch (this.f12501a) {
            case 0:
                return new e(1);
            default:
                return new i7.n(new w0(0, uVar, (yb.c) null));
        }
    }

    public final String toString() {
        switch (this.f12501a) {
            case 0:
                return "SharingStarted.Eagerly";
            default:
                return "SharingStarted.Lazily";
        }
    }
}
