package s8;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public enum b {
    ENABLED(true, true),
    /* JADX INFO: Fake field, exist only in values array */
    READ_ONLY(true, false),
    /* JADX INFO: Fake field, exist only in values array */
    WRITE_ONLY(false, true),
    DISABLED(false, false);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f19565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f19566b;

    b(boolean z10, boolean z11) {
        this.f19565a = z10;
        this.f19566b = z11;
    }
}
