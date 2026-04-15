package se;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public enum x0 {
    INVARIANT("", true),
    IN_VARIANCE("in", false),
    OUT_VARIANCE("out", true);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f20008b;

    x0(String str, boolean z10) {
        this.f20007a = str;
        this.f20008b = z10;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f20007a;
    }
}
