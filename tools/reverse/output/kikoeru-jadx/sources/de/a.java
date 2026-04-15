package de;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public enum a {
    f5874c("NO_ARGUMENTS"),
    /* JADX INFO: Fake field, exist only in values array */
    EF17("UNLESS_EMPTY"),
    /* JADX INFO: Fake field, exist only in values array */
    ALWAYS_PARENTHESIZED(true, true);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f5877b;

    /* synthetic */ a(String str) {
        this((i & 1) == 0, false);
    }

    a(boolean z10, boolean z11) {
        this.f5876a = z10;
        this.f5877b = z11;
    }
}
