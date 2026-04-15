package wd;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public enum h1 implements ce.q {
    /* JADX INFO: Fake field, exist only in values array */
    EF5("INTERNAL"),
    /* JADX INFO: Fake field, exist only in values array */
    EF13("PRIVATE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF21("PROTECTED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF29("PUBLIC"),
    /* JADX INFO: Fake field, exist only in values array */
    EF37("PRIVATE_TO_THIS"),
    /* JADX INFO: Fake field, exist only in values array */
    EF45("LOCAL");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23723a;

    h1(String str) {
        this.f23723a = i;
    }

    @Override // ce.q
    public final int a() {
        return this.f23723a;
    }
}
