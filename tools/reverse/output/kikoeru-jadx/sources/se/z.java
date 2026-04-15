package se;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class z extends n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f20012c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(a0 a0Var, int i10) {
        super(a0Var);
        this.f20012c = i10;
    }

    @Override // se.m
    public final m J(a0 a0Var) {
        switch (this.f20012c) {
            case 0:
                return new z(a0Var, 0);
            default:
                return new z(a0Var, 1);
        }
    }

    @Override // se.m, se.w
    public final boolean u() {
        switch (this.f20012c) {
            case 0:
                return false;
            default:
                return true;
        }
    }
}
